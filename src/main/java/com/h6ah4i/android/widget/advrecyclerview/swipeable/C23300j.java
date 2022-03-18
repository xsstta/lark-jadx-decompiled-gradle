package com.h6ah4i.android.widget.advrecyclerview.swipeable;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.h6ah4i.android.widget.advrecyclerview.swipeable.j */
class C23300j {
    /* renamed from: a */
    public static View m84619a(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof AbstractC23298h) {
            return m84620a((AbstractC23298h) viewHolder);
        }
        return null;
    }

    /* renamed from: a */
    public static View m84620a(AbstractC23298h hVar) {
        if (!(hVar instanceof RecyclerView.ViewHolder)) {
            return null;
        }
        View k = hVar.mo80851k();
        if (k != ((RecyclerView.ViewHolder) hVar).itemView) {
            return k;
        }
        throw new IllegalStateException("Inconsistency detected! getSwipeableContainerView() returns itemView");
    }
}
