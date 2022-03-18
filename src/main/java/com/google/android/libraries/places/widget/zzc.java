package com.google.android.libraries.places.widget;

import android.view.View;

final /* synthetic */ class zzc implements View.OnClickListener {
    private final AutocompleteFragment zza;

    zzc(AutocompleteFragment autocompleteFragment) {
        this.zza = autocompleteFragment;
    }

    public final void onClick(View view) {
        this.zza.setText("");
    }
}
