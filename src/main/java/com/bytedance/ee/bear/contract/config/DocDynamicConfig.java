package com.bytedance.ee.bear.contract.config;

import android.os.Parcel;
import android.os.Parcelable;

public class DocDynamicConfig implements Parcelable {
    public static final Parcelable.Creator<DocDynamicConfig> CREATOR = new Parcelable.Creator<DocDynamicConfig>() {
        /* class com.bytedance.ee.bear.contract.config.DocDynamicConfig.C51191 */

        /* renamed from: a */
        public DocDynamicConfig[] newArray(int i) {
            return new DocDynamicConfig[i];
        }

        /* renamed from: a */
        public DocDynamicConfig createFromParcel(Parcel parcel) {
            return new DocDynamicConfig(parcel);
        }
    };

    /* renamed from: a */
    private int f14813a;

    /* renamed from: b */
    private String f14814b;

    /* renamed from: c */
    private TenantInfo f14815c;

    /* renamed from: d */
    private boolean f14816d;

    /* renamed from: e */
    private boolean f14817e;

    /* renamed from: f */
    private String f14818f = "normal";

    /* renamed from: g */
    private LoginInfo f14819g;

    /* renamed from: h */
    private String f14820h;

    /* renamed from: i */
    private boolean f14821i;

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public int mo20224a() {
        return this.f14813a;
    }

    /* renamed from: b */
    public String mo20225b() {
        return this.f14814b;
    }

    /* renamed from: c */
    public TenantInfo mo20226c() {
        return this.f14815c;
    }

    /* renamed from: d */
    public LoginInfo mo20227d() {
        return this.f14819g;
    }

    /* renamed from: e */
    public boolean mo20229e() {
        return this.f14817e;
    }

    /* renamed from: f */
    public boolean mo20230f() {
        return this.f14821i;
    }

    /* renamed from: g */
    public String mo20231g() {
        return this.f14820h;
    }

    public String toString() {
        return "DocDynamicConfig{env=" + this.f14813a + '\'' + ", deviceId='" + this.f14814b + '\'' + ", tenantInfo=" + this.f14815c + ", showDocWatermark=" + this.f14816d + ", isKABuildPackage=" + this.f14817e + ", buildPackageChannel='" + this.f14818f + ", userUnit='" + this.f14820h + '\'' + '}';
    }

    protected DocDynamicConfig(Parcel parcel) {
        boolean z;
        boolean z2;
        this.f14813a = parcel.readInt();
        this.f14814b = parcel.readString();
        this.f14815c = (TenantInfo) parcel.readParcelable(TenantInfo.class.getClassLoader());
        boolean z3 = true;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f14816d = z;
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f14817e = z2;
        this.f14818f = parcel.readString();
        this.f14820h = parcel.readString();
        this.f14819g = (LoginInfo) parcel.readParcelable(LoginInfo.class.getClassLoader());
        this.f14821i = parcel.readByte() == 0 ? false : z3;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f14813a);
        parcel.writeString(this.f14814b);
        parcel.writeParcelable(this.f14815c, i);
        parcel.writeByte(this.f14816d ? (byte) 1 : 0);
        parcel.writeByte(this.f14817e ? (byte) 1 : 0);
        parcel.writeString(this.f14818f);
        parcel.writeString(this.f14820h);
        parcel.writeParcelable(this.f14819g, i);
        parcel.writeByte(this.f14821i ? (byte) 1 : 0);
    }

    public DocDynamicConfig(int i, LoginInfo loginInfo, String str, TenantInfo tenantInfo, boolean z, boolean z2, String str2, String str3, boolean z3) {
        this.f14813a = i;
        this.f14819g = loginInfo;
        this.f14814b = str;
        this.f14815c = tenantInfo;
        this.f14816d = z;
        this.f14817e = z2;
        this.f14818f = str2;
        this.f14820h = str3;
        this.f14821i = z3;
    }
}
