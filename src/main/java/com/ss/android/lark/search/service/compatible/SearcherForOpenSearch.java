package com.ss.android.lark.search.service.compatible;

import com.bytedance.lark.pb.search.slash.v1.SlashCommandParam;
import com.ss.android.lark.search.service.v2.SearchService;
import com.ss.android.lark.searchcommon.service.compatible.SearchContext;
import com.ss.android.lark.searchcommon.utils.ImprId;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J \u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/search/service/compatible/SearcherForOpenSearch;", "Lcom/ss/android/lark/search/service/compatible/BaseSearcher;", "()V", "mAppId", "", "mExtra", "parseBusinessParams", "", "context", "Lcom/ss/android/lark/searchcommon/service/compatible/SearchContext;", "v1Search", "requestId", "session", "seqId", "", "v2Search", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.b.a.q */
public final class SearcherForOpenSearch extends BaseSearcher {

    /* renamed from: c */
    private String f131759c;

    /* renamed from: d */
    private String f131760d;

    @Override // com.ss.android.lark.search.service.compatible.BaseSearcher
    /* renamed from: a */
    public void mo181846a(SearchContext searchContext) {
        Intrinsics.checkParameterIsNotNull(searchContext, "context");
        super.mo181846a(searchContext);
        this.f131759c = searchContext.mo184373F();
        this.f131760d = searchContext.mo184374G();
    }

    @Override // com.ss.android.lark.search.service.compatible.BaseSearcher
    /* renamed from: c */
    public void mo181858c(String str, String str2, int i) {
        Intrinsics.checkParameterIsNotNull(str, "requestId");
        Intrinsics.checkParameterIsNotNull(str2, "session");
        SearchService aVar = SearchService.f131813a;
        String a = mo181844a();
        String e = mo181860e();
        String str3 = this.f131759c;
        String[] strArr = new String[1];
        String str4 = this.f131760d;
        if (str4 == null) {
            str4 = "";
        }
        strArr[0] = str4;
        aVar.mo181940a(str, a, str2, i, e, str3, CollectionsKt.mutableListOf(strArr), mo181850b());
    }

    @Override // com.ss.android.lark.search.service.compatible.BaseSearcher
    /* renamed from: b */
    public void mo181854b(String str, String str2, int i) {
        Intrinsics.checkParameterIsNotNull(str, "requestId");
        Intrinsics.checkParameterIsNotNull(str2, "session");
        SlashCommandParam.C18809a a = new SlashCommandParam.C18809a().mo64586a(this.f131759c);
        String[] strArr = new String[1];
        String str3 = this.f131760d;
        if (str3 == null) {
            str3 = "";
        }
        strArr[0] = str3;
        mo181861f().mo181888a(str, mo181844a(), str2, new ImprId(str2, i).imprId(), mo181855c(), mo181859d(), a.mo64587a(CollectionsKt.mutableListOf(strArr)).build(), mo181850b());
    }
}
