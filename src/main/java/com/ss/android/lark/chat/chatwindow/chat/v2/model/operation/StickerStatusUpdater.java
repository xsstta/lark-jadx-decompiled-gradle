package com.ss.android.lark.chat.chatwindow.chat.v2.model.operation;

import com.ss.android.lark.chat.entity.message.AbstractC34006a;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.chat.entity.message.content.StickerContent;
import com.ss.android.lark.chat.export.entity.message.Content;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\u0015\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/v2/model/operation/StickerStatusUpdater;", "Lkotlin/Function1;", "Lcom/ss/android/lark/chat/entity/message/IChatMessage;", "stickerKeys", "", "", "(Ljava/util/List;)V", "getStickerKeys", "()Ljava/util/List;", "invoke", "chatMessage", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.v2.b.b.k */
public final class StickerStatusUpdater implements Function1<AbstractC34006a, AbstractC34006a> {

    /* renamed from: a */
    private final List<String> f86187a;

    public StickerStatusUpdater(List<String> list) {
        Intrinsics.checkParameterIsNotNull(list, "stickerKeys");
        this.f86187a = list;
    }

    /* renamed from: a */
    public AbstractC34006a invoke(AbstractC34006a aVar) {
        if (aVar != null) {
            Message message = aVar.getMessage();
            Intrinsics.checkExpressionValueIsNotNull(message, "chatMessage.getMessage()");
            if (message.getType() == Message.Type.STICKER) {
                Content content = aVar.getMessage().getContent();
                if (content != null) {
                    StickerContent stickerContent = (StickerContent) content;
                    stickerContent.setAdded(CollectionsKt.contains(this.f86187a, stickerContent.getKey()));
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.lark.chat.entity.message.content.StickerContent");
                }
            }
        }
        return aVar;
    }
}
