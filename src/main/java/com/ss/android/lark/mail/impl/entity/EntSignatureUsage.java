package com.ss.android.lark.mail.impl.entity;

import java.io.Serializable;

public class EntSignatureUsage implements Serializable {
    private String address;
    private String newMailSignatureId = "";
    private String replyMailSignatureId = "";

    public String getAddress() {
        return this.address;
    }

    public String getNewMailSignatureId() {
        return this.newMailSignatureId;
    }

    public String getReplyMailSignatureId() {
        return this.replyMailSignatureId;
    }

    public void setAddress(String str) {
        this.address = str;
    }

    public void setNewMailSignatureId(String str) {
        this.newMailSignatureId = str;
    }

    public void setReplyMailSignatureId(String str) {
        this.replyMailSignatureId = str;
    }

    public EntSignatureUsage(String str, String str2, String str3) {
        this.address = str;
        this.newMailSignatureId = str2;
        this.replyMailSignatureId = str3;
    }
}
