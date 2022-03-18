package com.ss.android.appcenter.engine.vlayout.p1301a;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.maps.model.BitmapDescriptorFactory;
import com.ss.android.appcenter.engine.vlayout.AbstractC28282e;
import com.ss.android.appcenter.engine.vlayout.AbstractC28285g;
import com.ss.android.appcenter.engine.vlayout.VirtualLayoutManager;
import java.util.Arrays;

/* renamed from: com.ss.android.appcenter.engine.vlayout.a.c */
public class C28266c extends AbstractC28262a {

    /* renamed from: u */
    private View[] f70975u;

    /* renamed from: v */
    private View[] f70976v;

    /* renamed from: w */
    private Rect f70977w = new Rect();

    /* renamed from: x */
    private float[] f70978x = new float[0];

    @Override // com.ss.android.appcenter.engine.vlayout.p1301a.AbstractC28262a, com.ss.android.appcenter.engine.vlayout.AbstractC28280c
    /* renamed from: a */
    public void mo100714a(RecyclerView.State state, VirtualLayoutManager.C28257a aVar, AbstractC28282e eVar) {
        if (aVar.f70961c) {
            aVar.f70959a = mo100772a().mo100812b().intValue();
        } else {
            aVar.f70959a = mo100772a().mo100809a().intValue();
        }
    }

    @Override // com.ss.android.appcenter.engine.vlayout.p1301a.AbstractC28263b, com.ss.android.appcenter.engine.vlayout.p1301a.AbstractC28262a
    /* renamed from: b */
    public void mo100718b(RecyclerView.Recycler recycler, RecyclerView.State state, VirtualLayoutManager.C28259c cVar, C28273h hVar, AbstractC28282e eVar) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        if (!mo100739a(cVar.mo100706b())) {
            boolean z2 = true;
            if (eVar.getOrientation() == 1) {
                z = true;
            } else {
                z = false;
            }
            AbstractC28285g b = eVar.mo100691b();
            int b2 = mo100730b();
            View[] viewArr = this.f70976v;
            if (viewArr == null || viewArr.length != b2) {
                this.f70976v = new View[b2];
            }
            View[] viewArr2 = this.f70975u;
            if (viewArr2 == null || viewArr2.length != b2) {
                this.f70975u = new View[b2];
            } else {
                Arrays.fill(viewArr2, (Object) null);
            }
            int a = mo100711a(this.f70976v, recycler, cVar, hVar, eVar);
            if (z) {
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                for (int i9 = 0; i9 < a; i9++) {
                    ViewGroup.LayoutParams layoutParams = this.f70976v[i9].getLayoutParams();
                    if (layoutParams instanceof RecyclerView.LayoutParams) {
                        RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
                        layoutParams2.leftMargin = Math.max(i7, layoutParams2.leftMargin);
                        i6 += layoutParams2.leftMargin;
                        if (i9 != a - 1) {
                            i7 = layoutParams2.rightMargin;
                            layoutParams2.rightMargin = 0;
                        } else {
                            i6 += layoutParams2.rightMargin;
                        }
                        i8 = Math.max(i8, layoutParams2.topMargin + layoutParams2.bottomMargin);
                    }
                }
                int c = (((eVar.mo100692c() - eVar.getPaddingLeft()) - eVar.getPaddingRight()) - mo100757f()) - mo100760h();
                int i10 = c - i6;
                int i11 = Integer.MAX_VALUE;
                int i12 = -1;
                if (!Float.isNaN(this.f70974l)) {
                    i12 = (int) ((((float) c) / this.f70974l) + 0.5f);
                }
                int i13 = 0;
                int i14 = 0;
                int i15 = 0;
                while (i13 < a) {
                    View view = this.f70976v[i13];
                    VirtualLayoutManager.LayoutParams layoutParams3 = (VirtualLayoutManager.LayoutParams) view.getLayoutParams();
                    int d = (eVar.mo100693d() - eVar.getPaddingTop()) - eVar.getPaddingBottom();
                    if (i12 > 0) {
                        i4 = i12;
                    } else {
                        i4 = layoutParams3.height;
                    }
                    int a2 = eVar.mo100679a(d, i4, z2);
                    float[] fArr = this.f70978x;
                    if (fArr != null && i13 < fArr.length && !Float.isNaN(fArr[i13])) {
                        float[] fArr2 = this.f70978x;
                        if (fArr2[i13] >= BitmapDescriptorFactory.HUE_RED) {
                            int i16 = (int) ((((fArr2[i13] * 1.0f) / 100.0f) * ((float) i10)) + 0.5f);
                            if (!Float.isNaN(layoutParams3.f70956a)) {
                                i5 = 1073741824;
                                a2 = View.MeasureSpec.makeMeasureSpec((int) ((((float) i16) / layoutParams3.f70956a) + 0.5f), 1073741824);
                            } else {
                                i5 = 1073741824;
                            }
                            eVar.measureChildWithMargins(view, View.MeasureSpec.makeMeasureSpec(i16, i5), a2);
                            i15 += i16;
                            i11 = Math.min(i11, view.getMeasuredHeight());
                            i13++;
                            z2 = true;
                        }
                    }
                    this.f70975u[i14] = view;
                    i14++;
                    i13++;
                    z2 = true;
                }
                for (int i17 = 0; i17 < i14; i17++) {
                    View view2 = this.f70975u[i17];
                    VirtualLayoutManager.LayoutParams layoutParams4 = (VirtualLayoutManager.LayoutParams) view2.getLayoutParams();
                    int i18 = (int) (((((float) (i10 - i15)) * 1.0f) / ((float) i14)) + 0.5f);
                    if (!Float.isNaN(layoutParams4.f70956a)) {
                        i = 1073741824;
                        i2 = View.MeasureSpec.makeMeasureSpec((int) ((((float) i18) / layoutParams4.f70956a) + 0.5f), 1073741824);
                    } else {
                        int d2 = (eVar.mo100693d() - eVar.getPaddingTop()) - eVar.getPaddingBottom();
                        if (i12 > 0) {
                            i3 = i12;
                        } else {
                            i3 = layoutParams4.height;
                        }
                        i2 = eVar.mo100679a(d2, i3, true);
                        i = 1073741824;
                    }
                    eVar.measureChildWithMargins(view2, View.MeasureSpec.makeMeasureSpec(i18, i), i2);
                    i11 = Math.min(i11, view2.getMeasuredHeight());
                }
                for (int i19 = 0; i19 < a; i19++) {
                    View view3 = this.f70976v[i19];
                    if (view3.getMeasuredHeight() != i11) {
                        eVar.measureChildWithMargins(view3, View.MeasureSpec.makeMeasureSpec(view3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                    }
                }
                int i20 = i11 + i8;
                hVar.f71002a = mo100758g() + i20 + mo100762i();
                mo100712a(i20, this.f70977w, cVar, eVar);
                int i21 = this.f70977w.left;
                int i22 = 0;
                while (i22 < a) {
                    View view4 = this.f70976v[i22];
                    int i23 = this.f70977w.top;
                    int i24 = this.f70977w.bottom;
                    int d3 = i21 + b.mo100805d(view4);
                    mo100724a(view4, i21, i23, d3, i24, eVar);
                    i22++;
                    i21 = d3;
                }
            }
            Arrays.fill(this.f70976v, (Object) null);
            Arrays.fill(this.f70975u, (Object) null);
        }
    }
}
