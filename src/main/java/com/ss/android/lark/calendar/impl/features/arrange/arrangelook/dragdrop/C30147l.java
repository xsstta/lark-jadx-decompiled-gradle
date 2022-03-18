package com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop;

import android.graphics.Rect;
import com.ss.android.lark.calendar.impl.utils.ao;

/* renamed from: com.ss.android.lark.calendar.impl.features.arrange.arrangelook.dragdrop.l */
public class C30147l {

    /* renamed from: a */
    private Rect f75198a = new Rect();

    /* renamed from: a */
    public boolean mo108706a() {
        int a = ao.m125215a();
        if (this.f75198a.width() >= a || this.f75198a.height() >= a) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void mo108707b(float f, float f2) {
        m111659d(f, f2);
    }

    /* renamed from: c */
    public void mo108708c(float f, float f2) {
        m111659d(f, f2);
    }

    /* renamed from: a */
    public void mo108705a(float f, float f2) {
        this.f75198a.setEmpty();
        int i = (int) f;
        int i2 = (int) f2;
        this.f75198a.set(i, i2, i, i2);
    }

    /* renamed from: d */
    private void m111659d(float f, float f2) {
        Rect rect = this.f75198a;
        int i = (int) f2;
        rect.top = Math.min(rect.top, i);
        Rect rect2 = this.f75198a;
        rect2.bottom = Math.max(rect2.bottom, i);
        Rect rect3 = this.f75198a;
        int i2 = (int) f;
        rect3.left = Math.min(rect3.left, i2);
        Rect rect4 = this.f75198a;
        rect4.right = Math.max(rect4.right, i2);
    }
}
