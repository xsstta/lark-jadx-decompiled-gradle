package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.internal.zzqy;
import java.io.IOException;
import java.util.List;
import java.util.Map;

final class zzqn implements zzuj {
    private final zzqk zza;

    @Override // com.google.android.libraries.places.internal.zzuj
    public final int zza() {
        return zzqy.zze.zzj;
    }

    @Override // com.google.android.libraries.places.internal.zzuj
    public final void zza(int i, boolean z) throws IOException {
        this.zza.zza(i, z);
    }

    @Override // com.google.android.libraries.places.internal.zzuj
    public final void zza(int i, String str) throws IOException {
        this.zza.zza(i, str);
    }

    @Override // com.google.android.libraries.places.internal.zzuj
    public final void zza(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzqk.zzf(list.get(i4).intValue());
            }
            this.zza.zzb(i3);
            while (i2 < list.size()) {
                this.zza.zza(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzb(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzuj
    public final void zza(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof zzrr) {
            zzrr zzrr = (zzrr) list;
            while (i2 < list.size()) {
                Object zza2 = zzrr.zza(i2);
                if (zza2 instanceof String) {
                    this.zza.zza(i, (String) zza2);
                } else {
                    this.zza.zza(i, (zzpx) zza2);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zza(i, list.get(i2));
            i2++;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzuj
    public final void zza(int i, List<?> list, zzsx zzsx) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            zza(i, list.get(i2), zzsx);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzuj
    public final void zza(int i) throws IOException {
        this.zza.zza(i, 3);
    }

    @Override // com.google.android.libraries.places.internal.zzuj
    public final void zzb(int i) throws IOException {
        this.zza.zza(i, 4);
    }

    private zzqn(zzqk zzqk) {
        zzqk zzqk2 = (zzqk) zzrc.zza((Object) zzqk, "output");
        this.zza = zzqk2;
        zzqk2.zza = this;
    }

    public static zzqn zza(zzqk zzqk) {
        if (zzqk.zza != null) {
            return zzqk.zza;
        }
        return new zzqn(zzqk);
    }

    @Override // com.google.android.libraries.places.internal.zzuj
    public final void zzc(int i, int i2) throws IOException {
        this.zza.zzb(i, i2);
    }

    @Override // com.google.android.libraries.places.internal.zzuj
    public final void zzd(int i, int i2) throws IOException {
        this.zza.zze(i, i2);
    }

    @Override // com.google.android.libraries.places.internal.zzuj
    public final void zze(int i, int i2) throws IOException {
        this.zza.zzc(i, i2);
    }

    @Override // com.google.android.libraries.places.internal.zzuj
    public final void zzf(int i, int i2) throws IOException {
        this.zza.zzd(i, i2);
    }

    @Override // com.google.android.libraries.places.internal.zzuj
    public final void zzb(int i, int i2) throws IOException {
        this.zza.zzb(i, i2);
    }

    @Override // com.google.android.libraries.places.internal.zzuj
    public final void zzc(int i, long j) throws IOException {
        this.zza.zza(i, j);
    }

    @Override // com.google.android.libraries.places.internal.zzuj
    public final void zzd(int i, long j) throws IOException {
        this.zza.zzc(i, j);
    }

    @Override // com.google.android.libraries.places.internal.zzuj
    public final void zze(int i, long j) throws IOException {
        this.zza.zzb(i, j);
    }

    @Override // com.google.android.libraries.places.internal.zzuj
    public final void zza(int i, double d) throws IOException {
        this.zza.zza(i, d);
    }

    @Override // com.google.android.libraries.places.internal.zzuj
    public final void zzb(int i, long j) throws IOException {
        this.zza.zzc(i, j);
    }

    @Override // com.google.android.libraries.places.internal.zzuj
    public final void zza(int i, float f) throws IOException {
        this.zza.zza(i, f);
    }

    @Override // com.google.android.libraries.places.internal.zzuj
    public final void zza(int i, int i2) throws IOException {
        this.zza.zze(i, i2);
    }

    @Override // com.google.android.libraries.places.internal.zzuj
    public final void zzb(int i, List<zzpx> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zza.zza(i, list.get(i2));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzuj
    public final void zza(int i, long j) throws IOException {
        this.zza.zza(i, j);
    }

    @Override // com.google.android.libraries.places.internal.zzuj
    public final void zza(int i, zzpx zzpx) throws IOException {
        this.zza.zza(i, zzpx);
    }

    @Override // com.google.android.libraries.places.internal.zzuj
    public final void zza(int i, Object obj) throws IOException {
        if (obj instanceof zzpx) {
            this.zza.zzb(i, (zzpx) obj);
        } else {
            this.zza.zza(i, (zzsk) obj);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzuj
    public final void zzb(int i, Object obj, zzsx zzsx) throws IOException {
        zzqk zzqk = this.zza;
        zzqk.zza(i, 3);
        zzsx.zza((Object) ((zzsk) obj), (zzuj) zzqk.zza);
        zzqk.zza(i, 4);
    }

    @Override // com.google.android.libraries.places.internal.zzuj
    public final void zzc(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzqk.zzd(list.get(i4).longValue());
            }
            this.zza.zzb(i3);
            while (i2 < list.size()) {
                this.zza.zza(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zza(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzuj
    public final void zzd(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzqk.zze(list.get(i4).longValue());
            }
            this.zza.zzb(i3);
            while (i2 < list.size()) {
                this.zza.zza(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zza(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzuj
    public final void zze(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzqk.zzg(list.get(i4).longValue());
            }
            this.zza.zzb(i3);
            while (i2 < list.size()) {
                this.zza.zzc(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzc(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzuj
    public final void zzf(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzqk.zzb(list.get(i4).floatValue());
            }
            this.zza.zzb(i3);
            while (i2 < list.size()) {
                this.zza.zza(list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zza(i, list.get(i2).floatValue());
            i2++;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzuj
    public final void zzg(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzqk.zzb(list.get(i4).doubleValue());
            }
            this.zza.zzb(i3);
            while (i2 < list.size()) {
                this.zza.zza(list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zza(i, list.get(i2).doubleValue());
            i2++;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzuj
    public final void zzh(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzqk.zzk(list.get(i4).intValue());
            }
            this.zza.zzb(i3);
            while (i2 < list.size()) {
                this.zza.zza(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzb(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzuj
    public final void zzi(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzqk.zzb(list.get(i4).booleanValue());
            }
            this.zza.zzb(i3);
            while (i2 < list.size()) {
                this.zza.zza(list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zza(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzuj
    public final void zzj(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzqk.zzg(list.get(i4).intValue());
            }
            this.zza.zzb(i3);
            while (i2 < list.size()) {
                this.zza.zzb(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzc(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzuj
    public final void zzk(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzqk.zzj(list.get(i4).intValue());
            }
            this.zza.zzb(i3);
            while (i2 < list.size()) {
                this.zza.zzd(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zze(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzuj
    public final void zzl(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzqk.zzh(list.get(i4).longValue());
            }
            this.zza.zzb(i3);
            while (i2 < list.size()) {
                this.zza.zzc(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzc(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzuj
    public final void zzm(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzqk.zzh(list.get(i4).intValue());
            }
            this.zza.zzb(i3);
            while (i2 < list.size()) {
                this.zza.zzc(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzd(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzuj
    public final void zzn(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzqk.zzf(list.get(i4).longValue());
            }
            this.zza.zzb(i3);
            while (i2 < list.size()) {
                this.zza.zzb(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzb(i, list.get(i2).longValue());
            i2++;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzuj
    public final void zzb(int i, List<?> list, zzsx zzsx) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzb(i, list.get(i2), zzsx);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzuj
    public final void zzb(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zza(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzqk.zzi(list.get(i4).intValue());
            }
            this.zza.zzb(i3);
            while (i2 < list.size()) {
                this.zza.zzd(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zze(i, list.get(i2).intValue());
            i2++;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzuj
    public final <K, V> void zza(int i, zzsb<K, V> zzsb, Map<K, V> map) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.zza.zza(i, 2);
            this.zza.zzb(zzqt.zza(zzsb.zza, 1, entry.getKey()) + zzqt.zza(zzsb.zzb, 2, entry.getValue()));
            zzqk zzqk = this.zza;
            K key = entry.getKey();
            V value = entry.getValue();
            zzqt.zza(zzqk, zzsb.zza, 1, key);
            zzqt.zza(zzqk, zzsb.zzb, 2, value);
        }
    }

    @Override // com.google.android.libraries.places.internal.zzuj
    public final void zza(int i, Object obj, zzsx zzsx) throws IOException {
        this.zza.zza(i, (zzsk) obj, zzsx);
    }
}
