package com.lynx.tasm.p1225c.p1226a;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;

/* access modifiers changed from: package-private */
/* renamed from: com.lynx.tasm.c.a.g */
public class C26868g extends AbstractC26862a {

    /* renamed from: a */
    private RenderNode f66711a;

    C26868g() {
    }

    @Override // com.lynx.tasm.p1225c.p1226a.AbstractC26862a
    /* renamed from: d */
    public boolean mo95620d() {
        return this.f66711a.hasDisplayList();
    }

    /* access modifiers changed from: package-private */
    @Override // com.lynx.tasm.p1225c.p1226a.AbstractC26862a
    /* renamed from: c */
    public void mo95619c() {
        this.f66711a = new RenderNode("");
    }

    @Override // com.lynx.tasm.p1225c.p1226a.AbstractC26862a
    /* renamed from: b */
    public void mo95618b(Canvas canvas) {
        this.f66711a.endRecording();
    }

    @Override // com.lynx.tasm.p1225c.p1226a.AbstractC26862a
    /* renamed from: a */
    public void mo95617a(Canvas canvas) {
        ((RecordingCanvas) canvas).drawRenderNode(this.f66711a);
    }

    /* renamed from: b */
    public RecordingCanvas mo95615a(int i, int i2) {
        return this.f66711a.beginRecording();
    }

    @Override // com.lynx.tasm.p1225c.p1226a.AbstractC26862a
    /* renamed from: a */
    public void mo95616a(int i, int i2, int i3, int i4) {
        this.f66711a.setPosition(i, i2, i3, i4);
    }
}
