package com.ss.android.lark.cameraview.p1589c;

import android.content.Context;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.ss.android.lark.cameraview.C32743b;
import com.ss.android.lark.cameraview.C32771d;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.cameraview.c.b */
public class C32765b implements AbstractC32770e {

    /* renamed from: a */
    private final String f84085a = "BorrowVideoState";

    /* renamed from: b */
    private C32766c f84086b;

    @Override // com.ss.android.lark.cameraview.p1589c.AbstractC32770e
    /* renamed from: a */
    public void mo120733a() {
    }

    @Override // com.ss.android.lark.cameraview.p1589c.AbstractC32770e
    /* renamed from: a */
    public void mo120734a(float f, float f2, int i, int i2, C32743b.AbstractC32749c cVar) {
    }

    @Override // com.ss.android.lark.cameraview.p1589c.AbstractC32770e
    /* renamed from: a */
    public void mo120736a(Context context, Surface surface, float f) {
    }

    @Override // com.ss.android.lark.cameraview.p1589c.AbstractC32770e
    /* renamed from: a */
    public void mo120737a(Context context, boolean z, long j) {
    }

    @Override // com.ss.android.lark.cameraview.p1589c.AbstractC32770e
    /* renamed from: b */
    public void mo120740b(SurfaceHolder surfaceHolder, float f) {
    }

    @Override // com.ss.android.lark.cameraview.p1589c.AbstractC32770e
    /* renamed from: b */
    public void mo120739b() {
        this.f84086b.mo120743c().mo120645b(2);
        C32766c cVar = this.f84086b;
        cVar.mo120742a(cVar.mo120747g());
    }

    public C32765b(C32766c cVar) {
        this.f84086b = cVar;
    }

    @Override // com.ss.android.lark.cameraview.p1589c.AbstractC32770e
    /* renamed from: a */
    public void mo120735a(float f, int i) {
        Log.m165379d("BorrowVideoState", "zoom");
    }

    @Override // com.ss.android.lark.cameraview.p1589c.AbstractC32770e
    /* renamed from: c */
    public void mo120741c(SurfaceHolder surfaceHolder, float f) {
        this.f84086b.mo120743c().mo120641a(2);
        C32766c cVar = this.f84086b;
        cVar.mo120742a(cVar.mo120747g());
    }

    @Override // com.ss.android.lark.cameraview.p1589c.AbstractC32770e
    /* renamed from: a */
    public void mo120738a(SurfaceHolder surfaceHolder, float f) {
        C32771d.m125799a().mo120700b(surfaceHolder, f);
        C32766c cVar = this.f84086b;
        cVar.mo120742a(cVar.mo120747g());
    }
}
