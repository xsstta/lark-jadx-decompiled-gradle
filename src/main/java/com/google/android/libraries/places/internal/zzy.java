package com.google.android.libraries.places.internal;

import android.location.Location;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.places.api.net.FetchPhotoRequest;
import com.google.android.libraries.places.api.net.FetchPhotoResponse;
import com.google.android.libraries.places.api.net.FetchPlaceRequest;
import com.google.android.libraries.places.api.net.FetchPlaceResponse;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsRequest;
import com.google.android.libraries.places.api.net.FindAutocompletePredictionsResponse;
import com.google.android.libraries.places.api.net.FindCurrentPlaceRequest;
import com.google.android.libraries.places.api.net.FindCurrentPlaceResponse;

public interface zzy {
    Task<FetchPhotoResponse> zza(FetchPhotoRequest fetchPhotoRequest);

    Task<FetchPlaceResponse> zza(FetchPlaceRequest fetchPlaceRequest);

    Task<FindAutocompletePredictionsResponse> zza(FindAutocompletePredictionsRequest findAutocompletePredictionsRequest);

    Task<FindCurrentPlaceResponse> zza(FindCurrentPlaceRequest findCurrentPlaceRequest, Location location, zzgi<zzq> zzgi);
}
