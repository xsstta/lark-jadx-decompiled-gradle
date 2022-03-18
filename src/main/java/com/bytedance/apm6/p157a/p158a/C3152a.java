package com.bytedance.apm6.p157a.p158a;

import java.util.Set;

/* renamed from: com.bytedance.apm6.a.a.a */
public class C3152a {

    /* renamed from: a */
    private Set<String> f10097a;

    /* renamed from: b */
    private Set<String> f10098b;

    public String toString() {
        return "CommonEventConfig{sampledService=" + this.f10097a + ", sampledLogType=" + this.f10098b + '}';
    }

    /* renamed from: a */
    public boolean mo13095a(String str) {
        Set<String> set = this.f10097a;
        if (set == null || !set.contains(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public boolean mo13096b(String str) {
        Set<String> set = this.f10098b;
        if (set == null || !set.contains(str)) {
            return false;
        }
        return true;
    }

    public C3152a(Set<String> set, Set<String> set2) {
        this.f10097a = set;
        this.f10098b = set2;
    }
}
