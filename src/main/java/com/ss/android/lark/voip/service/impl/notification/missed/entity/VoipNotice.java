package com.ss.android.lark.voip.service.impl.notification.missed.entity;

import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.notification.export.entity.Notice;

public class VoipNotice extends Notice {
    private Chatter caller;
    private Chat chat;

    public Chatter getCaller() {
        return this.caller;
    }

    public Chat getChat() {
        return this.chat;
    }

    public VoipNotice(Chat chat2, Chatter chatter, Notice notice) {
        super(notice);
        this.chat = chat2;
        this.caller = chatter;
    }
}
