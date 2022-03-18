package com.google.android.libraries.places.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* access modifiers changed from: package-private */
public final /* synthetic */ class zzcs implements OnCompleteListener {
    private final zzcr zza;
    private final TaskCompletionSource zzb;

    zzcs(zzcr zzcr, TaskCompletionSource taskCompletionSource) {
        this.zza = zzcr;
        this.zzb = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        this.zza.zza(this.zzb, task);
    }
}
