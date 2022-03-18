package com.huawei.hms.hatool;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.huawei.hms.hatool.f */
public abstract class AbstractC23601f {

    /* renamed from: com.huawei.hms.hatool.f$a */
    public static class C23602a extends Exception {
        public C23602a(String str) {
            super(str);
        }
    }

    /* renamed from: a */
    public static Object m85690a(Class cls, String str, Class[] clsArr, Object[] objArr) {
        String str2;
        if (cls != null) {
            if (clsArr == null) {
                if (objArr != null) {
                    throw new C23602a("paramsType is null, but params is not null");
                }
            } else if (objArr == null) {
                throw new C23602a("paramsType or params should be same");
            } else if (clsArr.length != objArr.length) {
                throw new C23602a("paramsType len:" + clsArr.length + " should equal params.len:" + objArr.length);
            }
            try {
                try {
                    return cls.getMethod(str, clsArr).invoke(null, objArr);
                } catch (IllegalAccessException unused) {
                    str2 = "invokeStaticFun(): method invoke Exception!";
                    C23625y.m85982f("hmsSdk", str2);
                    return null;
                } catch (IllegalArgumentException unused2) {
                    str2 = "invokeStaticFun(): Illegal Argument!";
                    C23625y.m85982f("hmsSdk", str2);
                    return null;
                } catch (InvocationTargetException unused3) {
                    str2 = "invokeStaticFun(): Invocation Target Exception!";
                    C23625y.m85982f("hmsSdk", str2);
                    return null;
                }
            } catch (NoSuchMethodException unused4) {
                C23625y.m85982f("hmsSdk", "invokeStaticFun(): cls.getMethod(),No Such Method !");
                return null;
            }
        } else {
            throw new C23602a("class is null in invokeStaticFun");
        }
    }

    /* renamed from: a */
    public static Object m85691a(String str, String str2, Class[] clsArr, Object[] objArr) {
        String str3;
        try {
            return m85690a(Class.forName(str), str2, clsArr, objArr);
        } catch (ClassNotFoundException unused) {
            str3 = "invokeStaticFun() Not found class!";
            C23625y.m85982f("hmsSdk", str3);
            return null;
        } catch (C23602a unused2) {
            str3 = "invokeStaticFun(): Static function call Exception ";
            C23625y.m85982f("hmsSdk", str3);
            return null;
        }
    }

    /* renamed from: a */
    public static String m85692a() {
        return m85694a("ro.build.version.emui", "");
    }

    /* renamed from: a */
    public static String m85693a(Context context) {
        return context == null ? "" : Settings.Secure.getString(context.getContentResolver(), "android_id");
    }

    /* renamed from: a */
    public static String m85694a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        String a = m85695a("android.os.SystemProperties", str, str2);
        return TextUtils.isEmpty(a) ? m85695a("com.huawei.android.os.SystemPropertiesEx", str, str2) : a;
    }

    /* renamed from: a */
    public static String m85695a(String str, String str2, String str3) {
        Object a = m85691a(str, "get", new Class[]{String.class, String.class}, new Object[]{str2, str3});
        return a != null ? (String) a : str3;
    }

    /* renamed from: b */
    public static String m85696b() {
        String a = m85695a("com.huawei.android.os.SystemPropertiesEx", "ro.huawei.build.display.id", "");
        C23625y.m85977c("hmsSdk", "SystemPropertiesEx: get rom_ver: " + a);
        if (!TextUtils.isEmpty(a)) {
            return a;
        }
        String str = Build.DISPLAY;
        C23625y.m85977c("hmsSdk", "SystemProperties: get rom_ver: " + str);
        return str;
    }

    /* renamed from: b */
    public static String m85697b(Context context) {
        Object obj;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), SmActions.ACTION_ONTHECALL_EXIT);
            if (applicationInfo == null || applicationInfo.metaData == null || (obj = applicationInfo.metaData.get("CHANNEL")) == null) {
                return "Unknown";
            }
            String obj2 = obj.toString();
            return obj2.length() > 256 ? "Unknown" : obj2;
        } catch (PackageManager.NameNotFoundException unused) {
            C23625y.m85982f("hmsSdk", "getChannel(): The packageName is not correct!");
            return "Unknown";
        }
    }

    /* renamed from: c */
    public static String m85698c(Context context) {
        return context == null ? "" : context.getPackageName();
    }

    /* renamed from: d */
    public static String m85699d(Context context) {
        if (context == null) {
            return "";
        }
        try {
            return context.getPackageManager().getPackageInfo(m85698c(context), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            C23625y.m85982f("hmsSdk", "getVersion(): The package name is not correct!");
            return "";
        }
    }
}
