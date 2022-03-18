package com.ss.android.vc.irtc;

import android.os.Parcel;
import android.os.Parcelable;

public class RtcUserNetworkQualityInfo implements Parcelable {
    public static final Parcelable.Creator<RtcUserNetworkQualityInfo> CREATOR = new Parcelable.Creator<RtcUserNetworkQualityInfo>() {
        /* class com.ss.android.vc.irtc.RtcUserNetworkQualityInfo.C610171 */

        /* renamed from: a */
        public RtcUserNetworkQualityInfo[] newArray(int i) {
            return new RtcUserNetworkQualityInfo[i];
        }

        /* renamed from: a */
        public RtcUserNetworkQualityInfo createFromParcel(Parcel parcel) {
            return new RtcUserNetworkQualityInfo(parcel.readString(), (double) parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }
    };

    /* renamed from: a */
    public String f152895a;

    /* renamed from: b */
    public double f152896b;

    /* renamed from: c */
    public int f152897c;

    /* renamed from: d */
    public int f152898d;

    /* renamed from: e */
    public int f152899e;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f152895a);
        parcel.writeDouble(this.f152896b);
        parcel.writeInt(this.f152897c);
        parcel.writeInt(this.f152898d);
        parcel.writeInt(this.f152899e);
    }

    public RtcUserNetworkQualityInfo(String str, double d, int i, int i2, int i3) {
        this.f152895a = str;
        this.f152896b = d;
        this.f152897c = i;
        this.f152898d = i2;
        this.f152899e = i3;
    }
}
