package com.h6ah4i.android.widget.advrecyclerview.p1004a;

import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;

/* renamed from: com.h6ah4i.android.widget.advrecyclerview.a.c */
public class C23229c extends RecyclerView.AdapterDataObserver {

    /* renamed from: a */
    private final WeakReference<AbstractC23230a> f57292a;

    /* renamed from: b */
    private final WeakReference<RecyclerView.Adapter> f57293b;

    /* renamed from: c */
    private final Object f57294c;

    /* renamed from: com.h6ah4i.android.widget.advrecyclerview.a.c$a */
    public interface AbstractC23230a {
        /* renamed from: a */
        void mo80562a(RecyclerView.Adapter adapter, Object obj);

        /* renamed from: a */
        void mo80563a(RecyclerView.Adapter adapter, Object obj, int i, int i2);

        /* renamed from: a */
        void mo80564a(RecyclerView.Adapter adapter, Object obj, int i, int i2, int i3);

        /* renamed from: a */
        void mo80565a(RecyclerView.Adapter adapter, Object obj, int i, int i2, Object obj2);

        /* renamed from: b */
        void mo80566b(RecyclerView.Adapter adapter, Object obj, int i, int i2);

        /* renamed from: c */
        void mo80567c(RecyclerView.Adapter adapter, Object obj, int i, int i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public void onChanged() {
        AbstractC23230a aVar = this.f57292a.get();
        RecyclerView.Adapter adapter = this.f57293b.get();
        if (aVar != null && adapter != null) {
            aVar.mo80562a(adapter, this.f57294c);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public void onItemRangeChanged(int i, int i2) {
        AbstractC23230a aVar = this.f57292a.get();
        RecyclerView.Adapter adapter = this.f57293b.get();
        if (aVar != null && adapter != null) {
            aVar.mo80563a(adapter, this.f57294c, i, i2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public void onItemRangeInserted(int i, int i2) {
        AbstractC23230a aVar = this.f57292a.get();
        RecyclerView.Adapter adapter = this.f57293b.get();
        if (aVar != null && adapter != null) {
            aVar.mo80566b(adapter, this.f57294c, i, i2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public void onItemRangeRemoved(int i, int i2) {
        AbstractC23230a aVar = this.f57292a.get();
        RecyclerView.Adapter adapter = this.f57293b.get();
        if (aVar != null && adapter != null) {
            aVar.mo80567c(adapter, this.f57294c, i, i2);
        }
    }

    public C23229c(AbstractC23230a aVar, RecyclerView.Adapter adapter, Object obj) {
        this.f57292a = new WeakReference<>(aVar);
        this.f57293b = new WeakReference<>(adapter);
        this.f57294c = obj;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public void onItemRangeMoved(int i, int i2, int i3) {
        AbstractC23230a aVar = this.f57292a.get();
        RecyclerView.Adapter adapter = this.f57293b.get();
        if (aVar != null && adapter != null) {
            aVar.mo80564a(adapter, this.f57294c, i, i2, i3);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public void onItemRangeChanged(int i, int i2, Object obj) {
        AbstractC23230a aVar = this.f57292a.get();
        RecyclerView.Adapter adapter = this.f57293b.get();
        if (aVar != null && adapter != null) {
            aVar.mo80565a(adapter, this.f57294c, i, i2, obj);
        }
    }
}
