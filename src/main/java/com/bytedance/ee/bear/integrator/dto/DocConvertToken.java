package com.bytedance.ee.bear.integrator.dto;

import java.io.Serializable;

public class DocConvertToken implements Serializable {
    private String chatToken;
    private String token;

    public String getChatToken() {
        return this.chatToken;
    }

    public String getToken() {
        return this.token;
    }

    public DocConvertToken(String str, String str2) {
        this.token = str;
        this.chatToken = str2;
    }
}
