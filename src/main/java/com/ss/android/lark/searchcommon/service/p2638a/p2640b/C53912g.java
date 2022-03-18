package com.ss.android.lark.searchcommon.service.p2638a.p2640b;

import com.bytedance.lark.pb.search.v1.SearchLinkMeta;
import com.ss.android.lark.searchcommon.dto.info.SearchLinkInfo;

/* renamed from: com.ss.android.lark.searchcommon.service.a.b.g */
public class C53912g extends AbstractC53906a<SearchLinkInfo, SearchLinkMeta> {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public SearchLinkInfo mo184290a() {
        return new SearchLinkInfo();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo184292a(SearchLinkInfo searchLinkInfo, SearchLinkMeta searchLinkMeta) {
        searchLinkInfo.setOriginalUrl(searchLinkMeta.original_url);
        searchLinkInfo.setFromName(searchLinkMeta.from_name);
        searchLinkInfo.setCreateTime(searchLinkMeta.create_time.longValue());
        searchLinkInfo.setChatId(searchLinkMeta.chat_id);
        searchLinkInfo.setThreadId(searchLinkMeta.thread_id);
        searchLinkInfo.setPosition(searchLinkMeta.position.intValue());
        searchLinkInfo.setThreadPosition(searchLinkMeta.thread_position.intValue());
    }
}
