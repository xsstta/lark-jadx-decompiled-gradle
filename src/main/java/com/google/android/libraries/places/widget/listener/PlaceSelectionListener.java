package com.google.android.libraries.places.widget.listener;

import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.model.Place;

public interface PlaceSelectionListener {
    void onError(Status status);

    void onPlaceSelected(Place place);
}
