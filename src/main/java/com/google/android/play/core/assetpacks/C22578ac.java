package com.google.android.play.core.assetpacks;

import java.util.Objects;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.ac */
public final class C22578ac extends AssetPackState {

    /* renamed from: a */
    private final String f55655a;

    /* renamed from: b */
    private final int f55656b;

    /* renamed from: c */
    private final int f55657c;

    /* renamed from: d */
    private final long f55658d;

    /* renamed from: e */
    private final long f55659e;

    /* renamed from: f */
    private final int f55660f;

    C22578ac(String str, int i, int i2, long j, long j2, int i3) {
        Objects.requireNonNull(str, "Null name");
        this.f55655a = str;
        this.f55656b = i;
        this.f55657c = i2;
        this.f55658d = j;
        this.f55659e = j2;
        this.f55660f = i3;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    /* renamed from: a */
    public final String mo78687a() {
        return this.f55655a;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    /* renamed from: b */
    public final int mo78688b() {
        return this.f55656b;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    /* renamed from: c */
    public final int mo78689c() {
        return this.f55657c;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    /* renamed from: d */
    public final long mo78690d() {
        return this.f55658d;
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    /* renamed from: e */
    public final long mo78691e() {
        return this.f55659e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AssetPackState) {
            AssetPackState assetPackState = (AssetPackState) obj;
            return this.f55655a.equals(assetPackState.mo78687a()) && this.f55656b == assetPackState.mo78688b() && this.f55657c == assetPackState.mo78689c() && this.f55658d == assetPackState.mo78690d() && this.f55659e == assetPackState.mo78691e() && this.f55660f == assetPackState.mo78692f();
        }
    }

    @Override // com.google.android.play.core.assetpacks.AssetPackState
    /* renamed from: f */
    public final int mo78692f() {
        return this.f55660f;
    }

    public final int hashCode() {
        int hashCode = this.f55655a.hashCode();
        int i = this.f55656b;
        int i2 = this.f55657c;
        long j = this.f55658d;
        long j2 = this.f55659e;
        return ((((((((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f55660f;
    }

    public final String toString() {
        String str = this.f55655a;
        int i = this.f55656b;
        int i2 = this.f55657c;
        long j = this.f55658d;
        long j2 = this.f55659e;
        int i3 = this.f55660f;
        StringBuilder sb = new StringBuilder(str.length() + 185);
        sb.append("AssetPackState{name=");
        sb.append(str);
        sb.append(", status=");
        sb.append(i);
        sb.append(", errorCode=");
        sb.append(i2);
        sb.append(", bytesDownloaded=");
        sb.append(j);
        sb.append(", totalBytesToDownload=");
        sb.append(j2);
        sb.append(", transferProgressPercentage=");
        sb.append(i3);
        sb.append("}");
        return sb.toString();
    }
}
