package com.ss.android.lark.littleapp.entity;

import android.os.Parcel;
import android.os.Parcelable;

public class RouteProfileModel extends BaseRouteModel {
    public static final Parcelable.Creator<RouteProfileModel> CREATOR = new Parcelable.Creator<RouteProfileModel>() {
        /* class com.ss.android.lark.littleapp.entity.RouteProfileModel.C413381 */

        /* renamed from: a */
        public RouteProfileModel[] newArray(int i) {
            return new RouteProfileModel[i];
        }

        /* renamed from: a */
        public RouteProfileModel createFromParcel(Parcel parcel) {
            return new RouteProfileModel(parcel);
        }
    };

    /* renamed from: a */
    private String f105140a;

    /* renamed from: b */
    private String f105141b;

    @Override // com.ss.android.lark.littleapp.entity.BaseRouteModel
    public int describeContents() {
        return 0;
    }

    public RouteProfileModel() {
    }

    /* renamed from: b */
    public String mo148855b() {
        return this.f105140a;
    }

    /* renamed from: c */
    public String mo148857c() {
        return this.f105141b;
    }

    /* renamed from: b */
    public void mo148856b(String str) {
        this.f105140a = str;
    }

    /* renamed from: c */
    public void mo148858c(String str) {
        this.f105141b = str;
    }

    public RouteProfileModel(Parcel parcel) {
        super(parcel);
        this.f105140a = parcel.readString();
        this.f105141b = parcel.readString();
    }

    @Override // com.ss.android.lark.littleapp.entity.BaseRouteModel
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f105140a);
        parcel.writeString(this.f105141b);
    }
}
