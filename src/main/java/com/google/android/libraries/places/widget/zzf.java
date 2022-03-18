package com.google.android.libraries.places.widget;

import android.view.View;

final /* synthetic */ class zzf implements View.OnClickListener {
    private final AutocompleteSupportFragment zza;

    zzf(AutocompleteSupportFragment autocompleteSupportFragment) {
        this.zza = autocompleteSupportFragment;
    }

    public final void onClick(View view) {
        this.zza.setText(null);
    }
}
