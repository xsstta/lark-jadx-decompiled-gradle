package com.ss.android.lark.search.service.compatible;

import com.bytedance.lark.pb.search.v1.ChatFilterParam;
import com.ss.android.lark.searchcommon.dto.Scene;
import com.ss.android.lark.searchcommon.service.compatible.SearchContext;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J \u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J \u0010\u0012\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/ss/android/lark/search/service/compatible/SearcherForChatWithHistory;", "Lcom/ss/android/lark/search/service/compatible/BaseSearcher;", "()V", "mChatModeList", "", "Lcom/bytedance/lark/pb/search/v1/ChatFilterParam$ChatMode;", "mSearchSceneType", "Lcom/ss/android/lark/searchcommon/dto/Scene$Type;", "parseBusinessParams", "", "context", "Lcom/ss/android/lark/searchcommon/service/compatible/SearchContext;", "v1Search", "requestId", "", "session", "seqId", "", "v2Search", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.b.a.i */
public final class SearcherForChatWithHistory extends BaseSearcher {

    /* renamed from: c */
    private List<ChatFilterParam.ChatMode> f131728c = new ArrayList();

    /* renamed from: d */
    private Scene.Type f131729d = Scene.Type.SEARCH_HAD_CHAT_HISTORY_SCENE;

    @Override // com.ss.android.lark.search.service.compatible.BaseSearcher
    /* renamed from: a */
    public void mo181846a(SearchContext searchContext) {
        Intrinsics.checkParameterIsNotNull(searchContext, "context");
        Scene.Type y = searchContext.mo184449y();
        if (y == null) {
            y = Scene.Type.SEARCH_HAD_CHAT_HISTORY_SCENE;
        }
        this.f131729d = y;
        this.f131728c.clear();
        this.f131728c.addAll(searchContext.mo184444t());
    }

    @Override // com.ss.android.lark.search.service.compatible.BaseSearcher
    /* renamed from: c */
    public void mo181858c(String str, String str2, int i) {
        Intrinsics.checkParameterIsNotNull(str, "requestId");
        Intrinsics.checkParameterIsNotNull(str2, "session");
        mo181854b(str, str2, i);
    }

    @Override // com.ss.android.lark.search.service.compatible.BaseSearcher
    /* renamed from: b */
    public void mo181854b(String str, String str2, int i) {
        Intrinsics.checkParameterIsNotNull(str, "requestId");
        Intrinsics.checkParameterIsNotNull(str2, "session");
        if (this.f131729d == Scene.Type.SEARCH_HAD_CHAT_HISTORY_SCENE) {
            mo181861f().mo181898b(str, mo181844a(), true, mo181855c(), mo181859d(), this.f131728c, mo181850b());
        } else if (this.f131729d == Scene.Type.SEARCH_CHATS) {
            mo181861f().mo181892a(str, mo181844a(), true, mo181855c(), mo181859d(), this.f131728c, mo181850b());
        }
    }
}
