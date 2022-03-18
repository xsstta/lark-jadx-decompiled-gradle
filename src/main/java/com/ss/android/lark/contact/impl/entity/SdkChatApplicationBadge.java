package com.ss.android.lark.contact.impl.entity;

import java.io.Serializable;

public class SdkChatApplicationBadge implements Serializable {
    private static final long serialVersionUID = -3328033174452481514L;
    private int chatBadge;
    private int friendBadge;

    public int getChatBadge() {
        return this.chatBadge;
    }

    public int getFriendBadge() {
        return this.friendBadge;
    }

    public void setChatBadge(int i) {
        this.chatBadge = i;
    }

    public void setFriendBadge(int i) {
        this.friendBadge = i;
    }
}
