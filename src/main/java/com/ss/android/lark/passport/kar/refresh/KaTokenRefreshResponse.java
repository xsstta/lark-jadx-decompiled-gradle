package com.ss.android.lark.passport.kar.refresh;

import android.text.TextUtils;
import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;

public class KaTokenRefreshResponse implements Serializable {
    @JSONField(name = "RESPONSE")
    public ResponseEntity response;

    public static class ResponseEntity implements Serializable {
        @JSONField(name = "RETURN_CODE")
        public String returnCode;
        @JSONField(name = "RETURN_DATA")
        public ReturnData returnData;
        @JSONField(name = "RETURN_DESC")
        public String returnDesc;
        @JSONField(name = "RETURN_STAMP")
        public String returnStamp;
    }

    public static class ReturnData implements Serializable {
        @JSONField(name = "New_Token")
        public String newToken;
        @JSONField(name = "Refresh_key")
        public String refreshKey;
        @JSONField(name = "Refresh_Key_Expires")
        public long refreshKeyExpires;
        @JSONField(name = "Remarks")
        public String remarks;
        @JSONField(name = "Token_Expires")
        public long tokenExpires;
        @JSONField(name = "Token_Scope")
        public String tokenScope;
        @JSONField(name = "Token_Type")
        public String tokenType;
    }

    /* renamed from: com.ss.android.lark.passport.kar.refresh.KaTokenRefreshResponse$a */
    public static class C49321a {
        /* renamed from: a */
        public static boolean m194321a(String str) {
            if (TextUtils.equals(str, "S0A00000") || TextUtils.equals(str, "S1A00000")) {
                return true;
            }
            return false;
        }
    }
}
