package com.ss.android.lark.chat.chatwindow.chat.v2.model.operation;

import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.AbstractC34006a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0015\u0010\f\u001a\u0004\u0018\u00010\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0002H\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/model/operation/MessageSenderUpdater;", "Lkotlin/Function1;", "Lcom/ss/android/lark/chat/entity/message/IChatMessage;", "chatter", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "currentChatId", "", "(Lcom/ss/android/lark/chat/entity/chatter/Chatter;Ljava/lang/String;)V", "getChatter", "()Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "getCurrentChatId", "()Ljava/lang/String;", "invoke", "chatMessage", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.b.b.f */
public final class MessageSenderUpdater implements Function1<AbstractC34006a, AbstractC34006a> {

    /* renamed from: a */
    private final Chatter f86180a;

    /* renamed from: b */
    private final String f86181b;

    /* renamed from: a */
    public AbstractC34006a invoke(AbstractC34006a aVar) {
        ChatChatter chatChatter;
        if (aVar != null) {
            chatChatter = aVar.getMessageSender();
        } else {
            chatChatter = null;
        }
        if (chatChatter != null) {
            ChatChatter messageSender = aVar.getMessageSender();
            Chatter chatter = this.f86180a;
            if (!(chatter instanceof ChatChatter) || !Intrinsics.areEqual(((ChatChatter) chatter).getChatId(), this.f86181b)) {
                if (messageSender == null) {
                    Intrinsics.throwNpe();
                }
                messageSender.setChatter(this.f86180a);
            } else {
                aVar.setMessageSender((ChatChatter) this.f86180a);
            }
        }
        return aVar;
    }

    public MessageSenderUpdater(Chatter chatter, String str) {
        Intrinsics.checkParameterIsNotNull(chatter, "chatter");
        Intrinsics.checkParameterIsNotNull(str, "currentChatId");
        this.f86180a = chatter;
        this.f86181b = str;
    }
}
