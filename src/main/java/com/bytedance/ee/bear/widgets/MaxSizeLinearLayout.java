package com.bytedance.ee.bear.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class MaxSizeLinearLayout extends LinearLayout {

    /* renamed from: a */
    private C11832d f31779a;

    public int getMaxHeight() {
        return this.f31779a.mo45338b();
    }

    public int getMaxWidth() {
        return this.f31779a.mo45335a();
    }

    public MaxSizeLinearLayout(Context context) {
        super(context);
        m48968a(null);
    }

    /* renamed from: a */
    private void m48968a(AttributeSet attributeSet) {
        this.f31779a = new C11832d(this, attributeSet);
    }

    public void setEnableMaxHeight(boolean z) {
        this.f31779a.mo45340b(z);
    }

    public void setEnableMaxWidth(boolean z) {
        this.f31779a.mo45337a(z);
    }

    public void setMaxHeight(int i) {
        this.f31779a.mo45339b(i);
    }

    public void setMaxWidth(int i) {
        this.f31779a.mo45336a(i);
    }

    public MaxSizeLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m48968a(attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(this.f31779a.mo45341c(i), this.f31779a.mo45342d(i2));
    }

    public MaxSizeLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m48968a(attributeSet);
    }
}
