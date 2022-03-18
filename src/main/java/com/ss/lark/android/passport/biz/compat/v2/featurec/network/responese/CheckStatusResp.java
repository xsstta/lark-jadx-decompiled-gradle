package com.ss.lark.android.passport.biz.compat.v2.featurec.network.responese;

import com.alibaba.fastjson.annotation.JSONField;
import com.ss.lark.android.passport.biz.feature.constants.LogoutReason;
import java.io.Serializable;
import java.util.Map;

public class CheckStatusResp implements Serializable {
    @JSONField(name = "session_status")
    public Map<String, SessionStatus> sessionStatusMap;
    @JSONField(name = "user_status")
    public Map<String, Integer> userStatusMap;

    public static class SessionStatus implements Serializable {
        @JSONField(name = "is_logged")
        private boolean isLogged;
        @JSONField(name = "logout_reason")
        private int logoutReason;
        @JSONField(name = "message")
        private String message;

        public int getLogoutReason() {
            return this.logoutReason;
        }

        public String getMessage() {
            return this.message;
        }

        public boolean isLogged() {
            return this.isLogged;
        }

        public LogoutReason getLogoutReasonEnum() {
            return LogoutReason.Companion.mo223520a(this.logoutReason);
        }

        public void setIsLogged(boolean z) {
            this.isLogged = z;
        }

        public void setLogoutReason(int i) {
            this.logoutReason = i;
        }

        public void setMessage(String str) {
            this.message = str;
        }
    }
}
