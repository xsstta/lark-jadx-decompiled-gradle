package com.bytedance.ug.sdk.share.api.entity;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.List;

public class TokenInfoBean implements Serializable {
    @SerializedName("author_info")
    private AuthorInfo mAuthorInfo;
    @SerializedName("button_text")
    private String mButtonText;
    @SerializedName("client_extra")
    private String mClientExtra;
    @SerializedName("desc")
    private String mDesc;
    @SerializedName("log_info")
    private TokenLogInfoBean mLogInfo;
    @SerializedName("media_type")
    private int mMediaType;
    @SerializedName("open_url")
    private String mOpenUrl;
    @SerializedName("pic_cnt")
    private int mPicCnt;
    @SerializedName("pics")
    private List<TokenImageInfoBean> mPics;
    @SerializedName("share_user_info")
    private TokenUserInfoBean mShareUserInfo;
    @SerializedName("title")
    private String mTitle;
    @SerializedName("token")
    private String mToken;
    private String mTokenType;
    @SerializedName("video_duration")
    private int mVideoDuration;

    public AuthorInfo getAuthorInfo() {
        return this.mAuthorInfo;
    }

    public String getButtonText() {
        return this.mButtonText;
    }

    public String getClientExtra() {
        return this.mClientExtra;
    }

    public String getDesc() {
        return this.mDesc;
    }

    public TokenLogInfoBean getLogInfo() {
        return this.mLogInfo;
    }

    public int getMediaType() {
        return this.mMediaType;
    }

    public String getOpenUrl() {
        return this.mOpenUrl;
    }

    public int getPicCnt() {
        return this.mPicCnt;
    }

    public List<TokenImageInfoBean> getPics() {
        return this.mPics;
    }

    public TokenUserInfoBean getShareUserInfo() {
        return this.mShareUserInfo;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public String getToken() {
        return this.mToken;
    }

    public String getTokenType() {
        return this.mTokenType;
    }

    public int getVideoDuration() {
        return this.mVideoDuration;
    }

    public void setAuthorInfo(AuthorInfo authorInfo) {
        this.mAuthorInfo = authorInfo;
    }

    public void setButtonText(String str) {
        this.mButtonText = str;
    }

    public void setClientExtra(String str) {
        this.mClientExtra = str;
    }

    public void setDesc(String str) {
        this.mDesc = str;
    }

    public void setLogInfo(TokenLogInfoBean tokenLogInfoBean) {
        this.mLogInfo = tokenLogInfoBean;
    }

    public void setMediaType(int i) {
        this.mMediaType = i;
    }

    public void setOpenUrl(String str) {
        this.mOpenUrl = str;
    }

    public void setPicCnt(int i) {
        this.mPicCnt = i;
    }

    public void setPics(List<TokenImageInfoBean> list) {
        this.mPics = list;
    }

    public void setShareUserInfo(TokenUserInfoBean tokenUserInfoBean) {
        this.mShareUserInfo = tokenUserInfoBean;
    }

    public void setTitle(String str) {
        this.mTitle = str;
    }

    public void setToken(String str) {
        this.mToken = str;
    }

    public void setTokenType(String str) {
        this.mTokenType = str;
    }

    public void setVideoDuration(int i) {
        this.mVideoDuration = i;
    }
}
