package androidx.recyclerview.widget;

import androidx.collection.C0516c;
import androidx.collection.SimpleArrayMap;
import androidx.core.util.Pools;
import androidx.recyclerview.widget.RecyclerView;

/* access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.w */
public class C1412w {

    /* renamed from: a */
    final SimpleArrayMap<RecyclerView.ViewHolder, C1413a> f4959a = new SimpleArrayMap<>();

    /* renamed from: b */
    final C0516c<RecyclerView.ViewHolder> f4960b = new C0516c<>();

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.w$b */
    public interface AbstractC1414b {
        /* renamed from: a */
        void mo6862a(RecyclerView.ViewHolder viewHolder);

        /* renamed from: a */
        void mo6863a(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.C1323c cVar, RecyclerView.ItemAnimator.C1323c cVar2);

        /* renamed from: b */
        void mo6864b(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.C1323c cVar, RecyclerView.ItemAnimator.C1323c cVar2);

        /* renamed from: c */
        void mo6865c(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.C1323c cVar, RecyclerView.ItemAnimator.C1323c cVar2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.w$a */
    public static class C1413a {

        /* renamed from: d */
        static Pools.AbstractC0839a<C1413a> f4961d = new Pools.SimplePool(20);

        /* renamed from: a */
        int f4962a;

        /* renamed from: b */
        RecyclerView.ItemAnimator.C1323c f4963b;

        /* renamed from: c */
        RecyclerView.ItemAnimator.C1323c f4964c;

        private C1413a() {
        }

        /* renamed from: a */
        static C1413a m6473a() {
            C1413a acquire = f4961d.acquire();
            if (acquire == null) {
                return new C1413a();
            }
            return acquire;
        }

        /* renamed from: b */
        static void m6475b() {
            do {
            } while (f4961d.acquire() != null);
        }

        /* renamed from: a */
        static void m6474a(C1413a aVar) {
            aVar.f4962a = 0;
            aVar.f4963b = null;
            aVar.f4964c = null;
            f4961d.release(aVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo7493b() {
        C1413a.m6475b();
    }

    C1412w() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7487a() {
        this.f4959a.clear();
        this.f4960b.mo2971d();
    }

    /* renamed from: h */
    public void mo7501h(RecyclerView.ViewHolder viewHolder) {
        mo7499f(viewHolder);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public RecyclerView.ItemAnimator.C1323c mo7492b(RecyclerView.ViewHolder viewHolder) {
        return m6456a(viewHolder, 4);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public RecyclerView.ItemAnimator.C1323c mo7495c(RecyclerView.ViewHolder viewHolder) {
        return m6456a(viewHolder, 8);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public RecyclerView.ViewHolder mo7486a(long j) {
        return this.f4960b.mo2959a(j);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo7497d(RecyclerView.ViewHolder viewHolder) {
        C1413a aVar = this.f4959a.get(viewHolder);
        if (aVar == null || (aVar.f4962a & 4) == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo7498e(RecyclerView.ViewHolder viewHolder) {
        C1413a aVar = this.f4959a.get(viewHolder);
        if (aVar == null) {
            aVar = C1413a.m6473a();
            this.f4959a.put(viewHolder, aVar);
        }
        aVar.f4962a |= 1;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo7499f(RecyclerView.ViewHolder viewHolder) {
        C1413a aVar = this.f4959a.get(viewHolder);
        if (aVar != null) {
            aVar.f4962a &= -2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo7500g(RecyclerView.ViewHolder viewHolder) {
        int b = this.f4960b.mo2962b() - 1;
        while (true) {
            if (b < 0) {
                break;
            } else if (viewHolder == this.f4960b.mo2967c(b)) {
                this.f4960b.mo2961a(b);
                break;
            } else {
                b--;
            }
        }
        C1413a remove = this.f4959a.remove(viewHolder);
        if (remove != null) {
            C1413a.m6474a(remove);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7490a(AbstractC1414b bVar) {
        for (int size = this.f4959a.size() - 1; size >= 0; size--) {
            RecyclerView.ViewHolder keyAt = this.f4959a.keyAt(size);
            C1413a removeAt = this.f4959a.removeAt(size);
            if ((removeAt.f4962a & 3) == 3) {
                bVar.mo6862a(keyAt);
            } else if ((removeAt.f4962a & 1) != 0) {
                if (removeAt.f4963b == null) {
                    bVar.mo6862a(keyAt);
                } else {
                    bVar.mo6863a(keyAt, removeAt.f4963b, removeAt.f4964c);
                }
            } else if ((removeAt.f4962a & 14) == 14) {
                bVar.mo6864b(keyAt, removeAt.f4963b, removeAt.f4964c);
            } else if ((removeAt.f4962a & 12) == 12) {
                bVar.mo6865c(keyAt, removeAt.f4963b, removeAt.f4964c);
            } else if ((removeAt.f4962a & 4) != 0) {
                bVar.mo6863a(keyAt, removeAt.f4963b, null);
            } else if ((removeAt.f4962a & 8) != 0) {
                bVar.mo6864b(keyAt, removeAt.f4963b, removeAt.f4964c);
            } else {
                int i = removeAt.f4962a;
            }
            C1413a.m6474a(removeAt);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo7491a(RecyclerView.ViewHolder viewHolder) {
        C1413a aVar = this.f4959a.get(viewHolder);
        if (aVar == null || (aVar.f4962a & 1) == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7488a(long j, RecyclerView.ViewHolder viewHolder) {
        this.f4960b.mo2965b(j, viewHolder);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo7494b(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.C1323c cVar) {
        C1413a aVar = this.f4959a.get(viewHolder);
        if (aVar == null) {
            aVar = C1413a.m6473a();
            this.f4959a.put(viewHolder, aVar);
        }
        aVar.f4962a |= 2;
        aVar.f4963b = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo7496c(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.C1323c cVar) {
        C1413a aVar = this.f4959a.get(viewHolder);
        if (aVar == null) {
            aVar = C1413a.m6473a();
            this.f4959a.put(viewHolder, aVar);
        }
        aVar.f4964c = cVar;
        aVar.f4962a |= 8;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7489a(RecyclerView.ViewHolder viewHolder, RecyclerView.ItemAnimator.C1323c cVar) {
        C1413a aVar = this.f4959a.get(viewHolder);
        if (aVar == null) {
            aVar = C1413a.m6473a();
            this.f4959a.put(viewHolder, aVar);
        }
        aVar.f4963b = cVar;
        aVar.f4962a |= 4;
    }

    /* renamed from: a */
    private RecyclerView.ItemAnimator.C1323c m6456a(RecyclerView.ViewHolder viewHolder, int i) {
        C1413a valueAt;
        RecyclerView.ItemAnimator.C1323c cVar;
        int indexOfKey = this.f4959a.indexOfKey(viewHolder);
        if (indexOfKey < 0 || (valueAt = this.f4959a.valueAt(indexOfKey)) == null || (valueAt.f4962a & i) == 0) {
            return null;
        }
        valueAt.f4962a &= ~i;
        if (i == 4) {
            cVar = valueAt.f4963b;
        } else if (i == 8) {
            cVar = valueAt.f4964c;
        } else {
            throw new IllegalArgumentException("Must provide flag PRE or POST");
        }
        if ((valueAt.f4962a & 12) == 0) {
            this.f4959a.removeAt(indexOfKey);
            C1413a.m6474a(valueAt);
        }
        return cVar;
    }
}
