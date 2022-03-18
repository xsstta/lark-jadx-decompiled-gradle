package com.google.android.libraries.places.widget.internal.ui;

import androidx.recyclerview.widget.RecyclerView;
import com.google.android.libraries.places.internal.zzdk;

final class zzf extends RecyclerView.OnScrollListener {
    private final /* synthetic */ AutocompleteImplFragment zza;

    zzf(AutocompleteImplFragment autocompleteImplFragment) {
        this.zza = autocompleteImplFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        if (i == 1) {
            try {
                this.zza.zze.zzb();
                this.zza.zzg.clearFocus();
            } catch (Error | RuntimeException e) {
                zzdk.zza(e);
                throw e;
            }
        }
    }
}
