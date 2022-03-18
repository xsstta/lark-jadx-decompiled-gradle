package com.ss.android.vesdk.filterparam;

import android.os.Parcel;
import android.os.Parcelable;

public class VEAudioNoiseFilterParam extends VEBaseAudioFilterParam {
    public static final Parcelable.Creator<VEAudioNoiseFilterParam> CREATOR = new Parcelable.Creator<VEAudioNoiseFilterParam>() {
        /* class com.ss.android.vesdk.filterparam.VEAudioNoiseFilterParam.C639951 */

        /* renamed from: a */
        public VEAudioNoiseFilterParam[] newArray(int i) {
            return new VEAudioNoiseFilterParam[i];
        }

        /* renamed from: a */
        public VEAudioNoiseFilterParam createFromParcel(Parcel parcel) {
            return new VEAudioNoiseFilterParam(parcel);
        }
    };
    public boolean enable;
    public String modelPath;
    public float noiseMode;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam
    public int describeContents() {
        return 0;
    }

    public VEAudioNoiseFilterParam() {
        this.filterName = "audio noise";
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam
    public String toString() {
        return "VEAudioNoiseFilterParam{filterType=" + this.filterType + ", filterName='" + this.filterName + ", filterDurationType=" + this.filterDurationType + ", noiseMode=" + this.noiseMode + ", modelPath=" + this.modelPath + '}';
    }

    protected VEAudioNoiseFilterParam(Parcel parcel) {
        super(parcel);
        this.noiseMode = parcel.readFloat();
        this.modelPath = parcel.readString();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.noiseMode);
        parcel.writeString(this.modelPath);
    }
}
