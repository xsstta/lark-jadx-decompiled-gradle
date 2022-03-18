package com.tt.miniapp.view.webcore;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

public class SwipeRefreshTargetDelegate extends RelativeLayout {
    public SwipeRefreshTargetDelegate(Context context) {
        this(context, null);
    }

    public void addView(View view) {
        if (getChildCount() <= 0) {
            super.addView(view);
            return;
        }
        throw new IllegalStateException("SwipeRefreshTargetDelegate can host only one direct child");
    }

    public boolean canScrollHorizontally(int i) {
        if (getChildCount() > 0) {
            return getChildAt(0).canScrollHorizontally(i);
        }
        return super.canScrollHorizontally(i);
    }

    public boolean canScrollVertically(int i) {
        if (getChildCount() > 0) {
            return getChildAt(0).canScrollVertically(i);
        }
        return super.canScrollVertically(i);
    }

    public SwipeRefreshTargetDelegate(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("SwipeRefreshTargetDelegate can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("SwipeRefreshTargetDelegate can host only one direct child");
    }

    public SwipeRefreshTargetDelegate(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("SwipeRefreshTargetDelegate can host only one direct child");
    }
}
