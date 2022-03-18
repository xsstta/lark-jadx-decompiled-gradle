package com.google.android.libraries.places.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.places.api.model.PlaceLikelihood;
import com.google.android.libraries.places.api.net.FindCurrentPlaceResponse;
import com.google.android.libraries.places.api.net.PlacesStatusCodes;
import java.util.ArrayList;

final /* synthetic */ class zzce implements Continuation {
    private final zzbv zza;

    zzce(zzbv zzbv) {
        this.zza = zzbv;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        zzgi zzgi;
        zzbp zzbp = (zzbp) task.getResult();
        int zza2 = zzcl.zza(zzbp.status);
        if (!PlacesStatusCodes.isError(zza2)) {
            ArrayList arrayList = new ArrayList();
            if (zzbp.predictions != null) {
                zzck[] zzckArr = zzbp.predictions;
                for (zzck zzck : zzckArr) {
                    if (zzck.zzb() == null) {
                        throw new ApiException(new Status(8, "Unexpected server error: PlaceLikelihood returned without a Place value"));
                    } else if (zzck.zza() != null) {
                        zzcj zzb = zzck.zzb();
                        if (zzbp.htmlAttributions != null) {
                            zzgi = zzgi.zza((Object[]) zzbp.htmlAttributions);
                        } else {
                            zzgi = null;
                        }
                        arrayList.add(PlaceLikelihood.newInstance(zzci.zza(zzb, zzgi), zzck.zza().doubleValue()));
                    } else {
                        throw new ApiException(new Status(8, "Unexpected server error: PlaceLikelihood returned without a likelihood value"));
                    }
                }
            }
            return FindCurrentPlaceResponse.newInstance(arrayList);
        }
        throw new ApiException(new Status(zza2, zzcl.zza(zzbp.status, zzbp.errorMessage)));
    }
}
