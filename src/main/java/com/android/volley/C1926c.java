package com.android.volley;

/* renamed from: com.android.volley.c */
public class C1926c implements AbstractC1940l {

    /* renamed from: a */
    private int f6580a;

    /* renamed from: b */
    private int f6581b;

    /* renamed from: c */
    private final int f6582c;

    /* renamed from: d */
    private final float f6583d;

    @Override // com.android.volley.AbstractC1940l
    /* renamed from: a */
    public int mo9790a() {
        return this.f6580a;
    }

    @Override // com.android.volley.AbstractC1940l
    /* renamed from: b */
    public int mo9792b() {
        return this.f6581b;
    }

    public C1926c() {
        this(2500, 1, 1.0f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo9793c() {
        if (this.f6581b <= this.f6582c) {
            return true;
        }
        return false;
    }

    @Override // com.android.volley.AbstractC1940l
    /* renamed from: a */
    public void mo9791a(VolleyError volleyError) throws VolleyError {
        this.f6581b++;
        int i = this.f6580a;
        this.f6580a = i + ((int) (((float) i) * this.f6583d));
        if (!mo9793c()) {
            throw volleyError;
        }
    }

    public C1926c(int i, int i2, float f) {
        this.f6580a = i;
        this.f6582c = i2;
        this.f6583d = f;
    }
}
