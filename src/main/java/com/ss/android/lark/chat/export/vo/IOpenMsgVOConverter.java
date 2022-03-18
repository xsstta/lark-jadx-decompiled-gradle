package com.ss.android.lark.chat.export.vo;

import com.ss.android.lark.chat.export.entity.message.MessageType;
import com.ss.android.lark.chat.export.entity.message.OpenMessageInfo;
import com.ss.android.lark.chat.export.vo.ContentVO;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\u00020\u0003J\u0017\u0010\u0004\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0005\u001a\u00020\u0006H&¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/chat/export/vo/IOpenMsgVOConverter;", "T", "Lcom/ss/android/lark/chat/export/vo/ContentVO;", "", "convert", "messageInfo", "Lcom/ss/android/lark/chat/export/entity/message/OpenMessageInfo;", "(Lcom/ss/android/lark/chat/export/entity/message/OpenMessageInfo;)Lcom/ss/android/lark/chat/export/vo/ContentVO;", "getReplyDisplayText", "", "supportType", "Lcom/ss/android/lark/chat/export/entity/message/MessageType;", "im_chat_chat-export-min_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.export.vo.b */
public interface IOpenMsgVOConverter<T extends ContentVO<?>> {
    /* renamed from: a */
    MessageType mo120418a();

    /* renamed from: b */
    T mo120419b(OpenMessageInfo cVar);

    /* renamed from: c */
    CharSequence mo120420c(OpenMessageInfo cVar);
}
