package com.ss.android.lark.feed.app.conversationbox;

import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.feed.app.entity.ChatFeedPreview;
import com.ss.android.lark.feed.interfaces.AbstractC38094e;
import com.ss.android.lark.feed.statistics.chatbox.ChatBoxHitPoint;

/* renamed from: com.ss.android.lark.feed.app.conversationbox.c */
public class C37434c implements AbstractC38094e {
    /* renamed from: a */
    public String mo137350a(Chat chat) {
        if (chat.isMeeting()) {
            return "meeting";
        }
        if (chat.isP2PChat()) {
            return "bot";
        }
        return "group";
    }

    /* renamed from: a */
    public String mo137351a(ChatFeedPreview chatFeedPreview) {
        if (chatFeedPreview.isMeeting()) {
            return "meeting";
        }
        if (chatFeedPreview.isBotChat()) {
            return "bot";
        }
        if (chatFeedPreview.getChatType() == Chat.Type.GROUP) {
            return "group";
        }
        return "";
    }

    @Override // com.ss.android.lark.feed.interfaces.AbstractC38094e
    /* renamed from: a */
    public void mo137352a(Chat chat, String str) {
        if (chat.isInBox()) {
            ChatBoxHitPoint.f97733a.mo139411a(mo137350a(chat), str);
        }
    }
}
