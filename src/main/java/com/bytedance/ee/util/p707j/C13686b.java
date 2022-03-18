package com.bytedance.ee.util.p707j;

import android.content.Context;
import android.os.Build;
import com.bytedance.ee.util.info.AppInfoUtils;
import com.bytedance.ee.util.p700c.C13598b;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.bytedance.ee.util.j.b */
public class C13686b {
    /* renamed from: a */
    public static Map<String, String> m55572a(Context context, boolean z, String str, String str2, Locale locale) {
        HashMap hashMap = new HashMap();
        String str3 = C13598b.m55188a(12) + "-" + str2;
        hashMap.put("doc-version-code", String.valueOf(AppInfoUtils.m55450a(context)));
        hashMap.put("doc-version-name", AppInfoUtils.m55453b(context));
        hashMap.put("doc-package-name", AppInfoUtils.m55455c(context));
        hashMap.put("doc-platform", AppInfoUtils.m55457e(context));
        hashMap.put("doc-biz", AppInfoUtils.m55457e(context));
        hashMap.put("doc-os", "Android");
        hashMap.put("doc-os-version", Build.VERSION.RELEASE);
        hashMap.put("doc-device-model", AppInfoUtils.m55451a());
        hashMap.put("doc-channel-id", AppInfoUtils.m55452b());
        if (str == null) {
            str = "";
        }
        hashMap.put("doc-device-id", str);
        hashMap.put("called_from", "docs");
        hashMap.put("User-Agent", AppInfoUtils.m55459g(context));
        hashMap.put("request-id", str3);
        hashMap.put("x-tt-trace-id", str3);
        hashMap.put("locale", locale.getLanguage() + "_" + locale.getCountry().toUpperCase());
        if (z) {
            String str4 = str3 + ("#" + context.getSharedPreferences("debug_config", 0).getString("http_request_id", ""));
            hashMap.put("request-id", str4);
            hashMap.put("x-request-id", str4);
        }
        return hashMap;
    }
}
