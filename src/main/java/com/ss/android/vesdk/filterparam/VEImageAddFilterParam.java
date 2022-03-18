package com.ss.android.vesdk.filterparam;

import android.os.Parcel;
import android.os.Parcelable;

public class VEImageAddFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VEImageAddFilterParam> CREATOR = new Parcelable.Creator<VEImageAddFilterParam>() {
        /* class com.ss.android.vesdk.filterparam.VEImageAddFilterParam.C640061 */

        /* renamed from: a */
        public VEImageAddFilterParam[] newArray(int i) {
            return new VEImageAddFilterParam[i];
        }

        /* renamed from: a */
        public VEImageAddFilterParam createFromParcel(Parcel parcel) {
            return new VEImageAddFilterParam(parcel);
        }
    };
    public float height;
    public String imagePath;
    public float width;

    /* renamed from: x */
    public float f161607x;

    /* renamed from: y */
    public float f161608y;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public int describeContents() {
        return 0;
    }

    public VEImageAddFilterParam() {
        this.filterName = "image add filter";
        this.filterType = 21;
        this.imagePath = "";
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        return "VEImageAddFilterParam{imagePath='" + this.imagePath + '\'' + ", x=" + this.f161607x + ", y=" + this.f161608y + ", width=" + this.width + ", height=" + this.height + ", filterType=" + this.filterType + ", filterName='" + this.filterName + '\'' + ", filterDurationType=" + this.filterDurationType + '}';
    }

    protected VEImageAddFilterParam(Parcel parcel) {
        super(parcel);
        this.imagePath = parcel.readString();
        this.f161607x = parcel.readFloat();
        this.f161608y = parcel.readFloat();
        this.width = parcel.readFloat();
        this.height = parcel.readFloat();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.imagePath);
        parcel.writeFloat(this.f161607x);
        parcel.writeFloat(this.f161608y);
        parcel.writeFloat(this.width);
        parcel.writeFloat(this.height);
    }
}
