package com.google.android.libraries.places.internal;

import com.google.android.gms.tasks.Task;
import com.google.android.libraries.places.api.net.FetchPhotoRequest;
import com.google.android.libraries.places.api.net.FetchPhotoResponse;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import com.google.android.libraries.places.api.net.FetchPlaceResponse;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse;
import com.google.android.libraries.places.api.net.FindCurrentPlaceRequest;
import com.google.android.libraries.places.api.net.FindCurrentPlaceResponse;

public interface zzcy {
    void zza(Task<FindAutocompletePredictionsResponse> task, long j, long j2);

    void zza(FetchPhotoRequest fetchPhotoRequest);

    void zza(FetchPlaceRequest fetchPlaceRequest);

    void zza(FindAutocompletePredictionsRequest findAutocompletePredictionsRequest);

    void zza(FindCurrentPlaceRequest findCurrentPlaceRequest, Task<FindCurrentPlaceResponse> task, long j, long j2);

    void zzb(Task<FetchPlaceResponse> task, long j, long j2);

    void zzc(Task<FindCurrentPlaceResponse> task, long j, long j2);

    void zzd(Task<FetchPhotoResponse> task, long j, long j2);
}
