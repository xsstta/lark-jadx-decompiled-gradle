package com.ss.android.lark.openapi.jsapi.entity;

import java.util.List;

public class NotificationPrompt extends NotificationBase {
    private List<String> buttonLabels;
    private String defaultText;

    public List<String> getButtonLabels() {
        return this.buttonLabels;
    }

    public String getDefaultText() {
        return this.defaultText;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("title:");
        sb.append(getTitle());
        sb.append(",");
        sb.append("message:");
        sb.append(getMessage());
        sb.append(",");
        sb.append("labels:");
        List<String> list = this.buttonLabels;
        if (list != null) {
            for (String str : list) {
                sb.append(str);
                sb.append(",");
            }
        }
        return sb.toString();
    }

    public void setButtonLabels(List<String> list) {
        this.buttonLabels = list;
    }

    public void setDefaultText(String str) {
        this.defaultText = str;
    }
}
