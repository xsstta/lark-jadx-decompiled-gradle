package com.tt.miniapp.shortcut.p3328a;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;
import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapp.shortcut.C66817a;
import com.tt.miniapphost.AppbrandContext;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: com.tt.miniapp.shortcut.a.c */
public class C66823c {

    /* renamed from: com.tt.miniapp.shortcut.a.c$a */
    public static class C66826a {

        /* renamed from: a */
        public boolean f168581a;

        /* renamed from: b */
        public boolean f168582b;
    }

    /* renamed from: a */
    public static boolean m260735a(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).isRequestPinShortcutSupported();
        }
        if (ContextCompat.checkSelfPermission(context, "com.android.launcher.permission.INSTALL_SHORTCUT") != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private static String m260739b(Context context) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        PackageManager packageManager = context.getPackageManager();
        ResolveInfo resolveActivity = packageManager.resolveActivity(intent, 0);
        if (resolveActivity == null) {
            AppBrandLogger.m52830i("CustomShortcutManagerCompat", "resolveInfo not found");
            return "";
        }
        List<ProviderInfo> queryContentProviders = packageManager.queryContentProviders(resolveActivity.activityInfo.packageName, resolveActivity.activityInfo.applicationInfo.uid, 8);
        if (queryContentProviders == null) {
            AppBrandLogger.m52830i("CustomShortcutManagerCompat", "providerInfoList not found");
            return "";
        }
        for (ProviderInfo providerInfo : queryContentProviders) {
            if (!TextUtils.isEmpty(providerInfo.readPermission) && Pattern.matches(".*launcher.*READ_SETTINGS", providerInfo.readPermission)) {
                return providerInfo.authority;
            }
        }
        return "";
    }

    /* renamed from: a */
    public static C66826a m260732a(Context context, C66817a aVar) {
        C66826a aVar2 = new C66826a();
        if (context == null || aVar == null) {
            AppBrandLogger.m52829e("CustomShortcutManagerCompat", "query params error");
            return aVar2;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            AppBrandLogger.m52829e("CustomShortcutManagerCompat", "should not quey in main thread");
        }
        if (Build.VERSION.SDK_INT >= 25) {
            for (ShortcutInfo shortcutInfo : ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getPinnedShortcuts()) {
                if (TextUtils.equals(shortcutInfo.getId(), aVar.mo232737c())) {
                    aVar2.f168581a = true;
                    PersistableBundle extras = shortcutInfo.getExtras();
                    if (extras != null) {
                        if (!TextUtils.equals(aVar.mo232738d(), extras.getString("key_shortcut_id"))) {
                            aVar2.f168582b = true;
                        }
                    }
                    return aVar2;
                }
            }
        } else {
            m260733a(context, aVar, aVar2);
        }
        return aVar2;
    }

    /* renamed from: a */
    public static boolean m260738a(Context context, String str) {
        if (Build.VERSION.SDK_INT < 25) {
            return false;
        }
        for (ShortcutInfo shortcutInfo : ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getPinnedShortcuts()) {
            if (TextUtils.equals(shortcutInfo.getId(), str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static void m260734a(Context context, String str, String str2) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setComponent(new ComponentName(context.getPackageName(), str2));
        Intent intent2 = new Intent("com.android.launcher.action.UNINSTALL_SHORTCUT");
        intent2.putExtra("android.intent.extra.shortcut.NAME", str);
        intent2.putExtra("android.intent.extra.shortcut.INTENT", intent);
        intent2.putExtra("duplicate", true);
        context.sendBroadcast(intent2);
    }

    /* renamed from: a */
    private static void m260733a(Context context, C66817a aVar, C66826a aVar2) {
        String b = m260739b(context);
        if (TextUtils.isEmpty(b)) {
            AppBrandLogger.m52829e("CustomShortcutManagerCompat", "launcherAuthority not found");
            int i = Build.VERSION.SDK_INT;
            if (i < 8) {
                b = "com.android.launcher.settings";
            } else if (i < 19) {
                b = "com.android.launcher2.settings";
            } else {
                b = "com.android.launcher3.settings";
            }
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("content://");
        stringBuffer.append(b);
        stringBuffer.append("/favorites?notify=true");
        Cursor cursor = null;
        try {
            Uri parse = Uri.parse(stringBuffer.toString());
            cursor = context.getContentResolver().query(parse, null, "title=? ", new String[]{aVar.mo232736b()}, null);
            if (cursor != null && cursor.moveToNext()) {
                aVar2.f168581a = true;
                Intent parseUri = Intent.parseUri(cursor.getString(cursor.getColumnIndex("intent")), 0);
                if (!TextUtils.equals(parseUri.getStringExtra("key_shortcut_id"), aVar.mo232738d())) {
                    aVar2.f168582b = true;
                }
                AppBrandLogger.m52829e("CustomShortcutManagerCompat", "get shortcut intent" + parseUri);
                if (!cursor.isClosed()) {
                    cursor.close();
                }
            }
            if (cursor == null || cursor.isClosed()) {
                return;
            }
        } catch (Exception e) {
            AppBrandLogger.m52829e("CustomShortcutManagerCompat", e);
            if (0 == 0 || cursor.isClosed()) {
                return;
            }
        } catch (Throwable th) {
            if (0 != 0 && !cursor.isClosed()) {
                cursor.close();
            }
            throw th;
        }
        cursor.close();
    }

    /* renamed from: a */
    public static boolean m260736a(Context context, C66820b bVar, final IntentSender intentSender) {
        if (Build.VERSION.SDK_INT >= 26) {
            return ((ShortcutManager) context.getSystemService(ShortcutManager.class)).requestPinShortcut(bVar.mo232747a(), intentSender);
        }
        if (!m260735a(context)) {
            return false;
        }
        Intent a = bVar.mo232746a(new Intent("com.android.launcher.action.INSTALL_SHORTCUT"));
        if (intentSender == null) {
            context.sendBroadcast(a);
            return true;
        }
        context.sendOrderedBroadcast(a, null, new BroadcastReceiver() {
            /* class com.tt.miniapp.shortcut.p3328a.C66823c.C668241 */

            public void onReceive(Context context, Intent intent) {
                try {
                    intentSender.sendIntent(context, 0, null, null, null);
                } catch (IntentSender.SendIntentException unused) {
                }
            }
        }, null, -1, null, null);
        return true;
    }

    /* renamed from: a */
    public static boolean m260737a(final Context context, final C66820b bVar, String str) {
        if (Build.VERSION.SDK_INT >= 25) {
            ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
            if (shortcutManager == null) {
                return false;
            }
            return shortcutManager.updateShortcuts(Collections.singletonList(bVar.mo232747a()));
        }
        m260734a(context, bVar.mo232748b().toString(), str);
        AppbrandContext.getMainHandler().postDelayed(new Runnable() {
            /* class com.tt.miniapp.shortcut.p3328a.C66823c.RunnableC668252 */

            public void run() {
                C66823c.m260736a(context, bVar, (IntentSender) null);
            }
        }, 500);
        return false;
    }
}
