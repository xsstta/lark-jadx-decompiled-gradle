package com.h6ah4i.android.widget.advrecyclerview.utils;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.h6ah4i.android.widget.advrecyclerview.expandable.AbstractC23270c;
import java.util.List;

/* renamed from: com.h6ah4i.android.widget.advrecyclerview.utils.a */
public abstract class AbstractC23302a<GVH extends RecyclerView.ViewHolder, CVH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements AbstractC23270c<GVH, CVH> {
    /* renamed from: a */
    public boolean mo80864a(int i, boolean z) {
        return true;
    }

    @Override // com.h6ah4i.android.widget.advrecyclerview.expandable.AbstractC23270c
    /* renamed from: b */
    public int mo80727b(int i, int i2) {
        return 0;
    }

    /* renamed from: b */
    public boolean mo80865b(int i, boolean z) {
        return true;
    }

    @Override // com.h6ah4i.android.widget.advrecyclerview.expandable.AbstractC23270c
    /* renamed from: c */
    public int mo80731c(int i) {
        return 0;
    }

    @Override // com.h6ah4i.android.widget.advrecyclerview.expandable.AbstractC23270c
    /* renamed from: d */
    public boolean mo80734d(int i) {
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return null;
    }

    @Override // com.h6ah4i.android.widget.advrecyclerview.expandable.AbstractC23270c
    /* renamed from: b */
    public boolean mo80730b(int i, boolean z, Object obj) {
        return mo80865b(i, z);
    }

    @Override // com.h6ah4i.android.widget.advrecyclerview.expandable.AbstractC23270c
    /* renamed from: a */
    public boolean mo80725a(int i, boolean z, Object obj) {
        return mo80864a(i, z);
    }

    @Override // com.h6ah4i.android.widget.advrecyclerview.expandable.AbstractC23270c
    /* renamed from: a */
    public void mo80724a(GVH gvh, int i, int i2, List<Object> list) {
        mo80732c(gvh, i, i2);
    }

    @Override // com.h6ah4i.android.widget.advrecyclerview.expandable.AbstractC23270c
    /* renamed from: a */
    public void mo80723a(CVH cvh, int i, int i2, int i3, List<Object> list) {
        mo80733c(cvh, i, i2, i3);
    }
}
