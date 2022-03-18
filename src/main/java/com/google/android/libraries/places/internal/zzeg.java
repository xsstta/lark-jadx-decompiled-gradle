package com.google.android.libraries.places.internal;

import android.content.Intent;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.api.model.Place;

public final class zzeg {
    public static Place zza(Intent intent) {
        boolean z;
        try {
            zzft.zza(intent, "Intent must not be null.");
            Place place = (Place) intent.getParcelableExtra("places/selected_place");
            if (place != null) {
                z = true;
            } else {
                z = false;
            }
            zzft.zza(z, "Intent expected to contain a Place, but doesn't.");
            return place;
        } catch (Error | RuntimeException e) {
            zzdk.zza(e);
            throw e;
        }
    }

    public static Status zzb(Intent intent) {
        boolean z;
        try {
            zzft.zza(intent, "Intent must not be null.");
            Status status = (Status) intent.getParcelableExtra("places/status");
            if (status != null) {
                z = true;
            } else {
                z = false;
            }
            zzft.zza(z, "Intent expected to contain a Status, but doesn't.");
            return status;
        } catch (Error | RuntimeException e) {
            zzdk.zza(e);
            throw e;
        }
    }
}
