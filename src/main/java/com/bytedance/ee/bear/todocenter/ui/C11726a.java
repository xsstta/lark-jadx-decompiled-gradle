package com.bytedance.ee.bear.todocenter.ui;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.bytedance.ee.bear.todocenter.ui.a */
public class C11726a extends RecyclerView.AdapterDataObserver {
    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public void onItemRangeChanged(int i, int i2) {
        super.onItemRangeChanged(i, i2);
        onChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public void onItemRangeInserted(int i, int i2) {
        super.onItemRangeInserted(i, i2);
        onChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public void onItemRangeRemoved(int i, int i2) {
        super.onItemRangeRemoved(i, i2);
        onChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public void onItemRangeMoved(int i, int i2, int i3) {
        super.onItemRangeMoved(i, i2, i3);
        onChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public void onItemRangeChanged(int i, int i2, Object obj) {
        super.onItemRangeChanged(i, i2, obj);
        onChanged();
    }
}
