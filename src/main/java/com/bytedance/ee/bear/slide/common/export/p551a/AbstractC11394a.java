package com.bytedance.ee.bear.slide.common.export.p551a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.slide.common.export.a.a */
public abstract class AbstractC11394a<D, V extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<V> {

    /* renamed from: a */
    protected final List<D> f30616a = new ArrayList();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo43642a(V v, D d);

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f30616a.size();
    }

    /* renamed from: a */
    public void mo43641a() {
        this.f30616a.clear();
        notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public D mo43640a(int i) {
        return this.f30616a.get(i);
    }

    /* renamed from: a */
    public void mo43643a(List<D> list) {
        list.removeAll(this.f30616a);
        this.f30616a.addAll(list);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(V v, int i) {
        mo43642a(v, mo43640a(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public View mo43639a(ViewGroup viewGroup, int i) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false);
    }
}
