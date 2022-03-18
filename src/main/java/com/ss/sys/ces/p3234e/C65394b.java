package com.ss.sys.ces.p3234e;

import java.io.File;
import java.io.FileFilter;
import java.util.HashMap;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* renamed from: com.ss.sys.ces.e.b */
public class C65394b {

    /* renamed from: a */
    private static final FileFilter f164656a = new C65395a();

    /* renamed from: com.ss.sys.ces.e.b$a */
    class C65395a implements FileFilter {
        C65395a() {
        }

        public boolean accept(File file) {
            return Pattern.matches("cpu[0-9]", file.getName());
        }
    }

    /* renamed from: a */
    private static int m256458a() {
        try {
            return new File("/sys/devices/system/cpu/").listFiles(f164656a).length;
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0020, code lost:
        if (r1 == null) goto L_0x0027;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0022 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x001b A[SYNTHETIC, Splitter:B:15:0x001b] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m256459a(java.lang.String r2) {
        /*
            r0 = 0
            java.io.FileReader r1 = new java.io.FileReader     // Catch:{ all -> 0x0017 }
            r1.<init>(r2)     // Catch:{ all -> 0x0017 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x0015 }
            r2.<init>(r1)     // Catch:{ all -> 0x0015 }
            java.lang.String r0 = r2.readLine()     // Catch:{ all -> 0x0013 }
            r2.close()     // Catch:{ all -> 0x0022 }
            goto L_0x0022
        L_0x0013:
            goto L_0x0019
        L_0x0015:
            r2 = r0
            goto L_0x0019
        L_0x0017:
            r2 = r0
            r1 = r2
        L_0x0019:
            if (r2 == 0) goto L_0x0020
            r2.close()     // Catch:{ all -> 0x001f }
            goto L_0x0020
        L_0x001f:
        L_0x0020:
            if (r1 == 0) goto L_0x0027
        L_0x0022:
            r1.close()     // Catch:{ all -> 0x0026 }
            goto L_0x0027
        L_0x0026:
        L_0x0027:
            if (r0 != 0) goto L_0x002c
            java.lang.String r2 = "0"
            goto L_0x0030
        L_0x002c:
            java.lang.String r2 = r0.trim()
        L_0x0030:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.sys.ces.p3234e.C65394b.m256459a(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    private static String m256460a(HashMap<String, String> hashMap, String str) {
        String str2;
        try {
            str2 = hashMap.get(str);
        } catch (Throwable unused) {
            str2 = null;
        }
        return str2 == null ? "" : str2.trim();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:8|9|25|26|27) */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004c, code lost:
        if (r2 == null) goto L_0x0051;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x004e */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0047 A[SYNTHETIC, Splitter:B:21:0x0047] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.HashMap<java.lang.String, java.lang.String> m256461b() {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1 = 0
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ all -> 0x0044 }
            java.lang.String r3 = "/proc/cpuinfo"
            r2.<init>(r3)     // Catch:{ all -> 0x0044 }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ all -> 0x0042 }
            r3.<init>(r2)     // Catch:{ all -> 0x0042 }
        L_0x0012:
            java.lang.String r1 = r3.readLine()     // Catch:{ all -> 0x0040 }
            if (r1 != 0) goto L_0x001c
            r3.close()     // Catch:{ all -> 0x004e }
            goto L_0x004e
        L_0x001c:
            java.lang.String r4 = ":"
            r5 = 2
            java.lang.String[] r1 = r1.split(r4, r5)
            int r4 = r1.length
            if (r4 >= r5) goto L_0x0027
            goto L_0x0012
        L_0x0027:
            r4 = 0
            r4 = r1[r4]
            java.lang.String r4 = r4.trim()
            r5 = 1
            r1 = r1[r5]
            java.lang.String r1 = r1.trim()
            java.lang.Object r5 = r0.get(r4)
            if (r5 == 0) goto L_0x003c
            goto L_0x0012
        L_0x003c:
            r0.put(r4, r1)
            goto L_0x0012
        L_0x0040:
            r1 = r3
            goto L_0x0045
        L_0x0042:
            goto L_0x0045
        L_0x0044:
            r2 = r1
        L_0x0045:
            if (r1 == 0) goto L_0x004c
            r1.close()     // Catch:{ all -> 0x004b }
            goto L_0x004c
        L_0x004b:
        L_0x004c:
            if (r2 == 0) goto L_0x0051
        L_0x004e:
            r2.close()     // Catch:{ all -> 0x0051 }
        L_0x0051:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.sys.ces.p3234e.C65394b.m256461b():java.util.HashMap");
    }

    /* renamed from: c */
    public static String m256462c() {
        JSONObject jSONObject = new JSONObject();
        try {
            HashMap<String, String> b = m256461b();
            jSONObject.put("core", m256458a());
            jSONObject.put("hw", m256460a(b, "Hardware"));
            jSONObject.put("max", m256459a("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq"));
            jSONObject.put("min", m256459a("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_min_freq"));
            jSONObject.put("ft", m256460a(b, "Features"));
        } catch (Throwable unused) {
        }
        String jSONObject2 = jSONObject.toString();
        return jSONObject2 == null ? "{}" : jSONObject2.trim();
    }
}
