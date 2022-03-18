package com.ss.android.lark.share.impl.entity;

import android.text.TextUtils;
import java.io.Serializable;

public class ShareTextInfo implements Serializable {
    private String content;
    private boolean localShare;
    private String sourceName;
    private String title;

    public String getContent() {
        return this.content;
    }

    public String getSourceName() {
        return this.sourceName;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isLocalShare() {
        return this.localShare;
    }

    public boolean isEmpty() {
        return TextUtils.isEmpty(this.content);
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setLocalShare(boolean z) {
        this.localShare = z;
    }

    public void setSourceName(String str) {
        this.sourceName = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public ShareTextInfo(String str, String str2, String str3, boolean z) {
        this.title = str;
        this.content = str2;
        this.sourceName = str3;
        this.localShare = z;
    }
}
