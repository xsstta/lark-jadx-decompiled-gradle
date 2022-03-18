package com.huawei.secure.android.common.ssl.p1028b;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.hms.common.PackageConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;

/* renamed from: com.huawei.secure.android.common.ssl.b.a */
public class C23816a {

    /* renamed from: a */
    private static final String f58995a = "a";

    /* renamed from: b */
    private static final Uri f58996b = Uri.parse("content://com.huawei.hwid");

    /* renamed from: c */
    private static final String[] f58997c = {"B92825C2BD5D6D6D1E7F39EECD17843B7D9016F611136B75441BC6F4D3F00F05", "E49D5C2C0E11B3B1B96CA56C6DE2A14EC7DAB5CCC3B5F300D03E5B4DBA44F539"};

    private C23816a() {
    }

    /* renamed from: b */
    public static InputStream m87055b(Context context) {
        if (!m87061d(context)) {
            return null;
        }
        m87063f(context);
        try {
            return new FileInputStream(m87062e(context));
        } catch (FileNotFoundException unused) {
            C23821f.m87078d(f58995a, "FileNotFoundExceptio: ");
            return null;
        }
    }

    /* renamed from: e */
    private static String m87062e(Context context) {
        return m87059c(context) + File.separator + "hmsrootcas.bks";
    }

    /* renamed from: a */
    private static int m87050a(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        File file = new File(str);
        if (file.exists()) {
            C23821f.m87077c(f58995a, "The directory  has already exists");
            return 1;
        } else if (file.mkdirs()) {
            C23821f.m87074a(f58995a, "create directory  success");
            return 0;
        } else {
            C23821f.m87078d(f58995a, "create directory  failed");
            return -1;
        }
    }

    /* renamed from: b */
    private static String m87056b(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                sb.append('0');
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    /* renamed from: d */
    private static boolean m87061d(Context context) {
        return new File(m87059c(context) + File.separator + "hmsrootcas.bks").exists();
    }

    /* renamed from: f */
    private static void m87063f(Context context) {
        String str = f58995a;
        C23821f.m87076b(str, "load bks from aegis folder , time is : " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Long.valueOf(C23823h.m87083b("last_update_time", 0, context))));
    }

    /* renamed from: a */
    private static String m87052a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        try {
            return m87056b(MessageDigest.getInstance("SHA-256").digest(bArr));
        } catch (NoSuchAlgorithmException e) {
            String str = f58995a;
            Log.e(str, "NoSuchAlgorithmException" + e.getMessage());
            return "";
        }
    }

    /* renamed from: b */
    private static boolean m87058b(String str) {
        int i;
        int i2;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String str2 = f58995a;
        C23821f.m87076b(str2, "hms version code is : " + str);
        String[] split = str.split("\\.");
        String[] split2 = "4.0.2.300".split("\\.");
        int length = split.length;
        int length2 = split2.length;
        int max = Math.max(length, length2);
        for (int i3 = 0; i3 < max; i3++) {
            if (i3 < length) {
                try {
                    i = Integer.parseInt(split[i3]);
                } catch (Exception e) {
                    String str3 = f58995a;
                    C23821f.m87078d(str3, " exception : " + e.getMessage());
                    if (i3 >= length2) {
                        return true;
                    }
                    return false;
                }
            } else {
                i = 0;
            }
            if (i3 < length2) {
                i2 = Integer.parseInt(split2[i3]);
            } else {
                i2 = 0;
            }
            if (i < i2) {
                return false;
            }
            if (i > i2) {
                return true;
            }
        }
        return true;
    }

    /* renamed from: c */
    private static String m87059c(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return context.createDeviceProtectedStorageContext().getFilesDir() + File.separator + "aegis";
        }
        return context.getApplicationContext().getFilesDir() + File.separator + "aegis";
    }

    /* renamed from: a */
    public static synchronized InputStream m87051a(Context context) {
        synchronized (C23816a.class) {
            String str = f58995a;
            C23821f.m87076b(str, "get bks from tss begin");
            if (context != null) {
                C23818c.m87066a(context);
            }
            Context a = C23818c.m87065a();
            if (a == null) {
                C23821f.m87078d(str, "context is null");
                return null;
            } else if (!C23822g.m87079a("com.huawei.hwid") && !C23822g.m87079a(PackageConstants.SERVICES_PACKAGE_ALL_SCENE)) {
                C23821f.m87078d(str, "hms not exist");
                return null;
            } else if (!m87058b(C23822g.m87080b("com.huawei.hwid")) && !m87058b(C23822g.m87080b(PackageConstants.SERVICES_PACKAGE_ALL_SCENE))) {
                C23821f.m87078d(str, "hms version code is too low : " + C23822g.m87080b("com.huawei.hwid"));
                return null;
            } else if (m87054a(a, "com.huawei.hwid") || m87057b(a, PackageConstants.SERVICES_PACKAGE_ALL_SCENE)) {
                try {
                    InputStream openInputStream = a.getContentResolver().openInputStream(Uri.withAppendedPath(f58996b, "files/hmsrootcas.bks"));
                    long b = C23823h.m87083b("last_update_time", 0, a);
                    long currentTimeMillis = System.currentTimeMillis();
                    if (m87061d(a) && currentTimeMillis - b <= 604800000) {
                        if (b != 0) {
                            C23821f.m87076b(str, "load bks from hms core");
                            return openInputStream;
                        }
                    }
                    C23823h.m87082a("last_update_time", currentTimeMillis, a);
                    m87053a(openInputStream, a);
                    C23821f.m87076b(str, "save last bks and update bks timestamp");
                    if (openInputStream != null) {
                        AbstractC23820e.m87071a(openInputStream);
                    }
                    return m87055b(a);
                } catch (Exception unused) {
                    C23821f.m87078d(f58995a, "Get bks from HMS_VERSION_CODE exception : No content provider");
                    return null;
                }
            } else {
                C23821f.m87078d(str, "hms sign error");
                return null;
            }
        }
    }

    /* renamed from: b */
    private static boolean m87057b(Context context, String str) {
        return "E49D5C2C0E11B3B1B96CA56C6DE2A14EC7DAB5CCC3B5F300D03E5B4DBA44F539".equalsIgnoreCase(m87052a(m87060c(context, str)));
    }

    /* renamed from: a */
    private static boolean m87054a(Context context, String str) {
        byte[] c = m87060c(context, str);
        for (String str2 : f58997c) {
            if (str2.equalsIgnoreCase(m87052a(c))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private static byte[] m87060c(Context context, String str) {
        PackageInfo packageInfo;
        if (context == null || TextUtils.isEmpty(str)) {
            Log.e(f58995a, "packageName is null or context is null");
            return new byte[0];
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (!(packageManager == null || (packageInfo = packageManager.getPackageInfo(str, 64)) == null)) {
                return packageInfo.signatures[0].toByteArray();
            }
        } catch (PackageManager.NameNotFoundException e) {
            String str2 = f58995a;
            Log.e(str2, "PackageManager.NameNotFoundException : " + e.getMessage());
        } catch (Exception e2) {
            String str3 = f58995a;
            Log.e(str3, "get pm exception : " + e2.getMessage());
        }
        return new byte[0];
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004f */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m87053a(java.io.InputStream r5, android.content.Context r6) {
        /*
            if (r5 == 0) goto L_0x005e
            if (r6 != 0) goto L_0x0005
            goto L_0x005e
        L_0x0005:
            java.lang.String r6 = m87059c(r6)
            java.io.File r0 = new java.io.File
            r0.<init>(r6)
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x0017
            m87050a(r6)
        L_0x0017:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "hmsrootcas.bks"
            r0.<init>(r6, r1)
            boolean r6 = r0.exists()
            if (r6 == 0) goto L_0x0027
            r0.delete()
        L_0x0027:
            r6 = 0
            java.lang.String r1 = com.huawei.secure.android.common.ssl.p1028b.C23816a.f58995a     // Catch:{ IOException -> 0x004f }
            java.lang.String r2 = "write output stream "
            com.huawei.secure.android.common.ssl.p1028b.C23821f.m87076b(r1, r2)     // Catch:{ IOException -> 0x004f }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x004f }
            r1.<init>(r0)     // Catch:{ IOException -> 0x004f }
            r6 = 2048(0x800, float:2.87E-42)
            byte[] r0 = new byte[r6]     // Catch:{ IOException -> 0x004b, all -> 0x0048 }
        L_0x0038:
            r2 = 0
            int r3 = r5.read(r0, r2, r6)     // Catch:{ IOException -> 0x004b, all -> 0x0048 }
            r4 = -1
            if (r3 == r4) goto L_0x0044
            r1.write(r0, r2, r3)     // Catch:{ IOException -> 0x004b, all -> 0x0048 }
            goto L_0x0038
        L_0x0044:
            com.huawei.secure.android.common.ssl.p1028b.AbstractC23820e.m87072a(r1)
            goto L_0x0059
        L_0x0048:
            r5 = move-exception
            r6 = r1
            goto L_0x005a
        L_0x004b:
            r6 = r1
            goto L_0x004f
        L_0x004d:
            r5 = move-exception
            goto L_0x005a
        L_0x004f:
            java.lang.String r5 = com.huawei.secure.android.common.ssl.p1028b.C23816a.f58995a     // Catch:{ all -> 0x004d }
            java.lang.String r0 = " IOException"
            com.huawei.secure.android.common.ssl.p1028b.C23821f.m87078d(r5, r0)     // Catch:{ all -> 0x004d }
            com.huawei.secure.android.common.ssl.p1028b.AbstractC23820e.m87072a(r6)
        L_0x0059:
            return
        L_0x005a:
            com.huawei.secure.android.common.ssl.p1028b.AbstractC23820e.m87072a(r6)
            throw r5
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.secure.android.common.ssl.p1028b.C23816a.m87053a(java.io.InputStream, android.content.Context):void");
    }
}
