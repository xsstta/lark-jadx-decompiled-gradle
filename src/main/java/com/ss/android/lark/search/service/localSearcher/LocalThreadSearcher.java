package com.ss.android.lark.search.service.localSearcher;

import com.bytedance.lark.pb.search.v1.ChatFilterParam;
import com.bytedance.lark.pb.search.v1.LocalIntegrationSearchRequest;
import com.larksuite.framework.callback.IGetDataCallback;
import com.ss.android.lark.search.C53258a;
import com.ss.android.lark.search.service.compatible.BaseSearcher;
import com.ss.android.lark.searchcommon.dto.SearchResponse;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J \u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/search/service/localSearcher/LocalThreadSearcher;", "Lcom/ss/android/lark/search/service/compatible/BaseSearcher;", "()V", "v1Search", "", "requestId", "", "session", "seqId", "", "v2Search", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.b.c.e */
public final class LocalThreadSearcher extends BaseSearcher {
    @Override // com.ss.android.lark.search.service.compatible.BaseSearcher
    /* renamed from: c */
    public void mo181858c(String str, String str2, int i) {
        Intrinsics.checkParameterIsNotNull(str, "requestId");
        Intrinsics.checkParameterIsNotNull(str2, "session");
    }

    @Override // com.ss.android.lark.search.service.compatible.BaseSearcher
    /* renamed from: b */
    public void mo181854b(String str, String str2, int i) {
        Intrinsics.checkParameterIsNotNull(str, "requestId");
        Intrinsics.checkParameterIsNotNull(str2, "session");
        if (!C53258a.m205939a().mo181745a("search.topic.enabled")) {
            IGetDataCallback<SearchResponse> b = mo181850b();
            SearchResponse searchResponse = new SearchResponse();
            searchResponse.setQuery(mo181844a());
            searchResponse.setRequestId(str);
            searchResponse.setFrom(0);
            searchResponse.setImprId("");
            searchResponse.setInfoList(new ArrayList());
            b.onSuccess(searchResponse);
            return;
        }
        mo181861f().mo181884a(mo181844a(), str, new LocalIntegrationSearchRequest.FilterParam.C18835a().mo64675a(new ChatFilterParam.C18813a().mo64601c(CollectionsKt.listOf(ChatFilterParam.ChatMode.THREAD)).build()).build(), mo181855c(), mo181859d(), mo181850b());
    }
}
