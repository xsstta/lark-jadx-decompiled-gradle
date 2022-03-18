package com.ss.android.lark.mail.impl.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.lark.pb.basic.v1.EmailCalendarEventInfo;
import com.bytedance.lark.pb.calendar.v1.ConflictType;
import java.util.ArrayList;
import java.util.List;

public class MailFullEventInfo implements Parcelable {
    public static final Parcelable.Creator<MailFullEventInfo> CREATOR = new Parcelable.Creator<MailFullEventInfo>() {
        /* class com.ss.android.lark.mail.impl.entity.MailFullEventInfo.C420731 */

        /* renamed from: a */
        public MailFullEventInfo[] newArray(int i) {
            return new MailFullEventInfo[i];
        }

        /* renamed from: a */
        public MailFullEventInfo createFromParcel(Parcel parcel) {
            return new MailFullEventInfo(parcel);
        }
    };

    /* renamed from: a */
    private long f106857a;

    /* renamed from: b */
    private String f106858b;

    /* renamed from: c */
    private long f106859c;

    /* renamed from: d */
    private String f106860d;

    /* renamed from: e */
    private boolean f106861e;

    /* renamed from: f */
    private String f106862f;

    /* renamed from: g */
    private String f106863g;

    /* renamed from: h */
    private String f106864h;

    /* renamed from: i */
    private boolean f106865i;

    /* renamed from: j */
    private EmailCalendarEventInfo.InteroperabilityType f106866j;

    /* renamed from: k */
    private String f106867k;

    /* renamed from: l */
    private List<String> f106868l;

    /* renamed from: m */
    private EmailCalendarEventInfo.AttendeeStatus f106869m;

    /* renamed from: n */
    private boolean f106870n;

    /* renamed from: o */
    private ConflictType f106871o;

    /* renamed from: p */
    private long f106872p;

    public int describeContents() {
        return 0;
    }

    public MailFullEventInfo() {
    }

    /* renamed from: a */
    public long mo151434a() {
        return this.f106857a;
    }

    /* renamed from: b */
    public long mo151442b() {
        return this.f106859c;
    }

    /* renamed from: d */
    public String mo151450d() {
        return this.f106862f;
    }

    /* renamed from: e */
    public String mo151453e() {
        return this.f106863g;
    }

    /* renamed from: f */
    public String mo151455f() {
        return this.f106864h;
    }

    /* renamed from: g */
    public boolean mo151457g() {
        return this.f106865i;
    }

    /* renamed from: h */
    public EmailCalendarEventInfo.InteroperabilityType mo151458h() {
        return this.f106866j;
    }

    /* renamed from: i */
    public String mo151459i() {
        return this.f106867k;
    }

    /* renamed from: j */
    public List<String> mo151460j() {
        return this.f106868l;
    }

    /* renamed from: k */
    public EmailCalendarEventInfo.AttendeeStatus mo151461k() {
        return this.f106869m;
    }

    /* renamed from: l */
    public boolean mo151462l() {
        return this.f106870n;
    }

    /* renamed from: c */
    public boolean mo151449c() {
        return this.f106861e;
    }

    /* renamed from: c */
    public void mo151446c(long j) {
        this.f106872p = j;
    }

    /* renamed from: a */
    public void mo151435a(long j) {
        this.f106857a = j;
    }

    /* renamed from: b */
    public void mo151443b(long j) {
        this.f106859c = j;
    }

    /* renamed from: c */
    public void mo151447c(String str) {
        this.f106862f = str;
    }

    /* renamed from: d */
    public void mo151451d(String str) {
        this.f106863g = str;
    }

    /* renamed from: e */
    public void mo151454e(String str) {
        this.f106864h = str;
    }

    /* renamed from: f */
    public void mo151456f(String str) {
        this.f106867k = str;
    }

    /* renamed from: a */
    public void mo151436a(EmailCalendarEventInfo.AttendeeStatus attendeeStatus) {
        this.f106869m = attendeeStatus;
    }

    /* renamed from: b */
    public void mo151444b(String str) {
        this.f106860d = str;
    }

    /* renamed from: c */
    public void mo151448c(boolean z) {
        this.f106870n = z;
    }

    /* renamed from: a */
    public void mo151437a(EmailCalendarEventInfo.InteroperabilityType interoperabilityType) {
        this.f106866j = interoperabilityType;
    }

    /* renamed from: b */
    public void mo151445b(boolean z) {
        this.f106865i = z;
    }

    /* renamed from: a */
    public void mo151438a(ConflictType conflictType) {
        this.f106871o = conflictType;
    }

    /* renamed from: a */
    public void mo151439a(String str) {
        this.f106858b = str;
    }

    public MailFullEventInfo(Parcel parcel) {
        boolean z;
        boolean z2;
        this.f106857a = parcel.readLong();
        this.f106858b = parcel.readString();
        this.f106859c = parcel.readLong();
        this.f106860d = parcel.readString();
        boolean z3 = false;
        if (parcel.readInt() == 1) {
            z = true;
        } else {
            z = false;
        }
        this.f106861e = z;
        this.f106862f = parcel.readString();
        this.f106863g = parcel.readString();
        this.f106864h = parcel.readString();
        if (parcel.readInt() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f106865i = z2;
        this.f106866j = EmailCalendarEventInfo.InteroperabilityType.fromValue(parcel.readInt());
        this.f106867k = parcel.readString();
        ArrayList arrayList = new ArrayList(parcel.readInt());
        this.f106868l = arrayList;
        parcel.readStringList(arrayList);
        this.f106869m = EmailCalendarEventInfo.AttendeeStatus.fromValue(parcel.readInt());
        this.f106870n = parcel.readInt() == 1 ? true : z3;
        this.f106871o = ConflictType.fromValue(parcel.readInt());
        this.f106872p = parcel.readLong();
    }

    /* renamed from: a */
    public void mo151440a(List<String> list) {
        this.f106868l = list;
    }

    /* renamed from: a */
    public void mo151441a(boolean z) {
        this.f106861e = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f106857a);
        parcel.writeString(this.f106858b);
        parcel.writeLong(this.f106859c);
        parcel.writeString(this.f106860d);
        parcel.writeInt(this.f106861e ? 1 : 0);
        parcel.writeString(this.f106862f);
        parcel.writeString(this.f106863g);
        parcel.writeString(this.f106864h);
        parcel.writeInt(this.f106865i ? 1 : 0);
        parcel.writeInt(this.f106866j.getValue());
        parcel.writeString(this.f106867k);
        parcel.writeInt(this.f106868l.size());
        parcel.writeStringList(this.f106868l);
        parcel.writeInt(this.f106869m.getValue());
        parcel.writeInt(this.f106870n ? 1 : 0);
        parcel.writeInt(this.f106871o.getValue());
        parcel.writeLong(this.f106872p);
    }
}
