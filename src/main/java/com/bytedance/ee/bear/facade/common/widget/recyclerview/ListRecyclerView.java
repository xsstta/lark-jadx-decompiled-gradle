package com.bytedance.ee.bear.facade.common.widget.recyclerview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.bytedance.ee.bear.widgets.BaseRecyclerView;

public class ListRecyclerView extends BaseRecyclerView {

    /* renamed from: a */
    private boolean f20957a;

    /* renamed from: b */
    private int f20958b;

    /* renamed from: c */
    private int f20959c;

    public ListRecyclerView(Context context) {
        super(context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 2 && this.f20957a) {
                int rawX = this.f20958b - ((int) (motionEvent.getRawX() + 0.5f));
                int rawY = this.f20959c - ((int) (motionEvent.getRawY() + 0.5f));
                boolean canScrollHorizontally = getLayoutManager().canScrollHorizontally();
                boolean canScrollVertically = getLayoutManager().canScrollVertically();
                if ((!canScrollHorizontally || Math.abs(rawX) <= 30) && (!canScrollVertically || Math.abs(rawY) <= 30)) {
                    return false;
                }
            }
        } else if (2 == getScrollState()) {
            getParent().requestDisallowInterceptTouchEvent(true);
            stopScroll();
            this.f20957a = true;
            this.f20958b = (int) (motionEvent.getRawX() + 0.5f);
            this.f20959c = (int) (motionEvent.getRawY() + 0.5f);
            return false;
        } else {
            this.f20957a = false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public ListRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ListRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
