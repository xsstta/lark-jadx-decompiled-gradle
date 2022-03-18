package com.ss.android.lark.searchcommon.service.v2.metaparser;

import com.bytedance.lark.pb.basic.v1.Chatter;
import com.bytedance.lark.pb.search.v1.TimeZone;
import com.bytedance.lark.pb.search.v2.BotMeta;
import com.bytedance.lark.pb.search.v2.SimpleP2PChatInfo;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.chatter.ChatterDescription;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchChatterInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/searchcommon/service/v2/metaparser/BotMetaParser;", "Lcom/ss/android/lark/searchcommon/service/v2/metaparser/IParser;", "Lcom/bytedance/lark/pb/search/v2/BotMeta;", "()V", "parser", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "meta", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.service.b.a.c */
public final class BotMetaParser {
    /* renamed from: a */
    public SearchBaseInfo mo184322a(BotMeta botMeta) {
        SearchChatterInfo searchChatterInfo;
        if (botMeta != null) {
            searchChatterInfo = new SearchChatterInfo();
            searchChatterInfo.setChatterType(Chatter.ChatterType.BOT);
            String str = botMeta.description;
            Chatter.Description.Type type = botMeta.description_flag;
            Intrinsics.checkExpressionValueIsNotNull(type, "it.description_flag");
            searchChatterInfo.setChatterDescription(new ChatterDescription(str, ChatterDescription.Type.valueOf(type.getValue())));
            SimpleP2PChatInfo simpleP2PChatInfo = botMeta.p2p_chat_info;
            if (simpleP2PChatInfo != null) {
                Boolean bool = simpleP2PChatInfo.is_remind;
                Intrinsics.checkExpressionValueIsNotNull(bool, "it.is_remind");
                searchChatterInfo.setRemind(bool.booleanValue());
                searchChatterInfo.setP2pChatId(simpleP2PChatInfo.chat_id);
            }
            searchChatterInfo.setTenantId(botMeta.tenant_id);
            TimeZone timeZone = botMeta.timezone;
            if (timeZone != null) {
                searchChatterInfo.setTimeZoneId(timeZone.name);
            }
        } else {
            searchChatterInfo = null;
        }
        return searchChatterInfo;
    }
}
