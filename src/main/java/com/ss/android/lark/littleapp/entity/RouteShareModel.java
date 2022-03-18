package com.ss.android.lark.littleapp.entity;

import android.os.Parcel;
import android.os.Parcelable;

public class RouteShareModel extends BaseRouteModel {
    public static final Parcelable.Creator<RouteShareModel> CREATOR = new Parcelable.Creator<RouteShareModel>() {
        /* class com.ss.android.lark.littleapp.entity.RouteShareModel.C413401 */

        /* renamed from: a */
        public RouteShareModel[] newArray(int i) {
            return new RouteShareModel[i];
        }

        /* renamed from: a */
        public RouteShareModel createFromParcel(Parcel parcel) {
            return new RouteShareModel(parcel);
        }
    };

    /* renamed from: a */
    private String f105145a;

    /* renamed from: b */
    private String f105146b;

    /* renamed from: c */
    private String f105147c;

    @Override // com.ss.android.lark.littleapp.entity.BaseRouteModel
    public int describeContents() {
        return 0;
    }

    /* renamed from: b */
    public String mo148873b() {
        return this.f105145a;
    }

    /* renamed from: c */
    public String mo148874c() {
        return this.f105146b;
    }

    /* renamed from: d */
    public String mo148875d() {
        return this.f105147c;
    }

    public RouteShareModel(Parcel parcel) {
        this.f105145a = parcel.readString();
        this.f105146b = parcel.readString();
        this.f105147c = parcel.readString();
    }

    @Override // com.ss.android.lark.littleapp.entity.BaseRouteModel
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f105145a);
        parcel.writeString(this.f105146b);
        parcel.writeString(this.f105147c);
    }

    public RouteShareModel(String str, String str2, String str3) {
        this.f105145a = str;
        this.f105146b = str2;
        this.f105147c = str3;
    }
}
