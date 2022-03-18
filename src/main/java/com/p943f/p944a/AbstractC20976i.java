package com.p943f.p944a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.f.a.i */
public abstract class AbstractC20976i implements AbstractC20966c, AbstractC20970e {

    /* renamed from: a */
    private final C20978a f51351a = new C20978a();

    /* renamed from: a */
    public abstract int mo71056a();

    /* renamed from: b */
    public abstract int mo71062b(AbstractC20966c cVar);

    /* renamed from: c */
    public abstract AbstractC20966c mo71065c(int i);

    /* renamed from: com.f.a.i$a */
    private static class C20978a {

        /* renamed from: a */
        final List<AbstractC20970e> f51352a;

        private C20978a() {
            this.f51352a = new ArrayList();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo71071b(AbstractC20970e eVar) {
            synchronized (this.f51352a) {
                this.f51352a.remove(this.f51352a.indexOf(eVar));
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo71069a(AbstractC20970e eVar) {
            synchronized (this.f51352a) {
                if (!this.f51352a.contains(eVar)) {
                    this.f51352a.add(eVar);
                } else {
                    throw new IllegalStateException("Observer " + eVar + " is already registered.");
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo71067a(AbstractC20966c cVar, int i, int i2) {
            for (int size = this.f51352a.size() - 1; size >= 0; size--) {
                this.f51352a.get(size).mo71013a(cVar, i, i2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo71070b(AbstractC20966c cVar, int i, int i2) {
            for (int size = this.f51352a.size() - 1; size >= 0; size--) {
                this.f51352a.get(size).mo71024b(cVar, i, i2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo71072c(AbstractC20966c cVar, int i, int i2) {
            for (int size = this.f51352a.size() - 1; size >= 0; size--) {
                this.f51352a.get(size).mo71027c(cVar, i, i2);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo71068a(AbstractC20966c cVar, int i, int i2, Object obj) {
            for (int size = this.f51352a.size() - 1; size >= 0; size--) {
                this.f51352a.get(size).mo71014a(cVar, i, i2, obj);
            }
        }
    }

    @Override // com.p943f.p944a.AbstractC20966c
    /* renamed from: u */
    public int mo71008u() {
        int i = 0;
        for (int i2 = 0; i2 < mo71056a(); i2++) {
            i += mo71065c(i2).mo71008u();
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo71057a(AbstractC20966c cVar) {
        return mo71061b(mo71062b(cVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo71061b(int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += mo71065c(i3).mo71008u();
        }
        return i2;
    }

    @Override // com.p943f.p944a.AbstractC20966c
    /* renamed from: c */
    public final int mo71007c(AbstractC20975h hVar) {
        int i = 0;
        for (int i2 = 0; i2 < mo71056a(); i2++) {
            AbstractC20966c c = mo71065c(i2);
            int c2 = c.mo71007c(hVar);
            if (c2 >= 0) {
                return c2 + i;
            }
            i += c.mo71008u();
        }
        return -1;
    }

    @Override // com.p943f.p944a.AbstractC20966c
    /* renamed from: b */
    public void mo71006b(AbstractC20970e eVar) {
        this.f51351a.mo71071b(eVar);
    }

    @Override // com.p943f.p944a.AbstractC20966c
    /* renamed from: a */
    public AbstractC20975h mo71004a(int i) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < mo71056a()) {
            AbstractC20966c c = mo71065c(i2);
            int u = c.mo71008u() + i3;
            if (u > i) {
                return c.mo71004a(i - i3);
            }
            i2++;
            i3 = u;
        }
        throw new IndexOutOfBoundsException("Wanted item at " + i + " but there are only " + mo71008u() + " items");
    }

    /* renamed from: b */
    public void mo71064b(Collection<? extends AbstractC20966c> collection) {
        for (AbstractC20966c cVar : collection) {
            cVar.mo71006b(this);
        }
    }

    @Override // com.p943f.p944a.AbstractC20966c
    /* renamed from: a */
    public final void mo71005a(AbstractC20970e eVar) {
        this.f51351a.mo71069a(eVar);
    }

    /* renamed from: a */
    public void mo71060a(Collection<? extends AbstractC20966c> collection) {
        for (AbstractC20966c cVar : collection) {
            cVar.mo71005a(this);
        }
    }

    /* renamed from: a */
    public void mo71058a(int i, int i2) {
        this.f51351a.mo71067a(this, i, i2);
    }

    /* renamed from: b */
    public void mo71063b(int i, int i2) {
        this.f51351a.mo71070b(this, i, i2);
    }

    /* renamed from: c */
    public void mo71066c(int i, int i2) {
        this.f51351a.mo71072c(this, i, i2);
    }

    @Override // com.p943f.p944a.AbstractC20970e
    /* renamed from: b */
    public void mo71024b(AbstractC20966c cVar, int i, int i2) {
        this.f51351a.mo71070b(this, mo71057a(cVar) + i, i2);
    }

    @Override // com.p943f.p944a.AbstractC20970e
    /* renamed from: c */
    public void mo71027c(AbstractC20966c cVar, int i, int i2) {
        int a = mo71057a(cVar);
        this.f51351a.mo71072c(this, i + a, a + i2);
    }

    /* renamed from: a */
    public void mo71059a(int i, int i2, Object obj) {
        this.f51351a.mo71068a(this, i, i2, obj);
    }

    @Override // com.p943f.p944a.AbstractC20970e
    /* renamed from: a */
    public void mo71013a(AbstractC20966c cVar, int i, int i2) {
        this.f51351a.mo71067a(this, mo71057a(cVar) + i, i2);
    }

    @Override // com.p943f.p944a.AbstractC20970e
    /* renamed from: a */
    public void mo71014a(AbstractC20966c cVar, int i, int i2, Object obj) {
        this.f51351a.mo71068a(this, mo71057a(cVar) + i, i2, obj);
    }
}
