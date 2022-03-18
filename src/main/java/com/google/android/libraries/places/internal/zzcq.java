package com.google.android.libraries.places.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* access modifiers changed from: package-private */
public final /* synthetic */ class zzcq implements Runnable {
    private final TaskCompletionSource zza;
    private final String zzb;

    zzcq(TaskCompletionSource taskCompletionSource, String str) {
        this.zza = taskCompletionSource;
        this.zzb = str;
    }

    public final void run() {
        this.zza.trySetException(new ApiException(new Status(15, this.zzb)));
    }
}
