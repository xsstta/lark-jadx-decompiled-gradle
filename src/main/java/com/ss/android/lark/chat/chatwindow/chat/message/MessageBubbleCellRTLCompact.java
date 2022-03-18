package com.ss.android.lark.chat.chatwindow.chat.message;

import com.larksuite.suite.R;
import com.ss.android.lark.chat.chatwindow.chat.message.MessageBubbleCell;
import com.ss.android.lark.chat.open.message.AbstractC34072a;
import com.ss.android.lark.chat.open.message.AbstractC34073b;
import com.ss.android.lark.chat.open.message.IStatusLayoutPlaceProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001BQ\u0012\u000e\u0010\u0002\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\t\u0012\f\u0010\n\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u000b\u0012\f\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0014J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016¨\u0006\u0015"}, d2 = {"Lcom/ss/android/lark/chat/chatwindow/chat/message/MessageBubbleCellRTLCompact;", "Lcom/ss/android/lark/chat/chatwindow/chat/message/MessageBubbleCell;", "mainChildCell", "Lcom/ss/android/lark/chat/chatwindow/chat/message/BaseMessageCell;", "chatContext", "Lcom/ss/android/lark/chat/chatwindow/chat/message/IChatContext;", "callbacks", "Lcom/ss/android/lark/chat/chatwindow/chat/message/MessageBubbleCell$MessageGeneralCallbacks;", "bubbleStyleProvider", "Lcom/ss/android/lark/chat/open/message/IBubbleStyleProvider;", "statusLayoutPlaceProvider", "Lcom/ss/android/lark/chat/open/message/IStatusLayoutPlaceProvider;", "topRegionViewProvider", "Lcom/ss/android/lark/chat/open/message/ITopRegionViewProvider;", "(Lcom/ss/android/lark/chat/chatwindow/chat/message/BaseMessageCell;Lcom/ss/android/lark/chat/chatwindow/chat/message/IChatContext;Lcom/ss/android/lark/chat/chatwindow/chat/message/MessageBubbleCell$MessageGeneralCallbacks;Lcom/ss/android/lark/chat/open/message/IBubbleStyleProvider;Lcom/ss/android/lark/chat/open/message/IStatusLayoutPlaceProvider;Lcom/ss/android/lark/chat/open/message/ITopRegionViewProvider;)V", "getHolderClassImpl", "Ljava/lang/Class;", "Lcom/ss/android/lark/chat/chatwindow/chat/message/MessageBubbleCell$MessageBubbleViewHolder;", "layoutId", "", "viewType", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.chat.message.f */
public final class MessageBubbleCellRTLCompact extends MessageBubbleCell {
    @Override // com.ss.android.lark.chat.chatwindow.chat.message.MessageBubbleCell, com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: c */
    public int mo122651c() {
        return R.layout.chat_window_message_common_item_new_rtl;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b
    /* renamed from: b */
    public Class<MessageBubbleCell.MessageBubbleViewHolder> mo122650b() {
        return MessageBubbleCell.MessageBubbleViewHolder.class;
    }

    @Override // com.ss.android.lark.widget.recyclerview.hive.AbstractC59004b, com.ss.android.lark.widget.recyclerview.hive.AbstractView$OnClickListenerC59005c
    public int ao_() {
        return ~super.ao_();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MessageBubbleCellRTLCompact(AbstractC33290a<?, ?> aVar, AbstractC33342d dVar, MessageBubbleCell.AbstractC33274b bVar, AbstractC34072a<?> aVar2, IStatusLayoutPlaceProvider<?> iStatusLayoutPlaceProvider, AbstractC34073b<?> bVar2) {
        super(aVar, dVar, bVar, aVar2, iStatusLayoutPlaceProvider, bVar2);
        Intrinsics.checkParameterIsNotNull(aVar, "mainChildCell");
        Intrinsics.checkParameterIsNotNull(dVar, "chatContext");
    }
}
