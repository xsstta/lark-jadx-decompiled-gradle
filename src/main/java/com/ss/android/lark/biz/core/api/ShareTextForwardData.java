package com.ss.android.lark.biz.core.api;

import android.text.TextUtils;
import java.io.Serializable;

public class ShareTextForwardData implements Serializable {
    private String content;
    private boolean forceStandAlone;
    private boolean localShare;
    private String sourceName;
    private boolean supportAdditionNote;
    private String title;
    private String titleBarText;

    public String getContent() {
        return this.content;
    }

    public String getSourceName() {
        return this.sourceName;
    }

    public String getTitle() {
        return this.title;
    }

    public String getTitleBarText() {
        return this.titleBarText;
    }

    public boolean isForceStandAlone() {
        return this.forceStandAlone;
    }

    public boolean isLocalShare() {
        return this.localShare;
    }

    public boolean isSupportAdditionNote() {
        return this.supportAdditionNote;
    }

    public boolean isEmpty() {
        return TextUtils.isEmpty(this.content);
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setForceStandAlone(boolean z) {
        this.forceStandAlone = z;
    }

    public void setLocalShare(boolean z) {
        this.localShare = z;
    }

    public void setSourceName(String str) {
        this.sourceName = str;
    }

    public void setSupportAdditionNote(boolean z) {
        this.supportAdditionNote = z;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTitleBarText(String str) {
        this.titleBarText = str;
    }

    public ShareTextForwardData(String str, String str2, String str3, boolean z) {
        this(str, str2, str3, z, false);
    }

    public ShareTextForwardData(String str, String str2, String str3, boolean z, boolean z2) {
        this(str, str2, str3, z, z2, false);
    }

    public ShareTextForwardData(String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        this.title = str;
        this.content = str2;
        this.sourceName = str3;
        this.localShare = z;
        this.forceStandAlone = z2;
        this.supportAdditionNote = z3;
    }
}
