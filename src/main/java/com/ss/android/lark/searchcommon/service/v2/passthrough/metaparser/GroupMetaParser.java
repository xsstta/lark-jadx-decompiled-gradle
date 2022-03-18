package com.ss.android.lark.searchcommon.service.v2.passthrough.metaparser;

import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.pb.entities.Chat;
import com.ss.android.lark.pb.usearch.GroupChatMeta;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/searchcommon/service/v2/passthrough/metaparser/GroupMetaParser;", "Lcom/ss/android/lark/searchcommon/service/v2/metaparser/IParser;", "Lcom/ss/android/lark/pb/usearch/GroupChatMeta;", "()V", "parser", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "meta", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.service.b.b.a.d */
public final class GroupMetaParser {
    /* renamed from: a */
    public SearchBaseInfo mo184343a(GroupChatMeta groupChatMeta) {
        SearchChatInfo searchChatInfo = null;
        if (groupChatMeta != null) {
            Boolean bool = groupChatMeta.mis_crypto;
            Intrinsics.checkExpressionValueIsNotNull(bool, "it.mis_crypto");
            if (bool.booleanValue()) {
                return null;
            }
            searchChatInfo = new SearchChatInfo();
            Chat.ChatMode chatMode = groupChatMeta.mmode;
            Intrinsics.checkExpressionValueIsNotNull(chatMode, "it.mmode");
            searchChatInfo.setChatMode(Chat.ChatMode.forNumber(chatMode.getValue()));
            Integer num = groupChatMeta.muser_count;
            Intrinsics.checkExpressionValueIsNotNull(num, "it.muser_count");
            searchChatInfo.setUserCount(num.intValue());
        }
        return searchChatInfo;
    }
}
