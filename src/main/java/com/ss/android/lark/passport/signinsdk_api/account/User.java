package com.ss.android.lark.passport.signinsdk_api.account;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import com.ss.android.lark.passport.signinsdk_api.account.config.AccountSecurityConfig;
import java.io.Serializable;
import java.util.Map;

public class User implements Serializable {
    @JSONField(name = "account_security_config")
    public AccountSecurityConfig accountSecurityConfig;
    @JSONField(name = "authn_mode")
    public String authNMode = "";
    @JSONField(name = "avatar_key")
    public String avatarKey;
    @JSONField(name = "avatar_url")
    public String avatarUrl;
    @JSONField(name = "user_env")
    public String configEnv;
    @JSONField(name = "create_time")
    public long createTime;
    private String currentEnv;
    private String deviceLoginId;
    @JSONField(name = "en_name")
    public String enName;
    @JSONField(name = "exclude_login")
    private boolean excludeLogin;
    @JSONField(name = "i18n_names")
    public I18Name i18Name;
    @JSONField(name = "is_active")
    public boolean isActive;
    private boolean isAnonymous;
    @JSONField(name = "is_frozen")
    public boolean isFrozen;
    @JSONField(name = "is_guest")
    public boolean isGuest;
    @JSONField(name = "is_idp")
    public boolean isIdp;
    private boolean isSessionValid = true;
    private long lastUseTimestamp;
    @JSONField(name = "login_credential_id")
    private String loginCredentialId;
    private String logoutToken;
    public String name;
    private String session;
    @JSONField(name = "suite_session_key_with_domains")
    private Map<String, SessionInfo> sessionWithDomainMap;
    private int status;
    public Tenant tenant;
    @JSONField(name = "tenant_tag")
    private int tenantTag;
    @JSONField(name = "upgrade_enabled")
    public boolean upgradeEnabled;
    @JSONField(alternateNames = {"id"}, name = "user_id")
    public String userId;
    @JSONField(name = "unit")
    public String userUnit;

    public static class I18Name implements Serializable {
        @JSONField(name = "en_us")
        public String enUs;
        @JSONField(name = "ja_jp")
        public String jaJp;
        @JSONField(name = "zh_cn")
        public String zhCn;
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

    public String getConfigEnv() {
        return this.configEnv;
    }

    public String getCurrentEnv() {
        return this.currentEnv;
    }

    public String getDeviceLoginId() {
        return this.deviceLoginId;
    }

    public long getLastUseTimestamp() {
        return this.lastUseTimestamp;
    }

    public String getLoginCredentialId() {
        return this.loginCredentialId;
    }

    public String getLogoutToken() {
        return this.logoutToken;
    }

    public String getSession() {
        return this.session;
    }

    public Map<String, SessionInfo> getSessionWithDomainMap() {
        return this.sessionWithDomainMap;
    }

    public int getStatus() {
        return this.status;
    }

    public String getUserId() {
        return this.userId;
    }

    public String getUserName() {
        return this.name;
    }

    public boolean isActive() {
        return this.isActive;
    }

    public boolean isAnonymous() {
        return this.isAnonymous;
    }

    public boolean isExcludeLogin() {
        return this.excludeLogin;
    }

    public boolean isIdp() {
        return this.isIdp;
    }

    public boolean isUpgradeEnabled() {
        return this.upgradeEnabled;
    }

    public String getTenantCode() {
        Tenant tenant2 = this.tenant;
        if (tenant2 == null) {
            return "";
        }
        return tenant2.tenantDomain;
    }

    public String getTenantIconUrl() {
        Tenant tenant2 = this.tenant;
        if (tenant2 == null) {
            return "";
        }
        return tenant2.iconUrl;
    }

    public String getTenantId() {
        Tenant tenant2 = this.tenant;
        if (tenant2 == null) {
            return "";
        }
        return tenant2.tenantId;
    }

    public String getTenantName() {
        Tenant tenant2 = this.tenant;
        if (tenant2 == null) {
            return "";
        }
        return tenant2.name;
    }

    public int getTenantTag() {
        Tenant tenant2 = this.tenant;
        if (tenant2 != null) {
            return tenant2.tag;
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

    public boolean isC() {
        return "0".equals(getTenantId());
    }

    public boolean isFrozen() {
        if (this.status == 2) {
            return true;
        }
        return false;
    }

    public boolean hasValidSession() {
        if (TextUtils.isEmpty(this.session) || this.isAnonymous || !this.isSessionValid) {
            return false;
        }
        return true;
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
        return "userId:" + this.userId + ", avatarUrl:" + this.avatarUrl + ", tenantId:" + getTenantId() + ", tenantCode:" + getTenantCode() + ", configEnv:" + this.configEnv + ", tenantTag:" + this.tenantTag;
    }

    public void setAccountSecurityConfig(AccountSecurityConfig accountSecurityConfig2) {
        this.accountSecurityConfig = accountSecurityConfig2;
    }

    public void setAnonymous(boolean z) {
        this.isAnonymous = z;
    }

    public void setAuthNMode(String str) {
        this.authNMode = str;
    }

    public void setAvatarUrl(String str) {
        this.avatarUrl = str;
    }

    public void setConfigEnv(String str) {
        this.configEnv = str;
    }

    public void setCurrentEnv(String str) {
        this.currentEnv = str;
    }

    public void setDeviceLoginId(String str) {
        this.deviceLoginId = str;
    }

    public void setExcludeLogin(boolean z) {
        this.excludeLogin = z;
    }

    public void setIdp(boolean z) {
        this.isIdp = z;
    }

    public void setLastUseTimestamp(long j) {
        this.lastUseTimestamp = j;
    }

    public void setLoginCredentialId(String str) {
        this.loginCredentialId = str;
    }

    public void setLogoutToken(String str) {
        this.logoutToken = str;
    }

    public void setSession(String str) {
        this.session = str;
    }

    public void setSessionValid(boolean z) {
        this.isSessionValid = z;
    }

    public void setSessionWithDomainMap(Map<String, SessionInfo> map) {
        this.sessionWithDomainMap = map;
    }

    public void setStatus(int i) {
        this.status = i;
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

    public void setTenantId(String str) {
        if (this.tenant == null) {
            this.tenant = new Tenant();
        }
        this.tenant.tenantId = str;
    }

    public void setTenantName(String str) {
        if (this.tenant == null) {
            this.tenant = new Tenant();
        }
        this.tenant.name = str;
    }

    public void setTenantTag(int i) {
        this.tenantTag = i;
        Tenant tenant2 = this.tenant;
        if (tenant2 != null) {
            tenant2.tag = i;
        }
    }

    public void mergeWithResponseUser(ResponseUser responseUser) {
        setSession(responseUser.getSession());
        setLogoutToken(responseUser.getLogoutToken());
        setCurrentEnv(responseUser.getCurrentEnv());
        setAnonymous(responseUser.isAnonymous());
        setDeviceLoginId(responseUser.getDeviceLoginId());
        Map<String, SessionInfo> sessionWithDomainMap2 = responseUser.getSessionWithDomainMap();
        if (sessionWithDomainMap2 != null) {
            for (Map.Entry<String, SessionInfo> entry : sessionWithDomainMap2.entrySet()) {
                if (entry.getValue() != null) {
                    entry.getValue().setHostUrl(entry.getKey());
                }
            }
        }
        setSessionWithDomainMap(responseUser.getSessionWithDomainMap());
    }
}
