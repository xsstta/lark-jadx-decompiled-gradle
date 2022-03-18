package com.ss.android.lark.ding.service.impl.notification.entity;

import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.Message;
import com.ss.android.lark.notification.export.entity.Notice;

public class UrgentNotice extends Notice {
    private Chat chat;
    private Message message;
    private Chatter reCaller;

    public Chat getChat() {
        return this.chat;
    }

    public Message getMessage() {
        return this.message;
    }

    public Chatter getReCaller() {
        return this.reCaller;
    }

    public UrgentNotice(Notice notice, Chat chat2, Message message2) {
        super(notice);
        this.chat = chat2;
        this.message = message2;
    }

    public UrgentNotice(Chat chat2, Message message2, Notice notice, Chatter chatter) {
        super(notice);
        this.chat = chat2;
        this.message = message2;
        this.reCaller = chatter;
    }
}
