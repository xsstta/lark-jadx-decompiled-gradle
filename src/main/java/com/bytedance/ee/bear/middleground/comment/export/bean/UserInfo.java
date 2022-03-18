package com.bytedance.ee.bear.middleground.comment.export.bean;

import com.bytedance.ee.bear.jsbridge.jsapi.entity.BaseJSModel;
import com.ss.android.lark.reaction.widget.detailwindow.bean.DetailUserInfo;

public class UserInfo implements BaseJSModel {
    private String avatarKey;
    private String avatarUrl;
    private DetailUserInfo.DescriptionType descType;
    private String description;
    private boolean isRegistered;
    private String userId;
    private String userName;
    private String workStatusDesc;

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

    public boolean isRegistered() {
        return this.isRegistered;
    }

    public String toString() {
        return "UserInfo{avatarUrl='" + this.avatarUrl + '\'' + ", avatarKey='" + this.avatarKey + '\'' + ", userName='" + this.userName + '\'' + ", userId='" + this.userId + '\'' + ", isRegistered=" + this.isRegistered + ", description='" + this.description + '\'' + ", descType=" + this.descType + ", workStatusDesc='" + this.workStatusDesc + '\'' + '}';
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
}
