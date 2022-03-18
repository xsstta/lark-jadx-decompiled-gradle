package com.ss.android.lark.mail.impl.widget.advrecyclerview.p2227b.p2228a;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.mail.impl.widget.advrecyclerview.p2227b.AbstractC44004a;

/* renamed from: com.ss.android.lark.mail.impl.widget.advrecyclerview.b.a.f */
public abstract class AbstractC44012f extends AbstractC44007b<C44009c> {
    /* renamed from: a */
    public abstract boolean mo156623a(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i, int i2, int i3, int i4);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo156624b(C44009c cVar);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo156626c(C44009c cVar);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo156607b(C44009c cVar) {
        if (!(cVar.f111685b == null || cVar.f111685b.itemView == null)) {
            mo156626c(cVar);
        }
        if (cVar.f111684a != null && cVar.f111684a.itemView != null) {
            mo156624b(cVar);
        }
    }

    /* renamed from: a */
    public void mo156622a(C44009c cVar, RecyclerView.ViewHolder viewHolder) {
        boolean z;
        if (mo156604a()) {
            Log.d("ARVItemChangeAnimMgr", "dispatchChangeFinished(" + viewHolder + ")");
        }
        AbstractC44004a aVar = this.f111678a;
        if (viewHolder == cVar.f111685b) {
            z = true;
        } else {
            z = false;
        }
        aVar.dispatchChangeFinished(viewHolder, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo156609b(C44009c cVar, RecyclerView.ViewHolder viewHolder) {
        if (cVar.f111685b != null && (viewHolder == null || cVar.f111685b == viewHolder)) {
            mo156602a((AbstractC44011e) cVar, cVar.f111685b);
            mo156622a(cVar, cVar.f111685b);
            cVar.mo156616a(cVar.f111685b);
        }
        if (cVar.f111684a != null && (viewHolder == null || cVar.f111684a == viewHolder)) {
            mo156602a((AbstractC44011e) cVar, cVar.f111684a);
            mo156622a(cVar, cVar.f111684a);
            cVar.mo156616a(cVar.f111684a);
        }
        if (cVar.f111685b == null && cVar.f111684a == null) {
            return true;
        }
        return false;
    }
}
