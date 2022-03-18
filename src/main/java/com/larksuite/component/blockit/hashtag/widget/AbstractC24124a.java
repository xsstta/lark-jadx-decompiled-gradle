package com.larksuite.component.blockit.hashtag.widget;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

/* renamed from: com.larksuite.component.blockit.hashtag.widget.a */
public abstract class AbstractC24124a<VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> implements AbstractC24126c {

    /* renamed from: b */
    public C24127d f59660b = new C24127d(this);

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public abstract void onBindViewHolder(VH vh, int i);

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public abstract VH onCreateViewHolder(ViewGroup viewGroup, int i);

    /* renamed from: a */
    public void mo86621a() {
        super.notifyDataSetChanged();
    }

    /* renamed from: b */
    public void mo86622b() {
        this.f59660b.mo86623a();
    }
}
