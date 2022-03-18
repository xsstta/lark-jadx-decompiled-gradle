package com.ss.android.lark.main.app.drawer.adapter;

import android.util.SparseIntArray;
import android.view.ViewGroup;
import androidx.collection.C0516c;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.main.app.drawer.adapter.c */
public class C44218c extends RecyclerView.Adapter {

    /* renamed from: a */
    protected List<C44220b> f112192a = new ArrayList();

    /* renamed from: b */
    private int f112193b = 0;

    /* renamed from: c */
    private long f112194c = 0;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.main.app.drawer.adapter.c$a */
    public class C44219a extends RecyclerView.AdapterDataObserver {

        /* renamed from: b */
        private RecyclerView.Adapter f112196b;

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onChanged() {
            C44218c.this.notifyDataSetChanged();
        }

        C44219a(RecyclerView.Adapter adapter) {
            this.f112196b = adapter;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeChanged(int i, int i2) {
            C44218c.this.notifyItemRangeChanged(C44218c.this.mo157247b(this.f112196b) + i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeInserted(int i, int i2) {
            C44218c.this.notifyItemRangeInserted(C44218c.this.mo157247b(this.f112196b) + i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeRemoved(int i, int i2) {
            C44218c.this.notifyItemRangeRemoved(C44218c.this.mo157247b(this.f112196b) + i, i2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
        public void onItemRangeMoved(int i, int i2, int i3) {
            int b = C44218c.this.mo157247b(this.f112196b);
            C44218c.this.notifyItemMoved(i + b, b + i2);
        }
    }

    /* renamed from: com.ss.android.lark.main.app.drawer.adapter.c$c */
    public static class C44221c {

        /* renamed from: a */
        public final C44220b f112201a;

        /* renamed from: b */
        public final int f112202b;

        /* renamed from: a */
        public RecyclerView.Adapter mo157248a() {
            return this.f112201a.f112197a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public SparseIntArray mo157249b() {
            return this.f112201a.f112198b;
        }

        public C44221c(C44220b bVar, int i) {
            this.f112201a = bVar;
            this.f112202b = i;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        int i = 0;
        for (C44220b bVar : this.f112192a) {
            i += bVar.f112197a.getItemCount();
        }
        return i;
    }

    /* renamed from: a */
    public void mo157246a(RecyclerView.Adapter adapter) {
        mo157245a(this.f112192a.size(), adapter);
    }

    /* renamed from: a */
    public C44221c mo157244a(int i) {
        int size = this.f112192a.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            C44220b bVar = this.f112192a.get(i2);
            int itemCount = bVar.f112197a.getItemCount() + i3;
            if (i < itemCount) {
                return new C44221c(bVar, i - i3);
            }
            i2++;
            i3 = itemCount;
        }
        return null;
    }

    /* renamed from: b */
    public int mo157247b(RecyclerView.Adapter adapter) {
        int i = 0;
        for (C44220b bVar : this.f112192a) {
            RecyclerView.Adapter adapter2 = bVar.f112197a;
            if (adapter2.equals(adapter) && adapter2.getItemCount() > 0) {
                return i;
            }
            i += adapter2.getItemCount();
        }
        return -1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        C44221c a = mo157244a(i);
        long itemId = a.mo157248a().getItemId(a.f112202b);
        if (-1 == itemId) {
            return itemId;
        }
        long longValue = a.f112201a.f112200d.mo2960a(itemId, -1L).longValue();
        if (-1 != longValue) {
            return longValue;
        }
        long j = 1 + this.f112194c;
        this.f112194c = j;
        a.f112201a.f112200d.mo2965b(itemId, Long.valueOf(j));
        return j;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        C44221c a = mo157244a(i);
        int itemViewType = a.mo157248a().getItemViewType(a.f112202b);
        int indexOfValue = a.mo157249b().indexOfValue(itemViewType);
        if (indexOfValue >= 0) {
            return a.mo157249b().keyAt(indexOfValue);
        }
        this.f112193b++;
        a.mo157249b().append(this.f112193b, itemViewType);
        return this.f112193b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C44221c a = mo157244a(i);
        a.mo157248a().onBindViewHolder(viewHolder, a.f112202b);
    }

    /* renamed from: com.ss.android.lark.main.app.drawer.adapter.c$b */
    public static class C44220b {

        /* renamed from: a */
        public final RecyclerView.Adapter f112197a;

        /* renamed from: b */
        public SparseIntArray f112198b = new SparseIntArray();

        /* renamed from: c */
        public C44219a f112199c;

        /* renamed from: d */
        public C0516c<Long> f112200d = new C0516c<>();

        public C44220b(RecyclerView.Adapter adapter, C44219a aVar) {
            this.f112197a = adapter;
            this.f112199c = aVar;
        }
    }

    /* renamed from: a */
    public void mo157245a(int i, RecyclerView.Adapter adapter) {
        C44219a aVar = new C44219a(adapter);
        this.f112192a.add(i, new C44220b(adapter, aVar));
        adapter.registerAdapterDataObserver(aVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        for (C44220b bVar : this.f112192a) {
            int i2 = bVar.f112198b.get(i, -1);
            if (i2 >= 0) {
                return bVar.f112197a.onCreateViewHolder(viewGroup, i2);
            }
        }
        return null;
    }
}
