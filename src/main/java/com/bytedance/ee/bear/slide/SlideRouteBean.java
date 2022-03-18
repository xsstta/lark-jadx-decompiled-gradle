package com.bytedance.ee.bear.slide;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.ee.bear.route.RouteBean;

public class SlideRouteBean extends RouteBean {
    public static final Parcelable.Creator<SlideRouteBean> CREATOR = new Parcelable.Creator<SlideRouteBean>() {
        /* class com.bytedance.ee.bear.slide.SlideRouteBean.C113701 */

        /* renamed from: a */
        public SlideRouteBean[] newArray(int i) {
            return new SlideRouteBean[i];
        }

        /* renamed from: a */
        public SlideRouteBean createFromParcel(Parcel parcel) {
            return new SlideRouteBean(parcel);
        }
    };

    /* renamed from: a */
    private boolean f30532a;

    @Override // com.bytedance.ee.bear.route.RouteBean
    public int describeContents() {
        return 0;
    }

    public SlideRouteBean() {
    }

    /* renamed from: a */
    public boolean mo43509a() {
        return this.f30532a;
    }

    /* renamed from: a */
    public void mo43508a(boolean z) {
        this.f30532a = z;
    }

    protected SlideRouteBean(Parcel parcel) {
        super(parcel);
        boolean z;
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.f30532a = z;
    }

    @Override // com.bytedance.ee.bear.route.RouteBean
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f30532a ? (byte) 1 : 0);
    }
}
