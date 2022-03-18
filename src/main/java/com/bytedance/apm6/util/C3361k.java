package com.bytedance.apm6.util;

import android.text.TextUtils;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

/* renamed from: com.bytedance.apm6.util.k */
public class C3361k {

    /* renamed from: a */
    static int f10651a = 1;

    /* renamed from: a */
    private static String m13994a(String str, String str2) {
        if (str2 == null) {
            str2 = "UTF-8";
        }
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public static String m13995a(String str, Map<String, String> map) {
        if (!TextUtils.isDigitsOnly(str) && map != null && !map.isEmpty()) {
            if (str.indexOf("?") < 0) {
                str = str + "?";
            }
            str = str.endsWith("?") ? str + m13994a("sdk_version", "UTF-8") + ContainerUtils.KEY_VALUE_DELIMITER + m13994a(String.valueOf(f10651a), "UTF-8") : str + ContainerUtils.FIELD_DELIMITER + m13994a("sdk_version", "UTF-8") + ContainerUtils.KEY_VALUE_DELIMITER + m13994a(String.valueOf(f10651a), "UTF-8");
            if (map != null && map.size() > 0) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    if (map.get(entry.getKey()) != null) {
                        str = str.endsWith("?") ? str + m13994a(entry.getKey().toString(), "UTF-8") + ContainerUtils.KEY_VALUE_DELIMITER + m13994a(map.get(entry.getKey()).toString(), "UTF-8") : str + ContainerUtils.FIELD_DELIMITER + m13994a(entry.getKey().toString(), "UTF-8") + ContainerUtils.KEY_VALUE_DELIMITER + m13994a(map.get(entry.getKey()).toString(), "UTF-8");
                    }
                }
            }
        }
        return str;
    }
}
