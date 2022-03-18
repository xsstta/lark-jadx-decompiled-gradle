package com.bytedance.apm.util;

import android.os.Parcel;
import android.os.Parcelable;

public class SpPair implements Parcelable {
    public static final Parcelable.Creator<SpPair> CREATOR = new Parcelable.Creator<SpPair>() {
        /* class com.bytedance.apm.util.SpPair.C31101 */

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
    public String f10010a;

    /* renamed from: b */
    public Object f10011b;

    public int describeContents() {
        return 0;
    }

    protected SpPair(Parcel parcel) {
        this.f10010a = parcel.readString();
        this.f10011b = parcel.readValue(getClass().getClassLoader());
    }

    public SpPair(String str, Object obj) {
        this.f10010a = str;
        this.f10011b = obj;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f10010a);
        parcel.writeValue(this.f10011b);
    }
}
