package com.ss.android.lark.biz.im.api;

import java.io.Serializable;

public class BotTipsContent implements Serializable {
    private String adminId;
    private String adminName;
    private String msg;

    public BotTipsContent() {
    }

    public String getAdminId() {
        return this.adminId;
    }

    public String getAdminName() {
        return this.adminName;
    }

    public String getMsg() {
        return this.msg;
    }

    public void setAdminId(String str) {
        this.adminId = str;
    }

    public void setAdminName(String str) {
        this.adminName = str;
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public BotTipsContent(String str, String str2, String str3) {
        this.msg = str;
        this.adminId = str2;
        this.adminName = str3;
    }
}
