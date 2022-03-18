package com.google.android.libraries.places.internal;

import com.google.android.gms.tasks.C22090b;
import com.google.android.gms.tasks.Task;

/* access modifiers changed from: package-private */
public abstract class zzet<T> {
    private Task<T> zza;

    public abstract C22090b zza();

    private zzet() {
    }

    public final Task<T> zzc() {
        return this.zza;
    }

    public final void zza(Task<T> task) {
        this.zza = task;
    }
}
