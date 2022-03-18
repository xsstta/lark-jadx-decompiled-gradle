package com.ss.android.lark.mail.impl.widget.advrecyclerview.p2227b;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.ss.android.lark.mail.impl.widget.advrecyclerview.b.b */
public class C44017b extends C44019d {
    @Override // com.ss.android.lark.mail.impl.widget.advrecyclerview.p2227b.AbstractC44018c, androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateChange(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i, int i2, int i3, int i4) {
        if (viewHolder != viewHolder2 || i != i3 || i2 != i4) {
            return super.animateChange(viewHolder, viewHolder2, i, i2, i3, i4);
        }
        dispatchChangeFinished(viewHolder, true);
        return false;
    }
}
