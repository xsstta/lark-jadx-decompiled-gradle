package com.ss.android.vc.entity.tab;

import java.io.Serializable;

public class VCParamFromGroup implements Serializable {
    private String chat_id;

    public String getChat_id() {
        return this.chat_id;
    }

    public String toString() {
        return "groupName=" + " chatId=" + this.chat_id;
    }

    public void setChat_id(String str) {
        this.chat_id = str;
    }
}
