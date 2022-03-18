package com.google.android.libraries.places.internal;

import com.android.volley.C1934i;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.AbstractC22083a;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;
import org.json.JSONObject;

public final class zzx {
    private final C1934i zza;
    private final zzal zzb;

    zzx(C1934i iVar, zzal zzal) {
        this.zza = iVar;
        this.zzb = zzal;
    }

    public final <HttpJsonResponseT extends zzam<Object, ? extends Object>> Task<HttpJsonResponseT> zza(zzaj<Object, ? extends zzdc> zzaj, Class<HttpJsonResponseT> cls) {
        TaskCompletionSource taskCompletionSource;
        String zzd = zzaj.zzd();
        Map<String, String> zzc = zzaj.zzc();
        AbstractC22083a zzb2 = zzaj.zzb();
        if (zzb2 != null) {
            taskCompletionSource = new TaskCompletionSource(zzb2);
        } else {
            taskCompletionSource = new TaskCompletionSource();
        }
        zzab zzab = new zzab(this, 0, zzd, null, new zzaa(this, cls, taskCompletionSource), new zzz(taskCompletionSource), zzc);
        if (zzb2 != null) {
            zzb2.mo75029a(zzac.zza(zzab));
        }
        this.zza.mo9808a(zzab);
        return taskCompletionSource.getTask();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(Class cls, TaskCompletionSource taskCompletionSource, JSONObject jSONObject) {
        try {
            taskCompletionSource.trySetResult((zzam) this.zzb.zza(jSONObject.toString(), cls));
        } catch (zzao e) {
            try {
                taskCompletionSource.trySetException(new ApiException(new Status(8, e.getMessage())));
            } catch (Error | RuntimeException e2) {
                zzdk.zza(e2);
                throw e2;
            }
        }
    }
}
