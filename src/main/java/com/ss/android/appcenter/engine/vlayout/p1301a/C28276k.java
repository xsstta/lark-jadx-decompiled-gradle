package com.ss.android.appcenter.engine.vlayout.p1301a;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.appcenter.engine.vlayout.AbstractC28282e;
import com.ss.android.appcenter.engine.vlayout.AbstractC28285g;
import com.ss.android.appcenter.engine.vlayout.VirtualLayoutManager;

/* renamed from: com.ss.android.appcenter.engine.vlayout.a.k */
public class C28276k extends C28266c {

    /* renamed from: u */
    private int f71016u = -1;

    public C28276k() {
        mo100732b(1);
    }

    @Override // com.ss.android.appcenter.engine.vlayout.p1301a.AbstractC28263b, com.ss.android.appcenter.engine.vlayout.AbstractC28280c
    /* renamed from: b */
    public void mo100732b(int i) {
        if (i > 0) {
            super.mo100732b(1);
        } else {
            super.mo100732b(0);
        }
    }

    @Override // com.ss.android.appcenter.engine.vlayout.AbstractC28280c
    /* renamed from: b */
    public void mo100743b(int i, int i2) {
        this.f71016u = i;
    }

    @Override // com.ss.android.appcenter.engine.vlayout.p1301a.AbstractC28263b, com.ss.android.appcenter.engine.vlayout.p1301a.AbstractC28262a, com.ss.android.appcenter.engine.vlayout.p1301a.C28266c
    /* renamed from: b */
    public void mo100718b(RecyclerView.Recycler recycler, RecyclerView.State state, VirtualLayoutManager.C28259c cVar, C28273h hVar, AbstractC28282e eVar) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z2;
        int i8;
        int i9;
        boolean z3;
        int i10;
        if (!mo100739a(cVar.mo100706b())) {
            View a = cVar.mo100703a(recycler);
            boolean z4 = true;
            if (a == null) {
                hVar.f71003b = true;
                return;
            }
            eVar.mo100685a(cVar, a);
            VirtualLayoutManager.LayoutParams layoutParams = (VirtualLayoutManager.LayoutParams) a.getLayoutParams();
            int i11 = 0;
            if (eVar.getOrientation() == 1) {
                z = true;
            } else {
                z = false;
            }
            int c = (((eVar.mo100692c() - eVar.getPaddingLeft()) - eVar.getPaddingRight()) - mo100757f()) - mo100760h();
            int d = (((eVar.mo100693d() - eVar.getPaddingTop()) - eVar.getPaddingBottom()) - mo100758g()) - mo100762i();
            if (!Float.isNaN(this.f70974l)) {
                if (z) {
                    d = (int) ((((float) c) / this.f70974l) + 0.5f);
                } else {
                    c = (int) ((((float) d) * this.f70974l) + 0.5f);
                }
            }
            if (z) {
                if (Float.isNaN(this.f70974l)) {
                    i9 = layoutParams.width;
                } else {
                    i9 = c;
                }
                if (z || !Float.isNaN(this.f70974l)) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                int a2 = eVar.mo100679a(c, i9, z3);
                if (!Float.isNaN(layoutParams.f70956a)) {
                    i10 = (int) ((((float) c) / layoutParams.f70956a) + 0.5f);
                } else if (Float.isNaN(this.f70974l)) {
                    i10 = layoutParams.height;
                } else {
                    i10 = d;
                }
                if (!z || !Float.isNaN(this.f70974l)) {
                    z4 = false;
                }
                eVar.measureChildWithMargins(a, a2, eVar.mo100679a(d, i10, z4));
            } else {
                if (!Float.isNaN(layoutParams.f70956a)) {
                    i7 = (int) ((((float) d) * layoutParams.f70956a) + 0.5f);
                } else if (Float.isNaN(this.f70974l)) {
                    i7 = layoutParams.width;
                } else {
                    i7 = c;
                }
                if (z || !Float.isNaN(this.f70974l)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                int a3 = eVar.mo100679a(c, i7, z2);
                if (Float.isNaN(this.f70974l)) {
                    i8 = layoutParams.height;
                } else {
                    i8 = d;
                }
                if (!z || !Float.isNaN(this.f70974l)) {
                    z4 = false;
                }
                eVar.measureChildWithMargins(a, a3, eVar.mo100679a(d, i8, z4));
            }
            AbstractC28285g b = eVar.mo100691b();
            hVar.f71002a = b.mo100803c(a);
            if (z) {
                int d2 = c - b.mo100805d(a);
                if (d2 >= 0) {
                    i11 = d2;
                }
                int i12 = i11 / 2;
                int paddingLeft = this.f71012q + this.f71008m + eVar.getPaddingLeft() + i12;
                int c2 = (((eVar.mo100692c() - this.f71013r) - this.f71009n) - eVar.getPaddingRight()) - i12;
                if (cVar.mo100709e() == -1) {
                    i6 = (cVar.mo100702a() - this.f71015t) - this.f71011p;
                    i5 = i6 - hVar.f71002a;
                } else {
                    i5 = this.f71010o + cVar.mo100702a() + this.f71014s;
                    i6 = hVar.f71002a + i5;
                }
                i4 = paddingLeft;
                i = i6;
                i2 = c2;
                i3 = i5;
            } else {
                int d3 = d - b.mo100805d(a);
                if (d3 >= 0) {
                    i11 = d3;
                }
                int i13 = i11 / 2;
                int paddingTop = eVar.getPaddingTop() + this.f71014s + this.f71010o + i13;
                int d4 = (((eVar.mo100693d() - (-this.f71015t)) - this.f71011p) - eVar.getPaddingBottom()) - i13;
                if (cVar.mo100709e() == -1) {
                    int a4 = (cVar.mo100702a() - this.f71013r) - this.f71009n;
                    i2 = a4;
                    i4 = a4 - hVar.f71002a;
                } else {
                    int a5 = cVar.mo100702a() + this.f71012q + this.f71008m;
                    i4 = a5;
                    i2 = hVar.f71002a + a5;
                }
                i = d4;
                i3 = paddingTop;
            }
            if (z) {
                hVar.f71002a += mo100758g() + mo100762i();
            } else {
                hVar.f71002a += mo100757f() + mo100760h();
            }
            mo100724a(a, i4, i3, i2, i, eVar);
        }
    }
}
