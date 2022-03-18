package com.bytedance.ee.util.p719u;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ee.log.C13479a;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Map;
import java.util.Set;

/* renamed from: com.bytedance.ee.util.u.b */
public class C13752b {
    /* renamed from: a */
    public static String m55766a(String str, Map<String, String> map) {
        return m55767a(str, map, false);
    }

    /* renamed from: a */
    public static String m55767a(String str, Map<String, String> map, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (map != null && !map.isEmpty()) {
            try {
                Uri parse = Uri.parse(str);
                Set<String> queryParameterNames = parse.getQueryParameterNames();
                Uri.Builder buildUpon = parse.buildUpon();
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (!queryParameterNames.contains(key)) {
                        buildUpon.appendQueryParameter(key, entry.getValue());
                    } else if (z) {
                        buildUpon = Uri.parse(buildUpon.toString().replaceAll("(" + key + "=[^&]*)", key + ContainerUtils.KEY_VALUE_DELIMITER + entry.getValue())).buildUpon();
                    }
                }
                return buildUpon.toString();
            } catch (Exception unused) {
                C13479a.m54757a("parse url error: " + str);
            }
        }
        return str;
    }
}
