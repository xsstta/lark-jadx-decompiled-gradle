package com.ss.android.lark.openapi.jsapi.entity;

public class ShareModel implements BaseJSModel {
    private String content;
    private String image;
    private String title;
    private String url;

    public String getContent() {
        return this.content;
    }

    public String getImage() {
        return this.image;
    }

    public String getTitle() {
        return this.title;
    }

    public String getUrl() {
        return this.url;
    }

    public String toString() {
        return "url:" + this.url + ", title:" + this.title + ", content:" + this.content + ", image:" + this.image;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setImage(String str) {
        this.image = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
