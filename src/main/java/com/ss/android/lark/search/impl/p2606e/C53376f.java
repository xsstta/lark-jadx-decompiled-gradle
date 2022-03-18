package com.ss.android.lark.search.impl.p2606e;

import com.ss.android.lark.search.impl.entity.viewdata.SearchHelpDeskViewData;
import com.ss.android.lark.searchcommon.dto.info.SearchHelpDeskInfo;

/* renamed from: com.ss.android.lark.search.impl.e.f */
public class C53376f extends AbstractC53371a<SearchHelpDeskViewData, SearchHelpDeskInfo> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public SearchHelpDeskViewData mo182051a(SearchHelpDeskInfo searchHelpDeskInfo) {
        return new SearchHelpDeskViewData();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo182053a(SearchHelpDeskViewData searchHelpDeskViewData, SearchHelpDeskInfo searchHelpDeskInfo) {
        searchHelpDeskViewData.setHelpDeskId(searchHelpDeskInfo.getId());
        searchHelpDeskViewData.setOfficialOnCall(searchHelpDeskInfo.isOfficialOnCall());
        searchHelpDeskViewData.setTags(searchHelpDeskInfo.getTags());
        searchHelpDeskViewData.setFaqId(searchHelpDeskInfo.getFaqId());
        searchHelpDeskViewData.setFaqTitle(searchHelpDeskInfo.getFaqTitle());
        searchHelpDeskViewData.setCrossTagInfo(searchHelpDeskInfo.getCrossTagInfo());
    }
}
