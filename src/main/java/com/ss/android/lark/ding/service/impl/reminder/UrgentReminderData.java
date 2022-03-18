package com.ss.android.lark.ding.service.impl.reminder;

import com.ss.android.lark.chat.entity.chat.Chat;
import com.ss.android.lark.chat.entity.chatter.Chatter;
import com.ss.android.lark.chat.entity.message.Message;
import java.io.Serializable;

public class UrgentReminderData implements Serializable {
    private static final long serialVersionUID = 1;
    private String ackId;
    private Chat chat;
    private Chatter fromChatter;
    private Message message;
    private long sendTime;
    private int urgentType;

    public String getAckId() {
        return this.ackId;
    }

    public Chat getChat() {
        return this.chat;
    }

    public Chatter getFromChatter() {
        return this.fromChatter;
    }

    public Message getMessage() {
        return this.message;
    }

    public long getSendTime() {
        return this.sendTime;
    }

    public int getUrgentType() {
        return this.urgentType;
    }

    public void setAckId(String str) {
        this.ackId = str;
    }

    public void setChat(Chat chat2) {
        this.chat = chat2;
    }

    public void setFromChatter(Chatter chatter) {
        this.fromChatter = chatter;
    }

    public void setMessage(Message message2) {
        this.message = message2;
    }

    public void setSendTime(long j) {
        this.sendTime = j;
    }

    public void setUrgentType(int i) {
        this.urgentType = i;
    }
}
