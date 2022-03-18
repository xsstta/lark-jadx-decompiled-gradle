package com.ss.android.vesdk.filterparam;

import android.os.Parcel;
import android.os.Parcelable;

public class VEVideoStableFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VEVideoStableFilterParam> CREATOR = new Parcelable.Creator<VEVideoStableFilterParam>() {
        /* class com.ss.android.vesdk.filterparam.VEVideoStableFilterParam.C640191 */

        /* renamed from: a */
        public VEVideoStableFilterParam[] newArray(int i) {
            return new VEVideoStableFilterParam[i];
        }

        /* renamed from: a */
        public VEVideoStableFilterParam createFromParcel(Parcel parcel) {
            return new VEVideoStableFilterParam(parcel);
        }
    };

    /* renamed from: a */
    public String f161635a;

    /* renamed from: b */
    public String f161636b;

    /* renamed from: c */
    public int f161637c;

    /* renamed from: d */
    public int f161638d;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public int describeContents() {
        return 0;
    }

    public VEVideoStableFilterParam() {
        this.filterName = "video stable filter";
        this.filterType = 27;
        this.filterDurationType = 1;
        this.f161635a = "";
        this.f161636b = "";
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        return "VEVideoStableFilterParam{ptsMatrix=" + this.f161635a + ", videoStabMatrix='" + this.f161636b + '\'' + ", filterType=" + this.filterType + '\'' + ", filterName='" + this.filterName + '\'' + ", filterDurationType=" + this.filterDurationType + '\'' + ", width=" + this.f161637c + '\'' + ", height=" + this.f161638d + '\'' + '}';
    }

    protected VEVideoStableFilterParam(Parcel parcel) {
        super(parcel);
        this.f161635a = parcel.readString();
        this.f161636b = parcel.readString();
        this.f161637c = parcel.readInt();
        this.f161638d = parcel.readInt();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f161635a);
        parcel.writeString(this.f161636b);
        parcel.writeInt(this.f161637c);
        parcel.writeInt(this.f161638d);
    }
}
