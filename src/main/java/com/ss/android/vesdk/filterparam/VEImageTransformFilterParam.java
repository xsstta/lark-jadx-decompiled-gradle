package com.ss.android.vesdk.filterparam;

import android.os.Parcel;
import android.os.Parcelable;

public class VEImageTransformFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VEImageTransformFilterParam> CREATOR = new Parcelable.Creator<VEImageTransformFilterParam>() {
        /* class com.ss.android.vesdk.filterparam.VEImageTransformFilterParam.C640071 */

        /* renamed from: a */
        public VEImageTransformFilterParam[] newArray(int i) {
            return new VEImageTransformFilterParam[i];
        }

        /* renamed from: a */
        public VEImageTransformFilterParam createFromParcel(Parcel parcel) {
            return new VEImageTransformFilterParam(parcel);
        }
    };
    public float beginScale;
    public float endScale;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public int describeContents() {
        return 0;
    }

    public VEImageTransformFilterParam() {
        this.filterName = "image transform filter";
        this.filterType = 20;
        this.beginScale = 1.0f;
        this.endScale = 1.0f;
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        return "VEImageTransformFilterParam{beginScale=" + this.beginScale + ", endScale=" + this.endScale + ", filterType=" + this.filterType + ", filterName='" + this.filterName + '\'' + ", filterDurationType=" + this.filterDurationType + '}';
    }

    protected VEImageTransformFilterParam(Parcel parcel) {
        super(parcel);
        this.beginScale = parcel.readFloat();
        this.endScale = parcel.readFloat();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeFloat(this.beginScale);
        parcel.writeFloat(this.endScale);
    }
}
