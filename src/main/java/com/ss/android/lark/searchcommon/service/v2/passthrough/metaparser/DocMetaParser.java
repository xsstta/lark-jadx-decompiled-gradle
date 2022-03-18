package com.ss.android.lark.searchcommon.service.v2.passthrough.metaparser;

import com.ss.android.lark.pb.entities.DocType;
import com.ss.android.lark.pb.usearch.DocMeta;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchSpaceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/searchcommon/service/v2/passthrough/metaparser/DocMetaParser;", "Lcom/ss/android/lark/searchcommon/service/v2/metaparser/IParser;", "Lcom/ss/android/lark/pb/usearch/DocMeta;", "()V", "parser", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "meta", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.service.b.b.a.c */
public final class DocMetaParser {
    /* renamed from: a */
    public SearchBaseInfo mo184342a(DocMeta docMeta) {
        SearchSpaceInfo searchSpaceInfo;
        if (docMeta != null) {
            searchSpaceInfo = new SearchSpaceInfo();
            DocType docType = docMeta.mtype;
            Intrinsics.checkExpressionValueIsNotNull(docType, "it.mtype");
            searchSpaceInfo.setDocType(com.ss.android.lark.doc.entity.DocType.forNumber(docType.getValue()));
            Long l = docMeta.mupdate_time;
            Intrinsics.checkExpressionValueIsNotNull(l, "it.mupdate_time");
            searchSpaceInfo.setUpdateTime(l.longValue());
            searchSpaceInfo.setDocUrl(docMeta.murl);
            searchSpaceInfo.setOwnerId(docMeta.mowner_id);
            searchSpaceInfo.setOwnerName(docMeta.mowner_name);
            Long l2 = docMeta.mlast_open_time;
            Intrinsics.checkExpressionValueIsNotNull(l2, "it.mlast_open_time");
            searchSpaceInfo.setLastOpenTime(l2.longValue());
            searchSpaceInfo.setEditUserName(docMeta.medit_user_name);
        } else {
            searchSpaceInfo = null;
        }
        return searchSpaceInfo;
    }
}
