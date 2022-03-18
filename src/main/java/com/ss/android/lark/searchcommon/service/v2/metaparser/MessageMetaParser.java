package com.ss.android.lark.searchcommon.service.v2.metaparser;

import com.bytedance.lark.pb.basic.v1.Doc;
import com.bytedance.lark.pb.basic.v1.File;
import com.bytedance.lark.pb.basic.v1.Message;
import com.bytedance.lark.pb.search.v2.MessageMeta;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.doc.entity.Doc;
import com.ss.android.lark.doc.entity.DocType;
import com.ss.android.lark.searchcommon.dto.info.SearchBaseInfo;
import com.ss.android.lark.searchcommon.dto.info.SearchMessageInfo;
import com.ss.android.lark.searchcommon.service.p2638a.p2640b.C53907b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/searchcommon/service/v2/metaparser/MessageMetaParser;", "Lcom/ss/android/lark/searchcommon/service/v2/metaparser/IParser;", "Lcom/bytedance/lark/pb/search/v2/MessageMeta;", "()V", "parser", "Lcom/ss/android/lark/searchcommon/dto/info/SearchBaseInfo;", "meta", "search-common_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.service.b.a.j */
public final class MessageMetaParser {
    /* renamed from: a */
    public SearchBaseInfo mo184329a(MessageMeta messageMeta) {
        SearchMessageInfo searchMessageInfo;
        long j;
        if (messageMeta != null) {
            searchMessageInfo = new SearchMessageInfo();
            Message.Type type = messageMeta.type;
            Intrinsics.checkExpressionValueIsNotNull(type, "it.type");
            searchMessageInfo.setMsgType(Message.Type.forNumber(type.getValue()));
            Long l = messageMeta.update_time;
            Intrinsics.checkExpressionValueIsNotNull(l, "it.update_time");
            searchMessageInfo.setUpdateTime(l.longValue());
            Long l2 = messageMeta.create_time;
            Intrinsics.checkExpressionValueIsNotNull(l2, "it.create_time");
            searchMessageInfo.setCreateTime(l2.longValue());
            Integer num = messageMeta.position;
            Intrinsics.checkExpressionValueIsNotNull(num, "it.position");
            searchMessageInfo.setPosition(num.intValue());
            searchMessageInfo.setFromId(messageMeta.from_id);
            searchMessageInfo.setChatId(messageMeta.chat_id);
            searchMessageInfo.setThreadId(messageMeta.thread_id);
            Integer num2 = messageMeta.thread_position;
            Intrinsics.checkExpressionValueIsNotNull(num2, "it.thread_position");
            searchMessageInfo.setMessageThreadPosition(num2.intValue());
            Integer num3 = messageMeta.thread_chat_position;
            Intrinsics.checkExpressionValueIsNotNull(num3, "it.thread_chat_position");
            searchMessageInfo.setThreadChatPosition(num3.intValue());
            List<MessageMeta.DocExtraInfo> list = messageMeta.doc_extra_infos;
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                for (MessageMeta.DocExtraInfo docExtraInfo : list) {
                    Doc doc = new Doc();
                    doc.setName(docExtraInfo.name);
                    doc.setUrl(docExtraInfo.url);
                    Doc.Type type2 = docExtraInfo.type;
                    Intrinsics.checkExpressionValueIsNotNull(type2, "pbSearchDoc.type");
                    doc.setDocType(DocType.forNumber(type2.getValue()));
                    arrayList.add(doc);
                }
                searchMessageInfo.setMessageDocInfoList(arrayList);
            }
            Boolean bool = messageMeta.is_p2p_chat;
            Intrinsics.checkExpressionValueIsNotNull(bool, "it.is_p2p_chat");
            searchMessageInfo.setP2pChat(bool.booleanValue());
            String str = messageMeta.p2p_chatter_id;
            Intrinsics.checkExpressionValueIsNotNull(str, "it.p2p_chatter_id");
            Long longOrNull = StringsKt.toLongOrNull(str);
            if (longOrNull != null) {
                j = longOrNull.longValue();
            } else {
                j = 0;
            }
            searchMessageInfo.setP2pChatterId(j);
            File file = messageMeta.file_meta;
            if (file != null) {
                if (searchMessageInfo.getMsgType() == Message.Type.FILE) {
                    searchMessageInfo.setFileContent(C53907b.m208922a(file));
                } else if (searchMessageInfo.getMsgType() == Message.Type.FOLDER) {
                    searchMessageInfo.setFolderContent(C53907b.m208930b(file));
                }
            }
        } else {
            searchMessageInfo = null;
        }
        return searchMessageInfo;
    }
}
