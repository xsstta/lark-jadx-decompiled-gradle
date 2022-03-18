package com.ss.video.rtc.engine.utils;

import android.util.Base64;

public class TokenUtils {
    public static String buildToken(String str, String str2, String str3, String str4) {
        if (str == null || str.isEmpty()) {
            return "Basic " + Base64.encodeToString(String.format("%s:%s:%s", str2, str3, str4).getBytes(), 2);
        } else if (str.contains("Basic")) {
            return str;
        } else {
            return "Bearer " + str;
        }
    }
}
