package com.ss.android.lark.littleapp.entity;

import android.os.Parcel;
import android.os.Parcelable;

public class RouterShareAppModel extends BaseRouteModel {
    public static final Parcelable.Creator<RouterShareAppModel> CREATOR = new Parcelable.Creator<RouterShareAppModel>() {
        /* class com.ss.android.lark.littleapp.entity.RouterShareAppModel.C413421 */

        /* renamed from: a */
        public RouterShareAppModel[] newArray(int i) {
            return new RouterShareAppModel[i];
        }

        /* renamed from: a */
        public RouterShareAppModel createFromParcel(Parcel parcel) {
            return new RouterShareAppModel(parcel);
        }
    };

    /* renamed from: a */
    private String f105149a;

    /* renamed from: b */
    private String f105150b;

    /* renamed from: c */
    private String f105151c;

    /* renamed from: d */
    private String f105152d;

    /* renamed from: e */
    private String f105153e;

    /* renamed from: f */
    private String f105154f;

    /* renamed from: g */
    private String f105155g;

    /* renamed from: h */
    private boolean f105156h;

    @Override // com.ss.android.lark.littleapp.entity.BaseRouteModel
    public int describeContents() {
        return 0;
    }

    /* renamed from: b */
    public String mo148885b() {
        return this.f105149a;
    }

    /* renamed from: c */
    public String mo148886c() {
        return this.f105150b;
    }

    /* renamed from: d */
    public String mo148887d() {
        return this.f105152d;
    }

    /* renamed from: e */
    public String mo148888e() {
        return this.f105153e;
    }

    /* renamed from: f */
    public String mo148889f() {
        return this.f105154f;
    }

    /* renamed from: g */
    public String mo148890g() {
        return this.f105151c;
    }

    /* renamed from: h */
    public String mo148891h() {
        return this.f105155g;
    }

    /* renamed from: i */
    public boolean mo148892i() {
        return this.f105156h;
    }

    protected RouterShareAppModel(Parcel parcel) {
        boolean z;
        this.f105149a = parcel.readString();
        this.f105150b = parcel.readString();
        this.f105151c = parcel.readString();
        this.f105153e = parcel.readString();
        this.f105152d = parcel.readString();
        this.f105154f = parcel.readString();
        this.f105155g = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f105156h = z;
    }

    @Override // com.ss.android.lark.littleapp.entity.BaseRouteModel
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f105149a);
        parcel.writeString(this.f105150b);
        parcel.writeString(this.f105151c);
        parcel.writeString(this.f105153e);
        parcel.writeString(this.f105152d);
        parcel.writeString(this.f105154f);
        parcel.writeString(this.f105155g);
        parcel.writeByte(this.f105156h ? (byte) 1 : 0);
    }

    public RouterShareAppModel(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        this.f105149a = str;
        this.f105150b = str2;
        this.f105151c = str3;
        this.f105153e = str5;
        this.f105152d = str4;
        this.f105154f = str6;
        this.f105155g = str7;
        this.f105156h = z;
    }
}
