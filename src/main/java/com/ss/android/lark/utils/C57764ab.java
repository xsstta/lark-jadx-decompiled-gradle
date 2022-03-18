package com.ss.android.lark.utils;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.view.Display;
import android.view.KeyCharacterMap;
import android.view.ViewConfiguration;
import com.ss.android.lark.log.Log;

/* renamed from: com.ss.android.lark.utils.ab */
public class C57764ab {
    /* renamed from: a */
    public static int m224185a(Context context) {
        Resources resources = context.getResources();
        if (resources != null) {
            return resources.getDimensionPixelSize(resources.getIdentifier("navigation_bar_height", "dimen", "android"));
        }
        Log.m165382e("getNavigationBar Resource failed");
        return -1;
    }

    /* renamed from: a */
    public static boolean m224186a(Activity activity) {
        if (Build.VERSION.SDK_INT >= 17) {
            Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
            Point point = new Point();
            Point point2 = new Point();
            defaultDisplay.getSize(point);
            defaultDisplay.getRealSize(point2);
            if (point2.y != point.y) {
                return true;
            }
            return false;
        }
        boolean hasPermanentMenuKey = ViewConfiguration.get(activity).hasPermanentMenuKey();
        boolean deviceHasKey = KeyCharacterMap.deviceHasKey(4);
        if (hasPermanentMenuKey || deviceHasKey) {
            return false;
        }
        return true;
    }
}
