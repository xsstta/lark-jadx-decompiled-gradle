package com.ss.android.lark.littleapp.entity;

import android.os.Parcel;
import android.os.Parcelable;

public class OpenUrlByLarkModel extends BaseRouteModel {
    public static final Parcelable.Creator<OpenUrlByLarkModel> CREATOR = new Parcelable.Creator<OpenUrlByLarkModel>() {
        /* class com.ss.android.lark.littleapp.entity.OpenUrlByLarkModel.C413301 */

        /* renamed from: a */
        public OpenUrlByLarkModel[] newArray(int i) {
            return new OpenUrlByLarkModel[i];
        }

        /* renamed from: a */
        public OpenUrlByLarkModel createFromParcel(Parcel parcel) {
            return new OpenUrlByLarkModel(parcel);
        }
    };

    /* renamed from: a */
    private String f105121a;

    @Override // com.ss.android.lark.littleapp.entity.BaseRouteModel
    public int describeContents() {
        return 0;
    }

    public OpenUrlByLarkModel() {
    }

    /* renamed from: b */
    public String mo148803b() {
        return this.f105121a;
    }

    /* renamed from: b */
    public void mo148804b(String str) {
        this.f105121a = str;
    }

    public OpenUrlByLarkModel(Parcel parcel) {
        super(parcel);
        this.f105121a = parcel.readString();
    }

    @Override // com.ss.android.lark.littleapp.entity.BaseRouteModel
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f105121a);
    }
}
