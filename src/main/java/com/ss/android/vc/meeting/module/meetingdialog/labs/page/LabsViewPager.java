package com.ss.android.vc.meeting.module.meetingdialog.labs.page;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

public class LabsViewPager extends ViewPager {

    /* renamed from: a */
    private boolean f156469a;

    /* renamed from: a */
    private void m243227a() {
        setOffscreenPageLimit(3);
    }

    public LabsViewPager(Context context) {
        super(context);
        m243227a();
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f156469a) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f156469a) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public LabsViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m243227a();
    }
}
