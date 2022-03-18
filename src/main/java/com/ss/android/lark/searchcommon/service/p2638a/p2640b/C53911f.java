package com.ss.android.lark.searchcommon.service.p2638a.p2640b;

import com.bytedance.lark.pb.search.v1.SearchOncallMeta;
import com.ss.android.lark.searchcommon.dto.info.SearchHelpDeskInfo;

/* renamed from: com.ss.android.lark.searchcommon.service.a.b.f */
public class C53911f extends AbstractC53906a<SearchHelpDeskInfo, SearchOncallMeta> {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public SearchHelpDeskInfo mo184290a() {
        return new SearchHelpDeskInfo();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo184292a(SearchHelpDeskInfo searchHelpDeskInfo, SearchOncallMeta searchOncallMeta) {
        searchHelpDeskInfo.setOfficialOnCall(searchOncallMeta.is_official_oncall.booleanValue());
        searchHelpDeskInfo.setTags(searchOncallMeta.tags);
        searchHelpDeskInfo.setFaqId(searchOncallMeta.faq_id);
        searchHelpDeskInfo.setFaqTitle(searchOncallMeta.faq_title);
        searchHelpDeskInfo.setCrossTagInfo(searchOncallMeta.cross_tag_info);
    }
}
