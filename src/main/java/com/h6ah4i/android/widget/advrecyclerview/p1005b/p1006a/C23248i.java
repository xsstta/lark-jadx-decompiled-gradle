package com.h6ah4i.android.widget.advrecyclerview.p1005b.p1006a;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.h6ah4i.android.widget.advrecyclerview.b.a.i */
public class C23248i extends AbstractC23244e {

    /* renamed from: a */
    public final int f57320a;

    /* renamed from: b */
    public final int f57321b;

    /* renamed from: c */
    public final int f57322c;

    /* renamed from: d */
    public final int f57323d;

    /* renamed from: e */
    public RecyclerView.ViewHolder f57324e;

    @Override // com.h6ah4i.android.widget.advrecyclerview.p1005b.p1006a.AbstractC23244e
    /* renamed from: a */
    public RecyclerView.ViewHolder mo80597a() {
        return this.f57324e;
    }

    public String toString() {
        return "MoveAnimationInfo{holder=" + this.f57324e + ", fromX=" + this.f57320a + ", fromY=" + this.f57321b + ", toX=" + this.f57322c + ", toY=" + this.f57323d + '}';
    }

    @Override // com.h6ah4i.android.widget.advrecyclerview.p1005b.p1006a.AbstractC23244e
    /* renamed from: a */
    public void mo80598a(RecyclerView.ViewHolder viewHolder) {
        if (this.f57324e == viewHolder) {
            this.f57324e = null;
        }
    }

    public C23248i(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
        this.f57324e = viewHolder;
        this.f57320a = i;
        this.f57321b = i2;
        this.f57322c = i3;
        this.f57323d = i4;
    }
}
