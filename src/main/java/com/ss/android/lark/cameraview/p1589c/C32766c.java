package com.ss.android.lark.cameraview.p1589c;

import android.content.Context;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.ss.android.lark.cameraview.C32743b;
import com.ss.android.lark.cameraview.p1591e.AbstractC32787a;

/* renamed from: com.ss.android.lark.cameraview.c.c */
public class C32766c implements AbstractC32770e {

    /* renamed from: a */
    private Context f84087a;

    /* renamed from: b */
    private AbstractC32770e f84088b = this.f84090d;

    /* renamed from: c */
    private AbstractC32787a f84089c;

    /* renamed from: d */
    private AbstractC32770e f84090d = new C32767d(this);

    /* renamed from: e */
    private AbstractC32770e f84091e = new C32764a(this);

    /* renamed from: f */
    private AbstractC32770e f84092f = new C32765b(this);

    /* renamed from: c */
    public AbstractC32787a mo120743c() {
        return this.f84089c;
    }

    /* renamed from: d */
    public Context mo120744d() {
        return this.f84087a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public AbstractC32770e mo120745e() {
        return this.f84091e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public AbstractC32770e mo120746f() {
        return this.f84092f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public AbstractC32770e mo120747g() {
        return this.f84090d;
    }

    @Override // com.ss.android.lark.cameraview.p1589c.AbstractC32770e
    /* renamed from: a */
    public void mo120733a() {
        this.f84088b.mo120733a();
    }

    @Override // com.ss.android.lark.cameraview.p1589c.AbstractC32770e
    /* renamed from: b */
    public void mo120739b() {
        this.f84088b.mo120739b();
    }

    /* renamed from: a */
    public void mo120742a(AbstractC32770e eVar) {
        this.f84088b = eVar;
    }

    @Override // com.ss.android.lark.cameraview.p1589c.AbstractC32770e
    /* renamed from: c */
    public void mo120741c(SurfaceHolder surfaceHolder, float f) {
        this.f84088b.mo120741c(surfaceHolder, f);
    }

    @Override // com.ss.android.lark.cameraview.p1589c.AbstractC32770e
    /* renamed from: b */
    public void mo120740b(SurfaceHolder surfaceHolder, float f) {
        this.f84088b.mo120740b(surfaceHolder, f);
    }

    @Override // com.ss.android.lark.cameraview.p1589c.AbstractC32770e
    /* renamed from: a */
    public void mo120735a(float f, int i) {
        this.f84088b.mo120735a(f, i);
    }

    @Override // com.ss.android.lark.cameraview.p1589c.AbstractC32770e
    /* renamed from: a */
    public void mo120738a(SurfaceHolder surfaceHolder, float f) {
        this.f84088b.mo120738a(surfaceHolder, f);
    }

    public C32766c(Context context, AbstractC32787a aVar, C32743b.AbstractC32747a aVar2) {
        this.f84087a = context;
        this.f84089c = aVar;
    }

    @Override // com.ss.android.lark.cameraview.p1589c.AbstractC32770e
    /* renamed from: a */
    public void mo120736a(Context context, Surface surface, float f) {
        this.f84088b.mo120736a(context, surface, f);
    }

    @Override // com.ss.android.lark.cameraview.p1589c.AbstractC32770e
    /* renamed from: a */
    public void mo120737a(Context context, boolean z, long j) {
        this.f84088b.mo120737a(context, z, j);
    }

    @Override // com.ss.android.lark.cameraview.p1589c.AbstractC32770e
    /* renamed from: a */
    public void mo120734a(float f, float f2, int i, int i2, C32743b.AbstractC32749c cVar) {
        this.f84088b.mo120734a(f, f2, i, i2, cVar);
    }
}
