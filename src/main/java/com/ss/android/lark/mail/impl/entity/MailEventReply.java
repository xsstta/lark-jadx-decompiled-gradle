package com.ss.android.lark.mail.impl.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.lark.pb.basic.v1.EmailCalendarEventInfo;

public class MailEventReply implements Parcelable {
    public static final Parcelable.Creator<MailEventReply> CREATOR = new Parcelable.Creator<MailEventReply>() {
        /* class com.ss.android.lark.mail.impl.entity.MailEventReply.C420721 */

        /* renamed from: a */
        public MailEventReply[] newArray(int i) {
            return new MailEventReply[i];
        }

        /* renamed from: a */
        public MailEventReply createFromParcel(Parcel parcel) {
            return new MailEventReply(parcel);
        }
    };

    /* renamed from: a */
    private boolean f106848a;

    /* renamed from: b */
    private EmailCalendarEventInfo.OutdatedType f106849b;

    /* renamed from: c */
    private EmailCalendarEventInfo.MailReplyStatus f106850c;

    /* renamed from: d */
    private long f106851d;

    /* renamed from: e */
    private String f106852e;

    /* renamed from: f */
    private long f106853f;

    /* renamed from: g */
    private String f106854g;

    /* renamed from: h */
    private String f106855h;

    /* renamed from: i */
    private boolean f106856i;

    public int describeContents() {
        return 0;
    }

    public MailEventReply() {
    }

    /* renamed from: b */
    public EmailCalendarEventInfo.MailReplyStatus mo151419b() {
        return this.f106850c;
    }

    /* renamed from: c */
    public long mo151423c() {
        return this.f106851d;
    }

    /* renamed from: d */
    public long mo151425d() {
        return this.f106853f;
    }

    /* renamed from: e */
    public String mo151427e() {
        return this.f106855h;
    }

    /* renamed from: f */
    public boolean mo151428f() {
        return this.f106856i;
    }

    /* renamed from: a */
    public boolean mo151418a() {
        return this.f106848a;
    }

    /* renamed from: a */
    public void mo151413a(long j) {
        this.f106851d = j;
    }

    /* renamed from: a */
    public void mo151414a(EmailCalendarEventInfo.MailReplyStatus mailReplyStatus) {
        this.f106850c = mailReplyStatus;
    }

    /* renamed from: b */
    public void mo151420b(long j) {
        this.f106853f = j;
    }

    /* renamed from: c */
    public void mo151424c(String str) {
        this.f106855h = str;
    }

    /* renamed from: a */
    public void mo151415a(EmailCalendarEventInfo.OutdatedType outdatedType) {
        this.f106849b = outdatedType;
    }

    /* renamed from: b */
    public void mo151421b(String str) {
        this.f106854g = str;
    }

    /* renamed from: a */
    public void mo151416a(String str) {
        this.f106852e = str;
    }

    /* renamed from: b */
    public void mo151422b(boolean z) {
        this.f106856i = z;
    }

    /* renamed from: a */
    public void mo151417a(boolean z) {
        this.f106848a = z;
    }

    public MailEventReply(Parcel parcel) {
        boolean z;
        boolean z2 = false;
        if (parcel.readInt() == 1) {
            z = true;
        } else {
            z = false;
        }
        this.f106848a = z;
        this.f106849b = EmailCalendarEventInfo.OutdatedType.fromValue(parcel.readInt());
        this.f106850c = EmailCalendarEventInfo.MailReplyStatus.fromValue(parcel.readInt());
        this.f106851d = parcel.readLong();
        this.f106852e = parcel.readString();
        this.f106853f = parcel.readLong();
        this.f106854g = parcel.readString();
        this.f106855h = parcel.readString();
        this.f106856i = parcel.readInt() == 1 ? true : z2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f106848a ? 1 : 0);
        parcel.writeInt(this.f106849b.getValue());
        parcel.writeInt(this.f106850c.getValue());
        parcel.writeLong(this.f106851d);
        parcel.writeString(this.f106852e);
        parcel.writeLong(this.f106853f);
        parcel.writeString(this.f106854g);
        parcel.writeString(this.f106855h);
        parcel.writeInt(this.f106856i ? 1 : 0);
    }
}
