package com.bytedance.ee.bear.sheet.tab.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.LinearLayout;
import androidx.core.view.NestedScrollingParent;
import androidx.recyclerview.widget.RecyclerView;

public class ElasticLinearLayout extends LinearLayout implements NestedScrollingParent {

    /* renamed from: a */
    public boolean f30416a;

    /* renamed from: b */
    private View f30417b;

    /* renamed from: c */
    private Animation f30418c;

    @Override // androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return 1;
    }

    @Override // androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return false;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        clearAnimation();
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f30417b = getChildAt(0);
    }

    /* renamed from: com.bytedance.ee.bear.sheet.tab.view.ElasticLinearLayout$a */
    private class C11312a extends Animation {

        /* renamed from: b */
        private float f30420b;

        /* renamed from: c */
        private float f30421c;

        private C11312a() {
            this.f30421c = 1.0f;
            ElasticLinearLayout.this.f30416a = true;
        }

        /* access modifiers changed from: protected */
        public void applyTransformation(float f, Transformation transformation) {
            float f2 = this.f30421c;
            float f3 = this.f30420b;
            float f4 = ((f2 - f3) * f) + f3;
            ElasticLinearLayout elasticLinearLayout = ElasticLinearLayout.this;
            elasticLinearLayout.scrollBy((int) (((float) (0 - elasticLinearLayout.getScrollX())) * f4), 0);
            if (f4 == 1.0f) {
                ElasticLinearLayout.this.f30416a = false;
            }
        }

        public void initialize(int i, int i2, int i3, int i4) {
            super.initialize(i, i2, i3, i4);
            setDuration(260);
            setInterpolator(new AccelerateInterpolator());
        }
    }

    @Override // androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(View view) {
        if (this.f30418c == null) {
            this.f30418c = new C11312a();
        }
        startAnimation(this.f30418c);
    }

    public ElasticLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f30417b.getLayoutParams().width = getMeasuredWidth();
    }

    public void scrollTo(int i, int i2) {
        if (i > 600) {
            i = 600;
        }
        super.scrollTo(i, i2);
    }

    @Override // androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        if (getScrollX() != 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        if (!(view2 instanceof RecyclerView) || this.f30416a) {
            return false;
        }
        return true;
    }

    @Override // androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        getParent().requestDisallowInterceptTouchEvent(true);
        if (i <= 0 || getScrollX() >= 0 || view.canScrollHorizontally(-1)) {
            z = false;
        } else {
            z = true;
        }
        if (i >= 0 || view.canScrollHorizontally(-1)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (i >= 0 || getScrollX() <= 0 || view.canScrollHorizontally(1)) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (i <= 0 || view.canScrollHorizontally(1)) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z || z2 || z3 || z4) {
            scrollBy(i / 3, 0);
            iArr[0] = i;
        }
        if (i > 0 && getScrollX() > 0 && !view.canScrollHorizontally(-1)) {
            scrollTo(0, 0);
        }
        if (i < 0 && getScrollX() < 0 && !view.canScrollHorizontally(1)) {
            scrollTo(0, 0);
        }
    }
}
