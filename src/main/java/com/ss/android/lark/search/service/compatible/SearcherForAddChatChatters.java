package com.ss.android.lark.search.service.compatible;

import com.ss.android.lark.search.p2584b.AbstractC53280a;
import com.ss.android.lark.search.service.v2.SearchService;
import com.ss.android.lark.searchcommon.service.compatible.SearchContext;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J \u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J \u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/ss/android/lark/search/service/compatible/SearcherForAddChatChatters;", "Lcom/ss/android/lark/search/service/compatible/BaseSearcher;", "()V", "mAddChatterFromChat", "", "mAddChatterFromDepartment", "mAddChatterPermission", "Lcom/ss/android/lark/search/service/ISearchService$AddChatterPermission;", "mChatIds", "", "", "mDisableSearchChatter", "mIncludeMailContact", "mIsDepartmentSearchableWhenVisible", "mNeedSearchOuterUser", "mSearchOuterGroupChat", "parseBusinessParams", "", "context", "Lcom/ss/android/lark/searchcommon/service/compatible/SearchContext;", "v1Search", "requestId", "session", "seqId", "", "v2Search", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.b.a.d */
public final class SearcherForAddChatChatters extends BaseSearcher {

    /* renamed from: c */
    private List<String> f131707c;

    /* renamed from: d */
    private AbstractC53280a.C53281a f131708d;

    /* renamed from: e */
    private boolean f131709e;

    /* renamed from: f */
    private boolean f131710f;

    /* renamed from: g */
    private boolean f131711g;

    /* renamed from: h */
    private boolean f131712h;

    /* renamed from: i */
    private boolean f131713i;

    /* renamed from: j */
    private boolean f131714j;

    /* renamed from: k */
    private boolean f131715k;

    @Override // com.ss.android.lark.search.service.compatible.BaseSearcher
    /* renamed from: a */
    public void mo181846a(SearchContext searchContext) {
        Intrinsics.checkParameterIsNotNull(searchContext, "context");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(searchContext.mo184404c());
        this.f131707c = arrayList;
        AbstractC53280a.C53281a aVar = new AbstractC53280a.C53281a();
        aVar.mo181837a(searchContext.mo184411d());
        aVar.mo181839b(searchContext.mo184414e());
        aVar.mo181841c(searchContext.mo184429l());
        this.f131708d = aVar;
        this.f131709e = searchContext.mo184417f();
        this.f131710f = searchContext.mo184419g();
        this.f131711g = searchContext.mo184421h();
        this.f131712h = searchContext.mo184423i();
        this.f131713i = searchContext.mo184425j();
        this.f131714j = searchContext.mo184427k();
        this.f131715k = searchContext.mo184431m();
    }

    @Override // com.ss.android.lark.search.service.compatible.BaseSearcher
    /* renamed from: b */
    public void mo181854b(String str, String str2, int i) {
        Intrinsics.checkParameterIsNotNull(str, "requestId");
        Intrinsics.checkParameterIsNotNull(str2, "session");
        mo181861f().mo181882a(mo181844a(), str, mo181855c(), mo181859d(), this.f131707c, this.f131709e, this.f131708d, mo181850b());
    }

    @Override // com.ss.android.lark.search.service.compatible.BaseSearcher
    /* renamed from: c */
    public void mo181858c(String str, String str2, int i) {
        Intrinsics.checkParameterIsNotNull(str, "requestId");
        Intrinsics.checkParameterIsNotNull(str2, "session");
        SearchService aVar = SearchService.f131813a;
        String a = mo181844a();
        String e = mo181860e();
        List<String> list = this.f131707c;
        boolean z = this.f131709e;
        AbstractC53280a.C53281a aVar2 = this.f131708d;
        if (aVar2 == null) {
            Intrinsics.throwNpe();
        }
        aVar.mo181944a(str, a, str2, i, e, list, z, aVar2, mo181850b(), this.f131710f, this.f131711g, this.f131712h, this.f131713i, this.f131714j, this.f131715k);
    }
}
