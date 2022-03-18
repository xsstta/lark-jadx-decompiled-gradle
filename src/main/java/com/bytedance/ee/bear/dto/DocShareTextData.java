package com.bytedance.ee.bear.dto;

import android.text.TextUtils;
import java.io.Serializable;

public class DocShareTextData implements Serializable {
    private boolean canAddExtraInfo;
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

    public boolean isCanAddExtraInfo() {
        return this.canAddExtraInfo;
    }

    public boolean isLocalShare() {
        return this.localShare;
    }

    public boolean isEmpty() {
        return TextUtils.isEmpty(this.content);
    }

    public void setCanAddExtraInfo(boolean z) {
        this.canAddExtraInfo = z;
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

    public DocShareTextData(String str, String str2, String str3, boolean z) {
        this.title = str;
        this.content = str2;
        this.sourceName = str3;
        this.localShare = z;
    }
}
