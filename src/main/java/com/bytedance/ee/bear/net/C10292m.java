package com.bytedance.ee.bear.net;

import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.ee.bear.net.m */
public class C10292m {

    /* renamed from: a */
    private String f27780a;

    /* renamed from: b */
    private String f27781b;

    /* renamed from: c */
    private Map<String, List<String>> f27782c;

    /* renamed from: a */
    public String mo39310a() {
        return this.f27780a;
    }

    /* renamed from: b */
    public String mo39313b() {
        return this.f27781b;
    }

    /* renamed from: a */
    public String mo39311a(String str) {
        return mo39312a(str, "");
    }

    /* renamed from: a */
    public String mo39312a(String str, String str2) {
        List<String> list;
        Map<String, List<String>> map = this.f27782c;
        if (map == null || (list = map.get(str)) == null || list.size() <= 0) {
            return str2;
        }
        return list.get(0);
    }

    public C10292m(String str, String str2, Map<String, List<String>> map) {
        this.f27780a = str;
        this.f27781b = str2;
        this.f27782c = map;
    }
}
