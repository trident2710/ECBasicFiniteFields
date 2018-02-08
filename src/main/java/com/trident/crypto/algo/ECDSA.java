/*
 * Copyright 2018 trident.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.trident.crypto.algo;

import com.trident.crypto.elliptic.EllipticCurveOperator;
import com.trident.crypto.elliptic.EllipticCurvePoint;
import java.math.BigInteger;
import java.util.Random;


/**
 *
 * @author trident
 */
public class ECDSA {
    
    private final EllipticCurveOperator operator;
    private final Random random;
    
    public ECDSA(EllipticCurveOperator operator){
        this.operator = operator;
        this.random = new Random();
    }
    
    public ECDSAKey generateKeyPair(){
        BigInteger sKey = new BigInteger(getOperator().getEllipticCurve().getN().bitLength(), random);
        EllipticCurvePoint pKey = getOperator().mul(sKey, getOperator().getEllipticCurve().getG());
        return new ECDSAKey(sKey,pKey);
    }
    
    public String sign(byte[] mHash, BigInteger sKey){
        BigInteger n = getOperator().getEllipticCurve().getN();
        EllipticCurvePoint G = getOperator().getEllipticCurve().getG();
        
        BigInteger alpha = new BigInteger(mHash);
        BigInteger e = alpha.mod(n);
        if(e.equals(BigInteger.ZERO)) e = BigInteger.ONE;
        
        BigInteger k;
        EllipticCurvePoint C;
        BigInteger r;
        BigInteger s;
        do{
            do {                
                k = new BigInteger(n.bitLength(), random);
            } while (k.compareTo(BigInteger.ZERO) == -1 || k.compareTo(n) >= 1); // k<0 || k>n
            C = getOperator().mul(k, G);
            r = C.getPointX().mod(n);
            s = r.multiply(sKey).add(k.multiply(e)).mod(n);   
        } while (r.equals(BigInteger.ZERO)||s.equals(BigInteger.ZERO));
        
        return padding(r.toString(16),len16(n))+padding(s.toString(16),len16(n));
    }
    
    public boolean verify(byte[] mHash, EllipticCurvePoint pKey, String signature){
        BigInteger n = getOperator().getEllipticCurve().getN();
        EllipticCurvePoint G = getOperator().getEllipticCurve().getG();
        
        BigInteger r = new BigInteger(signature.substring(0, len16(n)), 16);
        BigInteger s = new BigInteger(signature.substring(len16(n), 2*len16(n)), 16);
        
        if(r.compareTo(BigInteger.ZERO)<=0||r.compareTo(n)>=0) return false;
        if(s.compareTo(BigInteger.ZERO)<=0||s.compareTo(n)>=0) return false;

        BigInteger alpha = new BigInteger(mHash);
        BigInteger e = alpha.mod(n);
        if(e.equals(BigInteger.ZERO)) e = BigInteger.ONE;
        
        BigInteger v = e.modInverse(n);
        BigInteger z1 = (s.multiply(v)).mod(n);
        BigInteger z2 = n.add(r.multiply(v).negate()).mod(n);
        
        EllipticCurvePoint A = getOperator().mul(z1, G);
        EllipticCurvePoint B = getOperator().mul(z2, pKey);
        EllipticCurvePoint C = getOperator().add(A, B);
        BigInteger R = C.getPointX().mod(n);
        
        return R.equals(r);
    }

    private EllipticCurveOperator getOperator() {
        return operator;
    }  
    
    private int len16(BigInteger n){
        if(n.bitLength()%4==0) 
            return n.bitLength()/4;
        else return n.bitLength()/4+1;
    }
     
    private String padding(String hexString, int byteSize){
        if(byteSize<hexString.length()) throw new RuntimeException("input string length is bigger than required");
        if(byteSize==hexString.length()) return hexString;
        
        StringBuilder sb =  new StringBuilder(hexString).reverse();
        while (sb.length()<byteSize) {            
            sb.append("0");
        }
        return sb.reverse().toString();
    }
}