package com.ss.android.lark.mail.impl.widget.advrecyclerview.utils;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.mail.impl.widget.advrecyclerview.p2226a.AbstractC44002g;
import com.ss.android.lark.mail.impl.widget.advrecyclerview.p2226a.AbstractC44003h;

/* renamed from: com.ss.android.lark.mail.impl.widget.advrecyclerview.utils.d */
public class C44048d {
    /* renamed from: a */
    public static void m174501a(RecyclerView.Adapter adapter, RecyclerView.ViewHolder viewHolder, int i) {
        if (adapter instanceof AbstractC44003h) {
            ((AbstractC44003h) adapter).mo156580c(viewHolder, i);
        } else {
            adapter.onViewRecycled(viewHolder);
        }
    }

    /* renamed from: b */
    public static boolean m174502b(RecyclerView.Adapter adapter, RecyclerView.ViewHolder viewHolder, int i) {
        if (adapter instanceof AbstractC44002g) {
            return ((AbstractC44002g) adapter).mo156581d(viewHolder, i);
        }
        return adapter.onFailedToRecycleView(viewHolder);
    }

    /* renamed from: c */
    public static void m174503c(RecyclerView.Adapter adapter, RecyclerView.ViewHolder viewHolder, int i) {
        if (adapter instanceof AbstractC44002g) {
            ((AbstractC44002g) adapter).mo156572a(viewHolder, i);
        } else {
            adapter.onViewAttachedToWindow(viewHolder);
        }
    }

    /* renamed from: d */
    public static void m174504d(RecyclerView.Adapter adapter, RecyclerView.ViewHolder viewHolder, int i) {
        if (adapter instanceof AbstractC44002g) {
            ((AbstractC44002g) adapter).mo156577b(viewHolder, i);
        } else {
            adapter.onViewDetachedFromWindow(viewHolder);
        }
    }
}
