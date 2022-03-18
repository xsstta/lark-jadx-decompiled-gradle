package com.google.android.libraries.places.widget;

import android.view.View;
import android.widget.EditText;
import androidx.lifecycle.AbstractC1178x;

final /* synthetic */ class zzh implements AbstractC1178x {
    private final EditText zza;
    private final View zzb;

    zzh(EditText editText, View view) {
        this.zza = editText;
        this.zzb = view;
    }

    @Override // androidx.lifecycle.AbstractC1178x
    public final void onChanged(Object obj) {
        AutocompleteSupportFragment.zza(this.zza, this.zzb, (CharSequence) obj);
    }
}
