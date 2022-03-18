package com.ss.android.lark.chatthread.view;

import androidx.fragment.app.FragmentActivity;
import com.ss.android.lark.chat.chatwindow.chat.C33234e;
import com.ss.android.lark.chat.entity.chat.Chat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0016¨\u0006\n"}, d2 = {"Lcom/ss/android/lark/chatthread/view/ChatThreadContext;", "Lcom/ss/android/lark/chat/chatwindow/chat/ChatWindowContext;", "mContext", "Landroidx/fragment/app/FragmentActivity;", "mChat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "(Landroidx/fragment/app/FragmentActivity;Lcom/ss/android/lark/chat/entity/chat/Chat;)V", "isChatThread", "", "isSelectable", "im_chat_chat_productionUsRelease"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatthread.view.c */
public final class ChatThreadContext extends C33234e {
    @Override // com.ss.android.lark.chat.chatwindow.chat.message.AbstractC33342d, com.ss.android.lark.chat.chatwindow.chat.C33234e
    /* renamed from: q */
    public boolean mo122553q() {
        return false;
    }

    @Override // com.ss.android.lark.chat.export.ui.message.IMessageContext, com.ss.android.lark.chat.chatwindow.chat.C33234e
    /* renamed from: w */
    public boolean mo122559w() {
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChatThreadContext(FragmentActivity fragmentActivity, Chat chat) {
        super(fragmentActivity, chat);
        Intrinsics.checkParameterIsNotNull(fragmentActivity, "mContext");
        Intrinsics.checkParameterIsNotNull(chat, "mChat");
    }
}
