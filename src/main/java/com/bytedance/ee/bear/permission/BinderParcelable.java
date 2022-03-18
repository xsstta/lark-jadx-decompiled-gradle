package com.bytedance.ee.bear.permission;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public class BinderParcelable implements Parcelable {
    public static final Parcelable.Creator<BinderParcelable> CREATOR = new Parcelable.Creator<BinderParcelable>() {
        /* class com.bytedance.ee.bear.permission.BinderParcelable.C104691 */

        /* renamed from: a */
        public BinderParcelable[] newArray(int i) {
            return new BinderParcelable[i];
        }

        /* renamed from: a */
        public BinderParcelable createFromParcel(Parcel parcel) {
            return new BinderParcelable(parcel);
        }
    };

    /* renamed from: a */
    private IBinder f28164a;

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public IBinder mo39775a() {
        return this.f28164a;
    }

    public BinderParcelable(IBinder iBinder) {
        this.f28164a = iBinder;
    }

    protected BinderParcelable(Parcel parcel) {
        this.f28164a = parcel.readStrongBinder();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStrongBinder(this.f28164a);
    }
}
