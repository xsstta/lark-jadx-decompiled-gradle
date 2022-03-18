package com.ss.android.lark.mail.impl.widget.advrecyclerview.p2227b.p2228a;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.ss.android.lark.mail.impl.widget.advrecyclerview.b.a.c */
public class C44009c extends AbstractC44011e {

    /* renamed from: a */
    public RecyclerView.ViewHolder f111684a;

    /* renamed from: b */
    public RecyclerView.ViewHolder f111685b;

    /* renamed from: c */
    public int f111686c;

    /* renamed from: d */
    public int f111687d;

    /* renamed from: e */
    public int f111688e;

    /* renamed from: f */
    public int f111689f;

    @Override // com.ss.android.lark.mail.impl.widget.advrecyclerview.p2227b.p2228a.AbstractC44011e
    /* renamed from: a */
    public RecyclerView.ViewHolder mo156598a() {
        RecyclerView.ViewHolder viewHolder = this.f111685b;
        if (viewHolder != null) {
            return viewHolder;
        }
        return this.f111684a;
    }

    public String toString() {
        return "ChangeInfo{, oldHolder=" + this.f111685b + ", newHolder=" + this.f111684a + ", fromX=" + this.f111686c + ", fromY=" + this.f111687d + ", toX=" + this.f111688e + ", toY=" + this.f111689f + '}';
    }

    /* renamed from: a */
    public void mo156616a(RecyclerView.ViewHolder viewHolder) {
        if (this.f111685b == viewHolder) {
            this.f111685b = null;
        }
        if (this.f111684a == viewHolder) {
            this.f111684a = null;
        }
        if (this.f111685b == null && this.f111684a == null) {
            this.f111686c = 0;
            this.f111687d = 0;
            this.f111688e = 0;
            this.f111689f = 0;
        }
    }
}
