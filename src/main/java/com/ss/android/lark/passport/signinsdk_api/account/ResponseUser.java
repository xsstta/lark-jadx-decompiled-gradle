package com.ss.android.lark.passport.signinsdk_api.account;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class ResponseUser implements Serializable {
    @JSONField(name = "current_env")
    private String currentEnv;
    @JSONField(name = "device_login_id")
    private String deviceLoginId;
    @JSONField(name = "is_anonymous")
    private boolean isAnonymous;
    @JSONField(name = "logout_token")
    private String logoutToken;
    private Map<String, SessionInfo> sessionMap;
    @JSONField(name = "suite_session_key_with_domains")
    private Map<String, SessionInfo> sessionWithDomainMap;
    @JSONField(name = "suite_session_key")
    private String suiteSessionKey;
    @JSONField(name = "user")
    private User user;

    public String getCurrentEnv() {
        return this.currentEnv;
    }

    public String getDeviceLoginId() {
        return this.deviceLoginId;
    }

    public String getLogoutToken() {
        return this.logoutToken;
    }

    public String getSession() {
        return this.suiteSessionKey;
    }

    public Map<String, SessionInfo> getSessionMap() {
        return this.sessionMap;
    }

    public Map<String, SessionInfo> getSessionWithDomainMap() {
        return this.sessionWithDomainMap;
    }

    public String getSuiteSessionKey() {
        return this.suiteSessionKey;
    }

    public User getUser() {
        return this.user;
    }

    public boolean isAnonymous() {
        return this.isAnonymous;
    }

    public ResponseUser() {
        this.sessionMap = new HashMap();
    }

    public void setAnonymous(boolean z) {
        this.isAnonymous = z;
    }

    public void setCurrentEnv(String str) {
        this.currentEnv = str;
    }

    public void setDeviceLoginId(String str) {
        this.deviceLoginId = str;
    }

    public void setLogoutToken(String str) {
        this.logoutToken = str;
    }

    public void setSession(String str) {
        this.suiteSessionKey = str;
    }

    public void setSessionMap(Map<String, SessionInfo> map) {
        this.sessionMap = map;
    }

    public void setSessionWithDomainMap(Map<String, SessionInfo> map) {
        this.sessionWithDomainMap = map;
    }

    public void setSuiteSessionKey(String str) {
        this.suiteSessionKey = str;
    }

    public void setUser(User user2) {
        this.user = user2;
    }

    private void attachAdditionSessions(Map<String, SessionInfo> map) {
        if (map != null) {
            for (Map.Entry<String, SessionInfo> entry : map.entrySet()) {
                SessionInfo value = entry.getValue();
                if (value != null) {
                    value.setHostUrl(entry.getKey());
                    this.sessionMap.put(entry.getKey(), value);
                }
            }
        }
    }

    public ResponseUser(String str, String str2) {
        this(str, str2, null);
    }

    public ResponseUser(String str, String str2, Map<String, SessionInfo> map) {
        this.sessionMap = new HashMap();
        this.suiteSessionKey = str2;
        attachAdditionSessions(map);
    }
}
