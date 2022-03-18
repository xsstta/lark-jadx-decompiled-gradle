package com.ss.android.lark.searchcommon.service.v2.passthrough.metaparser;

import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.pb.entities.Message;
import com.ss.android.lark.pb.usearch.MessageMeta;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchMessageInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/searchcommon/service/v2/passthrough/metaparser/MessageMetaParser;", "Lcom/ss/android/lark/searchcommon/service/v2/metaparser/IParser;", "Lcom/ss/android/lark/pb/usearch/MessageMeta;", "()V", "parser", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "meta", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.service.b.b.a.e */
public final class MessageMetaParser {
    /* renamed from: a */
    public SearchBaseInfo mo184344a(MessageMeta messageMeta) {
        SearchMessageInfo searchMessageInfo;
        if (messageMeta != null) {
            searchMessageInfo = new SearchMessageInfo();
            Message.Type type = messageMeta.mtype;
            Intrinsics.checkExpressionValueIsNotNull(type, "it.mtype");
            searchMessageInfo.setMsgType(Message.Type.forNumber(type.getValue()));
            Long l = messageMeta.mupdate_time;
            Intrinsics.checkExpressionValueIsNotNull(l, "it.mupdate_time");
            searchMessageInfo.setUpdateTime(l.longValue());
            Long l2 = messageMeta.mcreate_time;
            Intrinsics.checkExpressionValueIsNotNull(l2, "it.mcreate_time");
            searchMessageInfo.setCreateTime(l2.longValue());
            Integer num = messageMeta.mposition;
            Intrinsics.checkExpressionValueIsNotNull(num, "it.mposition");
            searchMessageInfo.setPosition(num.intValue());
            searchMessageInfo.setFromId(messageMeta.mfrom_id);
            searchMessageInfo.setChatId(messageMeta.mchat_id);
            searchMessageInfo.setThreadId(messageMeta.mthread_id);
            Integer num2 = messageMeta.mthread_position;
            Intrinsics.checkExpressionValueIsNotNull(num2, "it.mthread_position");
            searchMessageInfo.setMessageThreadPosition(num2.intValue());
            Integer num3 = messageMeta.mthread_chat_position;
            Intrinsics.checkExpressionValueIsNotNull(num3, "it.mthread_chat_position");
            searchMessageInfo.setThreadChatPosition(num3.intValue());
            Boolean bool = messageMeta.mis_p2p_chat;
            Intrinsics.checkExpressionValueIsNotNull(bool, "it.mis_p2p_chat");
            searchMessageInfo.setP2pChat(bool.booleanValue());
            Long l3 = messageMeta.mavatar_key_chatter_id;
            Intrinsics.checkExpressionValueIsNotNull(l3, "it.mavatar_key_chatter_id");
            searchMessageInfo.setP2pChatterId(l3.longValue());
        } else {
            searchMessageInfo = null;
        }
        return searchMessageInfo;
    }
}
