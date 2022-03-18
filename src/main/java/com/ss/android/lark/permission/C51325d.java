package com.ss.android.lark.permission;

/* renamed from: com.ss.android.lark.permission.d */
public class C51325d {

    /* renamed from: a */
    public final String f127817a;

    /* renamed from: b */
    public final boolean f127818b;

    /* renamed from: c */
    public final boolean f127819c;

    public int hashCode() {
        return (((this.f127817a.hashCode() * 31) + (this.f127818b ? 1 : 0)) * 31) + (this.f127819c ? 1 : 0);
    }

    public String toString() {
        return "Permission{name='" + this.f127817a + '\'' + ", granted=" + this.f127818b + ", shouldShowRequestPermissionRationale=" + this.f127819c + '}';
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C51325d dVar = (C51325d) obj;
        if (this.f127818b == dVar.f127818b && this.f127819c == dVar.f127819c) {
            return this.f127817a.equals(dVar.f127817a);
        }
        return false;
    }

    public C51325d(String str, boolean z, boolean z2) {
        this.f127817a = str;
        this.f127818b = z;
        this.f127819c = z2;
    }
}
