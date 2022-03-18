package com.google.android.libraries.places.internal;

abstract class zzfx extends zzfc<String> {
    final CharSequence zza;
    private final zzfd zzb;
    private final boolean zzc = false;
    private int zzd;
    private int zze;

    /* access modifiers changed from: package-private */
    public abstract int zza(int i);

    /* access modifiers changed from: package-private */
    public abstract int zzb(int i);

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* access modifiers changed from: protected */
    @Override // com.google.android.libraries.places.internal.zzfc
    public final /* synthetic */ String zza() {
        int zza2;
        int i = this.zzd;
        while (true) {
            int i2 = this.zzd;
            if (i2 != -1) {
                zza2 = zza(i2);
                if (zza2 == -1) {
                    zza2 = this.zza.length();
                    this.zzd = -1;
                } else {
                    this.zzd = zzb(zza2);
                }
                int i3 = this.zzd;
                if (i3 == i) {
                    int i4 = i3 + 1;
                    this.zzd = i4;
                    if (i4 > this.zza.length()) {
                        this.zzd = -1;
                    }
                } else {
                    while (i < zza2 && this.zzb.zzb(this.zza.charAt(i))) {
                        i++;
                    }
                    while (zza2 > i && this.zzb.zzb(this.zza.charAt(zza2 - 1))) {
                        zza2--;
                    }
                    if (!this.zzc || i != zza2) {
                        int i5 = this.zze;
                    } else {
                        i = this.zzd;
                    }
                }
            } else {
                zzb();
                return null;
            }
        }
        int i52 = this.zze;
        if (i52 == 1) {
            zza2 = this.zza.length();
            this.zzd = -1;
            while (zza2 > i && this.zzb.zzb(this.zza.charAt(zza2 - 1))) {
                zza2--;
            }
        } else {
            this.zze = i52 - 1;
        }
        return this.zza.subSequence(i, zza2).toString();
    }

    protected zzfx(zzfs zzfs, CharSequence charSequence) {
        this.zzb = zzfs.zza;
        this.zze = zzfs.zzd;
        this.zza = charSequence;
    }
}
