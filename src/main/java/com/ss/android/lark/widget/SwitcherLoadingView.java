package com.ss.android.lark.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.larksuite.suite.R;
import com.ss.android.lark.widget.spin.SpinView;

public class SwitcherLoadingView extends FrameLayout {

    /* renamed from: a */
    private FrameLayout f143430a;

    /* renamed from: b */
    private SpinView f143431b;

    /* renamed from: c */
    private ImageView f143432c;

    /* renamed from: d */
    private Drawable f143433d;

    /* renamed from: e */
    private Drawable f143434e;

    /* renamed from: f */
    private int f143435f;

    /* renamed from: g */
    private int f143436g;

    /* renamed from: h */
    private int f143437h;

    /* renamed from: i */
    private int f143438i;

    /* renamed from: j */
    private int f143439j;

    /* renamed from: k */
    private int f143440k;

    /* renamed from: l */
    private boolean f143441l = true;

    /* renamed from: m */
    private FrameLayout.LayoutParams f143442m;

    /* renamed from: b */
    private void m226092b() {
        setVisibility(8);
    }

    /* renamed from: a */
    public void mo197496a() {
        removeAllViews();
        setVisibility(8);
    }

    /* renamed from: d */
    private void m226094d() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f143431b.getLayoutParams();
        layoutParams.gravity = 17;
        layoutParams.width = this.f143435f;
        layoutParams.height = this.f143436g;
        this.f143431b.setLayoutParams(layoutParams);
    }

    /* renamed from: e */
    private void m226095e() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f143432c.getLayoutParams();
        layoutParams.width = this.f143437h;
        layoutParams.height = this.f143438i;
        this.f143432c.setLayoutParams(layoutParams);
    }

    /* renamed from: c */
    private void m226093c() {
        int i;
        int i2;
        int i3;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f143430a.getLayoutParams();
        if (this.f143441l) {
            i = 5;
        } else {
            i = 3;
        }
        layoutParams.gravity = i | 16;
        boolean z = this.f143441l;
        if (z) {
            i2 = this.f143439j;
        } else {
            i2 = 0;
        }
        if (z) {
            i3 = 0;
        } else {
            i3 = this.f143440k;
        }
        layoutParams.setMargins(i2, 2, i3, 0);
        this.f143430a.setLayoutParams(layoutParams);
    }

    /* renamed from: f */
    private void m226096f() {
        if (this.f143430a == null) {
            this.f143442m = new FrameLayout.LayoutParams(-2, -2);
            Resources resources = getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.switch_loading_spin_wh);
            this.f143436g = dimensionPixelSize;
            this.f143435f = dimensionPixelSize;
            int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.switch_loading_wh);
            this.f143438i = dimensionPixelOffset;
            this.f143437h = dimensionPixelOffset;
            int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.switch_lr_margin);
            this.f143440k = dimensionPixelOffset2;
            this.f143439j = dimensionPixelOffset2;
            if (this.f143433d == null) {
                this.f143433d = resources.getDrawable(R.drawable.switch_on_loading_background);
            }
            if (this.f143434e == null) {
                this.f143434e = resources.getDrawable(R.drawable.switch_on_loading_forground);
            }
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(getContext()).inflate(R.layout.switcher_loading_layout, (ViewGroup) this, false);
            this.f143430a = frameLayout;
            this.f143431b = (SpinView) frameLayout.findViewById(R.id.spin);
            this.f143432c = (ImageView) this.f143430a.findViewById(R.id.loading_forground);
        }
    }

    public void setForgroundDrawable(Drawable drawable) {
        if (drawable != null) {
            this.f143434e = drawable;
        }
    }

    public void setSpinDrawable(Drawable drawable) {
        if (drawable != null) {
            this.f143433d = drawable;
        }
    }

    public SwitcherLoadingView(Context context) {
        super(context);
        m226092b();
    }

    public void setForgroundDrawableImmediatly(Drawable drawable) {
        if (drawable != null) {
            this.f143434e = drawable;
            ImageView imageView = this.f143432c;
            if (imageView != null) {
                imageView.setImageDrawable(drawable);
            }
        }
    }

    public void setSpinDrawableImmediatly(Drawable drawable) {
        if (drawable != null) {
            this.f143433d = drawable;
            SpinView spinView = this.f143431b;
            if (spinView != null) {
                spinView.setImageDrawable(drawable);
            }
        }
    }

    /* renamed from: a */
    public void mo197497a(boolean z) {
        m226096f();
        this.f143441l = z;
        if (this.f143430a.getParent() != null) {
            removeAllViews();
        }
        addView(this.f143430a, this.f143442m);
        m226093c();
        m226094d();
        m226095e();
        this.f143431b.setSpinDrawable(this.f143433d);
        this.f143432c.setImageDrawable(this.f143434e);
        setVisibility(0);
    }

    public SwitcherLoadingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m226092b();
    }

    public SwitcherLoadingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m226092b();
    }
}
