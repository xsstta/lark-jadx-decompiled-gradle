package com.ss.android.floatbubble.util.p1320c;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.floatbubble.util.c.a */
public class C28470a {
    /* renamed from: b */
    public static void m104327b(Context context) {
        Intent d = m104329d(context);
        d.setFlags(268435456);
        if (d != null) {
            context.startActivity(d);
        }
    }

    /* renamed from: a */
    public static boolean m104325a(Context context) {
        try {
            if (m104330e(context) == 0) {
                return true;
            }
            return false;
        } catch (Exception e) {
            Log.m165383e("VivoFloatPermission", e.getStackTrace().toString());
            return true;
        }
    }

    /* renamed from: d */
    private static Intent m104329d(Context context) {
        List<Intent> c = m104328c(context);
        if (c.isEmpty()) {
            return null;
        }
        for (Intent intent : c) {
            if (m104326a(context, intent)) {
                return intent;
            }
        }
        return null;
    }

    /* renamed from: f */
    private static int m104331f(Context context) {
        String packageName = context.getPackageName();
        Cursor query = context.getContentResolver().query(Uri.parse("content://com.vivo.permissionmanager.provider.permission/float_window_apps"), null, "pkgname = ?", new String[]{packageName}, null);
        if (query != null) {
            if (query.moveToFirst()) {
                int i = query.getInt(query.getColumnIndex("currentmode"));
                query.close();
                return i;
            }
            query.close();
        }
        return 1;
    }

    /* renamed from: c */
    private static List<Intent> m104328c(Context context) {
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
    private static int m104330e(Context context) {
        if (context != null) {
            String packageName = context.getPackageName();
            Cursor query = context.getContentResolver().query(Uri.parse("content://com.iqoo.secure.provider.secureprovider/allowfloatwindowapp"), null, "pkgname = ?", new String[]{packageName}, null);
            if (query == null) {
                return m104331f(context);
            }
            query.getColumnNames();
            if (query.moveToFirst()) {
                int i = query.getInt(query.getColumnIndex("currentlmode"));
                query.close();
                return i;
            }
            query.close();
            return m104331f(context);
        }
        throw new IllegalArgumentException("context is null");
    }

    /* renamed from: a */
    private static boolean m104326a(Context context, Intent intent) {
        if (context.getPackageManager().queryIntentActivities(intent, 4096).size() > 0) {
            return true;
        }
        return false;
    }
}
