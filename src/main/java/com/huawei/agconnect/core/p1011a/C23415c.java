package com.huawei.agconnect.core.p1011a;

import com.huawei.agconnect.core.C23410a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.huawei.agconnect.core.a.c */
public final class C23415c {

    /* renamed from: a */
    private Map<Class<?>, C23410a> f57732a = new HashMap();

    /* renamed from: b */
    private Map<Class<?>, Object> f57733b = new HashMap();

    C23415c(List<C23410a> list) {
        if (list != null) {
            for (C23410a aVar : list) {
                this.f57732a.put(aVar.mo81794a(), aVar);
            }
        }
    }
}
