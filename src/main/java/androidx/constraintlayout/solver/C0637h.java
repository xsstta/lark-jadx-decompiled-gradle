package androidx.constraintlayout.solver;

import androidx.constraintlayout.solver.C0624b;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;

/* renamed from: androidx.constraintlayout.solver.h */
public class C0637h implements C0624b.AbstractC0625a {

    /* renamed from: j */
    private static float f2501j = 0.001f;

    /* renamed from: a */
    int[] f2502a = new int[16];

    /* renamed from: b */
    int[] f2503b = new int[16];

    /* renamed from: c */
    int[] f2504c = new int[16];

    /* renamed from: d */
    float[] f2505d = new float[16];

    /* renamed from: e */
    int[] f2506e = new int[16];

    /* renamed from: f */
    int[] f2507f = new int[16];

    /* renamed from: g */
    int f2508g;

    /* renamed from: h */
    int f2509h = -1;

    /* renamed from: i */
    protected final C0626c f2510i;

    /* renamed from: k */
    private final int f2511k = -1;

    /* renamed from: l */
    private int f2512l = 16;

    /* renamed from: m */
    private int f2513m = 16;

    /* renamed from: n */
    private final C0624b f2514n;

    @Override // androidx.constraintlayout.solver.C0624b.AbstractC0625a
    /* renamed from: c */
    public int mo3405c() {
        return this.f2508g;
    }

    @Override // androidx.constraintlayout.solver.C0624b.AbstractC0625a
    /* renamed from: a */
    public void mo3399a(SolverVariable solverVariable, float f) {
        float f2 = f2501j;
        if (f <= (-f2) || f >= f2) {
            if (this.f2508g == 0) {
                m2929a(0, solverVariable, f);
                m2930a(solverVariable, 0);
                this.f2509h = 0;
                return;
            }
            int c = mo3475c(solverVariable);
            if (c != -1) {
                this.f2505d[c] = f;
                return;
            }
            if (this.f2508g + 1 >= this.f2512l) {
                m2932d();
            }
            int i = this.f2508g;
            int i2 = this.f2509h;
            int i3 = -1;
            for (int i4 = 0; i4 < i; i4++) {
                if (this.f2504c[i2] == solverVariable.f2393b) {
                    this.f2505d[i2] = f;
                    return;
                }
                if (this.f2504c[i2] < solverVariable.f2393b) {
                    i3 = i2;
                }
                i2 = this.f2507f[i2];
                if (i2 == -1) {
                    break;
                }
            }
            m2931b(i3, solverVariable, f);
            return;
        }
        mo3394a(solverVariable, true);
    }

    @Override // androidx.constraintlayout.solver.C0624b.AbstractC0625a
    /* renamed from: a */
    public void mo3400a(SolverVariable solverVariable, float f, boolean z) {
        float f2 = f2501j;
        if (f <= (-f2) || f >= f2) {
            int c = mo3475c(solverVariable);
            if (c == -1) {
                mo3399a(solverVariable, f);
                return;
            }
            float[] fArr = this.f2505d;
            fArr[c] = fArr[c] + f;
            float f3 = fArr[c];
            float f4 = f2501j;
            if (f3 > (-f4) && fArr[c] < f4) {
                fArr[c] = 0.0f;
                mo3394a(solverVariable, z);
            }
        }
    }

    /* renamed from: e */
    private int m2934e() {
        for (int i = 0; i < this.f2512l; i++) {
            if (this.f2504c[i] == -1) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: d */
    private void m2932d() {
        int i = this.f2512l * 2;
        this.f2504c = Arrays.copyOf(this.f2504c, i);
        this.f2505d = Arrays.copyOf(this.f2505d, i);
        this.f2506e = Arrays.copyOf(this.f2506e, i);
        this.f2507f = Arrays.copyOf(this.f2507f, i);
        this.f2503b = Arrays.copyOf(this.f2503b, i);
        for (int i2 = this.f2512l; i2 < i; i2++) {
            this.f2504c[i2] = -1;
            this.f2503b[i2] = -1;
        }
        this.f2512l = i;
    }

    @Override // androidx.constraintlayout.solver.C0624b.AbstractC0625a
    /* renamed from: b */
    public void mo3404b() {
        int i = this.f2508g;
        int i2 = this.f2509h;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.f2505d;
            fArr[i2] = fArr[i2] * -1.0f;
            i2 = this.f2507f[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    public String toString() {
        String str = hashCode() + " { ";
        int i = this.f2508g;
        for (int i2 = 0; i2 < i; i2++) {
            SolverVariable a = mo3396a(i2);
            if (a != null) {
                String str2 = str + a + " = " + mo3402b(i2) + " ";
                int c = mo3475c(a);
                String str3 = str2 + "[p: ";
                String str4 = (this.f2506e[c] != -1 ? str3 + this.f2510i.f2429d[this.f2504c[this.f2506e[c]]] : str3 + "none") + ", n: ";
                str = (this.f2507f[c] != -1 ? str4 + this.f2510i.f2429d[this.f2504c[this.f2507f[c]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }

    @Override // androidx.constraintlayout.solver.C0624b.AbstractC0625a
    /* renamed from: a */
    public void mo3397a() {
        int i = this.f2508g;
        for (int i2 = 0; i2 < i; i2++) {
            SolverVariable a = mo3396a(i2);
            if (a != null) {
                a.mo3392b(this.f2514n);
            }
        }
        for (int i3 = 0; i3 < this.f2512l; i3++) {
            this.f2504c[i3] = -1;
            this.f2503b[i3] = -1;
        }
        for (int i4 = 0; i4 < this.f2513m; i4++) {
            this.f2502a[i4] = -1;
        }
        this.f2508g = 0;
        this.f2509h = -1;
    }

    @Override // androidx.constraintlayout.solver.C0624b.AbstractC0625a
    /* renamed from: a */
    public boolean mo3401a(SolverVariable solverVariable) {
        if (mo3475c(solverVariable) != -1) {
            return true;
        }
        return false;
    }

    @Override // androidx.constraintlayout.solver.C0624b.AbstractC0625a
    /* renamed from: b */
    public float mo3403b(SolverVariable solverVariable) {
        int c = mo3475c(solverVariable);
        if (c != -1) {
            return this.f2505d[c];
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    @Override // androidx.constraintlayout.solver.C0624b.AbstractC0625a
    /* renamed from: b */
    public float mo3402b(int i) {
        int i2 = this.f2508g;
        int i3 = this.f2509h;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i) {
                return this.f2505d[i3];
            }
            i3 = this.f2507f[i3];
            if (i3 == -1) {
                return BitmapDescriptorFactory.HUE_RED;
            }
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    /* renamed from: c */
    public int mo3475c(SolverVariable solverVariable) {
        int[] iArr;
        if (!(this.f2508g == 0 || solverVariable == null)) {
            int i = solverVariable.f2393b;
            int i2 = this.f2502a[i % this.f2513m];
            if (i2 == -1) {
                return -1;
            }
            if (this.f2504c[i2] == i) {
                return i2;
            }
            while (true) {
                iArr = this.f2503b;
                if (iArr[i2] != -1 && this.f2504c[iArr[i2]] != i) {
                    i2 = iArr[i2];
                }
            }
            if (iArr[i2] != -1 && this.f2504c[iArr[i2]] == i) {
                return iArr[i2];
            }
        }
        return -1;
    }

    /* renamed from: d */
    private void m2933d(SolverVariable solverVariable) {
        int[] iArr;
        int i = solverVariable.f2393b % this.f2513m;
        int i2 = this.f2502a[i];
        if (i2 != -1) {
            int i3 = solverVariable.f2393b;
            if (this.f2504c[i2] == i3) {
                int[] iArr2 = this.f2502a;
                int[] iArr3 = this.f2503b;
                iArr2[i] = iArr3[i2];
                iArr3[i2] = -1;
                return;
            }
            while (true) {
                iArr = this.f2503b;
                if (iArr[i2] == -1 || this.f2504c[iArr[i2]] == i3) {
                    int i4 = iArr[i2];
                } else {
                    i2 = iArr[i2];
                }
            }
            int i42 = iArr[i2];
            if (i42 != -1 && this.f2504c[i42] == i3) {
                iArr[i2] = iArr[i42];
                iArr[i42] = -1;
            }
        }
    }

    @Override // androidx.constraintlayout.solver.C0624b.AbstractC0625a
    /* renamed from: a */
    public SolverVariable mo3396a(int i) {
        int i2 = this.f2508g;
        if (i2 == 0) {
            return null;
        }
        int i3 = this.f2509h;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i && i3 != -1) {
                return this.f2510i.f2429d[this.f2504c[i3]];
            }
            i3 = this.f2507f[i3];
            if (i3 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // androidx.constraintlayout.solver.C0624b.AbstractC0625a
    /* renamed from: a */
    public void mo3398a(float f) {
        int i = this.f2508g;
        int i2 = this.f2509h;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.f2505d;
            fArr[i2] = fArr[i2] / f;
            i2 = this.f2507f[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    /* renamed from: a */
    private void m2930a(SolverVariable solverVariable, int i) {
        int[] iArr;
        int i2 = solverVariable.f2393b % this.f2513m;
        int[] iArr2 = this.f2502a;
        int i3 = iArr2[i2];
        if (i3 == -1) {
            iArr2[i2] = i;
        } else {
            while (true) {
                iArr = this.f2503b;
                if (iArr[i3] == -1) {
                    break;
                }
                i3 = iArr[i3];
            }
            iArr[i3] = i;
        }
        this.f2503b[i] = -1;
    }

    C0637h(C0624b bVar, C0626c cVar) {
        this.f2514n = bVar;
        this.f2510i = cVar;
        mo3397a();
    }

    @Override // androidx.constraintlayout.solver.C0624b.AbstractC0625a
    /* renamed from: a */
    public float mo3394a(SolverVariable solverVariable, boolean z) {
        int c = mo3475c(solverVariable);
        if (c == -1) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        m2933d(solverVariable);
        float f = this.f2505d[c];
        if (this.f2509h == c) {
            this.f2509h = this.f2507f[c];
        }
        this.f2504c[c] = -1;
        int[] iArr = this.f2506e;
        if (iArr[c] != -1) {
            int[] iArr2 = this.f2507f;
            iArr2[iArr[c]] = iArr2[c];
        }
        int[] iArr3 = this.f2507f;
        if (iArr3[c] != -1) {
            iArr[iArr3[c]] = iArr[c];
        }
        this.f2508g--;
        solverVariable.f2403l--;
        if (z) {
            solverVariable.mo3392b(this.f2514n);
        }
        return f;
    }

    @Override // androidx.constraintlayout.solver.C0624b.AbstractC0625a
    /* renamed from: a */
    public float mo3395a(C0624b bVar, boolean z) {
        float b = mo3403b(bVar.f2420a);
        mo3394a(bVar.f2420a, z);
        C0637h hVar = (C0637h) bVar.f2424e;
        int c = hVar.mo3405c();
        int i = hVar.f2509h;
        int i2 = 0;
        int i3 = 0;
        while (i2 < c) {
            if (hVar.f2504c[i3] != -1) {
                mo3400a(this.f2510i.f2429d[hVar.f2504c[i3]], hVar.f2505d[i3] * b, z);
                i2++;
            }
            i3++;
        }
        return b;
    }

    /* renamed from: a */
    private void m2929a(int i, SolverVariable solverVariable, float f) {
        this.f2504c[i] = solverVariable.f2393b;
        this.f2505d[i] = f;
        this.f2506e[i] = -1;
        this.f2507f[i] = -1;
        solverVariable.mo3388a(this.f2514n);
        solverVariable.f2403l++;
        this.f2508g++;
    }

    /* renamed from: b */
    private void m2931b(int i, SolverVariable solverVariable, float f) {
        int e = m2934e();
        m2929a(e, solverVariable, f);
        if (i != -1) {
            this.f2506e[e] = i;
            int[] iArr = this.f2507f;
            iArr[e] = iArr[i];
            iArr[i] = e;
        } else {
            this.f2506e[e] = -1;
            if (this.f2508g > 0) {
                this.f2507f[e] = this.f2509h;
                this.f2509h = e;
            } else {
                this.f2507f[e] = -1;
            }
        }
        int[] iArr2 = this.f2507f;
        if (iArr2[e] != -1) {
            this.f2506e[iArr2[e]] = e;
        }
        m2930a(solverVariable, e);
    }
}
