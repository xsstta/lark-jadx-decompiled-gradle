package com.ss.android.lark.chatsetting.service;

import com.bytedance.lark.pb.basic.v1.C14928Entity;
import com.bytedance.lark.pb.im.v1.UpdateChatResponse;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chatsetting.ChatSettingModule;
import com.ss.android.lark.chatsetting.p1693a.AbstractC34461c;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ss/android/lark/chatsetting/service/ChatSettingModelParser;", "", "()V", "parseUpdateChatResponse", "Lcom/ss/android/lark/chat/entity/chat/Chat;", "pbResponse", "Lcom/bytedance/lark/pb/im/v1/UpdateChatResponse;", "im_chatsetting_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.b.a */
public final class ChatSettingModelParser {

    /* renamed from: a */
    public static final ChatSettingModelParser f88987a = new ChatSettingModelParser();

    private ChatSettingModelParser() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final Chat m133889a(UpdateChatResponse updateChatResponse) {
        Intrinsics.checkParameterIsNotNull(updateChatResponse, "pbResponse");
        C14928Entity entity = updateChatResponse.entity;
        Intrinsics.checkExpressionValueIsNotNull(entity, "pbResponse.entity");
        AbstractC34461c a = ChatSettingModule.m133639a();
        Intrinsics.checkExpressionValueIsNotNull(a, "ChatSettingModule.getDependency()");
        AbstractC34461c.AbstractC34466e d = a.mo127274d();
        Intrinsics.checkExpressionValueIsNotNull(d, "ChatSettingModule.getDependency().chatDependency");
        Chat chat = d.mo127348b().getChat(entity.chats.get(updateChatResponse.chat_id), entity.mail_setting);
        Intrinsics.checkExpressionValueIsNotNull(chat, "ChatSettingModule.getDep…hat, entity.mail_setting)");
        return chat;
    }
}
