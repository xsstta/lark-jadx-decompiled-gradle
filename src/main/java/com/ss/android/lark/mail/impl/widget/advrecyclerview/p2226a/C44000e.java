package com.ss.android.lark.mail.impl.widget.advrecyclerview.p2226a;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.ss.android.lark.mail.impl.widget.advrecyclerview.p2226a.C43997c;
import com.ss.android.lark.mail.impl.widget.advrecyclerview.utils.C44048d;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.widget.advrecyclerview.a.e */
public class C44000e<VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> implements C43997c.AbstractC43998a, AbstractC44003h<VH> {

    /* renamed from: a */
    protected static final List<Object> f111670a = Collections.emptyList();

    /* renamed from: b */
    private RecyclerView.Adapter<VH> f111671b;

    /* renamed from: c */
    private C43997c f111672c;

    /* renamed from: b */
    public RecyclerView.Adapter<VH> mo156575b() {
        return this.f111671b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo156578c() {
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (mo156574a()) {
            return this.f111671b.getItemCount();
        }
        return 0;
    }

    /* renamed from: a */
    public boolean mo156574a() {
        if (this.f111671b != null) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return this.f111671b.getItemId(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.f111671b.getItemViewType(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(VH vh) {
        mo156572a(vh, vh.getItemViewType());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(VH vh) {
        mo156577b(vh, vh.getItemViewType());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(VH vh) {
        mo156580c(vh, vh.getItemViewType());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        if (mo156574a()) {
            this.f111671b.onAttachedToRecyclerView(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        if (mo156574a()) {
            this.f111671b.onDetachedFromRecyclerView(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public boolean onFailedToRecycleView(VH vh) {
        return mo156581d(vh, vh.getItemViewType());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void setHasStableIds(boolean z) {
        super.setHasStableIds(z);
        if (mo156574a()) {
            this.f111671b.setHasStableIds(z);
        }
    }

    public C44000e(RecyclerView.Adapter<VH> adapter) {
        this.f111671b = adapter;
        C43997c cVar = new C43997c(this, adapter, null);
        this.f111672c = cVar;
        this.f111671b.registerAdapterDataObserver(cVar);
        super.setHasStableIds(this.f111671b.hasStableIds());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo156569a(int i, int i2) {
        notifyItemRangeChanged(i, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo156576b(int i, int i2) {
        notifyItemRangeInserted(i, i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo156579c(int i, int i2) {
        notifyItemRangeRemoved(i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(VH vh, int i) {
        onBindViewHolder(vh, i, f111670a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public VH onCreateViewHolder(ViewGroup viewGroup, int i) {
        return this.f111671b.onCreateViewHolder(viewGroup, i);
    }

    @Override // com.ss.android.lark.mail.impl.widget.advrecyclerview.p2226a.C43997c.AbstractC43998a
    /* renamed from: a */
    public final void mo156563a(RecyclerView.Adapter adapter, Object obj) {
        mo156578c();
    }

    @Override // com.ss.android.lark.mail.impl.widget.advrecyclerview.p2226a.AbstractC44002g
    /* renamed from: b */
    public void mo156577b(VH vh, int i) {
        if (mo156574a()) {
            C44048d.m174504d(this.f111671b, vh, i);
        }
    }

    @Override // com.ss.android.lark.mail.impl.widget.advrecyclerview.p2226a.AbstractC44002g
    /* renamed from: c */
    public void mo156580c(VH vh, int i) {
        if (mo156574a()) {
            C44048d.m174501a(this.f111671b, vh, i);
        }
    }

    @Override // com.ss.android.lark.mail.impl.widget.advrecyclerview.p2226a.AbstractC44002g
    /* renamed from: d */
    public boolean mo156581d(VH vh, int i) {
        boolean z;
        if (mo156574a()) {
            z = C44048d.m174502b(this.f111671b, vh, i);
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        return super.onFailedToRecycleView(vh);
    }

    @Override // com.ss.android.lark.mail.impl.widget.advrecyclerview.p2226a.AbstractC44002g
    /* renamed from: a */
    public void mo156572a(VH vh, int i) {
        if (mo156574a()) {
            C44048d.m174503c(this.f111671b, vh, i);
        }
    }

    @Override // com.ss.android.lark.mail.impl.widget.advrecyclerview.p2226a.AbstractC44003h
    /* renamed from: a */
    public void mo156573a(C44001f fVar, int i) {
        fVar.f111673a = mo156575b();
        fVar.f111675c = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo156571a(int i, int i2, Object obj) {
        notifyItemRangeChanged(i, i2, obj);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(VH vh, int i, List<Object> list) {
        if (mo156574a()) {
            this.f111671b.onBindViewHolder(vh, i, list);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo156570a(int i, int i2, int i3) {
        if (i3 == 1) {
            notifyItemMoved(i, i2);
            return;
        }
        throw new IllegalStateException("itemCount should be always 1  (actual: " + i3 + ")");
    }

    @Override // com.ss.android.lark.mail.impl.widget.advrecyclerview.p2226a.C43997c.AbstractC43998a
    /* renamed from: b */
    public final void mo156567b(RecyclerView.Adapter adapter, Object obj, int i, int i2) {
        mo156576b(i, i2);
    }

    @Override // com.ss.android.lark.mail.impl.widget.advrecyclerview.p2226a.C43997c.AbstractC43998a
    /* renamed from: c */
    public final void mo156568c(RecyclerView.Adapter adapter, Object obj, int i, int i2) {
        mo156579c(i, i2);
    }

    @Override // com.ss.android.lark.mail.impl.widget.advrecyclerview.p2226a.C43997c.AbstractC43998a
    /* renamed from: a */
    public final void mo156564a(RecyclerView.Adapter adapter, Object obj, int i, int i2) {
        mo156569a(i, i2);
    }

    @Override // com.ss.android.lark.mail.impl.widget.advrecyclerview.p2226a.C43997c.AbstractC43998a
    /* renamed from: a */
    public final void mo156565a(RecyclerView.Adapter adapter, Object obj, int i, int i2, int i3) {
        mo156570a(i, i2, i3);
    }

    @Override // com.ss.android.lark.mail.impl.widget.advrecyclerview.p2226a.C43997c.AbstractC43998a
    /* renamed from: a */
    public final void mo156566a(RecyclerView.Adapter adapter, Object obj, int i, int i2, Object obj2) {
        mo156571a(i, i2, obj2);
    }
}
