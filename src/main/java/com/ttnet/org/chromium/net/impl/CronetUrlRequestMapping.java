package com.ttnet.org.chromium.net.impl;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CronetUrlRequestMapping {
    private static Map<String, CronetUrlRequest> sRequestMapping = new ConcurrentHashMap();

    public static void RemoveRequest(String str) {
        if (!TextUtils.isEmpty(str)) {
            sRequestMapping.remove(str);
        }
    }

    public static CronetUrlRequest GetRequest(String str) {
        if (!TextUtils.isEmpty(str)) {
            return sRequestMapping.get(str);
        }
        return null;
    }

    public static void AddRequest(String str, CronetUrlRequest cronetUrlRequest) {
        if (!TextUtils.isEmpty(str) && cronetUrlRequest != null) {
            sRequestMapping.put(str, cronetUrlRequest);
        }
    }
}
