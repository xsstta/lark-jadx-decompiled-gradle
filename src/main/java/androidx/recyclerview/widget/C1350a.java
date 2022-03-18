package androidx.recyclerview.widget;

import androidx.core.util.Pools;
import androidx.recyclerview.widget.C1399q;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.a */
public class C1350a implements C1399q.AbstractC1400a {

    /* renamed from: a */
    final ArrayList<C1352b> f4777a;

    /* renamed from: b */
    final ArrayList<C1352b> f4778b;

    /* renamed from: c */
    final AbstractC1351a f4779c;

    /* renamed from: d */
    Runnable f4780d;

    /* renamed from: e */
    final boolean f4781e;

    /* renamed from: f */
    final C1399q f4782f;

    /* renamed from: g */
    private Pools.AbstractC0839a<C1352b> f4783g;

    /* renamed from: h */
    private int f4784h;

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.a$a */
    public interface AbstractC1351a {
        /* renamed from: a */
        RecyclerView.ViewHolder mo6866a(int i);

        /* renamed from: a */
        void mo6867a(int i, int i2);

        /* renamed from: a */
        void mo6868a(int i, int i2, Object obj);

        /* renamed from: a */
        void mo6869a(C1352b bVar);

        /* renamed from: b */
        void mo6870b(int i, int i2);

        /* renamed from: b */
        void mo6871b(C1352b bVar);

        /* renamed from: c */
        void mo6872c(int i, int i2);

        /* renamed from: d */
        void mo6874d(int i, int i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo7351a(int i, int i2, Object obj) {
        if (i2 < 1) {
            return false;
        }
        this.f4777a.add(mo7344a(4, i, i2, obj));
        this.f4784h |= 4;
        if (this.f4777a.size() == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.a$b */
    public static class C1352b {

        /* renamed from: a */
        int f4785a;

        /* renamed from: b */
        int f4786b;

        /* renamed from: c */
        Object f4787c;

        /* renamed from: d */
        int f4788d;

        public int hashCode() {
            return (((this.f4785a * 31) + this.f4786b) * 31) + this.f4788d;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public String mo7361a() {
            int i = this.f4785a;
            if (i == 1) {
                return "add";
            }
            if (i == 2) {
                return "rm";
            }
            if (i == 4) {
                return "up";
            }
            if (i != 8) {
                return "??";
            }
            return "mv";
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + mo7361a() + ",s:" + this.f4786b + "c:" + this.f4788d + ",p:" + this.f4787c + "]";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C1352b bVar = (C1352b) obj;
            int i = this.f4785a;
            if (i != bVar.f4785a) {
                return false;
            }
            if (i == 8 && Math.abs(this.f4788d - this.f4786b) == 1 && this.f4788d == bVar.f4786b && this.f4786b == bVar.f4788d) {
                return true;
            }
            if (this.f4788d != bVar.f4788d || this.f4786b != bVar.f4786b) {
                return false;
            }
            Object obj2 = this.f4787c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f4787c)) {
                    return false;
                }
            } else if (bVar.f4787c != null) {
                return false;
            }
            return true;
        }

        C1352b(int i, int i2, int i3, Object obj) {
            this.f4785a = i;
            this.f4786b = i2;
            this.f4788d = i3;
            this.f4787c = obj;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7345a() {
        mo7348a(this.f4777a);
        mo7348a(this.f4778b);
        this.f4784h = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo7358d() {
        if (this.f4777a.size() > 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo7360f() {
        if (this.f4778b.isEmpty() || this.f4777a.isEmpty()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo7356c() {
        int size = this.f4778b.size();
        for (int i = 0; i < size; i++) {
            this.f4779c.mo6871b(this.f4778b.get(i));
        }
        mo7348a(this.f4778b);
        this.f4784h = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo7353b() {
        this.f4782f.mo7458a(this.f4777a);
        int size = this.f4777a.size();
        for (int i = 0; i < size; i++) {
            C1352b bVar = this.f4777a.get(i);
            int i2 = bVar.f4785a;
            if (i2 == 1) {
                m6242f(bVar);
            } else if (i2 == 2) {
                m6237c(bVar);
            } else if (i2 == 4) {
                m6239d(bVar);
            } else if (i2 == 8) {
                m6236b(bVar);
            }
            Runnable runnable = this.f4780d;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f4777a.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo7359e() {
        mo7356c();
        int size = this.f4777a.size();
        for (int i = 0; i < size; i++) {
            C1352b bVar = this.f4777a.get(i);
            int i2 = bVar.f4785a;
            if (i2 == 1) {
                this.f4779c.mo6871b(bVar);
                this.f4779c.mo6872c(bVar.f4786b, bVar.f4788d);
            } else if (i2 == 2) {
                this.f4779c.mo6871b(bVar);
                this.f4779c.mo6867a(bVar.f4786b, bVar.f4788d);
            } else if (i2 == 4) {
                this.f4779c.mo6871b(bVar);
                this.f4779c.mo6868a(bVar.f4786b, bVar.f4788d, bVar.f4787c);
            } else if (i2 == 8) {
                this.f4779c.mo6871b(bVar);
                this.f4779c.mo6874d(bVar.f4786b, bVar.f4788d);
            }
            Runnable runnable = this.f4780d;
            if (runnable != null) {
                runnable.run();
            }
        }
        mo7348a(this.f4777a);
        this.f4784h = 0;
    }

    /* renamed from: b */
    private void m6236b(C1352b bVar) {
        m6243g(bVar);
    }

    /* renamed from: f */
    private void m6242f(C1352b bVar) {
        m6243g(bVar);
    }

    C1350a(AbstractC1351a aVar) {
        this(aVar, false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo7352b(int i) {
        return mo7343a(i, 0);
    }

    @Override // androidx.recyclerview.widget.C1399q.AbstractC1400a
    /* renamed from: a */
    public void mo7346a(C1352b bVar) {
        if (!this.f4781e) {
            bVar.f4787c = null;
            this.f4783g.release(bVar);
        }
    }

    /* renamed from: c */
    private void m6237c(C1352b bVar) {
        char c;
        boolean z;
        int i = bVar.f4786b;
        int i2 = bVar.f4786b + bVar.f4788d;
        int i3 = bVar.f4786b;
        char c2 = 65535;
        int i4 = 0;
        while (i3 < i2) {
            if (this.f4779c.mo6866a(i3) != null || m6240d(i3)) {
                if (c2 == 0) {
                    m6241e(mo7344a(2, i, i4, null));
                    z = true;
                } else {
                    z = false;
                }
                c = 1;
            } else {
                if (c2 == 1) {
                    m6243g(mo7344a(2, i, i4, null));
                    z = true;
                } else {
                    z = false;
                }
                c = 0;
            }
            if (z) {
                i3 -= i4;
                i2 -= i4;
                i4 = 1;
            } else {
                i4++;
            }
            i3++;
            c2 = c;
        }
        if (i4 != bVar.f4788d) {
            mo7346a(bVar);
            bVar = mo7344a(2, i, i4, null);
        }
        if (c2 == 0) {
            m6241e(bVar);
        } else {
            m6243g(bVar);
        }
    }

    /* renamed from: d */
    private void m6239d(C1352b bVar) {
        int i = bVar.f4786b;
        int i2 = bVar.f4786b + bVar.f4788d;
        char c = 65535;
        int i3 = 0;
        for (int i4 = bVar.f4786b; i4 < i2; i4++) {
            if (this.f4779c.mo6866a(i4) != null || m6240d(i4)) {
                if (c == 0) {
                    m6241e(mo7344a(4, i, i3, bVar.f4787c));
                    i = i4;
                    i3 = 0;
                }
                c = 1;
            } else {
                if (c == 1) {
                    m6243g(mo7344a(4, i, i3, bVar.f4787c));
                    i = i4;
                    i3 = 0;
                }
                c = 0;
            }
            i3++;
        }
        if (i3 != bVar.f4788d) {
            Object obj = bVar.f4787c;
            mo7346a(bVar);
            bVar = mo7344a(4, i, i3, obj);
        }
        if (c == 0) {
            m6241e(bVar);
        } else {
            m6243g(bVar);
        }
    }

    /* renamed from: g */
    private void m6243g(C1352b bVar) {
        this.f4778b.add(bVar);
        int i = bVar.f4785a;
        if (i == 1) {
            this.f4779c.mo6872c(bVar.f4786b, bVar.f4788d);
        } else if (i == 2) {
            this.f4779c.mo6870b(bVar.f4786b, bVar.f4788d);
        } else if (i == 4) {
            this.f4779c.mo6868a(bVar.f4786b, bVar.f4788d, bVar.f4787c);
        } else if (i == 8) {
            this.f4779c.mo6874d(bVar.f4786b, bVar.f4788d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    /* renamed from: e */
    private void m6241e(C1352b bVar) {
        int i;
        boolean z;
        if (bVar.f4785a == 1 || bVar.f4785a == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int d = m6238d(bVar.f4786b, bVar.f4785a);
        int i2 = bVar.f4786b;
        int i3 = bVar.f4785a;
        if (i3 == 2) {
            i = 0;
        } else if (i3 == 4) {
            i = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + bVar);
        }
        int i4 = 1;
        for (int i5 = 1; i5 < bVar.f4788d; i5++) {
            int d2 = m6238d(bVar.f4786b + (i * i5), bVar.f4785a);
            int i6 = bVar.f4785a;
            if (i6 == 2 ? d2 != d : !(i6 == 4 && d2 == d + 1)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                i4++;
            } else {
                C1352b a = mo7344a(bVar.f4785a, d, i4, bVar.f4787c);
                mo7347a(a, i2);
                mo7346a(a);
                if (bVar.f4785a == 4) {
                    i2 += i4;
                }
                d = d2;
                i4 = 1;
            }
        }
        Object obj = bVar.f4787c;
        mo7346a(bVar);
        if (i4 > 0) {
            C1352b a2 = mo7344a(bVar.f4785a, d, i4, obj);
            mo7347a(a2, i2);
            mo7346a(a2);
        }
    }

    /* renamed from: c */
    public int mo7355c(int i) {
        int size = this.f4777a.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1352b bVar = this.f4777a.get(i2);
            int i3 = bVar.f4785a;
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 == 8) {
                        if (bVar.f4786b == i) {
                            i = bVar.f4788d;
                        } else {
                            if (bVar.f4786b < i) {
                                i--;
                            }
                            if (bVar.f4788d <= i) {
                                i++;
                            }
                        }
                    }
                } else if (bVar.f4786b > i) {
                    continue;
                } else if (bVar.f4786b + bVar.f4788d > i) {
                    return -1;
                } else {
                    i -= bVar.f4788d;
                }
            } else if (bVar.f4786b <= i) {
                i += bVar.f4788d;
            }
        }
        return i;
    }

    /* renamed from: d */
    private boolean m6240d(int i) {
        int size = this.f4778b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1352b bVar = this.f4778b.get(i2);
            if (bVar.f4785a == 8) {
                if (mo7343a(bVar.f4788d, i2 + 1) == i) {
                    return true;
                }
            } else if (bVar.f4785a == 1) {
                int i3 = bVar.f4786b + bVar.f4788d;
                for (int i4 = bVar.f4786b; i4 < i3; i4++) {
                    if (mo7343a(i4, i2 + 1) == i) {
                        return true;
                    }
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7348a(List<C1352b> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            mo7346a(list.get(i));
        }
        list.clear();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo7349a(int i) {
        if ((i & this.f4784h) != 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo7354b(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        this.f4777a.add(mo7344a(1, i, i2, null));
        this.f4784h |= 1;
        if (this.f4777a.size() == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo7357c(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        this.f4777a.add(mo7344a(2, i, i2, null));
        this.f4784h |= 2;
        if (this.f4777a.size() == 1) {
            return true;
        }
        return false;
    }

    C1350a(AbstractC1351a aVar, boolean z) {
        this.f4783g = new Pools.SimplePool(30);
        this.f4777a = new ArrayList<>();
        this.f4778b = new ArrayList<>();
        this.f4784h = 0;
        this.f4779c = aVar;
        this.f4781e = z;
        this.f4782f = new C1399q(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo7343a(int i, int i2) {
        int size = this.f4778b.size();
        while (i2 < size) {
            C1352b bVar = this.f4778b.get(i2);
            if (bVar.f4785a == 8) {
                if (bVar.f4786b == i) {
                    i = bVar.f4788d;
                } else {
                    if (bVar.f4786b < i) {
                        i--;
                    }
                    if (bVar.f4788d <= i) {
                        i++;
                    }
                }
            } else if (bVar.f4786b > i) {
                continue;
            } else if (bVar.f4785a == 2) {
                if (i < bVar.f4786b + bVar.f4788d) {
                    return -1;
                }
                i -= bVar.f4788d;
            } else if (bVar.f4785a == 1) {
                i += bVar.f4788d;
            }
            i2++;
        }
        return i;
    }

    /* renamed from: d */
    private int m6238d(int i, int i2) {
        int i3;
        int i4;
        for (int size = this.f4778b.size() - 1; size >= 0; size--) {
            C1352b bVar = this.f4778b.get(size);
            if (bVar.f4785a == 8) {
                if (bVar.f4786b < bVar.f4788d) {
                    i4 = bVar.f4786b;
                    i3 = bVar.f4788d;
                } else {
                    i4 = bVar.f4788d;
                    i3 = bVar.f4786b;
                }
                if (i < i4 || i > i3) {
                    if (i < bVar.f4786b) {
                        if (i2 == 1) {
                            bVar.f4786b++;
                            bVar.f4788d++;
                        } else if (i2 == 2) {
                            bVar.f4786b--;
                            bVar.f4788d--;
                        }
                    }
                } else if (i4 == bVar.f4786b) {
                    if (i2 == 1) {
                        bVar.f4788d++;
                    } else if (i2 == 2) {
                        bVar.f4788d--;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        bVar.f4786b++;
                    } else if (i2 == 2) {
                        bVar.f4786b--;
                    }
                    i--;
                }
            } else if (bVar.f4786b <= i) {
                if (bVar.f4785a == 1) {
                    i -= bVar.f4788d;
                } else if (bVar.f4785a == 2) {
                    i += bVar.f4788d;
                }
            } else if (i2 == 1) {
                bVar.f4786b++;
            } else if (i2 == 2) {
                bVar.f4786b--;
            }
        }
        for (int size2 = this.f4778b.size() - 1; size2 >= 0; size2--) {
            C1352b bVar2 = this.f4778b.get(size2);
            if (bVar2.f4785a == 8) {
                if (bVar2.f4788d == bVar2.f4786b || bVar2.f4788d < 0) {
                    this.f4778b.remove(size2);
                    mo7346a(bVar2);
                }
            } else if (bVar2.f4788d <= 0) {
                this.f4778b.remove(size2);
                mo7346a(bVar2);
            }
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7347a(C1352b bVar, int i) {
        this.f4779c.mo6869a(bVar);
        int i2 = bVar.f4785a;
        if (i2 == 2) {
            this.f4779c.mo6867a(i, bVar.f4788d);
        } else if (i2 == 4) {
            this.f4779c.mo6868a(i, bVar.f4788d, bVar.f4787c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo7350a(int i, int i2, int i3) {
        if (i == i2) {
            return false;
        }
        if (i3 == 1) {
            this.f4777a.add(mo7344a(8, i, i2, null));
            this.f4784h |= 8;
            if (this.f4777a.size() == 1) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
    }

    @Override // androidx.recyclerview.widget.C1399q.AbstractC1400a
    /* renamed from: a */
    public C1352b mo7344a(int i, int i2, int i3, Object obj) {
        C1352b acquire = this.f4783g.acquire();
        if (acquire == null) {
            return new C1352b(i, i2, i3, obj);
        }
        acquire.f4785a = i;
        acquire.f4786b = i2;
        acquire.f4788d = i3;
        acquire.f4787c = obj;
        return acquire;
    }
}
