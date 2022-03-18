package com.ss.android.vesdk.filterparam;

import android.os.Parcel;
import android.os.Parcelable;

public class VEAudioDspFilterParam extends VEBaseAudioFilterParam {
    public static final Parcelable.Creator<VEAudioDspFilterParam> CREATOR = new Parcelable.Creator<VEAudioDspFilterParam>() {
        /* class com.ss.android.vesdk.filterparam.VEAudioDspFilterParam.C639911 */

        /* renamed from: a */
        public VEAudioDspFilterParam[] newArray(int i) {
            return new VEAudioDspFilterParam[i];
        }

        /* renamed from: a */
        public VEAudioDspFilterParam createFromParcel(Parcel parcel) {
            return new VEAudioDspFilterParam(parcel);
        }
    };
    public String jsonDir;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam
    public int describeContents() {
        return super.describeContents();
    }

    public VEAudioDspFilterParam() {
        this.filterName = "audio dsp filter";
        this.jsonDir = "audio dsp use inbuilt json";
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam
    public String toString() {
        return "VEAudioDspFilterParam{jsonPath='" + this.jsonDir + '\'' + '}';
    }

    protected VEAudioDspFilterParam(Parcel parcel) {
        super(parcel);
        this.jsonDir = parcel.readString();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.jsonDir);
    }
}
