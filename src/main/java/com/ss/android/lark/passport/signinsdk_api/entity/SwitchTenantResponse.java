package com.ss.android.lark.passport.signinsdk_api.entity;

import com.ss.android.lark.passport.signinsdk_api.account.SessionInfo;
import java.io.Serializable;
import java.util.Map;

public class SwitchTenantResponse implements Serializable {
    public int code;
    public String deviceLoginId;
    public boolean isStdLark;
    public String message;
    public String newToken;
    public Map<String, SessionInfo> sessionKeyMap;
}
