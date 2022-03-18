package com.ss.android.vesdk;

import android.os.Parcel;
import android.os.Parcelable;

public class VEVolumeParam implements Parcelable {
    public static final Parcelable.Creator<VEVolumeParam> CREATOR = new Parcelable.Creator<VEVolumeParam>() {
        /* class com.ss.android.vesdk.VEVolumeParam.C639181 */

        /* renamed from: a */
        public VEVolumeParam[] newArray(int i) {
            return new VEVolumeParam[i];
        }

        /* renamed from: a */
        public VEVolumeParam createFromParcel(Parcel parcel) {
            return new VEVolumeParam(parcel);
        }
    };

    /* renamed from: a */
    public int f161404a = -1;

    /* renamed from: b */
    public float f161405b = -1.0f;

    /* renamed from: c */
    public boolean f161406c;

    public int describeContents() {
        return 0;
    }

    public VEVolumeParam() {
    }

    protected VEVolumeParam(Parcel parcel) {
        boolean z;
        this.f161405b = parcel.readFloat();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f161406c = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f161405b);
        parcel.writeByte(this.f161406c ? (byte) 1 : 0);
    }
}
