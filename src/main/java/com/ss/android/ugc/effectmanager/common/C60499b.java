package com.ss.android.ugc.effectmanager.common;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.effectmanager.common.b */
public class C60499b {

    /* renamed from: a */
    String f151251a = "GET";

    /* renamed from: b */
    private String f151252b = "";

    /* renamed from: c */
    private boolean f151253c = true;

    /* renamed from: d */
    private long f151254d;

    /* renamed from: e */
    private Map<String, String> f151255e = new HashMap();

    /* renamed from: f */
    private Map<String, Object> f151256f = new HashMap();

    /* renamed from: g */
    private String f151257g = "application/x-www-form-urlencoded";

    /* renamed from: h */
    private String f151258h;

    /* renamed from: a */
    public String mo207143a() {
        return this.f151252b;
    }

    /* renamed from: b */
    public String mo207147b() {
        return this.f151251a;
    }

    /* renamed from: c */
    public Map<String, String> mo207149c() {
        return this.f151255e;
    }

    /* renamed from: d */
    public Map<String, Object> mo207150d() {
        return this.f151256f;
    }

    /* renamed from: e */
    public String mo207151e() {
        return this.f151258h;
    }

    /* renamed from: f */
    public long mo207152f() {
        return this.f151254d;
    }

    /* renamed from: a */
    public void mo207144a(long j) {
        this.f151254d = j;
    }

    /* renamed from: b */
    public void mo207148b(Map<String, Object> map) {
        this.f151256f = map;
    }

    /* renamed from: a */
    public void mo207145a(String str) {
        this.f151257g = str;
    }

    /* renamed from: a */
    public void mo207146a(Map<String, String> map) {
        this.f151255e = map;
    }

    public C60499b(String str, String str2) {
        this.f151251a = str;
        this.f151252b = str2;
        this.f151253c = true;
    }

    public C60499b(String str, String str2, boolean z) {
        this.f151251a = str;
        this.f151252b = str2;
        this.f151253c = z;
    }
}
