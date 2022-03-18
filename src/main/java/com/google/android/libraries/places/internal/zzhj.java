package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.internal.zzqy;

public final class zzhj {

    public static final class zza extends zzqy<zza, zzb> implements zzsm {
        private static final zza zzl;
        private static volatile zzsu<zza> zzm;
        private int zzc;
        private String zzd = "";
        private int zze;
        private int zzf;
        private String zzg = "";
        private int zzh;
        private int zzi;
        private int zzj;
        private int zzk;

        /* renamed from: com.google.android.libraries.places.internal.zzhj$zza$zza  reason: collision with other inner class name */
        public enum EnumC70229zza implements zzrb {
            STATUS_UNKNOWN(0),
            STATUS_TRUE(1),
            STATUS_FALSE(2);
            
            private static final zzre<EnumC70229zza> zzd = new zzhn();
            private final int zze;

            public static zzrd zzb() {
                return zzhm.zza;
            }

            @Override // com.google.android.libraries.places.internal.zzrb
            public final int zza() {
                return this.zze;
            }

            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zze + " name=" + name() + '>';
            }

            private EnumC70229zza(int i) {
                this.zze = i;
            }
        }

        public enum zzc implements zzrb {
            GRANULARITY_UNKNOWN(0),
            NONE(1),
            COARSE(2),
            FINE(3);
            
            private static final zzre<zzc> zze = new zzho();
            private final int zzf;

            public static zzrd zzb() {
                return zzhp.zza;
            }

            @Override // com.google.android.libraries.places.internal.zzrb
            public final int zza() {
                return this.zzf;
            }

            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzf + " name=" + name() + '>';
            }

            private zzc(int i) {
                this.zzf = i;
            }
        }

        public enum zzd implements zzrb {
            PERMISSION_UNKNOWN(0),
            ALWAYS(1),
            WHILE_IN_USE(2),
            DENY(3);
            
            private static final zzre<zzd> zze = new zzhr();
            private final int zzf;

            public static zzrd zzb() {
                return zzhq.zza;
            }

            @Override // com.google.android.libraries.places.internal.zzrb
            public final int zza() {
                return this.zzf;
            }

            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzf + " name=" + name() + '>';
            }

            private zzd(int i) {
                this.zzf = i;
            }
        }

        public static final class zzb extends zzqy.zzb<zza, zzb> implements zzsm {
            private zzb() {
                super(zza.zzl);
            }

            /* synthetic */ zzb(zzhl zzhl) {
                this();
            }

            public final zzb zza(int i) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zza) this.zza).zzb(i);
                return this;
            }

            public final zzb zza(String str) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zza) this.zza).zza((zza) str);
                return this;
            }
        }

        static {
            zza zza = new zza();
            zzl = zza;
            zzqy.zza(zza.class, zza);
        }

        private zza() {
        }

        public static zzb zza() {
            return (zzb) zzl.zzf();
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zzb(int i) {
            this.zzc |= 2;
            this.zze = i;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zza(String str) {
            str.getClass();
            this.zzc |= 1;
            this.zzd = str;
        }

        /* JADX WARN: Type inference failed for: r2v14, types: [com.google.android.libraries.places.internal.zzqy$zza, com.google.android.libraries.places.internal.zzsu<com.google.android.libraries.places.internal.zzhj$zza>] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // com.google.android.libraries.places.internal.zzqy
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r2, java.lang.Object r3, java.lang.Object r4) {
            /*
            // Method dump skipped, instructions count: 164
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzhj.zza.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }
}
