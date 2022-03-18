package com.prolificinteractive.materialcalendarview;

import android.content.Context;
import android.view.MotionEvent;
import androidx.core.view.BetterViewPager;

/* renamed from: com.prolificinteractive.materialcalendarview.b */
class C26992b extends BetterViewPager {

    /* renamed from: a */
    private boolean f67019a = true;

    /* renamed from: a */
    public void mo96016a(boolean z) {
        this.f67019a = z;
    }

    public C26992b(Context context) {
        super(context);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean canScrollHorizontally(int i) {
        if (!this.f67019a || !super.canScrollHorizontally(i)) {
            return false;
        }
        return true;
    }

    public boolean canScrollVertically(int i) {
        if (!this.f67019a || !super.canScrollVertically(i)) {
            return false;
        }
        return true;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f67019a || !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f67019a || !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
