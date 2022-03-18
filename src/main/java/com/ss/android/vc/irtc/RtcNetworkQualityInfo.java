package com.ss.android.vc.irtc;

import android.os.Parcel;
import android.os.Parcelable;

public class RtcNetworkQualityInfo implements Parcelable {
    public static final Parcelable.Creator<RtcNetworkQualityInfo> CREATOR = new Parcelable.Creator<RtcNetworkQualityInfo>() {
        /* class com.ss.android.vc.irtc.RtcNetworkQualityInfo.C610161 */

        /* renamed from: a */
        public RtcNetworkQualityInfo[] newArray(int i) {
            return new RtcNetworkQualityInfo[i];
        }

        /* renamed from: a */
        public RtcNetworkQualityInfo createFromParcel(Parcel parcel) {
            return new RtcNetworkQualityInfo(parcel.readDouble(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }
    };

    /* renamed from: a */
    public double f152890a;

    /* renamed from: b */
    public int f152891b;

    /* renamed from: c */
    public int f152892c;

    /* renamed from: d */
    public int f152893d;

    /* renamed from: e */
    public int f152894e;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.f152890a);
        parcel.writeInt(this.f152891b);
        parcel.writeInt(this.f152892c);
        parcel.writeInt(this.f152893d);
        parcel.writeInt(this.f152894e);
    }

    public RtcNetworkQualityInfo(double d, int i, int i2, int i3, int i4) {
        this.f152890a = d;
        this.f152891b = i;
        this.f152892c = i2;
        this.f152893d = i3;
        this.f152894e = i4;
    }
}
