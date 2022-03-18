package com.tt.miniapp.uniquechannel;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public class BinderWrapper implements Parcelable {
    public static final Parcelable.Creator<BinderWrapper> CREATOR = new Parcelable.Creator<BinderWrapper>() {
        /* class com.tt.miniapp.uniquechannel.BinderWrapper.C670011 */

        /* renamed from: a */
        public BinderWrapper[] newArray(int i) {
            return new BinderWrapper[i];
        }

        /* renamed from: a */
        public BinderWrapper createFromParcel(Parcel parcel) {
            return new BinderWrapper(parcel);
        }
    };

    /* renamed from: a */
    private final IBinder f168955a;

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public IBinder mo233052a() {
        return this.f168955a;
    }

    public BinderWrapper(IBinder iBinder) {
        this.f168955a = iBinder;
    }

    public BinderWrapper(Parcel parcel) {
        this.f168955a = parcel.readStrongBinder();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.f168955a);
    }
}
