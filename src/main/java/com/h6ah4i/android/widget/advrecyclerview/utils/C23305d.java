package com.h6ah4i.android.widget.advrecyclerview.utils;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* renamed from: com.h6ah4i.android.widget.advrecyclerview.utils.d */
public class C23305d {
    /* renamed from: a */
    public static int m84655a(RecyclerView.ViewHolder viewHolder) {
        int layoutPosition = viewHolder.getLayoutPosition();
        if (layoutPosition == viewHolder.getAdapterPosition()) {
            return layoutPosition;
        }
        return -1;
    }

    /* renamed from: a */
    public static int m84656a(RecyclerView recyclerView) {
        return m84654a(recyclerView.getLayoutManager());
    }

    /* renamed from: a */
    public static int m84654a(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof GridLayoutManager) {
            return ((GridLayoutManager) layoutManager).getOrientation();
        }
        if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).getOrientation();
        }
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            return ((StaggeredGridLayoutManager) layoutManager).mo7272k();
        }
        return -1;
    }

    /* renamed from: b */
    public static Rect m84659b(View view, Rect rect) {
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        return rect;
    }

    /* renamed from: a */
    public static Rect m84657a(View view, Rect rect) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            rect.left = marginLayoutParams.leftMargin;
            rect.right = marginLayoutParams.rightMargin;
            rect.top = marginLayoutParams.topMargin;
            rect.bottom = marginLayoutParams.bottomMargin;
        } else {
            rect.bottom = 0;
            rect.top = 0;
            rect.right = 0;
            rect.left = 0;
        }
        return rect;
    }

    /* renamed from: a */
    public static RecyclerView.ViewHolder m84658a(RecyclerView recyclerView, float f, float f2) {
        View findChildViewUnder = recyclerView.findChildViewUnder(f, f2);
        if (findChildViewUnder != null) {
            return recyclerView.getChildViewHolder(findChildViewUnder);
        }
        return null;
    }
}
