package com.ss.android.lark.contact.impl.p1760e;

import com.bytedance.lark.pb.basic.v1.Tenant;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.contact.impl.e.e */
public class C35879e {
    /* renamed from: a */
    public static Map<String, String> m140611a(Map<String, Tenant> map) {
        HashMap hashMap = new HashMap();
        if (map == null) {
            return hashMap;
        }
        for (Tenant tenant : map.values()) {
            if (tenant != null) {
                hashMap.put(tenant.id, tenant.name);
            }
        }
        return hashMap;
    }
}
