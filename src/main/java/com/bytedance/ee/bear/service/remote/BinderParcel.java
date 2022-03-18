package com.bytedance.ee.bear.service.remote;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public class BinderParcel implements Parcelable {
    public static final Parcelable.Creator<BinderParcel> CREATOR = new Parcelable.Creator<BinderParcel>() {
        /* class com.bytedance.ee.bear.service.remote.BinderParcel.C109371 */

        /* renamed from: a */
        public BinderParcel[] newArray(int i) {
            return new BinderParcel[i];
        }

        /* renamed from: a */
        public BinderParcel createFromParcel(Parcel parcel) {
            return new BinderParcel(parcel);
        }
    };

    /* renamed from: a */
    private final IBinder f29424a;

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public IBinder mo41529a() {
        return this.f29424a;
    }

    public BinderParcel(IBinder iBinder) {
        this.f29424a = iBinder;
    }

    public BinderParcel(Parcel parcel) {
        this.f29424a = parcel.readStrongBinder();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.f29424a);
    }
}
