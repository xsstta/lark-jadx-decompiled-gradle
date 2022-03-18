package com.ss.android.lark.chat.chatwindow.chat.data.reply;

import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH'¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/data/reply/IReplyMsgDigestCreator;", "", "buildDigest", "", "replyChatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "replyMsgInfo", "Lcom/ss/android/lark/chat/entity/message/MessageInfo;", "showPostReplyPrefix", "", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.data.b.c */
public interface IReplyMsgDigestCreator {
    /* renamed from: a */
    CharSequence mo122508a(Chatter chatter, MessageInfo messageInfo, boolean z);
}
