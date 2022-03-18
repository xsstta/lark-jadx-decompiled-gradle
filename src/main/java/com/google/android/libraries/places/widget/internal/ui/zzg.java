package com.google.android.libraries.places.widget.internal.ui;

import androidx.activity.AbstractC0203c;

/* access modifiers changed from: package-private */
public final class zzg extends AbstractC0203c {
    private final /* synthetic */ AutocompleteImplFragment zza;

    @Override // androidx.activity.AbstractC0203c
    public final void handleOnBackPressed() {
        this.zza.zze.zzf();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzg(AutocompleteImplFragment autocompleteImplFragment, boolean z) {
        super(true);
        this.zza = autocompleteImplFragment;
    }
}
