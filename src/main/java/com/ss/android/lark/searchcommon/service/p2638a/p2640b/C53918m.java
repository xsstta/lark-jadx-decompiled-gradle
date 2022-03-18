package com.ss.android.lark.searchcommon.service.p2638a.p2640b;

import com.bytedance.lark.pb.search.v1.SearchDocMeta;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.doc.entity.DocType;
import com.ss.android.lark.searchcommon.dto.info.SearchSpaceInfo;

/* renamed from: com.ss.android.lark.searchcommon.service.a.b.m */
public class C53918m extends AbstractC53906a<SearchSpaceInfo, SearchDocMeta> {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public SearchSpaceInfo mo184290a() {
        return new SearchSpaceInfo();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo184292a(SearchSpaceInfo searchSpaceInfo, SearchDocMeta searchDocMeta) {
        searchSpaceInfo.setDocType(DocType.forNumber(searchDocMeta.type.getValue()));
        searchSpaceInfo.setUpdateTime(searchDocMeta.update_time.longValue());
        searchSpaceInfo.setDocUrl(searchDocMeta.url);
        searchSpaceInfo.setOwnerId(searchDocMeta.owner_id);
        searchSpaceInfo.setOwnerName(searchDocMeta.owner_name);
        searchSpaceInfo.setMessageId(searchDocMeta.message_id);
        searchSpaceInfo.setPosition(searchDocMeta.position.intValue());
        searchSpaceInfo.setCrossTenant(searchDocMeta.is_cross_tenant.booleanValue());
        searchSpaceInfo.setThreadId(searchDocMeta.thread_id);
        searchSpaceInfo.setThreadPosition(searchDocMeta.thread_position.intValue());
        searchSpaceInfo.setLastOpenTime(searchDocMeta.last_open_time.longValue());
        searchSpaceInfo.setEditUserName(searchDocMeta.edit_user_name);
        if (CollectionUtils.isNotEmpty(searchDocMeta.wiki_info)) {
            searchSpaceInfo.setWikiInfo(searchDocMeta.wiki_info.get(0));
        }
    }
}
