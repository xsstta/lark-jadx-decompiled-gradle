package com.ttnet.org.chromium.base;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import java.io.File;

public final class CommandLineInitUtil {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    private CommandLineInitUtil() {
    }

    public static void initCommandLine(String str) {
        initCommandLine(str, null);
    }

    private static String getDebugAppJBMR1(Context context) {
        boolean z = false;
        if (Settings.Global.getInt(context.getContentResolver(), "adb_enabled", 0) == 1) {
            z = true;
        }
        if (z) {
            return Settings.Global.getString(context.getContentResolver(), "debug_app");
        }
        return null;
    }

    private static String getDebugAppPreJBMR1(Context context) {
        boolean z = false;
        if (Settings.System.getInt(context.getContentResolver(), "adb_enabled", 0) == 1) {
            z = true;
        }
        if (z) {
            return Settings.System.getString(context.getContentResolver(), "debug_app");
        }
        return null;
    }

    private static boolean shouldUseDebugCommandLine(Supplier<Boolean> supplier) {
        String str;
        if (supplier != null && supplier.get().booleanValue()) {
            return true;
        }
        Context applicationContext = ContextUtils.getApplicationContext();
        if (Build.VERSION.SDK_INT < 17) {
            str = getDebugAppPreJBMR1(applicationContext);
        } else {
            str = getDebugAppJBMR1(applicationContext);
        }
        if (applicationContext.getPackageName().equals(str) || BuildInfo.isDebugAndroid()) {
            return true;
        }
        return false;
    }

    public static void initCommandLine(String str, Supplier<Boolean> supplier) {
        File file = new File("/data/local/tmp", str);
        if (!file.exists() || !shouldUseDebugCommandLine(supplier)) {
            file = new File("/data/local", str);
        }
        CommandLine.initFromFile(file.getPath());
    }
}
