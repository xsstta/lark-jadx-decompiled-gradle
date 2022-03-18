package com.google.android.libraries.places.internal;

import android.text.TextUtils;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse;
import com.google.android.libraries.places.api.net.PlacesStatusCodes;
import com.google.android.libraries.places.internal.zzaz;
import java.util.ArrayList;
import java.util.List;

public final class zzbo {
    zzbo() {
    }

    private static List<AutocompletePrediction.zza> zza(List<zzaz.zza> list) throws ApiException {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (zzaz.zza zza : list) {
            if (zza == null || zza.offset == null || zza.length == null) {
                throw new ApiException(new Status(8, "Unexpected server error: Place ID not provided for an autocomplete prediction result"));
            }
            arrayList.add(AutocompletePrediction.zza.zzc().zza(zza.offset.intValue()).zzb(zza.length.intValue()).zza());
        }
        return arrayList;
    }

    public static FindAutocompletePredictionsResponse zza(zzbl zzbl) throws ApiException {
        int zza = zzcl.zza(zzbl.status);
        if (!PlacesStatusCodes.isError(zza)) {
            ArrayList arrayList = new ArrayList();
            if (zzbl.predictions != null) {
                zzaz[] zzazArr = zzbl.predictions;
                for (zzaz zzaz : zzazArr) {
                    if (zzaz == null || TextUtils.isEmpty(zzaz.zzc())) {
                        throw new ApiException(new Status(8, "Unexpected server error: Place ID not provided for an autocomplete prediction result"));
                    }
                    AutocompletePrediction.Builder zza2 = AutocompletePrediction.builder(zzaz.zzc()).zza(zzaz.zzb()).setPlaceTypes(zzci.zzb(zzci.zza(zzaz.zze()))).setFullText(zzfz.zza(zzaz.zza())).zza(zza(zzaz.zzf()));
                    zzaz.zzb zzd = zzaz.zzd();
                    if (zzd != null) {
                        zza2.setPrimaryText(zzfz.zza(zzd.zza())).zzb(zza(zzd.zzc())).setSecondaryText(zzfz.zza(zzd.zzb())).zzc(zza(zzd.zzd()));
                    }
                    arrayList.add(zza2.build());
                }
            }
            return FindAutocompletePredictionsResponse.newInstance(arrayList);
        }
        throw new ApiException(new Status(zza, zzcl.zza(zzbl.status, zzbl.errorMessage)));
    }
}
