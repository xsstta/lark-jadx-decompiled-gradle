package com.ss.android.lark.chat.entity.chat;

import java.io.Serializable;

public class ChatOptionInfo implements Serializable {
    private static final long serialVersionUID = -4912521595824753252L;
    private boolean announceIsUnread;
    private String id;

    public String getId() {
        return this.id;
    }

    public boolean isAnnounceIsUnread() {
        return this.announceIsUnread;
    }

    public void setAnnounceIsUnread(boolean z) {
        this.announceIsUnread = z;
    }

    public void setId(String str) {
        this.id = str;
    }
}
