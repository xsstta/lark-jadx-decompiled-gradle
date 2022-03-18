package com.ss.ttvideoengine.utils;

import android.content.Context;
import android.content.res.Resources;
import android.provider.Settings;

public class ScreenUtils {
    public static int getScreenHeight() {
        return Resources.getSystem().getDisplayMetrics().heightPixels;
    }

    public static int getScreenPixelDensity() {
        return Resources.getSystem().getDisplayMetrics().densityDpi;
    }

    public static int getScreenWidth() {
        return Resources.getSystem().getDisplayMetrics().widthPixels;
    }

    public static float getNormalizedBrightness(Context context) {
        return (((float) getSystemBrightness(context)) * 1.0f) / 255.0f;
    }

    public static int getSystemBrightness(Context context) {
        try {
            return Settings.System.getInt(context.getContentResolver(), "screen_brightness");
        } catch (Settings.SettingNotFoundException e) {
            e.printStackTrace();
            return 0;
        }
    }
}
