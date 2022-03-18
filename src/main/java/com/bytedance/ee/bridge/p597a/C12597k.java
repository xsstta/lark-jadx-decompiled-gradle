package com.bytedance.ee.bridge.p597a;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.ee.bridge.a.k */
public class C12597k {

    /* renamed from: a */
    private static Map<String, String> f33737a;

    static {
        HashMap hashMap = new HashMap(4);
        f33737a = hashMap;
        hashMap.put("NB200", "RN JS connect timeout");
        f33737a.put("NB202", "RN JS disconnect");
        f33737a.put("NB201", "JS update data timeout");
        f33737a.put("NB203", "JS message error");
    }

    /* renamed from: a */
    public static String m52300a(String str) {
        return f33737a.get(str);
    }
}
