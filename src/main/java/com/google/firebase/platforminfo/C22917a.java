package com.google.firebase.platforminfo;

import java.util.Objects;
import javax.annotation.Nonnull;

/* access modifiers changed from: package-private */
/* renamed from: com.google.firebase.platforminfo.a */
public final class C22917a extends AbstractC22922f {

    /* renamed from: a */
    private final String f56655a;

    /* renamed from: b */
    private final String f56656b;

    @Override // com.google.firebase.platforminfo.AbstractC22922f
    @Nonnull
    /* renamed from: a */
    public String mo79552a() {
        return this.f56655a;
    }

    @Override // com.google.firebase.platforminfo.AbstractC22922f
    @Nonnull
    /* renamed from: b */
    public String mo79553b() {
        return this.f56656b;
    }

    public int hashCode() {
        return ((this.f56655a.hashCode() ^ 1000003) * 1000003) ^ this.f56656b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f56655a + ", version=" + this.f56656b + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC22922f)) {
            return false;
        }
        AbstractC22922f fVar = (AbstractC22922f) obj;
        if (!this.f56655a.equals(fVar.mo79552a()) || !this.f56656b.equals(fVar.mo79553b())) {
            return false;
        }
        return true;
    }

    C22917a(String str, String str2) {
        Objects.requireNonNull(str, "Null libraryName");
        this.f56655a = str;
        Objects.requireNonNull(str2, "Null version");
        this.f56656b = str2;
    }
}
