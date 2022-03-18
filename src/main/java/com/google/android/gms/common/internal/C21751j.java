package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.C21608a;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.C21611a;

/* renamed from: com.google.android.gms.common.internal.j */
public class C21751j {

    /* renamed from: a */
    private final SparseIntArray f53093a;

    /* renamed from: b */
    private GoogleApiAvailabilityLight f53094b;

    public C21751j() {
        this(C21608a.m78228a());
    }

    public C21751j(GoogleApiAvailabilityLight googleApiAvailabilityLight) {
        this.f53093a = new SparseIntArray();
        Preconditions.checkNotNull(googleApiAvailabilityLight);
        this.f53094b = googleApiAvailabilityLight;
    }

    /* renamed from: a */
    public int mo73724a(Context context, C21611a.AbstractC21622f fVar) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(fVar);
        int i = 0;
        if (!fVar.requiresGooglePlayServices()) {
            return 0;
        }
        int minApkVersion = fVar.getMinApkVersion();
        int i2 = this.f53093a.get(minApkVersion, -1);
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= this.f53093a.size()) {
                i = i2;
                break;
            }
            int keyAt = this.f53093a.keyAt(i3);
            if (keyAt > minApkVersion && this.f53093a.get(keyAt) == 0) {
                break;
            }
            i3++;
        }
        if (i == -1) {
            i = this.f53094b.isGooglePlayServicesAvailable(context, minApkVersion);
        }
        this.f53093a.put(minApkVersion, i);
        return i;
    }

    /* renamed from: a */
    public void mo73725a() {
        this.f53093a.clear();
    }
}
