package com.bytedance.ee.util.common;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.bytedance.ee.log.C13479a;

/* renamed from: com.bytedance.ee.util.common.g */
public class C13611g {
    /* renamed from: a */
    public static int m55252a(Context context) {
        try {
            String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
            if (TextUtils.isEmpty(defaultUserAgent) || !defaultUserAgent.contains("Chrome/")) {
                return -1;
            }
            int indexOf = defaultUserAgent.indexOf("Chrome/") + 7;
            return Integer.parseInt(defaultUserAgent.substring(indexOf, defaultUserAgent.substring(indexOf).indexOf(".") + indexOf));
        } catch (Exception e) {
            C13479a.m54761a("WebUtils", e);
            return -1;
        }
    }
}
