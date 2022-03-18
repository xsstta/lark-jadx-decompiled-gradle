package com.ss.android.lark.search.redesign.p2625a;

import android.content.Context;
import com.ss.android.lark.search.impl.entity.SearchDetailInitData;
import com.ss.android.lark.search.impl.p2604d.C53364a;
import com.ss.android.lark.searchcommon.dto.Scene;
import com.ss.android.lark.searchcommon.service.entity.history.SearchInfoHistory;
import com.ss.android.lark.searchcommon.service.entity.request.NetSearchRequest;
import com.ss.android.lark.searchcommon.utils.ImprId;

/* renamed from: com.ss.android.lark.search.redesign.a.a */
public final class C53680a {
    /* renamed from: a */
    public static void m207809a(Context context, Scene.Type type, int i, int i2, String str) {
        C53364a.m206586a(context, SearchDetailInitData.newBuilder().mo182080a(str).mo182082a(false).mo182078a(NetSearchRequest.Filter.newBuilder().mo184522a()).mo182076a(new SearchInfoHistory.MessageSubSource(SearchInfoHistory.MessageSubSource.Type.ALL)).mo182075a(type).mo182084b(i).mo182088d(i2).mo182087c("search_detail").mo182079a(new ImprId()).mo182083a());
    }
}
