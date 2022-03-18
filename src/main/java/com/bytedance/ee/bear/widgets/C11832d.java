package com.bytedance.ee.bear.widgets;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.larksuite.suite.R;

/* renamed from: com.bytedance.ee.bear.widgets.d */
public class C11832d {

    /* renamed from: a */
    private View f31900a;

    /* renamed from: b */
    private int f31901b = -1;

    /* renamed from: c */
    private int f31902c = -1;

    /* renamed from: d */
    private boolean f31903d = true;

    /* renamed from: e */
    private boolean f31904e = true;

    /* renamed from: a */
    public int mo45335a() {
        return this.f31901b;
    }

    /* renamed from: b */
    public int mo45338b() {
        return this.f31902c;
    }

    /* renamed from: a */
    public void mo45336a(int i) {
        if (this.f31901b != i) {
            this.f31901b = i;
            this.f31900a.requestLayout();
        }
    }

    /* renamed from: b */
    public void mo45339b(int i) {
        if (this.f31902c != i) {
            this.f31902c = i;
            this.f31900a.requestLayout();
        }
    }

    /* renamed from: c */
    public int mo45341c(int i) {
        return m49078a(i, this.f31903d, this.f31901b, "width");
    }

    /* renamed from: d */
    public int mo45342d(int i) {
        return m49078a(i, this.f31904e, this.f31902c, "height");
    }

    /* renamed from: a */
    public void mo45337a(boolean z) {
        if (this.f31903d != z) {
            this.f31903d = z;
            this.f31900a.requestLayout();
        }
    }

    /* renamed from: b */
    public void mo45340b(boolean z) {
        if (this.f31904e != z) {
            this.f31904e = z;
            this.f31900a.requestLayout();
        }
    }

    C11832d(View view, AttributeSet attributeSet) {
        this.f31900a = view;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.maxHeight, R.attr.maxWidth});
            this.f31901b = obtainStyledAttributes.getDimensionPixelSize(1, -1);
            this.f31902c = obtainStyledAttributes.getDimensionPixelSize(0, -1);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: a */
    private int m49078a(int i, boolean z, int i2, String str) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (!z || i2 < 0) {
            return i;
        }
        if (mode == Integer.MIN_VALUE) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(i2, size), Integer.MIN_VALUE);
        }
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(i2, size), 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec(i2, Integer.MIN_VALUE);
    }
}
