package com.ss.android.lark.searchcommon.service.p2638a.p2640b;

import com.bytedance.lark.pb.search.slash.v1.SlashCommandMeta;
import com.ss.android.lark.searchcommon.dto.info.SearchOpenSearchInfo;

/* renamed from: com.ss.android.lark.searchcommon.service.a.b.k */
public class C53916k extends AbstractC53906a<SearchOpenSearchInfo, SlashCommandMeta> {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public SearchOpenSearchInfo mo184290a() {
        return new SearchOpenSearchInfo();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo184292a(SearchOpenSearchInfo searchOpenSearchInfo, SlashCommandMeta slashCommandMeta) {
        searchOpenSearchInfo.setApp_link(slashCommandMeta.app_link);
        searchOpenSearchInfo.setExtraTitle(slashCommandMeta.description);
        searchOpenSearchInfo.setExtra(slashCommandMeta.extra);
        searchOpenSearchInfo.setSlash_command_type(slashCommandMeta.slash_command_type);
        searchOpenSearchInfo.setTag(slashCommandMeta.tag);
    }
}
