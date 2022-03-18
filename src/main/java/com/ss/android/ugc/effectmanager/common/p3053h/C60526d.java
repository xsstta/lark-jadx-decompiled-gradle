package com.ss.android.ugc.effectmanager.common.p3053h;

import android.content.Context;
import android.os.Build;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.android.ugc.effectmanager.common.h.d */
public class C60526d {

    /* renamed from: a */
    private static Map<String, Object> f151326a = new ConcurrentHashMap();

    /* renamed from: b */
    private static final FileFilter f151327b = new FileFilter() {
        /* class com.ss.android.ugc.effectmanager.common.p3053h.C60526d.C605271 */

        public boolean accept(File file) {
            String name = file.getName();
            if (!name.startsWith("cpu")) {
                return false;
            }
            for (int i = 3; i < name.length(); i++) {
                if (!Character.isDigit(name.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
    };

    /* renamed from: com.ss.android.ugc.effectmanager.common.h.d$a */
    public static class C60528a {

        /* renamed from: a */
        public long f151328a;

        /* renamed from: b */
        public long f151329b;

        /* renamed from: a */
        public long mo207234a() {
            return this.f151328a;
        }
    }

    /* renamed from: a */
    public static String m235241a() {
        Object obj = f151326a.get("cache_key_cpu_model");
        if (obj != null) {
            return (String) obj;
        }
        String b = m235244b();
        f151326a.put("cache_key_cpu_model", b);
        return b;
    }

    /* renamed from: b */
    private static synchronized String m235244b() {
        BufferedReader bufferedReader;
        Throwable th;
        Exception e;
        synchronized (C60526d.class) {
            BufferedReader bufferedReader2 = null;
            try {
                if (new File("/proc/cpuinfo").exists()) {
                    bufferedReader = new BufferedReader(new FileReader("/proc/cpuinfo"));
                    while (true) {
                        try {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                bufferedReader2 = bufferedReader;
                                break;
                            } else if (readLine.contains(":")) {
                                String[] split = readLine.split(":");
                                if (split[0].contains("Hardware")) {
                                    String str = split[1];
                                    m235242a(bufferedReader);
                                    return str;
                                }
                            }
                        } catch (Exception e2) {
                            e = e2;
                            try {
                                e.printStackTrace();
                                m235242a(bufferedReader);
                                return Build.HARDWARE;
                            } catch (Throwable th2) {
                                th = th2;
                                m235242a(bufferedReader);
                                throw th;
                            }
                        }
                    }
                }
                m235242a(bufferedReader2);
            } catch (Exception e3) {
                bufferedReader = null;
                e = e3;
                e.printStackTrace();
                m235242a(bufferedReader);
                return Build.HARDWARE;
            } catch (Throwable th3) {
                bufferedReader = null;
                th = th3;
                m235242a(bufferedReader);
                throw th;
            }
            return Build.HARDWARE;
        }
    }

    /* renamed from: a */
    private static void m235242a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: c */
    public static C60528a m235245c(Context context) {
        Object obj = f151326a.get("cache_key_memory_info");
        if (obj != null) {
            return (C60528a) obj;
        }
        C60528a d = m235246d(context);
        f151326a.put("cache_key_memory_info", d);
        return d;
    }

    /* renamed from: d */
    private static C60528a m235246d(Context context) {
        C60528a aVar = new C60528a();
        aVar.f151328a = m235240a(context);
        aVar.f151329b = m235243b(context);
        return aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m235243b(android.content.Context r6) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = -1
            r3 = 16
            if (r0 < r3) goto L_0x001d
            android.app.ActivityManager$MemoryInfo r0 = new android.app.ActivityManager$MemoryInfo     // Catch:{ Exception -> 0x001d }
            r0.<init>()     // Catch:{ Exception -> 0x001d }
            java.lang.String r3 = "activity"
            java.lang.Object r6 = r6.getSystemService(r3)     // Catch:{ Exception -> 0x001d }
            android.app.ActivityManager r6 = (android.app.ActivityManager) r6     // Catch:{ Exception -> 0x001d }
            if (r6 == 0) goto L_0x001d
            r6.getMemoryInfo(r0)     // Catch:{ Exception -> 0x001d }
            long r3 = r0.availMem     // Catch:{ Exception -> 0x001d }
            goto L_0x001e
        L_0x001d:
            r3 = r1
        L_0x001e:
            int r6 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r6 != 0) goto L_0x0048
            r6 = 0
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0045, all -> 0x003d }
            java.lang.String r1 = "/proc/meminfo"
            r0.<init>(r1)     // Catch:{ Exception -> 0x0045, all -> 0x003d }
            java.lang.String r6 = "MemAvailable"
            int r6 = m235238a(r6, r0)     // Catch:{ Exception -> 0x003b, all -> 0x0039 }
            long r1 = (long) r6
            r3 = 1024(0x400, double:5.06E-321)
            long r3 = r3 * r1
            m235242a(r0)
            goto L_0x0048
        L_0x0039:
            r6 = move-exception
            goto L_0x0041
        L_0x003b:
            r6 = r0
            goto L_0x0045
        L_0x003d:
            r0 = move-exception
            r5 = r0
            r0 = r6
            r6 = r5
        L_0x0041:
            m235242a(r0)
            throw r6
        L_0x0045:
            m235242a(r6)
        L_0x0048:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.common.p3053h.C60526d.m235243b(android.content.Context):long");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m235240a(android.content.Context r6) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = -1
            r3 = 16
            if (r0 < r3) goto L_0x001d
            android.app.ActivityManager$MemoryInfo r0 = new android.app.ActivityManager$MemoryInfo     // Catch:{ Exception -> 0x001d }
            r0.<init>()     // Catch:{ Exception -> 0x001d }
            java.lang.String r3 = "activity"
            java.lang.Object r6 = r6.getSystemService(r3)     // Catch:{ Exception -> 0x001d }
            android.app.ActivityManager r6 = (android.app.ActivityManager) r6     // Catch:{ Exception -> 0x001d }
            if (r6 == 0) goto L_0x001d
            r6.getMemoryInfo(r0)     // Catch:{ Exception -> 0x001d }
            long r3 = r0.totalMem     // Catch:{ Exception -> 0x001d }
            goto L_0x001e
        L_0x001d:
            r3 = r1
        L_0x001e:
            int r6 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r6 != 0) goto L_0x0051
            r6 = 0
            java.lang.String r0 = "/proc/meminfo"
            java.io.File r1 = new java.io.File     // Catch:{ Exception -> 0x0046, all -> 0x004a }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0046, all -> 0x004a }
            boolean r1 = r1.exists()     // Catch:{ Exception -> 0x0046, all -> 0x004a }
            if (r1 == 0) goto L_0x0046
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0046, all -> 0x004a }
            r1.<init>(r0)     // Catch:{ Exception -> 0x0046, all -> 0x004a }
            java.lang.String r6 = "MemTotal"
            int r6 = m235238a(r6, r1)     // Catch:{ Exception -> 0x0045, all -> 0x0043 }
            long r2 = (long) r6
            r4 = 1024(0x400, double:5.06E-321)
            long r2 = r2 * r4
            r6 = r1
            r3 = r2
            goto L_0x0046
        L_0x0043:
            r6 = move-exception
            goto L_0x004d
        L_0x0045:
            r6 = r1
        L_0x0046:
            m235242a(r6)
            goto L_0x0051
        L_0x004a:
            r0 = move-exception
            r1 = r6
            r6 = r0
        L_0x004d:
            m235242a(r1)
            throw r6
        L_0x0051:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.common.p3053h.C60526d.m235240a(android.content.Context):long");
    }

    /* renamed from: a */
    public static int m235238a(String str, FileInputStream fileInputStream) {
        byte[] bArr = new byte[1024];
        try {
            int read = fileInputStream.read(bArr);
            int i = 0;
            while (i < read) {
                if (bArr[i] == 10 || i == 0) {
                    if (bArr[i] == 10) {
                        i++;
                    }
                    int i2 = i;
                    while (true) {
                        if (i2 >= read) {
                            continue;
                            break;
                        }
                        int i3 = i2 - i;
                        if (bArr[i2] != str.charAt(i3)) {
                            break;
                        } else if (i3 == str.length() - 1) {
                            return m235239a(bArr, i2);
                        } else {
                            i2++;
                        }
                    }
                }
                i++;
            }
            return -1;
        } catch (IOException | NumberFormatException unused) {
            return -1;
        }
    }

    /* renamed from: a */
    private static int m235239a(byte[] bArr, int i) {
        while (i < bArr.length && bArr[i] != 10) {
            if (Character.isDigit(bArr[i])) {
                int i2 = i + 1;
                while (i2 < bArr.length && Character.isDigit(bArr[i2])) {
                    i2++;
                }
                return Integer.parseInt(new String(bArr, 0, i, i2 - i));
            }
            i++;
        }
        return -1;
    }
}
