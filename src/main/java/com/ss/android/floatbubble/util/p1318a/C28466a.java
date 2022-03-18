package com.ss.android.floatbubble.util.p1318a;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.ss.android.lark.log.Log;
import java.util.List;

/* renamed from: com.ss.android.floatbubble.util.a.a */
public class C28466a {

    /* renamed from: a */
    private static String f71602a = "MeizuFloatPermission";

    /* renamed from: a */
    public static void m104308a(Application application) {
        Intent intent = new Intent("com.meizu.safe.security.SHOW_APPSEC");
        intent.setClassName("com.meizu.safe", "com.meizu.safe.security.AppSecActivity");
        intent.putExtra("packageName", application.getPackageName());
        intent.setFlags(268435456);
        if (m104309a(application, intent)) {
            application.startActivity(intent);
            return;
        }
        Log.m165383e(f71602a, "permission setting page not found");
        Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent2.setData(Uri.fromParts("package", application.getPackageName(), null));
        intent2.setFlags(268435456);
        application.startActivity(intent2);
    }

    /* renamed from: a */
    private static boolean m104309a(Context context, Intent intent) {
        List<ResolveInfo> queryIntentActivities;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null || (queryIntentActivities = packageManager.queryIntentActivities(intent, 65536)) == null || queryIntentActivities.size() <= 0) {
            return false;
        }
        return true;
    }
}
