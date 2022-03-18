package com.ss.android.lark.thirdshare.base.export.p2741c;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.thirdshare.base.export.p2741c.AbstractC55713a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.lark.thirdshare.base.export.c.b */
public class C55718b<Item extends AbstractC55713a<Item>> extends RecyclerView.Adapter<C55719c> {

    /* renamed from: a */
    private List<Item> f137424a;

    /* renamed from: b */
    private RecyclerView f137425b;

    public C55718b() {
        this(false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f137424a.size();
    }

    /* renamed from: a */
    public List<Item> mo189857a() {
        return Collections.unmodifiableList(this.f137424a);
    }

    /* renamed from: a */
    public void mo189862a(List<Item> list) {
        this.f137424a = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f137425b = recyclerView;
    }

    public C55718b(boolean z) {
        this.f137424a = new ArrayList();
        setHasStableIds(z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return this.f137424a.get(i).mo189845c();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.lark.thirdshare.base.export.c.b<Item extends com.ss.android.lark.thirdshare.base.export.c.a<Item>> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        Item item = this.f137424a.get(i);
        item.f137417i = this;
        return item.mo189848d();
    }

    /* renamed from: a */
    public void onViewRecycled(C55719c cVar) {
        super.onViewRecycled(cVar);
        int adapterPosition = cVar.getAdapterPosition();
        if (adapterPosition >= 0 && adapterPosition < this.f137424a.size()) {
            this.f137424a.get(adapterPosition).mo130633b(cVar, adapterPosition);
        }
    }

    /* renamed from: a */
    public C55719c onCreateViewHolder(ViewGroup viewGroup, int i) {
        return AbstractC55713a.m215775a(viewGroup, i);
    }

    /* renamed from: a */
    public Item mo189855a(int i, boolean z) {
        Item remove = this.f137424a.remove(i);
        if (z) {
            notifyItemRemoved(i);
        }
        return remove;
    }

    /* renamed from: a */
    public void mo189858a(Item item, boolean z) {
        this.f137424a.add(item);
        if (z) {
            notifyItemInserted(this.f137424a.size() - 1);
        }
    }

    /* renamed from: a */
    public final void onBindViewHolder(C55719c cVar, int i) {
        this.f137424a.get(i).mo189846c(cVar, i);
    }

    /* renamed from: a */
    public void onBindViewHolder(C55719c cVar, int i, List<Object> list) {
        if (list.isEmpty()) {
            super.onBindViewHolder(cVar, i, list);
        } else {
            this.f137424a.get(i).mo189844a(cVar, i, list);
        }
    }
}
