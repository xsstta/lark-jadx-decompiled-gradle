package com.ss.android.vc.meeting.module.multi.viewpager;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.ss.android.lark.widget.FixTouchBugViewPager;

public class CanScrollViewPager extends FixTouchBugViewPager {

    /* renamed from: a */
    private boolean f157363a = true;

    public void setScanScroll(boolean z) {
        this.f157363a = z;
    }

    public CanScrollViewPager(Context context) {
        super(context);
    }

    @Override // com.ss.android.lark.widget.FixTouchBugViewPager, androidx.viewpager.widget.ViewPager
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.f157363a || !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.lark.widget.FixTouchBugViewPager, androidx.viewpager.widget.ViewPager
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f157363a || !super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public CanScrollViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
