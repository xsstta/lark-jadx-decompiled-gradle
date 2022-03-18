package com.bytedance.ee.bear.contract.config;

import android.os.Parcel;
import android.os.Parcelable;

public class InterfaceDomain implements Parcelable {
    public static final Parcelable.Creator<InterfaceDomain> CREATOR = new Parcelable.Creator<InterfaceDomain>() {
        /* class com.bytedance.ee.bear.contract.config.InterfaceDomain.C51201 */

        /* renamed from: a */
        public InterfaceDomain[] newArray(int i) {
            return new InterfaceDomain[i];
        }

        /* renamed from: a */
        public InterfaceDomain createFromParcel(Parcel parcel) {
            return new InterfaceDomain(parcel);
        }
    };

    /* renamed from: a */
    public String f14822a;

    /* renamed from: b */
    public String f14823b;

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public String mo20238a() {
        return this.f14822a;
    }

    public String toString() {
        return "InterfaceDomain{docsApi='" + this.f14822a + '\'' + ", driveApi='" + this.f14823b + '\'' + '}';
    }

    protected InterfaceDomain(Parcel parcel) {
        this.f14822a = parcel.readString();
        this.f14823b = parcel.readString();
    }

    public InterfaceDomain(String str, String str2) {
        this.f14822a = str;
        this.f14823b = str2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f14822a);
        parcel.writeString(this.f14823b);
    }
}
