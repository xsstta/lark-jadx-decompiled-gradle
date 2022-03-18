package androidx.constraintlayout.solver.widgets;

import androidx.constraintlayout.solver.C0627d;
import androidx.constraintlayout.solver.C0630e;
import androidx.constraintlayout.solver.SolverVariable;
import androidx.constraintlayout.solver.widgets.ConstraintWidget;
import androidx.constraintlayout.solver.widgets.p025a.C0642b;
import androidx.constraintlayout.solver.widgets.p025a.C0647e;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.ttm.player.MediaPlayer;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: androidx.constraintlayout.solver.widgets.d */
public class C0667d extends C0676k {

    /* renamed from: a */
    C0642b f2689a = new C0642b(this);
    int aA;
    int aB;
    int aC;
    int aD;
    public int aE = 0;
    public int aF = 0;
    C0666c[] aG = new C0666c[4];
    C0666c[] aH = new C0666c[4];
    public boolean aI = false;
    public boolean aJ = false;
    public boolean aK = false;
    public int aL = 0;
    public int aM = 0;
    public boolean aN = false;
    int aO = 0;
    public C0642b.C0643a aP = new C0642b.C0643a();
    private boolean aR = false;
    private int aS = 257;
    private boolean aT = false;
    private boolean aU = false;
    private WeakReference<ConstraintAnchor> aV = null;
    private WeakReference<ConstraintAnchor> aW = null;
    private WeakReference<ConstraintAnchor> aX = null;
    private WeakReference<ConstraintAnchor> aY = null;
    public C0647e aw = new C0647e(this);
    protected C0642b.AbstractC0644b ax = null;
    public C0630e ay;
    protected C0627d az = new C0627d();

    public boolean aa() {
        return false;
    }

    /* renamed from: X */
    public boolean mo3659X() {
        return this.aU;
    }

    /* renamed from: Y */
    public boolean mo3660Y() {
        return this.aR;
    }

    public C0627d ab() {
        return this.az;
    }

    /* renamed from: g */
    public C0642b.AbstractC0644b mo3680g() {
        return this.ax;
    }

    /* renamed from: h */
    public int mo3682h() {
        return this.aS;
    }

    /* renamed from: i */
    public boolean mo3683i() {
        return this.aT;
    }

    /* renamed from: a */
    public boolean mo3668a(boolean z) {
        return this.aw.mo3626a(z);
    }

    /* renamed from: a */
    public boolean mo3669a(boolean z, int i) {
        return this.aw.mo3627a(z, i);
    }

    @Override // androidx.constraintlayout.solver.widgets.ConstraintWidget
    /* renamed from: a */
    public void mo3540a(boolean z, boolean z2) {
        super.mo3540a(z, z2);
        int size = this.aQ.size();
        for (int i = 0; i < size; i++) {
            ((ConstraintWidget) this.aQ.get(i)).mo3540a(z, z2);
        }
    }

    private void ae() {
        this.aE = 0;
        this.aF = 0;
    }

    /* renamed from: b */
    public void mo3604b() {
        this.aw.mo3628b();
    }

    /* renamed from: c */
    public void mo3675c() {
        this.aw.mo3630c();
    }

    /* renamed from: f */
    public void mo3678f() {
        this.f2689a.mo3612a(this);
    }

    @Override // androidx.constraintlayout.solver.widgets.C0676k, androidx.constraintlayout.solver.widgets.ConstraintWidget
    /* renamed from: s */
    public void mo3587s() {
        this.az.mo3452b();
        this.aA = 0;
        this.aC = 0;
        this.aB = 0;
        this.aD = 0;
        this.aN = false;
        super.mo3587s();
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARNING: Unknown variable types count: 1 */
    @Override // androidx.constraintlayout.solver.widgets.C0676k
    /* renamed from: Z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo3661Z() {
        /*
        // Method dump skipped, instructions count: 825
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.solver.widgets.C0667d.mo3661Z():void");
    }

    /* renamed from: a */
    public void mo3664a(C0630e eVar) {
        this.ay = eVar;
        this.az.mo3449a(eVar);
    }

    /* renamed from: g */
    public void mo3681g(boolean z) {
        this.aR = z;
    }

    /* renamed from: f */
    public boolean mo3679f(boolean z) {
        return this.aw.mo3629b(z);
    }

    /* renamed from: b */
    public boolean mo3673b(int i) {
        if ((this.aS & i) == i) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private void m3202d(ConstraintWidget constraintWidget) {
        int i = this.aE + 1;
        C0666c[] cVarArr = this.aH;
        if (i >= cVarArr.length) {
            this.aH = (C0666c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.aH[this.aE] = new C0666c(constraintWidget, 0, mo3660Y());
        this.aE++;
    }

    /* renamed from: e */
    private void m3203e(ConstraintWidget constraintWidget) {
        int i = this.aF + 1;
        C0666c[] cVarArr = this.aG;
        if (i >= cVarArr.length) {
            this.aG = (C0666c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
        }
        this.aG[this.aF] = new C0666c(constraintWidget, 1, mo3660Y());
        this.aF++;
    }

    /* renamed from: a */
    public void mo3602a(int i) {
        this.aS = i;
        C0627d.f2430a = mo3673b(MediaPlayer.MEDIA_PLAYER_OPTION_APPID);
    }

    /* renamed from: b */
    public void mo3672b(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.aW;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.mo3487d() > this.aW.get().mo3487d()) {
            this.aW = new WeakReference<>(constraintAnchor);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo3676c(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.aX;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.mo3487d() > this.aX.get().mo3487d()) {
            this.aX = new WeakReference<>(constraintAnchor);
        }
    }

    /* renamed from: d */
    public void mo3677d(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.aY;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.mo3487d() > this.aY.get().mo3487d()) {
            this.aY = new WeakReference<>(constraintAnchor);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3665a(ConstraintAnchor constraintAnchor) {
        WeakReference<ConstraintAnchor> weakReference = this.aV;
        if (weakReference == null || weakReference.get() == null || constraintAnchor.mo3487d() > this.aV.get().mo3487d()) {
            this.aV = new WeakReference<>(constraintAnchor);
        }
    }

    /* renamed from: b */
    public boolean mo3674b(C0627d dVar) {
        int i;
        boolean b = mo3673b(64);
        mo3530a(dVar, b);
        int size = this.aQ.size();
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            ConstraintWidget constraintWidget = (ConstraintWidget) this.aQ.get(i2);
            constraintWidget.mo3527a(0, false);
            constraintWidget.mo3527a(1, false);
            if (constraintWidget instanceof C0640a) {
                z = true;
            }
        }
        if (z) {
            for (int i3 = 0; i3 < size; i3++) {
                ConstraintWidget constraintWidget2 = (ConstraintWidget) this.aQ.get(i3);
                if (constraintWidget2 instanceof C0640a) {
                    ((C0640a) constraintWidget2).mo3607f();
                }
            }
        }
        for (int i4 = 0; i4 < size; i4++) {
            ConstraintWidget constraintWidget3 = (ConstraintWidget) this.aQ.get(i4);
            if (constraintWidget3.mo3521W()) {
                constraintWidget3.mo3530a(dVar, b);
            }
        }
        if (C0627d.f2430a) {
            HashSet<ConstraintWidget> hashSet = new HashSet<>();
            for (int i5 = 0; i5 < size; i5++) {
                ConstraintWidget constraintWidget4 = (ConstraintWidget) this.aQ.get(i5);
                if (!constraintWidget4.mo3521W()) {
                    hashSet.add(constraintWidget4);
                }
            }
            if (mo3517S() == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                i = 0;
            } else {
                i = 1;
            }
            mo3537a(this, dVar, hashSet, i, false);
            Iterator<ConstraintWidget> it = hashSet.iterator();
            while (it.hasNext()) {
                ConstraintWidget next = it.next();
                C0674i.m3294a(this, dVar, next);
                next.mo3530a(dVar, b);
            }
        } else {
            for (int i6 = 0; i6 < size; i6++) {
                ConstraintWidget constraintWidget5 = (ConstraintWidget) this.aQ.get(i6);
                if (constraintWidget5 instanceof C0667d) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = constraintWidget5.f2540I[0];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = constraintWidget5.f2540I[1];
                    if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                        constraintWidget5.mo3534a(ConstraintWidget.DimensionBehaviour.FIXED);
                    }
                    if (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                        constraintWidget5.mo3548b(ConstraintWidget.DimensionBehaviour.FIXED);
                    }
                    constraintWidget5.mo3530a(dVar, b);
                    if (dimensionBehaviour == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                        constraintWidget5.mo3534a(dimensionBehaviour);
                    }
                    if (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                        constraintWidget5.mo3548b(dimensionBehaviour2);
                    }
                } else {
                    C0674i.m3294a(this, dVar, constraintWidget5);
                    if (!constraintWidget5.mo3521W()) {
                        constraintWidget5.mo3530a(dVar, b);
                    }
                }
            }
        }
        if (this.aE > 0) {
            C0665b.m3195a(this, dVar, null, 0);
        }
        if (this.aF > 0) {
            C0665b.m3195a(this, dVar, null, 1);
        }
        return true;
    }

    /* renamed from: a */
    public void mo3667a(C0642b.AbstractC0644b bVar) {
        this.ax = bVar;
        this.aw.mo3624a(bVar);
    }

    /* renamed from: a */
    private void m3199a(ConstraintAnchor constraintAnchor, SolverVariable solverVariable) {
        this.az.mo3443a(this.az.mo3440a(constraintAnchor), solverVariable, 0, 5);
    }

    /* renamed from: b */
    private void m3201b(ConstraintAnchor constraintAnchor, SolverVariable solverVariable) {
        this.az.mo3443a(solverVariable, this.az.mo3440a(constraintAnchor), 0, 5);
    }

    /* renamed from: a */
    public void mo3663a(C0627d dVar, boolean[] zArr) {
        zArr[2] = false;
        boolean b = mo3673b(64);
        mo3547b(dVar, b);
        int size = this.aQ.size();
        for (int i = 0; i < size; i++) {
            ((ConstraintWidget) this.aQ.get(i)).mo3547b(dVar, b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo3666a(ConstraintWidget constraintWidget, int i) {
        if (i == 0) {
            m3202d(constraintWidget);
        } else if (i == 1) {
            m3203e(constraintWidget);
        }
    }

    /* renamed from: a */
    public static boolean m3200a(ConstraintWidget constraintWidget, C0642b.AbstractC0644b bVar, C0642b.C0643a aVar, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i2;
        int i3;
        if (bVar == null) {
            return false;
        }
        aVar.f2592d = constraintWidget.mo3517S();
        aVar.f2593e = constraintWidget.mo3518T();
        aVar.f2594f = constraintWidget.mo3499A();
        aVar.f2595g = constraintWidget.mo3500B();
        aVar.f2600l = false;
        aVar.f2601m = i;
        if (aVar.f2592d == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            z = true;
        } else {
            z = false;
        }
        if (aVar.f2593e == ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z || constraintWidget.f2544M <= BitmapDescriptorFactory.HUE_RED) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!z2 || constraintWidget.f2544M <= BitmapDescriptorFactory.HUE_RED) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z && constraintWidget.mo3567g(0) && constraintWidget.f2568l == 0 && !z3) {
            aVar.f2592d = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (z2 && constraintWidget.f2569m == 0) {
                aVar.f2592d = ConstraintWidget.DimensionBehaviour.FIXED;
            }
            z = false;
        }
        if (z2 && constraintWidget.mo3567g(1) && constraintWidget.f2569m == 0 && !z4) {
            aVar.f2593e = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (z && constraintWidget.f2568l == 0) {
                aVar.f2593e = ConstraintWidget.DimensionBehaviour.FIXED;
            }
            z2 = false;
        }
        if (constraintWidget.mo3559d()) {
            aVar.f2592d = ConstraintWidget.DimensionBehaviour.FIXED;
            z = false;
        }
        if (constraintWidget.mo3564e()) {
            aVar.f2593e = ConstraintWidget.DimensionBehaviour.FIXED;
            z2 = false;
        }
        if (z3) {
            if (constraintWidget.f2570n[0] == 4) {
                aVar.f2592d = ConstraintWidget.DimensionBehaviour.FIXED;
            } else if (!z2) {
                if (aVar.f2593e == ConstraintWidget.DimensionBehaviour.FIXED) {
                    i3 = aVar.f2595g;
                } else {
                    aVar.f2592d = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    bVar.mo3614a(constraintWidget, aVar);
                    i3 = aVar.f2597i;
                }
                aVar.f2592d = ConstraintWidget.DimensionBehaviour.FIXED;
                if (constraintWidget.f2545N == 0 || constraintWidget.f2545N == -1) {
                    aVar.f2594f = (int) (constraintWidget.mo3512N() * ((float) i3));
                } else {
                    aVar.f2594f = (int) (constraintWidget.mo3512N() / ((float) i3));
                }
            }
        }
        if (z4) {
            if (constraintWidget.f2570n[1] == 4) {
                aVar.f2593e = ConstraintWidget.DimensionBehaviour.FIXED;
            } else if (!z) {
                if (aVar.f2592d == ConstraintWidget.DimensionBehaviour.FIXED) {
                    i2 = aVar.f2594f;
                } else {
                    aVar.f2593e = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    bVar.mo3614a(constraintWidget, aVar);
                    i2 = aVar.f2596h;
                }
                aVar.f2593e = ConstraintWidget.DimensionBehaviour.FIXED;
                if (constraintWidget.f2545N == 0 || constraintWidget.f2545N == -1) {
                    aVar.f2595g = (int) (((float) i2) / constraintWidget.mo3512N());
                } else {
                    aVar.f2595g = (int) (((float) i2) * constraintWidget.mo3512N());
                }
            }
        }
        bVar.mo3614a(constraintWidget, aVar);
        constraintWidget.mo3579o(aVar.f2596h);
        constraintWidget.mo3581p(aVar.f2597i);
        constraintWidget.mo3554c(aVar.f2599k);
        constraintWidget.mo3588s(aVar.f2598j);
        aVar.f2601m = C0642b.C0643a.f2589a;
        return aVar.f2600l;
    }

    /* renamed from: a */
    public long mo3662a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.aA = i8;
        this.aB = i9;
        return this.f2689a.mo3611a(this, i, i8, i9, i2, i3, i4, i5, i6, i7);
    }
}
