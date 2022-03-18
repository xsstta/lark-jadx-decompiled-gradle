package com.ss.android.lark.mail.impl.widget.advrecyclerview.p2227b;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: com.ss.android.lark.mail.impl.widget.advrecyclerview.b.d */
public class C44019d extends AbstractC44018c {
    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.mail.impl.widget.advrecyclerview.p2227b.AbstractC44018c
    /* renamed from: d */
    public void mo156638d() {
        mo156639e();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean canReuseUpdatedViewHolder(RecyclerView.ViewHolder viewHolder, List<Object> list) {
        if (!list.isEmpty() || super.canReuseUpdatedViewHolder(viewHolder, list)) {
            return true;
        }
        return false;
    }
}
