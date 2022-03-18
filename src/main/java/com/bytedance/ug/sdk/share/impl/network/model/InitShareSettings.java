package com.bytedance.ug.sdk.share.impl.network.model;

import com.google.gson.annotations.SerializedName;

public class InitShareSettings {
    @SerializedName("album_parse_switch")
    private int mAlbumParseSwitch = 1;
    @SerializedName("hidden_mark_parse_switch")
    private int mHiddenMarkParseSwitch = 1;
    @SerializedName("qrcode_parse_switch")
    private int mQrcodeParseSwitch = 1;
    @SerializedName("token_parse_switch")
    private int mTextTokenParseSwitch = 1;

    public int getAlbumParseSwitch() {
        return this.mAlbumParseSwitch;
    }

    public int getHiddenMarkParseSwitch() {
        return this.mHiddenMarkParseSwitch;
    }

    public int getQrcodeParseSwitch() {
        return this.mQrcodeParseSwitch;
    }

    public int getTextTokenParseSwitch() {
        return this.mTextTokenParseSwitch;
    }

    public void setAlbumParseSwitch(int i) {
        this.mAlbumParseSwitch = i;
    }

    public void setHiddenMarkParseSwitch(int i) {
        this.mHiddenMarkParseSwitch = i;
    }

    public void setQrcodeParseSwitch(int i) {
        this.mQrcodeParseSwitch = i;
    }

    public void setTextTokenParseSwitch(int i) {
        this.mTextTokenParseSwitch = i;
    }
}
