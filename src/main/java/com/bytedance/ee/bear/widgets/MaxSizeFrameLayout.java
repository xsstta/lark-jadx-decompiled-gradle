package com.bytedance.ee.bear.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class MaxSizeFrameLayout extends FrameLayout {

    /* renamed from: a */
    private C11832d f31778a;

    public int getMaxHeight() {
        return this.f31778a.mo45338b();
    }

    public int getMaxWidth() {
        return this.f31778a.mo45335a();
    }

    public MaxSizeFrameLayout(Context context) {
        super(context);
        m48967a(null);
    }

    /* renamed from: a */
    private void m48967a(AttributeSet attributeSet) {
        this.f31778a = new C11832d(this, attributeSet);
    }

    public void setEnableMaxHeight(boolean z) {
        this.f31778a.mo45340b(z);
    }

    public void setEnableMaxWidth(boolean z) {
        this.f31778a.mo45337a(z);
    }

    public void setMaxHeight(int i) {
        this.f31778a.mo45339b(i);
    }

    public void setMaxWidth(int i) {
        this.f31778a.mo45336a(i);
    }

    public MaxSizeFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m48967a(attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(this.f31778a.mo45341c(i), this.f31778a.mo45342d(i2));
    }

    public MaxSizeFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m48967a(attributeSet);
    }
}
