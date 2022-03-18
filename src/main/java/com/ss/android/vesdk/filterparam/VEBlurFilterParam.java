package com.ss.android.vesdk.filterparam;

import android.os.Parcel;
import android.os.Parcelable;

public class VEBlurFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VEBlurFilterParam> CREATOR = new Parcelable.Creator<VEBlurFilterParam>() {
        /* class com.ss.android.vesdk.filterparam.VEBlurFilterParam.C639991 */

        /* renamed from: a */
        public VEBlurFilterParam[] newArray(int i) {
            return new VEBlurFilterParam[i];
        }

        /* renamed from: a */
        public VEBlurFilterParam createFromParcel(Parcel parcel) {
            return new VEBlurFilterParam(parcel);
        }
    };
    public float intensity;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public int describeContents() {
        return 0;
    }

    public VEBlurFilterParam() {
        this.filterName = "ve_blur";
        this.filterType = 31;
        this.filterDurationType = 1;
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        return "VEBlurFilterParam{intensity=" + this.intensity + ", filterType=" + this.filterType + ", filterName='" + this.filterName + '\'' + ", filterDurationType=" + this.filterDurationType + '}';
    }

    protected VEBlurFilterParam(Parcel parcel) {
        super(parcel);
        this.intensity = parcel.readFloat();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.intensity);
    }
}
