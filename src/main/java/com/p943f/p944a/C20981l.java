package com.p943f.p944a;

import androidx.recyclerview.widget.AbstractC1398p;
import androidx.recyclerview.widget.C1374g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.f.a.l */
public class C20981l extends AbstractC20976i {

    /* renamed from: a */
    private AbstractC20966c f51353a;

    /* renamed from: b */
    private AbstractC20966c f51354b;

    /* renamed from: c */
    private AbstractC20966c f51355c;

    /* renamed from: d */
    private final ArrayList<AbstractC20966c> f51356d;

    /* renamed from: e */
    private boolean f51357e;

    /* renamed from: f */
    private boolean f51358f;

    /* renamed from: g */
    private boolean f51359g;

    /* renamed from: h */
    private AbstractC1398p f51360h;

    /* renamed from: o */
    private int m76451o() {
        return this.f51359g ? 1 : 0;
    }

    /* renamed from: b */
    public List<AbstractC20966c> mo71077b() {
        return new ArrayList(this.f51356d);
    }

    public C20981l() {
        this(null, new ArrayList());
    }

    /* renamed from: j */
    private int m76446j() {
        if (this.f51359g) {
            return m76455s();
        }
        return C20971f.m76383a(this.f51356d);
    }

    /* renamed from: k */
    private int m76447k() {
        return m76446j() + mo71081e();
    }

    /* renamed from: l */
    private int m76448l() {
        if (this.f51353a == null || !this.f51358f) {
            return 0;
        }
        return 1;
    }

    /* renamed from: m */
    private int m76449m() {
        if (m76450n() == 0) {
            return 0;
        }
        return this.f51354b.mo71008u();
    }

    /* renamed from: n */
    private int m76450n() {
        if (this.f51354b == null || !this.f51358f) {
            return 0;
        }
        return 1;
    }

    /* renamed from: p */
    private boolean m76452p() {
        if (m76448l() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: q */
    private boolean m76453q() {
        if (m76450n() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: r */
    private boolean m76454r() {
        if (m76451o() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    private int m76455s() {
        AbstractC20966c cVar;
        if (!this.f51359g || (cVar = this.f51355c) == null) {
            return 0;
        }
        return cVar.mo71008u();
    }

    /* renamed from: e */
    public int mo71081e() {
        if (m76448l() == 0) {
            return 0;
        }
        return this.f51353a.mo71008u();
    }

    /* renamed from: f */
    private void m76442f() {
        if (!this.f51359g && this.f51355c != null) {
            this.f51359g = true;
            mo71058a(mo71081e(), this.f51355c.mo71008u());
        }
    }

    /* renamed from: g */
    private void m76443g() {
        if (this.f51359g && this.f51355c != null) {
            this.f51359g = false;
            mo71063b(mo71081e(), this.f51355c.mo71008u());
        }
    }

    /* renamed from: h */
    private void m76444h() {
        if (this.f51358f || this.f51359g) {
            this.f51358f = false;
            this.f51359g = false;
            mo71063b(0, mo71081e() + m76455s() + m76449m());
        }
    }

    /* renamed from: i */
    private void m76445i() {
        if (!this.f51358f) {
            this.f51358f = true;
            mo71058a(0, mo71081e());
            mo71058a(m76447k(), m76449m());
        }
    }

    @Override // com.p943f.p944a.AbstractC20976i
    /* renamed from: a */
    public int mo71056a() {
        return m76448l() + m76450n() + m76451o() + this.f51356d.size();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo71079c() {
        if (this.f51356d.isEmpty() || C20971f.m76383a(this.f51356d) == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo71080d() {
        if (!mo71079c()) {
            m76443g();
            m76445i();
        } else if (this.f51357e) {
            m76444h();
        } else {
            m76442f();
            m76445i();
        }
    }

    /* renamed from: c */
    public void mo71078c(Collection<? extends AbstractC20966c> collection) {
        mo71076a(collection, true);
    }

    @Override // com.p943f.p944a.AbstractC20976i
    /* renamed from: a */
    public void mo71060a(Collection<? extends AbstractC20966c> collection) {
        if (!collection.isEmpty()) {
            super.mo71060a(collection);
            int k = m76447k();
            this.f51356d.addAll(collection);
            mo71058a(k, C20971f.m76383a(collection));
            mo71080d();
        }
    }

    @Override // com.p943f.p944a.AbstractC20976i
    /* renamed from: b */
    public int mo71062b(AbstractC20966c cVar) {
        if (m76452p() && cVar == this.f51353a) {
            return 0;
        }
        int l = 0 + m76448l();
        if (m76454r() && cVar == this.f51355c) {
            return l;
        }
        int o = l + m76451o();
        int indexOf = this.f51356d.indexOf(cVar);
        if (indexOf >= 0) {
            return o + indexOf;
        }
        int size = o + this.f51356d.size();
        if (!m76453q() || this.f51354b != cVar) {
            return -1;
        }
        return size;
    }

    @Override // com.p943f.p944a.AbstractC20976i
    /* renamed from: b */
    public void mo71064b(Collection<? extends AbstractC20966c> collection) {
        if (!collection.isEmpty()) {
            super.mo71064b(collection);
            for (AbstractC20966c cVar : collection) {
                int a = mo71057a(cVar);
                this.f51356d.remove(cVar);
                mo71063b(a, cVar.mo71008u());
            }
            mo71080d();
        }
    }

    @Override // com.p943f.p944a.AbstractC20976i
    /* renamed from: c */
    public AbstractC20966c mo71065c(int i) {
        if (m76452p() && i == 0) {
            return this.f51353a;
        }
        int l = i - m76448l();
        if (m76454r() && l == 0) {
            return this.f51355c;
        }
        int o = l - m76451o();
        if (o != this.f51356d.size()) {
            return this.f51356d.get(o);
        }
        if (m76453q()) {
            return this.f51354b;
        }
        throw new IndexOutOfBoundsException("Wanted group at position " + o + " but there are only " + mo71056a() + " groups");
    }

    public C20981l(AbstractC20966c cVar, Collection<? extends AbstractC20966c> collection) {
        this.f51356d = new ArrayList<>();
        this.f51357e = false;
        this.f51358f = true;
        this.f51359g = false;
        this.f51360h = new AbstractC1398p() {
            /* class com.p943f.p944a.C20981l.C209821 */

            @Override // androidx.recyclerview.widget.AbstractC1398p
            /* renamed from: a */
            public void mo7365a(int i, int i2) {
                C20981l lVar = C20981l.this;
                lVar.mo71058a(lVar.mo71081e() + i, i2);
            }

            @Override // androidx.recyclerview.widget.AbstractC1398p
            /* renamed from: b */
            public void mo7367b(int i, int i2) {
                C20981l lVar = C20981l.this;
                lVar.mo71063b(lVar.mo71081e() + i, i2);
            }

            @Override // androidx.recyclerview.widget.AbstractC1398p
            /* renamed from: c */
            public void mo7368c(int i, int i2) {
                int e = C20981l.this.mo71081e();
                C20981l.this.mo71066c(i + e, e + i2);
            }

            @Override // androidx.recyclerview.widget.AbstractC1398p
            /* renamed from: a */
            public void mo7366a(int i, int i2, Object obj) {
                C20981l lVar = C20981l.this;
                lVar.mo71059a(lVar.mo71081e() + i, i2, obj);
            }
        };
        this.f51353a = cVar;
        if (cVar != null) {
            cVar.mo71005a(this);
        }
        mo71060a(collection);
    }

    /* renamed from: a */
    public void mo71075a(Collection<? extends AbstractC20966c> collection, C1374g.C1377b bVar) {
        super.mo71064b(this.f51356d);
        this.f51356d.clear();
        this.f51356d.addAll(collection);
        super.mo71060a(collection);
        bVar.mo7413a(this.f51360h);
        mo71080d();
    }

    /* renamed from: a */
    public void mo71076a(Collection<? extends AbstractC20966c> collection, boolean z) {
        mo71075a(collection, C1374g.m6298a(new C20965b(new ArrayList(this.f51356d), collection), z));
    }

    @Override // com.p943f.p944a.AbstractC20970e, com.p943f.p944a.AbstractC20976i
    /* renamed from: a */
    public void mo71013a(AbstractC20966c cVar, int i, int i2) {
        super.mo71013a(cVar, i, i2);
        mo71080d();
    }

    @Override // com.p943f.p944a.AbstractC20970e, com.p943f.p944a.AbstractC20976i
    /* renamed from: b */
    public void mo71024b(AbstractC20966c cVar, int i, int i2) {
        super.mo71024b(cVar, i, i2);
        mo71080d();
    }
}
