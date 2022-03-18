package com.ss.android.vesdk.filterparam;

import android.os.Parcel;
import android.os.Parcelable;

public class VEVideoEffectStreamFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VEVideoEffectStreamFilterParam> CREATOR = new Parcelable.Creator<VEVideoEffectStreamFilterParam>() {
        /* class com.ss.android.vesdk.filterparam.VEVideoEffectStreamFilterParam.C640181 */

        /* renamed from: a */
        public VEVideoEffectStreamFilterParam[] newArray(int i) {
            return new VEVideoEffectStreamFilterParam[i];
        }

        /* renamed from: a */
        public VEVideoEffectStreamFilterParam createFromParcel(Parcel parcel) {
            return new VEVideoEffectStreamFilterParam(parcel);
        }
    };

    /* renamed from: a */
    public int f161633a;

    /* renamed from: b */
    public String f161634b;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public int describeContents() {
        return 0;
    }

    public VEVideoEffectStreamFilterParam() {
        this.filterName = "effect stream";
        this.filterType = 29;
        this.filterDurationType = 1;
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        return "VEVideoEffectStreamFilterParam{filterType=" + this.filterType + ", filterName='" + this.filterName + '\'' + ", filterDurationType=" + this.filterDurationType + ", streamFlags=" + this.f161633a + ", extraString=" + this.f161634b + '}';
    }

    protected VEVideoEffectStreamFilterParam(Parcel parcel) {
        super(parcel);
        this.f161633a = parcel.readInt();
        this.f161634b = parcel.readString();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f161633a);
        parcel.writeString(this.f161634b);
    }
}
