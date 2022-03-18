package com.bytedance.ttnet.utils;

import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.frameworks.baselib.network.http.util.C14087e;
import com.bytedance.retrofit2.Retrofit;
import com.bytedance.retrofit2.intercept.Interceptor;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.ttnet.utils.d */
public class C20793d {
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0032, code lost:
        if (r2 != null) goto L_0x0027;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m75743a(java.lang.Throwable r3) {
        /*
            r0 = 0
            if (r3 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.io.StringWriter r1 = new java.io.StringWriter     // Catch:{ all -> 0x002d }
            r1.<init>()     // Catch:{ all -> 0x002d }
            java.io.PrintWriter r2 = new java.io.PrintWriter     // Catch:{ all -> 0x002d }
            r2.<init>(r1)     // Catch:{ all -> 0x002d }
            r3.printStackTrace(r2)     // Catch:{ all -> 0x002b }
            java.lang.Throwable r3 = r3.getCause()     // Catch:{ all -> 0x002b }
            if (r3 == 0) goto L_0x0023
            r3.printStackTrace(r2)     // Catch:{ all -> 0x002b }
            java.lang.Throwable r3 = r3.getCause()     // Catch:{ all -> 0x002b }
            if (r3 == 0) goto L_0x0023
            r3.printStackTrace(r2)     // Catch:{ all -> 0x002b }
        L_0x0023:
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x002b }
        L_0x0027:
            r2.close()
            goto L_0x0035
        L_0x002b:
            r3 = move-exception
            goto L_0x002f
        L_0x002d:
            r3 = move-exception
            r2 = r0
        L_0x002f:
            r3.printStackTrace()     // Catch:{ all -> 0x0036 }
            if (r2 == 0) goto L_0x0035
            goto L_0x0027
        L_0x0035:
            return r0
        L_0x0036:
            r3 = move-exception
            if (r2 == 0) goto L_0x003c
            r2.close()
        L_0x003c:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.utils.C20793d.m75743a(java.lang.Throwable):java.lang.String");
    }

    /* renamed from: b */
    public static void m75746b(C14087e<String, Retrofit> eVar, Interceptor interceptor) {
        if (eVar != null && eVar.mo51816b() > 0) {
            Map<String, Retrofit> c = eVar.mo51821c();
            Collection<Retrofit> values = c.values();
            synchronized (c) {
                for (Retrofit retrofit : values) {
                    List<Interceptor> interceptors = retrofit.interceptors();
                    if (interceptors != null) {
                        interceptors.remove(interceptor);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m75744a(C14087e<String, Retrofit> eVar, Interceptor interceptor) {
        if (eVar != null && eVar.mo51816b() > 0) {
            Map<String, Retrofit> c = eVar.mo51821c();
            Collection<Retrofit> values = c.values();
            synchronized (c) {
                for (Retrofit retrofit : values) {
                    List<Interceptor> interceptors = retrofit.interceptors();
                    if (interceptors != null && !interceptors.contains(interceptor)) {
                        interceptors.add(interceptor);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public static void m75747b(String str, List<String> list) {
        if (!(StringUtils.isEmpty(str) || list == null)) {
            String[] split = str.split(",");
            for (String str2 : split) {
                if (!StringUtils.isEmpty(str2) && !m75745a(str2, list)) {
                    list.add(str2.trim());
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m75745a(String str, List<String> list) {
        if (!StringUtils.isEmpty(str) && !Lists.isEmpty(list)) {
            for (String str2 : list) {
                if (!StringUtils.isEmpty(str2) && str.endsWith(str2)) {
                    return true;
                }
            }
        }
        return false;
    }
}
