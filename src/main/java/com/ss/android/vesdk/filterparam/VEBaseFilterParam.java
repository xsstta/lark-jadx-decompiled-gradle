package com.ss.android.vesdk.filterparam;

import android.os.Parcel;
import android.os.Parcelable;

public class VEBaseFilterParam implements Parcelable {
    public static final Parcelable.Creator<VEBaseFilterParam> CREATOR = new Parcelable.Creator<VEBaseFilterParam>() {
        /* class com.ss.android.vesdk.filterparam.VEBaseFilterParam.C639971 */

        /* renamed from: a */
        public VEBaseFilterParam[] newArray(int i) {
            return new VEBaseFilterParam[i];
        }

        /* renamed from: a */
        public VEBaseFilterParam createFromParcel(Parcel parcel) {
            return new VEBaseFilterParam(parcel);
        }
    };
    public int filterDurationType;
    public String filterName;
    public int filterType;

    public int describeContents() {
        return 0;
    }

    public VEBaseFilterParam() {
    }

    public String toString() {
        return "VEBaseFilterParam{filterType=" + this.filterType + ", filterName='" + this.filterName + '\'' + ", filterDurationType=" + this.filterDurationType + '}';
    }

    protected VEBaseFilterParam(Parcel parcel) {
        this.filterType = parcel.readInt();
        this.filterName = parcel.readString();
        this.filterDurationType = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.filterType);
        parcel.writeString(this.filterName);
        parcel.writeInt(this.filterDurationType);
    }
}
