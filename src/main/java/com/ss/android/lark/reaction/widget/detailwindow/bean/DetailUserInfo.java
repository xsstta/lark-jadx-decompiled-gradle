package com.ss.android.lark.reaction.widget.detailwindow.bean;

import java.io.Serializable;
import java.util.Objects;

public class DetailUserInfo implements Serializable {
    private String avatarKey = "";
    private String avatarUrl = "";
    private DescriptionType descType = DescriptionType.DEFAULT;
    private String description = "";
    private boolean isRegistered;
    private String userId = "";
    private String userName = "";
    private String workStatusDesc = "";

    public enum DescriptionType {
        DEFAULT,
        BUSINESS,
        LEAVE,
        MEETING
    }

    public String getAvatarKey() {
        return this.avatarKey;
    }

    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public DescriptionType getDescType() {
        return this.descType;
    }

    public String getDescription() {
        return this.description;
    }

    public String getUserId() {
        return this.userId;
    }

    public String getUserName() {
        return this.userName;
    }

    public String getWorkStatusDesc() {
        return this.workStatusDesc;
    }

    public boolean isRegistered() {
        return this.isRegistered;
    }

    public DetailUserInfo() {
    }

    public int hashCode() {
        return Objects.hash(this.avatarKey, this.avatarUrl, this.userName, this.userId, Boolean.valueOf(this.isRegistered), this.description, this.descType, this.workStatusDesc);
    }

    public void setAvatarKey(String str) {
        this.avatarKey = str;
    }

    public void setAvatarUrl(String str) {
        this.avatarUrl = str;
    }

    public void setDescType(DescriptionType descriptionType) {
        this.descType = descriptionType;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setRegistered(boolean z) {
        this.isRegistered = z;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public void setUserName(String str) {
        this.userName = str;
    }

    public void setWorkStatusDesc(String str) {
        this.workStatusDesc = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DetailUserInfo)) {
            return false;
        }
        DetailUserInfo detailUserInfo = (DetailUserInfo) obj;
        if (this.isRegistered != detailUserInfo.isRegistered || !Objects.equals(this.avatarKey, detailUserInfo.avatarKey) || !Objects.equals(this.avatarUrl, detailUserInfo.avatarUrl) || !Objects.equals(this.userName, detailUserInfo.userName) || !Objects.equals(this.userId, detailUserInfo.userId) || !Objects.equals(this.description, detailUserInfo.description) || this.descType != detailUserInfo.descType || !Objects.equals(this.workStatusDesc, detailUserInfo.workStatusDesc)) {
            return false;
        }
        return true;
    }

    public DetailUserInfo(String str, String str2, String str3) {
        this.avatarKey = str;
        this.userName = str2;
        this.userId = str3;
    }

    public DetailUserInfo(String str, String str2, String str3, String str4, boolean z, String str5, DescriptionType descriptionType, String str6) {
        this.avatarKey = str;
        this.avatarUrl = str2;
        this.userName = str3;
        this.userId = str4;
        this.isRegistered = z;
        this.description = str5;
        this.descType = descriptionType;
        this.workStatusDesc = str6;
    }
}
