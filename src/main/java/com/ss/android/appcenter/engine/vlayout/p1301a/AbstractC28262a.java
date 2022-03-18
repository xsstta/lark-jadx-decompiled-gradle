package com.ss.android.appcenter.engine.vlayout.p1301a;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.appcenter.engine.vlayout.AbstractC28282e;
import com.ss.android.appcenter.engine.vlayout.C28288h;
import com.ss.android.appcenter.engine.vlayout.VirtualLayoutManager;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.appcenter.engine.vlayout.a.a */
public abstract class AbstractC28262a extends AbstractC28263b {

    /* renamed from: e */
    protected boolean f70963e;

    /* renamed from: f */
    protected boolean f70964f;

    /* renamed from: g */
    protected boolean f70965g;

    /* renamed from: u */
    private AbstractC28282e f70966u;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo100716a(ViewGroup.LayoutParams layoutParams) {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo100719c(RecyclerView.Recycler recycler, RecyclerView.State state, VirtualLayoutManager.C28259c cVar, C28273h hVar, AbstractC28282e eVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public ViewGroup.LayoutParams mo100720d() {
        return new ViewGroup.LayoutParams(-1, -2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public ViewGroup.LayoutParams mo100717b(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.LayoutParams(layoutParams);
    }

    @Override // com.ss.android.appcenter.engine.vlayout.AbstractC28280c
    /* renamed from: a */
    public void mo100714a(RecyclerView.State state, VirtualLayoutManager.C28257a aVar, AbstractC28282e eVar) {
        if (aVar.f70961c) {
            if (!this.f70964f) {
                aVar.f70959a = mo100772a().mo100812b().intValue();
            }
        } else if (!this.f70963e) {
            aVar.f70959a = mo100772a().mo100809a().intValue();
        }
        this.f70965g = true;
    }

    @Override // com.ss.android.appcenter.engine.vlayout.AbstractC28280c, com.ss.android.appcenter.engine.vlayout.p1301a.AbstractC28275j
    /* renamed from: a */
    public int mo100710a(int i, boolean z, boolean z2, AbstractC28282e eVar) {
        boolean z3 = true;
        if (eVar.getOrientation() != 1) {
            z3 = false;
        }
        if (z3) {
            if (z) {
                return this.f71015t + this.f71011p;
            }
            return (-this.f71014s) - this.f71010o;
        } else if (z) {
            return this.f71013r + this.f71009n;
        } else {
            return (-this.f71012q) - this.f71008m;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo100712a(int i, Rect rect, VirtualLayoutManager.C28259c cVar, AbstractC28282e eVar) {
        int i2 = 0;
        if (eVar.getOrientation() == 1) {
            rect.left = eVar.getPaddingLeft() + this.f71012q + this.f71008m;
            rect.right = ((eVar.mo100692c() - eVar.getPaddingRight()) - this.f71013r) - this.f71009n;
            if (cVar.mo100709e() == -1) {
                int a = cVar.mo100702a();
                if (!this.f70965g && !this.f70964f) {
                    i2 = this.f71015t + this.f71011p;
                }
                rect.bottom = a - i2;
                rect.top = rect.bottom - i;
                return;
            }
            int a2 = cVar.mo100702a();
            if (!this.f70965g && !this.f70963e) {
                i2 = this.f71014s + this.f71010o;
            }
            rect.top = a2 + i2;
            rect.bottom = rect.top + i;
            return;
        }
        rect.top = eVar.getPaddingTop() + this.f71014s + this.f71010o;
        rect.bottom = ((eVar.mo100693d() - eVar.getPaddingBottom()) - this.f71015t) - this.f71011p;
        if (cVar.mo100709e() == -1) {
            int a3 = cVar.mo100702a();
            if (!this.f70965g && !this.f70964f) {
                i2 = this.f71013r + this.f71009n;
            }
            rect.right = a3 - i2;
            rect.left = rect.right - i;
            return;
        }
        int a4 = cVar.mo100702a();
        if (!this.f70965g && !this.f70963e) {
            i2 = this.f71012q + this.f71008m;
        }
        rect.left = a4 + i2;
        rect.right = rect.left + i;
    }

    @Override // com.ss.android.appcenter.engine.vlayout.p1301a.AbstractC28263b
    /* renamed from: b */
    public void mo100718b(RecyclerView.Recycler recycler, RecyclerView.State state, VirtualLayoutManager.C28259c cVar, C28273h hVar, AbstractC28282e eVar) {
        this.f70966u = eVar;
        mo100719c(recycler, state, cVar, hVar, eVar);
        this.f70966u = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo100711a(View[] viewArr, RecyclerView.Recycler recycler, VirtualLayoutManager.C28259c cVar, C28273h hVar, AbstractC28282e eVar) {
        Integer num;
        View a;
        int i = 0;
        boolean z = true;
        if (cVar.mo100708d() != 1) {
            z = false;
        }
        C28288h<Integer> a2 = mo100772a();
        if (z) {
            num = a2.mo100809a();
        } else {
            num = a2.mo100812b();
        }
        int intValue = num.intValue();
        int b = cVar.mo100706b();
        if (!z ? b > intValue : b > intValue) {
            Log.m165397w("FullFillLayoutHelper", "Please handle strange order views carefully");
        }
        int i2 = 0;
        while (i2 < viewArr.length && !mo100739a(cVar.mo100706b()) && (a = mo100722a(recycler, cVar, eVar, hVar)) != null) {
            viewArr[i2] = a;
            ViewGroup.LayoutParams layoutParams = a.getLayoutParams();
            if (layoutParams == null) {
                a.setLayoutParams(mo100720d());
            } else if (!mo100716a(layoutParams)) {
                a.setLayoutParams(mo100717b(layoutParams));
            }
            i2++;
        }
        if (i2 > 0 && !z) {
            for (int i3 = i2 - 1; i < i3; i3--) {
                View view = viewArr[i];
                viewArr[i] = viewArr[i3];
                viewArr[i3] = view;
                i++;
            }
        }
        return i2;
    }

    @Override // com.ss.android.appcenter.engine.vlayout.AbstractC28280c
    /* renamed from: a */
    public boolean mo100715a(int i, int i2, int i3, AbstractC28282e eVar, boolean z) {
        C28288h<Integer> a = mo100772a();
        if (!a.mo100811a(Integer.valueOf(i))) {
            Log.m165397w("FullFillLayoutHelper", "Child item not match");
            return true;
        } else if (this.f70963e && i == mo100772a().mo100809a().intValue()) {
            return true;
        } else {
            if (this.f70964f && i == mo100772a().mo100812b().intValue()) {
                return true;
            }
            return C28288h.m103770a(Integer.valueOf(i2), Integer.valueOf(i3)).mo100810a(C28288h.m103770a(Integer.valueOf(a.mo100809a().intValue() + (this.f70963e ? 1 : 0)), Integer.valueOf(a.mo100812b().intValue() - (this.f70964f ? 1 : 0))));
        }
    }

    @Override // com.ss.android.appcenter.engine.vlayout.p1301a.AbstractC28263b, com.ss.android.appcenter.engine.vlayout.AbstractC28280c
    /* renamed from: a */
    public void mo100713a(RecyclerView.Recycler recycler, RecyclerView.State state, int i, int i2, int i3, AbstractC28282e eVar) {
        super.mo100713a(recycler, state, i, i2, i3, eVar);
        this.f70965g = false;
    }
}
