package com.appsflyer.internal;

import android.content.ContentResolver;
import android.os.Build;
import android.provider.Settings;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.internal.C2040x;

/* renamed from: com.appsflyer.internal.v */
public final class C2036v {
    C2036v() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.appsflyer.internal.v$b */
    public static class C2037b extends IllegalStateException {
        C2037b(String str) {
            super(str);
        }
    }

    /* renamed from: Ι */
    public static C2040x m8933(ContentResolver contentResolver) {
        String str;
        if (contentResolver == null || AppsFlyerProperties.getInstance().getString("amazon_aid") != null || !"Amazon".equals(Build.MANUFACTURER)) {
            return null;
        }
        int i = Settings.Secure.getInt(contentResolver, "limit_ad_tracking", 2);
        if (i == 0) {
            String string = Settings.Secure.getString(contentResolver, "advertising_id");
            C2040x.EnumC2041b bVar = C2040x.EnumC2041b.AMAZON;
            return new C2040x(string, false);
        } else if (i == 2) {
            return null;
        } else {
            try {
                str = Settings.Secure.getString(contentResolver, "advertising_id");
            } catch (Throwable th) {
                AFLogger.afErrorLog("Couldn't fetch Amazon Advertising ID (Ad-Tracking is limited!)", th);
                str = "";
            }
            C2040x.EnumC2041b bVar2 = C2040x.EnumC2041b.AMAZON;
            return new C2040x(str, true);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0045, code lost:
        if (r8.length() == 0) goto L_0x0047;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0091 A[SYNTHETIC, Splitter:B:32:0x0091] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0137 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:60:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: ɩ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m8932(android.content.Context r13, java.util.Map<java.lang.String, java.lang.Object> r14) {
        /*
        // Method dump skipped, instructions count: 343
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C2036v.m8932(android.content.Context, java.util.Map):void");
    }
}
