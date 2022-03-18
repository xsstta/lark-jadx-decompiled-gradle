package com.ss.android.lark.openapi.jsapi.entity;

import java.util.List;

public class PreviewImages implements BaseJSModel {
    private String current;
    private List<String> urls;

    public String getCurrent() {
        return this.current;
    }

    public List<String> getUrls() {
        return this.urls;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("current:");
        sb.append(this.current);
        sb.append(",");
        sb.append("urls:\n");
        List<String> list = this.urls;
        if (list != null) {
            for (String str : list) {
                sb.append(str);
                sb.append(",");
            }
        }
        return sb.toString();
    }

    public void setCurrent(String str) {
        this.current = str;
    }

    public void setUrls(List<String> list) {
        this.urls = list;
    }
}
