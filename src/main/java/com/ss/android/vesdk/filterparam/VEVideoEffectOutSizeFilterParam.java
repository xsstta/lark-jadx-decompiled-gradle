package com.ss.android.vesdk.filterparam;

import android.os.Parcel;
import android.os.Parcelable;

public class VEVideoEffectOutSizeFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VEVideoEffectOutSizeFilterParam> CREATOR = new Parcelable.Creator<VEVideoEffectOutSizeFilterParam>() {
        /* class com.ss.android.vesdk.filterparam.VEVideoEffectOutSizeFilterParam.C640171 */

        /* renamed from: a */
        public VEVideoEffectOutSizeFilterParam[] newArray(int i) {
            return new VEVideoEffectOutSizeFilterParam[i];
        }

        /* renamed from: a */
        public VEVideoEffectOutSizeFilterParam createFromParcel(Parcel parcel) {
            return new VEVideoEffectOutSizeFilterParam(parcel);
        }
    };

    /* renamed from: a */
    public int f161631a;

    /* renamed from: b */
    public int f161632b;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public int describeContents() {
        return 0;
    }

    public VEVideoEffectOutSizeFilterParam() {
        this.filterName = "effect output size";
        this.filterType = 30;
        this.filterDurationType = 1;
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        return "VEVideoEffectOutSizeFilterParam{width=" + this.f161631a + ", height=" + this.f161632b + ", filterType=" + this.filterType + ", filterName='" + this.filterName + '\'' + ", filterDurationType=" + this.filterDurationType + '}';
    }

    protected VEVideoEffectOutSizeFilterParam(Parcel parcel) {
        super(parcel);
        this.f161631a = parcel.readInt();
        this.f161632b = parcel.readInt();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f161631a);
        parcel.writeInt(this.f161632b);
    }
}
