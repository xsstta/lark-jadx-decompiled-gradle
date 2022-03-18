package com.google.android.libraries.places.internal;

import android.location.Location;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.C21947c;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.tasks.AbstractC22083a;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;

public final class zzk {
    private static final long zza = TimeUnit.SECONDS.toMillis(10);
    private static final long zzb = TimeUnit.SECONDS.toNanos(24);
    private static final long zzc = TimeUnit.SECONDS.toMillis(59);
    private final FusedLocationProviderClient zzd;
    private final zzcr zze;

    public final Task<Location> zza(AbstractC22083a aVar) {
        return this.zze.zza(this.zzd.mo74306a(), aVar, zza, "Location timeout.").continueWithTask(new zzj(this, aVar));
    }

    zzk(FusedLocationProviderClient fusedLocationProviderClient, zzcr zzcr) {
        this.zzd = fusedLocationProviderClient;
        this.zze = zzcr;
    }

    static /* synthetic */ Task zza(TaskCompletionSource taskCompletionSource, Task task) throws Exception {
        if (task.isComplete()) {
            if (task.isCanceled()) {
                taskCompletionSource.trySetException(new ApiException(new Status(16, "Location request was cancelled. Please try again.")));
            } else if (!task.isSuccessful()) {
                taskCompletionSource.trySetException(new ApiException(new Status(8, task.getException().getMessage())));
            }
        }
        return task;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Task zza(AbstractC22083a aVar, Task task) throws Exception {
        TaskCompletionSource taskCompletionSource;
        if (task.isSuccessful()) {
            Location location = (Location) task.getResult();
            boolean z = false;
            if (location != null && (Build.VERSION.SDK_INT < 17 || SystemClock.elapsedRealtimeNanos() - location.getElapsedRealtimeNanos() <= zzb)) {
                z = true;
            }
            if (z) {
                return task;
            }
        }
        if (aVar != null) {
            taskCompletionSource = new TaskCompletionSource(aVar);
        } else {
            taskCompletionSource = new TaskCompletionSource();
        }
        LocationRequest a = LocationRequest.m79289a().mo74318a(100);
        long j = zza;
        LocationRequest b = a.mo74323c(j).mo74319a(zzc).mo74322b(10L).mo74321b(1);
        zzo zzo = new zzo(this, taskCompletionSource);
        this.zzd.mo74307a(b, zzo, Looper.getMainLooper()).continueWithTask(new zzm(this, taskCompletionSource));
        this.zze.zza(taskCompletionSource, j, "Location timeout.");
        taskCompletionSource.getTask().addOnCompleteListener(new zzl(this, zzo, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(C21947c cVar, TaskCompletionSource taskCompletionSource, Task task) {
        this.zzd.mo74308a(cVar);
        this.zze.zza(taskCompletionSource);
    }
}
