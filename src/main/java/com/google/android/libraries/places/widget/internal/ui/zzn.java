package com.google.android.libraries.places.widget.internal.ui;

import androidx.recyclerview.widget.C1374g;
import com.google.android.libraries.places.api.model.AutocompletePrediction;
import com.google.android.libraries.places.internal.zzdk;

final class zzn extends C1374g.AbstractC1378c<AutocompletePrediction> {
    private zzn() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // androidx.recyclerview.widget.C1374g.AbstractC1378c
    public final /* synthetic */ boolean areContentsTheSame(AutocompletePrediction autocompletePrediction, AutocompletePrediction autocompletePrediction2) {
        return autocompletePrediction.equals(autocompletePrediction2);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // androidx.recyclerview.widget.C1374g.AbstractC1378c
    public final /* synthetic */ boolean areItemsTheSame(AutocompletePrediction autocompletePrediction, AutocompletePrediction autocompletePrediction2) {
        return zza(autocompletePrediction, autocompletePrediction2);
    }

    private static boolean zza(AutocompletePrediction autocompletePrediction, AutocompletePrediction autocompletePrediction2) {
        try {
            return autocompletePrediction.getPlaceId().equals(autocompletePrediction2.getPlaceId());
        } catch (Error | RuntimeException e) {
            zzdk.zza(e);
            throw e;
        }
    }
}
