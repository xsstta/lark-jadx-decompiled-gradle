package com.ss.android.lark.chat.export.entity.message;

import com.ss.android.lark.chat.export.entity.chatter.OpenChatter;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/chat/export/entity/message/OpenMessageInfo;", "", "getMessage", "Lcom/ss/android/lark/chat/export/entity/message/OpenMessage;", "getMessageSender", "Lcom/ss/android/lark/chat/export/entity/chatter/OpenChatter;", "getOriginalSender", "im_chat_chat-export-min_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.export.entity.message.c */
public interface OpenMessageInfo {
    OpenMessage getMessage();

    OpenChatter getMessageSender();

    OpenChatter getOriginalSender();
}
