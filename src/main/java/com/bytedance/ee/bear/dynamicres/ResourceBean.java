package com.bytedance.ee.bear.dynamicres;

import android.os.Parcel;
import android.os.Parcelable;

public class ResourceBean implements Parcelable {
    public static final Parcelable.Creator<ResourceBean> CREATOR = new Parcelable.Creator<ResourceBean>() {
        /* class com.bytedance.ee.bear.dynamicres.ResourceBean.C75851 */

        /* renamed from: a */
        public ResourceBean[] newArray(int i) {
            return new ResourceBean[i];
        }

        /* renamed from: a */
        public ResourceBean createFromParcel(Parcel parcel) {
            return new ResourceBean(parcel);
        }
    };

    /* renamed from: a */
    private int f20591a;

    /* renamed from: b */
    private String f20592b;

    /* renamed from: c */
    private String f20593c;

    /* renamed from: d */
    private String f20594d;

    public int describeContents() {
        return 0;
    }

    public ResourceBean() {
    }

    /* renamed from: a */
    public String mo29826a() {
        return this.f20593c;
    }

    public String toString() {
        return "ResUpdateBean{version=" + this.f20591a + ", channel='" + this.f20592b + '\'' + ", dir='" + this.f20593c + '\'' + ", zipName='" + this.f20594d + '\'' + '}';
    }

    /* renamed from: a */
    public void mo29827a(String str) {
        this.f20593c = str;
    }

    protected ResourceBean(Parcel parcel) {
        this.f20591a = parcel.readInt();
        this.f20592b = parcel.readString();
        this.f20593c = parcel.readString();
        this.f20594d = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f20591a);
        parcel.writeString(this.f20592b);
        parcel.writeString(this.f20593c);
        parcel.writeString(this.f20594d);
    }
}
