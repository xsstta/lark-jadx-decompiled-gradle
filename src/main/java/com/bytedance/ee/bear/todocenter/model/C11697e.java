package com.bytedance.ee.bear.todocenter.model;

import com.bytedance.ee.bear.todocenter.entity.UserEntity;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.ee.bear.todocenter.model.e */
public class C11697e {

    /* renamed from: a */
    private final Map<String, UserEntity> f31483a;

    /* access modifiers changed from: private */
    /* renamed from: com.bytedance.ee.bear.todocenter.model.e$a */
    public static class C11699a {

        /* renamed from: a */
        public static final C11697e f31484a = new C11697e();
    }

    /* renamed from: a */
    public static C11697e m48531a() {
        return C11699a.f31484a;
    }

    private C11697e() {
        this.f31483a = new ConcurrentHashMap();
    }

    /* renamed from: a */
    public void mo44812a(Map<String, UserEntity> map) {
        this.f31483a.putAll(map);
    }

    /* renamed from: a */
    public UserEntity mo44811a(String str) {
        return this.f31483a.get(str);
    }
}
