package com.lynx.tasm.p1225c.p1226a;

import android.graphics.Canvas;
import android.view.HardwareCanvas;
import android.view.RenderNode;
import android.view.View;
import java.lang.reflect.Method;

/* access modifiers changed from: package-private */
/* renamed from: com.lynx.tasm.c.a.e */
public class C26866e extends AbstractC26862a {

    /* renamed from: b */
    private static Method f66708b;

    /* renamed from: a */
    private RenderNode f66709a;

    C26866e() {
    }

    @Override // com.lynx.tasm.p1225c.p1226a.AbstractC26862a
    /* renamed from: d */
    public boolean mo95620d() {
        return this.f66709a.isValid();
    }

    /* access modifiers changed from: package-private */
    @Override // com.lynx.tasm.p1225c.p1226a.AbstractC26862a
    /* renamed from: c */
    public void mo95619c() {
        this.f66709a = RenderNode.create("", (View) null);
    }

    @Override // com.lynx.tasm.p1225c.p1226a.AbstractC26862a
    /* renamed from: b */
    public void mo95618b(Canvas canvas) {
        this.f66709a.end((HardwareCanvas) canvas);
    }

    @Override // com.lynx.tasm.p1225c.p1226a.AbstractC26862a
    /* renamed from: a */
    public void mo95617a(Canvas canvas) {
        ((HardwareCanvas) canvas).drawRenderNode(this.f66709a);
    }

    /* renamed from: b */
    public HardwareCanvas mo95615a(int i, int i2) {
        try {
            if (f66708b == null) {
                Method declaredMethod = RenderNode.class.getDeclaredMethod("start", Integer.TYPE, Integer.TYPE);
                f66708b = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            return (HardwareCanvas) f66708b.invoke(this.f66709a, Integer.valueOf(i), Integer.valueOf(i2));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.lynx.tasm.p1225c.p1226a.AbstractC26862a
    /* renamed from: a */
    public void mo95616a(int i, int i2, int i3, int i4) {
        this.f66709a.setLeftTopRightBottom(i, i2, i3, i4);
    }
}
