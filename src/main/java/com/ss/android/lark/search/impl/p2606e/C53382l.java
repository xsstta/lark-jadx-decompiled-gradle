package com.ss.android.lark.search.impl.p2606e;

import com.ss.android.lark.search.impl.entity.viewdata.SearchThreadViewData;
import com.ss.android.lark.searchcommon.dto.info.SearchThreadInfo;

/* renamed from: com.ss.android.lark.search.impl.e.l */
public class C53382l extends AbstractC53371a<SearchThreadViewData, SearchThreadInfo> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public SearchThreadViewData mo182051a(SearchThreadInfo searchThreadInfo) {
        return new SearchThreadViewData();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo182053a(SearchThreadViewData searchThreadViewData, SearchThreadInfo searchThreadInfo) {
        searchThreadViewData.setThreadId(searchThreadInfo.getId());
        searchThreadViewData.setUpdateTime(searchThreadInfo.getUpdateTime());
        searchThreadViewData.setChatId(searchThreadInfo.getChannel().getId());
    }
}
