package com.ss.android.lark.contact.entity;

import android.os.Parcel;
import android.os.Parcelable;

public class EmailContact implements Parcelable {
    public static final Parcelable.Creator<EmailContact> CREATOR = new Parcelable.Creator<EmailContact>() {
        /* class com.ss.android.lark.contact.entity.EmailContact.C353981 */

        /* renamed from: a */
        public EmailContact[] newArray(int i) {
            return new EmailContact[i];
        }

        /* renamed from: a */
        public EmailContact createFromParcel(Parcel parcel) {
            return new EmailContact(parcel);
        }
    };

    /* renamed from: a */
    protected String f91433a;

    /* renamed from: b */
    protected String f91434b;

    /* renamed from: c */
    protected String f91435c;

    /* renamed from: d */
    protected String f91436d;

    public int describeContents() {
        return 0;
    }

    /* renamed from: a */
    public String mo130495a() {
        return this.f91433a;
    }

    /* renamed from: b */
    public String mo130496b() {
        return this.f91434b;
    }

    /* renamed from: c */
    public String mo130497c() {
        return this.f91435c;
    }

    /* renamed from: d */
    public String mo130498d() {
        return this.f91436d;
    }

    protected EmailContact(Parcel parcel) {
        this.f91433a = parcel.readString();
        this.f91434b = parcel.readString();
        this.f91435c = parcel.readString();
        this.f91436d = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f91433a);
        parcel.writeString(this.f91434b);
        parcel.writeString(this.f91435c);
        parcel.writeString(this.f91436d);
    }

    public EmailContact(String str, String str2, String str3, String str4) {
        this.f91433a = str;
        this.f91434b = str2;
        this.f91435c = str3;
        this.f91436d = str4;
    }
}
