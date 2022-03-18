package com.ss.android.lark.voip.service.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.ss.android.lark.voip.service.impl.c */
public class C58143c {

    /* renamed from: a */
    private static final Map<String, Boolean> f143031a;

    /* renamed from: a */
    public static Set<String> m225527a() {
        return f143031a.keySet();
    }

    static {
        HashMap hashMap = new HashMap();
        f143031a = hashMap;
        hashMap.put("byteview.call.encrypted.android", false);
    }

    /* renamed from: a */
    public static boolean m225528a(String str) {
        return f143031a.get(str).booleanValue();
    }
}
