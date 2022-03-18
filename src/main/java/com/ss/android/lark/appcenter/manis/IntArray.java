package com.ss.android.lark.appcenter.manis;

import android.os.Parcel;
import android.os.Parcelable;

public class IntArray implements Parcelable {
    public static final Parcelable.Creator<IntArray> CREATOR = new Parcelable.Creator<IntArray>() {
        /* class com.ss.android.lark.appcenter.manis.IntArray.C291001 */

        /* renamed from: a */
        public IntArray[] newArray(int i) {
            return new IntArray[i];
        }

        /* renamed from: a */
        public IntArray createFromParcel(Parcel parcel) {
            return new IntArray(parcel);
        }
    };

    /* renamed from: a */
    public int[] f72914a;

    public int describeContents() {
        return 0;
    }

    public IntArray(int[] iArr) {
        this.f72914a = iArr;
    }

    protected IntArray(Parcel parcel) {
        this.f72914a = parcel.createIntArray();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f72914a);
    }
}
