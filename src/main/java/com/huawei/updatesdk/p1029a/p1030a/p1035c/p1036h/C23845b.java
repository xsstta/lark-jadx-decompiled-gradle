package com.huawei.updatesdk.p1029a.p1030a.p1035c.p1036h;

import android.content.Context;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;
import com.huawei.hms.common.PackageConstants;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.GrsClient;
import com.huawei.updatesdk.p1029a.p1030a.p1032b.p1033a.p1034a.C23834a;
import com.huawei.updatesdk.p1029a.p1030a.p1035c.C23837c;
import com.huawei.updatesdk.p1029a.p1030a.p1035c.C23839e;
import com.huawei.updatesdk.p1046b.p1055f.C23890a;
import com.huawei.updatesdk.service.otaupdate.C23936h;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.huawei.updatesdk.a.a.c.h.b */
public class C23845b {

    /* renamed from: c */
    private static C23845b f59052c = new C23845b();

    /* renamed from: d */
    private static String f59053d = null;

    /* renamed from: a */
    private int f59054a = 0;

    /* renamed from: b */
    private int f59055b = 0;

    private C23845b() {
        if (m87151a("ro.maple.enable", 0) == 1) {
            this.f59054a = 1;
        }
        this.f59055b = m87151a("ro.build.version.ark", 0);
    }

    /* renamed from: a */
    public static int m87151a(String str, int i) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return ((Integer) cls.getMethod("getInt", String.class, Integer.TYPE).invoke(null, str, Integer.valueOf(i))).intValue();
        } catch (Throwable th) {
            C23834a.m87117a("DeviceUtil", "Exception while getting system property: ", th);
            return i;
        }
    }

    /* renamed from: a */
    static String m87152a(Context context) {
        if (f59053d == null) {
            f59053d = C23839e.m87131a(m87159b(context), ",");
        }
        return f59053d;
    }

    /* renamed from: a */
    public static String m87153a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            str = PackageConstants.SERVICES_PACKAGE_APPMARKET;
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 16).versionName + "";
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    /* renamed from: a */
    private static String m87154a(String str) {
        if (str == null) {
            return null;
        }
        try {
            return str.substring(0, str.indexOf(46));
        } catch (Exception e) {
            C23834a.m87118b("DeviceUtil", e.toString());
            return null;
        }
    }

    /* renamed from: a */
    public static String m87155a(String str, String str2) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
        } catch (Throwable th) {
            C23834a.m87117a("DeviceUtil", "Exception while getting system property: ", th);
            return str2;
        }
    }

    /* renamed from: a */
    public static List<String> m87156a(List<String> list, String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!m87157a(str, strArr)) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    static boolean m87157a(String str, String[] strArr) {
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (String str2 : strArr) {
            if (str2.startsWith("config.")) {
                i = 1;
            } else if (!str2.contains(".config.")) {
                i2++;
            }
            if (str2.endsWith("config." + str)) {
                i3++;
            }
        }
        return i + i2 == i3;
    }

    /* renamed from: b */
    public static String m87158b(Context context, String str) {
        String a = m87153a(context, str);
        int i = 0;
        int i2 = 0;
        while (i < a.length() && i2 < 3) {
            if (a.charAt(i) == '.') {
                i2++;
            }
            i++;
        }
        return 3 == i2 ? a.substring(0, i - 1) : a;
    }

    /* renamed from: b */
    private static List<String> m87159b(Context context) {
        ArrayList arrayList = new ArrayList();
        FeatureInfo[] systemAvailableFeatures = context.getPackageManager().getSystemAvailableFeatures();
        if (systemAvailableFeatures != null) {
            for (FeatureInfo featureInfo : systemAvailableFeatures) {
                String str = featureInfo.name;
                if (str != null) {
                    arrayList.add(C23837c.m87126a(str));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    private static DisplayMetrics m87160c(Context context) {
        Display defaultDisplay;
        Object systemService = context.getSystemService("window");
        WindowManager windowManager = systemService instanceof WindowManager ? (WindowManager) systemService : null;
        if (windowManager == null || (defaultDisplay = windowManager.getDefaultDisplay()) == null) {
            return null;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getMetrics(displayMetrics);
        return displayMetrics;
    }

    /* renamed from: c */
    public static String m87161c() {
        try {
            Object obj = Class.forName("com.huawei.system.BuildEx").getField("DISPLAY").get(null);
            return obj == null ? Build.DISPLAY : obj.toString();
        } catch (IllegalAccessException unused) {
            return Build.DISPLAY;
        } catch (NoSuchFieldException unused2) {
            return Build.DISPLAY;
        } catch (ClassNotFoundException unused3) {
            return Build.DISPLAY;
        } catch (Throwable unused4) {
            return Build.DISPLAY;
        }
    }

    /* renamed from: c */
    public static String m87162c(Context context, String str) {
        String str2;
        String a = C23936h.m87510g().mo85875a();
        if (TextUtils.isEmpty(a)) {
            str2 = "UpdateSDK accoutZone is empty, so url is default";
        } else {
            String str3 = null;
            try {
                GrsBaseInfo grsBaseInfo = new GrsBaseInfo();
                grsBaseInfo.setSerCountry(a);
                str3 = new GrsClient(context, grsBaseInfo).synGetGrsUrl(C23936h.m87510g().mo85884e() ? "com.huawei.apptouch.updatesdk" : "com.huawei.updatesdk", "ROOT");
            } catch (Throwable th) {
                Log.w("DeviceUtil", "UpdateSDK Get url from GRS_SDK error: " + th.toString());
            }
            if (TextUtils.isEmpty(str3)) {
                str2 = "UpdateSDK Get url is default url";
            } else {
                Log.i("DeviceUtil", "UpdateSDK Get url from GRS_SDK Success!" + m87154a(str3));
                return str3;
            }
        }
        Log.i("DeviceUtil", str2);
        return str;
    }

    /* renamed from: d */
    public static C23845b m87163d() {
        return f59052c;
    }

    /* renamed from: d */
    public static List<String> m87164d(Context context) {
        ArrayList arrayList = new ArrayList();
        int i = Build.VERSION.SDK_INT;
        Configuration configuration = context.getResources().getConfiguration();
        if (i >= 24) {
            LocaleList locales = configuration.getLocales();
            for (int i2 = 0; i2 < locales.size(); i2++) {
                String language = locales.get(i2).getLanguage();
                if (!TextUtils.isEmpty(language) && !arrayList.contains(language)) {
                    arrayList.add(language);
                }
            }
        } else {
            arrayList.add(configuration.locale.getLanguage());
        }
        return arrayList;
    }

    /* renamed from: e */
    public static String m87165e(Context context) {
        DisplayMetrics c = m87160c(context);
        if (c == null) {
            return "";
        }
        String valueOf = String.valueOf(c.widthPixels);
        String valueOf2 = String.valueOf(c.heightPixels);
        return valueOf + "_" + valueOf2;
    }

    /* renamed from: e */
    public static String[] m87166e() {
        if (Build.VERSION.SDK_INT >= 21) {
            String[] strArr = Build.SUPPORTED_ABIS;
            return strArr == null ? new String[0] : strArr;
        }
        return new String[]{Build.CPU_ABI};
    }

    /* renamed from: f */
    public static String m87167f() {
        String str;
        String str2;
        Locale locale = Locale.getDefault();
        String str3 = "";
        if (locale != null) {
            str = locale.getLanguage();
            if (Build.VERSION.SDK_INT >= 21) {
                str3 = locale.getScript();
            }
            str2 = locale.getCountry();
        } else {
            str = "en";
            str2 = "US";
        }
        if (TextUtils.isEmpty(str3)) {
            return str + "_" + str2;
        }
        return str + "_" + str3 + "_" + str2;
    }

    /* renamed from: f */
    public static String m87168f(Context context) {
        DisplayMetrics c = m87160c(context);
        return c != null ? String.valueOf(c.densityDpi) : "";
    }

    /* renamed from: g */
    public static int m87169g(Context context) {
        try {
            return Integer.parseInt(context.getPackageManager().getPackageInfo(context.getPackageName(), 16).versionCode + "");
        } catch (Exception unused) {
            return 1;
        }
    }

    /* renamed from: g */
    public static boolean m87170g() {
        return "huawei".equalsIgnoreCase(Build.BRAND) || "huawei".equalsIgnoreCase(Build.MANUFACTURER);
    }

    /* renamed from: h */
    public static String m87171h(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 16).versionName + "";
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: i */
    public static boolean m87172i(Context context) {
        PackageManager packageManager = context.getPackageManager();
        try {
            packageManager.getPackageInfo("com.google.android.gsf.login", 16);
            packageManager.getPackageInfo("com.google.android.gsf", 16);
            return (packageManager.getPackageInfo("com.google.android.gms", 16).applicationInfo.flags & 1) != 0;
        } catch (Exception e) {
            C23834a.m87118b("DeviceUtil", e.getMessage());
            return false;
        }
    }

    /* renamed from: a */
    public int mo85573a() {
        return this.f59054a;
    }

    /* renamed from: a */
    public void mo85574a(Window window) {
        if (C23890a.m87353d().mo85685a() >= 21 && window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            try {
                Class<?> cls = Class.forName("com.huawei.android.view.WindowManagerEx$LayoutParamsEx");
                Object newInstance = cls.getConstructor(WindowManager.LayoutParams.class).newInstance(attributes);
                cls.getMethod("setDisplaySideMode", Integer.TYPE).invoke(newInstance, 1);
            } catch (Throwable unused) {
                C23834a.m87118b("DeviceUtil", "setWindowDisplaySideMode: exception");
            }
        }
    }

    /* renamed from: b */
    public int mo85575b() {
        return this.f59055b;
    }
}
