package com.ss.android.appcenter.common.adapter.p1288a;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.appcenter.common.adapter.p1288a.C28112d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.appcenter.common.adapter.a.a */
public abstract class AbstractC28109a<T, H extends C28112d> extends RecyclerView.Adapter<H> {

    /* renamed from: a */
    private AbstractC28110b f70400a;

    /* renamed from: b */
    private HashMap<String, Boolean> f70401b;

    /* renamed from: d */
    protected List<T> f70402d;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract H mo98307a(ViewGroup viewGroup, int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo98489a() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo98309a(H h, int i);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo100068c() {
    }

    /* renamed from: d */
    public List<T> mo100070d() {
        return this.f70402d;
    }

    /* renamed from: b */
    private void mo98492b() {
        this.f70401b = new HashMap<>();
        mo100068c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        List<T> list = this.f70402d;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: c */
    public void mo100069c(List<T> list) {
        if (list != null) {
            this.f70402d.clear();
            this.f70402d.addAll(list);
            notifyDataSetChanged();
        }
    }

    public AbstractC28109a(List<T> list) {
        this.f70402d = list == null ? new ArrayList<>() : list;
        mo98489a();
        mo98492b();
    }

    /* renamed from: b */
    public T mo100065b(int i) {
        List<T> list = this.f70402d;
        if (list == null || i < 0 || i >= list.size()) {
            return null;
        }
        return this.f70402d.get(i);
    }

    /* renamed from: a */
    public void mo100063a(AbstractC28110b bVar) {
        this.f70400a = bVar;
    }

    /* renamed from: b */
    public void onBindViewHolder(H h, int i) {
        mo98309a(h, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void mo98491a(int i, View view) {
        this.f70400a.mo98493a(this, view, i);
    }

    /* renamed from: b */
    public H onCreateViewHolder(ViewGroup viewGroup, int i) {
        return mo98307a(viewGroup, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo100062a(View view, int i) {
        if (this.f70400a != null) {
            view.setOnClickListener(new View.OnClickListener(i) {
                /* class com.ss.android.appcenter.common.adapter.p1288a.$$Lambda$a$nn79Vt2Q3qZ6q5YCgh50ImkC4Q */
                public final /* synthetic */ int f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    AbstractC28109a.this.mo98491a((AbstractC28109a) this.f$1, (int) view);
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo100066b(View view, int i) {
        if (this.f70400a != null) {
            view.setOnClickListener(new View.OnClickListener(view, i) {
                /* class com.ss.android.appcenter.common.adapter.p1288a.$$Lambda$a$lF8poalCMgNYDnFJDrcAj8xqqdk */
                public final /* synthetic */ View f$1;
                public final /* synthetic */ int f$2;

                {
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final void onClick(View view) {
                    AbstractC28109a.this.m102788a(this.f$1, this.f$2, view);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m102788a(View view, int i, View view2) {
        this.f70400a.mo98494b(this, view, i);
    }
}
