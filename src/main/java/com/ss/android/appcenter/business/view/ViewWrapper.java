package com.ss.android.appcenter.business.view;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

public class ViewWrapper {
    private View mTarget;
    private int smoothScrollY;

    public int getScrollY() {
        return this.smoothScrollY;
    }

    public int getSmoothScrollY() {
        return this.smoothScrollY;
    }

    public int getHeight() {
        return this.mTarget.getLayoutParams().height;
    }

    public int getMarginTop() {
        return ((ViewGroup.MarginLayoutParams) this.mTarget.getLayoutParams()).topMargin;
    }

    public void setScrollY(int i) {
        this.smoothScrollY = i;
    }

    public ViewWrapper(View view) {
        this.mTarget = view;
    }

    public void setHeight(int i) {
        ViewGroup.LayoutParams layoutParams = this.mTarget.getLayoutParams();
        layoutParams.height = i;
        this.mTarget.setLayoutParams(layoutParams);
    }

    public void setMarginTop(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mTarget.getLayoutParams();
        marginLayoutParams.topMargin = i;
        this.mTarget.setLayoutParams(marginLayoutParams);
    }

    public void setSmoothScrollY(int i) {
        View view = this.mTarget;
        if (view instanceof RecyclerView) {
            ((RecyclerView) view).scrollBy(0, i - getScrollY());
            setScrollY(i);
        }
    }
}
