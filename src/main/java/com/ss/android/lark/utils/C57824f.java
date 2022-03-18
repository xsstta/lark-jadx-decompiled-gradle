package com.ss.android.lark.utils;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.larksuite.framework.utils.C26246a;
import com.ss.android.lark.log.Log;
import com.ss.android.lark.util.share_preference.C57744a;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.util.Locale;

/* renamed from: com.ss.android.lark.utils.f */
public class C57824f {

    /* renamed from: a */
    private static String f142429a;

    /* renamed from: b */
    private static String f142430b;

    /* renamed from: c */
    private static boolean f142431c;

    /* renamed from: d */
    private static boolean f142432d;

    /* renamed from: c */
    public static boolean m224469c() {
        return f142431c;
    }

    /* renamed from: a */
    public static String m224458a() {
        if (TextUtils.isEmpty(f142430b)) {
            return "Lark";
        }
        return f142430b;
    }

    /* renamed from: b */
    public static boolean m224467b() {
        return !TextUtils.isEmpty(C57744a.m224104a().getString("key_user_agent"));
    }

    /* renamed from: a */
    public static void m224464a(boolean z) {
        f142431c = z;
    }

    /* renamed from: b */
    public static void m224466b(boolean z) {
        f142432d = z;
    }

    /* renamed from: a */
    public static String m224459a(Context context) {
        return m224461a(C26246a.m94977a(context), m224468c(context));
    }

    /* renamed from: c */
    public static int m224468c(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), SmActions.ACTION_ONTHECALL_EXIT).metaData.getInt("buildVersionCode", 0);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: e */
    private static String m224471e(Context context) {
        String string = C57744a.m224104a().getString("key_user_agent");
        if (TextUtils.isEmpty(string)) {
            return C57825a.m224472a(context);
        }
        return string;
    }

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.utils.f$a */
    public static class C57825a {
        /* renamed from: a */
        public static String m224472a(Context context) {
            Log.m165389i("BuildUtils", "firstlyGetUserAgent return the mock ua.");
            try {
                return String.format("Mozilla/5.0 (Linux; Android %s; %s Build/%s %s; wv) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/55.0.2883.91 Mobile Safari/537.36", Build.VERSION.RELEASE, Build.MODEL, Build.MANUFACTURER, Build.MODEL);
            } catch (Exception unused) {
                return "Mozilla/5.0 (Linux; Android 7.0; FRD-AL00 Build/HUAWEIFRD-AL00; wv) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/55.0.2883.91 Mobile Safari/537.36";
            }
        }
    }

    /* renamed from: b */
    public static int m224465b(Context context) {
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            if (TextUtils.isEmpty(str)) {
                return 0;
            }
            String[] split = str.split("-beta");
            if (split.length != 1 && split.length > 1) {
                return Integer.parseInt(split[1]);
            }
            return 0;
        } catch (Exception e) {
            Log.m165398w("BuildUtils", "get app beta version exception", e);
        }
    }

    /* renamed from: d */
    private static String m224470d(Context context) {
        String str;
        if (Build.VERSION.SDK_INT >= 17) {
            try {
                Log.m165389i("BuildUtils", "get user agent from web_view settings.");
                str = WebSettings.getDefaultUserAgent(context);
            } catch (Throwable unused) {
                str = System.getProperty("http.agent");
            }
        } else {
            str = System.getProperty("http.agent");
        }
        StringBuffer stringBuffer = new StringBuffer();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (charAt <= 31 || charAt >= 127) {
                stringBuffer.append(String.format("\\u%04x", Integer.valueOf(charAt)));
            } else {
                stringBuffer.append(charAt);
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    private static void m224463a(Locale locale) {
        String str;
        if (!TextUtils.isEmpty(f142429a) && locale != null) {
            String str2 = locale.getLanguage().toLowerCase() + "_" + locale.getCountry().toUpperCase();
            Log.m165389i("BuildUtils", "UA locale param is: " + str2);
            if (f142429a.contains("LarkLocale/" + str2)) {
                return;
            }
            if (f142429a.contains("LarkLocale/")) {
                int indexOf = f142429a.indexOf("LarkLocale/");
                int indexOf2 = f142429a.indexOf(" ", indexOf);
                int i = indexOf + 11;
                if (indexOf2 == -1) {
                    str = f142429a.substring(i);
                } else {
                    str = f142429a.substring(i, indexOf2);
                }
                f142429a = f142429a.replace(str, str2);
                Log.m165389i("BuildUtils", "UA has replaced the locale, the old locale is: " + str);
                return;
            }
            f142429a += " LarkLocale/" + str2;
            Log.m165389i("BuildUtils", "UA has been added locale param directly");
        }
    }

    /* renamed from: a */
    private static String m224461a(String str, int i) {
        if (i <= 0) {
            return str;
        }
        return String.format("%s-%s", str, Integer.valueOf(i));
    }

    /* renamed from: a */
    public static void m224462a(Context context, boolean z) {
        if (z) {
            if (System.currentTimeMillis() - C57744a.m224104a().getLong("key_ua_ts", -1) < 259200000) {
                Log.m165389i("BuildUtils", "getUserAgent skip");
                return;
            }
        }
        String d = m224470d(context);
        if (!d.equalsIgnoreCase(C57744a.m224104a().getString("key_user_agent"))) {
            C57744a.m224104a().putString("key_user_agent", d);
        }
        if (z) {
            C57744a.m224104a().putLong("key_ua_ts", System.currentTimeMillis());
        }
    }

    /* renamed from: a */
    public static String m224460a(Context context, String str, Locale locale) {
        if (!TextUtils.isEmpty(f142429a)) {
            m224463a(locale);
            return f142429a;
        }
        if (TextUtils.isEmpty(str)) {
            str = m224471e(context);
        }
        if (TextUtils.isEmpty(str)) {
            str = "Mozilla/5.0 (Linux; Android 7.0; FRD-AL00 Build/HUAWEIFRD-AL00; wv) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/55.0.2883.91 Mobile Safari/537.36";
        }
        String a = C26246a.m94977a(context);
        f142429a = str + " " + m224458a() + "/" + a;
        m224463a(locale);
        return f142429a;
    }
}
