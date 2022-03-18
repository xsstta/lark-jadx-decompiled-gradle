package com.ss.android.lark.mail.impl.widget.advrecyclerview.p2227b.p2228a;

import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.mail.impl.widget.advrecyclerview.p2227b.AbstractC44004a;
import com.ss.android.lark.mail.impl.widget.advrecyclerview.p2227b.p2228a.AbstractC44011e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.widget.advrecyclerview.b.a.b */
public abstract class AbstractC44007b<T extends AbstractC44011e> {

    /* renamed from: a */
    protected final AbstractC44004a f111678a;

    /* renamed from: b */
    protected final List<T> f111679b;

    /* renamed from: c */
    protected final List<List<T>> f111680c;

    /* renamed from: d */
    protected final List<RecyclerView.ViewHolder> f111681d;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo156602a(T t, RecyclerView.ViewHolder viewHolder);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo156607b(T t);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo156609b(T t, RecyclerView.ViewHolder viewHolder);

    /* renamed from: e */
    public void mo156613e() {
        mo156606b((RecyclerView.ViewHolder) null);
    }

    /* renamed from: f */
    public void mo156614f() {
        mo156610c(null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo156604a() {
        return this.f111678a.mo156589b();
    }

    /* renamed from: b */
    public boolean mo156608b() {
        return !this.f111679b.isEmpty();
    }

    /* renamed from: c */
    public boolean mo156611c() {
        if (!this.f111679b.isEmpty() || !this.f111681d.isEmpty() || !this.f111680c.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public void mo156612d() {
        List<RecyclerView.ViewHolder> list = this.f111681d;
        for (int size = list.size() - 1; size >= 0; size--) {
            ViewCompat.m4103r(list.get(size).itemView).mo4730b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo156601a(T t) {
        mo156607b(t);
    }

    /* renamed from: a */
    public boolean mo156605a(RecyclerView.ViewHolder viewHolder) {
        return this.f111681d.remove(viewHolder);
    }

    /* renamed from: b */
    public void mo156606b(RecyclerView.ViewHolder viewHolder) {
        List<T> list = this.f111679b;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (mo156609b(list.get(size), viewHolder) && viewHolder != null) {
                list.remove(size);
            }
        }
        if (viewHolder == null) {
            list.clear();
        }
    }

    /* renamed from: c */
    public void mo156610c(RecyclerView.ViewHolder viewHolder) {
        for (int size = this.f111680c.size() - 1; size >= 0; size--) {
            List<T> list = this.f111680c.get(size);
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                if (mo156609b(list.get(size2), viewHolder) && viewHolder != null) {
                    list.remove(size2);
                }
            }
            if (viewHolder == null) {
                list.clear();
            }
            if (list.isEmpty()) {
                this.f111680c.remove(list);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.ss.android.lark.mail.impl.widget.advrecyclerview.b.a.b<T extends com.ss.android.lark.mail.impl.widget.advrecyclerview.b.a.e> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public void mo156603a(boolean z, long j) {
        final ArrayList<AbstractC44011e> arrayList = new ArrayList();
        arrayList.addAll(this.f111679b);
        this.f111679b.clear();
        if (z) {
            this.f111680c.add(arrayList);
            ViewCompat.m4047a(((AbstractC44011e) arrayList.get(0)).mo156598a().itemView, new Runnable() {
                /* class com.ss.android.lark.mail.impl.widget.advrecyclerview.p2227b.p2228a.AbstractC44007b.RunnableC440081 */

                /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.ss.android.lark.mail.impl.widget.advrecyclerview.b.a.b */
                /* JADX WARN: Multi-variable type inference failed */
                public void run() {
                    for (AbstractC44011e eVar : arrayList) {
                        AbstractC44007b.this.mo156601a(eVar);
                    }
                    arrayList.clear();
                    AbstractC44007b.this.f111680c.remove(arrayList);
                }
            }, j);
            return;
        }
        for (AbstractC44011e eVar : arrayList) {
            mo156601a(eVar);
        }
        arrayList.clear();
    }
}
