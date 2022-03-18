package com.bytedance.ee.bear.contract.offline.route.parcelable;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ee.bear.route.RouteBean;

public class FolderRouteBean extends RouteBean {
    public static final Parcelable.Creator<FolderRouteBean> CREATOR = new Parcelable.Creator<FolderRouteBean>() {
        /* class com.bytedance.ee.bear.contract.offline.route.parcelable.FolderRouteBean.C52111 */

        /* renamed from: a */
        public FolderRouteBean[] newArray(int i) {
            return new FolderRouteBean[i];
        }

        /* renamed from: a */
        public FolderRouteBean createFromParcel(Parcel parcel) {
            return new FolderRouteBean(parcel);
        }
    };

    /* renamed from: a */
    private int f14917a;

    /* renamed from: b */
    private String f14918b;

    /* renamed from: c */
    private String f14919c;

    /* renamed from: d */
    private int f14920d;

    /* renamed from: e */
    private int f14921e;

    /* renamed from: f */
    private int f14922f;

    /* renamed from: g */
    private boolean f14923g;

    /* renamed from: h */
    private boolean f14924h;

    /* renamed from: i */
    private String f14925i;

    @Override // com.bytedance.ee.bear.route.RouteBean
    public int describeContents() {
        return 0;
    }

    public FolderRouteBean() {
    }

    /* renamed from: a */
    public String mo20902a() {
        return this.f14919c;
    }

    /* renamed from: b */
    public int mo20906b() {
        return this.f14917a;
    }

    /* renamed from: c */
    public String mo20910c() {
        return this.f14918b;
    }

    /* renamed from: d */
    public int mo20913d() {
        return this.f14920d;
    }

    /* renamed from: e */
    public int mo20916e() {
        return this.f14921e;
    }

    /* renamed from: f */
    public boolean mo20917f() {
        return this.f14923g;
    }

    /* renamed from: g */
    public boolean mo20918g() {
        return this.f14924h;
    }

    /* renamed from: h */
    public int mo20919h() {
        return this.f14922f;
    }

    /* renamed from: i */
    public String mo20920i() {
        return this.f14925i;
    }

    /* renamed from: a */
    public void mo20903a(int i) {
        this.f14917a = i;
    }

    /* renamed from: b */
    public void mo20907b(int i) {
        this.f14920d = i;
    }

    /* renamed from: c */
    public void mo20911c(int i) {
        this.f14921e = i;
    }

    /* renamed from: d */
    public void mo20914d(int i) {
        this.f14922f = i;
    }

    /* renamed from: a */
    public void mo20904a(String str) {
        this.f14919c = str;
    }

    /* renamed from: b */
    public void mo20908b(String str) {
        this.f14918b = str;
    }

    /* renamed from: c */
    public void mo20912c(String str) {
        this.f14925i = str;
    }

    /* renamed from: a */
    public void mo20905a(boolean z) {
        this.f14923g = z;
    }

    /* renamed from: b */
    public void mo20909b(boolean z) {
        this.f14924h = z;
    }

    protected FolderRouteBean(Parcel parcel) {
        super(parcel);
        boolean z;
        this.f14917a = parcel.readInt();
        this.f14918b = parcel.readString();
        this.f14919c = parcel.readString();
        this.f14920d = parcel.readInt();
        this.f14921e = parcel.readInt();
        boolean z2 = true;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f14923g = z;
        this.f14924h = parcel.readByte() == 0 ? false : z2;
        this.f14922f = parcel.readInt();
        this.f14925i = parcel.readString();
    }

    @Override // com.bytedance.ee.bear.route.RouteBean
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f14917a);
        parcel.writeString(this.f14918b);
        parcel.writeString(this.f14919c);
        parcel.writeInt(this.f14920d);
        parcel.writeInt(this.f14921e);
        parcel.writeByte(this.f14923g ? (byte) 1 : 0);
        parcel.writeByte(this.f14924h ? (byte) 1 : 0);
        parcel.writeInt(this.f14922f);
        parcel.writeString(this.f14925i);
    }
}
