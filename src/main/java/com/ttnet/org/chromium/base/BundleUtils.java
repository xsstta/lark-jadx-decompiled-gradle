package com.ttnet.org.chromium.base;

public class BundleUtils {
    private static final boolean sIsBundle;

    public static boolean isBundle() {
        return sIsBundle;
    }

    static {
        boolean z;
        try {
            Class.forName("org.chromium.base.BundleCanary");
            z = true;
        } catch (ClassNotFoundException unused) {
            z = false;
        }
        sIsBundle = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        if (r0 != null) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
        r2.addSuppressed(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        r1 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String getNativeLibraryPath(java.lang.String r2) {
        /*
            com.ttnet.org.chromium.base.StrictModeContext r0 = com.ttnet.org.chromium.base.StrictModeContext.allowDiskReads()
            android.content.Context r1 = com.ttnet.org.chromium.base.ContextUtils.getApplicationContext()     // Catch:{ all -> 0x0018 }
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch:{ all -> 0x0018 }
            dalvik.system.BaseDexClassLoader r1 = (dalvik.system.BaseDexClassLoader) r1     // Catch:{ all -> 0x0018 }
            java.lang.String r2 = r1.findLibrary(r2)     // Catch:{ all -> 0x0018 }
            if (r0 == 0) goto L_0x0017
            r0.close()
        L_0x0017:
            return r2
        L_0x0018:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x001a }
        L_0x001a:
            r1 = move-exception
            if (r0 == 0) goto L_0x0025
            r0.close()     // Catch:{ all -> 0x0021 }
            goto L_0x0025
        L_0x0021:
            r0 = move-exception
            r2.addSuppressed(r0)
        L_0x0025:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base.BundleUtils.getNativeLibraryPath(java.lang.String):java.lang.String");
    }
}
