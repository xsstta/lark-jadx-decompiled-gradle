package com.bytedance.ee.bear.shadow;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class ShadowLinearLayout extends LinearLayout implements IShadowLayout {

    /* renamed from: a */
    private C10963a f29467a;

    public int getHideRadiusSide() {
        return this.f29467a.mo41639d();
    }

    public int getRadius() {
        return this.f29467a.mo41641e();
    }

    public float getShadowAlpha() {
        return this.f29467a.mo41633b();
    }

    public int getShadowColor() {
        return this.f29467a.mo41637c();
    }

    public int getShadowElevation() {
        return this.f29467a.mo41623a();
    }

    public void setHideRadiusSide(int i) {
        this.f29467a.mo41638c(i);
    }

    public void setOuterNormalColor(int i) {
        this.f29467a.mo41652m(i);
    }

    public void setOutlineExcludePadding(boolean z) {
        this.f29467a.mo41632a(z);
    }

    public void setRadius(int i) {
        this.f29467a.mo41640d(i);
    }

    public void setShadowAlpha(float f) {
        this.f29467a.mo41625a(f);
    }

    public void setShadowColor(int i) {
        this.f29467a.mo41635b(i);
    }

    public void setShadowElevation(int i) {
        this.f29467a.mo41626a(i);
    }

    public ShadowLinearLayout(Context context) {
        super(context);
        m45505a(context, null, 0);
    }

    public void setBorderColor(int i) {
        this.f29467a.mo41650k(i);
        invalidate();
    }

    public void setBorderWidth(int i) {
        this.f29467a.mo41651l(i);
        invalidate();
    }

    public void setBottomDividerAlpha(int i) {
        this.f29467a.mo41643f(i);
        invalidate();
    }

    public void setLeftDividerAlpha(int i) {
        this.f29467a.mo41646g(i);
        invalidate();
    }

    public void setRightDividerAlpha(int i) {
        this.f29467a.mo41647h(i);
        invalidate();
    }

    public void setShowBorderOnlyBeforeL(boolean z) {
        this.f29467a.mo41636b(z);
        invalidate();
    }

    public void setTopDividerAlpha(int i) {
        this.f29467a.mo41642e(i);
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.f29467a.mo41631a(canvas, getWidth(), getHeight());
        this.f29467a.mo41630a(canvas);
    }

    public ShadowLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m45505a(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3 = this.f29467a.mo41648i(i);
        int j = this.f29467a.mo41649j(i2);
        super.onMeasure(i3, j);
        int a = this.f29467a.mo41624a(i3, getMeasuredWidth());
        int b = this.f29467a.mo41634b(j, getMeasuredHeight());
        if (i3 != a || j != b) {
            super.onMeasure(a, b);
        }
    }

    /* renamed from: a */
    private void m45505a(Context context, AttributeSet attributeSet, int i) {
        this.f29467a = new C10963a(context, attributeSet, i, this);
    }

    public ShadowLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m45505a(context, attributeSet, i);
    }
}
