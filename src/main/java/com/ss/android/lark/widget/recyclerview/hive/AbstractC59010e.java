package com.ss.android.lark.widget.recyclerview.hive;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.ss.android.lark.widget.recyclerview.hive.e */
public abstract class AbstractC59010e {

    /* renamed from: n */
    public View f146209n;

    /* renamed from: o */
    protected RecyclerView.ViewHolder f146210o;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo122652a(View view);

    /* renamed from: l */
    public int mo200148l() {
        return this.f146210o.getLayoutPosition();
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo200147g(View view) {
        this.f146209n = view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo200145a(RecyclerView.ViewHolder viewHolder) {
        this.f146210o = viewHolder;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo200146f(View view) {
        mo200147g(view);
        mo122652a(view);
    }
}
