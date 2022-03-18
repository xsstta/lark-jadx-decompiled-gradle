package com.ss.android.vesdk;

import android.os.Parcel;
import android.os.Parcelable;

public class VESize implements Parcelable {
    public static final Parcelable.Creator<VESize> CREATOR = new Parcelable.Creator<VESize>() {
        /* class com.ss.android.vesdk.VESize.C639071 */

        /* renamed from: a */
        public VESize[] newArray(int i) {
            return new VESize[i];
        }

        /* renamed from: a */
        public VESize createFromParcel(Parcel parcel) {
            return new VESize(parcel);
        }
    };
    public int height = 1280;
    public int width = 720;

    public int describeContents() {
        return 0;
    }

    public boolean isValid() {
        if (this.width <= 0 || this.height <= 0) {
            return false;
        }
        return true;
    }

    public String toString() {
        return this.width + "*" + this.height;
    }

    protected VESize(Parcel parcel) {
        this.width = parcel.readInt();
        this.height = parcel.readInt();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof VESize)) {
            return false;
        }
        VESize vESize = (VESize) obj;
        if (this.width == vESize.width && this.height == vESize.height) {
            return true;
        }
        return false;
    }

    public VESize(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
    }
}
