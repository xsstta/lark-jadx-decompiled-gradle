package com.google.android.libraries.places.internal;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* access modifiers changed from: package-private */
public final /* synthetic */ class zzm implements Continuation {
    private final zzk zza;
    private final TaskCompletionSource zzb;

    zzm(zzk zzk, TaskCompletionSource taskCompletionSource) {
        this.zza = zzk;
        this.zzb = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        return zzk.zza(this.zzb, task);
    }
}
