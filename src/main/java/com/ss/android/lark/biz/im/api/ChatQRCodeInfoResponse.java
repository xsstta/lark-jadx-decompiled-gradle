package com.ss.android.lark.biz.im.api;

import com.ss.android.lark.chat.entity.chat.Chat;
import java.io.Serializable;

public class ChatQRCodeInfoResponse implements Serializable {
    private boolean alreadyInChat;
    private Chat chat;
    private String inviteUrl;
    private String inviterId;
    private boolean isInviteCanAddMember;
    private String showMsg;

    public Chat getChat() {
        return this.chat;
    }

    public String getInviteUrl() {
        return this.inviteUrl;
    }

    public String getInviterId() {
        return this.inviterId;
    }

    public String getShowMsg() {
        return this.showMsg;
    }

    public boolean isAlreadyInChat() {
        return this.alreadyInChat;
    }

    public boolean isInviteCanAddMember() {
        return this.isInviteCanAddMember;
    }

    public void setAlreadyInChat(boolean z) {
        this.alreadyInChat = z;
    }

    public void setChat(Chat chat2) {
        this.chat = chat2;
    }

    public void setInviteCanAddMember(boolean z) {
        this.isInviteCanAddMember = z;
    }

    public void setInviteUrl(String str) {
        this.inviteUrl = str;
    }

    public void setInviterId(String str) {
        this.inviterId = str;
    }

    public void setShowMsg(String str) {
        this.showMsg = str;
    }

    public ChatQRCodeInfoResponse(boolean z, Chat chat2, String str, boolean z2, String str2, String str3) {
        this.alreadyInChat = z;
        this.chat = chat2;
        this.inviterId = str;
        this.isInviteCanAddMember = z2;
        this.showMsg = str2;
        this.inviteUrl = str3;
    }
}
