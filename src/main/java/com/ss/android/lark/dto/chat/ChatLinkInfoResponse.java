package com.ss.android.lark.dto.chat;

import com.bytedance.lark.pb.im.v1.GetChatLinkInfoResponse;
import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.p2851u.p2852a.C57310e;
import java.io.Serializable;

public class ChatLinkInfoResponse implements Serializable {
    private boolean canInvited;
    private Chat chat;
    private String chatId;
    private String inviterId;
    private boolean isInChat;

    public Chat getChat() {
        return this.chat;
    }

    public String getChatId() {
        return this.chatId;
    }

    public String getInviterId() {
        return this.inviterId;
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

    public ChatLinkInfoResponse(GetChatLinkInfoResponse getChatLinkInfoResponse) {
        this.isInChat = getChatLinkInfoResponse.already_in_chat.booleanValue();
        this.chatId = getChatLinkInfoResponse.chat_id;
        this.chat = C57310e.m222078a(getChatLinkInfoResponse.entity.chats.get(this.chatId));
        this.canInvited = getChatLinkInfoResponse.is_inviter_can_invite_member.booleanValue();
        this.inviterId = getChatLinkInfoResponse.inviter_chatter_id;
    }
}
