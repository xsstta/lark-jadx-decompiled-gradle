package com.bumptech.glide.load.p085b;

import androidx.core.util.Pools;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.AbstractC2265c;
import com.bumptech.glide.load.C2390f;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.p083a.AbstractC2147d;
import com.bumptech.glide.load.p085b.AbstractC2233n;
import com.bumptech.glide.util.C2567j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: com.bumptech.glide.load.b.q */
public class C2239q<Model, Data> implements AbstractC2233n<Model, Data> {

    /* renamed from: a */
    private final List<AbstractC2233n<Model, Data>> f7563a;

    /* renamed from: b */
    private final Pools.AbstractC0839a<List<Throwable>> f7564b;

    /* renamed from: com.bumptech.glide.load.b.q$a */
    static class C2240a<Data> implements AbstractC2147d<Data>, AbstractC2147d.AbstractC2148a<Data> {

        /* renamed from: a */
        private final List<AbstractC2147d<Data>> f7565a;

        /* renamed from: b */
        private final Pools.AbstractC0839a<List<Throwable>> f7566b;

        /* renamed from: c */
        private int f7567c = 0;

        /* renamed from: d */
        private Priority f7568d;

        /* renamed from: e */
        private AbstractC2147d.AbstractC2148a<? super Data> f7569e;

        /* renamed from: f */
        private List<Throwable> f7570f;

        /* renamed from: g */
        private boolean f7571g;

        @Override // com.bumptech.glide.load.p083a.AbstractC2147d
        /* renamed from: a */
        public Class<Data> mo10481a() {
            return this.f7565a.get(0).mo10481a();
        }

        @Override // com.bumptech.glide.load.p083a.AbstractC2147d
        /* renamed from: d */
        public DataSource mo10491d() {
            return this.f7565a.get(0).mo10491d();
        }

        @Override // com.bumptech.glide.load.p083a.AbstractC2147d
        /* renamed from: c */
        public void mo10490c() {
            this.f7571g = true;
            for (AbstractC2147d<Data> dVar : this.f7565a) {
                dVar.mo10490c();
            }
        }

        /* renamed from: e */
        private void m9626e() {
            if (!this.f7571g) {
                if (this.f7567c < this.f7565a.size() - 1) {
                    this.f7567c++;
                    mo10488a(this.f7568d, this.f7569e);
                    return;
                }
                C2567j.m10894a((Object) this.f7570f);
                this.f7569e.mo10502a((Exception) new GlideException("Fetch failed", new ArrayList(this.f7570f)));
            }
        }

        @Override // com.bumptech.glide.load.p083a.AbstractC2147d
        /* renamed from: b */
        public void mo10489b() {
            List<Throwable> list = this.f7570f;
            if (list != null) {
                this.f7566b.release(list);
            }
            this.f7570f = null;
            for (AbstractC2147d<Data> dVar : this.f7565a) {
                dVar.mo10489b();
            }
        }

        @Override // com.bumptech.glide.load.p083a.AbstractC2147d.AbstractC2148a
        /* renamed from: a */
        public void mo10502a(Exception exc) {
            ((List) C2567j.m10894a((Object) this.f7570f)).add(exc);
            m9626e();
        }

        @Override // com.bumptech.glide.load.p083a.AbstractC2147d.AbstractC2148a
        /* renamed from: a */
        public void mo10503a(Data data) {
            if (data != null) {
                this.f7569e.mo10503a((Object) data);
            } else {
                m9626e();
            }
        }

        C2240a(List<AbstractC2147d<Data>> list, Pools.AbstractC0839a<List<Throwable>> aVar) {
            this.f7566b = aVar;
            C2567j.m10897a((Collection) list);
            this.f7565a = list;
        }

        @Override // com.bumptech.glide.load.p083a.AbstractC2147d
        /* renamed from: a */
        public void mo10488a(Priority priority, AbstractC2147d.AbstractC2148a<? super Data> aVar) {
            this.f7568d = priority;
            this.f7569e = aVar;
            this.f7570f = this.f7566b.acquire();
            this.f7565a.get(this.f7567c).mo10488a(priority, this);
            if (this.f7571g) {
                mo10490c();
            }
        }
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f7563a.toArray()) + '}';
    }

    @Override // com.bumptech.glide.load.p085b.AbstractC2233n
    /* renamed from: a */
    public boolean mo10536a(Model model) {
        for (AbstractC2233n<Model, Data> nVar : this.f7563a) {
            if (nVar.mo10536a(model)) {
                return true;
            }
        }
        return false;
    }

    C2239q(List<AbstractC2233n<Model, Data>> list, Pools.AbstractC0839a<List<Throwable>> aVar) {
        this.f7563a = list;
        this.f7564b = aVar;
    }

    @Override // com.bumptech.glide.load.p085b.AbstractC2233n
    /* renamed from: a */
    public AbstractC2233n.C2234a<Data> mo10534a(Model model, int i, int i2, C2390f fVar) {
        AbstractC2233n.C2234a<Data> a;
        int size = this.f7563a.size();
        ArrayList arrayList = new ArrayList(size);
        AbstractC2265c cVar = null;
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC2233n<Model, Data> nVar = this.f7563a.get(i3);
            if (nVar.mo10536a(model) && (a = nVar.mo10534a(model, i, i2, fVar)) != null) {
                cVar = a.f7556a;
                arrayList.add(a.f7558c);
            }
        }
        if (arrayList.isEmpty() || cVar == null) {
            return null;
        }
        return new AbstractC2233n.C2234a<>(cVar, new C2240a(arrayList, this.f7564b));
    }
}
