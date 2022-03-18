package com.tt.miniapp.permission;

import android.app.Activity;
import android.app.AppOpsManager;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Process;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapp.util.C67043j;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: com.tt.miniapp.permission.f */
public class C66584f {
    /* renamed from: a */
    private static void m260173a(Intent intent) {
        intent.setAction("android.intent.action.MAIN");
        intent.setClassName("com.android.settings", "com.android.settings.ManageApplications");
    }

    /* renamed from: a */
    public static void m260172a(Activity activity) {
        if (activity != null) {
            Intent intent = new Intent();
            String packageName = activity.getPackageName();
            boolean z = false;
            if (C67043j.m261284f()) {
                intent.setAction("miui.intent.action.APP_PERM_EDITOR");
                intent.putExtra("extra_pkgname", packageName);
                intent.putExtra("extra_package_uid", Process.myUid());
                z = true;
            } else {
                m260174a(intent, packageName);
            }
            if (m260176a(intent, activity)) {
                return;
            }
            if (z) {
                m260174a(intent, packageName);
                if (!m260176a(intent, activity)) {
                    m260173a(intent);
                    m260176a(intent, activity);
                    return;
                }
                return;
            }
            m260173a(intent);
            m260176a(intent, activity);
        }
    }

    /* renamed from: a */
    private static boolean m260176a(Intent intent, Activity activity) {
        try {
            activity.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m260175a(Context context, String str) {
        if (Build.VERSION.SDK_INT >= 19) {
            return m260177b(context, str);
        }
        return m260178c(context, str);
    }

    /* renamed from: c */
    private static boolean m260178c(Context context, String str) {
        if (context.getPackageManager().checkPermission(str, context.getPackageName()) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static void m260174a(Intent intent, String str) {
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package://" + str));
        intent.putExtra("package", str);
        intent.setClassName("com.android.settings", "com.android.settings.applications.InstalledAppDetails");
    }

    /* renamed from: b */
    private static boolean m260177b(Context context, String str) {
        String str2;
        boolean z = false;
        try {
            if ("android.permission.ACCESS_COARSE_LOCATION".equals(str)) {
                str2 = "COARSE_LOCATION";
            } else if ("android.permission.ACCESS_FINE_LOCATION".equals(str)) {
                str2 = "FINE_LOCATION";
            } else {
                str2 = str.replaceFirst("android.permission.", "");
            }
            AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 1);
            Field field = AppOpsManager.class.getField("OP_" + str2);
            Method declaredMethod = AppOpsManager.class.getDeclaredMethod("checkOp", Integer.TYPE, Integer.TYPE, String.class);
            declaredMethod.setAccessible(true);
            int intValue = ((Integer) declaredMethod.invoke(appOpsManager, Integer.valueOf(field.getInt(appOpsManager)), Integer.valueOf(packageInfo.applicationInfo.uid), packageInfo.packageName)).intValue();
            if (!(intValue == 2 || intValue == 1 || intValue == 4)) {
                z = true;
            }
            return z;
        } catch (Exception e) {
            AppBrandLogger.m52829e("MIUIPermissionUtils", "权限检查出错时默认返回有权限，异常代码：", e);
            return true;
        }
    }
}
