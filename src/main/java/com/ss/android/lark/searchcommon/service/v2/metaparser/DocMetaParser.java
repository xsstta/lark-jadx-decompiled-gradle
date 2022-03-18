package com.ss.android.lark.searchcommon.service.v2.metaparser;

import com.bytedance.lark.pb.basic.v1.Doc;
import com.bytedance.lark.pb.search.v2.DocMeta;
import com.ss.android.lark.doc.entity.DocType;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchSpaceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/searchcommon/service/v2/metaparser/DocMetaParser;", "Lcom/ss/android/lark/searchcommon/service/v2/metaparser/IParser;", "Lcom/bytedance/lark/pb/search/v2/DocMeta;", "()V", "parser", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "meta", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.service.b.a.h */
public final class DocMetaParser {
    /* renamed from: a */
    public SearchBaseInfo mo184327a(DocMeta docMeta) {
        SearchSpaceInfo searchSpaceInfo;
        if (docMeta != null) {
            searchSpaceInfo = new SearchSpaceInfo();
            Doc.Type type = docMeta.type;
            Intrinsics.checkExpressionValueIsNotNull(type, "it.type");
            searchSpaceInfo.setDocType(DocType.forNumber(type.getValue()));
            Long l = docMeta.update_time;
            Intrinsics.checkExpressionValueIsNotNull(l, "it.update_time");
            searchSpaceInfo.setUpdateTime(l.longValue());
            searchSpaceInfo.setDocUrl(docMeta.url);
            searchSpaceInfo.setOwnerId(docMeta.owner_id);
            searchSpaceInfo.setOwnerName(docMeta.owner_name);
            searchSpaceInfo.setMessageId(docMeta.message_id);
            searchSpaceInfo.setChatId(docMeta.chat_id);
            Integer num = docMeta.position;
            Intrinsics.checkExpressionValueIsNotNull(num, "it.position");
            searchSpaceInfo.setPosition(num.intValue());
            Boolean bool = docMeta.is_cross_tenant;
            Intrinsics.checkExpressionValueIsNotNull(bool, "it.is_cross_tenant");
            searchSpaceInfo.setCrossTenant(bool.booleanValue());
            searchSpaceInfo.setThreadId(docMeta.thread_id);
            Integer num2 = docMeta.thread_position;
            Intrinsics.checkExpressionValueIsNotNull(num2, "it.thread_position");
            searchSpaceInfo.setThreadPosition(num2.intValue());
            Long l2 = docMeta.last_open_time;
            Intrinsics.checkExpressionValueIsNotNull(l2, "it.last_open_time");
            searchSpaceInfo.setLastOpenTime(l2.longValue());
            searchSpaceInfo.setEditUserName(docMeta.edit_user_name);
        } else {
            searchSpaceInfo = null;
        }
        return searchSpaceInfo;
    }
}
