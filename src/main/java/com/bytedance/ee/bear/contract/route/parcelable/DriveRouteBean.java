package com.bytedance.ee.bear.contract.route.parcelable;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ee.bear.list.dto.Document;
import com.bytedance.ee.bear.route.RouteBean;
import java.util.List;

public class DriveRouteBean extends RouteBean {
    public static final Parcelable.Creator<DriveRouteBean> CREATOR = new Parcelable.Creator<DriveRouteBean>() {
        /* class com.bytedance.ee.bear.contract.route.parcelable.DriveRouteBean.C52221 */

        /* renamed from: a */
        public DriveRouteBean[] newArray(int i) {
            return new DriveRouteBean[i];
        }

        /* renamed from: a */
        public DriveRouteBean createFromParcel(Parcel parcel) {
            return new DriveRouteBean(parcel);
        }
    };

    /* renamed from: a */
    private List<Document> f14958a;

    /* renamed from: b */
    private String f14959b;

    @Override // com.bytedance.ee.bear.route.RouteBean
    public int describeContents() {
        return 0;
    }

    public DriveRouteBean() {
    }

    /* renamed from: a */
    public List<Document> mo20996a() {
        return this.f14958a;
    }

    /* renamed from: a */
    public void mo20997a(List<Document> list) {
        this.f14958a = list;
    }

    protected DriveRouteBean(Parcel parcel) {
        super(parcel);
        this.f14958a = parcel.createTypedArrayList(Document.CREATOR);
        this.f14959b = parcel.readString();
    }

    @Override // com.bytedance.ee.bear.route.RouteBean
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeTypedList(this.f14958a);
        parcel.writeString(this.f14959b);
    }
}
