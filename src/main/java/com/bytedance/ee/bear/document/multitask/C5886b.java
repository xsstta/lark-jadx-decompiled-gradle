package com.bytedance.ee.bear.document.multitask;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.document.multitask.b */
public class C5886b {

    /* renamed from: a */
    private static Map<String, ScrollData> f16480a = new HashMap();

    /* renamed from: a */
    public static ScrollData m23684a(String str) {
        ScrollData scrollData = f16480a.get(str);
        if (scrollData != null) {
            return scrollData;
        }
        ScrollData scrollData2 = new ScrollData();
        scrollData2.setToken(str);
        scrollData2.setX(0);
        scrollData2.setY(0);
        return scrollData2;
    }
}
