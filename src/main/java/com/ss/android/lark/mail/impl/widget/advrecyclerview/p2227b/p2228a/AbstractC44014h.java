package com.ss.android.lark.mail.impl.widget.advrecyclerview.p2227b.p2228a;

import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.ss.android.lark.mail.impl.widget.advrecyclerview.b.a.h */
public abstract class AbstractC44014h extends AbstractC44007b<C44016j> {
    /* renamed from: d */
    public abstract boolean mo156632d(RecyclerView.ViewHolder viewHolder);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo156609b(C44016j jVar, RecyclerView.ViewHolder viewHolder) {
        if (jVar.f111695a == null) {
            return false;
        }
        if (viewHolder != null && jVar.f111695a != viewHolder) {
            return false;
        }
        mo156602a((AbstractC44011e) jVar, jVar.f111695a);
        mo156630a(jVar, jVar.f111695a);
        jVar.mo156635a(jVar.f111695a);
        return true;
    }

    /* renamed from: a */
    public void mo156630a(C44016j jVar, RecyclerView.ViewHolder viewHolder) {
        if (mo156604a()) {
            Log.d("ARVItemRemoveAnimMgr", "dispatchRemoveFinished(" + viewHolder + ")");
        }
        this.f111678a.dispatchRemoveFinished(viewHolder);
    }
}
