package com.bytedance.ee.util.info;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.ee.log.C13479a;
import com.larksuite.suite.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class AppInfoUtils {

    /* renamed from: a */
    private static PackageInfo f35856a;

    @Retention(RetentionPolicy.SOURCE)
    public @interface VERSION_TYPE {
    }

    /* renamed from: b */
    public static String m55452b() {
        return "0";
    }

    /* renamed from: c */
    public static String m55454c() {
        return "5.2.805";
    }

    /* renamed from: a */
    public static String m55451a() {
        return Build.BRAND + " " + Build.MODEL;
    }

    /* renamed from: e */
    public static String m55457e(Context context) {
        return context.getString(R.string.ua_app_name);
    }

    /* renamed from: f */
    public static String m55458f(Context context) {
        return context.getString(R.string.ua_sdk_name);
    }

    /* renamed from: a */
    public static int m55450a(Context context) {
        PackageInfo h = m55460h(context);
        if (h == null) {
            return 0;
        }
        return h.versionCode;
    }

    /* renamed from: b */
    public static String m55453b(Context context) {
        PackageInfo h = m55460h(context);
        if (h == null) {
            return "";
        }
        return h.versionName;
    }

    /* renamed from: c */
    public static String m55455c(Context context) {
        PackageInfo h = m55460h(context);
        if (h == null) {
            return "";
        }
        return h.packageName;
    }

    /* renamed from: h */
    private static PackageInfo m55460h(Context context) {
        if (f35856a == null) {
            try {
                f35856a = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (Throwable th) {
                C13479a.m54773d("InfoProviderUtils", "init: error", th);
            }
        }
        return f35856a;
    }

    /* renamed from: d */
    public static String m55456d(Context context) {
        String b = m55453b(context);
        if (b.toLowerCase().contains("alpha")) {
            return "alpha";
        }
        if (b.toLowerCase().contains("beta")) {
            return "beta";
        }
        return "release";
    }

    /* renamed from: g */
    public static String m55459g(Context context) {
        StringBuilder sb = new StringBuilder();
        String b = m55453b(context);
        if (!TextUtils.isEmpty(m55458f(context))) {
            sb.append(m55458f(context));
            sb.append("/");
            sb.append(m55454c());
            sb.append(" ");
        }
        if (!TextUtils.isEmpty(m55457e(context)) && !TextUtils.isEmpty(b)) {
            sb.append(m55457e(context));
            sb.append("/");
            sb.append(b);
            sb.append(" ");
        }
        sb.append("platform/android ");
        sb.append("okhttp/3.2 ");
        sb.append("Mobile");
        return sb.toString();
    }
}
