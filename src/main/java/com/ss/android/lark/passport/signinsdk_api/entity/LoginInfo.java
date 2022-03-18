package com.ss.android.lark.passport.signinsdk_api.entity;

import com.ss.android.lark.log.Log;
import com.ss.android.lark.passport.signinsdk_api.account.SessionInfo;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class LoginInfo implements Serializable {
    private String avatarKey;
    private String avatarUrl;
    private String idpType;
    private String session;
    private Map<String, SessionInfo> sessionInfoMap = new HashMap();
    private String tenantCode;
    private String tenantIconUrl;
    private String tenantId;
    private String tenantName;
    private String userId;
    private String userName;
    private String userNameEn;

    public String getAvatarKey() {
        return this.avatarKey;
    }

    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public String getIdpType() {
        return this.idpType;
    }

    public String getSession() {
        return this.session;
    }

    public Map<String, SessionInfo> getSessionInfoMap() {
        return this.sessionInfoMap;
    }

    public String getTenantCode() {
        return this.tenantCode;
    }

    public String getTenantIconUrl() {
        return this.tenantIconUrl;
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

    public String toString() {
        return "userId:" + this.userId + ", " + "userName:" + this.userName + ", " + "userNameEn:" + this.userNameEn + ", " + "avatarUrl:" + this.avatarUrl + ", " + "tenantId:" + this.tenantId + ", " + "tenantName:" + this.tenantName + ", " + "idpType:" + this.idpType;
    }

    public void setAvatarKey(String str) {
        this.avatarKey = str;
    }

    public void setAvatarUrl(String str) {
        this.avatarUrl = str;
    }

    public void setIdpType(String str) {
        this.idpType = str;
    }

    public void setSession(String str) {
        this.session = str;
    }

    public void setSessionInfoMap(Map<String, SessionInfo> map) {
        this.sessionInfoMap = map;
    }

    public void setTenantIconUrl(String str) {
        this.tenantIconUrl = str;
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

    public void setTenantCode(String str) {
        Log.m165389i("LoginInfo", "tenantCode=" + str);
        this.tenantCode = str;
    }

    public void setTenantId(String str) {
        Log.m165389i("LoginInfo", "tenantId=" + str);
        this.tenantId = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LoginInfo loginInfo = (LoginInfo) obj;
        if (!Objects.equals(this.userId, loginInfo.userId) || !Objects.equals(this.tenantId, loginInfo.tenantId) || !Objects.equals(this.session, loginInfo.session)) {
            return false;
        }
        return true;
    }
}
