package com.ss.android.lark.search.service.localSearcher;

import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.search.service.compatible.BaseSearcher;
import com.ss.android.lark.searchcommon.dto.Scene;
import com.ss.android.lark.searchcommon.dto.SearchResponse;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0016J \u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/search/service/localSearcher/LocalEmptySearcher;", "Lcom/ss/android/lark/search/service/compatible/BaseSearcher;", "scene", "Lcom/ss/android/lark/searchcommon/dto/Scene$Type;", "(Lcom/ss/android/lark/searchcommon/dto/Scene$Type;)V", "getScene", "()Lcom/ss/android/lark/searchcommon/dto/Scene$Type;", "v1Search", "", "requestId", "", "session", "seqId", "", "v2Search", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.b.c.c */
public final class LocalEmptySearcher extends BaseSearcher {

    /* renamed from: c */
    private final Scene.Type f131797c;

    @Override // com.ss.android.lark.search.service.compatible.BaseSearcher
    /* renamed from: c */
    public void mo181858c(String str, String str2, int i) {
        Intrinsics.checkParameterIsNotNull(str, "requestId");
        Intrinsics.checkParameterIsNotNull(str2, "session");
    }

    public LocalEmptySearcher(Scene.Type type) {
        Intrinsics.checkParameterIsNotNull(type, "scene");
        this.f131797c = type;
    }

    @Override // com.ss.android.lark.search.service.compatible.BaseSearcher
    /* renamed from: b */
    public void mo181854b(String str, String str2, int i) {
        Intrinsics.checkParameterIsNotNull(str, "requestId");
        Intrinsics.checkParameterIsNotNull(str2, "session");
        IGetDataCallback<SearchResponse> b = mo181850b();
        SearchResponse searchResponse = new SearchResponse();
        searchResponse.setQuery(mo181844a());
        searchResponse.setRequestId(str);
        searchResponse.setFrom(0);
        searchResponse.setScene(this.f131797c);
        searchResponse.setImprId("");
        searchResponse.setInfoList(new ArrayList());
        b.onSuccess(searchResponse);
    }
}
