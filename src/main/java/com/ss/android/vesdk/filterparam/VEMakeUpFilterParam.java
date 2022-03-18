package com.ss.android.vesdk.filterparam;

import android.os.Parcel;
import android.os.Parcelable;

public class VEMakeUpFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VEMakeUpFilterParam> CREATOR = new Parcelable.Creator<VEMakeUpFilterParam>() {
        /* class com.ss.android.vesdk.filterparam.VEMakeUpFilterParam.C640101 */

        /* renamed from: a */
        public VEMakeUpFilterParam[] newArray(int i) {
            return new VEMakeUpFilterParam[i];
        }

        /* renamed from: a */
        public VEMakeUpFilterParam createFromParcel(Parcel parcel) {
            return new VEMakeUpFilterParam(parcel);
        }
    };

    /* renamed from: a */
    public String f161627a;

    /* renamed from: b */
    public float f161628b;

    /* renamed from: c */
    public float f161629c;

    /* renamed from: d */
    public boolean f161630d;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public int describeContents() {
        return 0;
    }

    public VEMakeUpFilterParam() {
        this.filterName = "makeup filter";
        this.filterType = 26;
        this.filterDurationType = 1;
        this.f161627a = "";
        this.f161628b = -1.0f;
        this.f161629c = -1.0f;
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        return "VEMakeUpFilterParam{resPath='" + this.f161627a + '\'' + ", lipIntensity=" + this.f161628b + ", blusherIntensity=" + this.f161629c + ", filterType=" + this.filterType + ", filterName='" + this.filterName + '\'' + ", filterDurationType=" + this.filterDurationType + ", maleMakeupState=" + this.f161630d + '}';
    }

    protected VEMakeUpFilterParam(Parcel parcel) {
        super(parcel);
        this.f161627a = parcel.readString();
        this.f161628b = parcel.readFloat();
        this.f161629c = parcel.readFloat();
        this.f161630d = 1 != parcel.readInt() ? false : true;
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f161627a);
        parcel.writeFloat(this.f161628b);
        parcel.writeFloat(this.f161629c);
        parcel.writeInt(this.f161630d ? 1 : 0);
    }
}
