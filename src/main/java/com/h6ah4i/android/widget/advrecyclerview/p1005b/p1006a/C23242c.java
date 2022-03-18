package com.h6ah4i.android.widget.advrecyclerview.p1005b.p1006a;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.h6ah4i.android.widget.advrecyclerview.b.a.c */
public class C23242c extends AbstractC23244e {

    /* renamed from: a */
    public RecyclerView.ViewHolder f57314a;

    /* renamed from: b */
    public RecyclerView.ViewHolder f57315b;

    /* renamed from: c */
    public int f57316c;

    /* renamed from: d */
    public int f57317d;

    /* renamed from: e */
    public int f57318e;

    /* renamed from: f */
    public int f57319f;

    @Override // com.h6ah4i.android.widget.advrecyclerview.p1005b.p1006a.AbstractC23244e
    /* renamed from: a */
    public RecyclerView.ViewHolder mo80597a() {
        RecyclerView.ViewHolder viewHolder = this.f57315b;
        if (viewHolder != null) {
            return viewHolder;
        }
        return this.f57314a;
    }

    public String toString() {
        return "ChangeInfo{, oldHolder=" + this.f57315b + ", newHolder=" + this.f57314a + ", fromX=" + this.f57316c + ", fromY=" + this.f57317d + ", toX=" + this.f57318e + ", toY=" + this.f57319f + '}';
    }

    @Override // com.h6ah4i.android.widget.advrecyclerview.p1005b.p1006a.AbstractC23244e
    /* renamed from: a */
    public void mo80598a(RecyclerView.ViewHolder viewHolder) {
        if (this.f57315b == viewHolder) {
            this.f57315b = null;
        }
        if (this.f57314a == viewHolder) {
            this.f57314a = null;
        }
        if (this.f57315b == null && this.f57314a == null) {
            this.f57316c = 0;
            this.f57317d = 0;
            this.f57318e = 0;
            this.f57319f = 0;
        }
    }

    public C23242c(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i, int i2, int i3, int i4) {
        this.f57315b = viewHolder;
        this.f57314a = viewHolder2;
        this.f57316c = i;
        this.f57317d = i2;
        this.f57318e = i3;
        this.f57319f = i4;
    }
}
