package com.ss.android.lark.littleapp;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public class BinderParcel implements Parcelable {
    public static final Parcelable.Creator<BinderParcel> CREATOR = new Parcelable.Creator<BinderParcel>() {
        /* class com.ss.android.lark.littleapp.BinderParcel.C412961 */

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
    private final IBinder f105084a;

    public int describeContents() {
        return 0;
    }

    public BinderParcel(Parcel parcel) {
        this.f105084a = parcel.readStrongBinder();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.f105084a);
    }
}
