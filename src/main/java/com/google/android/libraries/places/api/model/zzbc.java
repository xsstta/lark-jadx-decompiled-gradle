package com.google.android.libraries.places.api.model;

import com.google.android.libraries.places.internal.zzgm;
import com.google.android.libraries.places.internal.zzgn;
import java.util.Map;

final class zzbc {
    private static final zzgn<Integer, DayOfWeek> zza = new zzgm().zza(1, DayOfWeek.SUNDAY).zza(2, DayOfWeek.MONDAY).zza(3, DayOfWeek.TUESDAY).zza(4, DayOfWeek.WEDNESDAY).zza(5, DayOfWeek.THURSDAY).zza(6, DayOfWeek.FRIDAY).zza(7, DayOfWeek.SATURDAY).zza();
    private static final LocalTime zzb = LocalTime.newInstance(23, 59);

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0084  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.Boolean zza(com.google.android.libraries.places.api.model.Place r12, long r13) {
        /*
        // Method dump skipped, instructions count: 453
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.api.model.zzbc.zza(com.google.android.libraries.places.api.model.Place, long):java.lang.Boolean");
    }

    private static <K, V> V zza(Map<K, V> map, K k, V v) {
        if (map.containsKey(k)) {
            return map.get(k);
        }
        return v;
    }
}
