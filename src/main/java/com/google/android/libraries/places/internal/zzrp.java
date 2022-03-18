package com.google.android.libraries.places.internal;

public class zzrp {
    private static final zzqp zza = zzqp.zza();
    private zzpx zzb;
    private volatile zzsk zzc;
    private volatile zzpx zzd;

    public int hashCode() {
        return 1;
    }

    public final int zzb() {
        if (this.zzd != null) {
            return this.zzd.zza();
        }
        if (this.zzc != null) {
            return this.zzc.zzh();
        }
        return 0;
    }

    public final zzpx zzc() {
        if (this.zzd != null) {
            return this.zzd;
        }
        synchronized (this) {
            if (this.zzd != null) {
                return this.zzd;
            }
            if (this.zzc == null) {
                this.zzd = zzpx.zza;
            } else {
                this.zzd = this.zzc.zzc();
            }
            return this.zzd;
        }
    }

    public final zzsk zza(zzsk zzsk) {
        zzsk zzsk2 = this.zzc;
        this.zzb = null;
        this.zzd = null;
        this.zzc = zzsk;
        return zzsk2;
    }

    private final zzsk zzb(zzsk zzsk) {
        if (this.zzc == null) {
            synchronized (this) {
                if (this.zzc == null) {
                    try {
                        this.zzc = zzsk;
                        this.zzd = zzpx.zza;
                    } catch (zzrk unused) {
                        this.zzc = zzsk;
                        this.zzd = zzpx.zza;
                    }
                }
            }
        }
        return this.zzc;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzrp)) {
            return false;
        }
        zzrp zzrp = (zzrp) obj;
        zzsk zzsk = this.zzc;
        zzsk zzsk2 = zzrp.zzc;
        if (zzsk == null && zzsk2 == null) {
            return zzc().equals(zzrp.zzc());
        }
        if (zzsk != null && zzsk2 != null) {
            return zzsk.equals(zzsk2);
        }
        if (zzsk != null) {
            return zzsk.equals(zzrp.zzb(zzsk.zzm()));
        }
        return zzb(zzsk2.zzm()).equals(zzsk2);
    }
}
