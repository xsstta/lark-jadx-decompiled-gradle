package org.chromium;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Process;
import android.text.TextUtils;
import com.ttnet.org.chromium.net.CronetException;
import com.ttnet.org.chromium.net.NetworkException;
import com.ttnet.org.chromium.net.impl.NetworkExceptionImpl;
import java.io.IOException;
import java.net.ConnectException;
import java.net.NoRouteToHostException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.conn.ConnectTimeoutException;

/* renamed from: org.chromium.f */
public class C70014f {

    /* renamed from: a */
    private static String f174995a;

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0071 A[SYNTHETIC, Splitter:B:20:0x0071] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m268588a() {
        /*
        // Method dump skipped, instructions count: 117
        */
        throw new UnsupportedOperationException("Method not decompiled: org.chromium.C70014f.m268588a():java.lang.String");
    }

    /* renamed from: b */
    public static boolean m268591b(Context context) {
        String c = m268592c(context);
        if ((c == null || !c.contains(":")) && c != null && c.equals(context.getPackageName())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m268590a(Context context) {
        int R = C70010c.m268520a().mo246387R();
        if (C70011d.m268581a().loggerDebug()) {
            C70011d a = C70011d.m268581a();
            a.loggerD("Utils", "CronetAppProvider ProcessFlag: " + R);
        }
        if (R == 1) {
            return true;
        }
        if (R != 2) {
            return m268591b(context);
        }
        return false;
    }

    /* renamed from: a */
    public static int m268585a(int i) {
        switch (i) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            case 9:
                return 9;
            case 10:
                return 10;
            case 11:
                return 11;
            default:
                if (!C70011d.m268581a().loggerDebug()) {
                    return i;
                }
                C70011d a = C70011d.m268581a();
                a.loggerD("monitor", "Unknown error code: " + i);
                return i;
        }
    }

    /* renamed from: c */
    public static String m268592c(Context context) {
        String str = f174995a;
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            int myPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == myPid) {
                    if (C70011d.m268581a().loggerDebug()) {
                        C70011d a = C70011d.m268581a();
                        a.loggerD("Process", "processName = " + runningAppProcessInfo.processName);
                    }
                    String str2 = runningAppProcessInfo.processName;
                    f174995a = str2;
                    return str2;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        String a2 = m268588a();
        f174995a = a2;
        return a2;
    }

    /* renamed from: a */
    public static IOException m268587a(CronetException cronetException) {
        IOException iOException;
        if (!(cronetException instanceof NetworkException)) {
            return cronetException;
        }
        switch (((NetworkException) cronetException).getErrorCode()) {
            case 1:
                iOException = new UnknownHostException(cronetException.getMessage());
                break;
            case 2:
            case 3:
                iOException = new ConnectException(cronetException.getMessage());
                break;
            case 4:
                iOException = new SocketTimeoutException(cronetException.getMessage());
                break;
            case 5:
            case 7:
                iOException = new ConnectException(cronetException.getMessage());
                break;
            case 6:
                iOException = new ConnectTimeoutException(cronetException.getMessage());
                break;
            case 8:
                iOException = new SocketException("reset by peer " + cronetException.getMessage());
                break;
            case 9:
                iOException = new NoRouteToHostException(cronetException.getMessage());
                break;
            default:
                return cronetException;
        }
        return iOException;
    }

    /* renamed from: a */
    public static List m268589a(Class cls) {
        if (cls == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (cls != null) {
            Class<?>[] interfaces = cls.getInterfaces();
            for (int i = 0; i < interfaces.length; i++) {
                if (!arrayList.contains(interfaces[i])) {
                    arrayList.add(interfaces[i]);
                }
                for (Class cls2 : m268589a(interfaces[i])) {
                    if (!arrayList.contains(cls2)) {
                        arrayList.add(cls2);
                    }
                }
            }
            cls = cls.getSuperclass();
        }
        return arrayList;
    }

    /* renamed from: a */
    public static CronetException m268586a(int i, int i2, String str) {
        int a = m268585a(i);
        return new NetworkExceptionImpl("Exception in CronetUrlRequest: " + str, a, i2);
    }
}
