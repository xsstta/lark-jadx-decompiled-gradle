package com.bytedance.ee.util.p701d;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.ee.log.C13479a;
import java.net.NetworkInterface;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

/* renamed from: com.bytedance.ee.util.d.k */
public class C13631k {
    /* renamed from: a */
    public static boolean m55311a() {
        boolean z;
        int i;
        String str;
        if (Build.VERSION.SDK_INT >= 14) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str = System.getProperty("http.proxyHost");
            String property = System.getProperty("http.proxyPort");
            if (property == null) {
                property = "-1";
            }
            i = Integer.parseInt(property);
        } else {
            str = "";
            i = -1;
        }
        C13479a.m54772d("WifiUtils", "proxyAddress :" + str + "proxyPort :" + i);
        if (TextUtils.isEmpty(str) || i == -1) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m55312b() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            if (networkInterfaces == null) {
                return false;
            }
            Iterator it = Collections.list(networkInterfaces).iterator();
            while (it.hasNext()) {
                NetworkInterface networkInterface = (NetworkInterface) it.next();
                if (networkInterface.isUp()) {
                    if (networkInterface.getInterfaceAddresses().size() != 0) {
                        if ("tun0".equals(networkInterface.getName()) || "ppp0".equals(networkInterface.getName())) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            C13479a.m54761a("WifiUtils", th);
            return false;
        }
    }
}
