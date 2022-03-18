package com.p078b.p079a;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import io.supercharge.shimmerlayout.ShimmerLayout;

/* renamed from: com.b.a.d */
public class C2053d extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    /* renamed from: a */
    private int f7041a;

    /* renamed from: b */
    private int f7042b;

    /* renamed from: c */
    private int f7043c;

    /* renamed from: d */
    private boolean f7044d;

    /* renamed from: e */
    private int f7045e;

    /* renamed from: f */
    private int f7046f;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f7041a;
    }

    /* renamed from: a */
    public void mo10140a(int i) {
        this.f7042b = i;
    }

    /* renamed from: b */
    public void mo10142b(int i) {
        this.f7041a = i;
    }

    /* renamed from: c */
    public void mo10143c(int i) {
        this.f7043c = i;
    }

    /* renamed from: d */
    public void mo10144d(int i) {
        this.f7045e = i;
    }

    /* renamed from: e */
    public void mo10145e(int i) {
        this.f7046f = i;
    }

    /* renamed from: a */
    public void mo10141a(boolean z) {
        this.f7044d = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (this.f7044d) {
            ShimmerLayout shimmerLayout = (ShimmerLayout) viewHolder.itemView;
            shimmerLayout.setShimmerAnimationDuration(this.f7045e);
            shimmerLayout.setShimmerAngle(this.f7046f);
            shimmerLayout.setShimmerColor(this.f7043c);
            shimmerLayout.mo238795a();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (this.f7044d) {
            return new C2051b(from, viewGroup, this.f7042b);
        }
        return new RecyclerView.ViewHolder(from.inflate(this.f7042b, viewGroup, false)) {
            /* class com.p078b.p079a.C2053d.C20541 */
        };
    }
}
