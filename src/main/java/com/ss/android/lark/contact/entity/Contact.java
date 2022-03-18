package com.ss.android.lark.contact.entity;

import android.os.Parcel;
import android.os.Parcelable;

public class Contact implements Parcelable {
    public static final Parcelable.Creator<Contact> CREATOR = new Parcelable.Creator<Contact>() {
        /* class com.ss.android.lark.contact.entity.Contact.C353971 */

        /* renamed from: a */
        public Contact[] newArray(int i) {
            return new Contact[i];
        }

        /* renamed from: a */
        public Contact createFromParcel(Parcel parcel) {
            return new Contact(parcel);
        }
    };

    /* renamed from: a */
    protected String f91430a;

    /* renamed from: b */
    protected String f91431b;

    /* renamed from: c */
    protected String f91432c;

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public String mo130406a() {
        return this.f91430a;
    }

    /* renamed from: b */
    public String mo130407b() {
        return this.f91431b;
    }

    /* renamed from: c */
    public String mo130408c() {
        return this.f91432c;
    }

    protected Contact(Parcel parcel) {
        this.f91430a = parcel.readString();
        this.f91431b = parcel.readString();
        this.f91432c = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f91430a);
        parcel.writeString(this.f91431b);
        parcel.writeString(this.f91432c);
    }

    public Contact(String str, String str2, String str3) {
        this.f91430a = str;
        this.f91431b = str2;
        this.f91432c = str3;
    }
}
