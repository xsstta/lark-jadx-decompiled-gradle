package com.ss.android.lark.littleapp;

import android.os.Parcel;
import android.os.Parcelable;

public class EnvInfo implements Parcelable {
    public static final Parcelable.Creator<EnvInfo> CREATOR = new Parcelable.Creator<EnvInfo>() {
        /* class com.ss.android.lark.littleapp.EnvInfo.C412971 */

        /* renamed from: a */
        public EnvInfo[] newArray(int i) {
            return new EnvInfo[i];
        }

        /* renamed from: a */
        public EnvInfo createFromParcel(Parcel parcel) {
            return new EnvInfo(parcel);
        }
    };

    /* renamed from: a */
    private boolean f105085a;

    /* renamed from: b */
    private int f105086b;

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public boolean mo148730a() {
        return this.f105085a;
    }

    /* renamed from: b */
    public int mo148731b() {
        return this.f105086b;
    }

    protected EnvInfo(Parcel parcel) {
        boolean z;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f105085a = z;
        this.f105086b = parcel.readInt();
    }

    public EnvInfo(boolean z, int i) {
        this.f105085a = z;
        this.f105086b = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f105085a ? (byte) 1 : 0);
        parcel.writeInt(this.f105086b);
    }
}
