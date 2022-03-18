package com.google.android.material.shape;

/* renamed from: com.google.android.material.shape.g */
public final class C22393g extends C22392f {

    /* renamed from: a */
    private final float f54914a;

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.shape.C22392f
    /* renamed from: f */
    public boolean mo77999f() {
        return true;
    }

    public C22393g(float f) {
        this.f54914a = f - 0.001f;
    }

    @Override // com.google.android.material.shape.C22392f
    /* renamed from: a */
    public void mo76588a(float f, float f2, float f3, C22405n nVar) {
        float sqrt = (float) ((((double) this.f54914a) * Math.sqrt(2.0d)) / 2.0d);
        float sqrt2 = (float) Math.sqrt(Math.pow((double) this.f54914a, 2.0d) - Math.pow((double) sqrt, 2.0d));
        nVar.mo78043a(f2 - sqrt, ((float) (-((((double) this.f54914a) * Math.sqrt(2.0d)) - ((double) this.f54914a)))) + sqrt2);
        nVar.mo78049b(f2, (float) (-((((double) this.f54914a) * Math.sqrt(2.0d)) - ((double) this.f54914a))));
        nVar.mo78049b(f2 + sqrt, ((float) (-((((double) this.f54914a) * Math.sqrt(2.0d)) - ((double) this.f54914a)))) + sqrt2);
    }
}
