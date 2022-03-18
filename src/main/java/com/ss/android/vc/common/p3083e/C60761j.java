package com.ss.android.vc.common.p3083e;

import com.alibaba.fastjson.JSON;
import com.larksuite.framework.utils.C26284k;
import com.ss.android.vc.dependency.ar;
import com.ss.android.vc.p3088d.p3090b.C60871a;

/* renamed from: com.ss.android.vc.common.e.j */
public class C60761j {
    /* renamed from: a */
    public static String m236097a(Object obj) {
        if (obj != null) {
            return JSON.toJSONString(obj);
        }
        return "{}";
    }

    /* renamed from: a */
    public static void m236098a(String str, Object obj) {
        if (C26284k.m95185a(ar.m236694a())) {
            m236099b(str, obj);
        }
    }

    /* renamed from: b */
    public static void m236099b(String str, Object obj) {
        String str2;
        if (obj != null) {
            String str3 = "{\"" + obj.getClass().getCanonicalName() + "\":" + m236097a(obj) + "}";
            if (str3.length() < 3000) {
                C60871a.m236611b(str, str3);
                return;
            }
            int i = 0;
            while (i < str3.length()) {
                int i2 = i + 3000;
                if (str3.length() <= i2) {
                    str2 = str3.substring(i);
                } else {
                    str2 = str3.substring(i, i2);
                }
                C60871a.m236611b(str, str2);
                i = i2;
            }
            return;
        }
        C60871a.m236611b(str, "{}");
    }
}
