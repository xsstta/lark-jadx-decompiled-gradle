package com.ss.android.lark.share_group;

import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.Message;
import java.io.Serializable;

public class GroupProfileData implements Serializable {
    private Chat chat;
    private Chatter chatOwner;
    private Message message;

    public Chat getChat() {
        return this.chat;
    }

    public Chatter getChatOwner() {
        return this.chatOwner;
    }

    public Message getMessage() {
        return this.message;
    }

    public void setChat(Chat chat2) {
        this.chat = chat2;
    }

    public void setChatOwner(Chatter chatter) {
        this.chatOwner = chatter;
    }

    public void setMessage(Message message2) {
        this.message = message2;
    }

    public GroupProfileData(Message message2, Chat chat2, Chatter chatter) {
        this.message = message2;
        this.chat = chat2;
        this.chatOwner = chatter;
    }
}
