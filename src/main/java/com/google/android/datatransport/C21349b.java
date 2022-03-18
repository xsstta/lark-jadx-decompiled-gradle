package com.google.android.datatransport;

import java.util.Objects;

/* renamed from: com.google.android.datatransport.b */
public final class C21349b {

    /* renamed from: a */
    private final String f51902a;

    /* renamed from: a */
    public String mo72499a() {
        return this.f51902a;
    }

    public int hashCode() {
        return this.f51902a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Encoding{name=\"" + this.f51902a + "\"}";
    }

    /* renamed from: a */
    public static C21349b m77288a(String str) {
        return new C21349b(str);
    }

    private C21349b(String str) {
        Objects.requireNonNull(str, "name is null");
        this.f51902a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21349b)) {
            return false;
        }
        return this.f51902a.equals(((C21349b) obj).f51902a);
    }
}
