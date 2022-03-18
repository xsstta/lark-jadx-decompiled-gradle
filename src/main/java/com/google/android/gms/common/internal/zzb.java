package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public final class zzb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzb> CREATOR = new C21731ab();

    /* renamed from: a */
    Bundle f53115a;

    /* renamed from: b */
    Feature[] f53116b;

    zzb(Bundle bundle, Feature[] featureArr) {
        this.f53115a = bundle;
        this.f53116b = featureArr;
    }

    public zzb() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBundle(parcel, 1, this.f53115a, false);
        SafeParcelWriter.writeTypedArray(parcel, 2, this.f53116b, i, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
