package com.ss.android.lark.chat.chatwindow.chat.v2.model.filter;

import com.ss.android.lark.chat.entity.message.AbstractC34006a;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0002\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/model/filter/MessageTypeFilter;", "Lkotlin/Function1;", "Lcom/ss/android/lark/chat/entity/message/IChatMessage;", "", ShareHitPoint.f121869d, "Lcom/ss/android/lark/chat/entity/message/Message$Type;", "(Lcom/ss/android/lark/chat/entity/message/Message$Type;)V", "getType", "()Lcom/ss/android/lark/chat/entity/message/Message$Type;", "invoke", "chatMessage", "(Lcom/ss/android/lark/chat/entity/message/IChatMessage;)Ljava/lang/Boolean;", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.b.a.c */
public final class MessageTypeFilter implements Function1<AbstractC34006a, Boolean> {

    /* renamed from: a */
    private final Message.Type f86145a;

    public MessageTypeFilter(Message.Type type) {
        Intrinsics.checkParameterIsNotNull(type, ShareHitPoint.f121869d);
        this.f86145a = type;
    }

    /* renamed from: a */
    public Boolean invoke(AbstractC34006a aVar) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(aVar, "chatMessage");
        Message message = aVar.getMessage();
        Intrinsics.checkExpressionValueIsNotNull(message, "chatMessage.getMessage()");
        if (message.getType() == this.f86145a) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
