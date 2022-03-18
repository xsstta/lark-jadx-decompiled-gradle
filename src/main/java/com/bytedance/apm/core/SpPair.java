package com.bytedance.apm.core;

import android.os.Parcel;
import android.os.Parcelable;

public class SpPair implements Parcelable {
    public static final Parcelable.Creator<SpPair> CREATOR = new Parcelable.Creator<SpPair>() {
        /* class com.bytedance.apm.core.SpPair.C29061 */

        /* renamed from: a */
        public SpPair[] newArray(int i) {
            return new SpPair[i];
        }

        /* renamed from: a */
        public SpPair createFromParcel(Parcel parcel) {
            return new SpPair(parcel);
        }
    };

    /* renamed from: a */
    public String f9401a;

    /* renamed from: b */
    public Object f9402b;

    public int describeContents() {
        return 0;
    }

    protected SpPair(Parcel parcel) {
        this.f9401a = parcel.readString();
        this.f9402b = parcel.readValue(getClass().getClassLoader());
    }

    public SpPair(String str, Object obj) {
        this.f9401a = str;
        this.f9402b = obj;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9401a);
        parcel.writeValue(this.f9402b);
    }
}
