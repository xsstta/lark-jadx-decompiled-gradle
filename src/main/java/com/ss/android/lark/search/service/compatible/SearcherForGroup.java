package com.ss.android.lark.search.service.compatible;

import com.bytedance.lark.pb.search.v1.ChatFilterParam;
import com.ss.android.lark.search.service.v2.SearchService;
import com.ss.android.lark.searchcommon.service.compatible.SearchContext;
import com.ss.android.lark.searchcommon.service.entity.ChatType;
import com.ss.android.lark.searchcommon.service.entity.request.NetSearchRequest;
import com.ss.android.lark.searchcommon.utils.ImprId;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J \u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J \u0010\u0011\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/lark/search/service/compatible/SearcherForGroup;", "Lcom/ss/android/lark/search/service/compatible/BaseSearcher;", "()V", "mChatMemberList", "", "", "mChatTypeList", "Lcom/ss/android/lark/searchcommon/service/entity/ChatType;", "parseBusinessParams", "", "context", "Lcom/ss/android/lark/searchcommon/service/compatible/SearchContext;", "v1Search", "requestId", "session", "seqId", "", "v2Search", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.b.a.l */
public final class SearcherForGroup extends BaseSearcher {

    /* renamed from: c */
    private List<ChatType> f131745c = new ArrayList();

    /* renamed from: d */
    private List<String> f131746d = new ArrayList();

    @Override // com.ss.android.lark.search.service.compatible.BaseSearcher
    /* renamed from: a */
    public void mo181846a(SearchContext searchContext) {
        Intrinsics.checkParameterIsNotNull(searchContext, "context");
        this.f131745c.clear();
        this.f131745c.addAll(searchContext.mo184445u());
        this.f131746d.clear();
        this.f131746d.addAll(searchContext.mo184446v());
    }

    @Override // com.ss.android.lark.search.service.compatible.BaseSearcher
    /* renamed from: c */
    public void mo181858c(String str, String str2, int i) {
        Intrinsics.checkParameterIsNotNull(str, "requestId");
        Intrinsics.checkParameterIsNotNull(str2, "session");
        SearchService.f131813a.mo181942a(str, mo181844a(), str2, i, mo181860e(), this.f131746d, this.f131745c, mo181850b());
    }

    @Override // com.ss.android.lark.search.service.compatible.BaseSearcher
    /* renamed from: b */
    public void mo181854b(String str, String str2, int i) {
        Intrinsics.checkParameterIsNotNull(str, "requestId");
        Intrinsics.checkParameterIsNotNull(str2, "session");
        mo181861f().mo181890a(str, str2, new ImprId(str2, i).imprId(), mo181844a(), mo181855c(), mo181859d(), NetSearchRequest.Filter.newBuilder().mo184525b(true).mo184518a(NetSearchRequest.ChatFilter.newBuilder().mo184511a(this.f131745c).mo184513b(this.f131746d).mo184514c(CollectionsKt.listOf(ChatFilterParam.ChatMode.UNLIMITED)).mo184512a()).mo184522a(), mo181850b());
    }
}
