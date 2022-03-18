package com.bytedance.ee.lark.infra.network.p628c.p629a;

/* renamed from: com.bytedance.ee.lark.infra.network.c.a.d */
public class C12826d {

    /* renamed from: a */
    private final String f34254a;

    /* renamed from: b */
    private String f34255b;

    /* renamed from: a */
    public String mo48423a() {
        return this.f34254a;
    }

    /* renamed from: b */
    public String mo48425b() {
        return this.f34255b;
    }

    public int hashCode() {
        int i;
        String str = this.f34254a;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        String str2 = this.f34255b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = this.f34254a;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        sb.append(str);
        sb.append(": ");
        String str3 = this.f34255b;
        if (str3 != null) {
            str2 = str3;
        }
        sb.append(str2);
        return sb.toString();
    }

    /* renamed from: a */
    public void mo48424a(String str) {
        this.f34255b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C12826d dVar = (C12826d) obj;
        String str = this.f34254a;
        if (str == null ? dVar.f34254a != null : !str.equals(dVar.f34254a)) {
            return false;
        }
        String str2 = this.f34255b;
        String str3 = dVar.f34255b;
        if (str2 == null ? str3 == null : str2.equals(str3)) {
            return true;
        }
        return false;
    }

    public C12826d(String str, String str2) {
        this.f34254a = str;
        this.f34255b = str2;
    }
}
