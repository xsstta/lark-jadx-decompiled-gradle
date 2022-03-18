package com.google.android.libraries.places.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.places.api.net.FetchPlaceResponse;
import com.google.android.libraries.places.api.net.PlacesStatusCodes;

final /* synthetic */ class zzcc implements Continuation {
    private final zzbv zza;

    zzcc(zzbv zzbv) {
        this.zza = zzbv;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        zzgi zzgi;
        zzbh zzbh = (zzbh) task.getResult();
        int zza2 = zzcl.zza(zzbh.status);
        if (!PlacesStatusCodes.isError(zza2)) {
            zzcj zzcj = zzbh.result;
            if (zzbh.htmlAttributions != null) {
                zzgi = zzgi.zza((Object[]) zzbh.htmlAttributions);
            } else {
                zzgi = null;
            }
            return FetchPlaceResponse.newInstance(zzci.zza(zzcj, zzgi));
        }
        throw new ApiException(new Status(zza2, zzcl.zza(zzbh.status, zzbh.errorMessage)));
    }
}
