package com.bytedance.ee.bear.contract.config;

import android.os.Parcel;
import android.os.Parcelable;

public class LoginInfo implements Parcelable {
    public static final Parcelable.Creator<LoginInfo> CREATOR = new Parcelable.Creator<LoginInfo>() {
        /* class com.bytedance.ee.bear.contract.config.LoginInfo.C51211 */

        /* renamed from: a */
        public LoginInfo[] newArray(int i) {
            return new LoginInfo[i];
        }

        /* renamed from: a */
        public LoginInfo createFromParcel(Parcel parcel) {
            return new LoginInfo(parcel);
        }
    };

    /* renamed from: a */
    private String f14824a;

    /* renamed from: b */
    private String f14825b;

    /* renamed from: c */
    private String f14826c;

    /* renamed from: d */
    private boolean f14827d;

    /* renamed from: e */
    private String f14828e;

    /* renamed from: f */
    private String f14829f;

    /* renamed from: g */
    private String f14830g;

    /* renamed from: h */
    private String f14831h;

    public int describeContents() {
        return 0;
    }

    public LoginInfo() {
    }

    /* renamed from: a */
    public String mo20246a() {
        return this.f14824a;
    }

    /* renamed from: b */
    public String mo20247b() {
        return this.f14825b;
    }

    /* renamed from: c */
    public String mo20248c() {
        return this.f14826c;
    }

    /* renamed from: d */
    public boolean mo20249d() {
        return this.f14827d;
    }

    /* renamed from: e */
    public String mo20251e() {
        return this.f14828e;
    }

    /* renamed from: f */
    public String mo20252f() {
        return this.f14829f;
    }

    /* renamed from: g */
    public String mo20253g() {
        return this.f14830g;
    }

    /* renamed from: h */
    public String mo20254h() {
        return this.f14831h;
    }

    protected LoginInfo(Parcel parcel) {
        this.f14824a = parcel.readString();
        this.f14825b = parcel.readString();
        this.f14826c = parcel.readString();
        this.f14827d = parcel.readByte() != 1 ? false : true;
        this.f14828e = parcel.readString();
        this.f14829f = parcel.readString();
        this.f14830g = parcel.readString();
        this.f14831h = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f14824a);
        parcel.writeString(this.f14825b);
        parcel.writeString(this.f14826c);
        parcel.writeByte(this.f14827d ? (byte) 1 : 0);
        parcel.writeString(this.f14828e);
        parcel.writeString(this.f14829f);
        parcel.writeString(this.f14830g);
        parcel.writeString(this.f14831h);
    }

    public LoginInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        this.f14824a = str;
        this.f14825b = str2;
        this.f14826c = str3;
        this.f14828e = str4;
        this.f14829f = str5;
        this.f14830g = str6;
        this.f14831h = str7;
        this.f14827d = z;
    }
}
