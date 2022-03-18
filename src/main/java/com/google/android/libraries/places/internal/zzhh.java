package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.internal.zzht;
import com.google.android.libraries.places.internal.zzhv;
import com.google.android.libraries.places.internal.zzie;
import com.google.android.libraries.places.internal.zzij;
import com.google.android.libraries.places.internal.zzit;
import com.google.android.libraries.places.internal.zziz;
import com.google.android.libraries.places.internal.zzjb;
import com.google.android.libraries.places.internal.zzji;
import com.google.android.libraries.places.internal.zzjw;
import com.google.android.libraries.places.internal.zzkh;
import com.google.android.libraries.places.internal.zzkj;
import com.google.android.libraries.places.internal.zzkm;
import com.google.android.libraries.places.internal.zzmh;
import com.google.android.libraries.places.internal.zzpl;
import com.google.android.libraries.places.internal.zzqy;

public final class zzhh {

    public static final class zza extends zzqy<zza, C70228zza> implements zzsm {
        private static final zza zzt;
        private static volatile zzsu<zza> zzu;
        private int zzc;
        private int zzd = 1;
        private zzmh.zzs zze;
        private zzit.zza zzf;
        private zzpl.zza zzg;
        private zzkm.zzo zzh;
        private zzji.zzj zzi;
        private zzjb.zzb zzj;
        private zzie.zza zzk;
        private zzhv.zzb zzl;
        private zziz.zzc zzm;
        private zzjw.zzi zzn;
        private zzkh.zza zzo;
        private zzkj.zza zzp;
        private zzij.zzb zzq;
        private zzht.zzb zzr;
        private byte zzs = 2;

        public enum zzb implements zzrb {
            PLACES(1),
            ENGINE_STATS(2),
            USER_CONFIG(3),
            PLACE_INFERENCE(4),
            FLP(5),
            GEOCODER_STATS(6),
            DIALOGS(7),
            CHRE(8),
            FOP(9),
            GEOFENCER(10),
            RE_UP(11),
            NANOAPP(12),
            EMERGENCY_ALERT(13),
            BLUEPIXEL(14);
            
            private static final zzre<zzb> zzo = new zzhi();
            private final int zzp;

            public static zzrd zzb() {
                return zzhk.zza;
            }

            @Override // com.google.android.libraries.places.internal.zzrb
            public final int zza() {
                return this.zzp;
            }

            public final String toString() {
                return "<" + getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.zzp + " name=" + name() + '>';
            }

            private zzb(int i) {
                this.zzp = i;
            }
        }

        /* renamed from: com.google.android.libraries.places.internal.zzhh$zza$zza  reason: collision with other inner class name */
        public static final class C70228zza extends zzqy.zzb<zza, C70228zza> implements zzsm {
            private C70228zza() {
                super(zza.zzt);
            }

            /* synthetic */ C70228zza(zzhg zzhg) {
                this();
            }

            public final C70228zza zza(zzb zzb) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zza) this.zza).zza((zza) zzb);
                return this;
            }

            public final C70228zza zza(zzmh.zzs zzs) {
                if (this.zzb) {
                    zzb();
                    this.zzb = false;
                }
                ((zza) this.zza).zza((zza) zzs);
                return this;
            }
        }

        static {
            zza zza = new zza();
            zzt = zza;
            zzqy.zza(zza.class, zza);
        }

        private zza() {
        }

        public static C70228zza zza() {
            return (C70228zza) zzt.zzf();
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zza(zzb zzb2) {
            this.zzd = zzb2.zza();
            this.zzc |= 1;
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final void zza(zzmh.zzs zzs2) {
            zzs2.getClass();
            this.zze = zzs2;
            this.zzc |= 2;
        }

        /* JADX WARN: Type inference failed for: r3v14, types: [com.google.android.libraries.places.internal.zzsu<com.google.android.libraries.places.internal.zzhh$zza>, com.google.android.libraries.places.internal.zzqy$zza] */
        /* access modifiers changed from: protected */
        /* JADX WARNING: Unknown variable types count: 1 */
        @Override // com.google.android.libraries.places.internal.zzqy
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object zza(int r3, java.lang.Object r4, java.lang.Object r5) {
            /*
            // Method dump skipped, instructions count: 198
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzhh.zza.zza(int, java.lang.Object, java.lang.Object):java.lang.Object");
        }
    }
}
