package com.google.android.libraries.places.internal;

/* access modifiers changed from: package-private */
public final class zzfh extends zzfi {
    static final zzfh zza = new zzfh();

    @Override // com.google.android.libraries.places.internal.zzfd
    public final boolean zzb(char c) {
        return false;
    }

    private zzfh() {
        super("CharMatcher.none()");
    }

    @Override // com.google.android.libraries.places.internal.zzfd
    public final int zza(CharSequence charSequence, int i) {
        zzft.zza(i, charSequence.length(), "index");
        return -1;
    }
}
