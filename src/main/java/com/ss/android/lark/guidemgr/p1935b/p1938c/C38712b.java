package com.ss.android.lark.guidemgr.p1935b.p1938c;

import java.util.Objects;

/* renamed from: com.ss.android.lark.guidemgr.b.c.b */
public class C38712b {

    /* renamed from: a */
    private final String f99589a;

    /* renamed from: b */
    private final long f99590b;

    /* renamed from: c */
    private final C38711a f99591c;

    /* renamed from: d */
    private boolean f99592d;

    /* renamed from: a */
    public String mo141871a() {
        return this.f99589a;
    }

    /* renamed from: b */
    public long mo141873b() {
        return this.f99590b;
    }

    /* renamed from: c */
    public C38711a mo141874c() {
        return this.f99591c;
    }

    /* renamed from: d */
    public boolean mo141875d() {
        return this.f99592d;
    }

    public int hashCode() {
        return Objects.hash(this.f99589a);
    }

    public String toString() {
        return "GuideInfo{guideKey='" + this.f99589a + '\'' + ", priority=" + this.f99590b + ", areaInfo=" + this.f99591c + ", hasShowed=" + this.f99592d + '}';
    }

    /* renamed from: a */
    public void mo141872a(boolean z) {
        this.f99592d = z;
    }

    public C38712b(String str) {
        this(str, -1, null, false);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f99589a, ((C38712b) obj).f99589a);
    }

    public C38712b(String str, long j, C38711a aVar, boolean z) {
        this.f99589a = str;
        this.f99590b = j;
        this.f99591c = aVar;
        this.f99592d = z;
    }
}
