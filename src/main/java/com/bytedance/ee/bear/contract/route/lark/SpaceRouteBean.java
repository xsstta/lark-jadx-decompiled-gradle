package com.bytedance.ee.bear.contract.route.lark;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

public class SpaceRouteBean implements Parcelable {
    public static final Parcelable.Creator<SpaceRouteBean> CREATOR = new Parcelable.Creator<SpaceRouteBean>() {
        /* class com.bytedance.ee.bear.contract.route.lark.SpaceRouteBean.C52191 */

        /* renamed from: a */
        public SpaceRouteBean[] newArray(int i) {
            return new SpaceRouteBean[i];
        }

        /* renamed from: a */
        public SpaceRouteBean createFromParcel(Parcel parcel) {
            return new SpaceRouteBean(parcel);
        }
    };

    /* renamed from: a */
    private int f14939a;

    /* renamed from: b */
    private String f14940b;

    /* renamed from: c */
    private String f14941c;

    /* renamed from: d */
    private Map<String, String> f14942d;

    /* renamed from: e */
    private Bundle f14943e;

    public int describeContents() {
        return 0;
    }

    public SpaceRouteBean() {
    }

    /* renamed from: b */
    public int mo20961b() {
        return this.f14939a;
    }

    /* renamed from: c */
    public String mo20963c() {
        return this.f14940b;
    }

    /* renamed from: d */
    public String mo20964d() {
        return this.f14941c;
    }

    /* renamed from: e */
    public Map<String, String> mo20965e() {
        return this.f14942d;
    }

    /* renamed from: f */
    public Bundle mo20966f() {
        return this.f14943e;
    }

    /* renamed from: a */
    public void mo20957a(int i) {
        this.f14939a = i;
    }

    /* renamed from: a */
    public void mo20958a(Bundle bundle) {
        this.f14943e = bundle;
    }

    /* renamed from: b */
    public void mo20962b(String str) {
        this.f14941c = str;
    }

    /* renamed from: a */
    public void mo20959a(String str) {
        this.f14940b = str;
    }

    /* renamed from: a */
    public void mo20960a(Map<String, String> map) {
        this.f14942d = map;
    }

    protected SpaceRouteBean(Parcel parcel) {
        this.f14939a = parcel.readInt();
        this.f14940b = parcel.readString();
        this.f14941c = parcel.readString();
        this.f14942d = parcel.readHashMap(getClass().getClassLoader());
        this.f14943e = parcel.readBundle(getClass().getClassLoader());
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f14939a);
        parcel.writeString(this.f14940b);
        parcel.writeString(this.f14941c);
        parcel.writeMap(this.f14942d);
        parcel.writeBundle(this.f14943e);
    }
}
