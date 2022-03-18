package com.ss.android.lark.chat.chatwindow.chat.v2.model.operation;

import com.ss.android.lark.chat.entity.chatter.ChatChatter;
import com.ss.android.lark.chat.entity.message.AbstractC34006a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0015\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/model/operation/AvatarUpdater;", "Lkotlin/Function1;", "Lcom/ss/android/lark/chat/entity/message/IChatMessage;", "avatarKey", "", "(Ljava/lang/String;)V", "getAvatarKey", "()Ljava/lang/String;", "invoke", "chatMessage", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.b.b.b */
public final class AvatarUpdater implements Function1<AbstractC34006a, AbstractC34006a> {

    /* renamed from: a */
    private final String f86177a;

    public AvatarUpdater(String str) {
        Intrinsics.checkParameterIsNotNull(str, "avatarKey");
        this.f86177a = str;
    }

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
            if (messageSender == null) {
                Intrinsics.throwNpe();
            }
            messageSender.setAvatarKey(this.f86177a);
        }
        return aVar;
    }
}
