package com.bytedance.ies.xelement.swiper;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.lynx.tasm.utils.C26955i;

class SwiperView extends FrameLayout {

    /* renamed from: a */
    private final ViewPager f38455a;

    /* renamed from: b */
    private final LinearLayout f38456b;

    /* renamed from: c */
    private final int f38457c;

    /* renamed from: d */
    private int f38458d;

    /* renamed from: e */
    private int f38459e;

    /* renamed from: f */
    private int f38460f;

    /* renamed from: a */
    public ViewPager mo53545a() {
        return this.f38455a;
    }

    /* renamed from: c */
    public void mo53550c() {
        this.f38456b.removeViewAt(0);
        mo53551c(this.f38460f);
    }

    /* renamed from: b */
    public void mo53548b() {
        View view = new View(getContext());
        view.setClickable(false);
        int i = this.f38457c;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
        int i2 = this.f38457c / 2;
        layoutParams.rightMargin = i2;
        layoutParams.leftMargin = i2;
        this.f38456b.addView(view, layoutParams);
        int childCount = this.f38456b.getChildCount();
        int i3 = this.f38458d;
        if (childCount == i3) {
            view.setBackground(m58822d(i3));
        } else {
            view.setBackground(m58822d(this.f38459e));
        }
    }

    public SwiperView(Context context) {
        this(context, null);
    }

    /* renamed from: d */
    private GradientDrawable m58822d(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(i);
        return gradientDrawable;
    }

    /* renamed from: a */
    public void mo53547a(boolean z) {
        int i;
        LinearLayout linearLayout = this.f38456b;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        linearLayout.setVisibility(i);
    }

    /* renamed from: a */
    public void mo53546a(int i) {
        this.f38458d = i;
        int childCount = this.f38456b.getChildCount();
        while (true) {
            childCount--;
            if (childCount <= -1) {
                return;
            }
            if (childCount == this.f38460f) {
                this.f38456b.getChildAt(childCount).setBackground(m58822d(this.f38458d));
                return;
            }
        }
    }

    /* renamed from: c */
    public void mo53551c(int i) {
        this.f38460f = i;
        int childCount = this.f38456b.getChildCount();
        while (true) {
            childCount--;
            if (childCount > -1) {
                View childAt = this.f38456b.getChildAt(childCount);
                if (childCount == this.f38460f) {
                    childAt.setBackground(m58822d(this.f38458d));
                } else {
                    childAt.setBackground(m58822d(this.f38459e));
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public void mo53549b(int i) {
        this.f38459e = i;
        int childCount = this.f38456b.getChildCount();
        while (true) {
            childCount--;
            if (childCount <= -1) {
                return;
            }
            if (childCount != this.f38460f) {
                this.f38456b.getChildAt(childCount).setBackground(m58822d(this.f38459e));
            }
        }
    }

    public SwiperView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38458d = XSwiperUI.f38484a;
        this.f38459e = XSwiperUI.f38485b;
        this.f38457c = (int) C26955i.m97952a(7.0f);
        ViewPager viewPager = new ViewPager(context);
        this.f38455a = viewPager;
        addView(viewPager, new FrameLayout.LayoutParams(-1, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f38456b = linearLayout;
        linearLayout.setGravity(17);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = (int) C26955i.m97952a(10.0f);
        layoutParams.gravity = 81;
        addView(linearLayout, layoutParams);
    }
}
