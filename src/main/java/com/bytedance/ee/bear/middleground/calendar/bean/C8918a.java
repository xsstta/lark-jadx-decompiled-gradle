package com.bytedance.ee.bear.middleground.calendar.bean;

import java.util.List;

/* renamed from: com.bytedance.ee.bear.middleground.calendar.bean.a */
public class C8918a {

    /* renamed from: a */
    private List<String> f24069a;

    /* renamed from: b */
    private List<String> f24070b;

    /* renamed from: c */
    private String f24071c;

    /* renamed from: a */
    public List<String> mo34208a() {
        return this.f24069a;
    }

    /* renamed from: b */
    public List<String> mo34209b() {
        return this.f24070b;
    }

    /* renamed from: c */
    public String mo34210c() {
        return this.f24071c;
    }

    public String toString() {
        return "DomainConfig{domainPool=" + this.f24069a + ", spaceApi=" + this.f24070b + ", suiteDomain='" + this.f24071c + '\'' + '}';
    }

    public C8918a(List<String> list, List<String> list2, String str) {
        this.f24069a = list;
        this.f24070b = list2;
        this.f24071c = str;
    }
}
