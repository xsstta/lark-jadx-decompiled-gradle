package com.ss.android.lark.searchcommon.service.compatible;

import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.searchcommon.dto.SearchResponse;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&J&\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH&¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/searchcommon/service/compatible/ISearchLifecycleObserver;", "", "onLoadMore", "", "requestId", "", "context", "Lcom/ss/android/lark/searchcommon/service/compatible/SearchContext;", "callback", "Lcom/larksuite/framework/callback/IGetDataCallback;", "Lcom/ss/android/lark/searchcommon/dto/SearchResponse;", "onSearch", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.service.compatible.a */
public interface ISearchLifecycleObserver {
    /* renamed from: a */
    void mo181872a(String str);

    /* renamed from: a */
    void mo181873a(String str, SearchContext searchContext, IGetDataCallback<SearchResponse> iGetDataCallback);

    /* renamed from: b */
    void mo181874b(String str, SearchContext searchContext, IGetDataCallback<SearchResponse> iGetDataCallback);
}
