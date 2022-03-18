package com.ss.android.lark.littleapp.entity;

import android.os.Parcel;
import android.os.Parcelable;

public class BaseRouteModel implements Parcelable {
    public static final Parcelable.Creator<BaseRouteModel> CREATOR = new Parcelable.Creator<BaseRouteModel>() {
        /* class com.ss.android.lark.littleapp.entity.BaseRouteModel.C413261 */

        /* renamed from: a */
        public BaseRouteModel[] newArray(int i) {
            return new BaseRouteModel[i];
        }

        /* renamed from: a */
        public BaseRouteModel createFromParcel(Parcel parcel) {
            return new BaseRouteModel(parcel);
        }
    };

    /* renamed from: a */
    private String f105114a;

    /* renamed from: b */
    private boolean f105115b;

    /* renamed from: c */
    private int f105116c;

    public int describeContents() {
        return 0;
    }

    public BaseRouteModel() {
    }

    /* renamed from: a */
    public String mo148766a() {
        return this.f105114a;
    }

    /* renamed from: a */
    public void mo148767a(String str) {
        this.f105114a = str;
    }

    protected BaseRouteModel(Parcel parcel) {
        boolean z;
        this.f105114a = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f105115b = z;
        this.f105116c = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f105114a);
        parcel.writeByte(this.f105115b ? (byte) 1 : 0);
        parcel.writeInt(this.f105116c);
    }
}
