package com.ss.android.lark.mail.impl.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.lark.pb.basic.v1.EmailCalendarEventInfo;

public class MailPartEventInfo implements Parcelable {
    public static final Parcelable.Creator<MailPartEventInfo> CREATOR = new Parcelable.Creator<MailPartEventInfo>() {
        /* class com.ss.android.lark.mail.impl.entity.MailPartEventInfo.C420781 */

        /* renamed from: a */
        public MailPartEventInfo[] newArray(int i) {
            return new MailPartEventInfo[i];
        }

        /* renamed from: a */
        public MailPartEventInfo createFromParcel(Parcel parcel) {
            return new MailPartEventInfo(parcel);
        }
    };

    /* renamed from: a */
    private String f106948a;

    /* renamed from: b */
    private boolean f106949b;

    /* renamed from: c */
    private EmailCalendarEventInfo.InteroperabilityType f106950c;

    public int describeContents() {
        return 0;
    }

    public MailPartEventInfo() {
    }

    /* renamed from: a */
    public String mo151644a() {
        return this.f106948a;
    }

    /* renamed from: b */
    public boolean mo151648b() {
        return this.f106949b;
    }

    /* renamed from: c */
    public EmailCalendarEventInfo.InteroperabilityType mo151649c() {
        return this.f106950c;
    }

    /* renamed from: a */
    public void mo151645a(EmailCalendarEventInfo.InteroperabilityType interoperabilityType) {
        this.f106950c = interoperabilityType;
    }

    /* renamed from: a */
    public void mo151646a(String str) {
        this.f106948a = str;
    }

    public MailPartEventInfo(Parcel parcel) {
        this.f106948a = parcel.readString();
        this.f106949b = parcel.readInt() != 1 ? false : true;
        this.f106950c = EmailCalendarEventInfo.InteroperabilityType.fromValue(parcel.readInt());
    }

    /* renamed from: a */
    public void mo151647a(boolean z) {
        this.f106949b = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f106948a);
        parcel.writeInt(this.f106949b ? 1 : 0);
        parcel.writeInt(this.f106950c.getValue());
    }
}
