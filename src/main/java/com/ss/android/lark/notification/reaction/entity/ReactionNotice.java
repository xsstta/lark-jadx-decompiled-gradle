package com.ss.android.lark.notification.reaction.entity;

import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.notification.export.entity.Notice;
import java.io.Serializable;

public class ReactionNotice extends Notice implements Serializable {
    private Chat chat;
    private Message message;

    public Chat getChat() {
        return this.chat;
    }

    public Message getMessage() {
        return this.message;
    }

    public ReactionNotice(Chat chat2, Message message2, Notice notice) {
        super(notice);
        this.chat = chat2;
        this.message = message2;
    }
}
