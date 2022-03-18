package com.ss.android.lark.mm.module.list.base;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/ss/android/lark/mm/module/list/base/MinutesBaseListFragment$initView$layoutManager$1", "Landroidx/recyclerview/widget/LinearLayoutManager;", "supportsPredictiveItemAnimations", "", "mm_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class MinutesBaseListFragment$initView$layoutManager$1 extends LinearLayoutManager {

    /* renamed from: a */
    final /* synthetic */ MinutesBaseListFragment f116749a;

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
    public boolean supportsPredictiveItemAnimations() {
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MinutesBaseListFragment$initView$layoutManager$1(MinutesBaseListFragment cVar, Context context) {
        super(context);
        this.f116749a = cVar;
    }
}
