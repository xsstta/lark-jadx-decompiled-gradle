package com.huawei.updatesdk.p1029a.p1030a.p1035c.p1037i;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.updatesdk.p1029a.p1030a.p1032b.p1033a.p1034a.C23834a;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* renamed from: com.huawei.updatesdk.a.a.c.i.b */
public class C23848b {

    /* renamed from: a */
    private static String f59061a = "NetworkUtil";

    /* renamed from: b */
    private static int f59062b = -1;

    /* renamed from: c */
    private static int f59063c = -1;

    /* renamed from: d */
    private static Proxy f59064d;

    /* renamed from: a */
    private static int m87187a(NetworkInfo networkInfo) {
        if (networkInfo != null && networkInfo.isConnected()) {
            int type = networkInfo.getType();
            if (1 == type || 13 == type) {
                return 1;
            }
            if (type == 0) {
                switch (networkInfo.getSubtype()) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                        return 2;
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case HwBuildEx.VersionCodes.EMUI_5_1:
                    case 14:
                    case 15:
                        return 3;
                    case 13:
                        return 4;
                }
            }
        }
        return 0;
    }

    /* renamed from: a */
    private static NetworkInfo m87188a(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null) {
            return null;
        }
        return connectivityManager.getActiveNetworkInfo();
    }

    /* renamed from: a */
    public static Proxy m87189a() {
        return f59064d;
    }

    /* renamed from: a */
    private static void m87190a(int i) {
        f59063c = i;
    }

    /* renamed from: a */
    private static void m87191a(Proxy proxy) {
        f59064d = proxy;
    }

    /* renamed from: a */
    private static boolean m87192a(NetworkInfo networkInfo, Context context) {
        int type = networkInfo.getType();
        boolean f = C23846a.m87181f(context);
        if (type != 0 || !f) {
            return false;
        }
        String host = android.net.Proxy.getHost(context);
        int port = android.net.Proxy.getPort(context);
        Proxy proxy = null;
        if (!(host == null || host.length() <= 0 || port == -1)) {
            proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(host, port));
        }
        m87191a(proxy);
        return true;
    }

    /* renamed from: b */
    public static Proxy m87193b(Context context) {
        if (m87196e(context)) {
            return m87189a();
        }
        return null;
    }

    /* renamed from: c */
    public static int m87194c(Context context) {
        if (-1 == f59062b) {
            C23834a.m87116a(f59061a, "getPsType() need init");
            if (context != null) {
                m87197f(context);
            }
        }
        return f59062b;
    }

    /* renamed from: d */
    public static boolean m87195d(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        return (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isConnected()) ? false : true;
    }

    /* renamed from: e */
    public static boolean m87196e(Context context) {
        if (-1 == f59063c) {
            m87194c(context);
        }
        return f59063c == -3;
    }

    /* renamed from: f */
    private static void m87197f(Context context) {
        m87190a(0);
        NetworkInfo a = m87188a(context);
        if (a == null) {
            C23834a.m87116a(f59061a, "setPsType() info = null");
            return;
        }
        int a2 = m87187a(a);
        f59062b = a2;
        if (1 != a2) {
            m87190a(m87192a(a, context) ? -3 : -2);
        }
    }
}
