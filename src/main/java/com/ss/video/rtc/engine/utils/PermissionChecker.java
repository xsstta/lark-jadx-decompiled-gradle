package com.ss.video.rtc.engine.utils;

import androidx.core.content.ContextCompat;
import com.ss.video.rtc.base.utils.RtcContextUtils;

public class PermissionChecker {
    public static boolean checkAudioPermission() {
        if (ContextCompat.checkSelfPermission(RtcContextUtils.getApplicationContext(), "android.permission.RECORD_AUDIO") == 0) {
            return true;
        }
        return false;
    }

    public static boolean checkCameraPermission() {
        if (ContextCompat.checkSelfPermission(RtcContextUtils.getApplicationContext(), "android.permission.CAMERA") == 0) {
            return true;
        }
        return false;
    }
}
