package com.h6ah4i.android.widget.advrecyclerview.p1005b.p1006a;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import com.h6ah4i.android.widget.advrecyclerview.p1005b.AbstractC23236a;

/* renamed from: com.h6ah4i.android.widget.advrecyclerview.b.a.g */
public abstract class AbstractC23246g extends AbstractC23239b<C23248i> {
    /* renamed from: a */
    public abstract boolean mo80638a(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4);

    /* renamed from: h */
    public long mo80642h() {
        return this.f57304b.getMoveDuration();
    }

    public AbstractC23246g(AbstractC23236a aVar) {
        super(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo80620f(C23248i iVar, RecyclerView.ViewHolder viewHolder) {
        if (iVar.f57324e == null) {
            return false;
        }
        if (viewHolder != null && iVar.f57324e != viewHolder) {
            return false;
        }
        mo80606b(iVar, iVar.f57324e);
        mo80617e(iVar, iVar.f57324e);
        iVar.mo80598a(iVar.f57324e);
        return true;
    }

    /* renamed from: d */
    public void mo80614d(C23248i iVar, RecyclerView.ViewHolder viewHolder) {
        if (mo80604a()) {
            Log.d("ARVItemMoveAnimMgr", "dispatchMoveStarting(" + viewHolder + ")");
        }
        this.f57304b.dispatchMoveStarting(viewHolder);
    }

    /* renamed from: e */
    public void mo80617e(C23248i iVar, RecyclerView.ViewHolder viewHolder) {
        if (mo80604a()) {
            Log.d("ARVItemMoveAnimMgr", "dispatchMoveFinished(" + viewHolder + ")");
        }
        this.f57304b.dispatchMoveFinished(viewHolder);
    }
}
