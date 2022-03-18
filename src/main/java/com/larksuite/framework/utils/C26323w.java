package com.larksuite.framework.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.larksuite.suite.R;
import com.ss.android.lark.log.Log;

/* renamed from: com.larksuite.framework.utils.w */
public class C26323w {
    /* renamed from: a */
    public static void m95322a(Context context) {
        m95323a(context, 0);
    }

    /* renamed from: b */
    public static void m95328b(Context context) {
        m95329b(context, 0);
    }

    /* renamed from: a */
    public static boolean m95326a(Context context, Class<? extends Activity> cls) {
        return m95327a(context, cls, null);
    }

    /* renamed from: a */
    public static boolean m95325a(Context context, Intent intent) {
        if (!(context == null || intent == null)) {
            try {
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                context.startActivity(intent);
                return true;
            } catch (Exception e) {
                Log.m165383e("NavigationUtils", e.getMessage());
            }
        }
        return false;
    }

    /* renamed from: a */
    public static void m95323a(Context context, int i) {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            if (i == 0) {
                intent.addFlags(268435456);
            } else {
                intent.setFlags(i);
            }
            intent.setData(Uri.fromParts("package", context.getPackageName(), null));
            context.startActivity(intent);
        } catch (Exception e) {
            Log.m165383e("NavigationUtils", e.getMessage());
        }
    }

    /* renamed from: a */
    public static void m95324a(Context context, String str) {
        try {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            Intent createChooser = Intent.createChooser(intent, UIUtils.getString(context, R.string.Lark_Legacy_SelectWebExplorer));
            if (!(context instanceof Activity)) {
                createChooser.addFlags(268435456);
            }
            context.startActivity(createChooser);
        } catch (Exception e) {
            Log.m165383e("NavigationUtils", e.getMessage());
            C26267e.makeText(context, UIUtils.getString(context, R.string.Lark_Legacy_NoWebExplorer), 1).show();
        }
    }

    /* renamed from: b */
    public static void m95329b(Context context, int i) {
        try {
            Intent intent = new Intent();
            if (i != 0) {
                intent.setFlags(i);
            }
            if (Build.VERSION.SDK_INT >= 26) {
                intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                intent.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
            } else if (Build.VERSION.SDK_INT >= 21) {
                intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
                intent.putExtra("app_package", context.getPackageName());
                intent.putExtra("app_uid", context.getApplicationInfo().uid);
            } else {
                intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.addCategory("android.intent.category.DEFAULT");
                intent.setData(Uri.parse("package:" + context.getPackageName()));
            }
            context.startActivity(intent);
        } catch (Exception e) {
            Log.m165383e("NavigationUtils", e.getMessage());
            m95323a(context, i);
        }
    }

    /* renamed from: a */
    public static boolean m95327a(Context context, Class<? extends Activity> cls, Bundle bundle) {
        if (context == null || cls == null) {
            return false;
        }
        Intent intent = new Intent();
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        intent.setClass(context, cls);
        return m95325a(context, intent);
    }
}
