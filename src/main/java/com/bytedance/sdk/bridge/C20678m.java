package com.bytedance.sdk.bridge;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.sdk.bridge.m */
public class C20678m {

    /* renamed from: a */
    private final Map<String, C20666f> f50534a = new ConcurrentHashMap();

    /* renamed from: a */
    public Collection<C20666f> mo69750a() {
        return this.f50534a.values();
    }

    /* renamed from: a */
    public boolean mo69752a(String str) {
        return this.f50534a.containsKey(str);
    }

    /* renamed from: a */
    public void mo69751a(String str, C20666f fVar) {
        try {
            this.f50534a.put(str, fVar);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
