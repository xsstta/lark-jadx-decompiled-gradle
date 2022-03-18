package com.ss.android.appcenter.engine.vlayout;

import android.util.Pair;
import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.android.appcenter.engine.vlayout.b */
public class C28277b extends AbstractC28292j<RecyclerView.ViewHolder> {

    /* renamed from: a */
    public final List<Pair<C28279b, AbstractC28278a>> f71017a;

    /* renamed from: b */
    public int f71018b;

    /* renamed from: d */
    private AtomicInteger f71019d;

    /* renamed from: e */
    private int f71020e;

    /* renamed from: f */
    private final boolean f71021f;

    /* renamed from: g */
    private SparseArray<AbstractC28278a> f71022g;

    /* renamed from: h */
    private final SparseArray<Pair<C28279b, AbstractC28278a>> f71023h;

    /* renamed from: i */
    private long[] f71024i;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void setHasStableIds(boolean z) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f71018b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: com.ss.android.appcenter.engine.vlayout.b$b */
    public class C28279b extends RecyclerView.AdapterDataObserver {

        /* renamed from: a */
        int f71025a;

        /* renamed from: b */
        int f71026b = -1;

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            if (m103684a()) {
                C28277b.this.notifyDataSetChanged();
            }
        }

        /* renamed from: a */
        private boolean m103684a() {
            int b;
            int i = this.f71026b;
            if (i < 0 || (b = C28277b.this.mo100768b(i)) < 0) {
                return false;
            }
            Pair<C28279b, AbstractC28278a> pair = C28277b.this.f71017a.get(b);
            LinkedList linkedList = new LinkedList(C28277b.this.mo100820b());
            AbstractC28280c cVar = (AbstractC28280c) linkedList.get(b);
            if (cVar.mo100730b() != ((AbstractC28278a) pair.second).getItemCount()) {
                cVar.mo100732b(((AbstractC28278a) pair.second).getItemCount());
                C28277b.this.f71018b = this.f71025a + ((AbstractC28278a) pair.second).getItemCount();
                for (int i2 = b + 1; i2 < C28277b.this.f71017a.size(); i2++) {
                    Pair<C28279b, AbstractC28278a> pair2 = C28277b.this.f71017a.get(i2);
                    ((C28279b) pair2.first).f71025a = C28277b.this.f71018b;
                    C28277b.this.f71018b += ((AbstractC28278a) pair2.second).getItemCount();
                }
                C28277b.super.mo100767a((C28277b) linkedList);
            }
            return true;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2) {
            if (m103684a()) {
                C28277b.this.notifyItemRangeChanged(this.f71025a + i, i2);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i, int i2) {
            if (m103684a()) {
                C28277b.this.notifyItemRangeInserted(this.f71025a + i, i2);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i, int i2) {
            if (m103684a()) {
                C28277b.this.notifyItemRangeRemoved(this.f71025a + i, i2);
            }
        }

        public C28279b(int i, int i2) {
            this.f71025a = i;
            this.f71026b = i2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2, Object obj) {
            if (m103684a()) {
                C28277b.this.notifyItemRangeChanged(this.f71025a + i, i2, obj);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i, int i2, int i3) {
            if (m103684a()) {
                C28277b bVar = C28277b.this;
                int i4 = this.f71025a;
                bVar.notifyItemMoved(i + i4, i4 + i2);
            }
        }
    }

    /* renamed from: a */
    public void mo100766a() {
        this.f71018b = 0;
        this.f71020e = 0;
        AtomicInteger atomicInteger = this.f71019d;
        if (atomicInteger != null) {
            atomicInteger.set(0);
        }
        this.f71047c.mo100688a((List<AbstractC28280c>) null);
        for (Pair<C28279b, AbstractC28278a> pair : this.f71017a) {
            ((AbstractC28278a) pair.second).unregisterAdapterDataObserver((RecyclerView.AdapterDataObserver) pair.first);
        }
        this.f71022g.clear();
        this.f71017a.clear();
        this.f71023h.clear();
    }

    @Override // com.ss.android.appcenter.engine.vlayout.AbstractC28292j
    /* renamed from: a */
    public void mo100767a(List<AbstractC28280c> list) {
        throw new UnsupportedOperationException("DelegateAdapter doesn't support setLayoutHelpers directly");
    }

    /* renamed from: c */
    public AbstractC28278a mo100770c(int i) {
        return (AbstractC28278a) this.f71023h.get(i).second;
    }

    /* renamed from: b */
    public int mo100768b(int i) {
        Pair<C28279b, AbstractC28278a> pair = this.f71023h.get(i);
        if (pair == null) {
            return -1;
        }
        return this.f71017a.indexOf(pair);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        Pair<C28279b, AbstractC28278a> a;
        super.onViewAttachedToWindow(viewHolder);
        int position = viewHolder.getPosition();
        if (position >= 0 && (a = mo100765a(position)) != null) {
            ((AbstractC28278a) a.second).onViewAttachedToWindow(viewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        Pair<C28279b, AbstractC28278a> a;
        super.onViewDetachedFromWindow(viewHolder);
        int position = viewHolder.getPosition();
        if (position >= 0 && (a = mo100765a(position)) != null) {
            ((AbstractC28278a) a.second).onViewDetachedFromWindow(viewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        Pair<C28279b, AbstractC28278a> a;
        super.onViewRecycled(viewHolder);
        int position = viewHolder.getPosition();
        if (position >= 0 && (a = mo100765a(position)) != null) {
            ((AbstractC28278a) a.second).onViewRecycled(viewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        Pair<C28279b, AbstractC28278a> a = mo100765a(i);
        if (a == null) {
            return -1000;
        }
        long itemId = ((AbstractC28278a) a.second).getItemId(i - ((C28279b) a.first).f71025a);
        if (itemId < 0) {
            return -1000;
        }
        return C28261a.m103594a((long) ((C28279b) a.first).f71026b, itemId);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v4, resolved type: android.util.SparseArray<com.ss.android.appcenter.engine.vlayout.b$a> */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        Pair<C28279b, AbstractC28278a> a = mo100765a(i);
        if (a == null) {
            return -1;
        }
        int itemViewType = ((AbstractC28278a) a.second).getItemViewType(i - ((C28279b) a.first).f71025a);
        if (itemViewType < 0) {
            return itemViewType;
        }
        if (!this.f71021f) {
            return (int) C28261a.m103594a((long) itemViewType, (long) ((C28279b) a.first).f71026b);
        }
        this.f71022g.put(itemViewType, a.second);
        return itemViewType;
    }

    /* renamed from: a */
    public Pair<C28279b, AbstractC28278a> mo100765a(int i) {
        int size = this.f71017a.size();
        if (size == 0) {
            return null;
        }
        int i2 = 0;
        int i3 = size - 1;
        while (i2 <= i3) {
            int i4 = (i2 + i3) / 2;
            Pair<C28279b, AbstractC28278a> pair = this.f71017a.get(i4);
            int itemCount = (((C28279b) pair.first).f71025a + ((AbstractC28278a) pair.second).getItemCount()) - 1;
            if (((C28279b) pair.first).f71025a > i) {
                i3 = i4 - 1;
            } else if (itemCount < i) {
                i2 = i4 + 1;
            } else if (((C28279b) pair.first).f71025a <= i && itemCount >= i) {
                return pair;
            }
        }
        return null;
    }

    /* renamed from: b */
    public void mo100769b(List<AbstractC28278a> list) {
        int i;
        mo100766a();
        if (list == null) {
            list = Collections.emptyList();
        }
        LinkedList linkedList = new LinkedList();
        this.f71018b = 0;
        boolean z = true;
        for (AbstractC28278a aVar : list) {
            int i2 = this.f71018b;
            AtomicInteger atomicInteger = this.f71019d;
            if (atomicInteger == null) {
                i = this.f71020e;
                this.f71020e = i + 1;
            } else {
                i = atomicInteger.incrementAndGet();
            }
            C28279b bVar = new C28279b(i2, i);
            aVar.registerAdapterDataObserver(bVar);
            if (!z || !aVar.hasStableIds()) {
                z = false;
            } else {
                z = true;
            }
            AbstractC28280c a = aVar.mo99910a();
            a.mo100732b(aVar.getItemCount());
            this.f71018b += a.mo100730b();
            linkedList.add(a);
            Pair<C28279b, AbstractC28278a> create = Pair.create(bVar, aVar);
            this.f71023h.put(bVar.f71026b, create);
            this.f71017a.add(create);
        }
        if (!hasObservers()) {
            super.setHasStableIds(z);
        }
        super.mo100767a(linkedList);
    }

    public C28277b(VirtualLayoutManager virtualLayoutManager, boolean z) {
        this(virtualLayoutManager, z, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Pair<C28279b, AbstractC28278a> a = mo100765a(i);
        if (a != null) {
            ((AbstractC28278a) a.second).onBindViewHolder(viewHolder, i - ((C28279b) a.first).f71025a);
            ((AbstractC28278a) a.second).mo100633a(viewHolder, i - ((C28279b) a.first).f71025a, i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (this.f71021f) {
            AbstractC28278a aVar = this.f71022g.get(i);
            if (aVar != null) {
                return aVar.onCreateViewHolder(viewGroup, i);
            }
            return null;
        }
        C28261a.m103595a((long) i, this.f71024i);
        long[] jArr = this.f71024i;
        int i2 = (int) jArr[1];
        int i3 = (int) jArr[0];
        AbstractC28278a c = mo100770c(i2);
        if (c == null) {
            return null;
        }
        return c.onCreateViewHolder(viewGroup, i3);
    }

    C28277b(VirtualLayoutManager virtualLayoutManager, boolean z, boolean z2) {
        super(virtualLayoutManager);
        this.f71022g = new SparseArray<>();
        this.f71017a = new ArrayList();
        this.f71018b = 0;
        this.f71023h = new SparseArray<>();
        this.f71024i = new long[2];
        if (z2) {
            this.f71019d = new AtomicInteger(0);
        }
        this.f71021f = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        Pair<C28279b, AbstractC28278a> a = mo100765a(i);
        if (a != null) {
            ((AbstractC28278a) a.second).onBindViewHolder(viewHolder, i - ((C28279b) a.first).f71025a, list);
            ((AbstractC28278a) a.second).mo100771a(viewHolder, i - ((C28279b) a.first).f71025a, i, list);
        }
    }

    /* renamed from: com.ss.android.appcenter.engine.vlayout.b$a */
    public static abstract class AbstractC28278a<VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {
        /* renamed from: a */
        public abstract AbstractC28280c mo99910a();

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo100633a(VH vh, int i, int i2) {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo100771a(VH vh, int i, int i2, List<Object> list) {
            mo100633a(vh, i, i2);
        }
    }
}
