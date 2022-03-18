package com.bytedance.ee.bear.bizwidget.shareview;

import com.bytedance.ee.util.io.NonProguard;

public class ShareItemModel implements NonProguard {
    private int darkModeResId;
    private String description;
    private int iconResId;
    private int shareItemBackground;
    private int srcTint;
    private ShareState state;
    private ShareType type;

    public String getDescription() {
        return this.description;
    }

    public int getIconResId() {
        return this.iconResId;
    }

    public int getShareItemBackground() {
        return this.shareItemBackground;
    }

    public int getSrcTint() {
        return this.srcTint;
    }

    public ShareState getState() {
        return this.state;
    }

    public ShareType getType() {
        return this.type;
    }

    public int getDarkModeResId() {
        int i = this.darkModeResId;
        if (i <= 0) {
            return this.iconResId;
        }
        return i;
    }

    public boolean isClickable() {
        if (this.state == ShareState.NOT_SHOW || this.state == ShareState.NOT_CLICK || this.state == ShareState.ADMIN_NOT_CLICK) {
            return false;
        }
        return true;
    }

    public void setDarkModeResId(int i) {
        this.darkModeResId = i;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setIconResId(int i) {
        this.iconResId = i;
    }

    public void setState(ShareState shareState) {
        this.state = shareState;
    }

    public void setType(ShareType shareType) {
        this.type = shareType;
    }

    public ShareItemModel(ShareType shareType, ShareState shareState) {
        this.type = shareType;
        this.state = shareState;
    }

    public ShareItemModel(ShareType shareType, int i, int i2, String str) {
        this.type = shareType;
        this.iconResId = i;
        this.darkModeResId = i2;
        this.description = str;
        this.state = ShareState.NOT_SHOW;
    }

    public ShareItemModel(ShareType shareType, int i, String str, ShareState shareState) {
        this.type = shareType;
        this.iconResId = i;
        this.description = str;
        this.state = shareState;
    }

    public ShareItemModel(ShareType shareType, int i, String str, int i2, int i3) {
        this.type = shareType;
        this.iconResId = i;
        this.srcTint = i2;
        this.description = str;
        this.shareItemBackground = i3;
        this.state = ShareState.NOT_SHOW;
    }
}
