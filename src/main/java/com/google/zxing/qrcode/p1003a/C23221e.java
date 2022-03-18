package com.google.zxing.qrcode.p1003a;

import com.google.zxing.WriterException;
import com.google.zxing.common.C23209a;
import com.google.zxing.qrcode.decoder.C23224a;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;

/* renamed from: com.google.zxing.qrcode.a.e */
final class C23221e {

    /* renamed from: a */
    private static final int[][] f57266a = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};

    /* renamed from: b */
    private static final int[][] f57267b = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};

    /* renamed from: c */
    private static final int[][] f57268c = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, SmEvents.EVENT_NO, -1, -1}, new int[]{6, 30, 58, 86, SmEvents.EVENT_TO, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, SmActions.ACTION_INIT_EXIT, -1}, new int[]{6, 30, 54, 78, 102, SmActions.ACTION_RINGING_EXIT, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, SmEvents.EVENT_NE_RR, 138, -1}, new int[]{6, 30, 58, 86, SmEvents.EVENT_TO, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, SmActions.ACTION_RINGING_EXIT, 150}, new int[]{6, 24, 50, 76, 102, SmActions.ACTION_ONTHECALL_EXIT, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, SmEvents.EVENT_NO, 136, 162}, new int[]{6, 26, 54, 82, SmEvents.EVENT_NO, 138, 166}, new int[]{6, 30, 58, 86, SmEvents.EVENT_TO, 142, 170}};

    /* renamed from: d */
    private static final int[][] f57269d = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    /* renamed from: b */
    private static boolean m84132b(int i) {
        return i == -1;
    }

    /* renamed from: a */
    static void m84128a(C23224a aVar, C23217b bVar) throws WriterException {
        m84137d(bVar);
        m84134c(bVar);
        m84135c(aVar, bVar);
        m84130b(bVar);
    }

    /* renamed from: a */
    static int m84119a(int i) {
        return 32 - Integer.numberOfLeadingZeros(i);
    }

    /* renamed from: b */
    private static void m84130b(C23217b bVar) {
        int i = 8;
        while (i < bVar.mo80532b() - 8) {
            int i2 = i + 1;
            int i3 = i2 % 2;
            if (m84132b(bVar.mo80527a(i, 6))) {
                bVar.mo80530a(i, 6, i3);
            }
            if (m84132b(bVar.mo80527a(6, i))) {
                bVar.mo80530a(6, i, i3);
            }
            i = i2;
        }
    }

    /* renamed from: c */
    private static void m84134c(C23217b bVar) throws WriterException {
        if (bVar.mo80527a(8, bVar.mo80528a() - 8) != 0) {
            bVar.mo80530a(8, bVar.mo80528a() - 8, 1);
            return;
        }
        throw new WriterException();
    }

    /* renamed from: d */
    private static void m84137d(C23217b bVar) throws WriterException {
        int length = f57266a[0].length;
        m84136d(0, 0, bVar);
        m84136d(bVar.mo80532b() - length, 0, bVar);
        m84136d(0, bVar.mo80532b() - length, bVar);
        m84121a(0, 7, bVar);
        m84121a(bVar.mo80532b() - 8, 7, bVar);
        m84121a(0, bVar.mo80532b() - 8, bVar);
        m84129b(7, 0, bVar);
        m84129b((bVar.mo80528a() - 7) - 1, 0, bVar);
        m84129b(7, bVar.mo80528a() - 7, bVar);
    }

    /* renamed from: a */
    static void m84124a(C23217b bVar) {
        bVar.mo80529a((byte) -1);
    }

    /* renamed from: a */
    static int m84120a(int i, int i2) {
        if (i2 != 0) {
            int a = m84119a(i2);
            int i3 = i << (a - 1);
            while (m84119a(i3) >= a) {
                i3 ^= i2 << (m84119a(i3) - a);
            }
            return i3;
        }
        throw new IllegalArgumentException("0 polynomial");
    }

    /* renamed from: b */
    static void m84131b(C23224a aVar, C23217b bVar) throws WriterException {
        if (aVar.mo80547a() >= 7) {
            C23209a aVar2 = new C23209a();
            m84127a(aVar, aVar2);
            int i = 17;
            for (int i2 = 0; i2 < 6; i2++) {
                for (int i3 = 0; i3 < 3; i3++) {
                    boolean a = aVar2.mo80485a(i);
                    i--;
                    bVar.mo80531a(i2, (bVar.mo80528a() - 11) + i3, a);
                    bVar.mo80531a((bVar.mo80528a() - 11) + i3, i2, a);
                }
            }
        }
    }

    /* renamed from: c */
    private static void m84135c(C23224a aVar, C23217b bVar) {
        if (aVar.mo80547a() >= 2) {
            int[] iArr = f57268c[aVar.mo80547a() - 1];
            for (int i : iArr) {
                if (i >= 0) {
                    for (int i2 : iArr) {
                        if (i2 >= 0 && m84132b(bVar.mo80527a(i2, i))) {
                            m84133c(i2 - 2, i - 2, bVar);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    static void m84127a(C23224a aVar, C23209a aVar2) throws WriterException {
        aVar2.mo80481a(aVar.mo80547a(), 6);
        aVar2.mo80481a(m84120a(aVar.mo80547a(), 7973), 12);
        if (aVar2.mo80480a() != 18) {
            throw new WriterException("should not happen but we got: " + aVar2.mo80480a());
        }
    }

    /* renamed from: a */
    private static void m84121a(int i, int i2, C23217b bVar) throws WriterException {
        for (int i3 = 0; i3 < 8; i3++) {
            int i4 = i + i3;
            if (m84132b(bVar.mo80527a(i4, i2))) {
                bVar.mo80530a(i4, i2, 0);
            } else {
                throw new WriterException();
            }
        }
    }

    /* renamed from: b */
    private static void m84129b(int i, int i2, C23217b bVar) throws WriterException {
        for (int i3 = 0; i3 < 7; i3++) {
            int i4 = i2 + i3;
            if (m84132b(bVar.mo80527a(i, i4))) {
                bVar.mo80530a(i, i4, 0);
            } else {
                throw new WriterException();
            }
        }
    }

    /* renamed from: c */
    private static void m84133c(int i, int i2, C23217b bVar) {
        for (int i3 = 0; i3 < 5; i3++) {
            int[] iArr = f57267b[i3];
            for (int i4 = 0; i4 < 5; i4++) {
                bVar.mo80530a(i + i4, i2 + i3, iArr[i4]);
            }
        }
    }

    /* renamed from: d */
    private static void m84136d(int i, int i2, C23217b bVar) {
        for (int i3 = 0; i3 < 7; i3++) {
            int[] iArr = f57266a[i3];
            for (int i4 = 0; i4 < 7; i4++) {
                bVar.mo80530a(i + i4, i2 + i3, iArr[i4]);
            }
        }
    }

    /* renamed from: a */
    static void m84122a(C23209a aVar, int i, C23217b bVar) throws WriterException {
        boolean z;
        int b = bVar.mo80532b() - 1;
        int a = bVar.mo80528a() - 1;
        int i2 = 0;
        int i3 = -1;
        while (b > 0) {
            if (b == 6) {
                b--;
            }
            while (a >= 0 && a < bVar.mo80528a()) {
                for (int i4 = 0; i4 < 2; i4++) {
                    int i5 = b - i4;
                    if (m84132b(bVar.mo80527a(i5, a))) {
                        if (i2 < aVar.mo80480a()) {
                            z = aVar.mo80485a(i2);
                            i2++;
                        } else {
                            z = false;
                        }
                        if (i != -1 && C23220d.m84113a(i, i5, a)) {
                            z = !z;
                        }
                        bVar.mo80531a(i5, a, z);
                    }
                }
                a += i3;
            }
            i3 = -i3;
            a += i3;
            b -= 2;
        }
        if (i2 != aVar.mo80480a()) {
            throw new WriterException("Not all bits consumed: " + i2 + '/' + aVar.mo80480a());
        }
    }

    /* renamed from: a */
    static void m84125a(ErrorCorrectionLevel errorCorrectionLevel, int i, C23209a aVar) throws WriterException {
        if (C23222f.m84138b(i)) {
            int bits = (errorCorrectionLevel.getBits() << 3) | i;
            aVar.mo80481a(bits, 5);
            aVar.mo80481a(m84120a(bits, 1335), 10);
            C23209a aVar2 = new C23209a();
            aVar2.mo80481a(21522, 15);
            aVar.mo80487b(aVar2);
            if (aVar.mo80480a() != 15) {
                throw new WriterException("should not happen but we got: " + aVar.mo80480a());
            }
            return;
        }
        throw new WriterException("Invalid mask pattern");
    }

    /* renamed from: a */
    static void m84126a(ErrorCorrectionLevel errorCorrectionLevel, int i, C23217b bVar) throws WriterException {
        C23209a aVar = new C23209a();
        m84125a(errorCorrectionLevel, i, aVar);
        for (int i2 = 0; i2 < aVar.mo80480a(); i2++) {
            boolean a = aVar.mo80485a((aVar.mo80480a() - 1) - i2);
            int[] iArr = f57269d[i2];
            bVar.mo80531a(iArr[0], iArr[1], a);
            if (i2 < 8) {
                bVar.mo80531a((bVar.mo80532b() - i2) - 1, 8, a);
            } else {
                bVar.mo80531a(8, (bVar.mo80528a() - 7) + (i2 - 8), a);
            }
        }
    }

    /* renamed from: a */
    static void m84123a(C23209a aVar, ErrorCorrectionLevel errorCorrectionLevel, C23224a aVar2, int i, C23217b bVar) throws WriterException {
        m84124a(bVar);
        m84128a(aVar2, bVar);
        m84126a(errorCorrectionLevel, i, bVar);
        m84131b(aVar2, bVar);
        m84122a(aVar, i, bVar);
    }
}
