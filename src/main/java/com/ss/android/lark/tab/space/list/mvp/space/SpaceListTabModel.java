package com.ss.android.lark.tab.space.list.mvp.space;

import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import com.ss.android.lark.searchcommon.dto.Scene;
import com.ss.android.lark.searchcommon.dto.SearchResponse;
import com.ss.android.lark.searchcommon.service.compatible.SearchContext;
import com.ss.android.lark.tab.space.list.entity.CommonListResponse;
import com.ss.android.lark.tab.space.list.entity.SpaceListViewData;
import com.ss.android.lark.tab.space.list.mvp.base.CommonListTabModel;
import com.ss.android.lark.tab.space.list.mvp.base.ModelParserForSearchResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/tab/space/list/mvp/space/SpaceListTabModel;", "Lcom/ss/android/lark/tab/space/list/mvp/base/CommonListTabModel;", "Lcom/ss/android/lark/tab/space/list/entity/SpaceListViewData;", "chatId", "", ShareHitPoint.f121869d, "", "(Ljava/lang/String;I)V", "buildSearchContext", "Lcom/ss/android/lark/searchcommon/service/compatible/SearchContext;", "parseToSearchViewData", "Lcom/ss/android/lark/tab/space/list/entity/CommonListResponse;", "searchResponse", "Lcom/ss/android/lark/searchcommon/dto/SearchResponse;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.tab.space.list.mvp.space.a */
public final class SpaceListTabModel extends CommonListTabModel<SpaceListViewData> {
    @Override // com.ss.android.lark.tab.space.list.mvp.ICommonListTabContract.IModel
    /* renamed from: a */
    public SearchContext mo188479a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "chatId");
        SearchContext searchContext = new SearchContext();
        searchContext.mo184391a(Scene.Type.SEARCH_DOCS_WIKI_IN_CHAT_SCENE);
        searchContext.mo184394a("");
        searchContext.mo184405c(str);
        return searchContext;
    }

    @Override // com.ss.android.lark.tab.space.list.mvp.ICommonListTabContract.IModel
    /* renamed from: a */
    public CommonListResponse<SpaceListViewData> mo188480a(SearchResponse searchResponse) {
        Intrinsics.checkParameterIsNotNull(searchResponse, "searchResponse");
        List<SpaceListViewData> a = ModelParserForSearchResponse.m214519a(searchResponse);
        int total = searchResponse.getTotal();
        boolean isHasMore = searchResponse.isHasMore();
        String requestId = searchResponse.getRequestId();
        Intrinsics.checkExpressionValueIsNotNull(requestId, "searchResponse.requestId");
        return new CommonListResponse<>(a, total, isHasMore, requestId);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SpaceListTabModel(String str, int i) {
        super(str, i);
        Intrinsics.checkParameterIsNotNull(str, "chatId");
    }
}
