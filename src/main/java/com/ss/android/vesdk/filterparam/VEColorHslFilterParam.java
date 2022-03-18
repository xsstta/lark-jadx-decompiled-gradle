package com.ss.android.vesdk.filterparam;

import android.os.Parcel;
import android.os.Parcelable;

public class VEColorHslFilterParam extends VEBaseFilterParam {
    public static final Parcelable.Creator<VEColorHslFilterParam> CREATOR = new Parcelable.Creator<VEColorHslFilterParam>() {
        /* class com.ss.android.vesdk.filterparam.VEColorHslFilterParam.C640021 */

        /* renamed from: a */
        public VEColorHslFilterParam[] newArray(int i) {
            return new VEColorHslFilterParam[i];
        }

        /* renamed from: a */
        public VEColorHslFilterParam createFromParcel(Parcel parcel) {
            return new VEColorHslFilterParam(parcel);
        }
    };
    public int[] rgba = {0};
    public int[] tarHsl = {0};
    public int type;

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public int describeContents() {
        return 0;
    }

    public VEColorHslFilterParam() {
        this.filterName = "color_adjust_hsl";
        this.filterType = 36;
        this.filterDurationType = 1;
        this.rgba = new int[4];
        this.tarHsl = new int[3];
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public String toString() {
        return "VEColorHslFilterParam{rgba = [" + this.rgba[0] + "," + this.rgba[1] + "," + this.rgba[2] + "," + this.rgba[3] + "]" + '\'' + ", tarHsl = [" + this.tarHsl[0] + "," + this.tarHsl[1] + "," + this.tarHsl[2] + ", type = " + this.type + "]" + '\'' + '}';
    }

    protected VEColorHslFilterParam(Parcel parcel) {
        super(parcel);
        int[] iArr = {0};
        parcel.readIntArray(iArr);
        this.rgba = iArr;
        parcel.readIntArray(iArr);
        this.tarHsl = iArr;
        this.type = parcel.readInt();
    }

    @Override // com.ss.android.vesdk.filterparam.VEBaseFilterParam
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeIntArray(this.rgba);
        parcel.writeIntArray(this.tarHsl);
        parcel.writeInt(this.type);
    }
}
