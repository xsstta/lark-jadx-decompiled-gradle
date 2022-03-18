package com.ss.android.lark.chat.chatwindow.chat.v2.model.operation;

import com.ss.android.lark.chat.entity.message.AbstractC34006a;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.ImageContent;
import com.ss.android.lark.chat.export.entity.message.Content;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0015\u0010\b\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/model/operation/ImageUploadProgressUpdate;", "Lkotlin/Function1;", "Lcom/ss/android/lark/chat/entity/message/IChatMessage;", "progress", "", "(I)V", "getProgress", "()I", "invoke", "chatMessage", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.b.b.e */
public final class ImageUploadProgressUpdate implements Function1<AbstractC34006a, AbstractC34006a> {

    /* renamed from: a */
    private final int f86179a;

    public ImageUploadProgressUpdate(int i) {
        this.f86179a = i;
    }

    /* renamed from: a */
    public AbstractC34006a invoke(AbstractC34006a aVar) {
        if (aVar != null) {
            Message message = aVar.getMessage();
            Intrinsics.checkExpressionValueIsNotNull(message, "chatMessage.getMessage()");
            if (message.getType() == Message.Type.IMAGE) {
                Content content = message.getContent();
                Intrinsics.checkExpressionValueIsNotNull(content, "message.getContent<ImageContent>()");
                ((ImageContent) content).setProgress(this.f86179a);
            }
        }
        return aVar;
    }
}
