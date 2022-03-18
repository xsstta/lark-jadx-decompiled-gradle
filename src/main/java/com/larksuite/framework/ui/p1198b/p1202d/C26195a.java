package com.larksuite.framework.ui.p1198b.p1202d;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.larksuite.framework.ui.b.d.a */
public class C26195a implements AbstractC26196b {
    /* renamed from: a */
    private void m94742a(RecyclerView.LayoutManager layoutManager) {
        if (!(layoutManager instanceof LinearLayoutManager)) {
            throw new IllegalStateException("StickyListHeadersDecoration can only be used with a LinearLayoutManager.");
        }
    }

    @Override // com.larksuite.framework.ui.p1198b.p1202d.AbstractC26196b
    /* renamed from: b */
    public boolean mo93175b(RecyclerView recyclerView) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        m94742a(layoutManager);
        return ((LinearLayoutManager) layoutManager).getReverseLayout();
    }

    @Override // com.larksuite.framework.ui.p1198b.p1202d.AbstractC26196b
    /* renamed from: a */
    public int mo93174a(RecyclerView recyclerView) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        m94742a(layoutManager);
        return ((LinearLayoutManager) layoutManager).getOrientation();
    }
}
