package com.ss.android.vc.irtc;

import android.os.Parcel;
import android.os.Parcelable;

public class RtcAudioVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<RtcAudioVolumeInfo> CREATOR = new Parcelable.Creator<RtcAudioVolumeInfo>() {
        /* class com.ss.android.vc.irtc.RtcAudioVolumeInfo.C610151 */

        /* renamed from: a */
        public RtcAudioVolumeInfo[] newArray(int i) {
            return new RtcAudioVolumeInfo[i];
        }

        /* renamed from: a */
        public RtcAudioVolumeInfo createFromParcel(Parcel parcel) {
            return new RtcAudioVolumeInfo(parcel.readString(), parcel.readInt(), parcel.readInt());
        }
    };

    /* renamed from: a */
    public String f152887a;

    /* renamed from: b */
    public int f152888b;

    /* renamed from: c */
    public int f152889c;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f152887a);
        parcel.writeInt(this.f152888b);
        parcel.writeInt(this.f152889c);
    }

    public RtcAudioVolumeInfo(String str, int i, int i2) {
        this.f152887a = str;
        this.f152888b = i;
        this.f152889c = i2;
    }
}
