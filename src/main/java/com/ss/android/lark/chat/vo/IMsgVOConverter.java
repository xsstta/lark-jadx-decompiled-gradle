package com.ss.android.lark.chat.vo;

import com.ss.android.lark.chat.entity.message.AbstractC34006a;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.export.vo.ContentVO;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u000e\b\u0000\u0010\u0001 \u0001*\u0006\u0012\u0002\b\u00030\u00022\u00020\u0003J\u0017\u0010\u0004\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0005\u001a\u00020\u0006H&¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/chat/vo/IMsgVOConverter;", "T", "Lcom/ss/android/lark/chat/export/vo/ContentVO;", "", "convert", "messageInfo", "Lcom/ss/android/lark/chat/entity/message/IChatMessage;", "(Lcom/ss/android/lark/chat/entity/message/IChatMessage;)Lcom/ss/android/lark/chat/export/vo/ContentVO;", "getReplyDisplayText", "", "supportType", "Lcom/ss/android/lark/chat/entity/message/Message$Type;", "im_chat_chat-export_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.e.d */
public interface IMsgVOConverter<T extends ContentVO<?>> {
    /* renamed from: a */
    Message.Type mo122452a();

    /* renamed from: b */
    T mo122453b(AbstractC34006a aVar);

    /* renamed from: c */
    CharSequence mo122454c(AbstractC34006a aVar);
}
