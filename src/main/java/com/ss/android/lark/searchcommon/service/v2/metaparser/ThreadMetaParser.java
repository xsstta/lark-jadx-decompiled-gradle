package com.ss.android.lark.searchcommon.service.v2.metaparser;

import com.bytedance.lark.pb.search.v2.ThreadMeta;
import com.ss.android.lark.chat.api.AbstractC32808a;
import com.ss.android.lark.chat.entity.Channel;
import com.ss.android.lark.searchcommon.SearchCommonModuleDependency;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchThreadInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/searchcommon/service/v2/metaparser/ThreadMetaParser;", "Lcom/ss/android/lark/searchcommon/service/v2/metaparser/IParser;", "Lcom/bytedance/lark/pb/search/v2/ThreadMeta;", "()V", "parser", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "meta", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.service.b.a.n */
public final class ThreadMetaParser {
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.lark.searchcommon.dto.info.SearchThreadInfo */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public SearchBaseInfo mo184333a(ThreadMeta threadMeta) {
        Channel channel = null;
        if (threadMeta != null) {
            SearchThreadInfo searchThreadInfo = new SearchThreadInfo();
            AbstractC32808a i = SearchCommonModuleDependency.m208732b().mo102919i();
            if (i != null) {
                channel = i.mo120944a(threadMeta.channel);
            }
            searchThreadInfo.setChannel(channel);
            Long l = threadMeta.update_time;
            Intrinsics.checkExpressionValueIsNotNull(l, "it.update_time");
            searchThreadInfo.setUpdateTime(l.longValue());
            searchThreadInfo.setChatId(threadMeta.chat_id);
            channel = searchThreadInfo;
        }
        return (SearchBaseInfo) channel;
    }
}
