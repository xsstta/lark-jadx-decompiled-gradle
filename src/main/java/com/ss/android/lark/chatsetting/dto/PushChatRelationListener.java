package com.ss.android.lark.chatsetting.dto;

import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.MessageInfo;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J&\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\tH\u0016J&\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\tH\u0016J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0010"}, d2 = {"Lcom/ss/android/lark/chatsetting/dto/PushChatRelationListener;", "", "()V", "onPushChat", "", "chat", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "onPushChatAddUser", "chatterMap", "", "", "Lcom/ss/android/lark/chat/entity/chatter/Chatter;", "onPushChatRemoveUser", "onPushMessage", "messageInfo", "Lcom/ss/android/lark/chat/entity/message/MessageInfo;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.dto.i */
public class PushChatRelationListener {
    /* renamed from: a */
    public void mo127537a(Chat chat) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
    }

    /* renamed from: a */
    public void mo127538a(Chat chat, Map<String, ? extends Chatter> map) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        Intrinsics.checkParameterIsNotNull(map, "chatterMap");
    }

    /* renamed from: a */
    public void mo127539a(MessageInfo messageInfo, Chat chat) {
        Intrinsics.checkParameterIsNotNull(messageInfo, "messageInfo");
        Intrinsics.checkParameterIsNotNull(chat, "chat");
    }

    /* renamed from: b */
    public void mo127540b(Chat chat, Map<String, ? extends Chatter> map) {
        Intrinsics.checkParameterIsNotNull(chat, "chat");
        Intrinsics.checkParameterIsNotNull(map, "chatterMap");
    }
}
