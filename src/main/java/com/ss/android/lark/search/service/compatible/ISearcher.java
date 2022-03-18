package com.ss.android.lark.search.service.compatible;

import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.searchcommon.dto.SearchResponse;
import com.ss.android.lark.searchcommon.service.compatible.SearchContext;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J \u0010\t\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J \u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH&¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/search/service/compatible/ISearcher;", "", "parseParams", "", "context", "Lcom/ss/android/lark/searchcommon/service/compatible/SearchContext;", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/searchcommon/dto/SearchResponse;", "parseParamsForInChatLoadMore", "search", "requestId", "", "session", "seqId", "", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.b.a.b */
public interface ISearcher {
    /* renamed from: a */
    void mo181847a(SearchContext searchContext, IGetDataCallback<SearchResponse> iGetDataCallback);

    /* renamed from: a */
    void mo181849a(String str, String str2, int i);

    /* renamed from: b */
    void mo181852b(SearchContext searchContext, IGetDataCallback<SearchResponse> iGetDataCallback);
}
