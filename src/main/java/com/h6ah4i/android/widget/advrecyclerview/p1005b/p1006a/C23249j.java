package com.h6ah4i.android.widget.advrecyclerview.p1005b.p1006a;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.h6ah4i.android.widget.advrecyclerview.b.a.j */
public class C23249j extends AbstractC23244e {

    /* renamed from: a */
    public RecyclerView.ViewHolder f57325a;

    @Override // com.h6ah4i.android.widget.advrecyclerview.p1005b.p1006a.AbstractC23244e
    /* renamed from: a */
    public RecyclerView.ViewHolder mo80597a() {
        return this.f57325a;
    }

    public String toString() {
        return "RemoveAnimationInfo{holder=" + this.f57325a + '}';
    }

    public C23249j(RecyclerView.ViewHolder viewHolder) {
        this.f57325a = viewHolder;
    }

    @Override // com.h6ah4i.android.widget.advrecyclerview.p1005b.p1006a.AbstractC23244e
    /* renamed from: a */
    public void mo80598a(RecyclerView.ViewHolder viewHolder) {
        if (this.f57325a == viewHolder) {
            this.f57325a = null;
        }
    }
}
