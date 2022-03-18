package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.C0626c;
import androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.widgets.p025a.C0652i;
import androidx.constraintlayout.solver.widgets.p025a.C0660o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ConstraintAnchor {

    /* renamed from: a */
    public final ConstraintWidget f2521a;

    /* renamed from: b */
    public final Type f2522b;

    /* renamed from: c */
    public ConstraintAnchor f2523c;

    /* renamed from: d */
    public int f2524d;

    /* renamed from: e */
    int f2525e = -1;

    /* renamed from: f */
    SolverVariable f2526f;

    /* renamed from: g */
    private HashSet<ConstraintAnchor> f2527g;

    /* renamed from: h */
    private int f2528h;

    /* renamed from: i */
    private boolean f2529i;

    public enum Type {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    /* renamed from: a */
    public HashSet<ConstraintAnchor> mo3477a() {
        return this.f2527g;
    }

    /* renamed from: f */
    public boolean mo3489f() {
        return this.f2529i;
    }

    /* renamed from: g */
    public SolverVariable mo3490g() {
        return this.f2526f;
    }

    /* renamed from: h */
    public ConstraintWidget mo3491h() {
        return this.f2521a;
    }

    /* renamed from: i */
    public Type mo3492i() {
        return this.f2522b;
    }

    /* renamed from: k */
    public ConstraintAnchor mo3494k() {
        return this.f2523c;
    }

    /* renamed from: e */
    public void mo3488e() {
        this.f2529i = false;
        this.f2528h = 0;
    }

    /* renamed from: m */
    public boolean mo3496m() {
        if (this.f2523c != null) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public int mo3487d() {
        if (!this.f2529i) {
            return 0;
        }
        return this.f2528h;
    }

    /* renamed from: b */
    public boolean mo3485b() {
        HashSet<ConstraintAnchor> hashSet = this.f2527g;
        if (hashSet != null && hashSet.size() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public boolean mo3486c() {
        HashSet<ConstraintAnchor> hashSet = this.f2527g;
        if (hashSet == null) {
            return false;
        }
        Iterator<ConstraintAnchor> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().mo3497n().mo3496m()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: j */
    public int mo3493j() {
        ConstraintAnchor constraintAnchor;
        if (this.f2521a.mo3596w() == 8) {
            return 0;
        }
        if (this.f2525e <= -1 || (constraintAnchor = this.f2523c) == null || constraintAnchor.f2521a.mo3596w() != 8) {
            return this.f2524d;
        }
        return this.f2525e;
    }

    /* renamed from: l */
    public void mo3495l() {
        HashSet<ConstraintAnchor> hashSet;
        ConstraintAnchor constraintAnchor = this.f2523c;
        if (!(constraintAnchor == null || (hashSet = constraintAnchor.f2527g) == null)) {
            hashSet.remove(this);
            if (this.f2523c.f2527g.size() == 0) {
                this.f2523c.f2527g = null;
            }
        }
        this.f2527g = null;
        this.f2523c = null;
        this.f2524d = 0;
        this.f2525e = -1;
        this.f2529i = false;
        this.f2528h = 0;
    }

    public String toString() {
        return this.f2521a.mo3599x() + ":" + this.f2522b.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: androidx.constraintlayout.solver.widgets.ConstraintAnchor$1 */
    public static /* synthetic */ class C06381 {

        /* renamed from: a */
        static final /* synthetic */ int[] f2530a;

        /* JADX WARNING: Can't wrap try/catch for region: R(18:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|(3:17|18|20)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
            // Method dump skipped, instructions count: 109
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.ConstraintAnchor.C06381.<clinit>():void");
        }
    }

    /* renamed from: n */
    public final ConstraintAnchor mo3497n() {
        switch (C06381.f2530a[this.f2522b.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f2521a.f2532A;
            case 3:
                return this.f2521a.f2581y;
            case 4:
                return this.f2521a.f2533B;
            case 5:
                return this.f2521a.f2582z;
            default:
                throw new AssertionError(this.f2522b.name());
        }
    }

    /* renamed from: a */
    public void mo3478a(int i) {
        this.f2528h = i;
        this.f2529i = true;
    }

    /* renamed from: b */
    public void mo3484b(int i) {
        if (mo3496m()) {
            this.f2525e = i;
        }
    }

    /* renamed from: a */
    public void mo3480a(C0626c cVar) {
        SolverVariable solverVariable = this.f2526f;
        if (solverVariable == null) {
            this.f2526f = new SolverVariable(SolverVariable.Type.UNRESTRICTED, null);
        } else {
            solverVariable.mo3391b();
        }
    }

    /* renamed from: a */
    public boolean mo3481a(ConstraintAnchor constraintAnchor) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (constraintAnchor == null) {
            return false;
        }
        Type i = constraintAnchor.mo3492i();
        Type type = this.f2522b;
        if (i != type) {
            switch (C06381.f2530a[this.f2522b.ordinal()]) {
                case 1:
                    if (i == Type.BASELINE || i == Type.CENTER_X || i == Type.CENTER_Y) {
                        return false;
                    }
                    return true;
                case 2:
                case 3:
                    if (i == Type.LEFT || i == Type.RIGHT) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!(constraintAnchor.mo3491h() instanceof C0670f)) {
                        return z;
                    }
                    if (z || i == Type.CENTER_X) {
                        z3 = true;
                    }
                    return z3;
                case 4:
                case 5:
                    if (i == Type.TOP || i == Type.BOTTOM) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!(constraintAnchor.mo3491h() instanceof C0670f)) {
                        return z2;
                    }
                    if (z2 || i == Type.CENTER_Y) {
                        z3 = true;
                    }
                    return z3;
                case 6:
                case 7:
                case 8:
                case 9:
                    return false;
                default:
                    throw new AssertionError(this.f2522b.name());
            }
        } else if (type != Type.BASELINE || (constraintAnchor.mo3491h().mo3509K() && mo3491h().mo3509K())) {
            return true;
        } else {
            return false;
        }
    }

    public ConstraintAnchor(ConstraintWidget constraintWidget, Type type) {
        this.f2521a = constraintWidget;
        this.f2522b = type;
    }

    /* renamed from: a */
    public boolean mo3482a(ConstraintAnchor constraintAnchor, int i) {
        return mo3483a(constraintAnchor, i, -1, false);
    }

    /* renamed from: a */
    public void mo3479a(int i, ArrayList<C0660o> arrayList, C0660o oVar) {
        HashSet<ConstraintAnchor> hashSet = this.f2527g;
        if (hashSet != null) {
            Iterator<ConstraintAnchor> it = hashSet.iterator();
            while (it.hasNext()) {
                C0652i.m3132a(it.next().f2521a, i, arrayList, oVar);
            }
        }
    }

    /* renamed from: a */
    public boolean mo3483a(ConstraintAnchor constraintAnchor, int i, int i2, boolean z) {
        if (constraintAnchor == null) {
            mo3495l();
            return true;
        } else if (!z && !mo3481a(constraintAnchor)) {
            return false;
        } else {
            this.f2523c = constraintAnchor;
            if (constraintAnchor.f2527g == null) {
                constraintAnchor.f2527g = new HashSet<>();
            }
            HashSet<ConstraintAnchor> hashSet = this.f2523c.f2527g;
            if (hashSet != null) {
                hashSet.add(this);
            }
            if (i > 0) {
                this.f2524d = i;
            } else {
                this.f2524d = 0;
            }
            this.f2525e = i2;
            return true;
        }
    }
}
