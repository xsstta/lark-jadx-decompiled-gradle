package com.ss.android.lark.chatsetting.dto;

import com.ss.android.lark.chat.entity.chat.Chat;
import java.io.Serializable;

public class ChatLinkInfoResponse implements Serializable {
    private boolean canInvited;
    private Chat chat;
    private String chatId;
    private String inviterId;
    private boolean isInChat;
    private String token;

    public Chat getChat() {
        return this.chat;
    }

    public String getChatId() {
        return this.chatId;
    }

    public String getInviterId() {
        return this.inviterId;
    }

    public String getToken() {
        return this.token;
    }

    public boolean isCanInvited() {
        return this.canInvited;
    }

    public boolean isInChat() {
        return this.isInChat;
    }

    public void setCanInvited(boolean z) {
        this.canInvited = z;
    }

    public void setChat(Chat chat2) {
        this.chat = chat2;
    }

    public void setChatId(String str) {
        this.chatId = str;
    }

    public void setInChat(boolean z) {
        this.isInChat = z;
    }

    public void setInviterId(String str) {
        this.inviterId = str;
    }

    public void setToken(String str) {
        this.token = str;
    }

    public ChatLinkInfoResponse(boolean z, String str, String str2, Chat chat2, boolean z2, String str3) {
        this.isInChat = z;
        this.chatId = str;
        this.token = str2;
        this.chat = chat2;
        this.canInvited = z2;
        this.inviterId = str3;
    }
}
