package com.ss.android.vesdk;

import android.os.Parcel;
import android.os.Parcelable;

public enum ROTATE_DEGREE implements Parcelable {
    ROTATE_NONE,
    ROTATE_90,
    ROTATE_180,
    ROTATE_270;
    
    public static final Parcelable.Creator<ROTATE_DEGREE> CREATOR = new Parcelable.Creator<ROTATE_DEGREE>() {
        /* class com.ss.android.vesdk.ROTATE_DEGREE.C638101 */

        /* renamed from: a */
        public ROTATE_DEGREE[] newArray(int i) {
            return new ROTATE_DEGREE[i];
        }

        /* renamed from: a */
        public ROTATE_DEGREE createFromParcel(Parcel parcel) {
            return ROTATE_DEGREE.values()[parcel.readInt()];
        }
    };

    public int describeContents() {
        return 0;
    }

    public static int[] toIntArray(ROTATE_DEGREE[] rotate_degreeArr) {
        if (rotate_degreeArr == null) {
            return null;
        }
        int length = rotate_degreeArr.length;
        int[] iArr = new int[rotate_degreeArr.length];
        for (int i = 0; i < length; i++) {
            if (rotate_degreeArr[i] == null) {
                iArr[i] = 0;
            } else {
                iArr[i] = rotate_degreeArr[i].ordinal();
            }
        }
        return iArr;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(ordinal());
    }
}
