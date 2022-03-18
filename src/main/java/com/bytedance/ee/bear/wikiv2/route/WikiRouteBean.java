package com.bytedance.ee.bear.wikiv2.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ee.bear.route.RouteBean;

public class WikiRouteBean extends RouteBean {
    public static final Parcelable.Creator<WikiRouteBean> CREATOR = new Parcelable.Creator<WikiRouteBean>() {
        /* class com.bytedance.ee.bear.wikiv2.route.WikiRouteBean.C123381 */

        /* renamed from: a */
        public WikiRouteBean[] newArray(int i) {
            return new WikiRouteBean[i];
        }

        /* renamed from: a */
        public WikiRouteBean createFromParcel(Parcel parcel) {
            return new WikiRouteBean(parcel);
        }
    };

    /* renamed from: a */
    public final String f33117a;

    /* renamed from: b */
    public final int f33118b;

    /* renamed from: c */
    public final String f33119c;

    /* renamed from: d */
    public final String f33120d;

    /* renamed from: e */
    public final String f33121e;

    @Override // com.bytedance.ee.bear.route.RouteBean
    public int describeContents() {
        return 0;
    }

    protected WikiRouteBean(Parcel parcel) {
        super(parcel);
        this.f33117a = parcel.readString();
        this.f33118b = parcel.readInt();
        this.f33119c = parcel.readString();
        this.f33120d = parcel.readString();
        this.f33121e = parcel.readString();
    }

    public WikiRouteBean(String str, String str2) {
        this(null, -1, null, str, str2);
    }

    @Override // com.bytedance.ee.bear.route.RouteBean
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f33117a);
        parcel.writeInt(this.f33118b);
        parcel.writeString(this.f33119c);
        parcel.writeString(this.f33120d);
        parcel.writeString(this.f33121e);
    }

    public WikiRouteBean(String str, int i, String str2, String str3, String str4) {
        this.f33117a = str;
        this.f33118b = i;
        this.f33119c = str2;
        this.f33120d = str3;
        this.f33121e = str4;
    }
}
