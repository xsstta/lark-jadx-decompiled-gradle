package com.ss.android.lark.profile.dto;

import java.io.Serializable;

public class ProfileExternalContactSummary implements Serializable {
    private String avatarKey;
    private String departmentName;
    private String tenantName;
    private String useId;
    private String userEnName;
    private String userName;

    public ProfileExternalContactSummary() {
    }

    public String getAvatarKey() {
        return this.avatarKey;
    }

    public String getDepartmentName() {
        return this.departmentName;
    }

    public String getTenantName() {
        return this.tenantName;
    }

    public String getUseId() {
        return this.useId;
    }

    public String getUserEnName() {
        return this.userEnName;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setAvatarKey(String str) {
        this.avatarKey = str;
    }

    public void setDepartmentName(String str) {
        this.departmentName = str;
    }

    public void setTenantName(String str) {
        this.tenantName = str;
    }

    public void setUseId(String str) {
        this.useId = str;
    }

    public void setUserEnName(String str) {
        this.userEnName = str;
    }

    public void setUserName(String str) {
        this.userName = str;
    }

    public ProfileExternalContactSummary(String str, String str2, String str3, String str4, String str5, String str6) {
        this.useId = str;
        this.userName = str2;
        this.userEnName = str3;
        this.departmentName = str4;
        this.avatarKey = str5;
        this.tenantName = str6;
    }
}
