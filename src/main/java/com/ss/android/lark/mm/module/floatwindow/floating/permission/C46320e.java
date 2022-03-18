package com.ss.android.lark.mm.module.floatwindow.floating.permission;

import android.app.AppOpsManager;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import com.ss.android.lark.mm.p2288b.C45855f;
import java.util.List;

/* renamed from: com.ss.android.lark.mm.module.floatwindow.floating.permission.e */
public class C46320e {
    /* renamed from: a */
    public static boolean m183395a(Context context) {
        if (Build.VERSION.SDK_INT >= 19) {
            return m183396a(context, 24);
        }
        if ((context.getApplicationInfo().flags & 134217728) == 134217728) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m183394a(Application application) {
        Intent intent = new Intent("miui.intent.action.APP_PERM_EDITOR");
        intent.setClassName("com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity");
        intent.putExtra("extra_pkgname", application.getPackageName());
        intent.setFlags(268435456);
        if (m183397a(application, intent)) {
            application.startActivity(intent);
            return;
        }
        C45855f.m181666e("MiuiFloatPermmision", "permission setting page not found");
        Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent2.setData(Uri.fromParts("package", application.getPackageName(), null));
        intent2.setFlags(268435456);
        application.startActivity(intent2);
    }

    /* renamed from: a */
    private static boolean m183397a(Context context, Intent intent) {
        List<ResolveInfo> queryIntentActivities;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null || (queryIntentActivities = packageManager.queryIntentActivities(intent, 65536)) == null || queryIntentActivities.size() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m183396a(Context context, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
            try {
                Class.forName(appOpsManager.getClass().getName());
                if (((Integer) appOpsManager.getClass().getDeclaredMethod("checkOp", Integer.TYPE, Integer.TYPE, String.class).invoke(appOpsManager, Integer.valueOf(i), Integer.valueOf(Binder.getCallingUid()), context.getPackageName())).intValue() == 0) {
                    return true;
                }
                return false;
            } catch (Exception e) {
                C45855f.m181663b("MiuiFloatPermmision", "[checkOp] failed: " + e);
            }
        } else {
            C45855f.m181666e("MiuiFloatPermmision", "Below API 19 cannot invoke!");
            return false;
        }
    }
}
