package com.ss.android.vesdk.model;

import android.os.Parcel;
import android.os.Parcelable;

public class VEPrePlayParams implements Parcelable {
    public static final Parcelable.Creator<VEPrePlayParams> CREATOR = new Parcelable.Creator<VEPrePlayParams>() {
        /* class com.ss.android.vesdk.model.VEPrePlayParams.C640331 */

        /* renamed from: a */
        public VEPrePlayParams[] newArray(int i) {
            return new VEPrePlayParams[i];
        }

        /* renamed from: a */
        public VEPrePlayParams createFromParcel(Parcel parcel) {
            return new VEPrePlayParams(parcel);
        }
    };

    /* renamed from: a */
    public int f161680a;

    /* renamed from: b */
    public boolean f161681b;

    /* renamed from: c */
    public int f161682c;

    public int describeContents() {
        return 0;
    }

    public VEPrePlayParams() {
    }

    protected VEPrePlayParams(Parcel parcel) {
        boolean z;
        this.f161680a = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f161681b = z;
        this.f161682c = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f161680a);
        parcel.writeByte(this.f161681b ? (byte) 1 : 0);
        parcel.writeInt(this.f161682c);
    }
}
