package com.ss.android.appcenter.common.bannerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.appcenter.common.adapter.p1288a.C28112d;
import com.ss.android.appcenter.common.bannerview.BannerViewPager;
import com.ss.android.appcenter.common.bannerview.p1291c.C28138a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.appcenter.common.bannerview.a */
public abstract class AbstractC28132a<T> extends RecyclerView.Adapter<C28112d> {

    /* renamed from: a */
    protected List<T> f70459a = new ArrayList();

    /* renamed from: b */
    private boolean f70460b;

    /* renamed from: c */
    private BannerViewPager.AbstractC28131a f70461c;

    /* renamed from: a */
    public abstract int mo99937a(int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo99940a(C28112d dVar, T t, int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo100154b(int i) {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo100153b() {
        return this.f70459a.size();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<T> mo100148a() {
        return this.f70459a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        if (!this.f70460b || mo100153b() <= 1) {
            return mo100153b();
        }
        return 1000;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return mo100154b(C28138a.m102970a(i, mo100153b()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo100150a(BannerViewPager.AbstractC28131a aVar) {
        this.f70461c = aVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo100151a(List<? extends T> list) {
        if (list != null) {
            this.f70459a.clear();
            this.f70459a.addAll(list);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo100152a(boolean z) {
        this.f70460b = z;
    }

    /* renamed from: a */
    public final C28112d onCreateViewHolder(ViewGroup viewGroup, int i) {
        return mo100147a(viewGroup, LayoutInflater.from(viewGroup.getContext()).inflate(mo99937a(i), viewGroup, false), i);
    }

    /* renamed from: a */
    public final void onBindViewHolder(C28112d dVar, int i) {
        int a = C28138a.m102970a(i, mo100153b());
        mo99940a(dVar, this.f70459a.get(a), a, mo100153b());
    }

    /* renamed from: a */
    public C28112d mo100147a(ViewGroup viewGroup, View view, int i) {
        return new C28112d(view);
    }
}
