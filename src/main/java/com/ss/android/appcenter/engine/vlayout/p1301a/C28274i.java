package com.ss.android.appcenter.engine.vlayout.p1301a;

import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.appcenter.engine.vlayout.AbstractC28282e;
import com.ss.android.appcenter.engine.vlayout.VirtualLayoutManager;

/* renamed from: com.ss.android.appcenter.engine.vlayout.a.i */
public class C28274i extends AbstractC28263b {

    /* renamed from: e */
    private int f71006e;

    /* renamed from: f */
    private boolean f71007f;

    public C28274i() {
        this(0);
    }

    /* renamed from: d */
    public void mo100755d(int i) {
        if (i < 0) {
            i = 0;
        }
        this.f71006e = i;
    }

    public C28274i(int i) {
        this(i, 0);
    }

    public C28274i(int i, int i2) {
        mo100732b(i2);
        mo100755d(i);
    }

    @Override // com.ss.android.appcenter.engine.vlayout.AbstractC28280c
    /* renamed from: a */
    public void mo100714a(RecyclerView.State state, VirtualLayoutManager.C28257a aVar, AbstractC28282e eVar) {
        super.mo100714a(state, aVar, eVar);
        this.f71007f = true;
    }

    @Override // com.ss.android.appcenter.engine.vlayout.AbstractC28280c, com.ss.android.appcenter.engine.vlayout.p1301a.AbstractC28275j
    /* renamed from: a */
    public int mo100710a(int i, boolean z, boolean z2, AbstractC28282e eVar) {
        boolean z3;
        int i2;
        int i3;
        int i4;
        int i5;
        if (eVar.getOrientation() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z) {
            if (i == mo100730b() - 1) {
                if (z3) {
                    i5 = this.f71015t;
                    i4 = this.f71011p;
                } else {
                    i5 = this.f71013r;
                    i4 = this.f71009n;
                }
                return i5 + i4;
            }
        } else if (i == 0) {
            if (z3) {
                i3 = -this.f71014s;
                i2 = this.f71010o;
            } else {
                i3 = -this.f71012q;
                i2 = this.f71008m;
            }
            return i3 - i2;
        }
        return super.mo100710a(i, z, z2, eVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:69:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01d2  */
    @Override // com.ss.android.appcenter.engine.vlayout.p1301a.AbstractC28263b
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo100718b(androidx.recyclerview.widget.RecyclerView.Recycler r20, androidx.recyclerview.widget.RecyclerView.State r21, com.ss.android.appcenter.engine.vlayout.VirtualLayoutManager.C28259c r22, com.ss.android.appcenter.engine.vlayout.p1301a.C28273h r23, com.ss.android.appcenter.engine.vlayout.AbstractC28282e r24) {
        /*
        // Method dump skipped, instructions count: 535
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.appcenter.engine.vlayout.p1301a.C28274i.mo100718b(androidx.recyclerview.widget.RecyclerView$Recycler, androidx.recyclerview.widget.RecyclerView$State, com.ss.android.appcenter.engine.vlayout.VirtualLayoutManager$c, com.ss.android.appcenter.engine.vlayout.a.h, com.ss.android.appcenter.engine.vlayout.e):void");
    }
}
