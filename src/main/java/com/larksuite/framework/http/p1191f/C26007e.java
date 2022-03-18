package com.larksuite.framework.http.p1191f;

import android.text.TextUtils;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: com.larksuite.framework.http.f.e */
public class C26007e {

    /* renamed from: a */
    private static Pattern f64365a = Pattern.compile("^([hH][tT]{2}[pP]:/*|[hH][tT]{2}[pP][sS]:/*|[fF][iI][lL][eE]:/*)([\\w.]+\\/?)\\S*");

    /* renamed from: a */
    public static String m94129a(String str, Map<String, String> map) {
        if (TextUtils.isEmpty(str) || map == null || map.size() <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        if (!str.endsWith("?")) {
            sb.append("?");
        }
        boolean z = true;
        for (String str2 : map.keySet()) {
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(map.get(str2))) {
                if (z) {
                    z = false;
                } else {
                    sb.append(ContainerUtils.FIELD_DELIMITER);
                }
                sb.append(str2);
                sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
                sb.append(map.get(str2));
            }
        }
        return sb.toString();
    }
}
