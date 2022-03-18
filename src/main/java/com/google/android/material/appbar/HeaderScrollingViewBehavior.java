package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.p028b.C0745a;
import androidx.core.view.C0883ab;
import androidx.core.view.C0904f;
import androidx.core.view.ViewCompat;
import java.util.List;

/* access modifiers changed from: package-private */
public abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior<View> {

    /* renamed from: a */
    final Rect f53853a = new Rect();

    /* renamed from: b */
    final Rect f53854b = new Rect();

    /* renamed from: c */
    private int f53855c = 0;

    /* renamed from: d */
    private int f53856d;

    /* renamed from: b */
    private static int m79771b(int i) {
        if (i == 0) {
            return 8388659;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public float mo76395a(View view) {
        return 1.0f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo76468a() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract View mo76398b(List<View> list);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final int mo76469b() {
        return this.f53855c;
    }

    /* renamed from: c */
    public final int mo76470c() {
        return this.f53856d;
    }

    public HeaderScrollingViewBehavior() {
    }

    /* renamed from: a */
    public final void mo76467a(int i) {
        this.f53856d = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo76397b(View view) {
        return view.getMeasuredHeight();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final int mo76471c(View view) {
        if (this.f53856d == 0) {
            return 0;
        }
        float a = mo76395a(view);
        int i = this.f53856d;
        return C0745a.m3627a((int) (a * ((float) i)), 0, i);
    }

    public HeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    @Override // com.google.android.material.appbar.ViewOffsetBehavior
    public void layoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        View b = mo76398b(coordinatorLayout.mo3950c(view));
        if (b != null) {
            CoordinatorLayout.LayoutParams layoutParams = (CoordinatorLayout.LayoutParams) view.getLayoutParams();
            Rect rect = this.f53853a;
            rect.set(coordinatorLayout.getPaddingLeft() + layoutParams.leftMargin, b.getBottom() + layoutParams.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - layoutParams.rightMargin, ((coordinatorLayout.getHeight() + b.getBottom()) - coordinatorLayout.getPaddingBottom()) - layoutParams.bottomMargin);
            C0883ab lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && ViewCompat.m4109x(coordinatorLayout) && !ViewCompat.m4109x(view)) {
                rect.left += lastWindowInsets.mo4642a();
                rect.right -= lastWindowInsets.mo4646c();
            }
            Rect rect2 = this.f53854b;
            C0904f.m4352a(m79771b(layoutParams.gravity), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int c = mo76471c(b);
            view.layout(rect2.left, rect2.top - c, rect2.right, rect2.bottom - c);
            this.f53855c = rect2.top - b.getBottom();
            return;
        }
        super.layoutChild(coordinatorLayout, view, i);
        this.f53855c = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        View b;
        int i5;
        C0883ab lastWindowInsets;
        int i6 = view.getLayoutParams().height;
        if ((i6 != -1 && i6 != -2) || (b = mo76398b(coordinatorLayout.mo3950c(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (ViewCompat.m4109x(b) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.mo4644b() + lastWindowInsets.mo4647d();
        }
        int b2 = size + mo76397b(b);
        int measuredHeight = b.getMeasuredHeight();
        if (mo76468a()) {
            view.setTranslationY((float) (-measuredHeight));
        } else {
            b2 -= measuredHeight;
        }
        if (i6 == -1) {
            i5 = 1073741824;
        } else {
            i5 = Integer.MIN_VALUE;
        }
        coordinatorLayout.mo3940a(view, i, i2, View.MeasureSpec.makeMeasureSpec(b2, i5), i4);
        return true;
    }
}
