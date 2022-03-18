package com.ss.android.vesdk.filterparam;

import android.os.Parcel;
import android.os.Parcelable;

public class VEAmazingFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VEAmazingFilterParam> CREATOR = new Parcelable.Creator<VEAmazingFilterParam>() {
        /* class com.ss.android.vesdk.filterparam.VEAmazingFilterParam.C639901 */

        /* renamed from: a */
        public VEAmazingFilterParam[] newArray(int i) {
            return new VEAmazingFilterParam[i];
        }

        /* renamed from: a */
        public VEAmazingFilterParam createFromParcel(Parcel parcel) {
            return new VEAmazingFilterParam(parcel);
        }
    };
    public int amazingEngineType;
    public int flag;
    public int order;
    public String param;
    public String path;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public int describeContents() {
        return 0;
    }

    public VEAmazingFilterParam() {
        this.filterName = "amzing filter";
        this.filterType = 22;
        this.path = "";
        this.param = "";
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        return "VEAmazingFilterParam{order=" + this.order + ", path='" + this.path + '\'' + ", param='" + this.param + '\'' + ", amazingEngineType=" + this.amazingEngineType + ", flag =" + this.flag + ", filterType=" + this.filterType + ", filterName='" + this.filterName + '\'' + ", filterDurationType=" + this.filterDurationType + '}';
    }

    protected VEAmazingFilterParam(Parcel parcel) {
        super(parcel);
        this.order = parcel.readInt();
        this.path = parcel.readString();
        this.param = parcel.readString();
        this.amazingEngineType = parcel.readInt();
        this.flag = parcel.readInt();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.order);
        parcel.writeString(this.path);
        parcel.writeString(this.param);
        parcel.writeInt(this.amazingEngineType);
        parcel.writeInt(this.flag);
    }
}
