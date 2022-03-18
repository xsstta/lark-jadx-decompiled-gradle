package com.huawei.updatesdk.p1046b.p1055f;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.huawei.hms.common.PackageConstants;
import com.huawei.updatesdk.p1029a.p1030a.p1032b.p1033a.p1034a.C23834a;
import com.huawei.updatesdk.p1029a.p1030a.p1035c.AbstractC23838d;
import com.huawei.updatesdk.p1029a.p1039b.p1040a.C23854a;
import com.huawei.updatesdk.p1029a.p1039b.p1041b.C23859c;
import com.huawei.updatesdk.service.otaupdate.C23936h;
import com.ss.android.vc.meeting.framework.statemachine.SmActions;
import java.io.File;
import java.lang.Thread;
import java.lang.reflect.Field;

/* renamed from: com.huawei.updatesdk.b.f.b */
public class C23891b {

    /* renamed from: a */
    private static Integer f59136a;

    /* renamed from: b */
    private static boolean f59137b;

    /* renamed from: c */
    private static boolean f59138c;

    /* renamed from: d */
    private static Field f59139d;

    /* access modifiers changed from: package-private */
    /* renamed from: com.huawei.updatesdk.b.f.b$a */
    public static class C23892a implements Thread.UncaughtExceptionHandler {
        C23892a() {
        }

        public void uncaughtException(Thread thread, Throwable th) {
            C23834a.m87116a("PackageUtils", thread.getName() + " : " + th.getMessage());
        }
    }

    /* renamed from: com.huawei.updatesdk.b.f.b$b */
    public enum EnumC23893b {
        NOT_INSTALLED,
        INSTALLED,
        INSTALLED_LOWCODE
    }

    /* access modifiers changed from: private */
    /* renamed from: com.huawei.updatesdk.b.f.b$c */
    public static class RunnableC23894c implements Runnable {
        private RunnableC23894c() {
        }

        /* synthetic */ RunnableC23894c(C23892a aVar) {
            this();
        }

        public void run() {
            C23834a.m87116a("PackageManagerRunnable", "PackageManagerRunnable run!!!!");
            AbstractC23838d.m87129a(new File(C23859c.m87234b()));
        }
    }

    /* renamed from: a */
    public static int m87355a(PackageInfo packageInfo) {
        ApplicationInfo applicationInfo = packageInfo.applicationInfo;
        if ((applicationInfo.flags & 1) == 0) {
            return 0;
        }
        return m87360a(applicationInfo) ? 1 : 2;
    }

    /* renamed from: a */
    public static int m87356a(String str) {
        ApplicationInfo applicationInfo;
        try {
            PackageInfo packageInfo = C23854a.m87210c().mo85582a().getPackageManager().getPackageInfo(str, SmActions.ACTION_ONTHECALL_EXIT);
            return (packageInfo == null || (applicationInfo = packageInfo.applicationInfo) == null || applicationInfo.metaData == null || !packageInfo.applicationInfo.metaData.containsKey("com.huawei.maple.flag")) ? 0 : 1;
        } catch (Exception unused) {
            C23834a.m87118b("PackageUtils", "getMapleStatus not found: " + str);
            return 0;
        }
    }

    /* renamed from: a */
    public static PackageInfo m87357a(String str, Context context) {
        try {
            return context.getPackageManager().getPackageInfo(str, 64);
        } catch (Exception unused) {
            C23834a.m87118b("PackageUtils", "not found: " + str);
            return null;
        }
    }

    /* renamed from: a */
    public static EnumC23893b m87358a(Context context, String str) {
        EnumC23893b bVar = EnumC23893b.NOT_INSTALLED;
        if (context == null) {
            return bVar;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 0);
            if (packageInfo == null) {
                return bVar;
            }
            Log.i("PackageUtils", "appmarket info," + "versioncode = " + packageInfo.versionCode + "versioncode = " + packageInfo.versionName);
            return packageInfo.versionCode < 70203000 ? EnumC23893b.INSTALLED_LOWCODE : EnumC23893b.INSTALLED;
        } catch (Exception e) {
            C23834a.m87120d("PackageUtils", "isInstallByPackage Exception:" + e.toString());
            return bVar;
        }
    }

    /* renamed from: a */
    public static void m87359a() {
        Thread thread = new Thread(new RunnableC23894c(null));
        new_insert_after_java_lang_Thread_by_knot(thread).setName("delete market file task");
        thread.setUncaughtExceptionHandler(new C23892a());
        thread.start();
    }

    /* renamed from: a */
    private static boolean m87360a(ApplicationInfo applicationInfo) {
        String str;
        StringBuilder sb;
        int i = applicationInfo.flags;
        Integer c = m87363c();
        if (c != null && (i & c.intValue()) != 0) {
            return true;
        }
        Field b = m87362b();
        if (b == null) {
            return false;
        }
        try {
            return (b.getInt(applicationInfo) & 33554432) != 0;
        } catch (IllegalAccessException e) {
            sb = new StringBuilder();
            sb.append("can not get hwflags");
            str = e.toString();
            sb.append(str);
            C23834a.m87116a("PackageUtils", sb.toString());
            return false;
        } catch (IllegalArgumentException e2) {
            sb = new StringBuilder();
            sb.append("can not get hwflags");
            str = e2.toString();
            sb.append(str);
            C23834a.m87116a("PackageUtils", sb.toString());
            return false;
        }
    }

    /* renamed from: b */
    private static int m87361b(Context context, String str) {
        StringBuilder sb;
        String str2;
        if (TextUtils.isEmpty(str)) {
            str = PackageConstants.SERVICES_PACKAGE_APPMARKET;
        }
        try {
            return context.getPackageManager().getPackageInfo(str, 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            sb = new StringBuilder();
            sb.append("isInstallByPackage NameNotFoundException:");
            str2 = e.toString();
            sb.append(str2);
            C23834a.m87120d("PackageUtils", sb.toString());
            return 0;
        } catch (UnsupportedOperationException e2) {
            sb = new StringBuilder();
            sb.append("isInstallByPackage UnsupportedOperationException:");
            str2 = e2.toString();
            sb.append(str2);
            C23834a.m87120d("PackageUtils", sb.toString());
            return 0;
        }
    }

    /* renamed from: b */
    public static Field m87362b() {
        if (f59138c) {
            return f59139d;
        }
        try {
            f59139d = ApplicationInfo.class.getField("hwFlags");
        } catch (NoSuchFieldException unused) {
            C23834a.m87116a("PackageUtils", "can not find hwFlags");
        }
        f59138c = true;
        return f59139d;
    }

    /* renamed from: c */
    public static Integer m87363c() {
        String str;
        StringBuilder sb;
        String str2;
        if (f59137b) {
            return f59136a;
        }
        try {
            Class<?> cls = Class.forName("android.content.pm.PackageParser");
            f59136a = Integer.valueOf(cls.getDeclaredField("PARSE_IS_REMOVABLE_PREINSTALLED_APK").getInt(cls));
        } catch (NoSuchFieldException e) {
            sb = new StringBuilder();
            sb.append("isDelApp error NoSuchFieldException:");
            str2 = e.toString();
        } catch (ClassNotFoundException e2) {
            sb = new StringBuilder();
            sb.append("isDelApp error ClassNotFoundException:");
            str2 = e2.toString();
        } catch (IllegalAccessException e3) {
            sb = new StringBuilder();
            sb.append("isDelApp error IllegalAccessException:");
            str2 = e3.toString();
        } catch (IllegalArgumentException e4) {
            sb = new StringBuilder();
            sb.append("isDelApp error IllegalArgumentException:");
            str2 = e4.toString();
        } catch (Exception e5) {
            str = e5.toString();
            C23834a.m87116a("PackageUtils", str);
            f59137b = true;
            return f59136a;
        }
        f59137b = true;
        return f59136a;
        sb.append(str2);
        str = sb.toString();
        C23834a.m87116a("PackageUtils", str);
        f59137b = true;
        return f59136a;
    }

    /* renamed from: c */
    public static boolean m87364c(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                return context.getPackageManager().getPackageInfo(str, 0) != null;
            } catch (Exception e) {
                C23834a.m87120d("PackageUtils", "isAppInstalled NameNotFoundException:" + e.toString());
            }
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m87365d(Context context, String str) {
        return C23936h.m87510g().mo85884e() || m87361b(context, str) > 90000000;
    }

    /* renamed from: e */
    public static boolean m87366e(Context context, String str) {
        return C23936h.m87510g().mo85884e() || m87361b(context, str) > 100200000;
    }

    public static Thread new_insert_after_java_lang_Thread_by_knot(Thread thread) {
        return C20341a.m74147a() ? new Thread(thread.getThreadGroup(), thread, thread.getName(), (long) C20341a.f49621b) : thread;
    }
}
