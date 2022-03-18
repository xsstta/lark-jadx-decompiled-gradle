package com.google.android.libraries.places.internal;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.platform.godzilla.thread.C20339a;
import com.bytedance.platform.godzilla.thread.p873a.C20341a;
import com.google.android.gms.tasks.AbstractC22083a;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.HashMap;
import java.util.Map;

public final class zzcr {
    private final zzco zza;
    private final Map<TaskCompletionSource<?>, HandlerThread> zzb = new HashMap();

    public static HandlerThread new_android_os_HandlerThread_by_knot(String str) {
        return C20341a.m74147a() ? C20339a.m74145a(str, 0, C20341a.f49621b) : new HandlerThread(str);
    }

    public zzcr(zzco zzco) {
        this.zza = zzco;
    }

    public final boolean zza(TaskCompletionSource<?> taskCompletionSource) {
        HandlerThread remove = this.zzb.remove(taskCompletionSource);
        if (remove == null) {
            return false;
        }
        return remove.quit();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(TaskCompletionSource taskCompletionSource, Task task) {
        zza(taskCompletionSource);
    }

    public final <T> boolean zza(TaskCompletionSource<T> taskCompletionSource, long j, String str) {
        if (this.zzb.containsKey(taskCompletionSource)) {
            return false;
        }
        HandlerThread new_android_os_HandlerThread_by_knot = new_android_os_HandlerThread_by_knot("timeoutHandlerThread");
        new_android_os_HandlerThread_by_knot.start();
        this.zzb.put(taskCompletionSource, new_android_os_HandlerThread_by_knot);
        return new Handler(new_android_os_HandlerThread_by_knot.getLooper()).postDelayed(new zzcq(taskCompletionSource, str), j);
    }

    public final <T> Task<T> zza(Task<T> task, AbstractC22083a aVar, long j, String str) {
        TaskCompletionSource<T> taskCompletionSource;
        if (aVar == null) {
            taskCompletionSource = new TaskCompletionSource<>();
        } else {
            taskCompletionSource = new TaskCompletionSource<>(aVar);
        }
        zza(taskCompletionSource, j, str);
        task.continueWithTask(new zzct(this, taskCompletionSource));
        taskCompletionSource.getTask().addOnCompleteListener(new zzcs(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }
}
