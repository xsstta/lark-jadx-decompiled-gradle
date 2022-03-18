package com.ss.android.ttvecamera;

import com.huawei.hms.feature.dynamic.DynamicModule;

public class TECameraFrame {

    /* renamed from: a */
    public long f150486a;

    /* renamed from: b */
    private int f150487b;

    /* renamed from: c */
    private int f150488c;

    /* renamed from: d */
    private C60280c f150489d;

    public enum ETEPixelFormat {
        PIXEL_FORMAT_YUV420,
        PIXEL_FORMAT_YUV420P,
        PIXEL_FORMAT_NV12,
        PIXEL_FORMAT_NV21,
        PIXEL_FORMAT_YUYV422,
        PIXEL_FORMAT_YUV422P,
        PIXEL_FORMAT_UYVY422,
        PIXEL_FORMAT_GRAY8,
        PIXEL_FORMAT_RGB8,
        PIXEL_FORMAT_BGR8,
        PIXEL_FORMAT_ARGB8,
        PIXEL_FORMAT_RGBA8,
        PIXEL_FORMAT_BGRA8,
        PIXEL_FORMAT_OpenGL_GRAY,
        PIXEL_FORMAT_OpenGL_RGB8,
        PIXEL_FORMAT_OpenGL_RGBA8,
        PIXEL_FORMAT_OpenGL_OES,
        PIXEL_FORMAT_JPEG,
        PIXEL_FORMAT_BUFFER,
        PIXEL_FORMAT_Count,
        PIXEL_FORMAT_Recorder
    }

    /* renamed from: com.ss.android.ttvecamera.TECameraFrame$a */
    public static class C60278a extends C60280c {

        /* renamed from: a */
        private int f150491a;

        /* renamed from: b */
        private byte[] f150492b;

        /* renamed from: a */
        public byte[] mo206380a() {
            return this.f150492b;
        }

        public C60278a(int i, int i2, long j, byte[] bArr, int i3, ETEPixelFormat eTEPixelFormat, int i4) {
            super(i, i2, j, i4);
            this.f150497e = 2;
            this.f150498f = i3;
            this.f150496d = eTEPixelFormat;
            this.f150492b = bArr;
            this.f150491a = i * i2 * 4;
        }
    }

    /* renamed from: com.ss.android.ttvecamera.TECameraFrame$b */
    public static class C60279b extends C60280c {

        /* renamed from: a */
        public int f150493a;

        /* renamed from: b */
        float[] f150494b;

        /* renamed from: a */
        public int mo206381a() {
            return this.f150493a;
        }

        /* renamed from: b */
        public float[] mo206382b() {
            return this.f150494b;
        }

        public C60279b(int i, int i2, long j, int i3, int i4, float[] fArr, ETEPixelFormat eTEPixelFormat, int i5) {
            super(i, i2, j, i5);
            this.f150497e = 1;
            this.f150493a = i3;
            this.f150498f = i4;
            this.f150494b = fArr;
            this.f150496d = eTEPixelFormat;
        }
    }

    /* renamed from: com.ss.android.ttvecamera.TECameraFrame$d */
    public static class C60281d extends C60280c {

        /* renamed from: a */
        C60435v f150501a;

        /* renamed from: a */
        public C60435v mo206383a() {
            return this.f150501a;
        }

        public C60281d(int i, int i2, long j, C60435v vVar, int i3, ETEPixelFormat eTEPixelFormat, int i4) {
            super(i, i2, j, i4);
            this.f150497e = 3;
            this.f150498f = i3;
            this.f150496d = eTEPixelFormat;
            this.f150501a = vVar;
        }
    }

    /* renamed from: i */
    public long mo206378i() {
        return this.f150486a;
    }

    /* renamed from: d */
    public int mo206373d() {
        return this.f150489d.f150498f;
    }

    /* renamed from: f */
    public TEFrameSizei mo206375f() {
        return this.f150489d.f150495c;
    }

    /* renamed from: g */
    public ETEPixelFormat mo206376g() {
        return this.f150489d.f150496d;
    }

    /* renamed from: h */
    public int mo206377h() {
        return this.f150489d.f150497e;
    }

    /* renamed from: j */
    public int mo206379j() {
        return this.f150489d.f150500h;
    }

    /* renamed from: a */
    public byte[] mo206370a() {
        C60280c cVar = this.f150489d;
        if (cVar instanceof C60278a) {
            return ((C60278a) cVar).mo206380a();
        }
        return null;
    }

    /* renamed from: b */
    public int mo206371b() {
        C60280c cVar = this.f150489d;
        if (cVar instanceof C60279b) {
            return ((C60279b) cVar).mo206381a();
        }
        return 0;
    }

    /* renamed from: c */
    public C60435v mo206372c() {
        C60280c cVar = this.f150489d;
        if (cVar instanceof C60281d) {
            return ((C60281d) cVar).mo206383a();
        }
        return null;
    }

    /* renamed from: e */
    public float[] mo206374e() {
        C60280c cVar = this.f150489d;
        if (cVar instanceof C60279b) {
            return ((C60279b) cVar).mo206382b();
        }
        return null;
    }

    /* renamed from: com.ss.android.ttvecamera.TECameraFrame$1 */
    static /* synthetic */ class C602771 {

        /* renamed from: a */
        static final /* synthetic */ int[] f150490a;

        /* JADX WARNING: Can't wrap try/catch for region: R(36:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0090 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x009c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x00a8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00c0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
            // Method dump skipped, instructions count: 205
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ttvecamera.TECameraFrame.C602771.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static int m234188a(ETEPixelFormat eTEPixelFormat) {
        switch (C602771.f150490a[eTEPixelFormat.ordinal()]) {
            case 1:
                return 35;
            case 2:
                return 842094169;
            case 3:
                return 17;
            case 4:
                return 16;
            case 5:
            case 6:
                return 39;
            case 7:
                return 41;
            case 8:
                return 42;
            case 9:
                return DynamicModule.f58006b;
            default:
                return 0;
        }
    }

    /* renamed from: com.ss.android.ttvecamera.TECameraFrame$c */
    public static class C60280c {

        /* renamed from: c */
        public TEFrameSizei f150495c;

        /* renamed from: d */
        public ETEPixelFormat f150496d;

        /* renamed from: e */
        public int f150497e;

        /* renamed from: f */
        public int f150498f;

        /* renamed from: g */
        public long f150499g;

        /* renamed from: h */
        public int f150500h;

        public C60280c(int i, int i2, long j) {
            this(i, i2, j, 0);
        }

        public C60280c(int i, int i2, long j, int i3) {
            this.f150495c = new TEFrameSizei(i, i2);
            this.f150499g = j;
            this.f150500h = i3;
        }
    }

    public TECameraFrame(int i, int i2, long j) {
        this.f150489d = new C60280c(0, 0, 0);
        this.f150487b = i;
        this.f150488c = i2;
        this.f150486a = j;
    }

    /* renamed from: a */
    public void mo206368a(C60435v vVar, int i, ETEPixelFormat eTEPixelFormat, int i2) {
        this.f150489d = new C60281d(this.f150487b, this.f150488c, this.f150486a, vVar, i, eTEPixelFormat, i2);
    }

    /* renamed from: a */
    public void mo206369a(byte[] bArr, int i, ETEPixelFormat eTEPixelFormat, int i2) {
        this.f150489d = new C60278a(this.f150487b, this.f150488c, this.f150486a, bArr, i, eTEPixelFormat, i2);
    }

    public TECameraFrame(C60435v vVar, ETEPixelFormat eTEPixelFormat, int i, int i2, int i3) {
        this(i, i2, 0);
        mo206368a(vVar, i3, eTEPixelFormat, 0);
    }

    /* renamed from: a */
    public void mo206367a(int i, int i2, float[] fArr, ETEPixelFormat eTEPixelFormat, int i3) {
        this.f150489d = new C60279b(this.f150487b, this.f150488c, this.f150486a, i, i2, fArr, eTEPixelFormat, i3);
    }

    public TECameraFrame(byte[] bArr, ETEPixelFormat eTEPixelFormat, int i, int i2, int i3) {
        this(i, i2, 0);
        mo206369a(bArr, i3, eTEPixelFormat, 0);
    }
}
