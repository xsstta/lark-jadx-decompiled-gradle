package com.bytedance.sdk.bytebridge.base.model;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.sdk.bytebridge.base.model.f */
public class C20687f {

    /* renamed from: a */
    private final Map<String, C20685c> f50623a = new ConcurrentHashMap();

    /* renamed from: a */
    public Collection<C20685c> mo69847a() {
        return this.f50623a.values();
    }

    /* renamed from: a */
    public boolean mo69849a(String str) {
        return this.f50623a.containsKey(str);
    }

    /* renamed from: a */
    public void mo69848a(String str, C20685c cVar) {
        try {
            this.f50623a.put(str, cVar);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
