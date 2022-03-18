package com.google.android.libraries.places.internal;

import com.google.android.gms.location.C21947c;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* access modifiers changed from: package-private */
public final /* synthetic */ class zzl implements OnCompleteListener {
    private final zzk zza;
    private final C21947c zzb;
    private final TaskCompletionSource zzc;

    zzl(zzk zzk, C21947c cVar, TaskCompletionSource taskCompletionSource) {
        this.zza = zzk;
        this.zzb = cVar;
        this.zzc = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        this.zza.zza(this.zzb, this.zzc, task);
    }
}
