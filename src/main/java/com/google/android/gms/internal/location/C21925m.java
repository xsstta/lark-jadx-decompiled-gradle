package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.AbstractC21631d;
import com.google.android.gms.common.api.AbstractC21635e;
import com.google.android.gms.location.AbstractC21953h;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResult;

/* renamed from: com.google.android.gms.internal.location.m */
public final class C21925m implements AbstractC21953h {
    @Override // com.google.android.gms.location.AbstractC21953h
    /* renamed from: a */
    public final AbstractC21635e<LocationSettingsResult> mo74048a(AbstractC21631d dVar, LocationSettingsRequest locationSettingsRequest) {
        return dVar.mo73261a(new C21926n(this, dVar, locationSettingsRequest, null));
    }
}
