package com.ss.android.ttve.common;

/* renamed from: com.ss.android.ttve.common.g */
public class C60189g {

    /* renamed from: a */
    public int f150219a = 720;

    /* renamed from: b */
    public int f150220b = 1280;

    public C60189g() {
    }

    public int hashCode() {
        return (this.f150219a * 65537) + 1 + this.f150220b;
    }

    public String toString() {
        return this.f150219a + "x" + this.f150220b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C60189g)) {
            return false;
        }
        C60189g gVar = (C60189g) obj;
        if (this.f150219a == gVar.f150219a && this.f150220b == gVar.f150220b) {
            return true;
        }
        return false;
    }

    public C60189g(int i, int i2) {
        this.f150219a = i;
        this.f150220b = i2;
    }
}
