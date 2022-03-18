package com.google.android.libraries.places.widget;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.libraries.places.widget.internal.ui.AutocompleteImplFragment;

final /* synthetic */ class zza implements View.OnTouchListener {
    private final AutocompleteActivity zza;
    private final AutocompleteImplFragment zzb;

    zza(AutocompleteActivity autocompleteActivity, AutocompleteImplFragment autocompleteImplFragment) {
        this.zza = autocompleteActivity;
        this.zzb = autocompleteImplFragment;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.zza.zza(this.zzb, view, motionEvent);
    }
}
