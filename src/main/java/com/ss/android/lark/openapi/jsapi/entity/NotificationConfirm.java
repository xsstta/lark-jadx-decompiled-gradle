package com.ss.android.lark.openapi.jsapi.entity;

import java.util.List;

public class NotificationConfirm extends NotificationBase {
    private List<String> buttonLabels;

    public List<String> getButtonLabels() {
        return this.buttonLabels;
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
}
