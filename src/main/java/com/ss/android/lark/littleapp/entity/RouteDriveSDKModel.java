package com.ss.android.lark.littleapp.entity;

import android.os.Parcel;
import android.os.Parcelable;

public class RouteDriveSDKModel extends BaseRouteModel {
    public static final Parcelable.Creator<RouteDriveSDKModel> CREATOR = new Parcelable.Creator<RouteDriveSDKModel>() {
        /* class com.ss.android.lark.littleapp.entity.RouteDriveSDKModel.C413331 */

        /* renamed from: a */
        public RouteDriveSDKModel[] newArray(int i) {
            return new RouteDriveSDKModel[i];
        }

        /* renamed from: a */
        public RouteDriveSDKModel createFromParcel(Parcel parcel) {
            return new RouteDriveSDKModel(parcel);
        }
    };

    /* renamed from: a */
    public String f105126a;

    /* renamed from: b */
    public boolean f105127b;

    /* renamed from: c */
    private String f105128c;

    /* renamed from: d */
    private String f105129d;

    @Override // com.ss.android.lark.littleapp.entity.BaseRouteModel
    public int describeContents() {
        return 0;
    }

    /* renamed from: b */
    public String mo148823b() {
        return this.f105128c;
    }

    /* renamed from: c */
    public String mo148824c() {
        return this.f105129d;
    }

    public RouteDriveSDKModel(Parcel parcel) {
        super(parcel);
        this.f105128c = parcel.readString();
        this.f105129d = parcel.readString();
        boolean[] zArr = new boolean[1];
        parcel.readBooleanArray(zArr);
        this.f105127b = zArr[0];
        this.f105126a = parcel.readString();
    }

    @Override // com.ss.android.lark.littleapp.entity.BaseRouteModel
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f105128c);
        parcel.writeString(this.f105129d);
        parcel.writeBooleanArray(new boolean[]{this.f105127b});
        parcel.writeString(this.f105126a);
    }

    public RouteDriveSDKModel(String str, String str2, String str3, boolean z) {
        this.f105126a = str;
        this.f105128c = str2;
        this.f105129d = str3;
        this.f105127b = z;
    }
}
