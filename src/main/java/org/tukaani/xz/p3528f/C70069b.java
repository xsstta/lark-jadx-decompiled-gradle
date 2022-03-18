package org.tukaani.xz.p3528f;

import com.huawei.hms.feature.dynamic.DynamicModule;
import java.io.IOException;
import org.tukaani.xz.p3527e.C70063a;
import org.tukaani.xz.p3528f.AbstractC70065a;
import org.tukaani.xz.p3529g.AbstractC70077b;

/* renamed from: org.tukaani.xz.f.b */
public final class C70069b extends AbstractC70065a {

    /* renamed from: m */
    public final C70063a f175136m;

    /* renamed from: n */
    public final AbstractC70077b f175137n;

    /* renamed from: o */
    private final C70072b f175138o;

    /* renamed from: p */
    private final C70071a f175139p = new C70071a();

    /* renamed from: q */
    private final C70071a f175140q = new C70071a();

    /* access modifiers changed from: private */
    /* renamed from: org.tukaani.xz.f.b$a */
    public class C70071a extends AbstractC70065a.AbstractC70066a {
        private C70071a() {
            super();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo246767a(int i) throws IOException {
            return C70069b.this.f175137n.mo246779a(this.f175126a, 0) == 0 ? C70069b.this.f175137n.mo246781b(this.f175127b[i]) + 2 : C70069b.this.f175137n.mo246779a(this.f175126a, 1) == 0 ? C70069b.this.f175137n.mo246781b(this.f175128c[i]) + 2 + 8 : C70069b.this.f175137n.mo246781b(this.f175129d) + 2 + 8 + 8;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: org.tukaani.xz.f.b$b */
    public class C70072b extends AbstractC70065a.AbstractC70067b {

        /* renamed from: c */
        private final C70073a[] f175143c;

        /* access modifiers changed from: private */
        /* renamed from: org.tukaani.xz.f.b$b$a */
        public class C70073a extends AbstractC70065a.AbstractC70067b.AbstractC70068a {
            private C70073a() {
                super();
            }

            /* access modifiers changed from: package-private */
            /* renamed from: b */
            public void mo246770b() throws IOException {
                int i = 1;
                if (C70069b.this.f175116c.mo246777g()) {
                    do {
                        i = C70069b.this.f175137n.mo246779a(this.f175134a, i) | (i << 1);
                    } while (i < 256);
                } else {
                    int b = C70069b.this.f175136m.mo246753b(C70069b.this.f175115b[0]);
                    int i2 = DynamicModule.f58006b;
                    int i3 = 1;
                    do {
                        b <<= 1;
                        int i4 = b & i2;
                        int a = C70069b.this.f175137n.mo246779a(this.f175134a, i2 + i4 + i3);
                        i3 = (i3 << 1) | a;
                        i2 &= (~i4) ^ (0 - a);
                    } while (i3 < 256);
                    i = i3;
                }
                C70069b.this.f175136m.mo246748a((byte) i);
                C70069b.this.f175116c.mo246773c();
            }
        }

        C70072b(int i, int i2) {
            super(i, i2);
            this.f175143c = new C70073a[(1 << (i + i2))];
            int i3 = 0;
            while (true) {
                C70073a[] aVarArr = this.f175143c;
                if (i3 < aVarArr.length) {
                    aVarArr[i3] = new C70073a();
                    i3++;
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo246768a() {
            int i = 0;
            while (true) {
                C70073a[] aVarArr = this.f175143c;
                if (i < aVarArr.length) {
                    aVarArr[i].mo246764a();
                    i++;
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo246769b() throws IOException {
            this.f175143c[mo246763a(C70069b.this.f175136m.mo246753b(0), C70069b.this.f175136m.mo246756d())].mo246770b();
        }
    }

    public C70069b(C70063a aVar, AbstractC70077b bVar, int i, int i2, int i3) {
        super(i3);
        this.f175136m = aVar;
        this.f175137n = bVar;
        this.f175138o = new C70072b(i, i2);
        mo246761a();
    }

    /* renamed from: b */
    private int m268801b(int i) throws IOException {
        this.f175116c.mo246774d();
        this.f175115b[3] = this.f175115b[2];
        this.f175115b[2] = this.f175115b[1];
        this.f175115b[1] = this.f175115b[0];
        int a = this.f175139p.mo246767a(i);
        int b = this.f175137n.mo246781b(this.f175123j[m268796a(a)]);
        if (b < 4) {
            this.f175115b[0] = b;
        } else {
            int i2 = (b >> 1) - 1;
            this.f175115b[0] = (2 | (b & 1)) << i2;
            if (b < 14) {
                int[] iArr = this.f175115b;
                iArr[0] = this.f175137n.mo246782c(this.f175124k[b - 4]) | iArr[0];
            } else {
                int[] iArr2 = this.f175115b;
                iArr2[0] = (this.f175137n.mo246778a(i2 - 4) << 4) | iArr2[0];
                int[] iArr3 = this.f175115b;
                iArr3[0] = iArr3[0] | this.f175137n.mo246782c(this.f175125l);
            }
        }
        return a;
    }

    /* renamed from: c */
    private int m268802c(int i) throws IOException {
        int i2;
        if (this.f175137n.mo246779a(this.f175119f, this.f175116c.mo246772b()) != 0) {
            if (this.f175137n.mo246779a(this.f175120g, this.f175116c.mo246772b()) == 0) {
                i2 = this.f175115b[1];
            } else {
                if (this.f175137n.mo246779a(this.f175121h, this.f175116c.mo246772b()) == 0) {
                    i2 = this.f175115b[2];
                } else {
                    i2 = this.f175115b[3];
                    this.f175115b[3] = this.f175115b[2];
                }
                this.f175115b[2] = this.f175115b[1];
            }
            this.f175115b[1] = this.f175115b[0];
            this.f175115b[0] = i2;
        } else if (this.f175137n.mo246779a(this.f175122i[this.f175116c.mo246772b()], i) == 0) {
            this.f175116c.mo246776f();
            return 1;
        }
        this.f175116c.mo246775e();
        return this.f175140q.mo246767a(i);
    }

    @Override // org.tukaani.xz.p3528f.AbstractC70065a
    /* renamed from: a */
    public void mo246761a() {
        super.mo246761a();
        this.f175138o.mo246768a();
        this.f175139p.mo246762a();
        this.f175140q.mo246762a();
    }

    /* renamed from: b */
    public boolean mo246765b() {
        return this.f175115b[0] == -1;
    }

    /* renamed from: c */
    public void mo246766c() throws IOException {
        this.f175136m.mo246757e();
        while (this.f175136m.mo246754b()) {
            int d = this.f175136m.mo246756d() & this.f175114a;
            if (this.f175137n.mo246779a(this.f175117d[this.f175116c.mo246772b()], d) == 0) {
                this.f175138o.mo246769b();
            } else {
                this.f175136m.mo246750a(this.f175115b[0], this.f175137n.mo246779a(this.f175118e, this.f175116c.mo246772b()) == 0 ? m268801b(d) : m268802c(d));
            }
        }
        this.f175137n.mo246780a();
    }
}
