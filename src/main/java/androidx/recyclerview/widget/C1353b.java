package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.b */
public final class C1353b implements AbstractC1398p {

    /* renamed from: a */
    private final RecyclerView.Adapter f4789a;

    public C1353b(RecyclerView.Adapter adapter) {
        this.f4789a = adapter;
    }

    @Override // androidx.recyclerview.widget.AbstractC1398p
    /* renamed from: a */
    public void mo7365a(int i, int i2) {
        this.f4789a.notifyItemRangeInserted(i, i2);
    }

    @Override // androidx.recyclerview.widget.AbstractC1398p
    /* renamed from: b */
    public void mo7367b(int i, int i2) {
        this.f4789a.notifyItemRangeRemoved(i, i2);
    }

    @Override // androidx.recyclerview.widget.AbstractC1398p
    /* renamed from: c */
    public void mo7368c(int i, int i2) {
        this.f4789a.notifyItemMoved(i, i2);
    }

    @Override // androidx.recyclerview.widget.AbstractC1398p
    /* renamed from: a */
    public void mo7366a(int i, int i2, Object obj) {
        this.f4789a.notifyItemRangeChanged(i, i2, obj);
    }
}
