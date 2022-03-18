package com.ss.android.vc.irtc;

import android.os.Parcel;
import android.os.Parcelable;

public class SubChannelInfo implements Parcelable {
    public static final Parcelable.Creator<SubChannelInfo> CREATOR = new Parcelable.Creator<SubChannelInfo>() {
        /* class com.ss.android.vc.irtc.SubChannelInfo.C610191 */

        /* renamed from: a */
        public SubChannelInfo[] newArray(int i) {
            return new SubChannelInfo[i];
        }

        /* renamed from: a */
        public SubChannelInfo createFromParcel(Parcel parcel) {
            return new SubChannelInfo(parcel);
        }
    };

    /* renamed from: a */
    public String f152905a;

    /* renamed from: b */
    public double f152906b;

    public int describeContents() {
        return 0;
    }

    protected SubChannelInfo(Parcel parcel) {
        this.f152905a = parcel.readString();
        this.f152906b = parcel.readDouble();
    }

    public SubChannelInfo(String str, double d) {
        this.f152905a = str;
        this.f152906b = d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f152905a);
        parcel.writeDouble(this.f152906b);
    }
}
