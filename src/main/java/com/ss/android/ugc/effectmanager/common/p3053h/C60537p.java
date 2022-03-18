package com.ss.android.ugc.effectmanager.common.p3053h;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.huawei.hms.framework.common.ContainerUtils;
import com.ss.android.ugc.effectmanager.common.logger.EPLog;
import java.util.Map;

/* renamed from: com.ss.android.ugc.effectmanager.common.h.p */
public class C60537p {
    /* renamed from: a */
    public static boolean m235321a(Context context) {
        if (context == null) {
            return false;
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
                return false;
            }
            return true;
        } catch (Exception e) {
            EPLog.m235180c("NetworkUtils", "isNetworkAvailable: " + e.toString());
            return false;
        }
    }

    /* renamed from: a */
    public static String m235320a(Map<String, String> map, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (map.size() > 0) {
            sb.append("?");
            int i = 0;
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                    if (i == 0) {
                        sb.append(key);
                        sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
                        sb.append(value);
                    } else {
                        sb.append(ContainerUtils.FIELD_DELIMITER);
                        sb.append(key);
                        sb.append(ContainerUtils.KEY_VALUE_DELIMITER);
                        sb.append(value);
                    }
                }
                i++;
            }
        }
        return new String(sb);
    }
}
