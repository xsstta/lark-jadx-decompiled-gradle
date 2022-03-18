package com.ss.android.lark.mail.impl.widget.advrecyclerview.p2227b.p2228a;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.ss.android.lark.mail.impl.widget.advrecyclerview.b.a.g */
public abstract class AbstractC44013g extends AbstractC44007b<C44015i> {
    /* renamed from: a */
    public abstract boolean mo156628a(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo156609b(C44015i iVar, RecyclerView.ViewHolder viewHolder) {
        if (iVar.f111694e == null) {
            return false;
        }
        if (viewHolder != null && iVar.f111694e != viewHolder) {
            return false;
        }
        mo156602a((AbstractC44011e) iVar, iVar.f111694e);
        mo156627a(iVar, iVar.f111694e);
        iVar.mo156633a(iVar.f111694e);
        return true;
    }

    /* renamed from: a */
    public void mo156627a(C44015i iVar, RecyclerView.ViewHolder viewHolder) {
        if (mo156604a()) {
            Log.d("ARVItemMoveAnimMgr", "dispatchMoveFinished(" + viewHolder + ")");
        }
        this.f111678a.dispatchMoveFinished(viewHolder);
    }
}
