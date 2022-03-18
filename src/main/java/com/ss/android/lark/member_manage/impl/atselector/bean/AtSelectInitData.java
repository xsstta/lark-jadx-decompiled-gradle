package com.ss.android.lark.member_manage.impl.atselector.bean;

import java.io.Serializable;
import java.util.ArrayList;

public class AtSelectInitData implements Serializable {
    private String channelId;
    private ArrayList<String> chatIds;
    private ArrayList<String> chatterIds;
    private Boolean mIsInterruptAtAll = false;

    public String getChannelId() {
        return this.channelId;
    }

    public ArrayList<String> getChatIds() {
        return this.chatIds;
    }

    public ArrayList<String> getChatterIds() {
        return this.chatterIds;
    }

    public Boolean getIsInterruptAtAll() {
        return this.mIsInterruptAtAll;
    }

    public void setIsInterruptAtAll(Boolean bool) {
        this.mIsInterruptAtAll = bool;
    }

    public AtSelectInitData(String str) {
        this.channelId = str;
    }

    public AtSelectInitData(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        this.chatterIds = arrayList;
        this.chatIds = arrayList2;
    }
}
