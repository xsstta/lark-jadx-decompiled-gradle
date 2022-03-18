package com.ss.android.lark.widget.ptr;

import android.os.Build;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ScrollView;

public abstract class LKUIPtrDefaultHandler2 extends LKUIPtrDefaultHandler implements LKUIPtrHandler2 {
    public static boolean canChildScrollDown(View view) {
        if (Build.VERSION.SDK_INT >= 14) {
            return view.canScrollVertically(1);
        }
        if (view instanceof AbsListView) {
            AbsListView absListView = (AbsListView) view;
            if (absListView.getChildCount() <= 0 || (absListView.getLastVisiblePosition() >= absListView.getChildCount() - 1 && absListView.getChildAt(absListView.getChildCount() - 1).getBottom() <= absListView.getPaddingBottom())) {
                return false;
            }
            return true;
        } else if (!(view instanceof ScrollView)) {
            return false;
        } else {
            ScrollView scrollView = (ScrollView) view;
            if (scrollView.getChildCount() != 0 && scrollView.getScrollY() < scrollView.getChildAt(0).getHeight() - scrollView.getHeight()) {
                return true;
            }
            return false;
        }
    }

    public static boolean checkContentCanBePulledUp(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
        return !canChildScrollDown(view);
    }

    @Override // com.ss.android.lark.widget.ptr.LKUIPtrHandler2
    public boolean checkCanDoLoadMore(LKUIPtrFrameLayout lKUIPtrFrameLayout, View view, View view2) {
        return checkContentCanBePulledUp(lKUIPtrFrameLayout, view, view2);
    }
}
