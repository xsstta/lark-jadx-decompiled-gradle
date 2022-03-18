package androidx.constraintlayout.solver;

import androidx.constraintlayout.solver.C0624b;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;

/* renamed from: androidx.constraintlayout.solver.a */
public class C0623a implements C0624b.AbstractC0625a {

    /* renamed from: l */
    private static float f2408l = 0.001f;

    /* renamed from: a */
    int f2409a;

    /* renamed from: b */
    protected final C0626c f2410b;

    /* renamed from: c */
    private final C0624b f2411c;

    /* renamed from: d */
    private int f2412d = 8;

    /* renamed from: e */
    private SolverVariable f2413e;

    /* renamed from: f */
    private int[] f2414f = new int[8];

    /* renamed from: g */
    private int[] f2415g = new int[8];

    /* renamed from: h */
    private float[] f2416h = new float[8];

    /* renamed from: i */
    private int f2417i = -1;

    /* renamed from: j */
    private int f2418j = -1;

    /* renamed from: k */
    private boolean f2419k;

    @Override // androidx.constraintlayout.solver.C0624b.AbstractC0625a
    /* renamed from: c */
    public int mo3405c() {
        return this.f2409a;
    }

    @Override // androidx.constraintlayout.solver.C0624b.AbstractC0625a
    /* renamed from: a */
    public boolean mo3401a(SolverVariable solverVariable) {
        int i = this.f2417i;
        if (i == -1) {
            return false;
        }
        int i2 = 0;
        while (i != -1 && i2 < this.f2409a) {
            if (this.f2414f[i] == solverVariable.f2393b) {
                return true;
            }
            i = this.f2415g[i];
            i2++;
        }
        return false;
    }

    @Override // androidx.constraintlayout.solver.C0624b.AbstractC0625a
    /* renamed from: b */
    public void mo3404b() {
        int i = this.f2417i;
        int i2 = 0;
        while (i != -1 && i2 < this.f2409a) {
            float[] fArr = this.f2416h;
            fArr[i] = fArr[i] * -1.0f;
            i = this.f2415g[i];
            i2++;
        }
    }

    public String toString() {
        int i = this.f2417i;
        String str = "";
        int i2 = 0;
        while (i != -1 && i2 < this.f2409a) {
            str = ((str + " -> ") + this.f2416h[i] + " : ") + this.f2410b.f2429d[this.f2414f[i]];
            i = this.f2415g[i];
            i2++;
        }
        return str;
    }

    @Override // androidx.constraintlayout.solver.C0624b.AbstractC0625a
    /* renamed from: a */
    public final void mo3397a() {
        int i = this.f2417i;
        int i2 = 0;
        while (i != -1 && i2 < this.f2409a) {
            SolverVariable solverVariable = this.f2410b.f2429d[this.f2414f[i]];
            if (solverVariable != null) {
                solverVariable.mo3392b(this.f2411c);
            }
            i = this.f2415g[i];
            i2++;
        }
        this.f2417i = -1;
        this.f2418j = -1;
        this.f2419k = false;
        this.f2409a = 0;
    }

    @Override // androidx.constraintlayout.solver.C0624b.AbstractC0625a
    /* renamed from: a */
    public SolverVariable mo3396a(int i) {
        int i2 = this.f2417i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f2409a) {
            if (i3 == i) {
                return this.f2410b.f2429d[this.f2414f[i2]];
            }
            i2 = this.f2415g[i2];
            i3++;
        }
        return null;
    }

    @Override // androidx.constraintlayout.solver.C0624b.AbstractC0625a
    /* renamed from: b */
    public float mo3402b(int i) {
        int i2 = this.f2417i;
        int i3 = 0;
        while (i2 != -1 && i3 < this.f2409a) {
            if (i3 == i) {
                return this.f2416h[i2];
            }
            i2 = this.f2415g[i2];
            i3++;
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    @Override // androidx.constraintlayout.solver.C0624b.AbstractC0625a
    /* renamed from: b */
    public final float mo3403b(SolverVariable solverVariable) {
        int i = this.f2417i;
        int i2 = 0;
        while (i != -1 && i2 < this.f2409a) {
            if (this.f2414f[i] == solverVariable.f2393b) {
                return this.f2416h[i];
            }
            i = this.f2415g[i];
            i2++;
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    @Override // androidx.constraintlayout.solver.C0624b.AbstractC0625a
    /* renamed from: a */
    public void mo3398a(float f) {
        int i = this.f2417i;
        int i2 = 0;
        while (i != -1 && i2 < this.f2409a) {
            float[] fArr = this.f2416h;
            fArr[i] = fArr[i] / f;
            i = this.f2415g[i];
            i2++;
        }
    }

    C0623a(C0624b bVar, C0626c cVar) {
        this.f2411c = bVar;
        this.f2410b = cVar;
    }

    @Override // androidx.constraintlayout.solver.C0624b.AbstractC0625a
    /* renamed from: a */
    public float mo3395a(C0624b bVar, boolean z) {
        float b = mo3403b(bVar.f2420a);
        mo3394a(bVar.f2420a, z);
        C0624b.AbstractC0625a aVar = bVar.f2424e;
        int c = aVar.mo3405c();
        for (int i = 0; i < c; i++) {
            SolverVariable a = aVar.mo3396a(i);
            mo3400a(a, aVar.mo3403b(a) * b, z);
        }
        return b;
    }

    @Override // androidx.constraintlayout.solver.C0624b.AbstractC0625a
    /* renamed from: a */
    public final float mo3394a(SolverVariable solverVariable, boolean z) {
        if (this.f2413e == solverVariable) {
            this.f2413e = null;
        }
        int i = this.f2417i;
        if (i == -1) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f2409a) {
            if (this.f2414f[i] == solverVariable.f2393b) {
                if (i == this.f2417i) {
                    this.f2417i = this.f2415g[i];
                } else {
                    int[] iArr = this.f2415g;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    solverVariable.mo3392b(this.f2411c);
                }
                solverVariable.f2403l--;
                this.f2409a--;
                this.f2414f[i] = -1;
                if (this.f2419k) {
                    this.f2418j = i;
                }
                return this.f2416h[i];
            }
            i2++;
            i3 = i;
            i = this.f2415g[i];
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    @Override // androidx.constraintlayout.solver.C0624b.AbstractC0625a
    /* renamed from: a */
    public final void mo3399a(SolverVariable solverVariable, float f) {
        if (f == BitmapDescriptorFactory.HUE_RED) {
            mo3394a(solverVariable, true);
            return;
        }
        int i = this.f2417i;
        if (i == -1) {
            this.f2417i = 0;
            this.f2416h[0] = f;
            this.f2414f[0] = solverVariable.f2393b;
            this.f2415g[this.f2417i] = -1;
            solverVariable.f2403l++;
            solverVariable.mo3388a(this.f2411c);
            this.f2409a++;
            if (!this.f2419k) {
                int i2 = this.f2418j + 1;
                this.f2418j = i2;
                int[] iArr = this.f2414f;
                if (i2 >= iArr.length) {
                    this.f2419k = true;
                    this.f2418j = iArr.length - 1;
                    return;
                }
                return;
            }
            return;
        }
        int i3 = 0;
        int i4 = -1;
        while (i != -1 && i3 < this.f2409a) {
            if (this.f2414f[i] == solverVariable.f2393b) {
                this.f2416h[i] = f;
                return;
            }
            if (this.f2414f[i] < solverVariable.f2393b) {
                i4 = i;
            }
            i = this.f2415g[i];
            i3++;
        }
        int i5 = this.f2418j;
        int i6 = i5 + 1;
        if (this.f2419k) {
            int[] iArr2 = this.f2414f;
            if (iArr2[i5] != -1) {
                i5 = iArr2.length;
            }
        } else {
            i5 = i6;
        }
        int[] iArr3 = this.f2414f;
        if (i5 >= iArr3.length && this.f2409a < iArr3.length) {
            int i7 = 0;
            while (true) {
                int[] iArr4 = this.f2414f;
                if (i7 >= iArr4.length) {
                    break;
                } else if (iArr4[i7] == -1) {
                    i5 = i7;
                    break;
                } else {
                    i7++;
                }
            }
        }
        int[] iArr5 = this.f2414f;
        if (i5 >= iArr5.length) {
            i5 = iArr5.length;
            int i8 = this.f2412d * 2;
            this.f2412d = i8;
            this.f2419k = false;
            this.f2418j = i5 - 1;
            this.f2416h = Arrays.copyOf(this.f2416h, i8);
            this.f2414f = Arrays.copyOf(this.f2414f, this.f2412d);
            this.f2415g = Arrays.copyOf(this.f2415g, this.f2412d);
        }
        this.f2414f[i5] = solverVariable.f2393b;
        this.f2416h[i5] = f;
        if (i4 != -1) {
            int[] iArr6 = this.f2415g;
            iArr6[i5] = iArr6[i4];
            iArr6[i4] = i5;
        } else {
            this.f2415g[i5] = this.f2417i;
            this.f2417i = i5;
        }
        solverVariable.f2403l++;
        solverVariable.mo3388a(this.f2411c);
        int i9 = this.f2409a + 1;
        this.f2409a = i9;
        if (!this.f2419k) {
            this.f2418j++;
        }
        int[] iArr7 = this.f2414f;
        if (i9 >= iArr7.length) {
            this.f2419k = true;
        }
        if (this.f2418j >= iArr7.length) {
            this.f2419k = true;
            this.f2418j = iArr7.length - 1;
        }
    }

    @Override // androidx.constraintlayout.solver.C0624b.AbstractC0625a
    /* renamed from: a */
    public void mo3400a(SolverVariable solverVariable, float f, boolean z) {
        float f2 = f2408l;
        if (f <= (-f2) || f >= f2) {
            int i = this.f2417i;
            if (i == -1) {
                this.f2417i = 0;
                this.f2416h[0] = f;
                this.f2414f[0] = solverVariable.f2393b;
                this.f2415g[this.f2417i] = -1;
                solverVariable.f2403l++;
                solverVariable.mo3388a(this.f2411c);
                this.f2409a++;
                if (!this.f2419k) {
                    int i2 = this.f2418j + 1;
                    this.f2418j = i2;
                    int[] iArr = this.f2414f;
                    if (i2 >= iArr.length) {
                        this.f2419k = true;
                        this.f2418j = iArr.length - 1;
                        return;
                    }
                    return;
                }
                return;
            }
            int i3 = 0;
            int i4 = -1;
            while (i != -1 && i3 < this.f2409a) {
                if (this.f2414f[i] == solverVariable.f2393b) {
                    float[] fArr = this.f2416h;
                    float f3 = fArr[i] + f;
                    float f4 = f2408l;
                    if (f3 > (-f4) && f3 < f4) {
                        f3 = BitmapDescriptorFactory.HUE_RED;
                    }
                    fArr[i] = f3;
                    if (f3 == BitmapDescriptorFactory.HUE_RED) {
                        if (i == this.f2417i) {
                            this.f2417i = this.f2415g[i];
                        } else {
                            int[] iArr2 = this.f2415g;
                            iArr2[i4] = iArr2[i];
                        }
                        if (z) {
                            solverVariable.mo3392b(this.f2411c);
                        }
                        if (this.f2419k) {
                            this.f2418j = i;
                        }
                        solverVariable.f2403l--;
                        this.f2409a--;
                        return;
                    }
                    return;
                }
                if (this.f2414f[i] < solverVariable.f2393b) {
                    i4 = i;
                }
                i = this.f2415g[i];
                i3++;
            }
            int i5 = this.f2418j;
            int i6 = i5 + 1;
            if (this.f2419k) {
                int[] iArr3 = this.f2414f;
                if (iArr3[i5] != -1) {
                    i5 = iArr3.length;
                }
            } else {
                i5 = i6;
            }
            int[] iArr4 = this.f2414f;
            if (i5 >= iArr4.length && this.f2409a < iArr4.length) {
                int i7 = 0;
                while (true) {
                    int[] iArr5 = this.f2414f;
                    if (i7 >= iArr5.length) {
                        break;
                    } else if (iArr5[i7] == -1) {
                        i5 = i7;
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            int[] iArr6 = this.f2414f;
            if (i5 >= iArr6.length) {
                i5 = iArr6.length;
                int i8 = this.f2412d * 2;
                this.f2412d = i8;
                this.f2419k = false;
                this.f2418j = i5 - 1;
                this.f2416h = Arrays.copyOf(this.f2416h, i8);
                this.f2414f = Arrays.copyOf(this.f2414f, this.f2412d);
                this.f2415g = Arrays.copyOf(this.f2415g, this.f2412d);
            }
            this.f2414f[i5] = solverVariable.f2393b;
            this.f2416h[i5] = f;
            if (i4 != -1) {
                int[] iArr7 = this.f2415g;
                iArr7[i5] = iArr7[i4];
                iArr7[i4] = i5;
            } else {
                this.f2415g[i5] = this.f2417i;
                this.f2417i = i5;
            }
            solverVariable.f2403l++;
            solverVariable.mo3388a(this.f2411c);
            this.f2409a++;
            if (!this.f2419k) {
                this.f2418j++;
            }
            int i9 = this.f2418j;
            int[] iArr8 = this.f2414f;
            if (i9 >= iArr8.length) {
                this.f2419k = true;
                this.f2418j = iArr8.length - 1;
            }
        }
    }
}
