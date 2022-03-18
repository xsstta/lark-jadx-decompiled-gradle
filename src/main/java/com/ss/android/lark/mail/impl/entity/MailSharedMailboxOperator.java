package com.ss.android.lark.mail.impl.entity;

import android.os.Parcel;
import android.os.Parcelable;

public class MailSharedMailboxOperator implements Parcelable {
    public static final Parcelable.Creator<MailSharedMailboxOperator> CREATOR = new Parcelable.Creator<MailSharedMailboxOperator>() {
        /* class com.ss.android.lark.mail.impl.entity.MailSharedMailboxOperator.C420791 */

        /* renamed from: a */
        public MailSharedMailboxOperator[] newArray(int i) {
            return new MailSharedMailboxOperator[i];
        }

        /* renamed from: a */
        public MailSharedMailboxOperator createFromParcel(Parcel parcel) {
            return new MailSharedMailboxOperator(parcel);
        }
    };

    /* renamed from: a */
    private String f106951a;

    /* renamed from: b */
    private String f106952b;

    /* renamed from: c */
    private String f106953c;

    public int describeContents() {
        return 0;
    }

    public MailSharedMailboxOperator() {
    }

    /* renamed from: a */
    public String mo151656a() {
        return this.f106951a;
    }

    /* renamed from: b */
    public String mo151658b() {
        return this.f106952b;
    }

    /* renamed from: c */
    public String mo151660c() {
        return this.f106953c;
    }

    /* renamed from: a */
    public void mo151657a(String str) {
        this.f106951a = str;
    }

    /* renamed from: b */
    public void mo151659b(String str) {
        this.f106952b = str;
    }

    /* renamed from: c */
    public void mo151661c(String str) {
        this.f106953c = str;
    }

    protected MailSharedMailboxOperator(Parcel parcel) {
        this.f106951a = parcel.readString();
        this.f106952b = parcel.readString();
        this.f106953c = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f106951a);
        parcel.writeString(this.f106952b);
        parcel.writeString(this.f106953c);
    }
}
