package com.bytedance.common.utility;

import org.json.JSONObject;

public final class JsonUtils {
    public static long queryLong(JSONObject jSONObject, String str, long j) {
        if (jSONObject == null || StringUtils.isEmpty(str) || !jSONObject.has(str)) {
            return j;
        }
        return jSONObject.optLong(str, j);
    }
}
