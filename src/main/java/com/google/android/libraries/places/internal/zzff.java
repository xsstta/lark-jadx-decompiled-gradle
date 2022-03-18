package com.google.android.libraries.places.internal;

/* access modifiers changed from: package-private */
public final class zzff extends zzfg {
    private final char zza;

    public final String toString() {
        String str = zzfd.zzd(this.zza);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 18);
        sb.append("CharMatcher.is('");
        sb.append(str);
        sb.append("')");
        return sb.toString();
    }

    zzff(char c) {
        this.zza = c;
    }

    @Override // com.google.android.libraries.places.internal.zzfd
    public final boolean zzb(char c) {
        if (c == this.zza) {
            return true;
        }
        return false;
    }
}
