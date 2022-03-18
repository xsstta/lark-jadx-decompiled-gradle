package com.appsflyer.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLibCore;
import com.appsflyer.AppsFlyerProperties;
import java.io.File;
import java.lang.ref.WeakReference;
import java.security.SecureRandom;

/* renamed from: com.appsflyer.internal.ab */
public final class C2004ab {

    /* renamed from: ǃ */
    private static String f6851;

    C2004ab() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0033 A[SYNTHETIC, Splitter:B:20:0x0033] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x004a A[SYNTHETIC, Splitter:B:31:0x004a] */
    /* renamed from: ι */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m8855(java.io.File r6) {
        /*
            java.lang.String r0 = "Exception while trying to close the InstallationFile"
            r1 = 0
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x002a }
            java.lang.String r3 = "r"
            r2.<init>(r6, r3)     // Catch:{ IOException -> 0x002a }
            long r3 = r2.length()     // Catch:{ IOException -> 0x0023, all -> 0x0020 }
            int r6 = (int) r3     // Catch:{ IOException -> 0x0023, all -> 0x0020 }
            byte[] r1 = new byte[r6]     // Catch:{ IOException -> 0x0023, all -> 0x0020 }
            r2.readFully(r1)     // Catch:{ IOException -> 0x0023, all -> 0x0020 }
            r2.close()     // Catch:{ IOException -> 0x0023, all -> 0x0020 }
            r2.close()     // Catch:{ IOException -> 0x001b }
            goto L_0x003c
        L_0x001b:
            r6 = move-exception
            com.appsflyer.AFLogger.afErrorLog(r0, r6)
            goto L_0x003c
        L_0x0020:
            r6 = move-exception
            r1 = r2
            goto L_0x0048
        L_0x0023:
            r6 = move-exception
            r5 = r2
            r2 = r1
            r1 = r5
            goto L_0x002c
        L_0x0028:
            r6 = move-exception
            goto L_0x0048
        L_0x002a:
            r6 = move-exception
            r2 = r1
        L_0x002c:
            java.lang.String r3 = "Exception while reading InstallationFile: "
            com.appsflyer.AFLogger.afErrorLog(r3, r6)     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x003b
            r1.close()     // Catch:{ IOException -> 0x0037 }
            goto L_0x003b
        L_0x0037:
            r6 = move-exception
            com.appsflyer.AFLogger.afErrorLog(r0, r6)
        L_0x003b:
            r1 = r2
        L_0x003c:
            java.lang.String r6 = new java.lang.String
            if (r1 == 0) goto L_0x0041
            goto L_0x0044
        L_0x0041:
            r0 = 0
            byte[] r1 = new byte[r0]
        L_0x0044:
            r6.<init>(r1)
            return r6
        L_0x0048:
            if (r1 == 0) goto L_0x0052
            r1.close()     // Catch:{ IOException -> 0x004e }
            goto L_0x0052
        L_0x004e:
            r1 = move-exception
            com.appsflyer.AFLogger.afErrorLog(r0, r1)
        L_0x0052:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.C2004ab.m8855(java.io.File):java.lang.String");
    }

    /* renamed from: ι */
    public static synchronized String m8856(WeakReference<Context> weakReference) {
        synchronized (C2004ab.class) {
            if (weakReference.get() == null) {
                return f6851;
            }
            if (f6851 == null) {
                String str = null;
                if (weakReference.get() != null) {
                    str = AppsFlyerLibCore.getSharedPreferences(weakReference.get()).getString("AF_INSTALLATION", null);
                }
                if (str != null) {
                    f6851 = str;
                } else {
                    try {
                        File file = new File(weakReference.get().getFilesDir(), "AF_INSTALLATION");
                        if (!file.exists()) {
                            long currentTimeMillis = System.currentTimeMillis();
                            StringBuilder sb = new StringBuilder();
                            sb.append(currentTimeMillis);
                            sb.append("-");
                            sb.append(Math.abs(new SecureRandom().nextLong()));
                            f6851 = sb.toString();
                        } else {
                            f6851 = m8855(file);
                            file.delete();
                        }
                        String str2 = f6851;
                        SharedPreferences.Editor edit = AppsFlyerLibCore.getSharedPreferences(weakReference.get()).edit();
                        edit.putString("AF_INSTALLATION", str2);
                        edit.apply();
                    } catch (Exception e) {
                        AFLogger.afErrorLog("Error getting AF unique ID", e);
                    }
                }
                if (f6851 != null) {
                    AppsFlyerProperties.getInstance().set("uid", f6851);
                }
            }
            return f6851;
        }
    }
}
