package com.bytedance.ee.bear.bizwidget.banner.p272a;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.bytedance.ee.bear.bizwidget.banner.p273b.AbstractC4867a;
import com.bytedance.ee.bear.bizwidget.banner.p274c.AbstractC4871a;
import com.bytedance.ee.bear.bizwidget.banner.util.C4877b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.ee.bear.bizwidget.banner.a.a */
public abstract class AbstractC4866a<T, VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> implements AbstractC4867a<T, VH> {

    /* renamed from: a */
    protected List<T> f14280a = new ArrayList();

    /* renamed from: b */
    private AbstractC4871a f14281b;

    /* renamed from: c */
    private VH f14282c;

    /* renamed from: d */
    private int f14283d = 2;

    /* renamed from: a */
    public int mo19042a() {
        List<T> list = this.f14280a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        if (mo19042a() > 1) {
            return mo19042a() + this.f14283d;
        }
        return mo19042a();
    }

    /* renamed from: b */
    public void mo19045b(int i) {
        this.f14283d = i;
    }

    public AbstractC4866a(List<T> list) {
        mo19044a(list);
    }

    /* renamed from: a */
    public int mo19043a(int i) {
        boolean z;
        if (this.f14283d == 2) {
            z = true;
        } else {
            z = false;
        }
        return C4877b.m20113a(z, i, mo19042a());
    }

    /* renamed from: a */
    public void mo19044a(List<T> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.f14280a = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public VH onCreateViewHolder(ViewGroup viewGroup, int i) {
        return (VH) ((RecyclerView.ViewHolder) mo19046a(viewGroup, i));
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m20033a(int i, View view) {
        this.f14281b.mo19093a(this.f14280a.get(i), i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(VH vh, int i) {
        this.f14282c = vh;
        int a = mo19043a(i);
        mo19047a(vh, this.f14280a.get(a), a, mo19042a());
        if (this.f14281b != null) {
            vh.itemView.setOnClickListener(new View.OnClickListener(a) {
                /* class com.bytedance.ee.bear.bizwidget.banner.p272a.$$Lambda$a$M3IXiuFLPKUNi8r4u1yZqzZMPgo */
                public final /* synthetic */ int f$1;

                {
                    this.f$1 = r2;
                }

                public final void onClick(View view) {
                    AbstractC4866a.lambda$M3IXiuFLPKUNi8r4u1yZqzZMPgo(AbstractC4866a.this, this.f$1, view);
                }
            });
        }
    }
}
