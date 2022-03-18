package com.bytedance.ee.bear.contract.route.parcelable;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ee.bear.route.RouteBean;

public class WikiRouteBean extends RouteBean {
    public static final Parcelable.Creator<WikiRouteBean> CREATOR = new Parcelable.Creator<WikiRouteBean>() {
        /* class com.bytedance.ee.bear.contract.route.parcelable.WikiRouteBean.C52251 */

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
    private String f14973a;

    /* renamed from: b */
    private boolean f14974b;

    @Override // com.bytedance.ee.bear.route.RouteBean
    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public String mo21054a() {
        return this.f14973a;
    }

    /* renamed from: b */
    public boolean mo21056b() {
        return this.f14974b;
    }

    /* renamed from: a */
    public void mo21055a(String str) {
        this.f14973a = str;
    }

    public WikiRouteBean(String str) {
        this.f14973a = "";
        this.f14974b = true;
        this.f14973a = str;
    }

    protected WikiRouteBean(Parcel parcel) {
        super(parcel);
        this.f14973a = "";
        boolean z = true;
        this.f14974b = true;
        this.f14973a = parcel.readString();
        this.f14974b = parcel.readByte() == 0 ? false : z;
    }

    @Override // com.bytedance.ee.bear.route.RouteBean
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f14973a);
        parcel.writeByte(this.f14974b ? (byte) 1 : 0);
    }

    public WikiRouteBean(String str, boolean z) {
        this.f14973a = "";
        this.f14974b = true;
        this.f14973a = str;
        this.f14974b = z;
    }
}
