package com.ss.android.lark.mail.impl.widget.advrecyclerview.swipeable;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* access modifiers changed from: package-private */
/* renamed from: com.ss.android.lark.mail.impl.widget.advrecyclerview.swipeable.j */
public class C44043j {
    /* renamed from: a */
    public static View m174470a(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder instanceof AbstractC44041h) {
            return m174471a((AbstractC44041h) viewHolder);
        }
        return null;
    }

    /* renamed from: a */
    public static View m174471a(AbstractC44041h hVar) {
        if (!(hVar instanceof RecyclerView.ViewHolder)) {
            return null;
        }
        View a = hVar.mo153358a();
        if (a != ((RecyclerView.ViewHolder) hVar).itemView) {
            return a;
        }
        throw new IllegalStateException("Inconsistency detected! getSwipeableContainerView() returns itemView");
    }
}
