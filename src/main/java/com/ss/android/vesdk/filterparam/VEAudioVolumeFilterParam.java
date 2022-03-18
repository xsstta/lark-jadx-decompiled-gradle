package com.ss.android.vesdk.filterparam;

import android.os.Parcel;
import android.os.Parcelable;

public class VEAudioVolumeFilterParam extends VEBaseAudioFilterParam {
    public static final Parcelable.Creator<VEAudioVolumeFilterParam> CREATOR = new Parcelable.Creator<VEAudioVolumeFilterParam>() {
        /* class com.ss.android.vesdk.filterparam.VEAudioVolumeFilterParam.C639961 */

        /* renamed from: a */
        public VEAudioVolumeFilterParam[] newArray(int i) {
            return new VEAudioVolumeFilterParam[i];
        }

        /* renamed from: a */
        public VEAudioVolumeFilterParam createFromParcel(Parcel parcel) {
            return new VEAudioVolumeFilterParam(parcel);
        }
    };
    public float volume;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam
    public int describeContents() {
        return 0;
    }

    public VEAudioVolumeFilterParam() {
        this.filterName = "audio volume filter";
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam
    public String toString() {
        return "VEAudioVolumeFilterParam{volume=" + this.volume + ", filterType=" + this.filterType + ", filterName='" + this.filterName + '\'' + ", filterDurationType=" + this.filterDurationType + '}';
    }

    protected VEAudioVolumeFilterParam(Parcel parcel) {
        super(parcel);
        this.volume = parcel.readFloat();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.volume);
    }
}
