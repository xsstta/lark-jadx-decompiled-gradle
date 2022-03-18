package com.bytedance.ee.bear.list;

import java.util.HashMap;

/* renamed from: com.bytedance.ee.bear.list.o */
public class C8639o {

    /* renamed from: a */
    protected String f23405a;

    /* renamed from: b */
    protected String f23406b;

    /* renamed from: c */
    protected HashMap<String, String> f23407c;

    /* renamed from: d */
    protected int f23408d;

    /* renamed from: a */
    public C8638n mo33525a(HashMap<String, String> hashMap) {
        HashMap hashMap2 = new HashMap();
        HashMap<String, String> hashMap3 = this.f23407c;
        if (hashMap3 != null) {
            hashMap2.putAll(hashMap3);
        }
        if (hashMap != null) {
            hashMap2.putAll(hashMap);
        }
        return new C8638n(this.f23405a, this.f23406b, hashMap2, this.f23408d);
    }

    public C8639o(String str, String str2, HashMap<String, String> hashMap, int i) {
        this.f23405a = str;
        this.f23406b = str2;
        this.f23407c = hashMap;
        this.f23408d = i;
    }
}
