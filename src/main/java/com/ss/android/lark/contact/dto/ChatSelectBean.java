package com.ss.android.lark.contact.dto;

import com.ss.android.lark.chat.entity.chat.Chat;

public class ChatSelectBean extends BaseSelectBean {
    private static final long serialVersionUID = -559082424577654718L;
    private Chat.Type chatType;
    private boolean isMeeting;
    private boolean isOffical;

    @Override // com.ss.android.lark.contact.dto.BaseSelectBean
    public int getType() {
        return 1;
    }

    public Chat.Type getChatType() {
        return this.chatType;
    }

    public boolean isMeeting() {
        return this.isMeeting;
    }

    public boolean isOffical() {
        return this.isOffical;
    }

    public void setChatType(Chat.Type type) {
        this.chatType = type;
    }

    public void setIsMeeting(boolean z) {
        this.isMeeting = z;
    }

    public void setOffical(boolean z) {
        this.isOffical = z;
    }
}
