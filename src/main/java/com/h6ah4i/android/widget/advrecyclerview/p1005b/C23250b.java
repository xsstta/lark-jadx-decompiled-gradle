package com.h6ah4i.android.widget.advrecyclerview.p1005b;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.h6ah4i.android.widget.advrecyclerview.b.b */
public class C23250b extends C23252d {
    /* access modifiers changed from: protected */
    @Override // com.h6ah4i.android.widget.advrecyclerview.p1005b.AbstractC23251c, com.h6ah4i.android.widget.advrecyclerview.p1005b.C23252d
    /* renamed from: c */
    public void mo80649c() {
        super.mo80649c();
        super.setSupportsChangeAnimations(false);
    }

    @Override // com.h6ah4i.android.widget.advrecyclerview.p1005b.AbstractC23251c, androidx.recyclerview.widget.SimpleItemAnimator
    public boolean animateChange(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i, int i2, int i3, int i4) {
        if (viewHolder != viewHolder2 || i != i3 || i2 != i4) {
            return super.animateChange(viewHolder, viewHolder2, i, i2, i3, i4);
        }
        dispatchChangeFinished(viewHolder, true);
        return false;
    }
}
