package com.ss.android.vesdk;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;

public class VEBitmapWithInfo implements Parcelable {
    public static final Parcelable.Creator<VEBitmapWithInfo> CREATOR = new Parcelable.Creator<VEBitmapWithInfo>() {
        /* class com.ss.android.vesdk.VEBitmapWithInfo.C638151 */

        /* renamed from: a */
        public VEBitmapWithInfo[] newArray(int i) {
            return new VEBitmapWithInfo[i];
        }

        /* renamed from: a */
        public VEBitmapWithInfo createFromParcel(Parcel parcel) {
            return new VEBitmapWithInfo(parcel);
        }
    };
    public Bitmap bitmap;
    public int colorPrimary;
    public int colorSpace;
    public int colorTransfer;

    public enum COLOR_TYPE {
        UNKNOWN,
        BT601,
        BT709,
        BT2020_PQ,
        BT2020_HLG
    }

    public int describeContents() {
        return 0;
    }

    public VEBitmapWithInfo(Bitmap bitmap2) {
        this.bitmap = bitmap2;
        this.colorSpace = COLOR_TYPE.UNKNOWN.ordinal();
        this.colorPrimary = COLOR_TYPE.UNKNOWN.ordinal();
        this.colorTransfer = COLOR_TYPE.UNKNOWN.ordinal();
    }

    protected VEBitmapWithInfo(Parcel parcel) {
        this.colorSpace = parcel.readInt();
        this.colorPrimary = parcel.readInt();
        this.colorTransfer = parcel.readInt();
        this.bitmap = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.colorSpace);
        parcel.writeInt(this.colorPrimary);
        parcel.writeInt(this.colorTransfer);
        parcel.writeParcelable(this.bitmap, i);
    }

    public void setColorInfo(int i, int i2, int i3) {
        this.colorSpace = i;
        this.colorPrimary = i2;
        this.colorTransfer = i3;
    }

    public VEBitmapWithInfo(Bitmap bitmap2, int i, int i2, int i3) {
        this.bitmap = bitmap2;
        this.colorSpace = i;
        this.colorPrimary = i2;
        this.colorTransfer = i3;
    }
}
