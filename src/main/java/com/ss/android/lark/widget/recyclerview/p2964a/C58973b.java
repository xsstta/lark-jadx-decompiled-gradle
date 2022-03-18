package com.ss.android.lark.widget.recyclerview.p2964a;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.widget.recyclerview.p2964a.AbstractC58968a;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.lark.widget.recyclerview.a.b */
public class C58973b<Item extends AbstractC58968a> extends RecyclerView.Adapter<C58974c> {

    /* renamed from: a */
    public List<Item> f146125a;

    /* renamed from: b */
    private RecyclerView f146126b;

    public C58973b() {
        this(false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f146125a.size();
    }

    /* renamed from: a */
    public List<Item> mo200076a() {
        return Collections.unmodifiableList(this.f146125a);
    }

    /* renamed from: a */
    public void mo200080a(List<Item> list) {
        this.f146125a = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f146126b = recyclerView;
    }

    public C58973b(boolean z) {
        setHasStableIds(z);
    }

    /* renamed from: a */
    public Item mo200074a(int i) {
        return this.f146125a.get(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return this.f146125a.get(i).mo200062c();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.lark.widget.recyclerview.a.b<Item extends com.ss.android.lark.widget.recyclerview.a.a> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        Item item = this.f146125a.get(i);
        item.f146117c = this;
        return item.mo200064d();
    }

    /* renamed from: a */
    public void onViewRecycled(C58974c cVar) {
        super.onViewRecycled(cVar);
        int adapterPosition = cVar.getAdapterPosition();
        if (adapterPosition >= 0 && adapterPosition < this.f146125a.size()) {
            this.f146125a.get(adapterPosition).mo200065d(cVar, adapterPosition);
        }
    }

    /* renamed from: a */
    public C58974c onCreateViewHolder(ViewGroup viewGroup, int i) {
        return AbstractC58968a.m228876a(viewGroup, i);
    }

    /* renamed from: a */
    public final void onBindViewHolder(C58974c cVar, int i) {
        this.f146125a.get(i).mo200063c(cVar, i);
    }

    /* renamed from: a */
    public void onBindViewHolder(C58974c cVar, int i, List<Object> list) {
        if (list.isEmpty()) {
            super.onBindViewHolder(cVar, i, list);
        } else {
            this.f146125a.get(i).mo200060a(cVar, i, list);
        }
    }
}
