package com.ss.android.vesdk.filterparam;

import android.os.Parcel;
import android.os.Parcelable;

public class VEBeautyFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VEBeautyFilterParam> CREATOR = new Parcelable.Creator<VEBeautyFilterParam>() {
        /* class com.ss.android.vesdk.filterparam.VEBeautyFilterParam.C639981 */

        /* renamed from: a */
        public VEBeautyFilterParam[] newArray(int i) {
            return new VEBeautyFilterParam[i];
        }

        /* renamed from: a */
        public VEBeautyFilterParam createFromParcel(Parcel parcel) {
            return new VEBeautyFilterParam(parcel);
        }
    };
    public String beautyName;
    public int beautyType;
    public float brightenIntensity;
    public float sharpIntensity;
    public float skinToneIntensity;
    public String skinTonePath;
    public float smoothIntensity;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public int describeContents() {
        return 0;
    }

    public VEBeautyFilterParam() {
        this.filterName = "beauty";
        this.filterType = 12;
        this.filterDurationType = 1;
        this.beautyName = "";
        this.beautyType = -1;
        this.skinTonePath = "";
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        return "VEBeautyFilterParam{beautyName='" + this.beautyName + '\'' + ", beautyType=" + this.beautyType + ", brightenIntensity=" + this.brightenIntensity + ", smoothIntensity=" + this.smoothIntensity + ", sharpIntensity=" + this.sharpIntensity + ", filterType=" + this.filterType + ", filterName='" + this.filterName + '\'' + ", filterDurationType=" + this.filterDurationType + ", skinTonePath='" + this.skinTonePath + '\'' + ", skinToneIntensity=" + this.skinToneIntensity + '}';
    }

    protected VEBeautyFilterParam(Parcel parcel) {
        super(parcel);
        this.beautyName = parcel.readString();
        this.beautyType = parcel.readInt();
        this.brightenIntensity = parcel.readFloat();
        this.smoothIntensity = parcel.readFloat();
        this.sharpIntensity = parcel.readFloat();
        this.skinTonePath = parcel.readString();
        this.skinToneIntensity = parcel.readFloat();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.beautyName);
        parcel.writeInt(this.beautyType);
        parcel.writeFloat(this.brightenIntensity);
        parcel.writeFloat(this.smoothIntensity);
        parcel.writeFloat(this.sharpIntensity);
        parcel.writeString(this.skinTonePath);
        parcel.writeFloat(this.skinToneIntensity);
    }
}
