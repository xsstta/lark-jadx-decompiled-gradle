package com.ss.android.lark.littleapp.entity;

import android.os.Parcel;
import android.os.Parcelable;

public class RouteFileDetailModel extends BaseRouteModel {
    public static final Parcelable.Creator<RouteFileDetailModel> CREATOR = new Parcelable.Creator<RouteFileDetailModel>() {
        /* class com.ss.android.lark.littleapp.entity.RouteFileDetailModel.C413341 */

        /* renamed from: a */
        public RouteFileDetailModel[] newArray(int i) {
            return new RouteFileDetailModel[i];
        }

        /* renamed from: a */
        public RouteFileDetailModel createFromParcel(Parcel parcel) {
            return new RouteFileDetailModel(parcel);
        }
    };

    /* renamed from: a */
    public boolean f105130a;

    /* renamed from: b */
    private String f105131b;

    /* renamed from: c */
    private String f105132c;

    @Override // com.ss.android.lark.littleapp.entity.BaseRouteModel
    public int describeContents() {
        return 0;
    }

    /* renamed from: b */
    public String mo148829b() {
        return this.f105131b;
    }

    /* renamed from: c */
    public String mo148830c() {
        return this.f105132c;
    }

    public RouteFileDetailModel(Parcel parcel) {
        super(parcel);
        this.f105131b = parcel.readString();
        this.f105132c = parcel.readString();
        boolean[] zArr = new boolean[1];
        parcel.readBooleanArray(zArr);
        this.f105130a = zArr[0];
    }

    @Override // com.ss.android.lark.littleapp.entity.BaseRouteModel
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f105131b);
        parcel.writeString(this.f105132c);
        parcel.writeBooleanArray(new boolean[]{this.f105130a});
    }

    public RouteFileDetailModel(String str, String str2, boolean z) {
        this.f105131b = str;
        this.f105132c = str2;
        this.f105130a = z;
    }
}
