package androidx.p036f.p037a;

import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: androidx.f.a.c */
public final class C0994c {

    /* renamed from: a */
    public static final C0994c f3800a;

    /* renamed from: b */
    public static final C0994c f3801b;

    /* renamed from: c */
    public static final C0994c f3802c;

    /* renamed from: d */
    public static final C0994c f3803d;

    /* renamed from: e */
    public static final C0994c f3804e;

    /* renamed from: f */
    public static final C0994c f3805f;

    /* renamed from: g */
    final float[] f3806g;

    /* renamed from: h */
    final float[] f3807h;

    /* renamed from: i */
    final float[] f3808i = new float[3];

    /* renamed from: j */
    boolean f3809j = true;

    /* renamed from: j */
    public boolean mo5060j() {
        return this.f3809j;
    }

    /* renamed from: a */
    public float mo5051a() {
        return this.f3806g[0];
    }

    /* renamed from: b */
    public float mo5052b() {
        return this.f3806g[1];
    }

    /* renamed from: c */
    public float mo5053c() {
        return this.f3806g[2];
    }

    /* renamed from: d */
    public float mo5054d() {
        return this.f3807h[0];
    }

    /* renamed from: e */
    public float mo5055e() {
        return this.f3807h[1];
    }

    /* renamed from: f */
    public float mo5056f() {
        return this.f3807h[2];
    }

    /* renamed from: g */
    public float mo5057g() {
        return this.f3808i[0];
    }

    /* renamed from: h */
    public float mo5058h() {
        return this.f3808i[1];
    }

    /* renamed from: i */
    public float mo5059i() {
        return this.f3808i[2];
    }

    C0994c() {
        float[] fArr = new float[3];
        this.f3806g = fArr;
        float[] fArr2 = new float[3];
        this.f3807h = fArr2;
        m4882a(fArr);
        m4882a(fArr2);
        m4887l();
    }

    /* renamed from: l */
    private void m4887l() {
        float[] fArr = this.f3808i;
        fArr[0] = 0.24f;
        fArr[1] = 0.52f;
        fArr[2] = 0.24f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo5061k() {
        int length = this.f3808i.length;
        float f = BitmapDescriptorFactory.HUE_RED;
        for (int i = 0; i < length; i++) {
            float f2 = this.f3808i[i];
            if (f2 > BitmapDescriptorFactory.HUE_RED) {
                f += f2;
            }
        }
        if (f != BitmapDescriptorFactory.HUE_RED) {
            int length2 = this.f3808i.length;
            for (int i2 = 0; i2 < length2; i2++) {
                float[] fArr = this.f3808i;
                if (fArr[i2] > BitmapDescriptorFactory.HUE_RED) {
                    fArr[i2] = fArr[i2] / f;
                }
            }
        }
    }

    static {
        C0994c cVar = new C0994c();
        f3800a = cVar;
        m4884c(cVar);
        m4885d(cVar);
        C0994c cVar2 = new C0994c();
        f3801b = cVar2;
        m4883b(cVar2);
        m4885d(cVar2);
        C0994c cVar3 = new C0994c();
        f3802c = cVar3;
        m4881a(cVar3);
        m4885d(cVar3);
        C0994c cVar4 = new C0994c();
        f3803d = cVar4;
        m4884c(cVar4);
        m4886e(cVar4);
        C0994c cVar5 = new C0994c();
        f3804e = cVar5;
        m4883b(cVar5);
        m4886e(cVar5);
        C0994c cVar6 = new C0994c();
        f3805f = cVar6;
        m4881a(cVar6);
        m4886e(cVar6);
    }

    /* renamed from: a */
    private static void m4881a(C0994c cVar) {
        float[] fArr = cVar.f3807h;
        fArr[1] = 0.26f;
        fArr[2] = 0.45f;
    }

    /* renamed from: c */
    private static void m4884c(C0994c cVar) {
        float[] fArr = cVar.f3807h;
        fArr[0] = 0.55f;
        fArr[1] = 0.74f;
    }

    /* renamed from: d */
    private static void m4885d(C0994c cVar) {
        float[] fArr = cVar.f3806g;
        fArr[0] = 0.35f;
        fArr[1] = 1.0f;
    }

    /* renamed from: e */
    private static void m4886e(C0994c cVar) {
        float[] fArr = cVar.f3806g;
        fArr[1] = 0.3f;
        fArr[2] = 0.4f;
    }

    /* renamed from: a */
    private static void m4882a(float[] fArr) {
        fArr[0] = 0.0f;
        fArr[1] = 0.5f;
        fArr[2] = 1.0f;
    }

    /* renamed from: b */
    private static void m4883b(C0994c cVar) {
        float[] fArr = cVar.f3807h;
        fArr[0] = 0.3f;
        fArr[1] = 0.5f;
        fArr[2] = 0.7f;
    }
}
