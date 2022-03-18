package com.ss.android.lark.calendar.wrapper.dependency.entity;

import com.ss.android.lark.calendar.p1430a.p1431a.p1432a.AbstractC30025c;
import com.ss.android.lark.chat.export.entity.chat.OpenChat;
import java.io.Serializable;

public class CalChat implements AbstractC30025c, Serializable {
    private final OpenChat mChat;

    @Override // com.ss.android.lark.calendar.p1430a.p1431a.p1432a.AbstractC30025c
    public boolean isInGroupChat() {
        return this.mChat.isMember();
    }

    public boolean isMeeting() {
        return this.mChat.isMeeting();
    }

    public boolean isP2PChat() {
        return this.mChat.isP2PChat();
    }

    public CalChat(OpenChat openChat) {
        this.mChat = openChat;
    }
}
