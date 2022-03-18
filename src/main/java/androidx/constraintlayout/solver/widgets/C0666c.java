package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;

/* renamed from: androidx.constraintlayout.solver.widgets.c */
public class C0666c {

    /* renamed from: a */
    protected ConstraintWidget f2667a;

    /* renamed from: b */
    protected ConstraintWidget f2668b;

    /* renamed from: c */
    protected ConstraintWidget f2669c;

    /* renamed from: d */
    protected ConstraintWidget f2670d;

    /* renamed from: e */
    protected ConstraintWidget f2671e;

    /* renamed from: f */
    protected ConstraintWidget f2672f;

    /* renamed from: g */
    protected ConstraintWidget f2673g;

    /* renamed from: h */
    protected ArrayList<ConstraintWidget> f2674h;

    /* renamed from: i */
    protected int f2675i;

    /* renamed from: j */
    protected int f2676j;

    /* renamed from: k */
    protected float f2677k;

    /* renamed from: l */
    int f2678l;

    /* renamed from: m */
    int f2679m;

    /* renamed from: n */
    int f2680n;

    /* renamed from: o */
    boolean f2681o;

    /* renamed from: p */
    protected boolean f2682p;

    /* renamed from: q */
    protected boolean f2683q;

    /* renamed from: r */
    protected boolean f2684r;

    /* renamed from: s */
    protected boolean f2685s;

    /* renamed from: t */
    private int f2686t;

    /* renamed from: u */
    private boolean f2687u;

    /* renamed from: v */
    private boolean f2688v;

    /* renamed from: a */
    public void mo3658a() {
        if (!this.f2688v) {
            m3197b();
        }
        this.f2688v = true;
    }

    /* renamed from: b */
    private void m3197b() {
        int i = this.f2686t * 2;
        ConstraintWidget constraintWidget = this.f2667a;
        boolean z = true;
        this.f2681o = true;
        ConstraintWidget constraintWidget2 = constraintWidget;
        boolean z2 = false;
        while (!z2) {
            this.f2675i++;
            ConstraintWidget constraintWidget3 = null;
            constraintWidget.ar[this.f2686t] = null;
            constraintWidget.aq[this.f2686t] = null;
            if (constraintWidget.mo3596w() != 8) {
                this.f2678l++;
                if (constraintWidget.mo3594v(this.f2686t) != ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    this.f2679m += constraintWidget.mo3571k(this.f2686t);
                }
                int j = this.f2679m + constraintWidget.f2538G[i].mo3493j();
                this.f2679m = j;
                int i2 = i + 1;
                this.f2679m = j + constraintWidget.f2538G[i2].mo3493j();
                int j2 = this.f2680n + constraintWidget.f2538G[i].mo3493j();
                this.f2680n = j2;
                this.f2680n = j2 + constraintWidget.f2538G[i2].mo3493j();
                if (this.f2668b == null) {
                    this.f2668b = constraintWidget;
                }
                this.f2670d = constraintWidget;
                if (constraintWidget.f2540I[this.f2686t] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
                    if (constraintWidget.f2570n[this.f2686t] == 0 || constraintWidget.f2570n[this.f2686t] == 3 || constraintWidget.f2570n[this.f2686t] == 2) {
                        this.f2676j++;
                        float f = constraintWidget.ap[this.f2686t];
                        if (f > BitmapDescriptorFactory.HUE_RED) {
                            this.f2677k += constraintWidget.ap[this.f2686t];
                        }
                        if (m3196a(constraintWidget, this.f2686t)) {
                            if (f < BitmapDescriptorFactory.HUE_RED) {
                                this.f2682p = true;
                            } else {
                                this.f2683q = true;
                            }
                            if (this.f2674h == null) {
                                this.f2674h = new ArrayList<>();
                            }
                            this.f2674h.add(constraintWidget);
                        }
                        if (this.f2672f == null) {
                            this.f2672f = constraintWidget;
                        }
                        ConstraintWidget constraintWidget4 = this.f2673g;
                        if (constraintWidget4 != null) {
                            constraintWidget4.aq[this.f2686t] = constraintWidget;
                        }
                        this.f2673g = constraintWidget;
                    }
                    if (this.f2686t == 0) {
                        if (constraintWidget.f2568l != 0) {
                            this.f2681o = false;
                        } else if (!(constraintWidget.f2571o == 0 && constraintWidget.f2572p == 0)) {
                            this.f2681o = false;
                        }
                    } else if (constraintWidget.f2569m != 0) {
                        this.f2681o = false;
                    } else if (!(constraintWidget.f2574r == 0 && constraintWidget.f2575s == 0)) {
                        this.f2681o = false;
                    }
                    if (constraintWidget.f2544M != BitmapDescriptorFactory.HUE_RED) {
                        this.f2681o = false;
                        this.f2685s = true;
                    }
                }
            }
            if (constraintWidget2 != constraintWidget) {
                constraintWidget2.ar[this.f2686t] = constraintWidget;
            }
            ConstraintAnchor constraintAnchor = constraintWidget.f2538G[i + 1].f2523c;
            if (constraintAnchor != null) {
                ConstraintWidget constraintWidget5 = constraintAnchor.f2521a;
                if (constraintWidget5.f2538G[i].f2523c != null && constraintWidget5.f2538G[i].f2523c.f2521a == constraintWidget) {
                    constraintWidget3 = constraintWidget5;
                }
            }
            if (constraintWidget3 == null) {
                constraintWidget3 = constraintWidget;
                z2 = true;
            }
            constraintWidget2 = constraintWidget;
            constraintWidget = constraintWidget3;
        }
        ConstraintWidget constraintWidget6 = this.f2668b;
        if (constraintWidget6 != null) {
            this.f2679m -= constraintWidget6.f2538G[i].mo3493j();
        }
        ConstraintWidget constraintWidget7 = this.f2670d;
        if (constraintWidget7 != null) {
            this.f2679m -= constraintWidget7.f2538G[i + 1].mo3493j();
        }
        this.f2669c = constraintWidget;
        if (this.f2686t != 0 || !this.f2687u) {
            this.f2671e = this.f2667a;
        } else {
            this.f2671e = constraintWidget;
        }
        if (!this.f2683q || !this.f2682p) {
            z = false;
        }
        this.f2684r = z;
    }

    /* renamed from: a */
    private static boolean m3196a(ConstraintWidget constraintWidget, int i) {
        if (constraintWidget.mo3596w() != 8 && constraintWidget.f2540I[i] == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT && (constraintWidget.f2570n[i] == 0 || constraintWidget.f2570n[i] == 3)) {
            return true;
        }
        return false;
    }

    public C0666c(ConstraintWidget constraintWidget, int i, boolean z) {
        this.f2667a = constraintWidget;
        this.f2686t = i;
        this.f2687u = z;
    }
}
