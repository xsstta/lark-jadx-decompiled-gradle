package com.ss.android.lark.mail.impl.p2168g.p2169a;

import com.larksuite.framework.utils.CollectionUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.lark.mail.impl.g.a.w */
public class C42146w<K, S, D> {
    /* renamed from: a */
    public Map<K, D> mo152110a(Map<K, S> map, AbstractC42142s<S, D> sVar) {
        HashMap hashMap = new HashMap();
        if (CollectionUtils.isEmpty(map)) {
            return hashMap;
        }
        for (Map.Entry<K, S> entry : map.entrySet()) {
            if (C42113ab.m168091a(entry.getValue().getClass().getName())) {
                hashMap.put(entry.getKey(), entry.getValue());
            } else {
                hashMap.put(entry.getKey(), sVar.mo152042b(entry.getValue(), null));
            }
        }
        return hashMap;
    }
}
