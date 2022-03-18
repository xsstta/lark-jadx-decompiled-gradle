package com.ss.android.lark.mail.impl.widget.advrecyclerview.p2227b.p2228a;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.ss.android.lark.mail.impl.widget.advrecyclerview.b.a.d */
public abstract class AbstractC44010d extends AbstractC44007b<C44006a> {
    /* renamed from: d */
    public abstract boolean mo156620d(RecyclerView.ViewHolder viewHolder);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo156609b(C44006a aVar, RecyclerView.ViewHolder viewHolder) {
        if (aVar.f111677a == null) {
            return false;
        }
        if (viewHolder != null && aVar.f111677a != viewHolder) {
            return false;
        }
        mo156602a((AbstractC44011e) aVar, aVar.f111677a);
        mo156618a(aVar, aVar.f111677a);
        aVar.mo156599a(aVar.f111677a);
        return true;
    }

    /* renamed from: a */
    public void mo156618a(C44006a aVar, RecyclerView.ViewHolder viewHolder) {
        if (mo156604a()) {
            Log.d("ARVItemAddAnimMgr", "dispatchAddFinished(" + viewHolder + ")");
        }
        this.f111678a.dispatchAddFinished(viewHolder);
    }
}
