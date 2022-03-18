package com.bytedance.bdturing.ttnet;

import android.content.Context;
import android.text.TextUtils;
import java.net.URL;
import java.util.Map;

/* renamed from: com.bytedance.bdturing.ttnet.b */
public class C3577b {
    /* renamed from: a */
    private static boolean m15104a(Context context, String str) throws Exception {
        URL url = new URL(str);
        if (TextUtils.isEmpty(url.getPath()) || !url.getPath().contains("vc/setting")) {
            return true;
        }
        return true ^ context.getSharedPreferences("bd_turning_settings_init", 0).getBoolean("inited", false);
    }

    /* renamed from: a */
    public static void m15103a(Context context, String str, Map<String, String> map) {
        int i;
        try {
            boolean a = m15104a(context, str);
            StringBuilder sb = new StringBuilder();
            sb.append("");
            sb.append("n=");
            if (a) {
                i = 1;
            } else {
                i = 0;
            }
            sb.append(i);
            sb.append(";");
            String sb2 = sb.toString();
            map.put("x-tt-request-tag", sb2 + "t=0");
        } catch (Exception unused) {
        }
    }
}
