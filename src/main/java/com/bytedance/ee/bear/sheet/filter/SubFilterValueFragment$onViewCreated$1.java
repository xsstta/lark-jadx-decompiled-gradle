package com.bytedance.ee.bear.sheet.filter;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ee.log.C13479a;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0018\u00010\u0005R\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"com/bytedance/ee/bear/sheet/filter/SubFilterValueFragment$onViewCreated$1", "Landroidx/recyclerview/widget/LinearLayoutManager;", "onLayoutChildren", "", "recycler", "Landroidx/recyclerview/widget/RecyclerView$Recycler;", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "sheet_release"}, mo238835k = 1, mv = {1, 1, 15})
public final class SubFilterValueFragment$onViewCreated$1 extends LinearLayoutManager {

    /* renamed from: a */
    final /* synthetic */ SubFilterValueFragment f29971a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SubFilterValueFragment$onViewCreated$1(SubFilterValueFragment hVar, Context context) {
        super(context);
        this.f29971a = hVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        try {
            super.onLayoutChildren(recycler, state);
        } catch (IndexOutOfBoundsException e) {
            C13479a.m54759a("SubFilterValueFragment", "meet an IndexOutOfBoundsException in RecyclerView", e);
        }
    }
}
