package com.ss.android.ttvecamera;

import android.os.Parcel;
import android.os.Parcelable;

public class TEFrameSizei implements Parcelable {
    public static final Parcelable.Creator<TEFrameSizei> CREATOR = new Parcelable.Creator<TEFrameSizei>() {
        /* class com.ss.android.ttvecamera.TEFrameSizei.C603081 */

        /* renamed from: a */
        public TEFrameSizei[] newArray(int i) {
            return new TEFrameSizei[i];
        }

        /* renamed from: a */
        public TEFrameSizei createFromParcel(Parcel parcel) {
            return new TEFrameSizei(parcel);
        }
    };

    /* renamed from: a */
    public int f150716a = 720;

    /* renamed from: b */
    public int f150717b = 1280;

    public int describeContents() {
        return 0;
    }

    public TEFrameSizei() {
    }

    /* renamed from: a */
    public boolean mo206545a() {
        if (this.f150716a <= 0 || this.f150717b <= 0) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f150716a * 65537) + 1 + this.f150717b;
    }

    public String toString() {
        return this.f150716a + "x" + this.f150717b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TEFrameSizei)) {
            return false;
        }
        TEFrameSizei tEFrameSizei = (TEFrameSizei) obj;
        if (this.f150716a == tEFrameSizei.f150716a && this.f150717b == tEFrameSizei.f150717b) {
            return true;
        }
        return false;
    }

    protected TEFrameSizei(Parcel parcel) {
        this.f150716a = parcel.readInt();
        this.f150717b = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f150716a);
        parcel.writeInt(this.f150717b);
    }

    public TEFrameSizei(int i, int i2) {
        this.f150716a = i;
        this.f150717b = i2;
    }
}
