package com.ss.android.lark.chat.export.entity.message;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\u0002H\u0003\"\b\b\u0000\u0010\u0003*\u00020\u0004H&¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/chat/export/entity/message/OpenMessage;", "", "getContent", "T", "Lcom/ss/android/lark/chat/export/entity/message/Content;", "()Lcom/ss/android/lark/chat/export/entity/message/Content;", "getTranslateDisplayRule", "", "im_chat_chat-export-min_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.export.entity.message.b */
public interface OpenMessage {
    <T extends Content> T getContent();

    int getTranslateDisplayRule();
}
