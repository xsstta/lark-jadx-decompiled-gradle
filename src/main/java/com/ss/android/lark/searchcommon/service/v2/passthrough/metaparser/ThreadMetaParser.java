package com.ss.android.lark.searchcommon.service.v2.passthrough.metaparser;

import com.ss.android.lark.pb.usearch.ThreadMeta;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchThreadInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/searchcommon/service/v2/passthrough/metaparser/ThreadMetaParser;", "Lcom/ss/android/lark/searchcommon/service/v2/metaparser/IParser;", "Lcom/ss/android/lark/pb/usearch/ThreadMeta;", "()V", "parser", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "meta", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.service.b.b.a.g */
public final class ThreadMetaParser {
    /* renamed from: a */
    public SearchBaseInfo mo184346a(ThreadMeta threadMeta) {
        SearchThreadInfo searchThreadInfo;
        if (threadMeta != null) {
            searchThreadInfo = new SearchThreadInfo();
            Long l = threadMeta.mupdate_time;
            Intrinsics.checkExpressionValueIsNotNull(l, "it.mupdate_time");
            searchThreadInfo.setUpdateTime(l.longValue());
            searchThreadInfo.setChatId(threadMeta.mchat_id);
        } else {
            searchThreadInfo = null;
        }
        return searchThreadInfo;
    }
}
