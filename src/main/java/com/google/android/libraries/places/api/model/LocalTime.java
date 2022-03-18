package com.google.android.libraries.places.api.model;

import android.os.Parcelable;
import com.google.android.libraries.places.internal.zzft;
import com.google.android.libraries.places.internal.zzgr;

public abstract class LocalTime implements Parcelable, Comparable<LocalTime> {
    public abstract int getHours();

    public abstract int getMinutes();

    /* access modifiers changed from: package-private */
    public static abstract class zza {
        /* access modifiers changed from: package-private */
        public abstract zza zza(int i);

        /* access modifiers changed from: package-private */
        public abstract LocalTime zza();

        /* access modifiers changed from: package-private */
        public abstract zza zzb(int i);

        zza() {
        }
    }

    public int compareTo(LocalTime localTime) {
        int hours;
        int hours2;
        if (this == localTime) {
            return 0;
        }
        if (getHours() == localTime.getHours()) {
            hours = getMinutes();
            hours2 = localTime.getMinutes();
        } else {
            hours = getHours();
            hours2 = localTime.getHours();
        }
        return hours - hours2;
    }

    public static LocalTime newInstance(int i, int i2) {
        try {
            LocalTime zza2 = new zzk().zza(i).zzb(i2).zza();
            int hours = zza2.getHours();
            zzft.zza(zzgr.zza((Comparable) 0, (Comparable) 23).zzb(Integer.valueOf(hours)), "Hours must not be out-of-range: 0 to 23, but was: %s.", hours);
            int minutes = zza2.getMinutes();
            zzft.zza(zzgr.zza((Comparable) 0, (Comparable) 59).zzb(Integer.valueOf(minutes)), "Minutes must not be out-of-range: 0 to 59, but was: %s.", minutes);
            return zza2;
        } catch (IllegalStateException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
