package com.google.android.libraries.places.widget;

import android.view.View;
import android.widget.EditText;
import androidx.lifecycle.AbstractC1178x;

final /* synthetic */ class zzi implements AbstractC1178x {
    private final AutocompleteSupportFragment zza;
    private final EditText zzb;
    private final View zzc;

    zzi(AutocompleteSupportFragment autocompleteSupportFragment, EditText editText, View view) {
        this.zza = autocompleteSupportFragment;
        this.zzb = editText;
        this.zzc = view;
    }

    @Override // androidx.lifecycle.AbstractC1178x
    public final void onChanged(Object obj) {
        this.zza.zzb(this.zzb, this.zzc, (CharSequence) obj);
    }
}
