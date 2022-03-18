package com.google.android.libraries.places.internal;

import android.location.Location;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.libraries.places.api.net.FetchPhotoRequest;
import com.google.android.libraries.places.api.net.FetchPhotoResponse;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import com.google.android.libraries.places.api.net.FetchPlaceResponse;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse;
import com.google.android.libraries.places.api.net.FindCurrentPlaceRequest;
import com.google.android.libraries.places.api.net.FindCurrentPlaceResponse;
import com.google.android.libraries.places.api.net.PlacesClient;

public final class zzaq implements PlacesClient {
    private final zzy zza;
    private final zzk zzb;
    private final zzs zzc;
    private final zzcy zzd;
    private final zzb zze;

    static final /* synthetic */ Task zza(Task task) {
        ApiException apiException;
        Exception exception = task.getException();
        if (exception == null) {
            return task;
        }
        if (exception instanceof ApiException) {
            apiException = (ApiException) exception;
        } else {
            apiException = new ApiException(new Status(13, exception.toString()));
        }
        return Tasks.forException(apiException);
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final Task<FetchPhotoResponse> fetchPhoto(FetchPhotoRequest fetchPhotoRequest) {
        try {
            zzft.zza(fetchPhotoRequest, "Request must not be null.");
            return this.zza.zza(fetchPhotoRequest).continueWith(new zzar(this, fetchPhotoRequest, zzf.zza().zzb())).continueWithTask(zzau.zza);
        } catch (Error | RuntimeException e) {
            zzdk.zza(e);
            throw e;
        }
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final Task<FetchPlaceResponse> fetchPlace(FetchPlaceRequest fetchPlaceRequest) {
        try {
            zzft.zza(fetchPlaceRequest, "Request must not be null.");
            return this.zza.zza(fetchPlaceRequest).continueWith(new zzat(this, fetchPlaceRequest, zzf.zza().zzb())).continueWithTask(zzaw.zza);
        } catch (Error | RuntimeException e) {
            zzdk.zza(e);
            throw e;
        }
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final Task<FindAutocompletePredictionsResponse> findAutocompletePredictions(FindAutocompletePredictionsRequest findAutocompletePredictionsRequest) {
        try {
            zzft.zza(findAutocompletePredictionsRequest, "Request must not be null.");
            return this.zza.zza(findAutocompletePredictionsRequest).continueWith(new zzap(this, findAutocompletePredictionsRequest, zzf.zza().zzb())).continueWithTask(zzas.zza);
        } catch (Error | RuntimeException e) {
            zzdk.zza(e);
            throw e;
        }
    }

    @Override // com.google.android.libraries.places.api.net.PlacesClient
    public final Task<FindCurrentPlaceResponse> findCurrentPlace(FindCurrentPlaceRequest findCurrentPlaceRequest) {
        try {
            zzft.zza(findCurrentPlaceRequest, "Request must not be null.");
            return this.zzb.zza(findCurrentPlaceRequest.getCancellationToken()).onSuccessTask(new zzav(this, findCurrentPlaceRequest)).continueWith(new zzay(this, findCurrentPlaceRequest, this.zze.zza(), zzf.zza().zzb())).continueWithTask(zzax.zza);
        } catch (Error | RuntimeException e) {
            zzdk.zza(e);
            throw e;
        }
    }

    public final /* synthetic */ Task zza(FindCurrentPlaceRequest findCurrentPlaceRequest, Location location) {
        return this.zza.zza(findCurrentPlaceRequest, location, this.zzc.zza());
    }

    private static void zza(zzh zzh, zzg zzg) {
        if (zzg != null) {
            zzf.zza().zza(zzg, zzh.zza(zzh, zzh.zza("Duration")));
        }
        zzf.zza().zza(zzh);
        zzf.zza().zzb(zzh.zza(zzh, zzh.zza("Battery")));
    }

    public final /* synthetic */ FetchPhotoResponse zza(FetchPhotoRequest fetchPhotoRequest, zzg zzg, Task task) {
        this.zzd.zza(fetchPhotoRequest);
        zza(zzh.zza("FetchPhoto"), zzg);
        return (FetchPhotoResponse) task.getResult();
    }

    public final /* synthetic */ FetchPlaceResponse zza(FetchPlaceRequest fetchPlaceRequest, zzg zzg, Task task) {
        this.zzd.zza(fetchPlaceRequest);
        zza(zzh.zza("FetchPlace"), zzg);
        return (FetchPlaceResponse) task.getResult();
    }

    public final /* synthetic */ FindAutocompletePredictionsResponse zza(FindAutocompletePredictionsRequest findAutocompletePredictionsRequest, zzg zzg, Task task) {
        this.zzd.zza(findAutocompletePredictionsRequest);
        zza(zzh.zza("FindAutocompletePredictions"), zzg);
        return (FindAutocompletePredictionsResponse) task.getResult();
    }

    public final /* synthetic */ FindCurrentPlaceResponse zza(FindCurrentPlaceRequest findCurrentPlaceRequest, long j, zzg zzg, Task task) {
        this.zzd.zza(findCurrentPlaceRequest, task, j, this.zze.zza());
        zza(zzh.zza("FindCurrentPlace"), zzg);
        return (FindCurrentPlaceResponse) task.getResult();
    }

    zzaq(zzy zzy, zzk zzk, zzs zzs, zzcy zzcy, zzb zzb2) {
        this.zza = zzy;
        this.zzb = zzk;
        this.zzc = zzs;
        this.zzd = zzcy;
        this.zze = zzb2;
    }
}
