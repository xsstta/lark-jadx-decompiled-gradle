package com.google.android.datatransport.runtime;

import com.google.android.datatransport.C21349b;
import java.util.Arrays;
import java.util.Objects;

/* renamed from: com.google.android.datatransport.runtime.g */
public final class C21432g {

    /* renamed from: a */
    private final C21349b f52045a;

    /* renamed from: b */
    private final byte[] f52046b;

    /* renamed from: a */
    public C21349b mo72675a() {
        return this.f52045a;
    }

    /* renamed from: b */
    public byte[] mo72676b() {
        return this.f52046b;
    }

    public int hashCode() {
        return ((this.f52045a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f52046b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f52045a + ", bytes=[...]}";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21432g)) {
            return false;
        }
        C21432g gVar = (C21432g) obj;
        if (!this.f52045a.equals(gVar.f52045a)) {
            return false;
        }
        return Arrays.equals(this.f52046b, gVar.f52046b);
    }

    public C21432g(C21349b bVar, byte[] bArr) {
        Objects.requireNonNull(bVar, "encoding is null");
        Objects.requireNonNull(bArr, "bytes is null");
        this.f52045a = bVar;
        this.f52046b = bArr;
    }
}
