package com.appsflyer.internal;

import android.content.Context;
import android.util.Log;
import com.appsflyer.AFFacebookDeferredDeeplink;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.appsflyer.internal.ad */
public final class C2007ad {

    /* renamed from: ǃ */
    private static C2007ad f6854 = new C2007ad();

    private C2007ad() {
    }

    /* renamed from: ι */
    public static C2007ad m8861() {
        return f6854;
    }

    /* renamed from: Ι */
    public static File m8860(Context context) {
        return new File(context.getFilesDir(), "AFRequestCache");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025 A[SYNTHETIC, Splitter:B:13:0x0025] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002c A[SYNTHETIC, Splitter:B:21:0x002c] */
    /* renamed from: ɩ */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.appsflyer.AFFacebookDeferredDeeplink m8858(java.io.File r4) {
        /*
            r0 = 0
            java.io.FileReader r1 = new java.io.FileReader     // Catch:{ Exception -> 0x0029, all -> 0x0022 }
            r1.<init>(r4)     // Catch:{ Exception -> 0x0029, all -> 0x0022 }
            long r2 = r4.length()     // Catch:{ Exception -> 0x002a, all -> 0x001f }
            int r3 = (int) r2     // Catch:{ Exception -> 0x002a, all -> 0x001f }
            char[] r2 = new char[r3]     // Catch:{ Exception -> 0x002a, all -> 0x001f }
            r1.read(r2)     // Catch:{ Exception -> 0x002a, all -> 0x001f }
            com.appsflyer.AFFacebookDeferredDeeplink r3 = new com.appsflyer.AFFacebookDeferredDeeplink     // Catch:{ Exception -> 0x002a, all -> 0x001f }
            r3.<init>(r2)     // Catch:{ Exception -> 0x002a, all -> 0x001f }
            java.lang.String r4 = r4.getName()     // Catch:{ Exception -> 0x002a, all -> 0x001f }
            r3.f6719 = r4     // Catch:{ Exception -> 0x002a, all -> 0x001f }
            r1.close()     // Catch:{ IOException -> 0x001e }
        L_0x001e:
            return r3
        L_0x001f:
            r4 = move-exception
            r0 = r1
            goto L_0x0023
        L_0x0022:
            r4 = move-exception
        L_0x0023:
            if (r0 == 0) goto L_0x0028
            r0.close()     // Catch:{ IOException -> 0x0028 }
        L_0x0028:
            throw r4
        L_0x0029:
            r1 = r0
        L_0x002a:
            if (r1 == 0) goto L_0x002f
            r1.close()     // Catch:{ IOException -> 0x002f }
        L_0x002f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C2007ad.m8858(java.io.File):com.appsflyer.AFFacebookDeferredDeeplink");
    }

    /* renamed from: ɩ */
    public static List<AFFacebookDeferredDeeplink> m8859(Context context) {
        ArrayList arrayList = new ArrayList();
        try {
            File file = new File(context.getFilesDir(), "AFRequestCache");
            if (!file.exists()) {
                file.mkdir();
            } else {
                File[] listFiles = file.listFiles();
                for (File file2 : listFiles) {
                    StringBuilder sb = new StringBuilder("Found cached request");
                    sb.append(file2.getName());
                    Log.i("AppsFlyer_5.2.0", sb.toString());
                    arrayList.add(m8858(file2));
                }
            }
        } catch (Exception unused) {
            Log.i("AppsFlyer_5.2.0", "Could not cache request");
        }
        return arrayList;
    }

    /* renamed from: ι */
    public static void m8862(String str, Context context) {
        File file = new File(new File(context.getFilesDir(), "AFRequestCache"), str);
        StringBuilder sb = new StringBuilder("Deleting ");
        sb.append(str);
        sb.append(" from cache");
        Log.i("AppsFlyer_5.2.0", sb.toString());
        if (file.exists()) {
            try {
                file.delete();
            } catch (Exception e) {
                StringBuilder sb2 = new StringBuilder("Could not delete ");
                sb2.append(str);
                sb2.append(" from cache");
                Log.i("AppsFlyer_5.2.0", sb2.toString(), e);
            }
        }
    }
}
