package com.ss.android.lark.searchcommon.service.v2.metaparser;

import com.bytedance.lark.pb.search.v2.URLMeta;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchLinkInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/searchcommon/service/v2/metaparser/URLMetaParser;", "Lcom/ss/android/lark/searchcommon/service/v2/metaparser/IParser;", "Lcom/bytedance/lark/pb/search/v2/URLMeta;", "()V", "parser", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "meta", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.service.b.a.o */
public final class URLMetaParser {
    /* renamed from: a */
    public SearchBaseInfo mo184334a(URLMeta uRLMeta) {
        SearchLinkInfo searchLinkInfo;
        if (uRLMeta != null) {
            searchLinkInfo = new SearchLinkInfo();
            searchLinkInfo.setOriginalUrl(uRLMeta.url);
            Long l = uRLMeta.create_time;
            Intrinsics.checkExpressionValueIsNotNull(l, "it.create_time");
            searchLinkInfo.setCreateTime(l.longValue());
            searchLinkInfo.setChatId(uRLMeta.chat_id);
            searchLinkInfo.setThreadId(uRLMeta.thread_id);
            Integer num = uRLMeta.message_position;
            Intrinsics.checkExpressionValueIsNotNull(num, "it.message_position");
            searchLinkInfo.setPosition(num.intValue());
            Integer num2 = uRLMeta.thread_position;
            Intrinsics.checkExpressionValueIsNotNull(num2, "it.thread_position");
            searchLinkInfo.setThreadPosition(num2.intValue());
        } else {
            searchLinkInfo = null;
        }
        return searchLinkInfo;
    }
}
