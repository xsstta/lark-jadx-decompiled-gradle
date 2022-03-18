package com.google.android.play.core.assetpacks;

/* renamed from: com.google.android.play.core.assetpacks.ae */
final class C22580ae extends cm {

    /* renamed from: a */
    private final int f55663a;

    /* renamed from: b */
    private final String f55664b;

    /* renamed from: c */
    private final long f55665c;

    /* renamed from: d */
    private final long f55666d;

    /* renamed from: e */
    private final int f55667e;

    C22580ae(int i, String str, long j, long j2, int i2) {
        this.f55663a = i;
        this.f55664b = str;
        this.f55665c = j;
        this.f55666d = j2;
        this.f55667e = i2;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.play.core.assetpacks.cm
    /* renamed from: a */
    public final int mo78711a() {
        return this.f55663a;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.play.core.assetpacks.cm
    /* renamed from: b */
    public final String mo78712b() {
        return this.f55664b;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.play.core.assetpacks.cm
    /* renamed from: c */
    public final long mo78713c() {
        return this.f55665c;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.play.core.assetpacks.cm
    /* renamed from: d */
    public final long mo78714d() {
        return this.f55666d;
    }

    /* access modifiers changed from: package-private */
    @Override // com.google.android.play.core.assetpacks.cm
    /* renamed from: e */
    public final int mo78715e() {
        return this.f55667e;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cm) {
            cm cmVar = (cm) obj;
            return this.f55663a == cmVar.mo78711a() && ((str = this.f55664b) == null ? cmVar.mo78712b() == null : str.equals(cmVar.mo78712b())) && this.f55665c == cmVar.mo78713c() && this.f55666d == cmVar.mo78714d() && this.f55667e == cmVar.mo78715e();
        }
    }

    public final int hashCode() {
        int i = (this.f55663a ^ 1000003) * 1000003;
        String str = this.f55664b;
        int hashCode = str != null ? str.hashCode() : 0;
        long j = this.f55665c;
        long j2 = this.f55666d;
        return ((((((i ^ hashCode) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.f55667e;
    }

    public final String toString() {
        int i = this.f55663a;
        String str = this.f55664b;
        long j = this.f55665c;
        long j2 = this.f55666d;
        int i2 = this.f55667e;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 157);
        sb.append("SliceCheckpoint{fileExtractionStatus=");
        sb.append(i);
        sb.append(", filePath=");
        sb.append(str);
        sb.append(", fileOffset=");
        sb.append(j);
        sb.append(", remainingBytes=");
        sb.append(j2);
        sb.append(", previousChunk=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
