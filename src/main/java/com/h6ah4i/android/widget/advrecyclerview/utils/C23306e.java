package com.h6ah4i.android.widget.advrecyclerview.utils;

import androidx.recyclerview.widget.RecyclerView;
import com.h6ah4i.android.widget.advrecyclerview.p1004a.AbstractC23234g;
import com.h6ah4i.android.widget.advrecyclerview.p1004a.AbstractC23235h;

/* renamed from: com.h6ah4i.android.widget.advrecyclerview.utils.e */
public class C23306e {
    /* renamed from: a */
    public static void m84660a(RecyclerView.Adapter adapter, RecyclerView.ViewHolder viewHolder, int i) {
        if (adapter instanceof AbstractC23235h) {
            ((AbstractC23235h) adapter).mo80579c(viewHolder, i);
        } else {
            adapter.onViewRecycled(viewHolder);
        }
    }

    /* renamed from: b */
    public static boolean m84661b(RecyclerView.Adapter adapter, RecyclerView.ViewHolder viewHolder, int i) {
        if (adapter instanceof AbstractC23234g) {
            return ((AbstractC23234g) adapter).mo80580d(viewHolder, i);
        }
        return adapter.onFailedToRecycleView(viewHolder);
    }

    /* renamed from: c */
    public static void m84662c(RecyclerView.Adapter adapter, RecyclerView.ViewHolder viewHolder, int i) {
        if (adapter instanceof AbstractC23234g) {
            ((AbstractC23234g) adapter).mo80571a(viewHolder, i);
        } else {
            adapter.onViewAttachedToWindow(viewHolder);
        }
    }

    /* renamed from: d */
    public static void m84663d(RecyclerView.Adapter adapter, RecyclerView.ViewHolder viewHolder, int i) {
        if (adapter instanceof AbstractC23234g) {
            ((AbstractC23234g) adapter).mo80576b(viewHolder, i);
        } else {
            adapter.onViewDetachedFromWindow(viewHolder);
        }
    }
}
