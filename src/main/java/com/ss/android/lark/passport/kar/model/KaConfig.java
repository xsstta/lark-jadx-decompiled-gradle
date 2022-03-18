package com.ss.android.lark.passport.kar.model;

import com.alibaba.fastjson.annotation.JSONField;
import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;

public class KaConfig implements Serializable {
    public ClientEntity client;
    public Map<String, Object> ext;

    public static class ClientEntity implements Serializable {
        @JSONField(name = "mpw_url")
        public String mpwUrl;
        @JSONField(name = "refresh_api_id")
        public String refreshApiId;
        @JSONField(name = "refresh_app_id")
        public String refreshAppId;
        @JSONField(name = "refresh_url")
        public String refreshUrl;
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ExtKeyName {
    }

    public static String getValueForKey(Map<String, Object> map, String str) {
        if (map.get(str) != null) {
            return map.get(str).toString();
        }
        return "";
    }
}
