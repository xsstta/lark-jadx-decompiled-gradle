package com.ss.android.lark.mail.impl.entity;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.lark.pb.basic.v1.EmailCalendarEventInfo;

public class MailCalendar implements Parcelable {
    public static final Parcelable.Creator<MailCalendar> CREATOR = new Parcelable.Creator<MailCalendar>() {
        /* class com.ss.android.lark.mail.impl.entity.MailCalendar.C420641 */

        /* renamed from: a */
        public MailCalendar[] newArray(int i) {
            return new MailCalendar[i];
        }

        /* renamed from: a */
        public MailCalendar createFromParcel(Parcel parcel) {
            return new MailCalendar(parcel);
        }
    };

    /* renamed from: a */
    private String f106794a;

    /* renamed from: b */
    private String f106795b;

    /* renamed from: c */
    private String f106796c;

    /* renamed from: d */
    private long f106797d;

    /* renamed from: e */
    private String f106798e;

    /* renamed from: f */
    private String f106799f;

    /* renamed from: g */
    private EmailCalendarEventInfo.CalendarMailMessageType f106800g;

    /* renamed from: h */
    private boolean f106801h;

    /* renamed from: i */
    private boolean f106802i;

    /* renamed from: j */
    private boolean f106803j;

    /* renamed from: k */
    private boolean f106804k;

    /* renamed from: l */
    private boolean f106805l;

    /* renamed from: m */
    private EmailCalendarEventInfo.OutdatedType f106806m;

    /* renamed from: n */
    private MailEventReply f106807n;

    /* renamed from: o */
    private boolean f106808o;

    /* renamed from: p */
    private EmailCalendarEventInfo.CalendarMailMessageType f106809p;

    /* renamed from: q */
    private MailPartEventInfo f106810q;

    /* renamed from: r */
    private MailFullEventInfo f106811r;

    public int describeContents() {
        return 0;
    }

    public MailCalendar() {
    }

    /* renamed from: a */
    public String mo151249a() {
        return this.f106794a;
    }

    /* renamed from: b */
    public String mo151258b() {
        return this.f106795b;
    }

    /* renamed from: c */
    public String mo151262c() {
        return this.f106796c;
    }

    /* renamed from: d */
    public long mo151265d() {
        return this.f106797d;
    }

    /* renamed from: e */
    public String mo151269e() {
        return this.f106799f;
    }

    /* renamed from: f */
    public EmailCalendarEventInfo.CalendarMailMessageType mo151272f() {
        return this.f106800g;
    }

    /* renamed from: g */
    public MailPartEventInfo mo151274g() {
        return this.f106810q;
    }

    /* renamed from: h */
    public MailFullEventInfo mo151275h() {
        return this.f106811r;
    }

    /* renamed from: j */
    public boolean mo151277j() {
        return this.f106801h;
    }

    /* renamed from: k */
    public boolean mo151278k() {
        return this.f106802i;
    }

    /* renamed from: l */
    public boolean mo151279l() {
        return this.f106803j;
    }

    /* renamed from: m */
    public boolean mo151280m() {
        return this.f106805l;
    }

    /* renamed from: n */
    public EmailCalendarEventInfo.CalendarMailMessageType mo151281n() {
        return this.f106809p;
    }

    /* renamed from: o */
    public boolean mo151282o() {
        return this.f106808o;
    }

    /* renamed from: p */
    public EmailCalendarEventInfo.OutdatedType mo151283p() {
        return this.f106806m;
    }

    /* renamed from: q */
    public MailEventReply mo151284q() {
        return this.f106807n;
    }

    /* renamed from: r */
    public boolean mo151285r() {
        return this.f106804k;
    }

    /* renamed from: i */
    public boolean mo151276i() {
        return !TextUtils.isEmpty(this.f106795b);
    }

    /* renamed from: s */
    public String mo151286s() {
        if (this.f106800g != null) {
            switch (C420652.f106812a[this.f106800g.ordinal()]) {
                case 1:
                    return "REPLY";
                case 2:
                    return "INVITE";
                case 3:
                    return "UPDATE";
                case 4:
                    return "CANCEL";
                case 5:
                    return "SELF_DELETE";
                case 6:
                    return "UPDATE_OUTDATED";
                case 7:
                    return "NOT_FOUND";
            }
        }
        return "";
    }

    /* renamed from: com.ss.android.lark.mail.impl.entity.MailCalendar$2 */
    static /* synthetic */ class C420652 {

        /* renamed from: a */
        static final /* synthetic */ int[] f106812a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.bytedance.lark.pb.basic.v1.EmailCalendarEventInfo$CalendarMailMessageType[] r0 = com.bytedance.lark.pb.basic.v1.EmailCalendarEventInfo.CalendarMailMessageType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ss.android.lark.mail.impl.entity.MailCalendar.C420652.f106812a = r0
                com.bytedance.lark.pb.basic.v1.EmailCalendarEventInfo$CalendarMailMessageType r1 = com.bytedance.lark.pb.basic.v1.EmailCalendarEventInfo.CalendarMailMessageType.EVENT_REPLY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.ss.android.lark.mail.impl.entity.MailCalendar.C420652.f106812a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.lark.pb.basic.v1.EmailCalendarEventInfo$CalendarMailMessageType r1 = com.bytedance.lark.pb.basic.v1.EmailCalendarEventInfo.CalendarMailMessageType.EVENT_INVITE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.ss.android.lark.mail.impl.entity.MailCalendar.C420652.f106812a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.lark.pb.basic.v1.EmailCalendarEventInfo$CalendarMailMessageType r1 = com.bytedance.lark.pb.basic.v1.EmailCalendarEventInfo.CalendarMailMessageType.EVENT_UPDATE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.ss.android.lark.mail.impl.entity.MailCalendar.C420652.f106812a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.bytedance.lark.pb.basic.v1.EmailCalendarEventInfo$CalendarMailMessageType r1 = com.bytedance.lark.pb.basic.v1.EmailCalendarEventInfo.CalendarMailMessageType.EVENT_CANCEL     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.ss.android.lark.mail.impl.entity.MailCalendar.C420652.f106812a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.bytedance.lark.pb.basic.v1.EmailCalendarEventInfo$CalendarMailMessageType r1 = com.bytedance.lark.pb.basic.v1.EmailCalendarEventInfo.CalendarMailMessageType.EVENT_SELF_DELETE     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = com.ss.android.lark.mail.impl.entity.MailCalendar.C420652.f106812a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.bytedance.lark.pb.basic.v1.EmailCalendarEventInfo$CalendarMailMessageType r1 = com.bytedance.lark.pb.basic.v1.EmailCalendarEventInfo.CalendarMailMessageType.EVENT_UPDATE_OUTDATED     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = com.ss.android.lark.mail.impl.entity.MailCalendar.C420652.f106812a     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.bytedance.lark.pb.basic.v1.EmailCalendarEventInfo$CalendarMailMessageType r1 = com.bytedance.lark.pb.basic.v1.EmailCalendarEventInfo.CalendarMailMessageType.EVENT_NOT_FOUND     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.mail.impl.entity.MailCalendar.C420652.<clinit>():void");
        }
    }

    /* renamed from: a */
    public void mo151250a(long j) {
        this.f106797d = j;
    }

    /* renamed from: b */
    public void mo151259b(EmailCalendarEventInfo.CalendarMailMessageType calendarMailMessageType) {
        this.f106809p = calendarMailMessageType;
    }

    /* renamed from: c */
    public void mo151263c(String str) {
        this.f106796c = str;
    }

    /* renamed from: d */
    public void mo151266d(String str) {
        this.f106798e = str;
    }

    /* renamed from: e */
    public void mo151270e(String str) {
        this.f106799f = str;
    }

    /* renamed from: f */
    public void mo151273f(boolean z) {
        this.f106804k = z;
    }

    /* renamed from: a */
    public void mo151251a(EmailCalendarEventInfo.CalendarMailMessageType calendarMailMessageType) {
        this.f106800g = calendarMailMessageType;
    }

    /* renamed from: b */
    public void mo151260b(String str) {
        this.f106795b = str;
    }

    /* renamed from: c */
    public void mo151264c(boolean z) {
        this.f106803j = z;
    }

    /* renamed from: d */
    public void mo151267d(boolean z) {
        this.f106805l = z;
    }

    /* renamed from: e */
    public void mo151271e(boolean z) {
        this.f106808o = z;
    }

    /* renamed from: a */
    public void mo151252a(EmailCalendarEventInfo.OutdatedType outdatedType) {
        this.f106806m = outdatedType;
    }

    /* renamed from: b */
    public void mo151261b(boolean z) {
        this.f106802i = z;
    }

    /* renamed from: a */
    public void mo151253a(MailEventReply mailEventReply) {
        this.f106807n = mailEventReply;
    }

    /* renamed from: a */
    public void mo151254a(MailFullEventInfo mailFullEventInfo) {
        this.f106811r = mailFullEventInfo;
    }

    public MailCalendar(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        this.f106794a = parcel.readString();
        this.f106795b = parcel.readString();
        this.f106796c = parcel.readString();
        this.f106797d = parcel.readLong();
        this.f106798e = parcel.readString();
        this.f106799f = parcel.readString();
        this.f106800g = EmailCalendarEventInfo.CalendarMailMessageType.fromValue(parcel.readInt());
        boolean z6 = false;
        if (parcel.readInt() == 1) {
            z = true;
        } else {
            z = false;
        }
        this.f106801h = z;
        if (parcel.readInt() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f106802i = z2;
        if (parcel.readInt() == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.f106803j = z3;
        if (parcel.readInt() == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f106808o = z4;
        if (parcel.readInt() == 1) {
            z5 = true;
        } else {
            z5 = false;
        }
        this.f106805l = z5;
        this.f106806m = EmailCalendarEventInfo.OutdatedType.fromValue(parcel.readInt());
        this.f106807n = (MailEventReply) parcel.readParcelable(MailEventReply.class.getClassLoader());
        this.f106809p = EmailCalendarEventInfo.CalendarMailMessageType.fromValue(parcel.readInt());
        this.f106804k = parcel.readInt() == 1 ? true : z6;
    }

    /* renamed from: a */
    public void mo151255a(MailPartEventInfo mailPartEventInfo) {
        this.f106810q = mailPartEventInfo;
    }

    /* renamed from: a */
    public void mo151256a(String str) {
        this.f106794a = str;
    }

    /* renamed from: a */
    public void mo151257a(boolean z) {
        this.f106801h = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f106794a);
        parcel.writeString(this.f106795b);
        parcel.writeString(this.f106796c);
        parcel.writeLong(this.f106797d);
        parcel.writeString(this.f106798e);
        parcel.writeString(this.f106799f);
        parcel.writeInt(this.f106800g.getValue());
        parcel.writeInt(this.f106801h ? 1 : 0);
        parcel.writeInt(this.f106802i ? 1 : 0);
        parcel.writeInt(this.f106803j ? 1 : 0);
        parcel.writeInt(this.f106808o ? 1 : 0);
        parcel.writeInt(this.f106805l ? 1 : 0);
        parcel.writeInt(this.f106806m.getValue());
        parcel.writeParcelable(this.f106807n, i);
        parcel.writeInt(this.f106809p.getValue());
        parcel.writeInt(this.f106804k ? 1 : 0);
    }
}
