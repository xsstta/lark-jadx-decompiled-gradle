package com.ss.android.lark.share.dto;

import java.io.Serializable;

public class ShareChatDto implements Serializable {
    private String chatId;
    private String extraInfo = "";
    private int messagePosition;

    public String getChatId() {
        return this.chatId;
    }

    public String getExtraInfo() {
        return this.extraInfo;
    }

    public int getMessagePosition() {
        return this.messagePosition;
    }

    public void setChatId(String str) {
        this.chatId = str;
    }

    public void setExtraInfo(String str) {
        this.extraInfo = str;
    }

    public void setMessagePosition(int i) {
        this.messagePosition = i;
    }
}
