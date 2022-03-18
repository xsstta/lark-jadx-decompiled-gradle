package com.ss.android.lark.applink;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

public class AppLink implements Parcelable {
    public static final Parcelable.Creator<AppLink> CREATOR = new Parcelable.Creator<AppLink>() {
        /* class com.ss.android.lark.applink.AppLink.C291791 */

        /* renamed from: a */
        public AppLink[] newArray(int i) {
            return new AppLink[i];
        }

        /* renamed from: a */
        public AppLink createFromParcel(Parcel parcel) {
            return new AppLink(parcel);
        }
    };

    /* renamed from: a */
    private String f73028a;

    /* renamed from: b */
    private int f73029b;

    /* renamed from: d */
    public void mo103438d() {
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public String mo103435a() {
        return this.f73028a;
    }

    /* renamed from: b */
    public int mo103436b() {
        return this.f73029b;
    }

    /* renamed from: c */
    public String mo103437c() {
        return Uri.parse(this.f73028a).getPath();
    }

    protected AppLink(Parcel parcel) {
        this.f73028a = parcel.readString();
        this.f73029b = parcel.readInt();
    }

    public AppLink(String str, int i) {
        this.f73028a = str;
        this.f73029b = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f73028a);
        parcel.writeInt(this.f73029b);
    }
}
