package com.ss.android.lark.passport.signinsdk_api.account;

import com.alibaba.fastjson.annotation.JSONField;
import com.ss.android.lark.passport.signinsdk_api.account.config.AccountSecurityConfig;
import java.io.Serializable;
import java.util.Objects;

public class TenantInfo implements Serializable {
    private AccountSecurityConfig accountSecurityConfig;
    private String authNMode;
    private String avatarUrl;
    private int badgeCount;
    private String chatterAvatarKey;
    private String configEnv;
    private boolean isCurrentUser;
    private boolean isIdp;
    private boolean isSessionValid;
    private final boolean isToCUnRegistered;
    private long lastUseTimestamp;
    private int status;
    private String suitFullDomain;
    private String tenantCode;
    private String tenantId;
    private String tenantName;
    private int tenantTag;
    private String unitLeague;
    private boolean upgradeEnabled;
    private String userAvatarUrl;
    private String userId;
    private String userName;
    private String userNameEn;
    private String userUnit;

    public static class PendingUser implements Serializable {
        @JSONField(name = "user_env")
        public String configEnv;
        public String tenantIconUrl;
        public String tenantId;
        public String tenantName;
        public String userName;
        public String userUnit;
    }

    public boolean isToCUnRegistered() {
        return false;
    }

    public void setActive(boolean z) {
    }

    public TenantInfo() {
    }

    public AccountSecurityConfig getAccountSecurityConfig() {
        return this.accountSecurityConfig;
    }

    public String getAuthNMode() {
        return this.authNMode;
    }

    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public int getBadgeCount() {
        return this.badgeCount;
    }

    public String getChatterAvatarKey() {
        return this.chatterAvatarKey;
    }

    public String getConfigEnv() {
        return this.configEnv;
    }

    public long getLastUseTimestamp() {
        return this.lastUseTimestamp;
    }

    public int getStatus() {
        return this.status;
    }

    public String getSuitFullDomain() {
        return this.suitFullDomain;
    }

    public String getTenantCode() {
        return this.tenantCode;
    }

    public String getTenantId() {
        return this.tenantId;
    }

    public String getTenantName() {
        return this.tenantName;
    }

    public int getTenantTag() {
        return this.tenantTag;
    }

    public String getUnitLeague() {
        return this.unitLeague;
    }

    public String getUserAvatarUrl() {
        return this.userAvatarUrl;
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

    public String getUserUnit() {
        return this.userUnit;
    }

    public boolean isCurrentUser() {
        return this.isCurrentUser;
    }

    public boolean isIdp() {
        return this.isIdp;
    }

    public boolean isSessionValid() {
        return this.isSessionValid;
    }

    public boolean isUpgradeEnabled() {
        return this.upgradeEnabled;
    }

    public void setUpgradeEnabled() {
        this.upgradeEnabled = this.upgradeEnabled;
    }

    public boolean canSwitchTo() {
        int i = this.status;
        if (i == 0 || i == 3) {
            return true;
        }
        return false;
    }

    public boolean isFrozen() {
        if (this.status == 2) {
            return true;
        }
        return false;
    }

    public boolean isNewUser() {
        if (this.status == 3) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.userId, Integer.valueOf(this.badgeCount), Boolean.valueOf(this.isCurrentUser), this.userName, this.userNameEn, this.chatterAvatarKey, this.avatarUrl, this.tenantId, this.tenantName, this.tenantCode, false, this.userUnit, Integer.valueOf(this.tenantTag), this.accountSecurityConfig, Boolean.valueOf(this.isIdp));
    }

    public String toString() {
        return "TenantInfo{userId='" + this.userId + '\'' + ", tenantId='" + this.tenantId + '\'' + ", userUnit='" + this.userUnit + '\'' + ", tenantTag='" + this.tenantTag + '\'' + ", isIdp='" + this.isIdp + '\'' + ", status='" + this.status + ", isSessionValid='" + isSessionValid() + '\'' + ", isNewUser='" + isNewUser() + '\'' + ", canSwitchTo='" + canSwitchTo() + '\'' + '}';
    }

    public void setAccountSecurityConfig(AccountSecurityConfig accountSecurityConfig2) {
        this.accountSecurityConfig = accountSecurityConfig2;
    }

    public void setAuthNMode(String str) {
        this.authNMode = str;
    }

    public void setAvatarUrl(String str) {
        this.avatarUrl = str;
    }

    public void setBadgeCount(int i) {
        this.badgeCount = i;
    }

    public void setChatterAvatarKey(String str) {
        this.chatterAvatarKey = str;
    }

    public void setConfigEnv(String str) {
        this.configEnv = str;
    }

    public void setCurrentUser(boolean z) {
        this.isCurrentUser = z;
    }

    public void setIdp(boolean z) {
        this.isIdp = z;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setSuitFullDomain(String str) {
        this.suitFullDomain = str;
    }

    public void setTenantCode(String str) {
        this.tenantCode = str;
    }

    public void setTenantId(String str) {
        this.tenantId = str;
    }

    public void setTenantName(String str) {
        this.tenantName = str;
    }

    public void setTenantTag(int i) {
        this.tenantTag = i;
    }

    public void setUnitLeague(String str) {
        this.unitLeague = str;
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

    public void setUserUnit(String str) {
        this.userUnit = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TenantInfo tenantInfo = (TenantInfo) obj;
        if (this.badgeCount == tenantInfo.badgeCount && this.isCurrentUser == tenantInfo.isCurrentUser) {
            tenantInfo.getClass();
            if (this.tenantTag != tenantInfo.tenantTag || this.isIdp != tenantInfo.isIdp || this.status != tenantInfo.status || !Objects.equals(this.userId, tenantInfo.userId) || !Objects.equals(this.userName, tenantInfo.userName) || !Objects.equals(this.userNameEn, tenantInfo.userNameEn) || !Objects.equals(this.chatterAvatarKey, tenantInfo.chatterAvatarKey) || !Objects.equals(this.avatarUrl, tenantInfo.avatarUrl) || !Objects.equals(this.tenantId, tenantInfo.tenantId) || !Objects.equals(this.tenantName, tenantInfo.tenantName) || !Objects.equals(this.tenantCode, tenantInfo.tenantCode) || !Objects.equals(this.userUnit, tenantInfo.userUnit) || !Objects.equals(this.accountSecurityConfig, tenantInfo.accountSecurityConfig)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static TenantInfo fromUser(User user, boolean z, boolean z2) {
        String str;
        String str2;
        String str3 = user.userId;
        String str4 = user.name;
        if (user.i18Name == null) {
            str = "";
        } else {
            str = user.i18Name.enUs;
        }
        String tenantId2 = user.getTenantId();
        String tenantName2 = user.getTenantName();
        String tenantCode2 = user.getTenantCode();
        String str5 = user.avatarKey;
        String tenantIconUrl = user.getTenantIconUrl();
        String str6 = user.configEnv;
        String str7 = user.userUnit;
        int tenantTag2 = user.getTenantTag();
        AccountSecurityConfig accountSecurityConfig2 = user.accountSecurityConfig;
        boolean z3 = user.isIdp;
        String str8 = user.avatarUrl;
        if (user.tenant == null) {
            str2 = "";
        } else {
            str2 = user.tenant.suiteFullDomain;
        }
        return new TenantInfo(str3, str4, str, tenantId2, tenantName2, tenantCode2, str5, tenantIconUrl, 0, z, str6, str7, tenantTag2, accountSecurityConfig2, z3, str8, str2, "", user.authNMode, user.getStatus(), z2, user.getLastUseTimestamp());
    }

    public TenantInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, boolean z, String str9, String str10, int i2, AccountSecurityConfig accountSecurityConfig2, boolean z2, String str11, String str12, String str13, String str14, int i3, boolean z3, long j) {
        this.userId = str;
        this.userName = str2;
        this.userNameEn = str3;
        this.tenantId = str4;
        this.tenantName = str5;
        this.tenantCode = str6;
        this.chatterAvatarKey = str7;
        this.avatarUrl = str8;
        this.badgeCount = i;
        this.isCurrentUser = z;
        this.configEnv = str9;
        this.userUnit = str10;
        this.tenantTag = i2;
        this.accountSecurityConfig = accountSecurityConfig2;
        this.isIdp = z2;
        this.userAvatarUrl = str11;
        this.suitFullDomain = str12;
        this.unitLeague = str13;
        this.authNMode = str14;
        this.status = i3;
        this.isSessionValid = z3;
        this.lastUseTimestamp = j;
    }

    public TenantInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i, boolean z, boolean z2, String str9, String str10, int i2, AccountSecurityConfig accountSecurityConfig2, boolean z3, boolean z4, boolean z5, String str11, String str12, boolean z6, String str13, String str14, long j) {
        this(str, str2, str3, str4, str5, str6, str7, str8, i, z, str9, str10, i2, accountSecurityConfig2, z3, str11, str12, str13, str14, 0, false, j);
    }
}
