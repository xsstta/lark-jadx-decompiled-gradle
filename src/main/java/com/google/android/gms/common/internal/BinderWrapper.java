package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public final class BinderWrapper implements Parcelable {
    public static final Parcelable.Creator<BinderWrapper> CREATOR = new C21730aa();

    /* renamed from: a */
    private IBinder f52997a;

    public BinderWrapper() {
    }

    public final int describeContents() {
        return 0;
    }

    private BinderWrapper(Parcel parcel) {
        this.f52997a = parcel.readStrongBinder();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.f52997a);
    }

    /* synthetic */ BinderWrapper(Parcel parcel, C21730aa aaVar) {
        this(parcel);
    }
}
