package com.ss.android.lark.littleapp.entity;

import android.os.Parcel;
import android.os.Parcelable;

public class RoutePasswordVerifyModel extends BaseRouteModel {
    public static final Parcelable.Creator<RoutePasswordVerifyModel> CREATOR = new Parcelable.Creator<RoutePasswordVerifyModel>() {
        /* class com.ss.android.lark.littleapp.entity.RoutePasswordVerifyModel.C413361 */

        /* renamed from: a */
        public RoutePasswordVerifyModel[] newArray(int i) {
            return new RoutePasswordVerifyModel[i];
        }

        /* renamed from: a */
        public RoutePasswordVerifyModel createFromParcel(Parcel parcel) {
            return new RoutePasswordVerifyModel(parcel);
        }
    };

    /* renamed from: a */
    private String f105134a;

    /* renamed from: b */
    private String f105135b;

    @Override // com.ss.android.lark.littleapp.entity.BaseRouteModel
    public int describeContents() {
        return 0;
    }

    public RoutePasswordVerifyModel() {
    }

    /* renamed from: b */
    public String mo148840b() {
        return this.f105134a;
    }

    /* renamed from: c */
    public String mo148841c() {
        return this.f105135b;
    }

    public RoutePasswordVerifyModel(Parcel parcel) {
        super(parcel);
        this.f105134a = parcel.readString();
        this.f105135b = parcel.readString();
    }

    @Override // com.ss.android.lark.littleapp.entity.BaseRouteModel
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f105134a);
        parcel.writeString(this.f105135b);
    }
}
