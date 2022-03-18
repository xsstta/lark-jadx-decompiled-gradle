package com.google.android.libraries.places.internal;

import android.text.TextUtils;
import com.google.android.gms.tasks.C22090b;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.api.model.AutocompleteSessionToken;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import com.google.android.libraries.places.api.net.FetchPlaceResponse;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse;
import com.google.android.libraries.places.api.net.PlacesClient;
import java.util.List;

public final class zzen implements zzek {
    private static final zzgi<Place.Field> zza = zzgi.zza(Place.Field.ID, Place.Field.TYPES);
    private final PlacesClient zzb;
    private final zzed zzc;
    private final AutocompleteSessionToken zzd;
    private zzer zze;
    private zzeq zzf;

    @Override // com.google.android.libraries.places.internal.zzek
    public final void zza() {
        zzer zzer = this.zze;
        if (zzer != null) {
            zzer.zza().mo75040b();
        }
        zzeq zzeq = this.zzf;
        if (zzeq != null) {
            zzeq.zza().mo75040b();
        }
        this.zze = null;
        this.zzf = null;
    }

    @Override // com.google.android.libraries.places.internal.zzek
    public final Task<FetchPlaceResponse> zza(AutocompletePrediction autocompletePrediction) {
        List<Place.Type> list;
        if (zza.containsAll(this.zzc.zzb())) {
            Place.Builder id = Place.builder().setId(autocompletePrediction.getPlaceId());
            if (autocompletePrediction.getPlaceTypes().isEmpty()) {
                list = null;
            } else {
                list = autocompletePrediction.getPlaceTypes();
            }
            return Tasks.forResult(FetchPlaceResponse.newInstance(id.setTypes(list).build()));
        }
        zzeq zzeq = this.zzf;
        if (zzeq != null) {
            if (zzeq.zzb().equals(autocompletePrediction.getPlaceId())) {
                return (Task) zzft.zza(zzeq.zzc());
            }
            zzeq.zza().mo75040b();
        }
        zzel zzel = new zzel(new C22090b(), autocompletePrediction.getPlaceId());
        this.zzf = zzel;
        Task<TContinuationResult> continueWithTask = this.zzb.fetchPlace(FetchPlaceRequest.builder(autocompletePrediction.getPlaceId(), this.zzc.zzb()).setSessionToken(this.zzd).setCancellationToken(zzel.zza().mo75039a()).build()).continueWithTask(new zzep(zzel));
        zzel.zza(continueWithTask);
        return continueWithTask;
    }

    @Override // com.google.android.libraries.places.internal.zzek
    public final Task<FindAutocompletePredictionsResponse> zza(String str) {
        zzft.zza(!TextUtils.isEmpty(str));
        zzer zzer = this.zze;
        if (zzer != null) {
            if (zzer.zzb().equals(str)) {
                return (Task) zzft.zza(zzer.zzc());
            }
            zzer.zza().mo75040b();
        }
        zzei zzei = new zzei(new C22090b(), str);
        this.zze = zzei;
        Task<TContinuationResult> continueWithTask = this.zzb.findAutocompletePredictions(FindAutocompletePredictionsRequest.builder().setQuery(str).setLocationBias(this.zzc.zzf()).setLocationRestriction(this.zzc.zzg()).setCountries(this.zzc.zzh()).setTypeFilter(this.zzc.zzi()).setSessionToken(this.zzd).setCancellationToken(zzei.zza().mo75039a()).build()).continueWithTask(new zzem(zzei));
        zzei.zza(continueWithTask);
        return continueWithTask;
    }

    static final /* synthetic */ Task zza(zzeq zzeq, Task task) throws Exception {
        if (zzeq.zza().mo75039a().mo75030a()) {
            return Tasks.forCanceled();
        }
        return task;
    }

    static final /* synthetic */ Task zza(zzer zzer, Task task) throws Exception {
        if (zzer.zza().mo75039a().mo75030a()) {
            return Tasks.forCanceled();
        }
        return task;
    }

    public zzen(PlacesClient placesClient, zzed zzed, AutocompleteSessionToken autocompleteSessionToken) {
        this.zzb = placesClient;
        this.zzc = zzed;
        this.zzd = autocompleteSessionToken;
    }
}
