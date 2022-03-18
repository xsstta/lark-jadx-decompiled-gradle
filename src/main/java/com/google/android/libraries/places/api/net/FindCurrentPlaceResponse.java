package com.google.android.libraries.places.api.net;

import com.google.android.libraries.places.api.model.PlaceLikelihood;
import com.google.android.libraries.places.internal.zzgi;
import java.util.Collection;
import java.util.List;

public abstract class FindCurrentPlaceResponse {
    public abstract List<PlaceLikelihood> getPlaceLikelihoods();

    public static FindCurrentPlaceResponse newInstance(List<PlaceLikelihood> list) {
        return new zzo(zzgi.zza((Collection) list));
    }
}
