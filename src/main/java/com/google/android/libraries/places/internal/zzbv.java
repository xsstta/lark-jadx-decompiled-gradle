package com.google.android.libraries.places.internal;

import android.location.Location;
import android.text.TextUtils;
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
import com.google.android.libraries.places.api.net.PlacesStatusCodes;

public final class zzbv implements zzy {
    private final zzda zza;
    private final zzdr zzb;
    private final zzx zzc;
    private final zzad zzd;
    private final zzcy zze;
    private final zzb zzf;
    private final zzbg zzg;
    private final zzbk zzh;
    private final zzbo zzi;
    private final zzbs zzj;

    @Override // com.google.android.libraries.places.internal.zzy
    public final Task<FetchPlaceResponse> zza(FetchPlaceRequest fetchPlaceRequest) {
        if (TextUtils.isEmpty(fetchPlaceRequest.getPlaceId())) {
            return Tasks.forException(new ApiException(new Status(PlacesStatusCodes.INVALID_REQUEST, "Place ID must not be empty.")));
        }
        if (fetchPlaceRequest.getPlaceFields().isEmpty()) {
            return Tasks.forException(new ApiException(new Status(PlacesStatusCodes.INVALID_REQUEST, "Place Fields must not be empty.")));
        }
        return this.zzc.zza(new zzbi(fetchPlaceRequest, this.zza.zzb(), this.zza.zza(), this.zza.zzc(), this.zzb), zzbh.class).continueWith(new zzcc(this)).continueWith(new zzcb(this, this.zzf.zza()));
    }

    @Override // com.google.android.libraries.places.internal.zzy
    public final Task<FetchPhotoResponse> zza(FetchPhotoRequest fetchPhotoRequest) {
        Integer maxWidth = fetchPhotoRequest.getMaxWidth();
        Integer maxHeight = fetchPhotoRequest.getMaxHeight();
        if (maxWidth == null && maxHeight == null) {
            return Tasks.forException(new ApiException(new Status(PlacesStatusCodes.INVALID_REQUEST, "Must include max width or max height in request.")));
        }
        if (maxWidth != null && maxWidth.intValue() <= 0) {
            return Tasks.forException(new ApiException(new Status(PlacesStatusCodes.INVALID_REQUEST, String.format("Max Width must not be < 1, but was: %d.", maxWidth))));
        } else if (maxHeight == null || maxHeight.intValue() > 0) {
            return this.zzd.zza(new zzbc(fetchPhotoRequest, this.zza.zza(), this.zza.zzc(), this.zzb), new zzbd()).continueWith(new zzca(this)).continueWith(new zzbz(this, this.zzf.zza()));
        } else {
            return Tasks.forException(new ApiException(new Status(PlacesStatusCodes.INVALID_REQUEST, String.format("Max Height must not be < 1, but was: %d.", maxHeight))));
        }
    }

    @Override // com.google.android.libraries.places.internal.zzy
    public final Task<FindAutocompletePredictionsResponse> zza(FindAutocompletePredictionsRequest findAutocompletePredictionsRequest) {
        String query = findAutocompletePredictionsRequest.getQuery();
        if (query == null || TextUtils.isEmpty(query.trim())) {
            return Tasks.forResult(FindAutocompletePredictionsResponse.newInstance(zzgi.zza()));
        }
        return this.zzc.zza(new zzbm(findAutocompletePredictionsRequest, this.zza.zzb(), this.zza.zza(), this.zza.zzc(), this.zzb), zzbl.class).continueWith(new zzby(this)).continueWith(new zzbx(this, this.zzf.zza()));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ FindCurrentPlaceResponse zza(long j, Task task) throws Exception {
        this.zze.zzc(task, j, this.zzf.zza());
        return (FindCurrentPlaceResponse) task.getResult();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ FetchPlaceResponse zzb(long j, Task task) throws Exception {
        this.zze.zzb(task, j, this.zzf.zza());
        return (FetchPlaceResponse) task.getResult();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ FetchPhotoResponse zzc(long j, Task task) throws Exception {
        this.zze.zzd(task, j, this.zzf.zza());
        return (FetchPhotoResponse) task.getResult();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ FindAutocompletePredictionsResponse zzd(long j, Task task) throws Exception {
        this.zze.zza(task, j, this.zzf.zza());
        return (FindAutocompletePredictionsResponse) task.getResult();
    }

    @Override // com.google.android.libraries.places.internal.zzy
    public final Task<FindCurrentPlaceResponse> zza(FindCurrentPlaceRequest findCurrentPlaceRequest, Location location, zzgi<zzq> zzgi) {
        if (findCurrentPlaceRequest.getPlaceFields().isEmpty()) {
            return Tasks.forException(new ApiException(new Status(PlacesStatusCodes.INVALID_REQUEST, "Place Fields must not be empty.")));
        }
        return this.zzc.zza(new zzbq(findCurrentPlaceRequest, location, zzgi, this.zza.zzb(), this.zza.zza(), this.zza.zzc(), this.zzb), zzbp.class).continueWith(new zzce(this)).continueWith(new zzcd(this, this.zzf.zza()));
    }

    zzbv(zzda zzda, zzdr zzdr, zzx zzx, zzad zzad, zzcy zzcy, zzb zzb2, zzbg zzbg, zzbk zzbk, zzbo zzbo, zzbs zzbs) {
        this.zza = zzda;
        this.zzb = zzdr;
        this.zzc = zzx;
        this.zzd = zzad;
        this.zze = zzcy;
        this.zzf = zzb2;
        this.zzg = zzbg;
        this.zzh = zzbk;
        this.zzi = zzbo;
        this.zzj = zzbs;
    }
}
