package com.ss.android.lark.chat.chatwindow.chat.v2.model.operation;

import com.ss.android.lark.chat.entity.message.AbstractC34006a;
import com.ss.android.lark.chat.entity.message.Message;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0002¨\u0006\u0006"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/model/operation/SourceFileRecallUpdater;", "Lkotlin/Function1;", "Lcom/ss/android/lark/chat/entity/message/IChatMessage;", "()V", "invoke", "chatMessage", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.b.b.j */
public final class SourceFileRecallUpdater implements Function1<AbstractC34006a, AbstractC34006a> {
    /* renamed from: a */
    public AbstractC34006a invoke(AbstractC34006a aVar) {
        if (aVar != null) {
            Message message = aVar.getMessage();
            Intrinsics.checkExpressionValueIsNotNull(message, "chatMessage.getMessage()");
            message.setSourceFileDelete(true);
        }
        return aVar;
    }
}
