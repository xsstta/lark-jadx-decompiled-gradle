package com.ss.android.videoshop.p3203i;

import com.huawei.hms.android.HwBuildEx;

/* renamed from: com.ss.android.videoshop.i.e */
public class C64176e {
    /* renamed from: a */
    public static String m252215a(int i) {
        switch (i) {
            case -1:
                return "SCREEN_ORIENTATION_UNSPECIFIED";
            case 0:
                return "SCREEN_ORIENTATION_LANDSCAPE";
            case 1:
                return "SCREEN_ORIENTATION_PORTRAIT";
            case 2:
                return "SCREEN_ORIENTATION_USER";
            case 3:
                return "SCREEN_ORIENTATION_BEHIND";
            case 4:
                return "SCREEN_ORIENTATION_SENSOR";
            case 5:
                return "SCREEN_ORIENTATION_NOSENSOR";
            case 6:
                return "SCREEN_ORIENTATION_SENSOR_LANDSCAPE";
            case 7:
                return "SCREEN_ORIENTATION_SENSOR_PORTRAIT";
            case 8:
                return "SCREEN_ORIENTATION_REVERSE_LANDSCAPE";
            case 9:
                return "SCREEN_ORIENTATION_REVERSE_PORTRAIT";
            case 10:
                return "SCREEN_ORIENTATION_FULL_SENSOR";
            case 11:
                return "SCREEN_ORIENTATION_USER_LANDSCAPE";
            case HwBuildEx.VersionCodes.EMUI_5_1:
                return "SCREEN_ORIENTATION_USER_PORTRAIT";
            case 13:
                return "SCREEN_ORIENTATION_FULL_USER";
            case 14:
                return "SCREEN_ORIENTATION_LOCKED";
            default:
                return Integer.toString(i);
        }
    }
}
