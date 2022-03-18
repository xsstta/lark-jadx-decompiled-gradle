package com.tt.miniapp.shortcut;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;

/* renamed from: com.tt.miniapp.shortcut.c */
public class C66844c {

    /* renamed from: a */
    private static final String f168610a = Build.MANUFACTURER.toLowerCase();

    /* renamed from: a */
    public static String m260773a() {
        String str = f168610a;
        if (str.contains("huawei")) {
            return "huawei";
        }
        if (str.contains("xiaomi")) {
            return "xiaomi";
        }
        if (str.contains("oppo")) {
            return "oppo";
        }
        if (str.contains("vivo")) {
            return "vivo";
        }
        return "other";
    }

    /* renamed from: b */
    private static Intent m260777b(Context context) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", context.getPackageName(), null));
        return intent;
    }

    /* renamed from: c */
    private static Intent m260778c(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.huawei.systemmanager", "com.huawei.permissionmanager.ui.MainActivity"));
        return intent;
    }

    /* renamed from: e */
    private static Intent m260780e(Context context) {
        Intent intent = new Intent();
        intent.putExtra("packagename", context.getPackageName());
        intent.setComponent(new ComponentName("com.vivo.permissionmanager", "com.vivo.permissionmanager.activity.SoftPermissionDetailActivity"));
        if (m260776a(context, intent)) {
            return intent;
        }
        intent.setComponent(new ComponentName("com.iqoo.secure", "com.iqoo.secure.safeguard.SoftPermissionDetailActivity"));
        return intent;
    }

    /* renamed from: f */
    private static Intent m260781f(Context context) {
        Intent intent = new Intent();
        intent.putExtra("packageName", context.getPackageName());
        intent.setClassName("com.oppo.launcher", "com.oppo.launcher.shortcut.ShortcutSettingsActivity");
        if (m260776a(context, intent)) {
            return intent;
        }
        intent.setComponent(new ComponentName("com.color.safecenter", "com.color.safecenter.permission.PermissionManagerActivity"));
        return intent;
    }

    /* renamed from: g */
    private static Intent m260782g(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return m260777b(context);
        }
        Intent intent = new Intent("com.meizu.safe.security.SHOW_APPSEC");
        intent.putExtra("packageName", context.getPackageName());
        intent.setComponent(new ComponentName("com.meizu.safe", "com.meizu.safe.security.AppSecActivity"));
        return intent;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003d A[SYNTHETIC, Splitter:B:16:0x003d] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m260774a(java.lang.String r4) {
        /*
            r0 = 0
            java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch:{ IOException -> 0x0039 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0039 }
            r2.<init>()     // Catch:{ IOException -> 0x0039 }
            java.lang.String r3 = "getprop "
            r2.append(r3)     // Catch:{ IOException -> 0x0039 }
            r2.append(r4)     // Catch:{ IOException -> 0x0039 }
            java.lang.String r4 = r2.toString()     // Catch:{ IOException -> 0x0039 }
            java.lang.Process r4 = r1.exec(r4)     // Catch:{ IOException -> 0x0039 }
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0039 }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0039 }
            java.io.InputStream r4 = r4.getInputStream()     // Catch:{ IOException -> 0x0039 }
            r2.<init>(r4)     // Catch:{ IOException -> 0x0039 }
            r4 = 1024(0x400, float:1.435E-42)
            r1.<init>(r2, r4)     // Catch:{ IOException -> 0x0039 }
            java.lang.String r4 = r1.readLine()     // Catch:{ IOException -> 0x0035, all -> 0x0032 }
            r1.close()     // Catch:{ IOException -> 0x0031 }
        L_0x0031:
            return r4
        L_0x0032:
            r4 = move-exception
            r0 = r1
            goto L_0x0041
        L_0x0035:
            r0 = r1
            goto L_0x0039
        L_0x0037:
            r4 = move-exception
            goto L_0x0041
        L_0x0039:
            java.lang.String r4 = ""
            if (r0 == 0) goto L_0x0040
            r0.close()     // Catch:{ IOException -> 0x0040 }
        L_0x0040:
            return r4
        L_0x0041:
            if (r0 == 0) goto L_0x0046
            r0.close()     // Catch:{ IOException -> 0x0046 }
        L_0x0046:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tt.miniapp.shortcut.C66844c.m260774a(java.lang.String):java.lang.String");
    }

    /* renamed from: d */
    private static Intent m260779d(Context context) {
        String a = m260774a("ro.miui.ui.version.name");
        if (TextUtils.isEmpty(a) || a.contains("V7") || a.contains("V8")) {
            Intent intent = new Intent("miui.intent.action.APP_PERM_EDITOR");
            intent.putExtra("extra_pkgname", context.getPackageName());
            return intent;
        } else if (!TextUtils.isEmpty(a) && !a.contains("V9") && !a.contains("V10") && !a.contains("V11")) {
            return m260777b(context);
        } else {
            Intent intent2 = new Intent("miui.intent.action.APP_PERM_EDITOR");
            intent2.setComponent(new ComponentName("com.miui.securitycenter", "com.miui.permcenter.permissions.PermissionsEditorActivity"));
            intent2.putExtra("extra_pkgname", context.getPackageName());
            return intent2;
        }
    }

    /* renamed from: a */
    public static void m260775a(Context context) {
        Intent intent;
        String str = f168610a;
        if (str.contains("huawei")) {
            intent = m260778c(context);
        } else if (str.contains("xiaomi")) {
            intent = m260779d(context);
        } else if (str.contains("oppo")) {
            intent = m260781f(context);
        } else if (str.contains("vivo")) {
            intent = m260780e(context);
        } else if (str.contains("meizu")) {
            intent = m260782g(context);
        } else {
            intent = m260777b(context);
        }
        if (intent != null) {
            try {
                intent.putExtra("start_only_for_android", true);
            } catch (Exception e) {
                AppBrandLogger.m52829e("ShortcutPermissionUtil", e);
                context.startActivity(m260777b(context));
                return;
            }
        }
        context.startActivity(intent);
    }

    /* renamed from: a */
    private static boolean m260776a(Context context, Intent intent) {
        if (context.getPackageManager().queryIntentActivities(intent, 65536).size() > 0) {
            return true;
        }
        return false;
    }
}
