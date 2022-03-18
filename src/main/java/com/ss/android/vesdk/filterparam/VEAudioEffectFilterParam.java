package com.ss.android.vesdk.filterparam;

import android.os.Parcel;
import android.os.Parcelable;
import com.ss.android.vesdk.VEAudioEffectBean;

public class VEAudioEffectFilterParam extends VEBaseAudioFilterParam {
    public static final Parcelable.Creator<VEAudioEffectFilterParam> CREATOR = new Parcelable.Creator<VEAudioEffectFilterParam>() {
        /* class com.ss.android.vesdk.filterparam.VEAudioEffectFilterParam.C639921 */

        /* renamed from: a */
        public VEAudioEffectFilterParam[] newArray(int i) {
            return new VEAudioEffectFilterParam[i];
        }

        /* renamed from: a */
        public VEAudioEffectFilterParam createFromParcel(Parcel parcel) {
            return new VEAudioEffectFilterParam(parcel);
        }
    };
    public VEAudioEffectBean audioEffectBean;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam
    public int describeContents() {
        return 0;
    }

    public VEAudioEffectFilterParam() {
        this.filterName = "audio effect";
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam
    public String toString() {
        return "VEAudioEffectFilterParam{audioEffectBean=" + this.audioEffectBean + ", filterType=" + this.filterType + ", filterName='" + this.filterName + '\'' + ", filterDurationType=" + this.filterDurationType + '}';
    }

    protected VEAudioEffectFilterParam(Parcel parcel) {
        this.audioEffectBean = (VEAudioEffectBean) parcel.readParcelable(VEAudioEffectBean.class.getClassLoader());
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.audioEffectBean, i);
    }
}
