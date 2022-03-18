package com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.p744a;

import com.bytedance.common.utility.Logger;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.a.d */
public class C14036d {

    /* renamed from: a */
    private static final String f36780a = "d";

    /* renamed from: b */
    private static String f36781b = "2001:4860:4860::8888";

    /* renamed from: c */
    private static AtomicBoolean f36782c = new AtomicBoolean(false);

    /* renamed from: b */
    public static AtomicBoolean m56821b() {
        return f36782c;
    }

    /* renamed from: a */
    public static void m56820a() {
        Logger.m15167d(f36780a, "detectIpv6Reachable");
        f36782c.set(m56822c());
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0042  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean m56822c() {
        /*
            r0 = 0
            r1 = 0
            java.net.DatagramSocket r2 = new java.net.DatagramSocket     // Catch:{ IOException -> 0x003f, all -> 0x0038 }
            r2.<init>()     // Catch:{ IOException -> 0x003f, all -> 0x0038 }
            java.net.InetSocketAddress r1 = new java.net.InetSocketAddress     // Catch:{ IOException -> 0x0036, all -> 0x0033 }
            java.lang.String r3 = com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.p744a.C14036d.f36781b     // Catch:{ IOException -> 0x0036, all -> 0x0033 }
            r4 = 53
            r1.<init>(r3, r4)     // Catch:{ IOException -> 0x0036, all -> 0x0033 }
            r2.connect(r1)     // Catch:{ IOException -> 0x0036, all -> 0x0033 }
            java.net.InetAddress r1 = r2.getLocalAddress()     // Catch:{ IOException -> 0x0036, all -> 0x0033 }
            boolean r3 = r1 instanceof java.net.Inet6Address     // Catch:{ IOException -> 0x0036, all -> 0x0033 }
            if (r3 == 0) goto L_0x002f
            boolean r3 = r1.isLinkLocalAddress()     // Catch:{ IOException -> 0x0036, all -> 0x0033 }
            r3 = r3 ^ 1
            java.lang.String r1 = r1.getHostAddress()     // Catch:{ IOException -> 0x0036, all -> 0x0033 }
            java.lang.String r4 = "2001:0000"
            boolean r1 = r1.startsWith(r4)     // Catch:{ IOException -> 0x0036, all -> 0x0033 }
            if (r1 == 0) goto L_0x002e
            goto L_0x002f
        L_0x002e:
            r0 = r3
        L_0x002f:
            r2.close()
            goto L_0x0045
        L_0x0033:
            r0 = move-exception
            r1 = r2
            goto L_0x0039
        L_0x0036:
            r1 = r2
            goto L_0x0040
        L_0x0038:
            r0 = move-exception
        L_0x0039:
            if (r1 == 0) goto L_0x003e
            r1.close()
        L_0x003e:
            throw r0
        L_0x003f:
        L_0x0040:
            if (r1 == 0) goto L_0x0045
            r1.close()
        L_0x0045:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.ok3.impl.httpdns.p744a.C14036d.m56822c():boolean");
    }
}
