package com.tt.miniapphost.appbase;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tt.miniapphost.appbase.a */
public class C67466a {

    /* renamed from: a */
    private final String f170099a;

    /* renamed from: b */
    private Map<String, Serializable> f170100b = new HashMap();

    /* renamed from: c */
    private Map<String, Object> f170101c = new HashMap();

    /* renamed from: a */
    public String mo234204a() {
        return this.f170099a;
    }

    /* renamed from: b */
    public Map<String, Serializable> mo234206b() {
        return this.f170100b;
    }

    public C67466a(String str) {
        this.f170099a = str;
    }

    /* renamed from: a */
    public void mo234205a(String str, Serializable serializable) {
        this.f170100b.put(str, serializable);
    }
}
