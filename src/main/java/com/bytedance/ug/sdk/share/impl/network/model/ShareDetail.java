package com.bytedance.ug.sdk.share.impl.network.model;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class ShareDetail implements Serializable {
    @SerializedName("audio_url")
    private String mAudioUrl;
    @SerializedName("description")
    private String mDescription;
    @SerializedName("hidden_url")
    private String mHiddenImageUrl;
    @SerializedName("image_token_info")
    private TokenInfo mImageTokenInfo;
    @SerializedName("thumb_image_url")
    private String mImageUrl;
    @SerializedName("qrcode_url")
    private String mQrCodeImageUrl;
    @SerializedName("share_url")
    private String mShareUrl;
    @SerializedName("title")
    private String mTitle;
    @SerializedName("token_info")
    private TokenInfo mTokenInfo;
    @SerializedName("video_url")
    private String mVideoUrl;

    public String getAudioUrl() {
        return this.mAudioUrl;
    }

    public String getDescription() {
        return this.mDescription;
    }

    public String getHiddenImageUrl() {
        return this.mHiddenImageUrl;
    }

    public TokenInfo getImageTokenInfo() {
        return this.mImageTokenInfo;
    }

    public String getImageUrl() {
        return this.mImageUrl;
    }

    public String getQrCodeImageUrl() {
        return this.mQrCodeImageUrl;
    }

    public String getShareUrl() {
        return this.mShareUrl;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public TokenInfo getTokenInfo() {
        return this.mTokenInfo;
    }

    public String getVideoUrl() {
        return this.mVideoUrl;
    }

    public void setAudioUrl(String str) {
        this.mAudioUrl = str;
    }

    public void setDescription(String str) {
        this.mDescription = str;
    }

    public void setHiddenImageUrl(String str) {
        this.mHiddenImageUrl = str;
    }

    public void setImageTokenInfo(TokenInfo tokenInfo) {
        this.mImageTokenInfo = tokenInfo;
    }

    public void setImageUrl(String str) {
        this.mImageUrl = str;
    }

    public void setQrCodeImageUrl(String str) {
        this.mQrCodeImageUrl = str;
    }

    public void setShareUrl(String str) {
        this.mShareUrl = str;
    }

    public void setTitle(String str) {
        this.mTitle = str;
    }

    public void setTokenInfo(TokenInfo tokenInfo) {
        this.mTokenInfo = tokenInfo;
    }

    public void setVideoUrl(String str) {
        this.mVideoUrl = str;
    }
}
