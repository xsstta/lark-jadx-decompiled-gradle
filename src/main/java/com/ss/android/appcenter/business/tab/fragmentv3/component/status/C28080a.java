package com.ss.android.appcenter.business.tab.fragmentv3.component.status;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.huawei.hms.location.LocationRequest;
import com.larksuite.suite.R;
import com.ss.android.appcenter.business.view.StatusController;
import com.ss.android.appcenter.common.adapter.groupadapter.C28118a;
import com.ss.android.appcenter.common.util.C28209p;
import com.ss.android.appcenter.engine.C28249h;
import com.ss.android.appcenter.engine.p1299a.C28237a;
import com.ss.android.appcenter.engine.vlayout.AbstractC28280c;

/* renamed from: com.ss.android.appcenter.business.tab.fragmentv3.component.status.a */
public class C28080a<T> extends C28249h {

    /* renamed from: o */
    protected C28237a<T> f70307o;

    /* renamed from: p */
    protected View.OnClickListener f70308p;

    /* renamed from: q */
    public boolean f70309q;

    /* renamed from: r */
    protected int f70310r;

    /* renamed from: s */
    protected int f70311s;

    /* renamed from: t */
    protected int f70312t;

    /* renamed from: u */
    protected int f70313u;

    /* renamed from: v */
    protected int f70314v = -1;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo99969c(int i) {
        return i == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter, com.ss.android.appcenter.engine.C28249h
    public int getItemCount() {
        return 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return LocationRequest.PRIORITY_INDOOR;
    }

    /* renamed from: b */
    public void mo99966b(int i) {
        this.f70314v = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo99970d(int i) {
        if (getItemCount() - 1 == i) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C28118a mo99963a(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.workplace_template_item_status_layout, viewGroup, false);
        C28118a aVar = new C28118a(inflate);
        final TemplateSkeletonLoadingView templateSkeletonLoadingView = (TemplateSkeletonLoadingView) aVar.mo100089a(R.id.loading);
        inflate.setTag(new StatusController(aVar.mo100089a(R.id.content), aVar.mo100089a(R.id.error), new StatusController.AbstractC28105b() {
            /* class com.ss.android.appcenter.business.tab.fragmentv3.component.status.C28080a.C280811 */

            @Override // com.ss.android.appcenter.business.view.StatusController.AbstractC28105b
            /* renamed from: a */
            public void mo98317a() {
                templateSkeletonLoadingView.mo99960b();
                templateSkeletonLoadingView.setVisibility(0);
            }

            @Override // com.ss.android.appcenter.business.view.StatusController.AbstractC28105b
            /* renamed from: b */
            public void mo98318b() {
                templateSkeletonLoadingView.setVisibility(8);
                templateSkeletonLoadingView.mo99961c();
            }
        }));
        return new C28118a(inflate);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo99964a(C28118a aVar) {
        StatusController statusController = (StatusController) aVar.itemView.getTag();
        if (this.f70307o.mo100614a()) {
            mo99965a(aVar, statusController);
        } else if (this.f70307o.mo100616c()) {
            mo99967b(aVar, statusController);
        } else {
            mo99968c(aVar, statusController);
        }
        if (this.f70314v == -1 || (!this.f70307o.mo100614a() && !this.f70307o.mo100616c())) {
            aVar.itemView.setBackground(null);
        } else {
            aVar.itemView.setBackground(C28209p.m103302b(aVar.itemView.getContext(), this.f70314v));
        }
    }

    /* renamed from: a */
    public void mo99884a(C28237a<T> aVar) {
        this.f70307o = aVar;
        notifyDataSetChanged();
    }

    @Override // com.ss.android.appcenter.engine.C28249h
    /* renamed from: a */
    public void onBindViewHolder(C28118a aVar, int i) {
        mo99964a(aVar);
    }

    @Override // com.ss.android.appcenter.engine.C28249h
    /* renamed from: a */
    public C28118a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return mo99963a(viewGroup);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo99968c(C28118a aVar, StatusController statusController) {
        C28209p.m103299a(aVar.itemView, this.f70313u);
        statusController.mo100033a(StatusController.Status.CONTENT);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo99965a(C28118a aVar, StatusController statusController) {
        ((TemplateSkeletonLoadingView) aVar.mo100089a(R.id.loading)).setStatusHeight(this.f70311s);
        C28209p.m103299a(aVar.itemView, this.f70311s);
        statusController.mo100033a(StatusController.Status.LOADING);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo99967b(C28118a aVar, StatusController statusController) {
        TemplateErrorView templateErrorView = (TemplateErrorView) aVar.mo100089a(R.id.error);
        templateErrorView.mo99955a(this.f70311s);
        templateErrorView.setOnClickListener(new View.OnClickListener(aVar, statusController) {
            /* class com.ss.android.appcenter.business.tab.fragmentv3.component.status.$$Lambda$a$spPL5b4mOJGXDBfsEQuhi8zjf8 */
            public final /* synthetic */ C28118a f$1;
            public final /* synthetic */ StatusController f$2;

            {
                this.f$1 = r2;
                this.f$2 = r3;
            }

            public final void onClick(View view) {
                C28080a.this.m102656a((C28080a) this.f$1, (C28118a) this.f$2, (StatusController) view);
            }
        });
        C28209p.m103299a(aVar.itemView, this.f70311s);
        statusController.mo100033a(StatusController.Status.ERROR);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m102656a(C28118a aVar, StatusController statusController, View view) {
        this.f70307o.mo100613a(0);
        mo99965a(aVar, statusController);
        this.f70308p.onClick(view);
    }

    public C28080a(Context context, AbstractC28280c cVar, View.OnClickListener onClickListener) {
        super(context, cVar, 0);
        int a = C28209p.m103291a(72.0f);
        this.f70310r = a;
        this.f70311s = a;
        this.f70308p = onClickListener;
        this.f70313u = 0;
    }
}
