package com.bytedance.ee.bear.browser.plugin;

import java.util.Objects;

/* renamed from: com.bytedance.ee.bear.browser.plugin.b */
public final class C4940b {

    /* renamed from: a */
    public int f14501a;

    /* renamed from: b */
    public int f14502b;

    /* renamed from: c */
    public float f14503c;

    /* renamed from: d */
    public float f14504d;

    public C4940b() {
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f14501a), Integer.valueOf(this.f14502b), Float.valueOf(this.f14503c));
    }

    public String toString() {
        return "DeviceInfo{statusBarHeight=" + this.f14501a + ", titleBarHeight=" + this.f14502b + ", titleBarVisiblePercent=" + this.f14503c + ", titleBarLayoutVisiblePercent=" + this.f14504d + '}';
    }

    public C4940b(C4940b bVar) {
        this.f14501a = bVar.f14501a;
        this.f14502b = bVar.f14502b;
        this.f14503c = bVar.f14503c;
        this.f14504d = bVar.f14504d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C4940b bVar = (C4940b) obj;
        if (this.f14501a == bVar.f14501a && this.f14502b == bVar.f14502b && Float.compare(bVar.f14503c, this.f14503c) == 0) {
            return true;
        }
        return false;
    }
}
