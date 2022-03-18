package com.h6ah4i.android.widget.advrecyclerview.p1005b.p1006a;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import com.h6ah4i.android.widget.advrecyclerview.p1005b.AbstractC23236a;

/* renamed from: com.h6ah4i.android.widget.advrecyclerview.b.a.f */
public abstract class AbstractC23245f extends AbstractC23239b<C23242c> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo80630a(C23242c cVar);

    /* renamed from: a */
    public abstract boolean mo80631a(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i, int i2, int i3, int i4);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo80632b(C23242c cVar);

    /* renamed from: h */
    public long mo80637h() {
        return this.f57304b.getChangeDuration();
    }

    public AbstractC23245f(AbstractC23236a aVar) {
        super(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo80600a(C23242c cVar) {
        if (!(cVar.f57315b == null || cVar.f57315b.itemView == null)) {
            mo80630a(cVar);
        }
        if (cVar.f57314a != null && cVar.f57314a.itemView != null) {
            mo80632b(cVar);
        }
    }

    /* renamed from: d */
    public void mo80614d(C23242c cVar, RecyclerView.ViewHolder viewHolder) {
        boolean z;
        if (mo80604a()) {
            Log.d("ARVItemChangeAnimMgr", "dispatchChangeStarting(" + viewHolder + ")");
        }
        AbstractC23236a aVar = this.f57304b;
        if (viewHolder == cVar.f57315b) {
            z = true;
        } else {
            z = false;
        }
        aVar.dispatchChangeStarting(viewHolder, z);
    }

    /* renamed from: e */
    public void mo80617e(C23242c cVar, RecyclerView.ViewHolder viewHolder) {
        boolean z;
        if (mo80604a()) {
            Log.d("ARVItemChangeAnimMgr", "dispatchChangeFinished(" + viewHolder + ")");
        }
        AbstractC23236a aVar = this.f57304b;
        if (viewHolder == cVar.f57315b) {
            z = true;
        } else {
            z = false;
        }
        aVar.dispatchChangeFinished(viewHolder, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo80620f(C23242c cVar, RecyclerView.ViewHolder viewHolder) {
        if (cVar.f57315b != null && (viewHolder == null || cVar.f57315b == viewHolder)) {
            mo80606b(cVar, cVar.f57315b);
            mo80617e(cVar, cVar.f57315b);
            cVar.mo80598a(cVar.f57315b);
        }
        if (cVar.f57314a != null && (viewHolder == null || cVar.f57314a == viewHolder)) {
            mo80606b(cVar, cVar.f57314a);
            mo80617e(cVar, cVar.f57314a);
            cVar.mo80598a(cVar.f57314a);
        }
        if (cVar.f57315b == null && cVar.f57314a == null) {
            return true;
        }
        return false;
    }
}
