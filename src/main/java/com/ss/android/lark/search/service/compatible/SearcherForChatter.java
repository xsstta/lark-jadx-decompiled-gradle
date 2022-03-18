package com.ss.android.lark.search.service.compatible;

import com.ss.android.lark.search.service.v2.SearchService;
import com.ss.android.lark.searchcommon.service.compatible.SearchContext;
import com.ss.android.lark.searchcommon.utils.ImprId;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J \u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J \u0010\u0013\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/search/service/compatible/SearcherForChatter;", "Lcom/ss/android/lark/search/service/compatible/BaseSearcher;", "()V", "excludeResignedUser", "", "excludeWithoutChatUser", "mIncludeBot", "mIncludeOuterTenant", "mIncludeSecretP2pChat", "parseBusinessParams", "", "context", "Lcom/ss/android/lark/searchcommon/service/compatible/SearchContext;", "v1Search", "requestId", "", "session", "seqId", "", "v2Search", "Companion", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.b.a.j */
public final class SearcherForChatter extends BaseSearcher {

    /* renamed from: c */
    public static final Companion f131730c = new Companion(null);

    /* renamed from: d */
    private boolean f131731d;

    /* renamed from: e */
    private boolean f131732e;

    /* renamed from: f */
    private boolean f131733f = true;

    /* renamed from: g */
    private boolean f131734g = true;

    /* renamed from: h */
    private boolean f131735h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/lark/search/service/compatible/SearcherForChatter$Companion;", "", "()V", "TAG", "", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.search.b.a.j$a */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.ss.android.lark.search.service.compatible.BaseSearcher
    /* renamed from: a */
    public void mo181846a(SearchContext searchContext) {
        Intrinsics.checkParameterIsNotNull(searchContext, "context");
        this.f131731d = searchContext.mo184437p();
        this.f131732e = searchContext.mo184439q();
        this.f131733f = searchContext.mo184383P();
        this.f131734g = searchContext.mo184384Q();
        this.f131735h = searchContext.mo184417f();
    }

    @Override // com.ss.android.lark.search.service.compatible.BaseSearcher
    /* renamed from: b */
    public void mo181854b(String str, String str2, int i) {
        Intrinsics.checkParameterIsNotNull(str, "requestId");
        Intrinsics.checkParameterIsNotNull(str2, "session");
        mo181861f().mo181881a(mo181844a(), str, mo181855c(), mo181859d(), str2, new ImprId(str2, i).imprId(), true, mo181850b());
    }

    @Override // com.ss.android.lark.search.service.compatible.BaseSearcher
    /* renamed from: c */
    public void mo181858c(String str, String str2, int i) {
        Intrinsics.checkParameterIsNotNull(str, "requestId");
        Intrinsics.checkParameterIsNotNull(str2, "session");
        SearchService.f131813a.mo181939a(str, mo181844a(), str2, i, mo181860e(), mo181850b(), this.f131731d, this.f131732e, this.f131733f, this.f131734g, this.f131735h);
    }
}
