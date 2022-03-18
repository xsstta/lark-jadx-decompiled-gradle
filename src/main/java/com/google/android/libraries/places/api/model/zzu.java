package com.google.android.libraries.places.api.model;

/* access modifiers changed from: package-private */
public abstract class zzu extends PlusCode {
    private final String zza;
    private final String zzb;

    @Override // com.google.android.libraries.places.api.model.PlusCode
    public String getCompoundCode() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.api.model.PlusCode
    public String getGlobalCode() {
        return this.zzb;
    }

    public int hashCode() {
        int i;
        String str = this.zza;
        int i2 = 0;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int i3 = (i ^ 1000003) * 1000003;
        String str2 = this.zzb;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 ^ i2;
    }

    public String toString() {
        String str = this.zza;
        String str2 = this.zzb;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 36 + String.valueOf(str2).length());
        sb.append("PlusCode{compoundCode=");
        sb.append(str);
        sb.append(", globalCode=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PlusCode) {
            PlusCode plusCode = (PlusCode) obj;
            String str = this.zza;
            if (str != null ? str.equals(plusCode.getCompoundCode()) : plusCode.getCompoundCode() == null) {
                String str2 = this.zzb;
                if (str2 != null ? !str2.equals(plusCode.getGlobalCode()) : plusCode.getGlobalCode() != null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    zzu(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }
}
