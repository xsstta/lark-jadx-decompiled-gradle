package com.lynx.tasm.p1225c.p1226a;

import android.graphics.Canvas;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import android.view.View;

/* access modifiers changed from: package-private */
/* renamed from: com.lynx.tasm.c.a.f */
public class C26867f extends AbstractC26862a {

    /* renamed from: a */
    private RenderNode f66710a;

    C26867f() {
    }

    @Override // com.lynx.tasm.p1225c.p1226a.AbstractC26862a
    /* renamed from: d */
    public boolean mo95620d() {
        return this.f66710a.isValid();
    }

    /* access modifiers changed from: package-private */
    @Override // com.lynx.tasm.p1225c.p1226a.AbstractC26862a
    /* renamed from: c */
    public void mo95619c() {
        this.f66710a = RenderNode.create("", (View) null);
    }

    @Override // com.lynx.tasm.p1225c.p1226a.AbstractC26862a
    /* renamed from: b */
    public void mo95618b(Canvas canvas) {
        this.f66710a.end((DisplayListCanvas) canvas);
    }

    @Override // com.lynx.tasm.p1225c.p1226a.AbstractC26862a
    /* renamed from: a */
    public void mo95617a(Canvas canvas) {
        ((DisplayListCanvas) canvas).drawRenderNode(this.f66710a);
    }

    /* renamed from: b */
    public DisplayListCanvas mo95615a(int i, int i2) {
        return this.f66710a.start(i, i2);
    }

    @Override // com.lynx.tasm.p1225c.p1226a.AbstractC26862a
    /* renamed from: a */
    public void mo95616a(int i, int i2, int i3, int i4) {
        this.f66710a.setLeftTopRightBottom(i, i2, i3, i4);
    }
}
