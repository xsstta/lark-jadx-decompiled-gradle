package com.ss.android.lark.search.service.compatible;

import com.bytedance.lark.pb.basic.v1.Chat;
import com.bytedance.lark.pb.search.v1.ChatFilterParam;
import com.ss.android.lark.search.service.v2.SearchService;
import com.ss.android.lark.searchcommon.service.compatible.SearchContext;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J \u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J \u0010\u0016\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/lark/search/service/compatible/SearcherForChat;", "Lcom/ss/android/lark/search/service/compatible/BaseSearcher;", "()V", "chatModeList", "", "Lcom/bytedance/lark/pb/basic/v1/Chat$ChatMode;", "excludeResignedUser", "", "excludeWithoutChatUser", "includeThread", "mIsCheckOUPermission", "mIsNeedSearchOuterUser", "parseBusinessParams", "", "context", "Lcom/ss/android/lark/searchcommon/service/compatible/SearchContext;", "v1Search", "requestId", "", "session", "seqId", "", "v2Search", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.b.a.h */
public final class SearcherForChat extends BaseSearcher {

    /* renamed from: c */
    private boolean f131722c;

    /* renamed from: d */
    private boolean f131723d = true;

    /* renamed from: e */
    private List<Chat.ChatMode> f131724e = new ArrayList();

    /* renamed from: f */
    private boolean f131725f = true;

    /* renamed from: g */
    private boolean f131726g = true;

    /* renamed from: h */
    private boolean f131727h;

    @Override // com.ss.android.lark.search.service.compatible.BaseSearcher
    /* renamed from: a */
    public void mo181846a(SearchContext searchContext) {
        Intrinsics.checkParameterIsNotNull(searchContext, "context");
        this.f131722c = searchContext.mo184417f();
        this.f131723d = searchContext.mo184411d();
        this.f131724e.clear();
        for (ChatFilterParam.ChatMode chatMode : searchContext.mo184444t()) {
            Chat.ChatMode.fromValue(chatMode.getValue());
        }
        this.f131725f = searchContext.mo184383P();
        this.f131726g = searchContext.mo184384Q();
        this.f131727h = searchContext.mo184385R();
    }

    @Override // com.ss.android.lark.search.service.compatible.BaseSearcher
    /* renamed from: b */
    public void mo181854b(String str, String str2, int i) {
        Intrinsics.checkParameterIsNotNull(str, "requestId");
        Intrinsics.checkParameterIsNotNull(str2, "session");
        mo181861f().mo181893a(mo181844a(), str, this.f131722c, mo181855c(), mo181859d(), this.f131723d, mo181850b());
    }

    @Override // com.ss.android.lark.search.service.compatible.BaseSearcher
    /* renamed from: c */
    public void mo181858c(String str, String str2, int i) {
        Intrinsics.checkParameterIsNotNull(str, "requestId");
        Intrinsics.checkParameterIsNotNull(str2, "session");
        SearchService.f131813a.mo181945a(str, mo181844a(), str2, i, mo181860e(), this.f131724e, this.f131725f, this.f131726g, this.f131722c, this.f131727h, this.f131723d, mo181850b());
    }
}
