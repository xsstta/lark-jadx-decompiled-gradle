package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.AbstractC21641i;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class LocationSettingsResult extends AbstractSafeParcelable implements AbstractC21641i {
    public static final Parcelable.Creator<LocationSettingsResult> CREATOR = new C21961p();

    /* renamed from: a */
    private final Status f53420a;

    /* renamed from: b */
    private final LocationSettingsStates f53421b;

    public LocationSettingsResult(Status status) {
        this(status, null);
    }

    public LocationSettingsResult(Status status, LocationSettingsStates locationSettingsStates) {
        this.f53420a = status;
        this.f53421b = locationSettingsStates;
    }

    /* renamed from: a */
    public final LocationSettingsStates mo74337a() {
        return this.f53421b;
    }

    @Override // com.google.android.gms.common.api.AbstractC21641i
    public final Status getStatus() {
        return this.f53420a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, getStatus(), i, false);
        SafeParcelWriter.writeParcelable(parcel, 2, mo74337a(), i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
