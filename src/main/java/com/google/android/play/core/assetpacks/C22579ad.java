package com.google.android.play.core.assetpacks;

import java.util.Map;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.ad */
public final class C22579ad extends AbstractC22591d {

    /* renamed from: a */
    private final long f55661a;

    /* renamed from: b */
    private final Map<String, AssetPackState> f55662b;

    C22579ad(long j, Map<String, AssetPackState> map) {
        this.f55661a = j;
        this.f55662b = map;
    }

    @Override // com.google.android.play.core.assetpacks.AbstractC22591d
    /* renamed from: a */
    public final long mo78706a() {
        return this.f55661a;
    }

    @Override // com.google.android.play.core.assetpacks.AbstractC22591d
    /* renamed from: b */
    public final Map<String, AssetPackState> mo78707b() {
        return this.f55662b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC22591d) {
            AbstractC22591d dVar = (AbstractC22591d) obj;
            return this.f55661a == dVar.mo78706a() && this.f55662b.equals(dVar.mo78707b());
        }
    }

    public final int hashCode() {
        long j = this.f55661a;
        return this.f55662b.hashCode() ^ ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        long j = this.f55661a;
        String valueOf = String.valueOf(this.f55662b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 61);
        sb.append("AssetPackStates{totalBytes=");
        sb.append(j);
        sb.append(", packStates=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
