package com.ss.android.lark.mail.impl.message.framework.tabcontainer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

public class MailViewPager extends ViewPager {

    /* renamed from: a */
    private boolean f109334a = true;

    /* renamed from: a */
    public boolean mo154013a() {
        return this.f109334a;
    }

    public void setScanScroll(boolean z) {
        this.f109334a = z;
    }

    public MailViewPager(Context context) {
        super(context);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            if (!this.f109334a || !super.onInterceptTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            if (!this.f109334a || !super.onTouchEvent(motionEvent)) {
                return false;
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public MailViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
