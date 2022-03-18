package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

public class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GoogleSignInOptionsExtensionParcelable> CREATOR = new C21591c();

    /* renamed from: a */
    private final int f52507a;

    /* renamed from: b */
    private int f52508b;

    /* renamed from: c */
    private Bundle f52509c;

    GoogleSignInOptionsExtensionParcelable(int i, int i2, Bundle bundle) {
        this.f52507a = i;
        this.f52508b = i2;
        this.f52509c = bundle;
    }

    /* renamed from: a */
    public int mo73075a() {
        return this.f52508b;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.f52507a);
        SafeParcelWriter.writeInt(parcel, 2, mo73075a());
        SafeParcelWriter.writeBundle(parcel, 3, this.f52509c, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
