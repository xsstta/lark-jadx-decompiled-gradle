package com.ss.android.lark.openapi.jsapi.entity;

public class UserModel implements BaseJSModel {
    private String avatarUrl;
    private String contactPoint;
    private String session;
    private String tenantId;
    private String tenantName;
    private String userId;
    private String userName;
    private String userNameEn;

    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public String getContactPoint() {
        return this.contactPoint;
    }

    public String getSession() {
        return this.session;
    }

    public String getTenantId() {
        return this.tenantId;
    }

    public String getTenantName() {
        return this.tenantName;
    }

    public String getUserId() {
        return this.userId;
    }

    public String getUserName() {
        return this.userName;
    }

    public String getUserNameEn() {
        return this.userNameEn;
    }

    public void setAvatarUrl(String str) {
        this.avatarUrl = str;
    }

    public void setContactPoint(String str) {
        this.contactPoint = str;
    }

    public void setSession(String str) {
        this.session = str;
    }

    public void setTenantId(String str) {
        this.tenantId = str;
    }

    public void setTenantName(String str) {
        this.tenantName = str;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public void setUserName(String str) {
        this.userName = str;
    }

    public void setUserNameEn(String str) {
        this.userNameEn = str;
    }
}
