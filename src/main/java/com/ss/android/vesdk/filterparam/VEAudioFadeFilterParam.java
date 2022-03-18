package com.ss.android.vesdk.filterparam;

import android.os.Parcel;
import android.os.Parcelable;

public class VEAudioFadeFilterParam extends VEBaseAudioFilterParam {
    public static final Parcelable.Creator<VEAudioFadeFilterParam> CREATOR = new Parcelable.Creator<VEAudioFadeFilterParam>() {
        /* class com.ss.android.vesdk.filterparam.VEAudioFadeFilterParam.C639931 */

        /* renamed from: a */
        public VEAudioFadeFilterParam[] newArray(int i) {
            return new VEAudioFadeFilterParam[i];
        }

        /* renamed from: a */
        public VEAudioFadeFilterParam createFromParcel(Parcel parcel) {
            return new VEAudioFadeFilterParam(parcel);
        }
    };
    public int fadeInLength;
    public int fadeOutLength;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam
    public int describeContents() {
        return 0;
    }

    public VEAudioFadeFilterParam() {
        this.filterName = "audio fading";
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam
    public String toString() {
        return "VEAudioFadeFilterParam{fadeInLength=" + this.fadeInLength + ", fadeOutLength=" + this.fadeOutLength + ", filterType=" + this.filterType + ", filterName='" + this.filterName + '\'' + ", filterDurationType=" + this.filterDurationType + '}';
    }

    protected VEAudioFadeFilterParam(Parcel parcel) {
        super(parcel);
        this.fadeInLength = parcel.readInt();
        this.fadeOutLength = parcel.readInt();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.fadeInLength);
        parcel.writeInt(this.fadeOutLength);
    }
}
