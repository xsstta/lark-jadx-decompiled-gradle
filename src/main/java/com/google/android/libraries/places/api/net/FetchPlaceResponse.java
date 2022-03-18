package com.google.android.libraries.places.api.net;

import com.google.android.libraries.places.api.model.Place;

public abstract class FetchPlaceResponse {
    public abstract Place getPlace();

    public static FetchPlaceResponse newInstance(Place place) {
        return new zzg(place);
    }
}
