package org.webrtc;

import android.os.Build;

public class GlReleaseThreadByPass {
    public static boolean isEglReleaseThreadByPass() {
        if (Build.VERSION.SDK_INT > 18 || !"samsung".equalsIgnoreCase(Build.MANUFACTURER) || Build.MODEL == null) {
            return false;
        }
        if (Build.MODEL.contains("SM-N") || Build.MODEL.contains("GT-N")) {
            return true;
        }
        return false;
    }
}
