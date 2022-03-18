package com.ss.android.vc.common.base;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.vc.common.base.a */
public abstract class AbstractC60710a<VH extends RecyclerView.ViewHolder, Data> extends RecyclerView.Adapter<VH> {

    /* renamed from: a */
    protected List<Data> f151860a = new ArrayList();

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f151860a.size();
    }

    public AbstractC60710a() {
        setHasStableIds(true);
    }

    /* renamed from: a */
    public Data mo208288a(int i) {
        return this.f151860a.get(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return (long) mo208288a(i).hashCode();
    }

    /* renamed from: a */
    public void mo208289a(Collection<? extends Data> collection) {
        this.f151860a.clear();
        if (collection != null && !collection.isEmpty()) {
            this.f151860a.addAll(collection);
        }
        notifyDataSetChanged();
    }
}
