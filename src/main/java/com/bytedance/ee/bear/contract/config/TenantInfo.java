package com.bytedance.ee.bear.contract.config;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public class TenantInfo implements Parcelable {
    public static final Parcelable.Creator<TenantInfo> CREATOR = new Parcelable.Creator<TenantInfo>() {
        /* class com.bytedance.ee.bear.contract.config.TenantInfo.C51221 */

        /* renamed from: a */
        public TenantInfo[] newArray(int i) {
            return new TenantInfo[i];
        }

        /* renamed from: a */
        public TenantInfo createFromParcel(Parcel parcel) {
            return new TenantInfo(parcel);
        }
    };

    /* renamed from: a */
    public final String f14832a;

    /* renamed from: b */
    public final String f14833b;

    /* renamed from: c */
    public final boolean f14834c;

    /* renamed from: d */
    public InterfaceDomain f14835d;

    /* renamed from: e */
    public String f14836e;

    /* renamed from: f */
    public List<String> f14837f;

    /* renamed from: g */
    public String f14838g;

    /* renamed from: h */
    public String f14839h;

    /* renamed from: i */
    public String f14840i;

    /* renamed from: j */
    public int f14841j;

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public InterfaceDomain mo20260a() {
        return this.f14835d;
    }

    /* renamed from: b */
    public String mo20261b() {
        return this.f14836e;
    }

    /* renamed from: c */
    public List<String> mo20262c() {
        return this.f14837f;
    }

    /* renamed from: d */
    public String mo20263d() {
        return this.f14840i;
    }

    /* renamed from: e */
    public int mo20265e() {
        return this.f14841j;
    }

    /* renamed from: f */
    public String mo20266f() {
        return this.f14838g;
    }

    public String toString() {
        return "TenantInfo{hostDomain='" + this.f14832a + '\'' + ", country='" + this.f14833b + '\'' + ", isOversea=" + this.f14834c + ", interfaceDomain=" + this.f14835d + ", mainPersistentConnectionDomain='" + this.f14836e + '\'' + ", persistentConnectionKey='" + this.f14838g + '\'' + ", configPlatformURL='" + this.f14839h + '\'' + ", frontendHotFixDomain='" + this.f14840i + '}';
    }

    protected TenantInfo(Parcel parcel) {
        boolean z;
        this.f14832a = parcel.readString();
        this.f14833b = parcel.readString();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f14834c = z;
        this.f14835d = (InterfaceDomain) parcel.readParcelable(InterfaceDomain.class.getClassLoader());
        this.f14836e = parcel.readString();
        this.f14838g = parcel.readString();
        this.f14839h = parcel.readString();
        this.f14840i = parcel.readString();
        this.f14841j = parcel.readInt();
        this.f14837f = parcel.createStringArrayList();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f14832a);
        parcel.writeString(this.f14833b);
        parcel.writeByte(this.f14834c ? (byte) 1 : 0);
        parcel.writeParcelable(this.f14835d, i);
        parcel.writeString(this.f14836e);
        parcel.writeString(this.f14838g);
        parcel.writeString(this.f14839h);
        parcel.writeString(this.f14840i);
        parcel.writeInt(this.f14841j);
        parcel.writeStringList(this.f14837f);
    }

    public TenantInfo(String str, String str2, boolean z, InterfaceDomain interfaceDomain, String str3, List<String> list, String str4, String str5, int i, String str6) {
        this.f14832a = str;
        this.f14833b = str2;
        this.f14834c = z;
        this.f14835d = interfaceDomain;
        this.f14836e = str3;
        this.f14837f = list;
        this.f14839h = str4;
        this.f14840i = str5;
        this.f14841j = i;
        this.f14838g = str6;
    }
}
