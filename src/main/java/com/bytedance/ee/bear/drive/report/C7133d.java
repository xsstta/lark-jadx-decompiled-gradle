package com.bytedance.ee.bear.drive.report;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bytedance.ee.bear.drive.report.d */
public class C7133d {

    /* renamed from: a */
    private Map<String, C7135f> f19218a = new ConcurrentHashMap();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C7135f mo27992a(String str) {
        if (str == null) {
            return null;
        }
        return this.f19218a.get(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo27994b(String str) {
        if (str != null) {
            this.f19218a.remove(str);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo27993a(String str, C7135f fVar) {
        this.f19218a.put(str, fVar);
    }
}
