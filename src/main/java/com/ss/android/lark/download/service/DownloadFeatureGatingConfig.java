package com.ss.android.lark.download.service;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class DownloadFeatureGatingConfig implements Serializable {
    private static final Map<String, Boolean> sFeatureGatingMap;

    public static Map<String, Boolean> getFeatureGatingMap() {
        return sFeatureGatingMap;
    }

    static {
        HashMap hashMap = new HashMap();
        sFeatureGatingMap = hashMap;
        hashMap.put("lark.android.download.usemediascanner", true);
    }
}
