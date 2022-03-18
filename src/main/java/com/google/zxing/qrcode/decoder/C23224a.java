package com.google.zxing.qrcode.decoder;

import com.huawei.hms.location.ActivityIdentificationData;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import com.ss.android.vc.meeting.framework.statemachine.SmEvents;

/* renamed from: com.google.zxing.qrcode.decoder.a */
public final class C23224a {

    /* renamed from: a */
    private static final int[] f57279a = {31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 152622, 158308, 161089, 167017};

    /* renamed from: b */
    private static final C23224a[] f57280b = m84149d();

    /* renamed from: c */
    private final int f57281c;

    /* renamed from: d */
    private final int[] f57282d;

    /* renamed from: e */
    private final C23226b[] f57283e;

    /* renamed from: f */
    private final int f57284f;

    /* renamed from: com.google.zxing.qrcode.decoder.a$a */
    public static final class C23225a {

        /* renamed from: a */
        private final int f57285a;

        /* renamed from: b */
        private final int f57286b;

        /* renamed from: a */
        public int mo80552a() {
            return this.f57285a;
        }

        /* renamed from: b */
        public int mo80553b() {
            return this.f57286b;
        }

        C23225a(int i, int i2) {
            this.f57285a = i;
            this.f57286b = i2;
        }
    }

    /* renamed from: com.google.zxing.qrcode.decoder.a$b */
    public static final class C23226b {

        /* renamed from: a */
        private final int f57287a;

        /* renamed from: b */
        private final C23225a[] f57288b;

        /* renamed from: a */
        public int mo80554a() {
            return this.f57287a;
        }

        /* renamed from: d */
        public C23225a[] mo80557d() {
            return this.f57288b;
        }

        /* renamed from: c */
        public int mo80556c() {
            return this.f57287a * mo80555b();
        }

        /* renamed from: b */
        public int mo80555b() {
            int i = 0;
            for (C23225a aVar : this.f57288b) {
                i += aVar.mo80552a();
            }
            return i;
        }

        C23226b(int i, C23225a... aVarArr) {
            this.f57287a = i;
            this.f57288b = aVarArr;
        }
    }

    /* renamed from: a */
    public int mo80547a() {
        return this.f57281c;
    }

    /* renamed from: b */
    public int mo80549b() {
        return this.f57284f;
    }

    /* renamed from: d */
    private static C23224a[] m84149d() {
        return new C23224a[]{new C23224a(1, new int[0], new C23226b(7, new C23225a(1, 19)), new C23226b(10, new C23225a(1, 16)), new C23226b(13, new C23225a(1, 13)), new C23226b(17, new C23225a(1, 9))), new C23224a(2, new int[]{6, 18}, new C23226b(10, new C23225a(1, 34)), new C23226b(16, new C23225a(1, 28)), new C23226b(22, new C23225a(1, 22)), new C23226b(28, new C23225a(1, 16))), new C23224a(3, new int[]{6, 22}, new C23226b(15, new C23225a(1, 55)), new C23226b(26, new C23225a(1, 44)), new C23226b(18, new C23225a(2, 17)), new C23226b(22, new C23225a(2, 13))), new C23224a(4, new int[]{6, 26}, new C23226b(20, new C23225a(1, 80)), new C23226b(18, new C23225a(2, 32)), new C23226b(26, new C23225a(2, 24)), new C23226b(16, new C23225a(4, 9))), new C23224a(5, new int[]{6, 30}, new C23226b(26, new C23225a(1, 108)), new C23226b(24, new C23225a(2, 43)), new C23226b(18, new C23225a(2, 15), new C23225a(2, 16)), new C23226b(22, new C23225a(2, 11), new C23225a(2, 12))), new C23224a(6, new int[]{6, 34}, new C23226b(18, new C23225a(2, 68)), new C23226b(16, new C23225a(4, 27)), new C23226b(24, new C23225a(4, 19)), new C23226b(28, new C23225a(4, 15))), new C23224a(7, new int[]{6, 22, 38}, new C23226b(20, new C23225a(2, 78)), new C23226b(18, new C23225a(4, 31)), new C23226b(18, new C23225a(2, 14), new C23225a(4, 15)), new C23226b(26, new C23225a(4, 13), new C23225a(1, 14))), new C23224a(8, new int[]{6, 24, 42}, new C23226b(24, new C23225a(2, 97)), new C23226b(22, new C23225a(2, 38), new C23225a(2, 39)), new C23226b(22, new C23225a(4, 18), new C23225a(2, 19)), new C23226b(26, new C23225a(4, 14), new C23225a(2, 15))), new C23224a(9, new int[]{6, 26, 46}, new C23226b(30, new C23225a(2, SmEvents.EVENT_RS)), new C23226b(22, new C23225a(3, 36), new C23225a(2, 37)), new C23226b(20, new C23225a(4, 16), new C23225a(4, 17)), new C23226b(24, new C23225a(4, 12), new C23225a(4, 13))), new C23224a(10, new int[]{6, 28, 50}, new C23226b(18, new C23225a(2, 68), new C23225a(2, 69)), new C23226b(26, new C23225a(4, 43), new C23225a(1, 44)), new C23226b(24, new C23225a(6, 19), new C23225a(2, 20)), new C23226b(28, new C23225a(6, 15), new C23225a(2, 16))), new C23224a(11, new int[]{6, 30, 54}, new C23226b(20, new C23225a(4, 81)), new C23226b(30, new C23225a(1, 50), new C23225a(4, 51)), new C23226b(28, new C23225a(4, 22), new C23225a(4, 23)), new C23226b(24, new C23225a(3, 12), new C23225a(8, 13))), new C23224a(12, new int[]{6, 32, 58}, new C23226b(24, new C23225a(2, 92), new C23225a(2, 93)), new C23226b(22, new C23225a(6, 36), new C23225a(2, 37)), new C23226b(26, new C23225a(4, 20), new C23225a(6, 21)), new C23226b(28, new C23225a(7, 14), new C23225a(4, 15))), new C23224a(13, new int[]{6, 34, 62}, new C23226b(26, new C23225a(4, ActivityIdentificationData.WALKING)), new C23226b(22, new C23225a(8, 37), new C23225a(1, 38)), new C23226b(24, new C23225a(8, 20), new C23225a(4, 21)), new C23226b(22, new C23225a(12, 11), new C23225a(4, 12))), new C23224a(14, new int[]{6, 26, 46, 66}, new C23226b(30, new C23225a(3, 115), new C23225a(1, SmEvents.EVENT_RS)), new C23226b(24, new C23225a(4, 40), new C23225a(5, 41)), new C23226b(20, new C23225a(11, 16), new C23225a(5, 17)), new C23226b(24, new C23225a(11, 12), new C23225a(5, 13))), new C23224a(15, new int[]{6, 26, 48, 70}, new C23226b(22, new C23225a(5, 87), new C23225a(1, 88)), new C23226b(24, new C23225a(5, 41), new C23225a(5, 42)), new C23226b(30, new C23225a(5, 24), new C23225a(7, 25)), new C23226b(24, new C23225a(11, 12), new C23225a(7, 13))), new C23224a(16, new int[]{6, 26, 50, 74}, new C23226b(24, new C23225a(5, 98), new C23225a(1, 99)), new C23226b(28, new C23225a(7, 45), new C23225a(3, 46)), new C23226b(24, new C23225a(15, 19), new C23225a(2, 20)), new C23226b(30, new C23225a(3, 15), new C23225a(13, 16))), new C23224a(17, new int[]{6, 30, 54, 78}, new C23226b(28, new C23225a(1, ActivityIdentificationData.WALKING), new C23225a(5, 108)), new C23226b(28, new C23225a(10, 46), new C23225a(1, 47)), new C23226b(28, new C23225a(1, 22), new C23225a(15, 23)), new C23226b(28, new C23225a(2, 14), new C23225a(17, 15))), new C23224a(18, new int[]{6, 30, 56, 82}, new C23226b(30, new C23225a(5, SmEvents.EVENT_NW), new C23225a(1, SmActions.ACTION_INIT_ENTRY)), new C23226b(26, new C23225a(9, 43), new C23225a(4, 44)), new C23226b(28, new C23225a(17, 22), new C23225a(1, 23)), new C23226b(28, new C23225a(2, 14), new C23225a(19, 15))), new C23224a(19, new int[]{6, 30, 58, 86}, new C23226b(28, new C23225a(3, SmEvents.EVENT_RE), new C23225a(4, SmEvents.EVENT_TO)), new C23226b(26, new C23225a(3, 44), new C23225a(11, 45)), new C23226b(26, new C23225a(17, 21), new C23225a(4, 22)), new C23226b(26, new C23225a(9, 13), new C23225a(16, 14))), new C23224a(20, new int[]{6, 34, 62, 90}, new C23226b(28, new C23225a(3, ActivityIdentificationData.WALKING), new C23225a(5, 108)), new C23226b(26, new C23225a(3, 41), new C23225a(13, 42)), new C23226b(30, new C23225a(15, 24), new C23225a(5, 25)), new C23226b(28, new C23225a(15, 15), new C23225a(10, 16))), new C23224a(21, new int[]{6, 28, 50, 72, 94}, new C23226b(28, new C23225a(4, SmEvents.EVENT_RS), new C23225a(4, 117)), new C23226b(26, new C23225a(17, 42)), new C23226b(28, new C23225a(17, 22), new C23225a(6, 23)), new C23226b(30, new C23225a(19, 16), new C23225a(6, 17))), new C23224a(22, new int[]{6, 26, 50, 74, 98}, new C23226b(28, new C23225a(2, SmEvents.EVENT_NT), new C23225a(7, SmEvents.EVENT_NE_RR)), new C23226b(28, new C23225a(17, 46)), new C23226b(30, new C23225a(7, 24), new C23225a(16, 25)), new C23226b(24, new C23225a(34, 13))), new C23224a(23, new int[]{6, 30, 54, 78, 102}, new C23226b(30, new C23225a(4, SmActions.ACTION_INIT_ENTRY), new C23225a(5, SmActions.ACTION_INIT_EXIT)), new C23226b(28, new C23225a(4, 47), new C23225a(14, 48)), new C23226b(30, new C23225a(11, 24), new C23225a(14, 25)), new C23226b(30, new C23225a(16, 15), new C23225a(14, 16))), new C23224a(24, new int[]{6, 28, 54, 80, 106}, new C23226b(30, new C23225a(6, 117), new C23225a(4, 118)), new C23226b(28, new C23225a(6, 45), new C23225a(14, 46)), new C23226b(30, new C23225a(11, 24), new C23225a(16, 25)), new C23226b(30, new C23225a(30, 16), new C23225a(2, 17))), new C23224a(25, new int[]{6, 32, 58, 84, SmEvents.EVENT_NO}, new C23226b(26, new C23225a(8, 106), new C23225a(4, ActivityIdentificationData.WALKING)), new C23226b(28, new C23225a(8, 47), new C23225a(13, 48)), new C23226b(30, new C23225a(7, 24), new C23225a(22, 25)), new C23226b(30, new C23225a(22, 15), new C23225a(13, 16))), new C23224a(26, new int[]{6, 30, 58, 86, SmEvents.EVENT_TO}, new C23226b(28, new C23225a(10, SmEvents.EVENT_TO), new C23225a(2, 115)), new C23226b(28, new C23225a(19, 46), new C23225a(4, 47)), new C23226b(28, new C23225a(28, 22), new C23225a(6, 23)), new C23226b(30, new C23225a(33, 16), new C23225a(4, 17))), new C23224a(27, new int[]{6, 34, 62, 90, 118}, new C23226b(30, new C23225a(8, SmActions.ACTION_INIT_EXIT), new C23225a(4, SmActions.ACTION_CALLING_ENTRY)), new C23226b(28, new C23225a(22, 45), new C23225a(3, 46)), new C23226b(30, new C23225a(8, 23), new C23225a(26, 24)), new C23226b(30, new C23225a(12, 15), new C23225a(28, 16))), new C23224a(28, new int[]{6, 26, 50, 74, 98, SmActions.ACTION_INIT_EXIT}, new C23226b(30, new C23225a(3, 117), new C23225a(10, 118)), new C23226b(28, new C23225a(3, 45), new C23225a(23, 46)), new C23226b(30, new C23225a(4, 24), new C23225a(31, 25)), new C23226b(30, new C23225a(11, 15), new C23225a(31, 16))), new C23224a(29, new int[]{6, 30, 54, 78, 102, SmActions.ACTION_RINGING_EXIT}, new C23226b(30, new C23225a(7, SmEvents.EVENT_RS), new C23225a(7, 117)), new C23226b(28, new C23225a(21, 45), new C23225a(7, 46)), new C23226b(30, new C23225a(1, 23), new C23225a(37, 24)), new C23226b(30, new C23225a(19, 15), new C23225a(26, 16))), new C23224a(30, new int[]{6, 26, 52, 78, 104, 130}, new C23226b(30, new C23225a(5, 115), new C23225a(10, SmEvents.EVENT_RS)), new C23226b(28, new C23225a(19, 47), new C23225a(10, 48)), new C23226b(30, new C23225a(15, 24), new C23225a(25, 25)), new C23226b(30, new C23225a(23, 15), new C23225a(25, 16))), new C23224a(31, new int[]{6, 30, 56, 82, 108, 134}, new C23226b(30, new C23225a(13, 115), new C23225a(3, SmEvents.EVENT_RS)), new C23226b(28, new C23225a(2, 46), new C23225a(29, 47)), new C23226b(30, new C23225a(42, 24), new C23225a(1, 25)), new C23226b(30, new C23225a(23, 15), new C23225a(28, 16))), new C23224a(32, new int[]{6, 34, 60, 86, SmEvents.EVENT_NE_RR, 138}, new C23226b(30, new C23225a(17, 115)), new C23226b(28, new C23225a(10, 46), new C23225a(23, 47)), new C23226b(30, new C23225a(10, 24), new C23225a(35, 25)), new C23226b(30, new C23225a(19, 15), new C23225a(35, 16))), new C23224a(33, new int[]{6, 30, 58, 86, SmEvents.EVENT_TO, 142}, new C23226b(30, new C23225a(17, 115), new C23225a(1, SmEvents.EVENT_RS)), new C23226b(28, new C23225a(14, 46), new C23225a(21, 47)), new C23226b(30, new C23225a(29, 24), new C23225a(19, 25)), new C23226b(30, new C23225a(11, 15), new C23225a(46, 16))), new C23224a(34, new int[]{6, 34, 62, 90, 118, 146}, new C23226b(30, new C23225a(13, 115), new C23225a(6, SmEvents.EVENT_RS)), new C23226b(28, new C23225a(14, 46), new C23225a(23, 47)), new C23226b(30, new C23225a(44, 24), new C23225a(7, 25)), new C23226b(30, new C23225a(59, 16), new C23225a(1, 17))), new C23224a(35, new int[]{6, 30, 54, 78, 102, SmActions.ACTION_RINGING_EXIT, 150}, new C23226b(30, new C23225a(12, SmActions.ACTION_INIT_ENTRY), new C23225a(7, SmActions.ACTION_INIT_EXIT)), new C23226b(28, new C23225a(12, 47), new C23225a(26, 48)), new C23226b(30, new C23225a(39, 24), new C23225a(14, 25)), new C23226b(30, new C23225a(22, 15), new C23225a(41, 16))), new C23224a(36, new int[]{6, 24, 50, 76, 102, SmActions.ACTION_ONTHECALL_EXIT, 154}, new C23226b(30, new C23225a(6, SmActions.ACTION_INIT_ENTRY), new C23225a(14, SmActions.ACTION_INIT_EXIT)), new C23226b(28, new C23225a(6, 47), new C23225a(34, 48)), new C23226b(30, new C23225a(46, 24), new C23225a(10, 25)), new C23226b(30, new C23225a(2, 15), new C23225a(64, 16))), new C23224a(37, new int[]{6, 28, 54, 80, 106, 132, 158}, new C23226b(30, new C23225a(17, SmActions.ACTION_INIT_EXIT), new C23225a(4, SmActions.ACTION_CALLING_ENTRY)), new C23226b(28, new C23225a(29, 46), new C23225a(14, 47)), new C23226b(30, new C23225a(49, 24), new C23225a(10, 25)), new C23226b(30, new C23225a(24, 15), new C23225a(46, 16))), new C23224a(38, new int[]{6, 32, 58, 84, SmEvents.EVENT_NO, 136, 162}, new C23226b(30, new C23225a(4, SmActions.ACTION_INIT_EXIT), new C23225a(18, SmActions.ACTION_CALLING_ENTRY)), new C23226b(28, new C23225a(13, 46), new C23225a(32, 47)), new C23226b(30, new C23225a(48, 24), new C23225a(14, 25)), new C23226b(30, new C23225a(42, 15), new C23225a(32, 16))), new C23224a(39, new int[]{6, 26, 54, 82, SmEvents.EVENT_NO, 138, 166}, new C23226b(30, new C23225a(20, 117), new C23225a(4, 118)), new C23226b(28, new C23225a(40, 47), new C23225a(7, 48)), new C23226b(30, new C23225a(43, 24), new C23225a(22, 25)), new C23226b(30, new C23225a(10, 15), new C23225a(67, 16))), new C23224a(40, new int[]{6, 30, 58, 86, SmEvents.EVENT_TO, 142, 170}, new C23226b(30, new C23225a(19, 118), new C23225a(6, 119)), new C23226b(28, new C23225a(18, 47), new C23225a(31, 48)), new C23226b(30, new C23225a(34, 24), new C23225a(34, 25)), new C23226b(30, new C23225a(20, 15), new C23225a(61, 16)))};
    }

    /* renamed from: c */
    public int mo80550c() {
        return (this.f57281c * 4) + 17;
    }

    public String toString() {
        return String.valueOf(this.f57281c);
    }

    /* renamed from: a */
    public C23226b mo80548a(ErrorCorrectionLevel errorCorrectionLevel) {
        return this.f57283e[errorCorrectionLevel.ordinal()];
    }

    /* renamed from: a */
    public static C23224a m84148a(int i) {
        if (i >= 1 && i <= 40) {
            return f57280b[i - 1];
        }
        throw new IllegalArgumentException();
    }

    private C23224a(int i, int[] iArr, C23226b... bVarArr) {
        this.f57281c = i;
        this.f57282d = iArr;
        this.f57283e = bVarArr;
        int a = bVarArr[0].mo80554a();
        C23225a[] d = bVarArr[0].mo80557d();
        int i2 = 0;
        for (C23225a aVar : d) {
            i2 += aVar.mo80552a() * (aVar.mo80553b() + a);
        }
        this.f57284f = i2;
    }
}
