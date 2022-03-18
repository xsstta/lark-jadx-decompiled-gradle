package com.lynx.tasm.behavior.shadow;

public class LayoutNode {

    /* renamed from: a */
    private long f66084a;

    /* renamed from: b */
    private boolean f66085b;

    /* renamed from: c */
    private boolean f66086c = true;

    /* renamed from: d */
    private AbstractC26703d f66087d;

    /* renamed from: e */
    private C26708i f66088e;

    private native boolean nativeIsDirty(long j);

    private native void nativeMarkDirty(long j);

    private native void nativeSetMeasureFunc(long j);

    /* renamed from: c */
    public void mo94786c() {
    }

    /* access modifiers changed from: package-private */
    public native int nativeGetFlexDirection(long j);

    /* access modifiers changed from: package-private */
    public native float nativeGetHeight(long j);

    /* access modifiers changed from: package-private */
    public native int[] nativeGetMargin(long j);

    /* access modifiers changed from: package-private */
    public native int[] nativeGetPadding(long j);

    /* access modifiers changed from: package-private */
    public native float nativeGetWidth(long j);

    /* renamed from: e */
    public C26708i mo94788e() {
        return this.f66088e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public long mo94789f() {
        return this.f66084a;
    }

    /* renamed from: d */
    public void mo94787d() {
        if (!this.f66086c) {
            this.f66086c = true;
            nativeMarkDirty(this.f66084a);
        }
    }

    /* renamed from: a */
    public void mo94784a(long j) {
        AbstractC26703d dVar;
        this.f66084a = j;
        this.f66088e = new C26708i(this);
        if (!this.f66085b && (dVar = this.f66087d) != null) {
            mo94785a(dVar);
        }
    }

    /* renamed from: a */
    public void mo94785a(AbstractC26703d dVar) {
        this.f66087d = dVar;
        long j = this.f66084a;
        if (j != 0) {
            this.f66085b = true;
            nativeSetMeasureFunc(j);
        }
    }

    /* renamed from: a */
    public void mo94783a(int i, int i2, int i3, int i4) {
        this.f66086c = false;
    }

    private long measure(float f, int i, float f2, int i2) {
        return this.f66087d.mo53284a(this, f, MeasureMode.fromInt(i), f2, MeasureMode.fromInt(i2));
    }
}
