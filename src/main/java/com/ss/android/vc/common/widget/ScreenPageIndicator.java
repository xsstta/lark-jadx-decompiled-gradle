package com.ss.android.vc.common.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.larksuite.suite.R;
import com.ss.android.vc.common.p3077b.C60700b;

public class ScreenPageIndicator extends LinearLayout implements ViewPager.OnPageChangeListener, ViewPager.AbstractC1578c {

    /* renamed from: a */
    private ViewPager f152090a;

    /* renamed from: b */
    private int f152091b;

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
    }

    /* renamed from: b */
    private View m236364b() {
        View view = new View(getContext());
        view.setBackgroundResource(R.drawable.bg_single_meeting_indicator);
        return view;
    }

    /* renamed from: a */
    private void m236362a() {
        setOrientation(0);
        this.f152091b = (int) ((getContext().getResources().getDisplayMetrics().density * 4.0f) + 0.5f);
    }

    /* renamed from: c */
    private void m236365c() {
        removeAllViews();
        for (int i = 0; i < this.f152090a.getAdapter().getCount(); i++) {
            View b = m236364b();
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1);
            layoutParams.weight = 1.0f;
            if (i < this.f152090a.getAdapter().getCount() - 1) {
                layoutParams.rightMargin = this.f152091b;
            }
            addView(b, layoutParams);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        m236363a(i);
    }

    public void setIndicatorMargin(int i) {
        this.f152091b = i;
    }

    public ScreenPageIndicator(Context context) {
        super(context);
        m236362a();
    }

    /* renamed from: a */
    private void m236363a(int i) {
        float f;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (i == i2) {
                f = 0.4f;
            } else {
                f = 0.15f;
            }
            childAt.setAlpha(f);
        }
    }

    public ScreenPageIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m236362a();
    }

    @Override // androidx.viewpager.widget.ViewPager.AbstractC1578c
    /* renamed from: a */
    public void mo8153a(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        m236365c();
    }

    @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
        if (i >= 0 && i < getChildCount()) {
            getChildAt(i).setAlpha(0.4f - (f * 0.25f));
            C60700b.m235864f("ScreenPageIndicator", "[onPageScrolled]", i + " # " + getChildAt(i).getAlpha());
        }
        int i3 = i + 1;
        if (i3 >= 0 && i3 < getChildCount()) {
            getChildAt(i3).setAlpha((f * 0.25f) + 0.15f);
            C60700b.m235864f("ScreenPageIndicator", "[onPageScrolled2]", i3 + " @ " + getChildAt(i3).getAlpha());
        }
    }
}
