package com.ss.android.lark.mail.impl.mailtoolbar.bridgemodel;

import java.io.Serializable;

public class BridgeGetHtmlModel implements Serializable {
    private String html;

    public String getHtml() {
        return this.html;
    }

    public String toString() {
        return "BridgeGetHtmlModel{html='" + this.html + '\'' + '}';
    }

    public void setHtml(String str) {
        this.html = str;
    }
}
