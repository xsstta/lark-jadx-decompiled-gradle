package com.google.zxing.qrcode.p1003a;

import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.C23209a;
import com.google.zxing.common.CharacterSetECI;
import com.google.zxing.common.reedsolomon.C23212a;
import com.google.zxing.common.reedsolomon.C23214c;
import com.google.zxing.qrcode.decoder.C23224a;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Mode;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: com.google.zxing.qrcode.a.c */
public final class C23218c {

    /* renamed from: a */
    private static final int[] f57264a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* renamed from: a */
    private static C23224a m84097a(ErrorCorrectionLevel errorCorrectionLevel, Mode mode, C23209a aVar, C23209a aVar2) throws WriterException {
        return m84096a(m84092a(mode, aVar, aVar2, m84096a(m84092a(mode, aVar, aVar2, C23224a.m84148a(1)), errorCorrectionLevel)), errorCorrectionLevel);
    }

    /* renamed from: a */
    private static boolean m84108a(String str) {
        try {
            byte[] bytes = str.getBytes("Shift_JIS");
            int length = bytes.length;
            if (length % 2 != 0) {
                return false;
            }
            for (int i = 0; i < length; i += 2) {
                int i2 = bytes[i] & 255;
                if ((i2 < 129 || i2 > 159) && (i2 < 224 || i2 > 235)) {
                    return false;
                }
            }
            return true;
        } catch (UnsupportedEncodingException unused) {
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m84107a(int i, C23224a aVar, ErrorCorrectionLevel errorCorrectionLevel) {
        return aVar.mo80549b() - aVar.mo80548a(errorCorrectionLevel).mo80556c() >= (i + 7) / 8;
    }

    /* renamed from: a */
    static void m84099a(int i, C23209a aVar) throws WriterException {
        int i2 = i * 8;
        if (aVar.mo80480a() <= i2) {
            for (int i3 = 0; i3 < 4 && aVar.mo80480a() < i2; i3++) {
                aVar.mo80484a(false);
            }
            int a = aVar.mo80480a() & 7;
            if (a > 0) {
                while (a < 8) {
                    aVar.mo80484a(false);
                    a++;
                }
            }
            int b = i - aVar.mo80486b();
            for (int i4 = 0; i4 < b; i4++) {
                aVar.mo80481a((i4 & 1) == 0 ? 236 : 17, 8);
            }
            if (aVar.mo80480a() != i2) {
                throw new WriterException("Bits size does not equal capacity");
            }
            return;
        }
        throw new WriterException("data bits cannot fit in the QR Code" + aVar.mo80480a() + " > " + i2);
    }

    /* renamed from: a */
    static void m84098a(int i, int i2, int i3, int i4, int[] iArr, int[] iArr2) throws WriterException {
        if (i4 < i3) {
            int i5 = i % i3;
            int i6 = i3 - i5;
            int i7 = i / i3;
            int i8 = i7 + 1;
            int i9 = i2 / i3;
            int i10 = i9 + 1;
            int i11 = i7 - i9;
            int i12 = i8 - i10;
            if (i11 != i12) {
                throw new WriterException("EC bytes mismatch");
            } else if (i3 != i6 + i5) {
                throw new WriterException("RS blocks mismatch");
            } else if (i != ((i9 + i11) * i6) + ((i10 + i12) * i5)) {
                throw new WriterException("Total bytes mismatch");
            } else if (i4 < i6) {
                iArr[0] = i9;
                iArr2[0] = i11;
            } else {
                iArr[0] = i10;
                iArr2[0] = i12;
            }
        } else {
            throw new WriterException("Block ID too large");
        }
    }

    /* renamed from: a */
    static byte[] m84109a(byte[] bArr, int i) {
        int length = bArr.length;
        int[] iArr = new int[(length + i)];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = bArr[i2] & 255;
        }
        new C23214c(C23212a.f57244e).mo80523a(iArr, i);
        byte[] bArr2 = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr2[i3] = (byte) iArr[length + i3];
        }
        return bArr2;
    }

    /* renamed from: a */
    static void m84102a(Mode mode, C23209a aVar) {
        aVar.mo80481a(mode.getBits(), 4);
    }

    /* renamed from: a */
    static void m84100a(int i, C23224a aVar, Mode mode, C23209a aVar2) throws WriterException {
        int characterCountBits = mode.getCharacterCountBits(aVar);
        int i2 = 1 << characterCountBits;
        if (i < i2) {
            aVar2.mo80481a(i, characterCountBits);
            return;
        }
        throw new WriterException(i + " is bigger than " + (i2 - 1));
    }

    /* renamed from: a */
    static void m84106a(String str, Mode mode, C23209a aVar, String str2) throws WriterException {
        int i = C232191.f57265a[mode.ordinal()];
        if (i == 1) {
            m84103a((CharSequence) str, aVar);
        } else if (i == 2) {
            m84110b(str, aVar);
        } else if (i == 3) {
            m84105a(str, aVar, str2);
        } else if (i == 4) {
            m84104a(str, aVar);
        } else {
            throw new WriterException("Invalid mode: " + mode);
        }
    }

    /* renamed from: a */
    static void m84103a(CharSequence charSequence, C23209a aVar) {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int charAt = charSequence.charAt(i) - '0';
            int i2 = i + 2;
            if (i2 < length) {
                aVar.mo80481a((charAt * 100) + ((charSequence.charAt(i + 1) - '0') * 10) + (charSequence.charAt(i2) - '0'), 10);
                i += 3;
            } else {
                i++;
                if (i < length) {
                    aVar.mo80481a((charAt * 10) + (charSequence.charAt(i) - '0'), 7);
                    i = i2;
                } else {
                    aVar.mo80481a(charAt, 4);
                }
            }
        }
    }

    /* renamed from: a */
    static void m84105a(String str, C23209a aVar, String str2) throws WriterException {
        try {
            for (byte b : str.getBytes(str2)) {
                aVar.mo80481a(b, 8);
            }
        } catch (UnsupportedEncodingException e) {
            throw new WriterException(e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0035 A[LOOP:0: B:4:0x0008->B:17:0x0035, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0044 A[SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m84104a(java.lang.String r6, com.google.zxing.common.C23209a r7) throws com.google.zxing.WriterException {
        /*
            java.lang.String r0 = "Shift_JIS"
            byte[] r6 = r6.getBytes(r0)     // Catch:{ UnsupportedEncodingException -> 0x004d }
            int r0 = r6.length
            r1 = 0
        L_0x0008:
            if (r1 >= r0) goto L_0x004c
            byte r2 = r6[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r1 + 1
            byte r3 = r6[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r2 = r2 | r3
            r3 = 33088(0x8140, float:4.6366E-41)
            r4 = -1
            if (r2 < r3) goto L_0x0024
            r5 = 40956(0x9ffc, float:5.7392E-41)
            if (r2 > r5) goto L_0x0024
        L_0x0022:
            int r2 = r2 - r3
            goto L_0x0033
        L_0x0024:
            r3 = 57408(0xe040, float:8.0446E-41)
            if (r2 < r3) goto L_0x0032
            r3 = 60351(0xebbf, float:8.457E-41)
            if (r2 > r3) goto L_0x0032
            r3 = 49472(0xc140, float:6.9325E-41)
            goto L_0x0022
        L_0x0032:
            r2 = -1
        L_0x0033:
            if (r2 == r4) goto L_0x0044
            int r3 = r2 >> 8
            int r3 = r3 * 192
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r2
            r2 = 13
            r7.mo80481a(r3, r2)
            int r1 = r1 + 2
            goto L_0x0008
        L_0x0044:
            com.google.zxing.WriterException r6 = new com.google.zxing.WriterException
            java.lang.String r7 = "Invalid byte sequence"
            r6.<init>(r7)
            throw r6
        L_0x004c:
            return
        L_0x004d:
            r6 = move-exception
            com.google.zxing.WriterException r7 = new com.google.zxing.WriterException
            r7.<init>(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.qrcode.p1003a.C23218c.m84104a(java.lang.String, com.google.zxing.common.a):void");
    }

    /* renamed from: a */
    private static void m84101a(CharacterSetECI characterSetECI, C23209a aVar) {
        aVar.mo80481a(Mode.ECI.getBits(), 4);
        aVar.mo80481a(characterSetECI.getValue(), 8);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.zxing.qrcode.a.c$1 */
    public static /* synthetic */ class C232191 {

        /* renamed from: a */
        static final /* synthetic */ int[] f57265a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.google.zxing.qrcode.decoder.Mode[] r0 = com.google.zxing.qrcode.decoder.Mode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.zxing.qrcode.p1003a.C23218c.C232191.f57265a = r0
                com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.NUMERIC     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.google.zxing.qrcode.p1003a.C23218c.C232191.f57265a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.ALPHANUMERIC     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.google.zxing.qrcode.p1003a.C23218c.C232191.f57265a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.BYTE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.google.zxing.qrcode.p1003a.C23218c.C232191.f57265a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.google.zxing.qrcode.decoder.Mode r1 = com.google.zxing.qrcode.decoder.Mode.KANJI     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.qrcode.p1003a.C23218c.C232191.<clinit>():void");
        }
    }

    /* renamed from: a */
    static int m84089a(int i) {
        int[] iArr = f57264a;
        if (i < iArr.length) {
            return iArr[i];
        }
        return -1;
    }

    /* renamed from: a */
    private static int m84091a(C23217b bVar) {
        return C23220d.m84111a(bVar) + C23220d.m84116b(bVar) + C23220d.m84117c(bVar) + C23220d.m84118d(bVar);
    }

    /* renamed from: b */
    static void m84110b(CharSequence charSequence, C23209a aVar) throws WriterException {
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            int a = m84089a(charSequence.charAt(i));
            if (a != -1) {
                int i2 = i + 1;
                if (i2 < length) {
                    int a2 = m84089a(charSequence.charAt(i2));
                    if (a2 != -1) {
                        aVar.mo80481a((a * 45) + a2, 11);
                        i += 2;
                    } else {
                        throw new WriterException();
                    }
                } else {
                    aVar.mo80481a(a, 6);
                    i = i2;
                }
            } else {
                throw new WriterException();
            }
        }
    }

    /* renamed from: a */
    private static Mode m84095a(String str, String str2) {
        if ("Shift_JIS".equals(str2) && m84108a(str)) {
            return Mode.KANJI;
        }
        boolean z = false;
        boolean z2 = false;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt >= '0' && charAt <= '9') {
                z2 = true;
            } else if (m84089a(charAt) == -1) {
                return Mode.BYTE;
            } else {
                z = true;
            }
        }
        if (z) {
            return Mode.ALPHANUMERIC;
        }
        if (z2) {
            return Mode.NUMERIC;
        }
        return Mode.BYTE;
    }

    /* renamed from: a */
    private static C23224a m84096a(int i, ErrorCorrectionLevel errorCorrectionLevel) throws WriterException {
        for (int i2 = 1; i2 <= 40; i2++) {
            C23224a a = C23224a.m84148a(i2);
            if (m84107a(i, a, errorCorrectionLevel)) {
                return a;
            }
        }
        throw new WriterException("Data too big");
    }

    /* renamed from: a */
    public static C23222f m84094a(String str, ErrorCorrectionLevel errorCorrectionLevel, Map<EncodeHintType, ?> map) throws WriterException {
        boolean z;
        String str2;
        C23224a aVar;
        int i;
        CharacterSetECI characterSetECIByName;
        boolean z2 = true;
        if (map == null || !map.containsKey(EncodeHintType.CHARACTER_SET)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            str2 = map.get(EncodeHintType.CHARACTER_SET).toString();
        } else {
            str2 = "ISO-8859-1";
        }
        Mode a = m84095a(str, str2);
        C23209a aVar2 = new C23209a();
        if (a == Mode.BYTE && ((z || !"ISO-8859-1".equals(str2)) && (characterSetECIByName = CharacterSetECI.getCharacterSetECIByName(str2)) != null)) {
            m84101a(characterSetECIByName, aVar2);
        }
        if (map == null || !map.containsKey(EncodeHintType.GS1_FORMAT)) {
            z2 = false;
        }
        if (z2 && Boolean.valueOf(map.get(EncodeHintType.GS1_FORMAT).toString()).booleanValue()) {
            m84102a(Mode.FNC1_FIRST_POSITION, aVar2);
        }
        m84102a(a, aVar2);
        C23209a aVar3 = new C23209a();
        m84106a(str, a, aVar3, str2);
        if (map == null || !map.containsKey(EncodeHintType.QR_VERSION)) {
            aVar = m84097a(errorCorrectionLevel, a, aVar2, aVar3);
        } else {
            aVar = C23224a.m84148a(Integer.parseInt(map.get(EncodeHintType.QR_VERSION).toString()));
            if (!m84107a(m84092a(a, aVar2, aVar3, aVar), aVar, errorCorrectionLevel)) {
                throw new WriterException("Data too big for requested version");
            }
        }
        C23209a aVar4 = new C23209a();
        aVar4.mo80483a(aVar2);
        if (a == Mode.BYTE) {
            i = aVar3.mo80486b();
        } else {
            i = str.length();
        }
        m84100a(i, aVar, a, aVar4);
        aVar4.mo80483a(aVar3);
        C23224a.C23226b a2 = aVar.mo80548a(errorCorrectionLevel);
        int b = aVar.mo80549b() - a2.mo80556c();
        m84099a(b, aVar4);
        C23209a a3 = m84093a(aVar4, aVar.mo80549b(), b, a2.mo80555b());
        C23222f fVar = new C23222f();
        fVar.mo80538a(errorCorrectionLevel);
        fVar.mo80539a(a);
        fVar.mo80540a(aVar);
        int c = aVar.mo80550c();
        C23217b bVar = new C23217b(c, c);
        int a4 = m84090a(a3, errorCorrectionLevel, aVar, bVar);
        fVar.mo80536a(a4);
        C23221e.m84123a(a3, errorCorrectionLevel, aVar, a4, bVar);
        fVar.mo80537a(bVar);
        return fVar;
    }

    /* renamed from: a */
    private static int m84090a(C23209a aVar, ErrorCorrectionLevel errorCorrectionLevel, C23224a aVar2, C23217b bVar) throws WriterException {
        int i = Integer.MAX_VALUE;
        int i2 = -1;
        for (int i3 = 0; i3 < 8; i3++) {
            C23221e.m84123a(aVar, errorCorrectionLevel, aVar2, i3, bVar);
            int a = m84091a(bVar);
            if (a < i) {
                i2 = i3;
                i = a;
            }
        }
        return i2;
    }

    /* renamed from: a */
    private static int m84092a(Mode mode, C23209a aVar, C23209a aVar2, C23224a aVar3) {
        return aVar.mo80480a() + mode.getCharacterCountBits(aVar3) + aVar2.mo80480a();
    }

    /* renamed from: a */
    static C23209a m84093a(C23209a aVar, int i, int i2, int i3) throws WriterException {
        if (aVar.mo80486b() == i2) {
            ArrayList<C23216a> arrayList = new ArrayList(i3);
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i3; i7++) {
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                m84098a(i, i2, i3, i7, iArr, iArr2);
                int i8 = iArr[0];
                byte[] bArr = new byte[i8];
                aVar.mo80482a(i4 * 8, bArr, 0, i8);
                byte[] a = m84109a(bArr, iArr2[0]);
                arrayList.add(new C23216a(bArr, a));
                i5 = Math.max(i5, i8);
                i6 = Math.max(i6, a.length);
                i4 += iArr[0];
            }
            if (i2 == i4) {
                C23209a aVar2 = new C23209a();
                for (int i9 = 0; i9 < i5; i9++) {
                    for (C23216a aVar3 : arrayList) {
                        byte[] a2 = aVar3.mo80525a();
                        if (i9 < a2.length) {
                            aVar2.mo80481a(a2[i9], 8);
                        }
                    }
                }
                for (int i10 = 0; i10 < i6; i10++) {
                    for (C23216a aVar4 : arrayList) {
                        byte[] b = aVar4.mo80526b();
                        if (i10 < b.length) {
                            aVar2.mo80481a(b[i10], 8);
                        }
                    }
                }
                if (i == aVar2.mo80486b()) {
                    return aVar2;
                }
                throw new WriterException("Interleaving error: " + i + " and " + aVar2.mo80486b() + " differ.");
            }
            throw new WriterException("Data bytes does not match offset");
        }
        throw new WriterException("Number of bits and data bytes does not match");
    }
}
