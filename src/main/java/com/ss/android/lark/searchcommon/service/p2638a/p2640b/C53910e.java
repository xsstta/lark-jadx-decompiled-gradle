package com.ss.android.lark.searchcommon.service.p2638a.p2640b;

import com.ss.android.lark.searchcommon.dto.info.SearchFileInfo;
import com.ss.android.lark.searchcommon.service.entity.p2646a.C53946a;

/* renamed from: com.ss.android.lark.searchcommon.service.a.b.e */
public class C53910e extends AbstractC53906a<SearchFileInfo, C53946a> {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public SearchFileInfo mo184290a() {
        return new SearchFileInfo();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo184292a(SearchFileInfo searchFileInfo, C53946a aVar) {
        searchFileInfo.setMsgType(aVar.mo184454a());
        searchFileInfo.setUpdateTime(aVar.mo184455b());
        searchFileInfo.setPosition(aVar.mo184456c());
        searchFileInfo.setChatId(aVar.mo184457d());
        searchFileInfo.setFromId(aVar.mo184459f());
        searchFileInfo.setFileContent(aVar.mo184460g());
        searchFileInfo.setP2pChat(aVar.mo184461h());
        searchFileInfo.setP2pChatterId(aVar.mo184458e());
        searchFileInfo.setThreadId(aVar.mo184462i());
        searchFileInfo.setThreadPosition(aVar.mo184463j());
    }
}
