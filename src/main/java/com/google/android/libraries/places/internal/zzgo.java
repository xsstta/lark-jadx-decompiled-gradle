package com.google.android.libraries.places.internal;

import java.util.Comparator;

public abstract class zzgo<T> implements Comparator<T> {
    protected zzgo() {
    }

    public static <T> zzgo<T> zza(Comparator<T> comparator) {
        if (comparator instanceof zzgo) {
            return (zzgo) comparator;
        }
        return new zzga(comparator);
    }
}
