package com.ss.ttvideoengine.utils;

import android.text.TextUtils;

public class TTVideoEngineUtils {
    public static int sEnableHTTPSForFetch = 1;

    public static String BuildHttpsApi(String str) {
        if (sEnableHTTPSForFetch != 1 || TextUtils.isEmpty(str) || !str.startsWith("http://")) {
            return str;
        }
        TTVideoEngineLog.m256505i("TTVideoEngineUtils", "fetch api need replace https");
        return str.replaceFirst("http://", "https://");
    }
}
