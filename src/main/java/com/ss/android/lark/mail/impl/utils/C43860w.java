package com.ss.android.lark.mail.impl.utils;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.ss.android.lark.chat.service.lkp.ConvertOfficeToSpaceService;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.mail.impl.C41816b;
import java.net.URI;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.lark.mail.impl.utils.w */
public class C43860w {

    /* renamed from: a */
    private static String f111306a = "WebUtil";

    /* renamed from: b */
    private static Pattern f111307b = Pattern.compile("(^|;\\s*)session=");

    /* renamed from: a */
    public static Map<String, String> m173858a() {
        HashMap hashMap = new HashMap();
        hashMap.put(ConvertOfficeToSpaceService.f88309g, "session=" + C41816b.m166115a().mo150140g());
        return hashMap;
    }

    /* renamed from: b */
    private static String m173860b(String str) {
        return str + C41816b.m166115a().mo150140g();
    }

    /* renamed from: a */
    public static void m173859a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                String host = new URI(str).getHost();
                CookieManager instance = CookieManager.getInstance();
                String cookie = instance.getCookie(host);
                if (TextUtils.isEmpty(cookie)) {
                    Log.m165389i(f111306a, "ensureCookie add s and bs");
                    instance.setCookie(host, m173860b("session="));
                    instance.setCookie(host, m173860b("bear-session="));
                    return;
                }
                if (!f111307b.matcher(cookie).find()) {
                    Log.m165389i(f111306a, "ensureCookie add s");
                    instance.setCookie(host, m173860b("session="));
                }
                if (!cookie.contains("bear-session=")) {
                    Log.m165389i(f111306a, "ensureCookie add bs");
                    instance.setCookie(host, m173860b("bear-session="));
                }
            } catch (Exception e) {
                Log.m165384e(f111306a, "ensureCookie", e);
            }
        }
    }

    /* renamed from: a */
    public static String m173857a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            Log.m165383e(f111306a, "addURLParameter invalid url");
            return str;
        } else if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            Log.m165383e(f111306a, "addURLParameter invalid parameters");
            return str;
        } else {
            try {
                Uri.Builder buildUpon = Uri.parse(str).buildUpon();
                buildUpon.appendQueryParameter(str2, str3);
                return buildUpon.build().toString();
            } catch (Exception e) {
                Log.m165384e(f111306a, "addURLParameter", e);
                return str;
            }
        }
    }
}
