package com.ss.android.lark.chat.entity.sticker;

import java.io.Serializable;

public class StickerInfo implements Serializable {
    private String mDescription = "";
    private boolean mHasPaid = true;
    private String mTitle = "";

    public String getDescription() {
        return this.mDescription;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public boolean isHasPaid() {
        return this.mHasPaid;
    }

    public void setDescription(String str) {
        this.mDescription = str;
    }

    public void setHasPaid(boolean z) {
        this.mHasPaid = z;
    }

    public void setTitle(String str) {
        this.mTitle = str;
    }
}
