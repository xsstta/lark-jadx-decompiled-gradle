package com.ss.android.vesdk.filterparam;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public class VEVideoAjustmentFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VEVideoAjustmentFilterParam> CREATOR = new Parcelable.Creator<VEVideoAjustmentFilterParam>() {
        /* class com.ss.android.vesdk.filterparam.VEVideoAjustmentFilterParam.C640151 */

        /* renamed from: a */
        public VEVideoAjustmentFilterParam[] newArray(int i) {
            return new VEVideoAjustmentFilterParam[i];
        }

        /* renamed from: a */
        public VEVideoAjustmentFilterParam createFromParcel(Parcel parcel) {
            return new VEVideoAjustmentFilterParam(parcel);
        }
    };
    public float[] ajustmentIntensity;
    public String[] ajustmentName;
    public int[] ajustmentType;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public int describeContents() {
        return 0;
    }

    public VEVideoAjustmentFilterParam() {
        this.filterName = "quality filter";
        this.filterType = 17;
        this.filterDurationType = 1;
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        return "VEVideoAjustmentFilterParam{ajustmentName=" + Arrays.toString(this.ajustmentName) + ", ajustmentType=" + Arrays.toString(this.ajustmentType) + ", ajustmentIntensity=" + Arrays.toString(this.ajustmentIntensity) + ", filterType=" + this.filterType + ", filterName='" + this.filterName + '\'' + ", filterDurationType=" + this.filterDurationType + '}';
    }

    protected VEVideoAjustmentFilterParam(Parcel parcel) {
        super(parcel);
        this.ajustmentName = parcel.createStringArray();
        this.ajustmentType = parcel.createIntArray();
        this.ajustmentIntensity = parcel.createFloatArray();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeStringArray(this.ajustmentName);
        parcel.writeIntArray(this.ajustmentType);
        parcel.writeFloatArray(this.ajustmentIntensity);
    }
}
