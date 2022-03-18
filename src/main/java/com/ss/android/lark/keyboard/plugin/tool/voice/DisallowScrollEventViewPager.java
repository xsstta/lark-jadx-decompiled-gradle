package com.ss.android.lark.keyboard.plugin.tool.voice;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import com.ss.android.lark.log.Log;

public class DisallowScrollEventViewPager extends ViewPager {

    /* renamed from: a */
    private float f104452a;

    public DisallowScrollEventViewPager(Context context) {
        super(context);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f104452a = motionEvent.getX();
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action == 2) {
            if (motionEvent.getX() > this.f104452a) {
                z = true;
            } else {
                z = false;
            }
            if (getAdapter() == null) {
                getParent().requestDisallowInterceptTouchEvent(false);
            } else if (getAdapter().getCount() == getCurrentItem() + 1 && !z) {
                getParent().requestDisallowInterceptTouchEvent(false);
            } else if (getCurrentItem() != 0 || !z) {
                getParent().requestDisallowInterceptTouchEvent(true);
            } else {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            Log.m165383e("DisallowScrollEventViewPager", "dispatchTouchEvent called. e:" + e);
            return false;
        }
    }

    public DisallowScrollEventViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
