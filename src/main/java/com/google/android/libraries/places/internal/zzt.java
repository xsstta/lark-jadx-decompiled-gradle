package com.google.android.libraries.places.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.places.api.net.FetchPhotoRequest;
import com.google.android.libraries.places.api.net.FetchPhotoResponse;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import com.google.android.libraries.places.api.net.FetchPlaceResponse;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse;
import com.google.android.libraries.places.api.net.FindCurrentPlaceRequest;
import com.google.android.libraries.places.api.net.FindCurrentPlaceResponse;
import com.google.android.libraries.places.internal.zzmh;
import java.util.Locale;

public final class zzt implements zzcy {
    private final zzdn zza;
    private final zzdj zzb;
    private final zzds zzc;

    private final zzmh.zzah.zza zza() {
        Locale zzb2 = this.zzc.zzb();
        Locale locale = Locale.getDefault();
        zzmh.zzah.zza zza2 = zzmh.zzah.zza().zza(zzb2.toString());
        if (!zzb2.equals(locale)) {
            zza2.zzb(locale.toString());
        }
        return zza2;
    }

    private final void zza(zzmh.zzs zzs) {
        this.zza.zza(zzdq.zza(zzs));
    }

    private final void zza(zzmh.zzi zzi) {
        zza((zzmh.zzs) ((zzqy) zzdq.zza(this.zzb).zza(zzmh.zzs.zzc.NETWORK_REQUEST_EVENT).zza(zzi).zzf()));
    }

    private static <ResponseT> zzmh.zzi.zzf zza(Task<ResponseT> task) {
        ApiException apiException;
        if (task.isSuccessful()) {
            return zzmh.zzi.zzf.SUCCESS;
        }
        Exception exception = task.getException();
        if (exception instanceof ApiException) {
            apiException = (ApiException) exception;
        } else {
            apiException = new ApiException(new Status(13, exception.getMessage()));
        }
        int statusCode = apiException.getStatusCode();
        if (statusCode == 7) {
            return zzmh.zzi.zzf.NETWORK_ERROR;
        }
        if (statusCode != 15) {
            return zzmh.zzi.zzf.INVALID;
        }
        return zzmh.zzi.zzf.TIMEOUT;
    }

    @Override // com.google.android.libraries.places.internal.zzcy
    public final void zza(FetchPhotoRequest fetchPhotoRequest) {
        zza((zzmh.zzs) ((zzqy) zzdq.zza(this.zzb).zza(zzmh.zzs.zzc.PLACE_PHOTO_QUERY).zza((zzmh.zzae) ((zzqy) zzmh.zzae.zza().zza(zzmh.zzae.zzb.PHOTO_IMAGE).zzf())).zzf()));
    }

    @Override // com.google.android.libraries.places.internal.zzcy
    public final void zza(FetchPlaceRequest fetchPlaceRequest) {
        zzmh.zzah.zza zza2 = zza().zza(zzmh.zzah.zzb.BY_ID);
        zzmh.zzs.zzb zza3 = zzdq.zza(this.zzb).zza(zzmh.zzs.zzc.PLACES_QUERY).zza((zzmh.zzah) ((zzqy) zza2.zza((zzmh.zzv) ((zzqy) zzmh.zzv.zza().zza(1).zza((zzmh.zzaf) ((zzqy) zzmh.zzaf.zza().zza(zzcm.zza(fetchPlaceRequest.getPlaceFields())).zzf())).zzf())).zzf()));
        if (fetchPlaceRequest.getSessionToken() != null) {
            zza3.zza(fetchPlaceRequest.getSessionToken().toString());
        }
        zza((zzmh.zzs) ((zzqy) zza3.zzf()));
    }

    @Override // com.google.android.libraries.places.internal.zzcy
    public final void zza(FindAutocompletePredictionsRequest findAutocompletePredictionsRequest) {
        zzmh.zzk.zza zza2 = zzmh.zzk.zza();
        if (findAutocompletePredictionsRequest.getTypeFilter() != null) {
            zza2.zza(zzcp.zza(findAutocompletePredictionsRequest.getTypeFilter()));
        }
        zzmh.zzk zzk = (zzmh.zzk) ((zzqy) zza2.zzf());
        zzmh.zzo.zza zza3 = zzmh.zzo.zza();
        if (zzk != null) {
            zza3.zza(zzk);
        }
        zzmh.zzah.zza zza4 = zza().zza(zzmh.zzah.zzb.AUTOCOMPLETE);
        zzmh.zzs.zzb zza5 = zzdq.zza(this.zzb).zza(zzmh.zzs.zzc.PLACES_QUERY).zza((zzmh.zzah) ((zzqy) zza4.zza((zzmh.zzo) ((zzqy) zza3.zzf())).zzf()));
        if (findAutocompletePredictionsRequest.getSessionToken() != null) {
            zza5.zza(findAutocompletePredictionsRequest.getSessionToken().toString());
        }
        zza((zzmh.zzs) ((zzqy) zza5.zzf()));
    }

    zzt(zzdn zzdn, zzdj zzdj, zzds zzds) {
        this.zza = zzdn;
        this.zzb = zzdj;
        this.zzc = zzds;
    }

    @Override // com.google.android.libraries.places.internal.zzcy
    public final void zzd(Task<FetchPhotoResponse> task, long j, long j2) {
        zza((zzmh.zzi) ((zzqy) zzmh.zzi.zza().zza(zzmh.zzi.zzd.GET_PHOTO).zza(zza(task)).zza((int) (j2 - j)).zzf()));
    }

    @Override // com.google.android.libraries.places.internal.zzcy
    public final void zzb(Task<FetchPlaceResponse> task, long j, long j2) {
        boolean isSuccessful = task.isSuccessful();
        zza((zzmh.zzi) ((zzqy) zzmh.zzi.zza().zza(zzmh.zzi.zzd.GET_PLACE_BY_ID).zza((zzmh.zzf) ((zzqy) zzmh.zzf.zza().zza(1).zzb(isSuccessful ? 1 : 0).zzf())).zza(zza(task)).zza((int) (j2 - j)).zzf()));
    }

    @Override // com.google.android.libraries.places.internal.zzcy
    public final void zzc(Task<FindCurrentPlaceResponse> task, long j, long j2) {
        int i;
        if (task.isSuccessful()) {
            i = task.getResult().getPlaceLikelihoods().size();
        } else {
            i = 0;
        }
        zza((zzmh.zzi) ((zzqy) zzmh.zzi.zza().zza(zzmh.zzi.zzd.ESTIMATE_PLACES_BY_LOCATION).zza((zzmh.zzb) ((zzqy) zzmh.zzb.zza().zza(i).zzf())).zza(zza(task)).zza((int) (j2 - j)).zzf()));
    }

    @Override // com.google.android.libraries.places.internal.zzcy
    public final void zza(Task<FindAutocompletePredictionsResponse> task, long j, long j2) {
        int i;
        if (task.isSuccessful()) {
            i = task.getResult().getAutocompletePredictions().size();
        } else {
            i = 0;
        }
        zza((zzmh.zzi) ((zzqy) zzmh.zzi.zza().zza(zzmh.zzi.zzd.GET_AUTOCOMPLETE_PREDICTIONS).zza((zzmh.zzd) ((zzqy) zzmh.zzd.zza().zza(i).zzf())).zza(zza(task)).zza((int) (j2 - j)).zzf()));
    }

    @Override // com.google.android.libraries.places.internal.zzcy
    public final void zza(FindCurrentPlaceRequest findCurrentPlaceRequest, Task<FindCurrentPlaceResponse> task, long j, long j2) {
        zzmh.zzy.zzb zzb2;
        if (task.isSuccessful()) {
            zzb2 = zzmh.zzy.zzb.NEARBY_SEARCH;
        } else {
            zzb2 = zzmh.zzy.zzb.NO_RESULT;
        }
        zza((zzmh.zzs) ((zzqy) zzdq.zza(this.zzb).zza(zzmh.zzs.zzc.GET_CURRENT_PLACE).zza((zzmh.zzy) ((zzqy) zzmh.zzy.zza().zza((zzmh.zzaf) ((zzqy) zzmh.zzaf.zza().zza(zzcm.zza(findCurrentPlaceRequest.getPlaceFields())).zzf())).zza((int) (j2 - j)).zza(zzb2).zzf())).zzf()));
    }
}
