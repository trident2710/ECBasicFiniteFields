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
package com.trident.crypto.elliptic.nist;
import java.math.BigInteger;

/**
 * Recommended Elliptic Curve parameters by SECP
 * @see http://www.secg.org/sec2-v2.pdf
 * @author trident
 */
public enum SECP {
    SECP112R1(
            "DB7C2ABF 62E35E66 8076BEAD 208B",
            "DB7C2ABF 62E35E66 8076BEAD 2088",
            "659EF8BA 043916EE DE891170 2B22",
            "09487239 995A5EE7 6B55F9C2 F098",
            "A89CE5AF 8724C0A2 3E0E0FF7 7500",
            "DB7C2ABF 62E35E76 28DFAC65 61C5",
            "01",true
            ),
    SECP112R2(
            "DB7C2ABF 62E35E66 8076BEAD 208B",
            "6127C24C 05F38A0A AAF65C0E F02C",
            "51DEF181 5DB5ED74 FCC34C85 D709",
            "4BA30AB5 E892B4E1 649DD092 8643",
            "ADCD46F5 882E3747 DEF36E95 6E97",
            "36DF0AAF D8B8D759 7CA10520 D04B",
            "04",true
            ),
    SECP128R1(
            "FFFFFFFD FFFFFFFF FFFFFFFF FFFFFFFF",
            "FFFFFFFD FFFFFFFF FFFFFFFF FFFFFFFC",
            "E87579C1 1079F43D D824993C 2CEE5ED3",
            "161FF752 8B899B2D 0C28607C A52C5B86",
            "CF5AC839 5BAFEB13 C02DA292 DDED7A83",
            "FFFFFFFE 00000000 75A30D1B 9038A115",
            "01",true
            ),
    SECP128R2(
            "FFFFFFFD FFFFFFFF FFFFFFFF FFFFFFFF",
            "D6031998 D1B3BBFE BF59CC9B BFF9AEE1",
            "5EEEFCA3 80D02919 DC2C6558 BB6D8A5D",
            "7B6AA5D8 5E572983 E6FB32A7 CDEBC140",
            "27B6916A 894D3AEE 7106FE80 5FC34B44",
            "3FFFFFFF 7FFFFFFF BE002472 0613B5A3",
            "04",true
            ),
    SECP192K1(
            "FFFFFFFF FFFFFFFF FFFFFFFF FFFFFFFF FFFFFFFE FFFFEE37",
            "00000000 00000000 00000000 00000000 00000000 00000000",
            "00000000 00000000 00000000 00000000 00000000 00000003",
            "DB4FF10E C057E9AE 26B07D02 80B7F434 1DA5D1B1 EAE06C7D",
            "9B2F2F6D 9C5628A7 844163D0 15BE8634 4082AA88 D95E2F9D",
            "FFFFFFFF FFFFFFFF FFFFFFFE 26F2FC17 0F69466A 74DEFD8D",
            "01",true
            ),
    SECP192R1(
            "FFFFFFFF FFFFFFFF FFFFFFFF FFFFFFFE FFFFFFFF FFFFFFFF",
            "FFFFFFFF FFFFFFFF FFFFFFFF FFFFFFFE FFFFFFFF FFFFFFFC",
            "64210519 E59C80E7 0FA7E9AB 72243049 FEB8DEEC C146B9B1",
            "188DA80E B03090F6 7CBF20EB 43A18800 F4FF0AFD 82FF1012",
            "07192B95 FFC8DA78 631011ED 6B24CDD5 73F977A1 1E794811",
            "FFFFFFFF FFFFFFFF FFFFFFFF 99DEF836 146BC9B1 B4D22831",
            "01",true
            ),
    SECP224K1(
            "FFFFFFFF FFFFFFFF FFFFFFFF FFFFFFFF FFFFFFFF FFFFFFFE FFFFE56D",
            "00000000 00000000 00000000 00000000 00000000 00000000 00000000",
            "00000000 00000000 00000000 00000000 00000000 00000000 00000005",
            "A1455B33 4DF099DF 30FC28A1 69A467E9 E47075A9 0F7E650E B6B7A45C",
            "7E089FED 7FBA3442 82CAFBD6 F7E319F7 C0B0BD59 E2CA4BDB 556D61A5",
            "01 00000000 00000000 00000000 0001DCE8 D2EC6184 CAF0A971 769FB1F7",
            "01",true
            ),
    SECP224R1(
            "FFFFFFFF FFFFFFFF FFFFFFFF FFFFFFFF 00000000 00000000 00000001",
            "FFFFFFFF FFFFFFFF FFFFFFFF FFFFFFFE FFFFFFFF FFFFFFFF FFFFFFFE",
            "B4050A85 0C04B3AB F5413256 5044B0B7 D7BFD8BA 270B3943 2355FFB4",
            "B70E0CBD 6BB4BF7F 321390B9 4A03C1D3 56C21122 343280D6 115C1D21",
            "BD376388 B5F723FB 4C22DFE6 CD4375A0 5A074764 44D58199 85007E34",
            "FFFFFFFF FFFFFFFF FFFFFFFF FFFF16A2 E0B8F03E 13DD2945 5C5C2A3D",
            "01",true
            ),
    SECP256K1(
            "FFFFFFFF FFFFFFFF FFFFFFFF FFFFFFFF FFFFFFFF FFFFFFFF FFFFFFFE FFFFFC2F",
            "00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000000",
            "00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000007",
            "79BE667E F9DCBBAC 55A06295 CE870B07 029BFCDB 2DCE28D9 59F2815B 16F81798",
            "483ADA77 26A3C465 5DA4FBFC 0E1108A8 FD17B448 A6855419 9C47D08F FB10D4B8",
            "FFFFFFFF FFFFFFFF FFFFFFFF FFFFFFFE BAAEDCE6 AF48A03B BFD25E8C D0364141",
            "01",true
            ),
    SECP256R1(
            "FFFFFFFF 00000001 00000000 00000000 00000000 FFFFFFFF FFFFFFFF FFFFFFFF",
            "FFFFFFFF 00000001 00000000 00000000 00000000 FFFFFFFF FFFFFFFF FFFFFFFC",
            "5AC635D8 AA3A93E7 B3EBBD55 769886BC 651D06B0 CC53B0F6 3BCE3C3E 27D2604B",
            "6B17D1F2 E12C4247 F8BCE6E5 63A440F2 77037D81 2DEB33A0 F4A13945 D898C296",
            "4FE342E2 FE1A7F9B 8EE7EB4A 7C0F9E16 2BCE3357 6B315ECE CBB64068 37BF51F5",
            "FFFFFFFF 00000000 FFFFFFFF FFFFFFFF BCE6FAAD A7179E84 F3B9CAC2 FC632551",
            "01",true
            ),
    SECP384R1(
            "FFFFFFFF FFFFFFFF FFFFFFFF FFFFFFFF FFFFFFFF FFFFFFFF FFFFFFFF FFFFFFFE FFFFFFFF 00000000 00000000 FFFFFFFF",
            "FFFFFFFF FFFFFFFF FFFFFFFF FFFFFFFF FFFFFFFF FFFFFFFF FFFFFFFF FFFFFFFE FFFFFFFF 00000000 00000000 FFFFFFFC",
            "B3312FA7 E23EE7E4 988E056B E3F82D19 181D9C6E FE814112 0314088F 5013875A C656398D 8A2ED19D 2A85C8ED D3EC2AEF",
            "AA87CA22 BE8B0537 8EB1C71E F320AD74 6E1D3B62 8BA79B98 59F741E0 82542A38 5502F25D BF55296C 3A545E38 72760AB7",
            "3617DE4A 96262C6F 5D9E98BF 9292DC29 F8F41DBD 289A147C E9DA3113 B5F0B8C0 0A60B1CE 1D7E819D 7A431D7C 90EA0E5F",
            "FFFFFFFF FFFFFFFF FFFFFFFF FFFFFFFF FFFFFFFF FFFFFFFF C7634D81 F4372DDF 581A0DB2 48B0A77A ECEC196A CCC52973",
            "01",true
            ),
    SECP521R1(
            "01FF FFFFFFFF FFFFFFFF FFFFFFFF FFFFFFFF FFFFFFFF FFFFFFFF FFFFFFFF FFFFFFFF FFFFFFFF FFFFFFFF FFFFFFFF FFFFFFFF FFFFFFFF FFFFFFFF FFFFFFFF FFFFFFFF",
            "01FF FFFFFFFF FFFFFFFF FFFFFFFF FFFFFFFF FFFFFFFF FFFFFFFF FFFFFFFF FFFFFFFF FFFFFFFF FFFFFFFF FFFFFFFF FFFFFFFF FFFFFFFF FFFFFFFF FFFFFFFF FFFFFFFC",
            "0051 953EB961 8E1C9A1F 929A21A0 B68540EE A2DA725B 99B315F3 B8B48991 8EF109E1 56193951 EC7E937B 1652C0BD 3BB1BF07 3573DF88 3D2C34F1 EF451FD4 6B503F00",
            "00C6 858E06B7 0404E9CD 9E3ECB66 2395B442 9C648139 053FB521 F828AF60 6B4D3DBA A14B5E77 EFE75928 FE1DC127 A2FFA8DE 3348B3C1 856A429B F97E7E31 C2E5BD66",
            "0118 39296A78 9A3BC004 5C8A5FB4 2C7D1BD9 98F54449 579B4468 17AFBD17 273E662C 97EE7299 5EF42640 C550B901 3FAD0761 353C7086 A272C240 88BE9476 9FD16650",
            "01FF FFFFFFFF FFFFFFFF FFFFFFFF FFFFFFFF FFFFFFFF FFFFFFFF FFFFFFFF FFFFFFFA 51868783 BF2F966B 7FCC0148 F709A5D0 3BB5C9B8 899C47AE BB6FB71E 91386409",
            "01",true
            ),
    SECT113R1(
            "x^113 x^9 1",
            "00308825 0CA6E7C7 FE649CE8 5820F7",
            "00E8BEE4 D3E22607 44188BE0 E9C723",
            "009D7361 6F35F4AB 1407D735 62C10F",
            "00A52830 277958EE 84D1315E D31886",
            "01000000 00000000 D9CCEC8A 39E56F",
            "02",false
            ),
    SECT163K1(
            "x^163 x^7 x^6 x^3 1",
            "00 00000000 00000000 00000000 00000000 00000001",
            "00 00000000 00000000 00000000 00000000 00000001",
            "02 FE13C053 7BBC11AC AA07D793 DE4E6D5E 5C94EEE8",
            "02 89070FB0 5D38FF58 321F2E80 0536D538 CCDAA3D9",
            "04 00000000 00000000 00020108 A2E0CC0D 99F8A5EF",
            "02",false
            ),
    SECT163R1(
            "x^163 x^7 x^6 x^3 1",
            "07 B6882CAA EFA84F95 54FF8428 BD88E246 D2782AE2",
            "07 13612DCD DCB40AAB 946BDA29 CA91F73A F958AFD9",
            "03 69979697 AB438977 89566789 567F787A 7876A654",
            "00 435EDB42 EFAFB298 9D51FEFC E3C80988 F41FF883",
            "03 FFFFFFFF FFFFFFFF FFFF48AA B689C29C A710279B",
            "02",false
            ),
    SECT163R2(
            "x^163 x^7 x^6 x^3 1",
            "00 00000000 00000000 00000000 00000000 00000001",
            "02 0A601907 B8C953CA 1481EB10 512F7874 4A3205FD",
            "03 F0EBA162 86A2D57E A0991168 D4994637 E8343E36",
            "00 D51FBC6C 71A0094F A2CDD545 B11C5C0C 797324F1",
            "04 00000000 00000000 000292FE 77E70C12 A4234C33",
            "02",false
            ),
    SECT233K1(
            "x^233 x^74 1",
            "0000 00000000 00000000 00000000 00000000 00000000 00000000 00000000",
            "0000 00000000 00000000 00000000 00000000 00000000 00000000 00000001",
            "0172 32BA853A 7E731AF1 29F22FF4 149563A4 19C26BF5 0A4C9D6E EFAD6126",
            "01DB 537DECE8 19B7F70F 555A67C4 27A8CD9B F18AEB9B 56E0C110 56FAE6A3",
            "80 00000000 00000000 00000000 00069D5B B915BCD4 6EFB1AD5 F173ABDF",
            "04",false
             ),
    SECT233R1(
            "x^233 x^74 1",
            "0000 00000000 00000000 00000000 00000000 00000000 00000000 00000001",
            "0066 647EDE6C 332C7F8C 0923BB58 213B333B 20E9CE42 81FE115F 7D8F90AD",
            "00FA C9DFCBAC 8313BB21 39F1BB75 5FEF65BC 391F8B36 F8F8EB73 71FD558B",
            "0100 6A08A419 03350678 E58528BE BF8A0BEF F867A7CA 36716F7E 01F81052",
            "0100 00000000 00000000 00000000 0013E974 E72F8A69 22031D26 03CFE0D7",
            "02",false
            ),
    SECT239K1(
            "x^239 x^158 1",
            "0000 00000000 00000000 00000000 00000000 00000000 00000000 00000000",
            "0000 00000000 00000000 00000000 00000000 00000000 00000000 00000001",
            "29A0 B6A887A9 83E97309 88A68727 A8B2D126 C44CC2CC 7B2A6555 193035DC",
            "7631 0804F12E 549BDB01 1C103089 E73510AC B275FC31 2A5DC6B7 6553F0CA",
            "2000 00000000 00000000 00000000 005A79FE C67CB6E9 1F1C1DA8 00E478A5",
            "04",false
            ),
    SECT283K1(
            "x^283 x^12 x^7 x^5 1",
            "00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000000",
            "00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000001",
            "0503213F 78CA4488 3F1A3B81 62F188E5 53CD265F 23C1567A 16876913 B0C2AC24 58492836",
            "01CCDA38 0F1C9E31 8D90F95D 07E5426F E87E45C0 E8184698 E4596236 4E341161 77DD2259",
            "01FFFFFF FFFFFFFF FFFFFFFF FFFFFFFF FFFFE9AE 2ED07577 265DFF7F 94451E06 1E163C61",
            "04",false
            ),
    SECT283R1(
            "x^283 x^12 x^7 x^5 1",
            "00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000001",
            "027B680A C8B8596D A5A4AF8A 19A0303F CA97FD76 45309FA2 A581485A F6263E31 3B79A2F5",
            "05F93925 8DB7DD90 E1934F8C 70B0DFEC 2EED25B8 557EAC9C 80E2E198 F8CDBECD 86B12053",
            "03676854 FE24141C B98FE6D4 B20D02B4 516FF702 350EDDB0 826779C8 13F0DF45 BE8112F4",
            "03FFFFFF FFFFFFFF FFFFFFFF FFFFFFFF FFFFEF90 399660FC 938A9016 5B042A7C EFADB307",
            "02",false
            ),
    SECT409K1(
            "x^409 x^87 1",
            "00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000000",
            "00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000001",
            "0060F05F 658F49C1 AD3AB189 0F718421 0EFD0987 E307C84C 27ACCFB8 F9F67CC2 C460189E B5AAAA62 EE222EB1 B35540CF E9023746",
            "01E36905 0B7C4E42 ACBA1DAC BF04299C 3460782F 918EA427 E6325165 E9EA10E3 DA5F6C42 E9C55215 AA9CA27A 5863EC48 D8E0286B",
            "7FFFFF FFFFFFFF FFFFFFFF FFFFFFFF FFFFFFFF FFFFFFFF FFFFFE5F 83B2D4EA 20400EC4 557D5ED3 E3E7CA5B 4B5C83B8 E01E5FCF",
            "04",false
            ),
    SECT409R1(
            "x^409 x^87 1",
            "00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000001",
            "0021A5C2 C8EE9FEB 5C4B9A75 3B7B476B 7FD6422E F1F3DD67 4761FA99 D6AC27C8 A9A197B2 72822F6C D57A55AA 4F50AE31 7B13545F",
            "015D4860 D088DDB3 496B0C60 64756260 441CDE4A F1771D4D B01FFE5B 34E59703 DC255A86 8A118051 5603AEAB 60794E54 BB7996A7",
            "0061B1CF AB6BE5F3 2BBFA783 24ED106A 7636B9C5 A7BD198D 0158AA4F 5488D08F 38514F1F DF4B4F40 D2181B36 81C364BA 0273C706",
            "01000000 00000000 00000000 00000000 00000000 00000000 000001E2 AAD6A612 F33307BE 5FA47C3C 9E052F83 8164CD37 D9A21173",
            "02",false
             ),
    SECT571K1(
            "x^571 x^10 x^5 x^2 1",
            "00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000000",
            "00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000001",
            "026EB7A8 59923FBC 82189631 F8103FE4 AC9CA297 0012D5D4 60248048 01841CA4 43709584 93B205E6 47DA304D B4CEB08C BBD1BA39 494776FB 988B4717 4DCA88C7 E2945283 A01C8972",
            "0349DC80 7F4FBF37 4F4AEADE 3BCA9531 4DD58CEC 9F307A54 FFC61EFC 006D8A2C 9D4979C0 AC44AEA7 4FBEBBB9 F772AEDC B620B01A 7BA7AF1B 320430C8 591984F6 01CD4C14 3EF1C7A3",
            "02000000 00000000 00000000 00000000 00000000 00000000 00000000 00000000 00000000 131850E1 F19A63E4 B391A8DB 917F4138 B630D84B E5D63938 1E91DEB4 5CFE778F 637C1001",
            "04",false
            );
    
    
    private final String p;
    private final BigInteger a;
    private final BigInteger b;
    private final BigInteger Gx;
    private final BigInteger Gy;
    private final BigInteger n;
    private final BigInteger h;
    private final boolean type;
    
    private SECP(String p, String a, String b, String Gx, String Gy, String n, String h, boolean type) {
        this.p = type?p.replace(" ", ""):p;
        this.a = new BigInteger(a.replace(" ", ""), 16);
        this.b = new BigInteger(b.replace(" ", ""), 16);
        this.Gx = new BigInteger(Gx.replace(" ", ""), 16);
        this.Gy = new BigInteger(Gy.replace(" ", ""), 16);
        this.n = new BigInteger(n.replace(" ", ""), 16);
        this.h = new BigInteger(h.replace(" ", ""), 16);
        this.type = type;
    }

    /**
     * @return type of these elliptic curve parameters
     * true if defined over prime field
     * false if defined over binary extension field
     */
    public boolean getType() {
        return type;
    }
    
    /**
     * @return 
     * if prime field - > order of the field
     * if binary extension field - > irreducible polynomial in x^n notation
     * 
     */
    public String getP() {
        return p;
    }

    /**
     * 
     * @return parameter a of elliptic curve equation
     */
    public BigInteger getA() {
        return a;
    }

    /**
     * 
     * @return parameter b of elliptic curve equation
     */
    public BigInteger getB() {
        return b;
    }

    /**
     * 
     * @return x coordinate of generator point
     */
    public BigInteger getGx() {
        return Gx;
    }

    /**
     * 
     * @return y coordinate of generator point
     */
    public BigInteger getGy() {
        return Gy;
    }

    /**
     * 
     * @return order of generator point
     */
    public BigInteger getN() {
        return n;
    }

    /**
     * 
     * @return cofactor i.e. h = order of field/n
     */
    public BigInteger getH() {
        return h;
    } 
}
