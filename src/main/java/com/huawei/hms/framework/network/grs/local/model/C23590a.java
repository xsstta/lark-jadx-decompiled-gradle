package com.huawei.hms.framework.network.grs.local.model;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.huawei.hms.framework.network.grs.local.model.a */
public class C23590a {

    /* renamed from: a */
    private String f58165a;

    /* renamed from: b */
    private long f58166b;

    /* renamed from: c */
    private Map<String, C23592c> f58167c = new HashMap(16);

    /* renamed from: a */
    public C23592c mo82941a(String str) {
        return this.f58167c.get(str);
    }

    /* renamed from: a */
    public String mo82942a() {
        return this.f58165a;
    }

    /* renamed from: a */
    public void mo82943a(long j) {
        this.f58166b = j;
    }

    /* renamed from: a */
    public void mo82944a(String str, C23592c cVar) {
        this.f58167c.put(str, cVar);
    }

    /* renamed from: b */
    public Map<String, C23592c> mo82945b() {
        return this.f58167c;
    }

    /* renamed from: b */
    public void mo82946b(String str) {
        this.f58165a = str;
    }
}
