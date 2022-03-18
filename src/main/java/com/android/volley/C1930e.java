package com.android.volley;

import android.text.TextUtils;

/* renamed from: com.android.volley.e */
public final class C1930e {

    /* renamed from: a */
    private final String f6590a;

    /* renamed from: b */
    private final String f6591b;

    /* renamed from: a */
    public final String mo9799a() {
        return this.f6590a;
    }

    /* renamed from: b */
    public final String mo9800b() {
        return this.f6591b;
    }

    public int hashCode() {
        return (this.f6590a.hashCode() * 31) + this.f6591b.hashCode();
    }

    public String toString() {
        return "Header[name=" + this.f6590a + ",value=" + this.f6591b + "]";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1930e eVar = (C1930e) obj;
        if (!TextUtils.equals(this.f6590a, eVar.f6590a) || !TextUtils.equals(this.f6591b, eVar.f6591b)) {
            return false;
        }
        return true;
    }

    public C1930e(String str, String str2) {
        this.f6590a = str;
        this.f6591b = str2;
    }
}
