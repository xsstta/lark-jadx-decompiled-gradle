package com.google.android.play.core.assetpacks;

import java.util.Arrays;

/* access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.af */
public final class C22581af extends ct {

    /* renamed from: a */
    private final String f55668a;

    /* renamed from: b */
    private final long f55669b;

    /* renamed from: c */
    private final int f55670c;

    /* renamed from: d */
    private final boolean f55671d;

    /* renamed from: e */
    private final byte[] f55672e;

    C22581af(String str, long j, int i, boolean z, byte[] bArr) {
        this.f55668a = str;
        this.f55669b = j;
        this.f55670c = i;
        this.f55671d = z;
        this.f55672e = bArr;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.play.core.assetpacks.ct
    /* renamed from: a */
    public final String mo78719a() {
        return this.f55668a;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.play.core.assetpacks.ct
    /* renamed from: b */
    public final long mo78720b() {
        return this.f55669b;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.play.core.assetpacks.ct
    /* renamed from: c */
    public final int mo78721c() {
        return this.f55670c;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.play.core.assetpacks.ct
    /* renamed from: d */
    public final boolean mo78722d() {
        return this.f55671d;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.play.core.assetpacks.ct
    /* renamed from: e */
    public final byte[] mo78723e() {
        return this.f55672e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ct) {
            ct ctVar = (ct) obj;
            String str = this.f55668a;
            if (str == null ? ctVar.mo78719a() == null : str.equals(ctVar.mo78719a())) {
                if (this.f55669b == ctVar.mo78720b() && this.f55670c == ctVar.mo78721c() && this.f55671d == ctVar.mo78722d()) {
                    if (Arrays.equals(this.f55672e, ctVar instanceof C22581af ? ((C22581af) ctVar).f55672e : ctVar.mo78723e())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f55668a;
        int hashCode = str != null ? str.hashCode() : 0;
        long j = this.f55669b;
        return ((((((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f55670c) * 1000003) ^ (true != this.f55671d ? 1237 : 1231)) * 1000003) ^ Arrays.hashCode(this.f55672e);
    }

    public final String toString() {
        String str = this.f55668a;
        long j = this.f55669b;
        int i = this.f55670c;
        boolean z = this.f55671d;
        String arrays = Arrays.toString(this.f55672e);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 104 + String.valueOf(arrays).length());
        sb.append("ZipEntry{name=");
        sb.append(str);
        sb.append(", size=");
        sb.append(j);
        sb.append(", compressionMethod=");
        sb.append(i);
        sb.append(", isPartial=");
        sb.append(z);
        sb.append(", headerBytes=");
        sb.append(arrays);
        sb.append("}");
        return sb.toString();
    }
}
