package com.ss.android.lark.openapi.jsapi.entity;

public class LinkItem implements BaseJSModel {
    private Boolean newTab = true;
    private String title;
    private String url;

    public Boolean getNewTab() {
        return this.newTab;
    }

    public String getTitle() {
        return this.title;
    }

    public String getUrl() {
        return this.url;
    }

    public String toString() {
        return "url:" + this.url + "\n" + "title:" + this.title + "newTab:" + this.newTab;
    }

    public void setNewTab(Boolean bool) {
        this.newTab = bool;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
