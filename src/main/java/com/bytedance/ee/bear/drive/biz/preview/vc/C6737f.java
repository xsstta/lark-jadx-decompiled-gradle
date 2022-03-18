package com.bytedance.ee.bear.drive.biz.preview.vc;

import android.content.Context;
import androidx.recyclerview.widget.LinearSmoothScroller;

/* renamed from: com.bytedance.ee.bear.drive.biz.preview.vc.f */
public class C6737f extends LinearSmoothScroller {

    /* renamed from: a */
    private int f18340a;

    /* access modifiers changed from: protected */
    @Override // androidx.recyclerview.widget.LinearSmoothScroller
    public int getVerticalSnapPreference() {
        return -1;
    }

    public C6737f(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void mo26508a(int i) {
        this.f18340a = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
    public void setTargetPosition(int i) {
        super.setTargetPosition(i);
    }

    @Override // androidx.recyclerview.widget.LinearSmoothScroller
    public int calculateDtToFit(int i, int i2, int i3, int i4, int i5) {
        if (i < i3) {
            return (i3 - i) + this.f18340a;
        }
        if (i > i3) {
            return (this.f18340a + i3) - i;
        }
        return this.f18340a;
    }
}
