package com.h6ah4i.android.widget.advrecyclerview.p1005b.p1006a;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import com.h6ah4i.android.widget.advrecyclerview.p1005b.AbstractC23236a;

/* renamed from: com.h6ah4i.android.widget.advrecyclerview.b.a.d */
public abstract class AbstractC23243d extends AbstractC23239b<C23238a> {
    /* renamed from: a */
    public abstract boolean mo80625a(RecyclerView.ViewHolder viewHolder);

    /* renamed from: h */
    public long mo80629h() {
        return this.f57304b.getAddDuration();
    }

    public AbstractC23243d(AbstractC23236a aVar) {
        super(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo80620f(C23238a aVar, RecyclerView.ViewHolder viewHolder) {
        if (aVar.f57302a == null) {
            return false;
        }
        if (viewHolder != null && aVar.f57302a != viewHolder) {
            return false;
        }
        mo80606b(aVar, aVar.f57302a);
        mo80617e(aVar, aVar.f57302a);
        aVar.mo80598a(aVar.f57302a);
        return true;
    }

    /* renamed from: d */
    public void mo80614d(C23238a aVar, RecyclerView.ViewHolder viewHolder) {
        if (mo80604a()) {
            Log.d("ARVItemAddAnimMgr", "dispatchAddStarting(" + viewHolder + ")");
        }
        this.f57304b.dispatchAddStarting(viewHolder);
    }

    /* renamed from: e */
    public void mo80617e(C23238a aVar, RecyclerView.ViewHolder viewHolder) {
        if (mo80604a()) {
            Log.d("ARVItemAddAnimMgr", "dispatchAddFinished(" + viewHolder + ")");
        }
        this.f57304b.dispatchAddFinished(viewHolder);
    }
}
