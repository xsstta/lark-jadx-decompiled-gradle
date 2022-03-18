package com.ss.ugc.effectplatform.util;

import android.content.Context;
import android.os.Build;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ss.ugc.effectplatform.util.e */
public final class C65550e {

    /* renamed from: a */
    private static Map<String, Object> f165094a = new ConcurrentHashMap();

    /* renamed from: com.ss.ugc.effectplatform.util.e$a */
    public static class C65551a {

        /* renamed from: a */
        public long f165095a;

        /* renamed from: b */
        public long f165096b;

        /* renamed from: a */
        public long mo228297a() {
            return this.f165095a;
        }
    }

    /* renamed from: a */
    public static String m257049a() {
        Object obj = f165094a.get("cache_key_cpu_model");
        if (obj != null) {
            return (String) obj;
        }
        String b = m257052b();
        f165094a.put("cache_key_cpu_model", b);
        return b;
    }

    /* renamed from: b */
    private static synchronized String m257052b() {
        BufferedReader bufferedReader;
        Throwable th;
        Exception e;
        synchronized (C65550e.class) {
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
                                    m257050a(bufferedReader);
                                    return str;
                                }
                            }
                        } catch (Exception e2) {
                            e = e2;
                            try {
                                e.printStackTrace();
                                m257050a(bufferedReader);
                                return Build.HARDWARE;
                            } catch (Throwable th2) {
                                th = th2;
                                m257050a(bufferedReader);
                                throw th;
                            }
                        }
                    }
                }
                m257050a(bufferedReader2);
            } catch (Exception e3) {
                bufferedReader = null;
                e = e3;
                e.printStackTrace();
                m257050a(bufferedReader);
                return Build.HARDWARE;
            } catch (Throwable th3) {
                bufferedReader = null;
                th = th3;
                m257050a(bufferedReader);
                throw th;
            }
            return Build.HARDWARE;
        }
    }

    /* renamed from: a */
    private static void m257050a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: c */
    public static C65551a m257053c(Context context) {
        Object obj = f165094a.get("cache_key_memory_info");
        if (obj != null) {
            return (C65551a) obj;
        }
        C65551a d = m257054d(context);
        f165094a.put("cache_key_memory_info", d);
        return d;
    }

    /* renamed from: d */
    private static C65551a m257054d(Context context) {
        C65551a aVar = new C65551a();
        aVar.f165095a = m257048a(context);
        aVar.f165096b = m257051b(context);
        return aVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m257051b(android.content.Context r6) {
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
            int r6 = m257046a(r6, r0)     // Catch:{ Exception -> 0x003b, all -> 0x0039 }
            long r1 = (long) r6
            r3 = 1024(0x400, double:5.06E-321)
            long r3 = r3 * r1
            m257050a(r0)
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
            m257050a(r0)
            throw r6
        L_0x0045:
            m257050a(r6)
        L_0x0048:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.util.C65550e.m257051b(android.content.Context):long");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0022  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long m257048a(android.content.Context r6) {
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
            int r6 = m257046a(r6, r1)     // Catch:{ Exception -> 0x0045, all -> 0x0043 }
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
            m257050a(r6)
            goto L_0x0051
        L_0x004a:
            r0 = move-exception
            r1 = r6
            r6 = r0
        L_0x004d:
            m257050a(r1)
            throw r6
        L_0x0051:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.ugc.effectplatform.util.C65550e.m257048a(android.content.Context):long");
    }

    /* renamed from: a */
    public static int m257046a(String str, FileInputStream fileInputStream) {
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
                            return m257047a(bArr, i2);
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
    private static int m257047a(byte[] bArr, int i) {
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
