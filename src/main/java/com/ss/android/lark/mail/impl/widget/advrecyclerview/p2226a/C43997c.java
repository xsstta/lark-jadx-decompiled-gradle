package com.ss.android.lark.mail.impl.widget.advrecyclerview.p2226a;

import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.lark.mail.impl.widget.advrecyclerview.a.c */
public class C43997c extends RecyclerView.AdapterDataObserver {

    /* renamed from: a */
    private final WeakReference<AbstractC43998a> f111667a;

    /* renamed from: b */
    private final WeakReference<RecyclerView.Adapter> f111668b;

    /* renamed from: c */
    private final Object f111669c;

    /* renamed from: com.ss.android.lark.mail.impl.widget.advrecyclerview.a.c$a */
    public interface AbstractC43998a {
        /* renamed from: a */
        void mo156563a(RecyclerView.Adapter adapter, Object obj);

        /* renamed from: a */
        void mo156564a(RecyclerView.Adapter adapter, Object obj, int i, int i2);

        /* renamed from: a */
        void mo156565a(RecyclerView.Adapter adapter, Object obj, int i, int i2, int i3);

        /* renamed from: a */
        void mo156566a(RecyclerView.Adapter adapter, Object obj, int i, int i2, Object obj2);

        /* renamed from: b */
        void mo156567b(RecyclerView.Adapter adapter, Object obj, int i, int i2);

        /* renamed from: c */
        void mo156568c(RecyclerView.Adapter adapter, Object obj, int i, int i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public void onChanged() {
        AbstractC43998a aVar = this.f111667a.get();
        RecyclerView.Adapter adapter = this.f111668b.get();
        if (aVar != null && adapter != null) {
            aVar.mo156563a(adapter, this.f111669c);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public void onItemRangeChanged(int i, int i2) {
        AbstractC43998a aVar = this.f111667a.get();
        RecyclerView.Adapter adapter = this.f111668b.get();
        if (aVar != null && adapter != null) {
            aVar.mo156564a(adapter, this.f111669c, i, i2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public void onItemRangeInserted(int i, int i2) {
        AbstractC43998a aVar = this.f111667a.get();
        RecyclerView.Adapter adapter = this.f111668b.get();
        if (aVar != null && adapter != null) {
            aVar.mo156567b(adapter, this.f111669c, i, i2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public void onItemRangeRemoved(int i, int i2) {
        AbstractC43998a aVar = this.f111667a.get();
        RecyclerView.Adapter adapter = this.f111668b.get();
        if (aVar != null && adapter != null) {
            aVar.mo156568c(adapter, this.f111669c, i, i2);
        }
    }

    public C43997c(AbstractC43998a aVar, RecyclerView.Adapter adapter, Object obj) {
        this.f111667a = new WeakReference<>(aVar);
        this.f111668b = new WeakReference<>(adapter);
        this.f111669c = obj;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public void onItemRangeMoved(int i, int i2, int i3) {
        AbstractC43998a aVar = this.f111667a.get();
        RecyclerView.Adapter adapter = this.f111668b.get();
        if (aVar != null && adapter != null) {
            aVar.mo156565a(adapter, this.f111669c, i, i2, i3);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
    public void onItemRangeChanged(int i, int i2, Object obj) {
        AbstractC43998a aVar = this.f111667a.get();
        RecyclerView.Adapter adapter = this.f111668b.get();
        if (aVar != null && adapter != null) {
            aVar.mo156566a(adapter, this.f111669c, i, i2, obj);
        }
    }
}
