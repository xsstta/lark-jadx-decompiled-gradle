package com.lynx.tasm.p1225c.p1226a;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.DisplayList;
import android.view.HardwareCanvas;

/* access modifiers changed from: package-private */
/* renamed from: com.lynx.tasm.c.a.c */
public class C26864c extends C26863b {
    C26864c() {
    }

    @Override // com.lynx.tasm.p1225c.p1226a.C26863b, com.lynx.tasm.p1225c.p1226a.AbstractC26862a
    /* renamed from: d */
    public boolean mo95620d() {
        return this.f66706g.isValid();
    }

    /* access modifiers changed from: package-private */
    @Override // com.lynx.tasm.p1225c.p1226a.C26863b, com.lynx.tasm.p1225c.p1226a.AbstractC26862a
    /* renamed from: c */
    public void mo95619c() {
        try {
            if (this.f66707h == null) {
                this.f66707h = Class.forName("android.view.GLES20DisplayList").getDeclaredConstructor(String.class);
                this.f66707h.setAccessible(true);
            }
            this.f66706g = (DisplayList) this.f66707h.newInstance("");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.lynx.tasm.p1225c.p1226a.C26863b, com.lynx.tasm.p1225c.p1226a.AbstractC26862a
    /* renamed from: a */
    public void mo95617a(Canvas canvas) {
        ((HardwareCanvas) canvas).drawDisplayList(this.f66706g, (Rect) null, 1);
    }

    @Override // com.lynx.tasm.p1225c.p1226a.C26863b, com.lynx.tasm.p1225c.p1226a.AbstractC26862a
    /* renamed from: b */
    public void mo95618b(Canvas canvas) {
        ((HardwareCanvas) canvas).onPostDraw();
        this.f66706g.end();
        this.f66706g.setCaching(true);
        this.f66706g.setLeftTopRightBottom(this.f66700a, this.f66701b, this.f66702c, this.f66703d);
    }

    @Override // com.lynx.tasm.p1225c.p1226a.C26863b, com.lynx.tasm.p1225c.p1226a.AbstractC26862a
    /* renamed from: a */
    public Canvas mo95615a(int i, int i2) {
        HardwareCanvas start = this.f66706g.start();
        mo95621a(i, i2, start);
        start.onPreDraw((Rect) null);
        return start;
    }
}
