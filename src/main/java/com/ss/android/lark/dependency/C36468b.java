package com.ss.android.lark.dependency;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.dependency.b */
public class C36468b {

    /* renamed from: a */
    private static final Map<String, Boolean> f94025a;

    /* renamed from: a */
    public static Map<String, Boolean> m143789a() {
        return f94025a;
    }

    static {
        HashMap hashMap = new HashMap();
        f94025a = hashMap;
        hashMap.put("pin.sidebar", true);
        hashMap.put("chat.messageAction", true);
        hashMap.put("chat.groupNotice", true);
        hashMap.put("message.pull", true);
    }
}
