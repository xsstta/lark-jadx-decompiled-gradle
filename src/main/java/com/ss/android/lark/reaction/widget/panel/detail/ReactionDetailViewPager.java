package com.ss.android.lark.reaction.widget.panel.detail;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

public class ReactionDetailViewPager extends ViewPager {
    public ReactionDetailViewPager(Context context) {
        super(context);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action == 2) {
            if (getAdapter().getCount() == getCurrentItem() + 1 || getCurrentItem() == 0) {
                getParent().requestDisallowInterceptTouchEvent(false);
            } else {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public ReactionDetailViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
