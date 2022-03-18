package com.ss.android.lark.search.impl.p2606e;

import com.ss.android.lark.search.impl.entity.viewdata.SearchLinkViewData;
import com.ss.android.lark.searchcommon.dto.info.SearchLinkInfo;

/* renamed from: com.ss.android.lark.search.impl.e.g */
public class C53377g extends AbstractC53371a<SearchLinkViewData, SearchLinkInfo> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public SearchLinkViewData mo182051a(SearchLinkInfo searchLinkInfo) {
        return new SearchLinkViewData();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo182053a(SearchLinkViewData searchLinkViewData, SearchLinkInfo searchLinkInfo) {
        searchLinkViewData.setAvatarUrl(searchLinkInfo.getImageUrl());
        searchLinkViewData.setOriginalUrl(searchLinkInfo.getOriginalUrl());
        searchLinkViewData.setFromName(searchLinkInfo.getFromName());
        searchLinkViewData.setCreateTime(searchLinkInfo.getCreateTime());
        searchLinkViewData.setChatId(searchLinkInfo.getChatId());
        searchLinkViewData.setThreadId(searchLinkInfo.getThreadId());
        searchLinkViewData.setPosition(searchLinkInfo.getPosition());
        searchLinkViewData.setThreadPosition(searchLinkInfo.getThreadPosition());
    }
}
