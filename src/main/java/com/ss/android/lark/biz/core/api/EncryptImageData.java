package com.ss.android.lark.biz.core.api;

import android.os.Parcel;
import android.os.Parcelable;

public class EncryptImageData implements Parcelable {
    public static final Parcelable.Creator<EncryptImageData> CREATOR = new Parcelable.Creator<EncryptImageData>() {
        /* class com.ss.android.lark.biz.core.api.EncryptImageData.C295321 */

        /* renamed from: a */
        public EncryptImageData[] newArray(int i) {
            return new EncryptImageData[i];
        }

        /* renamed from: a */
        public EncryptImageData createFromParcel(Parcel parcel) {
            return new EncryptImageData(parcel);
        }
    };

    /* renamed from: a */
    public String f73837a;

    /* renamed from: b */
    public String f73838b;

    public int describeContents() {
        return 0;
    }

    public EncryptImageData() {
    }

    protected EncryptImageData(Parcel parcel) {
        this.f73837a = parcel.readString();
        this.f73838b = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f73837a);
        parcel.writeString(this.f73838b);
    }
}
