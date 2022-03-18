package com.bytedance.common.utility;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public final class DeviceUtils {
    private static final Map<String, String> SYSTEM_PROPERTIES_CACHE = new HashMap();
    private static int mIsFoldableScreen = -1;
    private static volatile Properties properties = null;
    private static int sEmuiLevel = -1;

    public static int getScreenHeight(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        int orientation = windowManager.getDefaultDisplay().getOrientation();
        if (orientation == 1 || orientation == 3) {
            return displayMetrics.widthPixels;
        }
        return displayMetrics.heightPixels;
    }

    public static int getScreenWidth(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        int orientation = windowManager.getDefaultDisplay().getOrientation();
        if (orientation == 1 || orientation == 3) {
            return displayMetrics.heightPixels;
        }
        return displayMetrics.widthPixels;
    }
}
