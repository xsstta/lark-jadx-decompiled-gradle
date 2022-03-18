package com.scwang.smart.refresh.layout.p1231c;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import com.scwang.smart.refresh.layout.constant.C27099b;
import com.scwang.smart.refresh.layout.constant.RefreshState;
import com.scwang.smart.refresh.layout.p1229a.AbstractC27079a;
import com.scwang.smart.refresh.layout.p1229a.AbstractC27081c;
import com.scwang.smart.refresh.layout.p1229a.AbstractC27082d;
import com.scwang.smart.refresh.layout.p1229a.AbstractC27083e;
import com.scwang.smart.refresh.layout.p1229a.AbstractC27084f;

/* renamed from: com.scwang.smart.refresh.layout.c.b */
public abstract class AbstractC27096b extends RelativeLayout implements AbstractC27079a {

    /* renamed from: a */
    protected View f67319a;

    /* renamed from: b */
    protected C27099b f67320b;

    /* renamed from: c */
    protected AbstractC27079a f67321c;

    @Override // com.scwang.smart.refresh.layout.p1229a.AbstractC27079a
    public View getView() {
        View view = this.f67319a;
        return view == null ? this : view;
    }

    @Override // com.scwang.smart.refresh.layout.p1229a.AbstractC27079a
    public C27099b getSpinnerStyle() {
        C27099b bVar = this.f67320b;
        if (bVar != null) {
            return bVar;
        }
        AbstractC27079a aVar = this.f67321c;
        if (!(aVar == null || aVar == this)) {
            return aVar.getSpinnerStyle();
        }
        View view = this.f67319a;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof SmartRefreshLayout.LayoutParams) {
                C27099b bVar2 = ((SmartRefreshLayout.LayoutParams) layoutParams).f67300b;
                this.f67320b = bVar2;
                if (bVar2 != null) {
                    return bVar2;
                }
            }
            if (layoutParams != null && (layoutParams.height == 0 || layoutParams.height == -1)) {
                C27099b[] bVarArr = C27099b.f67342f;
                for (C27099b bVar3 : bVarArr) {
                    if (bVar3.f67345i) {
                        this.f67320b = bVar3;
                        return bVar3;
                    }
                }
            }
        }
        C27099b bVar4 = C27099b.f67337a;
        this.f67320b = bVar4;
        return bVar4;
    }

    @Override // com.scwang.smart.refresh.layout.p1229a.AbstractC27079a
    /* renamed from: a */
    public boolean mo96294a() {
        AbstractC27079a aVar = this.f67321c;
        if (aVar == null || aVar == this || !aVar.mo96294a()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected AbstractC27096b(android.view.View r2) {
        /*
            r1 = this;
            boolean r0 = r2 instanceof com.scwang.smart.refresh.layout.p1229a.AbstractC27079a
            if (r0 == 0) goto L_0x0008
            r0 = r2
            com.scwang.smart.refresh.layout.a.a r0 = (com.scwang.smart.refresh.layout.p1229a.AbstractC27079a) r0
            goto L_0x0009
        L_0x0008:
            r0 = 0
        L_0x0009:
            r1.<init>(r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scwang.smart.refresh.layout.p1231c.AbstractC27096b.<init>(android.view.View):void");
    }

    @Override // com.scwang.smart.refresh.layout.p1229a.AbstractC27079a
    public void setPrimaryColors(int... iArr) {
        AbstractC27079a aVar = this.f67321c;
        if (aVar != null && aVar != this) {
            aVar.setPrimaryColors(iArr);
        }
    }

    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return true;
        }
        if (!(obj instanceof AbstractC27079a) || getView() != ((AbstractC27079a) obj).getView()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo96327a(boolean z) {
        AbstractC27079a aVar = this.f67321c;
        if (!(aVar instanceof AbstractC27081c) || !((AbstractC27081c) aVar).mo96309a(z)) {
            return false;
        }
        return true;
    }

    @Override // com.scwang.smart.refresh.layout.p1229a.AbstractC27079a
    /* renamed from: a */
    public int mo96289a(AbstractC27084f fVar, boolean z) {
        AbstractC27079a aVar = this.f67321c;
        if (aVar == null || aVar == this) {
            return 0;
        }
        return aVar.mo96289a(fVar, z);
    }

    protected AbstractC27096b(View view, AbstractC27079a aVar) {
        super(view.getContext(), null, 0);
        this.f67319a = view;
        this.f67321c = aVar;
        if ((this instanceof AbstractC27081c) && (aVar instanceof AbstractC27082d) && aVar.getSpinnerStyle() == C27099b.f67341e) {
            aVar.getView().setScaleY(-1.0f);
        } else if (this instanceof AbstractC27082d) {
            AbstractC27079a aVar2 = this.f67321c;
            if ((aVar2 instanceof AbstractC27081c) && aVar2.getSpinnerStyle() == C27099b.f67341e) {
                aVar.getView().setScaleY(-1.0f);
            }
        }
    }

    @Override // com.scwang.smart.refresh.layout.p1229a.AbstractC27079a
    /* renamed from: b */
    public void mo96295b(AbstractC27084f fVar, int i, int i2) {
        AbstractC27079a aVar = this.f67321c;
        if (aVar != null && aVar != this) {
            aVar.mo96295b(fVar, i, i2);
        }
    }

    @Override // com.scwang.smart.refresh.layout.p1229a.AbstractC27079a
    /* renamed from: a */
    public void mo96290a(float f, int i, int i2) {
        AbstractC27079a aVar = this.f67321c;
        if (aVar != null && aVar != this) {
            aVar.mo96290a(f, i, i2);
        }
    }

    @Override // com.scwang.smart.refresh.layout.p1229a.AbstractC27079a
    /* renamed from: a */
    public void mo96291a(AbstractC27083e eVar, int i, int i2) {
        AbstractC27079a aVar = this.f67321c;
        if (aVar == null || aVar == this) {
            View view = this.f67319a;
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams instanceof SmartRefreshLayout.LayoutParams) {
                    eVar.mo96285a(this, ((SmartRefreshLayout.LayoutParams) layoutParams).f67299a);
                    return;
                }
                return;
            }
            return;
        }
        aVar.mo96291a(eVar, i, i2);
    }

    @Override // com.scwang.smart.refresh.layout.p1229a.AbstractC27079a
    /* renamed from: a */
    public void mo96292a(AbstractC27084f fVar, int i, int i2) {
        AbstractC27079a aVar = this.f67321c;
        if (aVar != null && aVar != this) {
            aVar.mo96292a(fVar, i, i2);
        }
    }

    @Override // com.scwang.smart.refresh.layout.p1230b.AbstractC27093i
    /* renamed from: a */
    public void mo96324a(AbstractC27084f fVar, RefreshState refreshState, RefreshState refreshState2) {
        AbstractC27079a aVar = this.f67321c;
        if (aVar != null && aVar != this) {
            if ((this instanceof AbstractC27081c) && (aVar instanceof AbstractC27082d)) {
                if (refreshState.isFooter) {
                    refreshState = refreshState.toHeader();
                }
                if (refreshState2.isFooter) {
                    refreshState2 = refreshState2.toHeader();
                }
            } else if ((this instanceof AbstractC27082d) && (aVar instanceof AbstractC27081c)) {
                if (refreshState.isHeader) {
                    refreshState = refreshState.toFooter();
                }
                if (refreshState2.isHeader) {
                    refreshState2 = refreshState2.toFooter();
                }
            }
            AbstractC27079a aVar2 = this.f67321c;
            if (aVar2 != null) {
                aVar2.mo96324a(fVar, refreshState, refreshState2);
            }
        }
    }

    @Override // com.scwang.smart.refresh.layout.p1229a.AbstractC27079a
    /* renamed from: a */
    public void mo96293a(boolean z, float f, int i, int i2, int i3) {
        AbstractC27079a aVar = this.f67321c;
        if (aVar != null && aVar != this) {
            aVar.mo96293a(z, f, i, i2, i3);
        }
    }
}
