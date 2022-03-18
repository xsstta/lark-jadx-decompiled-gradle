package com.bytedance.ee.lark.oryxgadget.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.tt.miniapp.settings.v2.handler.FlutterRenderAppSupportSettingHandler;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class OryxSpUtils {
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd", Locale.CHINA);

    public static boolean hookEnable(Context context) {
        return isEnable(context, "oryx_hook_ex_0a9d032d35497d5938fcd5d45f9546e0");
    }

    public static boolean processCrashEnable(Context context) {
        return isEnable(context, "oryx_process_crash_0a9d032d35497d5938fcd5d45f9546e0");
    }

    public static boolean reflectOryxManagerEnable(Context context) {
        return isEnable(context, "oryx_reflect_oryxmanager_ex_0a9d032d35497d5938fcd5d45f9546e0");
    }

    public static void updateHookExStatus(Context context) {
        updateStatus(context, "oryx_hook_ex_0a9d032d35497d5938fcd5d45f9546e0");
    }

    public static void updateProcessCrashStatus(Context context) {
        updateStatus(context, "oryx_process_crash_0a9d032d35497d5938fcd5d45f9546e0");
    }

    public static void updateReflectOryxManagerStatus(Context context) {
        updateStatus(context, "oryx_reflect_oryxmanager_ex_0a9d032d35497d5938fcd5d45f9546e0");
    }

    public static boolean isForceClose(Context context) {
        if (context == null) {
            return false;
        }
        return context.getSharedPreferences("oryx_sp_0a9d032d35497d5938fcd5d45f9546e0", 0).getBoolean("oryx_force_close_0a9d032d35497d5938fcd5d45f9546e0", false);
    }

    public static boolean isForceOpen(Context context) {
        if (context == null) {
            return false;
        }
        return context.getSharedPreferences("oryx_sp_0a9d032d35497d5938fcd5d45f9546e0", 0).getBoolean("oryx_force_open_0a9d032d35497d5938fcd5d45f9546e0", false);
    }

    public static boolean isOryxFGEnable(Context context) {
        if (context == null) {
            return false;
        }
        return context.getSharedPreferences("oryx_sp_0a9d032d35497d5938fcd5d45f9546e0", 0).getBoolean("oryx_fg_enable_0a9d032d35497d5938fcd5d45f9546e0", false);
    }

    public static boolean isOryxGrepApp(String str) {
        if (!TextUtils.isEmpty(str) && FlutterRenderAppSupportSettingHandler.get().getAppConfig(str) != null) {
            return true;
        }
        return false;
    }

    public static void updateLastOpenOryx(Context context) {
        if (context != null) {
            context.getSharedPreferences("oryx_sp_0a9d032d35497d5938fcd5d45f9546e0", 0).edit().putLong("oryx_last_open_0a9d032d35497d5938fcd5d45f9546e0", System.currentTimeMillis()).apply();
        }
    }

    public static boolean isOryxOverMaxSpan(Context context) {
        if (context != null && Math.abs(context.getSharedPreferences("oryx_sp_0a9d032d35497d5938fcd5d45f9546e0", 0).getLong("oryx_last_open_0a9d032d35497d5938fcd5d45f9546e0", Long.MAX_VALUE) - System.currentTimeMillis()) <= 1296000000) {
            return false;
        }
        return true;
    }

    public static void forceOryxFgEnable(Context context, boolean z) {
        if (context != null) {
            context.getSharedPreferences("oryx_sp_0a9d032d35497d5938fcd5d45f9546e0", 0).edit().putBoolean("oryx_fg_enable_0a9d032d35497d5938fcd5d45f9546e0", z).apply();
        }
    }

    public static void forceClose(Context context, boolean z) {
        if (context != null) {
            context.getSharedPreferences("oryx_sp_0a9d032d35497d5938fcd5d45f9546e0", 0).edit().putBoolean("oryx_force_open_0a9d032d35497d5938fcd5d45f9546e0", false).putBoolean("oryx_force_close_0a9d032d35497d5938fcd5d45f9546e0", z).putBoolean("oryx_fg_enable_0a9d032d35497d5938fcd5d45f9546e0", false).apply();
        }
    }

    public static void forceOpen(Context context, boolean z) {
        if (context != null) {
            context.getSharedPreferences("oryx_sp_0a9d032d35497d5938fcd5d45f9546e0", 0).edit().putBoolean("oryx_force_open_0a9d032d35497d5938fcd5d45f9546e0", z).putBoolean("oryx_force_close_0a9d032d35497d5938fcd5d45f9546e0", false).putBoolean("oryx_fg_enable_0a9d032d35497d5938fcd5d45f9546e0", true).apply();
        }
    }

    private static boolean isEnable(Context context, String str) {
        if (context == null) {
            return false;
        }
        return !DATE_FORMAT.format(new Date()).equals(context.getSharedPreferences("oryx_sp_0a9d032d35497d5938fcd5d45f9546e0", 0).getString(str, ""));
    }

    private static void updateStatus(Context context, String str) {
        if (context != null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("oryx_sp_0a9d032d35497d5938fcd5d45f9546e0", 0);
            String string = sharedPreferences.getString(str, "");
            String format = DATE_FORMAT.format(new Date());
            if (!format.equals(string)) {
                sharedPreferences.edit().putString(str, format).apply();
            }
        }
    }
}
