package com.ss.android.lark.passport.ka.model;

import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;

public class KaConfig implements Serializable {
    public Map<String, Object> external;
    public InternalData internal;

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
