package com.ss.android.lark.biz.core.api.resource;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.lark.pb.basic.v1.Trace;
import com.larksuite.framework.callback.Entity.ErrorResult;

public class Resource implements Parcelable {
    public static final Parcelable.Creator<Resource> CREATOR = new Parcelable.Creator<Resource>() {
        /* class com.ss.android.lark.biz.core.api.resource.Resource.C295781 */

        /* renamed from: a */
        public Resource[] newArray(int i) {
            return new Resource[i];
        }

        /* renamed from: a */
        public Resource createFromParcel(Parcel parcel) {
            return new Resource(parcel);
        }
    };

    /* renamed from: a */
    String f74014a;

    /* renamed from: b */
    String f74015b;

    /* renamed from: c */
    Trace f74016c;

    /* renamed from: d */
    ErrorResult f74017d;

    public int describeContents() {
        return 0;
    }

    public Resource() {
    }

    /* renamed from: a */
    public String mo105842a() {
        return this.f74014a;
    }

    /* renamed from: b */
    public String mo105845b() {
        return this.f74015b;
    }

    /* renamed from: c */
    public Trace mo105846c() {
        return this.f74016c;
    }

    /* renamed from: d */
    public ErrorResult mo105847d() {
        return this.f74017d;
    }

    /* renamed from: a */
    public void mo105843a(Trace trace) {
        this.f74016c = trace;
    }

    /* renamed from: a */
    public void mo105844a(ErrorResult errorResult) {
        this.f74017d = errorResult;
    }

    protected Resource(Parcel parcel) {
        this.f74014a = parcel.readString();
        this.f74015b = parcel.readString();
        this.f74016c = (Trace) parcel.readSerializable();
        this.f74017d = (ErrorResult) parcel.readSerializable();
    }

    public Resource(String str, String str2) {
        this.f74014a = str;
        this.f74015b = str2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f74014a);
        parcel.writeString(this.f74015b);
        parcel.writeSerializable(this.f74016c);
        parcel.writeSerializable(this.f74017d);
    }
}
