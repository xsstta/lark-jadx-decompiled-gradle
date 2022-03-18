package com.google.android.material.shape;

/* renamed from: com.google.android.material.shape.i */
public final class C22395i extends C22392f {

    /* renamed from: a */
    private final C22392f f54915a;

    /* renamed from: b */
    private final float f54916b;

    /* access modifiers changed from: package-private */
    @Override // com.google.android.material.shape.C22392f
    /* renamed from: f */
    public boolean mo77999f() {
        return this.f54915a.mo77999f();
    }

    public C22395i(C22392f fVar, float f) {
        this.f54915a = fVar;
        this.f54916b = f;
    }

    @Override // com.google.android.material.shape.C22392f
    /* renamed from: a */
    public void mo76588a(float f, float f2, float f3, C22405n nVar) {
        this.f54915a.mo76588a(f, f2 - this.f54916b, f3, nVar);
    }
}
