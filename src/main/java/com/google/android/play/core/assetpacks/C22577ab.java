package com.google.android.play.core.assetpacks;

/* renamed from: com.google.android.play.core.assetpacks.ab */
final class C22577ab extends AbstractC22575a {

    /* renamed from: a */
    private final int f55652a;

    /* renamed from: b */
    private final String f55653b;

    /* renamed from: c */
    private final String f55654c;

    C22577ab(int i, String str, String str2) {
        this.f55652a = i;
        this.f55653b = str;
        this.f55654c = str2;
    }

    @Override // com.google.android.play.core.assetpacks.AbstractC22575a
    /* renamed from: a */
    public final int mo78694a() {
        return this.f55652a;
    }

    @Override // com.google.android.play.core.assetpacks.AbstractC22575a
    /* renamed from: b */
    public final String mo78695b() {
        return this.f55653b;
    }

    @Override // com.google.android.play.core.assetpacks.AbstractC22575a
    /* renamed from: c */
    public final String mo78696c() {
        return this.f55654c;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC22575a) {
            AbstractC22575a aVar = (AbstractC22575a) obj;
            if (this.f55652a == aVar.mo78694a() && ((str = this.f55653b) == null ? aVar.mo78695b() == null : str.equals(aVar.mo78695b()))) {
                String str2 = this.f55654c;
                String c = aVar.mo78696c();
                if (str2 == null ? c == null : str2.equals(c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.f55652a ^ 1000003) * 1000003;
        String str = this.f55653b;
        int i2 = 0;
        int hashCode = (i ^ (str != null ? str.hashCode() : 0)) * 1000003;
        String str2 = this.f55654c;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode ^ i2;
    }

    public final String toString() {
        int i = this.f55652a;
        String str = this.f55653b;
        String str2 = this.f55654c;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str2).length());
        sb.append("AssetPackLocation{packStorageMethod=");
        sb.append(i);
        sb.append(", path=");
        sb.append(str);
        sb.append(", assetsPath=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
