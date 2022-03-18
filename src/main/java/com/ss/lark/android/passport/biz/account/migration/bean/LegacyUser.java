package com.ss.lark.android.passport.biz.account.migration.bean;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class LegacyUser implements Serializable {
    @JSONField(name = "account_security_config")
    public LegacyAccountSecurityConfig accountSecurityConfig;
    @JSONField(name = "authn_mode")
    public String authNMode = "";
    @JSONField(name = "avatar_key")
    public String avatarKey;
    @JSONField(name = "avatar_url")
    public String avatarUrl;
    @JSONField(name = "user_env")
    public String configEnv;
    @JSONField(name = "en_name")
    public String enName;
    @JSONField(name = "i18n_name")
    public I18Name i18Name;
    @JSONField(name = "is_active")
    public boolean isActive;
    @JSONField(name = "is_c")
    public boolean isC;
    @JSONField(name = "is_frozen")
    public boolean isFrozen;
    @JSONField(name = "is_guest")
    public boolean isGuest;
    @JSONField(name = "is_idp")
    public boolean isIdp;
    public String name;
    public LegacyTenant tenant;
    @JSONField(name = "tenant_tag")
    private int tenantTag;
    public String tip;
    @JSONField(name = "upgrade_enabled")
    public boolean upgradeEnabled;
    @JSONField(name = "user_id")
    public String userId;
    @JSONField(name = "user_status")
    public int userStatus;
    @JSONField(name = "user_unit")
    public String userUnit;

    public static class I18Name implements Serializable {
        @JSONField(name = "en_us")
        public String enUs;
        @JSONField(name = "ja_jp")
        public String jaJp;
        @JSONField(name = "zh_cn")
        public String zhCn;
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface UserStatus {
    }

    public LegacyAccountSecurityConfig getAccountSecurityConfig() {
        return this.accountSecurityConfig;
    }

    public String getAuthNMode() {
        return this.authNMode;
    }

    public String getAvatarKey() {
        return this.avatarKey;
    }

    public String getAvatarUrl() {
        return this.avatarUrl;
    }

    public String getConfigEnv() {
        return this.configEnv;
    }

    public String getUserId() {
        return this.userId;
    }

    public String getUserName() {
        return this.name;
    }

    public String getUserUnit() {
        return this.userUnit;
    }

    public boolean isActive() {
        return this.isActive;
    }

    public boolean isFrozen() {
        return this.isFrozen;
    }

    public boolean isGuest() {
        return this.isGuest;
    }

    public boolean isIdp() {
        return this.isIdp;
    }

    public boolean isUpgradeEnabled() {
        return this.upgradeEnabled;
    }

    private boolean isC() {
        return "0".equals(getTenantCode());
    }

    public boolean currentVersionNotSupport() {
        int i = this.userStatus;
        if (i == 0 || i == 1 || i == 2) {
            return false;
        }
        return true;
    }

    public String getTenantCode() {
        LegacyTenant legacyTenant = this.tenant;
        if (legacyTenant == null) {
            return "";
        }
        return legacyTenant.tenantDomain;
    }

    public String getTenantIconUrl() {
        LegacyTenant legacyTenant = this.tenant;
        if (legacyTenant == null) {
            return "";
        }
        return legacyTenant.iconUrl;
    }

    public String getTenantId() {
        LegacyTenant legacyTenant = this.tenant;
        if (legacyTenant == null) {
            return "";
        }
        return legacyTenant.tenantId;
    }

    public String getTenantName() {
        LegacyTenant legacyTenant = this.tenant;
        if (legacyTenant == null) {
            return "";
        }
        return legacyTenant.name;
    }

    public int getTenantTag() {
        LegacyTenant legacyTenant = this.tenant;
        if (legacyTenant != null) {
            return legacyTenant.tag;
        }
        return this.tenantTag;
    }

    public String getUserNameEn() {
        I18Name i18Name2 = this.i18Name;
        if (i18Name2 == null) {
            return "";
        }
        return i18Name2.enUs;
    }

    public boolean isSmallB() {
        if (isC()) {
            return false;
        }
        int tenantTag2 = getTenantTag();
        if (tenantTag2 == 1 || tenantTag2 == 2) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "" + "userId:" + this.userId + ", userName:" + this.name + ", userNameEn:" + getUserNameEn() + ", avatarUrl:" + this.avatarUrl + ", tenantId:" + getTenantId() + ", tenantName:" + getTenantName() + ", tenantCode:" + getTenantCode() + ", configEnv:" + this.configEnv + ", tenantTag:" + this.tenantTag;
    }

    public void setAccountSecurityConfig(LegacyAccountSecurityConfig legacyAccountSecurityConfig) {
        this.accountSecurityConfig = legacyAccountSecurityConfig;
    }

    public void setActive(boolean z) {
        this.isActive = z;
    }

    public void setAuthNMode(String str) {
        this.authNMode = str;
    }

    public void setAvatarKey(String str) {
        this.avatarKey = str;
    }

    public void setAvatarUrl(String str) {
        this.avatarUrl = str;
    }

    public void setConfigEnv(String str) {
        this.configEnv = str;
    }

    public void setFrozen(boolean z) {
        this.isFrozen = z;
    }

    public void setGuest(boolean z) {
        this.isGuest = z;
    }

    public void setIdp(boolean z) {
        this.isIdp = z;
    }

    public void setUpgradeEnabled(boolean z) {
        this.upgradeEnabled = z;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public void setUserName(String str) {
        this.name = str;
    }

    public void setUserUnit(String str) {
        this.userUnit = str;
    }

    public void setTenantCode(String str) {
        if (this.tenant == null) {
            this.tenant = new LegacyTenant();
        }
        this.tenant.tenantDomain = str;
    }

    public void setTenantIconUrl(String str) {
        if (this.tenant == null) {
            this.tenant = new LegacyTenant();
        }
        this.tenant.iconUrl = str;
    }

    public void setTenantId(String str) {
        if (this.tenant == null) {
            this.tenant = new LegacyTenant();
        }
        this.tenant.tenantId = str;
    }

    public void setTenantName(String str) {
        if (this.tenant == null) {
            this.tenant = new LegacyTenant();
        }
        this.tenant.name = str;
    }

    public void setTenantTag(int i) {
        this.tenantTag = i;
        LegacyTenant legacyTenant = this.tenant;
        if (legacyTenant != null) {
            legacyTenant.tag = i;
        }
    }

    public void setUserNameEn(String str) {
        if (this.i18Name == null) {
            this.i18Name = new I18Name();
        }
        this.i18Name.enUs = str;
    }
}
