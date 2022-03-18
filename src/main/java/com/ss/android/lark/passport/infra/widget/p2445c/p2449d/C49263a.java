package com.ss.android.lark.passport.infra.widget.p2445c.p2449d;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.ss.android.lark.passport.infra.widget.c.d.a */
public class C49263a implements AbstractC49264b {
    /* renamed from: a */
    private void m194133a(RecyclerView.LayoutManager layoutManager) {
        if (!(layoutManager instanceof LinearLayoutManager)) {
            throw new IllegalStateException("StickyListHeadersDecoration can only be used with a LinearLayoutManager.");
        }
    }

    @Override // com.ss.android.lark.passport.infra.widget.p2445c.p2449d.AbstractC49264b
    /* renamed from: b */
    public boolean mo171822b(RecyclerView recyclerView) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        m194133a(layoutManager);
        return ((LinearLayoutManager) layoutManager).getReverseLayout();
    }

    @Override // com.ss.android.lark.passport.infra.widget.p2445c.p2449d.AbstractC49264b
    /* renamed from: a */
    public int mo171821a(RecyclerView recyclerView) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        m194133a(layoutManager);
        return ((LinearLayoutManager) layoutManager).getOrientation();
    }
}
