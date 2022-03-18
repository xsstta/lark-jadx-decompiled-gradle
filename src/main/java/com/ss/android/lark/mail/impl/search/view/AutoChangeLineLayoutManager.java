package com.ss.android.lark.mail.impl.search.view;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

public class AutoChangeLineLayoutManager extends RecyclerView.LayoutManager {

    /* renamed from: a */
    private final int f110062a;

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean isAutoMeasureEnabled() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        return new RecyclerView.LayoutParams(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        int i;
        int i2;
        int i3;
        detachAndScrapAttachedViews(recycler);
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i8 < getItemCount()) {
            View viewForPosition = recycler.getViewForPosition(i8);
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) viewForPosition.getLayoutParams();
            addView(viewForPosition);
            measureChild(viewForPosition, i4, i4);
            int decoratedMeasuredWidth = getDecoratedMeasuredWidth(viewForPosition);
            int decoratedMeasuredHeight = getDecoratedMeasuredHeight(viewForPosition);
            if (i5 + decoratedMeasuredWidth + layoutParams.leftMargin > getWidth()) {
                i = i6 + i7 + this.f110062a;
                i3 = 0;
                i2 = 0;
            } else {
                i2 = i5;
                i = i6;
                i3 = i7;
            }
            layoutDecorated(viewForPosition, i2 + layoutParams.leftMargin, i, layoutParams.leftMargin + i2 + decoratedMeasuredWidth, i + decoratedMeasuredHeight);
            i5 = i2 + decoratedMeasuredWidth + layoutParams.leftMargin + layoutParams.rightMargin;
            i7 = Math.max(i3, decoratedMeasuredHeight);
            recycler.recycleView(viewForPosition);
            i8++;
            i6 = i;
            i4 = 0;
        }
    }
}
