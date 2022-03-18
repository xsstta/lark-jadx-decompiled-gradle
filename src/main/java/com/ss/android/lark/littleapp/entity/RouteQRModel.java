package com.ss.android.lark.littleapp.entity;

import android.os.Parcel;
import android.os.Parcelable;

public class RouteQRModel extends BaseRouteModel {
    public static final Parcelable.Creator<RouteQRModel> CREATOR = new Parcelable.Creator<RouteQRModel>() {
        /* class com.ss.android.lark.littleapp.entity.RouteQRModel.C413391 */

        /* renamed from: a */
        public RouteQRModel[] newArray(int i) {
            return new RouteQRModel[i];
        }

        /* renamed from: a */
        public RouteQRModel createFromParcel(Parcel parcel) {
            return new RouteQRModel(parcel);
        }
    };

    /* renamed from: a */
    private String f105142a;

    /* renamed from: b */
    private String f105143b;

    /* renamed from: c */
    private boolean f105144c;

    @Override // com.ss.android.lark.littleapp.entity.BaseRouteModel
    public int describeContents() {
        return 0;
    }

    public RouteQRModel() {
    }

    /* renamed from: b */
    public String mo148864b() {
        return this.f105142a;
    }

    /* renamed from: c */
    public String mo148866c() {
        return this.f105143b;
    }

    /* renamed from: d */
    public boolean mo148868d() {
        return this.f105144c;
    }

    /* renamed from: a */
    public void mo148863a(boolean z) {
        this.f105144c = z;
    }

    /* renamed from: b */
    public void mo148865b(String str) {
        this.f105142a = str;
    }

    /* renamed from: c */
    public void mo148867c(String str) {
        this.f105143b = str;
    }

    public RouteQRModel(Parcel parcel) {
        super(parcel);
        this.f105142a = parcel.readString();
        this.f105143b = parcel.readString();
        this.f105144c = parcel.readInt() != 1 ? false : true;
    }

    @Override // com.ss.android.lark.littleapp.entity.BaseRouteModel
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f105142a);
        parcel.writeString(this.f105143b);
        parcel.writeInt(this.f105144c ? 1 : 0);
    }
}
