package com.ss.android.lark.team.api.entity;

import com.ss.android.lark.chat.entity.chat.Chat;
import java.io.Serializable;

public class CreateTeamChatResponse implements Serializable {
    private static final long serialVersionUID = -1892406037692571682L;
    private Chat chat;

    public Chat getChat() {
        return this.chat;
    }

    public void setChat(Chat chat2) {
        this.chat = chat2;
    }
}
