package com.h6ah4i.android.widget.advrecyclerview.p1005b.p1006a;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import com.h6ah4i.android.widget.advrecyclerview.p1005b.AbstractC23236a;

/* renamed from: com.h6ah4i.android.widget.advrecyclerview.b.a.h */
public abstract class AbstractC23247h extends AbstractC23239b<C23249j> {
    /* renamed from: a */
    public abstract boolean mo80625a(RecyclerView.ViewHolder viewHolder);

    /* renamed from: h */
    public long mo80646h() {
        return this.f57304b.getRemoveDuration();
    }

    public AbstractC23247h(AbstractC23236a aVar) {
        super(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo80620f(C23249j jVar, RecyclerView.ViewHolder viewHolder) {
        if (jVar.f57325a == null) {
            return false;
        }
        if (viewHolder != null && jVar.f57325a != viewHolder) {
            return false;
        }
        mo80606b(jVar, jVar.f57325a);
        mo80617e(jVar, jVar.f57325a);
        jVar.mo80598a(jVar.f57325a);
        return true;
    }

    /* renamed from: d */
    public void mo80614d(C23249j jVar, RecyclerView.ViewHolder viewHolder) {
        if (mo80604a()) {
            Log.d("ARVItemRemoveAnimMgr", "dispatchRemoveStarting(" + viewHolder + ")");
        }
        this.f57304b.dispatchRemoveStarting(viewHolder);
    }

    /* renamed from: e */
    public void mo80617e(C23249j jVar, RecyclerView.ViewHolder viewHolder) {
        if (mo80604a()) {
            Log.d("ARVItemRemoveAnimMgr", "dispatchRemoveFinished(" + viewHolder + ")");
        }
        this.f57304b.dispatchRemoveFinished(viewHolder);
    }
}
