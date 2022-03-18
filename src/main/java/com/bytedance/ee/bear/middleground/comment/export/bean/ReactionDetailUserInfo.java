package com.bytedance.ee.bear.middleground.comment.export.bean;

import com.bytedance.ee.bear.jsbridge.jsapi.entity.BaseJSModel;
import com.ss.android.lark.reaction.widget.detailwindow.bean.DetailUserInfo;
import java.util.Objects;

public class ReactionDetailUserInfo implements BaseJSModel {
    private boolean anonymous;
    private String avatarKey = "";
    private String avatarUrl = "";
    private DetailUserInfo.DescriptionType descType = DetailUserInfo.DescriptionType.DEFAULT;
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

    public DetailUserInfo.DescriptionType getDescType() {
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

    public boolean isAnonymous() {
        return this.anonymous;
    }

    public boolean isRegistered() {
        return this.isRegistered;
    }

    public int hashCode() {
        return Objects.hash(this.userId);
    }

    public ReactionDetailUserInfo() {
    }

    public void setAnonymous(boolean z) {
        this.anonymous = z;
    }

    public void setAvatarKey(String str) {
        this.avatarKey = str;
    }

    public void setAvatarUrl(String str) {
        this.avatarUrl = str;
    }

    public void setDescType(DetailUserInfo.DescriptionType descriptionType) {
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
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.userId, ((ReactionDetailUserInfo) obj).userId);
    }

    public ReactionDetailUserInfo(String str, String str2, String str3, String str4, boolean z, String str5, DetailUserInfo.DescriptionType descriptionType, String str6) {
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
