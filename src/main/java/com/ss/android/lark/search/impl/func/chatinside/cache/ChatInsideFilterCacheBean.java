package com.ss.android.lark.search.impl.func.chatinside.cache;

import com.ss.android.lark.search.constant.SearchConstants;
import com.ss.android.lark.searchcommon.service.entity.request.NetSearchRequest;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/search/impl/func/chatinside/cache/ChatInsideFilterCacheBean;", "Lcom/ss/android/lark/search/impl/func/chatinside/cache/ChatInsideSearchCacheBean;", "()V", "avatarKeys", "", "", "getAvatarKeys", "()Ljava/util/List;", "setAvatarKeys", "(Ljava/util/List;)V", "filter", "Lcom/ss/android/lark/searchcommon/service/entity/request/NetSearchRequest$Filter;", "getFilter", "()Lcom/ss/android/lark/searchcommon/service/entity/request/NetSearchRequest$Filter;", "setFilter", "(Lcom/ss/android/lark/searchcommon/service/entity/request/NetSearchRequest$Filter;)V", "spaceType", "Lcom/ss/android/lark/search/constant/SearchConstants$SpaceType;", "getSpaceType", "()Lcom/ss/android/lark/search/constant/SearchConstants$SpaceType;", "setSpaceType", "(Lcom/ss/android/lark/search/constant/SearchConstants$SpaceType;)V", "core_search_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.search.impl.func.chatinside.a.a */
public final class ChatInsideFilterCacheBean extends C53407b {

    /* renamed from: a */
    private NetSearchRequest.Filter f132002a;

    /* renamed from: b */
    private List<String> f132003b = new ArrayList();

    /* renamed from: c */
    private SearchConstants.SpaceType f132004c = SearchConstants.SpaceType.UNKNOWN;

    /* renamed from: a */
    public final NetSearchRequest.Filter mo182422a() {
        return this.f132002a;
    }

    /* renamed from: b */
    public final List<String> mo182426b() {
        return this.f132003b;
    }

    /* renamed from: c */
    public final SearchConstants.SpaceType mo182427c() {
        return this.f132004c;
    }

    public ChatInsideFilterCacheBean() {
        NetSearchRequest.Filter a = NetSearchRequest.Filter.newBuilder().mo184522a();
        Intrinsics.checkExpressionValueIsNotNull(a, "NetSearchRequest.Filter.newBuilder().build()");
        this.f132002a = a;
    }

    /* renamed from: a */
    public final void mo182423a(SearchConstants.SpaceType spaceType) {
        this.f132004c = spaceType;
    }

    /* renamed from: a */
    public final void mo182424a(NetSearchRequest.Filter filter) {
        Intrinsics.checkParameterIsNotNull(filter, "<set-?>");
        this.f132002a = filter;
    }

    /* renamed from: a */
    public final void mo182425a(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "<set-?>");
        this.f132003b = list;
    }
}
