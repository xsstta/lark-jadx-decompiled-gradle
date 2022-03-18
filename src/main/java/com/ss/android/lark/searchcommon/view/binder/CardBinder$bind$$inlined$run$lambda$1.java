package com.ss.android.lark.searchcommon.view.binder;

import android.content.Context;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.lark.searchcommon.dto.info.SearchCardInfo;
import com.ss.android.lark.searchcommon.view.SearchResultViewAdapter;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\u0005¸\u0006\u0000"}, d2 = {"com/ss/android/lark/searchcommon/view/binder/CardBinder$bind$1$1", "Landroidx/recyclerview/widget/GridLayoutManager;", "canScrollHorizontally", "", "canScrollVertically", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
public final class CardBinder$bind$$inlined$run$lambda$1 extends GridLayoutManager {

    /* renamed from: i */
    final /* synthetic */ RecyclerView f133566i;

    /* renamed from: j */
    final /* synthetic */ CardBinder f133567j;

    /* renamed from: k */
    final /* synthetic */ SearchCardInfo f133568k;

    /* renamed from: l */
    final /* synthetic */ SearchResultViewAdapter.IOnItemOnScreenListener f133569l;

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
    public boolean canScrollHorizontally() {
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
    public boolean canScrollVertically() {
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CardBinder$bind$$inlined$run$lambda$1(RecyclerView recyclerView, Context context, int i, CardBinder fVar, SearchCardInfo searchCardInfo, SearchResultViewAdapter.IOnItemOnScreenListener cVar) {
        super(context, i);
        this.f133566i = recyclerView;
        this.f133567j = fVar;
        this.f133568k = searchCardInfo;
        this.f133569l = cVar;
    }
}
