package com.bytedance.ee.bear.drive.loader.download.model;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.drive.loader.download.model.a */
public final class C7007a {

    /* renamed from: a */
    public static final C7007a f18937a = new C7007a(0, new HashMap());

    /* renamed from: b */
    private final int f18938b;

    /* renamed from: c */
    private final Map<String, String> f18939c;

    /* renamed from: a */
    public Map<String, String> mo27540a() {
        return this.f18939c;
    }

    public String toString() {
        return "Content{type=" + this.f18938b + ", transcodeUrls=" + this.f18939c + '}';
    }

    public C7007a(int i, Map<String, String> map) {
        this.f18938b = i;
        this.f18939c = Collections.unmodifiableMap(map);
    }
}
