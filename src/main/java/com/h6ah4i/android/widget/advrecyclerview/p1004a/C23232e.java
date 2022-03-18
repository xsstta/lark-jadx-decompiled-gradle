package com.h6ah4i.android.widget.advrecyclerview.p1004a;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.h6ah4i.android.widget.advrecyclerview.p1004a.C23229c;
import com.h6ah4i.android.widget.advrecyclerview.utils.C23306e;
import java.util.Collections;
import java.util.List;

/* renamed from: com.h6ah4i.android.widget.advrecyclerview.a.e */
public class C23232e<VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> implements C23229c.AbstractC23230a, AbstractC23235h<VH> {

    /* renamed from: a */
    protected static final List<Object> f57295a = Collections.emptyList();

    /* renamed from: b */
    private RecyclerView.Adapter<VH> f57296b;

    /* renamed from: c */
    private C23229c f57297c;

    /* renamed from: b */
    public RecyclerView.Adapter<VH> mo80574b() {
        return this.f57296b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo80577c() {
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (mo80573a()) {
            return this.f57296b.getItemCount();
        }
        return 0;
    }

    /* renamed from: a */
    public boolean mo80573a() {
        if (this.f57296b != null) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return this.f57296b.getItemId(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.f57296b.getItemViewType(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(VH vh) {
        mo80571a(vh, vh.getItemViewType());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(VH vh) {
        mo80576b(vh, vh.getItemViewType());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(VH vh) {
        mo80579c(vh, vh.getItemViewType());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        if (mo80573a()) {
            this.f57296b.onAttachedToRecyclerView(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        if (mo80573a()) {
            this.f57296b.onDetachedFromRecyclerView(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public boolean onFailedToRecycleView(VH vh) {
        return mo80580d(vh, vh.getItemViewType());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void setHasStableIds(boolean z) {
        super.setHasStableIds(z);
        if (mo80573a()) {
            this.f57296b.setHasStableIds(z);
        }
    }

    public C23232e(RecyclerView.Adapter<VH> adapter) {
        this.f57296b = adapter;
        C23229c cVar = new C23229c(this, adapter, null);
        this.f57297c = cVar;
        this.f57296b.registerAdapterDataObserver(cVar);
        super.setHasStableIds(this.f57296b.hasStableIds());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo80568a(int i, int i2) {
        notifyItemRangeChanged(i, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo80575b(int i, int i2) {
        notifyItemRangeInserted(i, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo80578c(int i, int i2) {
        notifyItemRangeRemoved(i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(VH vh, int i) {
        onBindViewHolder(vh, i, f57295a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public VH onCreateViewHolder(ViewGroup viewGroup, int i) {
        return this.f57296b.onCreateViewHolder(viewGroup, i);
    }

    @Override // com.h6ah4i.android.widget.advrecyclerview.p1004a.C23229c.AbstractC23230a
    /* renamed from: a */
    public final void mo80562a(RecyclerView.Adapter adapter, Object obj) {
        mo80577c();
    }

    @Override // com.h6ah4i.android.widget.advrecyclerview.p1004a.AbstractC23234g
    /* renamed from: b */
    public void mo80576b(VH vh, int i) {
        if (mo80573a()) {
            C23306e.m84663d(this.f57296b, vh, i);
        }
    }

    @Override // com.h6ah4i.android.widget.advrecyclerview.p1004a.AbstractC23234g
    /* renamed from: c */
    public void mo80579c(VH vh, int i) {
        if (mo80573a()) {
            C23306e.m84660a(this.f57296b, vh, i);
        }
    }

    @Override // com.h6ah4i.android.widget.advrecyclerview.p1004a.AbstractC23234g
    /* renamed from: d */
    public boolean mo80580d(VH vh, int i) {
        boolean z;
        if (mo80573a()) {
            z = C23306e.m84661b(this.f57296b, vh, i);
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return super.onFailedToRecycleView(vh);
    }

    @Override // com.h6ah4i.android.widget.advrecyclerview.p1004a.AbstractC23234g
    /* renamed from: a */
    public void mo80571a(VH vh, int i) {
        if (mo80573a()) {
            C23306e.m84662c(this.f57296b, vh, i);
        }
    }

    @Override // com.h6ah4i.android.widget.advrecyclerview.p1004a.AbstractC23235h
    /* renamed from: a */
    public void mo80572a(C23233f fVar, int i) {
        fVar.f57298a = mo80574b();
        fVar.f57300c = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo80570a(int i, int i2, Object obj) {
        notifyItemRangeChanged(i, i2, obj);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(VH vh, int i, List<Object> list) {
        if (mo80573a()) {
            this.f57296b.onBindViewHolder(vh, i, list);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo80569a(int i, int i2, int i3) {
        if (i3 == 1) {
            notifyItemMoved(i, i2);
            return;
        }
        throw new IllegalStateException("itemCount should be always 1  (actual: " + i3 + ")");
    }

    @Override // com.h6ah4i.android.widget.advrecyclerview.p1004a.C23229c.AbstractC23230a
    /* renamed from: b */
    public final void mo80566b(RecyclerView.Adapter adapter, Object obj, int i, int i2) {
        mo80575b(i, i2);
    }

    @Override // com.h6ah4i.android.widget.advrecyclerview.p1004a.C23229c.AbstractC23230a
    /* renamed from: c */
    public final void mo80567c(RecyclerView.Adapter adapter, Object obj, int i, int i2) {
        mo80578c(i, i2);
    }

    @Override // com.h6ah4i.android.widget.advrecyclerview.p1004a.C23229c.AbstractC23230a
    /* renamed from: a */
    public final void mo80563a(RecyclerView.Adapter adapter, Object obj, int i, int i2) {
        mo80568a(i, i2);
    }

    @Override // com.h6ah4i.android.widget.advrecyclerview.p1004a.C23229c.AbstractC23230a
    /* renamed from: a */
    public final void mo80564a(RecyclerView.Adapter adapter, Object obj, int i, int i2, int i3) {
        mo80569a(i, i2, i3);
    }

    @Override // com.h6ah4i.android.widget.advrecyclerview.p1004a.C23229c.AbstractC23230a
    /* renamed from: a */
    public final void mo80565a(RecyclerView.Adapter adapter, Object obj, int i, int i2, Object obj2) {
        mo80570a(i, i2, obj2);
    }
}
