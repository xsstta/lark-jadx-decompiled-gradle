package com.google.android.libraries.places.internal;

import android.net.wifi.ScanResult;
import java.util.Comparator;

/* access modifiers changed from: package-private */
public final /* synthetic */ class zzr implements Comparator {
    static final Comparator zza = new zzr();

    private zzr() {
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return zzs.zza((ScanResult) obj, (ScanResult) obj2);
    }
}
