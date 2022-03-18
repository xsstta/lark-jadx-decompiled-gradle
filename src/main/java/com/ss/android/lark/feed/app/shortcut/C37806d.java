package com.ss.android.lark.feed.app.shortcut;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.widget.recyclerview.p2965b.C58981b;

/* renamed from: com.ss.android.lark.feed.app.shortcut.d */
public class C37806d extends C58981b {
    public C37806d(C58981b.AbstractC58982a aVar) {
        super(aVar);
    }

    @Override // com.ss.android.lark.widget.recyclerview.p2965b.C58981b, androidx.recyclerview.widget.ItemTouchHelper.AbstractC1303a
    /* renamed from: a */
    public int mo6570a(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        int i;
        if (!(recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            return super.mo6570a(recyclerView, viewHolder);
        }
        if (viewHolder.getAdapterPosition() >= ShortCutStausManager.m148791a().mo138579f() || !ShortCutStausManager.m148791a().mo138578e()) {
            i = 15;
        } else {
            i = 12;
        }
        if (recyclerView.getAdapter().getItemCount() > ShortCutStausManager.m148791a().mo138579f() && viewHolder.getAdapterPosition() == ShortCutStausManager.m148791a().mo138579f() - 1) {
            i = 0;
        }
        return m5979b(i, 0);
    }
}
