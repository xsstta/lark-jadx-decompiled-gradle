package com.ss.android.vc.entity.follow;

import java.io.Serializable;

public class FollowAction implements Serializable {
    private static final long serialVersionUID = 1;
    private String actionJSON;
    private String shareId;
    private String url;

    public FollowAction() {
    }

    public String getActionJSON() {
        return this.actionJSON;
    }

    public String getShareId() {
        return this.shareId;
    }

    public String getUrl() {
        return this.url;
    }

    public String toString() {
        return "FollowAction{actionJSON='" + this.actionJSON + '\'' + ", url='" + this.url + '\'' + ", shareId='" + this.shareId + '\'' + '}';
    }

    public void setActionJSON(String str) {
        this.actionJSON = str;
    }

    public void setShareId(String str) {
        this.shareId = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public FollowAction(String str) {
        this.actionJSON = str;
    }
}
