package com.ss.android.vesdk.filterparam;

import android.os.Parcel;
import android.os.Parcelable;

public class VEAudioLoudnessBalanceFilter extends VEBaseAudioFilterParam {
    public static final Parcelable.Creator<VEAudioLoudnessBalanceFilter> CREATOR = new Parcelable.Creator<VEAudioLoudnessBalanceFilter>() {
        /* class com.ss.android.vesdk.filterparam.VEAudioLoudnessBalanceFilter.C639941 */

        /* renamed from: a */
        public VEAudioLoudnessBalanceFilter[] newArray(int i) {
            return new VEAudioLoudnessBalanceFilter[i];
        }

        /* renamed from: a */
        public VEAudioLoudnessBalanceFilter createFromParcel(Parcel parcel) {
            return new VEAudioLoudnessBalanceFilter(parcel);
        }
    };
    public double avgLoudness;
    public boolean enable;
    public double peakLoudness;
    public double targetLoudness;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam
    public int describeContents() {
        return 0;
    }

    public VEAudioLoudnessBalanceFilter() {
        this.filterName = "loudness balance";
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam
    public String toString() {
        return "VEAudioLoudnessBalanceFilter{avgLoudness: " + this.avgLoudness + ", peakLoudness: " + this.peakLoudness + ", targetLoudness: '" + this.targetLoudness + ", filterName: '" + this.filterName + ", filterType: '" + this.filterType + ", filterDurationType=" + this.filterDurationType + '}';
    }

    protected VEAudioLoudnessBalanceFilter(Parcel parcel) {
        super(parcel);
        this.avgLoudness = parcel.readDouble();
        this.peakLoudness = parcel.readDouble();
        this.targetLoudness = parcel.readDouble();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam, com.ss.android.vesdk.filterparam.VEBaseAudioFilterParam
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeDouble(this.avgLoudness);
        parcel.writeDouble(this.peakLoudness);
        parcel.writeDouble(this.targetLoudness);
    }
}
