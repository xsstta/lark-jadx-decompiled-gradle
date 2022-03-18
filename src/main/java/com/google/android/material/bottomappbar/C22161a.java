package com.google.android.material.bottomappbar;

import com.google.android.material.shape.C22392f;
import com.google.android.material.shape.C22405n;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;

/* renamed from: com.google.android.material.bottomappbar.a */
public class C22161a extends C22392f implements Cloneable {

    /* renamed from: a */
    private float f53959a;

    /* renamed from: b */
    private float f53960b;

    /* renamed from: c */
    private float f53961c;

    /* renamed from: d */
    private float f53962d;

    /* renamed from: e */
    private float f53963e = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: a */
    public float mo76586a() {
        return this.f53961c;
    }

    /* renamed from: b */
    public float mo76589b() {
        return this.f53963e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public float mo76591c() {
        return this.f53962d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public float mo76593d() {
        return this.f53960b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public float mo76595e() {
        return this.f53959a;
    }

    /* renamed from: a */
    public void mo76587a(float f) {
        this.f53961c = f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo76590b(float f) {
        this.f53963e = f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo76594d(float f) {
        this.f53960b = f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo76596e(float f) {
        this.f53959a = f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo76592c(float f) {
        if (f >= BitmapDescriptorFactory.HUE_RED) {
            this.f53962d = f;
            return;
        }
        throw new IllegalArgumentException("cradleVerticalOffset must be positive.");
    }

    public C22161a(float f, float f2, float f3) {
        this.f53960b = f;
        this.f53959a = f2;
        mo76592c(f3);
    }

    @Override // com.google.android.material.shape.C22392f
    /* renamed from: a */
    public void mo76588a(float f, float f2, float f3, C22405n nVar) {
        float f4 = this.f53961c;
        if (f4 == BitmapDescriptorFactory.HUE_RED) {
            nVar.mo78049b(f, BitmapDescriptorFactory.HUE_RED);
            return;
        }
        float f5 = ((this.f53960b * 2.0f) + f4) / 2.0f;
        float f6 = f3 * this.f53959a;
        float f7 = f2 + this.f53963e;
        float f8 = (this.f53962d * f3) + ((1.0f - f3) * f5);
        if (f8 / f5 >= 1.0f) {
            nVar.mo78049b(f, BitmapDescriptorFactory.HUE_RED);
            return;
        }
        float f9 = f5 + f6;
        float f10 = f8 + f6;
        float sqrt = (float) Math.sqrt((double) ((f9 * f9) - (f10 * f10)));
        float f11 = f7 - sqrt;
        float f12 = f7 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan((double) (sqrt / f10)));
        float f13 = 90.0f - degrees;
        nVar.mo78049b(f11, BitmapDescriptorFactory.HUE_RED);
        float f14 = f6 * 2.0f;
        nVar.mo78045a(f11 - f6, BitmapDescriptorFactory.HUE_RED, f11 + f6, f14, 270.0f, degrees);
        nVar.mo78045a(f7 - f5, (-f5) - f8, f7 + f5, f5 - f8, 180.0f - f13, (f13 * 2.0f) - 180.0f);
        nVar.mo78045a(f12 - f6, BitmapDescriptorFactory.HUE_RED, f12 + f6, f14, 270.0f - degrees, degrees);
        nVar.mo78049b(f, BitmapDescriptorFactory.HUE_RED);
    }
}
