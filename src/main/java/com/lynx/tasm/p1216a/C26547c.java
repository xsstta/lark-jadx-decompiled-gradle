package com.lynx.tasm.p1216a;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.lynx.tasm.a.c */
public class C26547c extends C26546b {

    /* renamed from: a */
    private Map<String, Object> f65655a = new HashMap();

    @Override // com.lynx.tasm.p1216a.C26546b
    /* renamed from: b */
    public String mo94346b() {
        return "detail";
    }

    @Override // com.lynx.tasm.p1216a.C26546b
    /* renamed from: a */
    public Map<String, Object> mo94345a() {
        return this.f65655a;
    }

    /* renamed from: a */
    public void mo94347a(String str, Object obj) {
        this.f65655a.put(str, obj);
    }

    public C26547c(int i, String str) {
        super(i, str);
    }
}
