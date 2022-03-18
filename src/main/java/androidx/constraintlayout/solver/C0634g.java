package androidx.constraintlayout.solver;

import androidx.constraintlayout.solver.C0624b;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: androidx.constraintlayout.solver.g */
public class C0634g extends C0624b {

    /* renamed from: g */
    C0636a f2491g = new C0636a(this);

    /* renamed from: h */
    C0626c f2492h;

    /* renamed from: i */
    private int f2493i = SmActions.ACTION_ONTHECALL_EXIT;

    /* renamed from: j */
    private SolverVariable[] f2494j = new SolverVariable[SmActions.ACTION_ONTHECALL_EXIT];

    /* renamed from: k */
    private SolverVariable[] f2495k = new SolverVariable[SmActions.ACTION_ONTHECALL_EXIT];

    /* renamed from: l */
    private int f2496l;

    @Override // androidx.constraintlayout.solver.C0627d.AbstractC0628a, androidx.constraintlayout.solver.C0624b
    /* renamed from: e */
    public boolean mo3435e() {
        if (this.f2496l == 0) {
            return true;
        }
        return false;
    }

    @Override // androidx.constraintlayout.solver.C0627d.AbstractC0628a, androidx.constraintlayout.solver.C0624b
    /* renamed from: f */
    public void mo3436f() {
        this.f2496l = 0;
        this.f2421b = BitmapDescriptorFactory.HUE_RED;
    }

    /* renamed from: androidx.constraintlayout.solver.g$a */
    class C0636a implements Comparable {

        /* renamed from: a */
        SolverVariable f2498a;

        /* renamed from: b */
        C0634g f2499b;

        /* renamed from: b */
        public void mo3471b() {
            Arrays.fill(this.f2498a.f2399h, (float) BitmapDescriptorFactory.HUE_RED);
        }

        /* renamed from: a */
        public final boolean mo3469a() {
            for (int i = 8; i >= 0; i--) {
                float f = this.f2498a.f2399h[i];
                if (f > BitmapDescriptorFactory.HUE_RED) {
                    return false;
                }
                if (f < BitmapDescriptorFactory.HUE_RED) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            String str = "[ ";
            if (this.f2498a != null) {
                for (int i = 0; i < 9; i++) {
                    str = str + this.f2498a.f2399h[i] + " ";
                }
            }
            return str + "] " + this.f2498a;
        }

        /* renamed from: a */
        public void mo3468a(SolverVariable solverVariable) {
            this.f2498a = solverVariable;
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.f2498a.f2393b - ((SolverVariable) obj).f2393b;
        }

        /* renamed from: b */
        public final boolean mo3472b(SolverVariable solverVariable) {
            int i = 8;
            while (true) {
                if (i < 0) {
                    break;
                }
                float f = solverVariable.f2399h[i];
                float f2 = this.f2498a.f2399h[i];
                if (f2 == f) {
                    i--;
                } else if (f2 < f) {
                    return true;
                }
            }
            return false;
        }

        public C0636a(C0634g gVar) {
            this.f2499b = gVar;
        }

        /* renamed from: a */
        public boolean mo3470a(SolverVariable solverVariable, float f) {
            boolean z = true;
            if (this.f2498a.f2392a) {
                for (int i = 0; i < 9; i++) {
                    float[] fArr = this.f2498a.f2399h;
                    fArr[i] = fArr[i] + (solverVariable.f2399h[i] * f);
                    if (Math.abs(this.f2498a.f2399h[i]) < 1.0E-4f) {
                        this.f2498a.f2399h[i] = 0.0f;
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    C0634g.this.mo3465e(this.f2498a);
                }
                return false;
            }
            for (int i2 = 0; i2 < 9; i2++) {
                float f2 = solverVariable.f2399h[i2];
                if (f2 != BitmapDescriptorFactory.HUE_RED) {
                    float f3 = f2 * f;
                    if (Math.abs(f3) < 1.0E-4f) {
                        f3 = BitmapDescriptorFactory.HUE_RED;
                    }
                    this.f2498a.f2399h[i2] = f3;
                } else {
                    this.f2498a.f2399h[i2] = 0.0f;
                }
            }
            return true;
        }
    }

    @Override // androidx.constraintlayout.solver.C0624b
    public String toString() {
        String str = "" + " goal -> (" + this.f2421b + ") : ";
        for (int i = 0; i < this.f2496l; i++) {
            this.f2491g.mo3468a(this.f2494j[i]);
            str = str + this.f2491g + " ";
        }
        return str;
    }

    public C0634g(C0626c cVar) {
        super(cVar);
        this.f2492h = cVar;
    }

    @Override // androidx.constraintlayout.solver.C0627d.AbstractC0628a, androidx.constraintlayout.solver.C0624b
    /* renamed from: d */
    public void mo3434d(SolverVariable solverVariable) {
        this.f2491g.mo3468a(solverVariable);
        this.f2491g.mo3471b();
        solverVariable.f2399h[solverVariable.f2395d] = 1.0f;
        m2916f(solverVariable);
    }

    /* renamed from: e */
    public final void mo3465e(SolverVariable solverVariable) {
        int i = 0;
        while (i < this.f2496l) {
            if (this.f2494j[i] == solverVariable) {
                while (true) {
                    int i2 = this.f2496l;
                    if (i < i2 - 1) {
                        SolverVariable[] solverVariableArr = this.f2494j;
                        int i3 = i + 1;
                        solverVariableArr[i] = solverVariableArr[i3];
                        i = i3;
                    } else {
                        this.f2496l = i2 - 1;
                        solverVariable.f2392a = false;
                        return;
                    }
                }
            } else {
                i++;
            }
        }
    }

    /* renamed from: f */
    private final void m2916f(SolverVariable solverVariable) {
        int i;
        int i2 = this.f2496l + 1;
        SolverVariable[] solverVariableArr = this.f2494j;
        if (i2 > solverVariableArr.length) {
            SolverVariable[] solverVariableArr2 = (SolverVariable[]) Arrays.copyOf(solverVariableArr, solverVariableArr.length * 2);
            this.f2494j = solverVariableArr2;
            this.f2495k = (SolverVariable[]) Arrays.copyOf(solverVariableArr2, solverVariableArr2.length * 2);
        }
        SolverVariable[] solverVariableArr3 = this.f2494j;
        int i3 = this.f2496l;
        solverVariableArr3[i3] = solverVariable;
        int i4 = i3 + 1;
        this.f2496l = i4;
        if (i4 > 1 && solverVariableArr3[i4 - 1].f2393b > solverVariable.f2393b) {
            int i5 = 0;
            while (true) {
                i = this.f2496l;
                if (i5 >= i) {
                    break;
                }
                this.f2495k[i5] = this.f2494j[i5];
                i5++;
            }
            Arrays.sort(this.f2495k, 0, i, new Comparator<SolverVariable>() {
                /* class androidx.constraintlayout.solver.C0634g.C06351 */

                /* renamed from: a */
                public int compare(SolverVariable solverVariable, SolverVariable solverVariable2) {
                    return solverVariable.f2393b - solverVariable2.f2393b;
                }
            });
            for (int i6 = 0; i6 < this.f2496l; i6++) {
                this.f2494j[i6] = this.f2495k[i6];
            }
        }
        solverVariable.f2392a = true;
        solverVariable.mo3388a(this);
    }

    @Override // androidx.constraintlayout.solver.C0627d.AbstractC0628a, androidx.constraintlayout.solver.C0624b
    /* renamed from: a */
    public SolverVariable mo3407a(C0627d dVar, boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.f2496l; i2++) {
            SolverVariable solverVariable = this.f2494j[i2];
            if (!zArr[solverVariable.f2393b]) {
                this.f2491g.mo3468a(solverVariable);
                if (i == -1) {
                    if (!this.f2491g.mo3469a()) {
                    }
                } else if (!this.f2491g.mo3472b(this.f2494j[i])) {
                }
                i = i2;
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f2494j[i];
    }

    @Override // androidx.constraintlayout.solver.C0624b
    /* renamed from: a */
    public void mo3418a(C0627d dVar, C0624b bVar, boolean z) {
        SolverVariable solverVariable = bVar.f2420a;
        if (solverVariable != null) {
            C0624b.AbstractC0625a aVar = bVar.f2424e;
            int c = aVar.mo3405c();
            for (int i = 0; i < c; i++) {
                SolverVariable a = aVar.mo3396a(i);
                float b = aVar.mo3402b(i);
                this.f2491g.mo3468a(a);
                if (this.f2491g.mo3470a(solverVariable, b)) {
                    m2916f(a);
                }
                this.f2421b += bVar.f2421b * b;
            }
            mo3465e(solverVariable);
        }
    }
}
