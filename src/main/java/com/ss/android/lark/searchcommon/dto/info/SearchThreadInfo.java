package com.ss.android.lark.searchcommon.dto.info;

import com.ss.android.lark.chat.entity.Channel;

public class SearchThreadInfo extends SearchBaseInfo {
    private static final long serialVersionUID = -3607544729328532561L;
    private Channel channel;
    private String chatId;
    private long updateTime;

    public Channel getChannel() {
        return this.channel;
    }

    public String getChatId() {
        return this.chatId;
    }

    public long getUpdateTime() {
        return this.updateTime;
    }

    public SearchThreadInfo() {
        this.type = 8;
    }

    public void setChannel(Channel channel2) {
        this.channel = channel2;
    }

    public void setChatId(String str) {
        this.chatId = str;
    }

    public void setUpdateTime(long j) {
        this.updateTime = j;
    }
}
