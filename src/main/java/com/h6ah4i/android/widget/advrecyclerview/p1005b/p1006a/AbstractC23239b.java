package com.h6ah4i.android.widget.advrecyclerview.p1005b.p1006a;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.core.view.AbstractC0928y;
import androidx.core.view.C0924x;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.h6ah4i.android.widget.advrecyclerview.p1005b.AbstractC23236a;
import com.h6ah4i.android.widget.advrecyclerview.p1005b.p1006a.AbstractC23244e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.h6ah4i.android.widget.advrecyclerview.b.a.b */
public abstract class AbstractC23239b<T extends AbstractC23244e> {

    /* renamed from: a */
    private static TimeInterpolator f57303a;

    /* renamed from: b */
    protected final AbstractC23236a f57304b;

    /* renamed from: c */
    protected final List<T> f57305c = new ArrayList();

    /* renamed from: d */
    protected final List<List<T>> f57306d = new ArrayList();

    /* renamed from: e */
    protected final List<RecyclerView.ViewHolder> f57307e = new ArrayList();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo80600a(T t);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo80601a(T t, RecyclerView.ViewHolder viewHolder);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo80606b(T t, RecyclerView.ViewHolder viewHolder);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo80609c(T t, RecyclerView.ViewHolder viewHolder);

    /* renamed from: d */
    public abstract void mo80614d(T t, RecyclerView.ViewHolder viewHolder);

    /* renamed from: e */
    public abstract void mo80617e(T t, RecyclerView.ViewHolder viewHolder);

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract boolean mo80620f(T t, RecyclerView.ViewHolder viewHolder);

    /* renamed from: e */
    public void mo80615e() {
        mo80613d(null);
    }

    /* renamed from: f */
    public void mo80618f() {
        mo80616e(null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo80621g() {
        this.f57304b.mo80585a();
    }

    /* renamed from: b */
    public boolean mo80607b() {
        return !this.f57305c.isEmpty();
    }

    /* renamed from: c */
    public boolean mo80610c() {
        if (!this.f57305c.isEmpty() || !this.f57307e.isEmpty() || !this.f57306d.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public void mo80612d() {
        List<RecyclerView.ViewHolder> list = this.f57307e;
        for (int size = list.size() - 1; size >= 0; size--) {
            ViewCompat.m4103r(list.get(size).itemView).mo4730b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo80604a() {
        return this.f57304b.mo80588b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo80605b(T t) {
        mo80600a(t);
    }

    /* renamed from: c */
    public boolean mo80611c(RecyclerView.ViewHolder viewHolder) {
        return this.f57307e.remove(viewHolder);
    }

    /* renamed from: com.h6ah4i.android.widget.advrecyclerview.b.a.b$a */
    protected static class C23241a implements AbstractC0928y {

        /* renamed from: a */
        private AbstractC23239b f57310a;

        /* renamed from: b */
        private AbstractC23244e f57311b;

        /* renamed from: c */
        private RecyclerView.ViewHolder f57312c;

        /* renamed from: d */
        private C0924x f57313d;

        /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: com.h6ah4i.android.widget.advrecyclerview.b.a.b */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.core.view.AbstractC0928y
        /* renamed from: a */
        public void mo868a(View view) {
            this.f57310a.mo80614d(this.f57311b, this.f57312c);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: com.h6ah4i.android.widget.advrecyclerview.b.a.b */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.core.view.AbstractC0928y
        /* renamed from: c */
        public void mo2464c(View view) {
            this.f57310a.mo80601a(this.f57311b, this.f57312c);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: com.h6ah4i.android.widget.advrecyclerview.b.a.b */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.core.view.AbstractC0928y
        /* renamed from: b */
        public void mo869b(View view) {
            AbstractC23239b bVar = this.f57310a;
            AbstractC23244e eVar = this.f57311b;
            RecyclerView.ViewHolder viewHolder = this.f57312c;
            this.f57313d.mo4727a((AbstractC0928y) null);
            this.f57310a = null;
            this.f57311b = null;
            this.f57312c = null;
            this.f57313d = null;
            bVar.mo80609c(eVar, viewHolder);
            bVar.mo80617e(eVar, viewHolder);
            eVar.mo80598a(viewHolder);
            bVar.f57307e.remove(viewHolder);
            bVar.mo80621g();
        }

        public C23241a(AbstractC23239b bVar, AbstractC23244e eVar, RecyclerView.ViewHolder viewHolder, C0924x xVar) {
            this.f57310a = bVar;
            this.f57311b = eVar;
            this.f57312c = viewHolder;
            this.f57313d = xVar;
        }
    }

    /* renamed from: a */
    private void mo80625a(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder != null) {
            this.f57307e.add(viewHolder);
            return;
        }
        throw new IllegalStateException("item is null");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo80608c(T t) {
        if (t != null) {
            this.f57305c.add(t);
            return;
        }
        throw new IllegalStateException("info is null");
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo80619f(RecyclerView.ViewHolder viewHolder) {
        this.f57304b.endAnimation(viewHolder);
    }

    public AbstractC23239b(AbstractC23236a aVar) {
        this.f57304b = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo80622g(RecyclerView.ViewHolder viewHolder) {
        if (f57303a == null) {
            f57303a = new ValueAnimator().getInterpolator();
        }
        viewHolder.itemView.animate().setInterpolator(f57303a);
        mo80619f(viewHolder);
    }

    /* renamed from: d */
    public void mo80613d(RecyclerView.ViewHolder viewHolder) {
        List<T> list = this.f57305c;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (mo80620f(list.get(size), viewHolder) && viewHolder != null) {
                list.remove(size);
            }
        }
        if (viewHolder == null) {
            list.clear();
        }
    }

    /* renamed from: e */
    public void mo80616e(RecyclerView.ViewHolder viewHolder) {
        for (int size = this.f57306d.size() - 1; size >= 0; size--) {
            List<T> list = this.f57306d.get(size);
            for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                if (mo80620f(list.get(size2), viewHolder) && viewHolder != null) {
                    list.remove(size2);
                }
            }
            if (viewHolder == null) {
                list.clear();
            }
            if (list.isEmpty()) {
                this.f57306d.remove(list);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.h6ah4i.android.widget.advrecyclerview.b.a.b<T extends com.h6ah4i.android.widget.advrecyclerview.b.a.e> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public void mo80603a(boolean z, long j) {
        final ArrayList<AbstractC23244e> arrayList = new ArrayList();
        arrayList.addAll(this.f57305c);
        this.f57305c.clear();
        if (z) {
            this.f57306d.add(arrayList);
            ViewCompat.m4047a(((AbstractC23244e) arrayList.get(0)).mo80597a().itemView, new Runnable() {
                /* class com.h6ah4i.android.widget.advrecyclerview.p1005b.p1006a.AbstractC23239b.RunnableC232401 */

                /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.h6ah4i.android.widget.advrecyclerview.b.a.b */
                /* JADX WARN: Multi-variable type inference failed */
                public void run() {
                    for (AbstractC23244e eVar : arrayList) {
                        AbstractC23239b.this.mo80605b(eVar);
                    }
                    arrayList.clear();
                    AbstractC23239b.this.f57306d.remove(arrayList);
                }
            }, j);
            return;
        }
        for (AbstractC23244e eVar : arrayList) {
            mo80605b(eVar);
        }
        arrayList.clear();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo80602a(T t, RecyclerView.ViewHolder viewHolder, C0924x xVar) {
        xVar.mo4727a(new C23241a(this, t, viewHolder, xVar));
        mo80625a(viewHolder);
        xVar.mo4732c();
    }
}
