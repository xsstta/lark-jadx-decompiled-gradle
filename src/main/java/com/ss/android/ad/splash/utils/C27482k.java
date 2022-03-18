package com.ss.android.ad.splash.utils;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.util.Base64;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;

/* renamed from: com.ss.android.ad.splash.utils.k */
public class C27482k {

    /* renamed from: a */
    private static ThreadLocal<SimpleDateFormat> f68702a = new ThreadLocal<SimpleDateFormat>() {
        /* class com.ss.android.ad.splash.utils.C27482k.C274831 */

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.getDefault());
        }
    };

    /* renamed from: a */
    public static String m100387a(long j) {
        SimpleDateFormat simpleDateFormat = f68702a.get();
        if (simpleDateFormat != null) {
            return simpleDateFormat.format(Long.valueOf(j));
        }
        return String.valueOf(j);
    }

    /* renamed from: a */
    public static String m100388a(String str) {
        if (!C27480i.m100385a(str)) {
            try {
                return new String(Base64.decode(str, 0), "utf-8");
            } catch (Throwable unused) {
                C27477g.m100325a("error decoding video url");
            }
        }
        return "";
    }

    /* renamed from: a */
    public static boolean m100389a(Context context, Intent intent) {
        List<ResolveInfo> queryIntentActivities;
        if (intent == null || (queryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 65536)) == null || queryIntentActivities.size() <= 0) {
            return false;
        }
        return true;
    }
}
