package com.ss.android.lark.guidemgr.p1943c;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.guidemgr.c.a */
public class C38724a {

    /* renamed from: a */
    private static final Map<String, Boolean> f99611a;

    static {
        HashMap hashMap = new HashMap();
        f99611a = hashMap;
        hashMap.put("lark.newguide.switch.im", false);
        hashMap.put("lark.newguide.switch.vc", false);
    }

    /* renamed from: a */
    public static boolean m152937a(String str) {
        Map<String, Boolean> map = f99611a;
        if (map.containsKey(str)) {
            return map.get(str).booleanValue();
        }
        return false;
    }
}
