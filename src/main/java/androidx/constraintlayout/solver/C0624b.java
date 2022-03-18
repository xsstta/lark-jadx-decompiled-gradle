package androidx.constraintlayout.solver;

import androidx.constraintlayout.solver.C0627d;
import androidx.constraintlayout.solver.SolverVariable;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;

/* renamed from: androidx.constraintlayout.solver.b */
public class C0624b implements C0627d.AbstractC0628a {

    /* renamed from: a */
    SolverVariable f2420a;

    /* renamed from: b */
    float f2421b;

    /* renamed from: c */
    boolean f2422c;

    /* renamed from: d */
    ArrayList<SolverVariable> f2423d = new ArrayList<>();

    /* renamed from: e */
    public AbstractC0625a f2424e;

    /* renamed from: f */
    boolean f2425f = false;

    /* renamed from: androidx.constraintlayout.solver.b$a */
    public interface AbstractC0625a {
        /* renamed from: a */
        float mo3394a(SolverVariable solverVariable, boolean z);

        /* renamed from: a */
        float mo3395a(C0624b bVar, boolean z);

        /* renamed from: a */
        SolverVariable mo3396a(int i);

        /* renamed from: a */
        void mo3397a();

        /* renamed from: a */
        void mo3398a(float f);

        /* renamed from: a */
        void mo3399a(SolverVariable solverVariable, float f);

        /* renamed from: a */
        void mo3400a(SolverVariable solverVariable, float f, boolean z);

        /* renamed from: a */
        boolean mo3401a(SolverVariable solverVariable);

        /* renamed from: b */
        float mo3402b(int i);

        /* renamed from: b */
        float mo3403b(SolverVariable solverVariable);

        /* renamed from: b */
        void mo3404b();

        /* renamed from: c */
        int mo3405c();
    }

    @Override // androidx.constraintlayout.solver.C0627d.AbstractC0628a
    /* renamed from: g */
    public SolverVariable mo3437g() {
        return this.f2420a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo3419a() {
        SolverVariable solverVariable = this.f2420a;
        return solverVariable != null && (solverVariable.f2400i == SolverVariable.Type.UNRESTRICTED || this.f2421b >= BitmapDescriptorFactory.HUE_RED);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo3420a(SolverVariable solverVariable) {
        return this.f2424e.mo3401a(solverVariable);
    }

    /* renamed from: a */
    public C0624b mo3415a(C0627d dVar, int i) {
        this.f2424e.mo3399a(dVar.mo3439a(i, "ep"), 1.0f);
        this.f2424e.mo3399a(dVar.mo3439a(i, "em"), -1.0f);
        return this;
    }

    /* renamed from: a */
    public C0624b mo3414a(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f) {
        this.f2424e.mo3399a(solverVariable, -1.0f);
        this.f2424e.mo3399a(solverVariable2, 1.0f);
        this.f2424e.mo3399a(solverVariable3, f);
        this.f2424e.mo3399a(solverVariable4, -f);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo3421a(C0627d dVar) {
        boolean z;
        SolverVariable b = mo3422b(dVar);
        if (b == null) {
            z = true;
        } else {
            mo3427b(b);
            z = false;
        }
        if (this.f2424e.mo3405c() == 0) {
            this.f2425f = true;
        }
        return z;
    }

    /* renamed from: a */
    public void mo3418a(C0627d dVar, C0624b bVar, boolean z) {
        this.f2421b += bVar.f2421b * this.f2424e.mo3395a(bVar, z);
        if (z) {
            bVar.f2420a.mo3392b(this);
        }
        if (C0627d.f2432c && this.f2420a != null && this.f2424e.mo3405c() == 0) {
            this.f2425f = true;
            dVar.f2441g = true;
        }
    }

    /* renamed from: a */
    public void mo3417a(C0627d dVar, SolverVariable solverVariable, boolean z) {
        if (solverVariable.f2397f) {
            this.f2421b += solverVariable.f2396e * this.f2424e.mo3403b(solverVariable);
            this.f2424e.mo3394a(solverVariable, z);
            if (z) {
                solverVariable.mo3392b(this);
            }
            if (C0627d.f2432c && solverVariable != null && this.f2424e.mo3405c() == 0) {
                this.f2425f = true;
                dVar.f2441g = true;
            }
        }
    }

    @Override // androidx.constraintlayout.solver.C0627d.AbstractC0628a
    /* renamed from: a */
    public void mo3416a(C0627d.AbstractC0628a aVar) {
        if (aVar instanceof C0624b) {
            C0624b bVar = (C0624b) aVar;
            this.f2420a = null;
            this.f2424e.mo3397a();
            for (int i = 0; i < bVar.f2424e.mo3405c(); i++) {
                this.f2424e.mo3400a(bVar.f2424e.mo3396a(i), bVar.f2424e.mo3402b(i), true);
            }
        }
    }

    public String toString() {
        return mo3426b();
    }

    public C0624b() {
    }

    @Override // androidx.constraintlayout.solver.C0627d.AbstractC0628a
    /* renamed from: f */
    public void mo3436f() {
        this.f2424e.mo3397a();
        this.f2420a = null;
        this.f2421b = BitmapDescriptorFactory.HUE_RED;
    }

    /* renamed from: c */
    public void mo3431c() {
        this.f2420a = null;
        this.f2424e.mo3397a();
        this.f2421b = BitmapDescriptorFactory.HUE_RED;
        this.f2425f = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo3433d() {
        float f = this.f2421b;
        if (f < BitmapDescriptorFactory.HUE_RED) {
            this.f2421b = f * -1.0f;
            this.f2424e.mo3404b();
        }
    }

    @Override // androidx.constraintlayout.solver.C0627d.AbstractC0628a
    /* renamed from: e */
    public boolean mo3435e() {
        if (this.f2420a == null && this.f2421b == BitmapDescriptorFactory.HUE_RED && this.f2424e.mo3405c() == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c1  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo3426b() {
        /*
        // Method dump skipped, instructions count: 241
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.C0624b.mo3426b():java.lang.String");
    }

    /* renamed from: c */
    public SolverVariable mo3429c(SolverVariable solverVariable) {
        return m2828a((boolean[]) null, solverVariable);
    }

    public C0624b(C0626c cVar) {
        this.f2424e = new C0623a(this, cVar);
    }

    @Override // androidx.constraintlayout.solver.C0627d.AbstractC0628a
    /* renamed from: d */
    public void mo3434d(SolverVariable solverVariable) {
        float f = 1.0f;
        if (solverVariable.f2395d != 1) {
            if (solverVariable.f2395d == 2) {
                f = 1000.0f;
            } else if (solverVariable.f2395d == 3) {
                f = 1000000.0f;
            } else if (solverVariable.f2395d == 4) {
                f = 1.0E9f;
            } else if (solverVariable.f2395d == 5) {
                f = 1.0E12f;
            }
        }
        this.f2424e.mo3399a(solverVariable, f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public SolverVariable mo3422b(C0627d dVar) {
        boolean a;
        boolean a2;
        int c = this.f2424e.mo3405c();
        SolverVariable solverVariable = null;
        SolverVariable solverVariable2 = null;
        boolean z = false;
        boolean z2 = false;
        float f = BitmapDescriptorFactory.HUE_RED;
        float f2 = BitmapDescriptorFactory.HUE_RED;
        for (int i = 0; i < c; i++) {
            float b = this.f2424e.mo3402b(i);
            SolverVariable a3 = this.f2424e.mo3396a(i);
            if (a3.f2400i == SolverVariable.Type.UNRESTRICTED) {
                if (solverVariable == null) {
                    a2 = m2829a(a3, dVar);
                } else if (f > b) {
                    a2 = m2829a(a3, dVar);
                } else if (!z && m2829a(a3, dVar)) {
                    f = b;
                    solverVariable = a3;
                    z = true;
                }
                z = a2;
                f = b;
                solverVariable = a3;
            } else if (solverVariable == null && b < BitmapDescriptorFactory.HUE_RED) {
                if (solverVariable2 == null) {
                    a = m2829a(a3, dVar);
                } else if (f2 > b) {
                    a = m2829a(a3, dVar);
                } else if (!z2 && m2829a(a3, dVar)) {
                    f2 = b;
                    solverVariable2 = a3;
                    z2 = true;
                }
                z2 = a;
                f2 = b;
                solverVariable2 = a3;
            }
        }
        if (solverVariable != null) {
            return solverVariable;
        }
        return solverVariable2;
    }

    /* renamed from: c */
    public void mo3432c(C0627d dVar) {
        if (dVar.f2443i.length != 0) {
            boolean z = false;
            while (!z) {
                int c = this.f2424e.mo3405c();
                for (int i = 0; i < c; i++) {
                    SolverVariable a = this.f2424e.mo3396a(i);
                    if (a.f2394c != -1 || a.f2397f || a.f2404m) {
                        this.f2423d.add(a);
                    }
                }
                int size = this.f2423d.size();
                if (size > 0) {
                    for (int i2 = 0; i2 < size; i2++) {
                        SolverVariable solverVariable = this.f2423d.get(i2);
                        if (solverVariable.f2397f) {
                            mo3417a(dVar, solverVariable, true);
                        } else if (solverVariable.f2404m) {
                            mo3428b(dVar, solverVariable, true);
                        } else {
                            mo3418a(dVar, dVar.f2443i[solverVariable.f2394c], true);
                        }
                    }
                    this.f2423d.clear();
                } else {
                    z = true;
                }
            }
            if (C0627d.f2432c && this.f2420a != null && this.f2424e.mo3405c() == 0) {
                this.f2425f = true;
                dVar.f2441g = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo3427b(SolverVariable solverVariable) {
        SolverVariable solverVariable2 = this.f2420a;
        if (solverVariable2 != null) {
            this.f2424e.mo3399a(solverVariable2, -1.0f);
            this.f2420a.f2394c = -1;
            this.f2420a = null;
        }
        float a = this.f2424e.mo3394a(solverVariable, true) * -1.0f;
        this.f2420a = solverVariable;
        if (a != 1.0f) {
            this.f2421b /= a;
            this.f2424e.mo3398a(a);
        }
    }

    /* renamed from: a */
    private boolean m2829a(SolverVariable solverVariable, C0627d dVar) {
        if (solverVariable.f2403l <= 1) {
            return true;
        }
        return false;
    }

    @Override // androidx.constraintlayout.solver.C0627d.AbstractC0628a
    /* renamed from: a */
    public SolverVariable mo3407a(C0627d dVar, boolean[] zArr) {
        return m2828a(zArr, (SolverVariable) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C0624b mo3430c(SolverVariable solverVariable, int i) {
        this.f2424e.mo3399a(solverVariable, (float) i);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0624b mo3409a(SolverVariable solverVariable, int i) {
        this.f2420a = solverVariable;
        float f = (float) i;
        solverVariable.f2396e = f;
        this.f2421b = f;
        this.f2425f = true;
        return this;
    }

    /* renamed from: b */
    public C0624b mo3423b(SolverVariable solverVariable, int i) {
        if (i < 0) {
            this.f2421b = (float) (i * -1);
            this.f2424e.mo3399a(solverVariable, 1.0f);
        } else {
            this.f2421b = (float) i;
            this.f2424e.mo3399a(solverVariable, -1.0f);
        }
        return this;
    }

    /* renamed from: a */
    private SolverVariable m2828a(boolean[] zArr, SolverVariable solverVariable) {
        int c = this.f2424e.mo3405c();
        SolverVariable solverVariable2 = null;
        float f = BitmapDescriptorFactory.HUE_RED;
        for (int i = 0; i < c; i++) {
            float b = this.f2424e.mo3402b(i);
            if (b < BitmapDescriptorFactory.HUE_RED) {
                SolverVariable a = this.f2424e.mo3396a(i);
                if ((zArr == null || !zArr[a.f2393b]) && a != solverVariable && ((a.f2400i == SolverVariable.Type.SLACK || a.f2400i == SolverVariable.Type.ERROR) && b < f)) {
                    f = b;
                    solverVariable2 = a;
                }
            }
        }
        return solverVariable2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0624b mo3410a(SolverVariable solverVariable, SolverVariable solverVariable2, float f) {
        this.f2424e.mo3399a(solverVariable, -1.0f);
        this.f2424e.mo3399a(solverVariable2, f);
        return this;
    }

    /* renamed from: a */
    public C0624b mo3411a(SolverVariable solverVariable, SolverVariable solverVariable2, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f2421b = (float) i;
        }
        if (!z) {
            this.f2424e.mo3399a(solverVariable, -1.0f);
            this.f2424e.mo3399a(solverVariable2, 1.0f);
        } else {
            this.f2424e.mo3399a(solverVariable, 1.0f);
            this.f2424e.mo3399a(solverVariable2, -1.0f);
        }
        return this;
    }

    /* renamed from: b */
    public void mo3428b(C0627d dVar, SolverVariable solverVariable, boolean z) {
        if (solverVariable.f2404m) {
            float b = this.f2424e.mo3403b(solverVariable);
            this.f2421b += solverVariable.f2406o * b;
            this.f2424e.mo3394a(solverVariable, z);
            if (z) {
                solverVariable.mo3392b(this);
            }
            this.f2424e.mo3400a(dVar.f2448n.f2429d[solverVariable.f2405n], b, z);
            if (C0627d.f2432c && solverVariable != null && this.f2424e.mo3405c() == 0) {
                this.f2425f = true;
                dVar.f2441g = true;
            }
        }
    }

    /* renamed from: b */
    public C0624b mo3424b(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f2421b = (float) i;
        }
        if (!z) {
            this.f2424e.mo3399a(solverVariable, -1.0f);
            this.f2424e.mo3399a(solverVariable2, 1.0f);
            this.f2424e.mo3399a(solverVariable3, -1.0f);
        } else {
            this.f2424e.mo3399a(solverVariable, 1.0f);
            this.f2424e.mo3399a(solverVariable2, -1.0f);
            this.f2424e.mo3399a(solverVariable3, 1.0f);
        }
        return this;
    }

    /* renamed from: a */
    public C0624b mo3413a(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f2421b = (float) i;
        }
        if (!z) {
            this.f2424e.mo3399a(solverVariable, -1.0f);
            this.f2424e.mo3399a(solverVariable2, 1.0f);
            this.f2424e.mo3399a(solverVariable3, 1.0f);
        } else {
            this.f2424e.mo3399a(solverVariable, 1.0f);
            this.f2424e.mo3399a(solverVariable2, -1.0f);
            this.f2424e.mo3399a(solverVariable3, -1.0f);
        }
        return this;
    }

    /* renamed from: b */
    public C0624b mo3425b(SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4, float f) {
        this.f2424e.mo3399a(solverVariable3, 0.5f);
        this.f2424e.mo3399a(solverVariable4, 0.5f);
        this.f2424e.mo3399a(solverVariable, -0.5f);
        this.f2424e.mo3399a(solverVariable2, -0.5f);
        this.f2421b = -f;
        return this;
    }

    /* renamed from: a */
    public C0624b mo3408a(float f, float f2, float f3, SolverVariable solverVariable, SolverVariable solverVariable2, SolverVariable solverVariable3, SolverVariable solverVariable4) {
        this.f2421b = BitmapDescriptorFactory.HUE_RED;
        if (f2 == BitmapDescriptorFactory.HUE_RED || f == f3) {
            this.f2424e.mo3399a(solverVariable, 1.0f);
            this.f2424e.mo3399a(solverVariable2, -1.0f);
            this.f2424e.mo3399a(solverVariable4, 1.0f);
            this.f2424e.mo3399a(solverVariable3, -1.0f);
        } else if (f == BitmapDescriptorFactory.HUE_RED) {
            this.f2424e.mo3399a(solverVariable, 1.0f);
            this.f2424e.mo3399a(solverVariable2, -1.0f);
        } else if (f3 == BitmapDescriptorFactory.HUE_RED) {
            this.f2424e.mo3399a(solverVariable3, 1.0f);
            this.f2424e.mo3399a(solverVariable4, -1.0f);
        } else {
            float f4 = (f / f2) / (f3 / f2);
            this.f2424e.mo3399a(solverVariable, 1.0f);
            this.f2424e.mo3399a(solverVariable2, -1.0f);
            this.f2424e.mo3399a(solverVariable4, f4);
            this.f2424e.mo3399a(solverVariable3, -f4);
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0624b mo3412a(SolverVariable solverVariable, SolverVariable solverVariable2, int i, float f, SolverVariable solverVariable3, SolverVariable solverVariable4, int i2) {
        if (solverVariable2 == solverVariable3) {
            this.f2424e.mo3399a(solverVariable, 1.0f);
            this.f2424e.mo3399a(solverVariable4, 1.0f);
            this.f2424e.mo3399a(solverVariable2, -2.0f);
            return this;
        }
        if (f == 0.5f) {
            this.f2424e.mo3399a(solverVariable, 1.0f);
            this.f2424e.mo3399a(solverVariable2, -1.0f);
            this.f2424e.mo3399a(solverVariable3, -1.0f);
            this.f2424e.mo3399a(solverVariable4, 1.0f);
            if (i > 0 || i2 > 0) {
                this.f2421b = (float) ((-i) + i2);
            }
        } else if (f <= BitmapDescriptorFactory.HUE_RED) {
            this.f2424e.mo3399a(solverVariable, -1.0f);
            this.f2424e.mo3399a(solverVariable2, 1.0f);
            this.f2421b = (float) i;
        } else if (f >= 1.0f) {
            this.f2424e.mo3399a(solverVariable4, -1.0f);
            this.f2424e.mo3399a(solverVariable3, 1.0f);
            this.f2421b = (float) (-i2);
        } else {
            float f2 = 1.0f - f;
            this.f2424e.mo3399a(solverVariable, f2 * 1.0f);
            this.f2424e.mo3399a(solverVariable2, f2 * -1.0f);
            this.f2424e.mo3399a(solverVariable3, -1.0f * f);
            this.f2424e.mo3399a(solverVariable4, 1.0f * f);
            if (i > 0 || i2 > 0) {
                this.f2421b = (((float) (-i)) * f2) + (((float) i2) * f);
            }
        }
        return this;
    }
}
