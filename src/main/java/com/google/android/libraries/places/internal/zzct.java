package com.google.android.libraries.places.internal;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* access modifiers changed from: package-private */
public final /* synthetic */ class zzct implements Continuation {
    private final zzcr zza;
    private final TaskCompletionSource zzb;

    zzct(zzcr zzcr, TaskCompletionSource taskCompletionSource) {
        this.zza = zzcr;
        this.zzb = taskCompletionSource;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        TaskCompletionSource taskCompletionSource = this.zzb;
        if (task.isSuccessful()) {
            taskCompletionSource.setResult(task.getResult());
        } else if (!task.isCanceled() && task.getException() != null) {
            taskCompletionSource.setException(task.getException());
        }
        return taskCompletionSource.getTask();
    }
}
