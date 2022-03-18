package com.ss.android.appcenter.engine;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import com.ss.android.appcenter.common.adapter.groupadapter.C28118a;
import com.ss.android.appcenter.engine.vlayout.AbstractC28280c;
import com.ss.android.appcenter.engine.vlayout.C28277b;

/* renamed from: com.ss.android.appcenter.engine.h */
public class C28249h extends C28277b.AbstractC28278a<C28118a> {

    /* renamed from: a */
    private Context f70884a;

    /* renamed from: b */
    private AbstractC28280c f70885b;

    /* renamed from: c */
    private boolean f70886c;

    /* renamed from: w */
    protected int f70887w;

    /* renamed from: a */
    public void onBindViewHolder(C28118a aVar, int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo100633a(C28118a aVar, int i, int i2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo99897b() {
    }

    @Override // com.ss.android.appcenter.engine.vlayout.C28277b.AbstractC28278a
    /* renamed from: a */
    public AbstractC28280c mo99910a() {
        return this.f70885b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Context mo100635c() {
        return this.f70884a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f70887w;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo100636d() {
        if (!this.f70886c) {
            this.f70886c = true;
            mo99897b();
        }
    }

    /* renamed from: a */
    public C28118a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C28118a(new TextView(viewGroup.getContext()));
    }

    public C28249h(Context context, AbstractC28280c cVar, int i) {
        this.f70884a = context;
        this.f70885b = cVar;
        this.f70887w = i;
    }
}
