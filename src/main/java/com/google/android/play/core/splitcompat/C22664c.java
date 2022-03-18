package com.google.android.play.core.splitcompat;

import java.io.File;
import java.util.Objects;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.splitcompat.c */
public final class C22664c extends AbstractC22680s {

    /* renamed from: a */
    private final File f56081a;

    /* renamed from: b */
    private final String f56082b;

    C22664c(File file, String str) {
        Objects.requireNonNull(file, "Null splitFile");
        this.f56081a = file;
        Objects.requireNonNull(str, "Null splitId");
        this.f56082b = str;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.play.core.splitcompat.AbstractC22680s
    /* renamed from: a */
    public final File mo78975a() {
        return this.f56081a;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.play.core.splitcompat.AbstractC22680s
    /* renamed from: b */
    public final String mo78976b() {
        return this.f56082b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC22680s) {
            AbstractC22680s sVar = (AbstractC22680s) obj;
            return this.f56081a.equals(sVar.mo78975a()) && this.f56082b.equals(sVar.mo78976b());
        }
    }

    public final int hashCode() {
        return ((this.f56081a.hashCode() ^ 1000003) * 1000003) ^ this.f56082b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f56081a);
        String str = this.f56082b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35 + str.length());
        sb.append("SplitFileInfo{splitFile=");
        sb.append(valueOf);
        sb.append(", splitId=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
