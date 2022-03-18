package com.ss.android.message.p3002a;

import android.app.ActivityManager;
import android.app.AppOpsManager;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.reflect.Reflect;
import com.bytedance.push.utils.C20552c;
import com.huawei.hms.framework.common.ContainerUtils;
import com.ss.android.common.p1317a.C28446a;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.message.a.a */
public class C59436a {

    /* renamed from: a */
    public static String f147549a = ":push";

    /* renamed from: b */
    public static String f147550b = ":pushservice";

    /* renamed from: c */
    public static String f147551c = "huawei";

    /* renamed from: d */
    public static String f147552d = "honor";

    /* renamed from: e */
    public static String f147553e = "xiaomi";

    /* renamed from: f */
    public static String f147554f = "oppo";

    /* renamed from: g */
    public static String f147555g = "vivo";

    /* renamed from: h */
    public static boolean f147556h;

    /* renamed from: i */
    public static boolean f147557i;

    /* renamed from: j */
    private static String f147558j;

    /* renamed from: k */
    private static Boolean f147559k;

    /* renamed from: a */
    public static boolean m230728a() {
        if (Build.DISPLAY.indexOf("Flyme") >= 0 || Build.USER.equals("flyme")) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static String m230735c() {
        if (Build.VERSION.SDK_INT >= 21) {
            return m230739d("ro.build.version.emui");
        }
        return m230737d();
    }

    /* renamed from: e */
    public static boolean m230740e() {
        if (!f147557i) {
            try {
                if (Class.forName("miui.os.Build") != null) {
                    f147556h = true;
                    f147557i = true;
                    return true;
                }
            } catch (Exception unused) {
            }
            f147557i = true;
        }
        return f147556h;
    }

    /* renamed from: b */
    public static boolean m230731b() {
        try {
            if ((StringUtils.isEmpty(Build.BRAND) || !Build.BRAND.toLowerCase().startsWith(f147551c)) && (StringUtils.isEmpty(Build.MANUFACTURER) || !Build.MANUFACTURER.toLowerCase().startsWith(f147551c))) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: g */
    public static boolean m230742g() {
        if (!"angler".equals(Build.BOARD) || Build.MODEL == null || !Build.MODEL.toLowerCase().contains("nexus") || !Build.MODEL.toLowerCase().contains("6p")) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public static String m230737d() {
        try {
            Method declaredMethod = Build.class.getDeclaredMethod("getString", String.class);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(null, "ro.build.version.emui");
            C20552c.m74845a("ToolUtils", "getEMUI: emuiVersion " + invoke);
            if (invoke instanceof String) {
                return (String) invoke;
            }
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    /* renamed from: f */
    public static String m230741f() {
        StringBuilder sb = new StringBuilder();
        try {
            if (m230740e()) {
                sb.append("MIUI-");
            } else if (m230728a()) {
                sb.append("FLYME-");
            } else {
                String c = m230735c();
                if (m230733b(c) && !m230742g()) {
                    sb.append("EMUI-");
                }
                if (!TextUtils.isEmpty(c)) {
                    sb.append(c);
                    sb.append("-");
                }
            }
            sb.append(Build.VERSION.INCREMENTAL);
        } catch (Throwable unused) {
        }
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0069 A[SYNTHETIC, Splitter:B:20:0x0069] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m230743h() {
        /*
        // Method dump skipped, instructions count: 109
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.message.p3002a.C59436a.m230743h():java.lang.String");
    }

    /* renamed from: c */
    public static void m230736c(String str) {
        f147558j = str;
    }

    /* renamed from: d */
    public static String m230738d(Context context) {
        try {
            ComponentName resolveActivity = C28446a.m104266a(context, context.getPackageName()).resolveActivity(context.getPackageManager());
            if (resolveActivity != null) {
                return resolveActivity.getClassName();
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static String m230725a(Context context) {
        String str = f147558j;
        if (!StringUtils.isEmpty(str)) {
            return str;
        }
        try {
            int myPid = Process.myPid();
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == myPid) {
                    if (C20552c.m74848a()) {
                        C20552c.m74845a("Process", "processName = " + runningAppProcessInfo.processName);
                    }
                    String str2 = runningAppProcessInfo.processName;
                    f147558j = str2;
                    return str2;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        String h = m230743h();
        f147558j = h;
        return h;
    }

    /* renamed from: b */
    public static boolean m230732b(Context context) {
        Boolean bool = f147559k;
        if (bool != null) {
            return bool.booleanValue();
        }
        String a = m230725a(context);
        boolean z = false;
        if (a != null && a.contains(":")) {
            return false;
        }
        if (a != null && a.equals(context.getPackageName())) {
            z = true;
        }
        Boolean valueOf = Boolean.valueOf(z);
        f147559k = valueOf;
        return valueOf.booleanValue();
    }

    /* renamed from: b */
    public static boolean m230733b(String str) {
        if (TextUtils.isEmpty(str)) {
            str = m230735c();
        }
        if ((TextUtils.isEmpty(str) || !str.toLowerCase().startsWith("emotionui")) && !m230731b()) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static int m230734c(Context context) {
        if (context == null) {
            return -1;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                return ((Boolean) Reflect.on((NotificationManager) context.getSystemService("notification")).call("areNotificationsEnabled").get()).booleanValue() ? 1 : 0;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            String packageName = context.getApplicationContext().getPackageName();
            int i = applicationInfo.uid;
            Reflect on = Reflect.on((AppOpsManager) context.getSystemService("appops"));
            int intValue = ((Integer) on.field("OP_POST_NOTIFICATION", Integer.TYPE).get()).intValue();
            if (((Integer) on.call("checkOpNoThrow", new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Integer.valueOf(intValue), Integer.valueOf(i), packageName).get()).intValue() == 0) {
                return 1;
            }
            return 0;
        } catch (Throwable th) {
            th.printStackTrace();
            return -1;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005d A[SYNTHETIC, Splitter:B:17:0x005d] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m230739d(java.lang.String r8) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.message.p3002a.C59436a.m230739d(java.lang.String):java.lang.String");
    }

    /* renamed from: a */
    public static boolean m230730a(String str) {
        try {
            if ((StringUtils.isEmpty(Build.BRAND) || !Build.BRAND.toLowerCase().startsWith(str)) && (StringUtils.isEmpty(Build.MANUFACTURER) || !Build.MANUFACTURER.toLowerCase().startsWith(str))) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static String m230726a(String str, List<Pair<String, String>> list) {
        StringBuilder sb = new StringBuilder(str);
        if (str.indexOf(63) < 0) {
            sb.append("?");
        } else {
            sb.append(ContainerUtils.FIELD_DELIMITER);
        }
        sb.append(NetworkUtils.format(list, "UTF-8"));
        return sb.toString();
    }

    /* renamed from: a */
    public static String m230727a(String str, Map<String, String> map) {
        ArrayList arrayList = new ArrayList();
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                arrayList.add(new Pair(entry.getKey(), entry.getValue()));
            }
        }
        return m230726a(str, arrayList);
    }

    /* renamed from: a */
    public static boolean m230729a(Context context, String str) {
        if (context == null || StringUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (context.getPackageManager().getPackageInfo(str, 0) != null) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
