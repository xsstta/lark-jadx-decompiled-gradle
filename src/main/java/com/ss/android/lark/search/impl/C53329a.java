package com.ss.android.lark.search.impl;

import com.ss.android.lark.log.Log;
import com.ss.android.lark.search.C53258a;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.search.impl.a */
public class C53329a {

    /* renamed from: a */
    private static final Map<String, Boolean> f131826a;

    /* renamed from: a */
    public static Map<String, Boolean> m206411a() {
        return f131826a;
    }

    static {
        HashMap hashMap = new HashMap();
        f131826a = hashMap;
        hashMap.put("leanMode", false);
    }

    /* renamed from: b */
    public static boolean m206412b() {
        boolean isAppConfigFeatureOn = C53258a.m205939a().mo181770s().isAppConfigFeatureOn("leanMode");
        Log.m165379d("LarkSearch.Search.SearchAppConfig", "leanMode: " + isAppConfigFeatureOn);
        return isAppConfigFeatureOn;
    }
}
