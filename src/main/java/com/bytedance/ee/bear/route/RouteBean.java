package com.bytedance.ee.bear.route;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

public class RouteBean implements Parcelable {
    public static final Parcelable.Creator<RouteBean> CREATOR = new Parcelable.Creator<RouteBean>() {
        /* class com.bytedance.ee.bear.route.RouteBean.C107351 */

        /* renamed from: a */
        public RouteBean[] newArray(int i) {
            return new RouteBean[i];
        }

        /* renamed from: a */
        public RouteBean createFromParcel(Parcel parcel) {
            return new RouteBean(parcel);
        }
    };

    /* renamed from: a */
    private int f28712a = -1;

    /* renamed from: b */
    private int f28713b = -1;

    /* renamed from: c */
    private int f28714c = -1;

    /* renamed from: d */
    private boolean f28715d;

    /* renamed from: e */
    private Bundle f28716e;

    /* renamed from: f */
    private String f28717f;

    /* renamed from: g */
    private String f28718g;

    /* renamed from: h */
    private String f28719h;

    /* renamed from: i */
    private String f28720i;

    /* renamed from: j */
    private Map<String, String> f28721j;

    /* renamed from: k */
    private String f28722k;

    /* renamed from: l */
    private String f28723l;

    /* renamed from: m */
    private Bundle f28724m;

    public int describeContents() {
        return 0;
    }

    /* renamed from: j */
    public int mo40624j() {
        return this.f28712a;
    }

    /* renamed from: k */
    public int mo40625k() {
        return this.f28713b;
    }

    /* renamed from: l */
    public int mo40626l() {
        return this.f28714c;
    }

    /* renamed from: m */
    public boolean mo40627m() {
        return this.f28715d;
    }

    /* renamed from: n */
    public Bundle mo40628n() {
        return this.f28716e;
    }

    /* renamed from: o */
    public String mo40629o() {
        return this.f28717f;
    }

    /* renamed from: p */
    public String mo40630p() {
        return this.f28718g;
    }

    /* renamed from: q */
    public String mo40631q() {
        return this.f28719h;
    }

    /* renamed from: r */
    public String mo40632r() {
        return this.f28720i;
    }

    /* renamed from: s */
    public Map<String, String> mo40633s() {
        return this.f28721j;
    }

    /* renamed from: t */
    public Bundle mo40634t() {
        return this.f28724m;
    }

    /* renamed from: u */
    public String mo40635u() {
        return this.f28722k;
    }

    /* renamed from: v */
    public String mo40636v() {
        return this.f28723l;
    }

    public RouteBean() {
    }

    /* renamed from: a */
    public void mo40611a(Bundle bundle) {
        this.f28716e = bundle;
    }

    /* renamed from: b */
    public void mo40613b(Bundle bundle) {
        this.f28724m = bundle;
    }

    /* renamed from: c */
    public void mo40614c(boolean z) {
        this.f28715d = z;
    }

    /* renamed from: d */
    public void mo40615d(String str) {
        this.f28717f = str;
    }

    /* renamed from: e */
    public void mo40616e(int i) {
        this.f28712a = i;
    }

    /* renamed from: f */
    public void mo40618f(int i) {
        this.f28713b = i;
    }

    /* renamed from: g */
    public void mo40620g(int i) {
        this.f28714c = i;
    }

    /* renamed from: h */
    public void mo40622h(String str) {
        this.f28722k = str;
    }

    /* renamed from: i */
    public void mo40623i(String str) {
        this.f28723l = str;
    }

    /* renamed from: a */
    public void mo40612a(Map<String, String> map) {
        this.f28721j = map;
    }

    /* renamed from: e */
    public void mo40617e(String str) {
        this.f28718g = str;
    }

    /* renamed from: f */
    public void mo40619f(String str) {
        this.f28719h = str;
    }

    /* renamed from: g */
    public void mo40621g(String str) {
        this.f28720i = str;
    }

    protected RouteBean(Parcel parcel) {
        boolean z;
        this.f28712a = parcel.readInt();
        this.f28713b = parcel.readInt();
        this.f28714c = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f28715d = z;
        this.f28716e = parcel.readBundle();
        this.f28717f = parcel.readString();
        this.f28718g = parcel.readString();
        this.f28719h = parcel.readString();
        this.f28720i = parcel.readString();
        this.f28722k = parcel.readString();
        this.f28723l = parcel.readString();
        this.f28724m = parcel.readBundle();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f28712a);
        parcel.writeInt(this.f28713b);
        parcel.writeInt(this.f28714c);
        parcel.writeByte(this.f28715d ? (byte) 1 : 0);
        parcel.writeBundle(this.f28716e);
        parcel.writeString(this.f28717f);
        parcel.writeString(this.f28718g);
        parcel.writeString(this.f28719h);
        parcel.writeString(this.f28720i);
        parcel.writeString(this.f28722k);
        parcel.writeString(this.f28723l);
        parcel.writeBundle(this.f28724m);
    }
}
