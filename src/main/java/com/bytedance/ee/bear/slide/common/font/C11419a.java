package com.bytedance.ee.bear.slide.common.font;

import java.util.Objects;

/* renamed from: com.bytedance.ee.bear.slide.common.font.a */
public class C11419a implements Comparable<C11419a> {

    /* renamed from: a */
    private String f30696a;

    /* renamed from: b */
    private String f30697b;

    /* renamed from: c */
    private String f30698c;

    /* renamed from: d */
    private String f30699d;

    /* renamed from: e */
    private String f30700e;

    /* renamed from: f */
    private int f30701f;

    /* renamed from: a */
    public int mo43737a() {
        return this.f30701f;
    }

    /* renamed from: b */
    public String mo43741b() {
        return this.f30696a;
    }

    /* renamed from: c */
    public String mo43743c() {
        return this.f30697b;
    }

    /* renamed from: d */
    public String mo43746d() {
        return this.f30698c;
    }

    /* renamed from: e */
    public String mo43748e() {
        return this.f30699d;
    }

    /* renamed from: f */
    public String mo43751f() {
        return this.f30700e;
    }

    public int hashCode() {
        return Objects.hash(this.f30696a, this.f30699d, this.f30700e);
    }

    public String toString() {
        return "Config{url='" + this.f30696a + '\'' + ", size='" + this.f30697b + '\'' + ", type='" + this.f30698c + '\'' + ", key='" + this.f30699d + '\'' + ", md5='" + this.f30700e + '\'' + ", priority=" + this.f30701f + '}';
    }

    /* renamed from: a */
    public void mo43739a(int i) {
        this.f30701f = i;
    }

    /* renamed from: b */
    public void mo43742b(String str) {
        this.f30697b = str;
    }

    /* renamed from: c */
    public void mo43744c(String str) {
        this.f30698c = str;
    }

    /* renamed from: d */
    public void mo43747d(String str) {
        this.f30699d = str;
    }

    /* renamed from: e */
    public void mo43749e(String str) {
        this.f30700e = str;
    }

    /* renamed from: a */
    public int compareTo(C11419a aVar) {
        return mo43737a() - aVar.mo43737a();
    }

    /* renamed from: a */
    public void mo43740a(String str) {
        this.f30696a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C11419a aVar = (C11419a) obj;
        if (!Objects.equals(this.f30696a, aVar.f30696a) || !Objects.equals(this.f30699d, aVar.f30699d) || !Objects.equals(this.f30700e, aVar.f30700e)) {
            return false;
        }
        return true;
    }
}
