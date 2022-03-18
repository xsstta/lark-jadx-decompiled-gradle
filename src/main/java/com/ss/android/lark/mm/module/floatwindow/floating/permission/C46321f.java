package com.ss.android.lark.mm.module.floatwindow.floating.permission;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import com.ss.android.lark.mm.p2288b.C45855f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.lark.mm.module.floatwindow.floating.permission.f */
public class C46321f {
    /* renamed from: b */
    public static void m183400b(Context context) {
        Intent d = m183402d(context);
        if (d != null) {
            d.setFlags(268435456);
            context.startActivity(d);
        }
    }

    /* renamed from: a */
    public static boolean m183398a(Context context) {
        try {
            if (m183403e(context) == 0) {
                return true;
            }
            return false;
        } catch (Exception e) {
            C45855f.m181666e("VivoFloatPermission", Arrays.toString(e.getStackTrace()));
            return true;
        }
    }

    /* renamed from: d */
    private static Intent m183402d(Context context) {
        List<Intent> c = m183401c(context);
        if (c.isEmpty()) {
            return null;
        }
        for (Intent intent : c) {
            if (m183399a(context, intent)) {
                return intent;
            }
        }
        return null;
    }

    /* renamed from: c */
    private static List<Intent> m183401c(Context context) {
        ArrayList arrayList = new ArrayList();
        Intent intent = new Intent();
        intent.putExtra("packagename", context.getPackageName());
        intent.setComponent(new ComponentName("com.vivo.permissionmanager", "com.vivo.permissionmanager.activity.SoftPermissionDetailActivity"));
        arrayList.add(intent);
        Intent intent2 = new Intent();
        intent2.putExtra("packagename", context.getPackageName());
        intent2.setComponent(new ComponentName("com.iqoo.secure", "com.iqoo.secure.ui.phoneoptimize.FloatWindowManager"));
        arrayList.add(intent2);
        Intent intent3 = new Intent();
        intent3.setComponent(new ComponentName("com.vivo.permissionmanager", "com.vivo.permissionmanager.activity.PurviewTabActivity"));
        arrayList.add(intent3);
        Intent intent4 = new Intent();
        intent4.setComponent(new ComponentName("com.iqoo.secure", "com.iqoo.secure.MainActivity"));
        arrayList.add(intent4);
        Intent intent5 = new Intent();
        intent5.setComponent(new ComponentName("com.iqoo.secure", "com.iqoo.secure.MainGuideActivity"));
        arrayList.add(intent5);
        return arrayList;
    }

    /* renamed from: e */
    private static int m183403e(Context context) {
        if (context != null) {
            String packageName = context.getPackageName();
            Uri parse = Uri.parse("content://com.iqoo.secure.provider.secureprovider/allowfloatwindowapp");
            context.grantUriPermission("com.iqoo.secure.provider.SecureProvider", parse, 1);
            Cursor query = context.getContentResolver().query(parse, null, "pkgname = ?", new String[]{packageName}, null);
            if (query != null) {
                query.getColumnNames();
                if (query.moveToFirst()) {
                    int i = query.getInt(query.getColumnIndex("currentlmode"));
                    query.close();
                    context.revokeUriPermission(parse, 1);
                    return i;
                }
                query.close();
                context.revokeUriPermission(parse, 1);
                return m183404f(context);
            }
            context.revokeUriPermission(parse, 1);
            return m183404f(context);
        }
        throw new IllegalArgumentException("context is null");
    }

    /* renamed from: f */
    private static int m183404f(Context context) {
        String packageName = context.getPackageName();
        Uri parse = Uri.parse("content://com.vivo.permissionmanager.provider.permission/float_window_apps");
        context.grantUriPermission("com.vivo.permissionmanager.provider", parse, 1);
        Cursor query = context.getContentResolver().query(parse, null, "pkgname = ?", new String[]{packageName}, null);
        if (query == null) {
            context.revokeUriPermission(parse, 1);
            return 1;
        } else if (query.moveToFirst()) {
            int i = query.getInt(query.getColumnIndex("currentmode"));
            query.close();
            context.revokeUriPermission(parse, 1);
            return i;
        } else {
            query.close();
            context.revokeUriPermission(parse, 1);
            return 1;
        }
    }

    /* renamed from: a */
    private static boolean m183399a(Context context, Intent intent) {
        if (context.getPackageManager().queryIntentActivities(intent, 4096).size() > 0) {
            return true;
        }
        return false;
    }
}
