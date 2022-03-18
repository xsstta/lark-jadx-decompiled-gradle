package com.ss.android.lark.mail.impl.widget.advrecyclerview.utils;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* renamed from: com.ss.android.lark.mail.impl.widget.advrecyclerview.utils.c */
public class C44047c {
    /* renamed from: a */
    public static int m174496a(RecyclerView.ViewHolder viewHolder) {
        int layoutPosition = viewHolder.getLayoutPosition();
        if (layoutPosition == viewHolder.getAdapterPosition()) {
            return layoutPosition;
        }
        return -1;
    }

    /* renamed from: a */
    public static int m174497a(RecyclerView recyclerView) {
        return m174495a(recyclerView.getLayoutManager());
    }

    /* renamed from: a */
    public static int m174495a(RecyclerView.LayoutManager layoutManager) {
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
    public static Rect m174500b(View view, Rect rect) {
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        return rect;
    }

    /* renamed from: a */
    public static Rect m174498a(View view, Rect rect) {
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
    public static RecyclerView.ViewHolder m174499a(RecyclerView recyclerView, float f, float f2) {
        View findChildViewUnder = recyclerView.findChildViewUnder(f, f2);
        if (findChildViewUnder != null) {
            return recyclerView.getChildViewHolder(findChildViewUnder);
        }
        return null;
    }
}
