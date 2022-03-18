package com.ss.android.lark.widget.ptr;

import android.os.Build;
import android.view.View;
import android.widget.AbsListView;

public abstract class LKUIPtrDefaultHandler implements LKUIPtrHandler {
    public static boolean canChildScrollUp(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            return view.canScrollVertically(-1);
        }
        if (view instanceof AbsListView) {
            AbsListView absListView = (AbsListView) view;
            if (absListView.getChildCount() <= 0 || (absListView.getFirstVisiblePosition() <= 0 && absListView.getChildAt(0).getTop() >= absListView.getPaddingTop())) {
                return false;
            }
            return true;
        } else if (view.getScrollY() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkContentCanBePulledDown(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
        return !canChildScrollUp(view);
    }

    @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler
    public boolean checkCanDoRefresh(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
        return checkContentCanBePulledDown(lKUIPtrFrameLayout, view, view2);
    }
}
