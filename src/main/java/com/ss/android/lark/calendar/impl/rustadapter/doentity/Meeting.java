package com.ss.android.lark.calendar.impl.rustadapter.doentity;

import java.io.Serializable;

public class Meeting implements Serializable, Cloneable {
    private String chatId;
    private String id;
    private boolean isFirstEntrance;
    private boolean shouldShowScroll;

    public String getChatId() {
        return this.chatId;
    }

    public String getId() {
        return this.id;
    }

    public boolean getShouldShowScroll() {
        return this.shouldShowScroll;
    }

    public boolean isFirstEntrance() {
        return this.isFirstEntrance;
    }

    public void setChatId(String str) {
        this.chatId = str;
    }

    public void setFirstEntrance(boolean z) {
        this.isFirstEntrance = z;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setShouldShowScroll(boolean z) {
        this.shouldShowScroll = z;
    }
}
