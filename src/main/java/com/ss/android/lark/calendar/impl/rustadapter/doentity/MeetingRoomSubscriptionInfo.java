package com.ss.android.lark.calendar.impl.rustadapter.doentity;

import com.ss.android.vc.meeting.framework.meeting.IByteRtcError;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b+\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001Bo\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u0010J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0005HÆ\u0003J\t\u00100\u001a\u00020\tHÆ\u0003J\t\u00101\u001a\u00020\tHÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\rHÆ\u0003Js\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u00106\u001a\u00020\u00032\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u000209HÖ\u0001J\t\u0010:\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0007\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\n\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010\u0018R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001cR\u001a\u0010\u000b\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010#\"\u0004\b$\u0010%R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010#\"\u0004\b&\u0010%R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0016\"\u0004\b(\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0012\"\u0004\b*\u0010\u0014¨\u0006;"}, d2 = {"Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/MeetingRoomSubscriptionInfo;", "", "isPublic", "", "summary", "", "eventId", "calendarId", "eventStartTime", "", "eventEndTime", "isAllDay", "originalCreator", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventCreator;", "creator", "eventOrganizer", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZLcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventCreator;Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventCreator;Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventCreator;)V", "getCalendarId", "()Ljava/lang/String;", "setCalendarId", "(Ljava/lang/String;)V", "getCreator", "()Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventCreator;", "setCreator", "(Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventCreator;)V", "getEventEndTime", "()J", "setEventEndTime", "(J)V", "getEventId", "setEventId", "getEventOrganizer", "setEventOrganizer", "getEventStartTime", "setEventStartTime", "()Z", "setAllDay", "(Z)V", "setPublic", "getOriginalCreator", "setOriginalCreator", "getSummary", "setSummary", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.rustadapter.doentity.q */
public final class MeetingRoomSubscriptionInfo {

    /* renamed from: a */
    private boolean f83644a;

    /* renamed from: b */
    private String f83645b;

    /* renamed from: c */
    private String f83646c;

    /* renamed from: d */
    private String f83647d;

    /* renamed from: e */
    private long f83648e;

    /* renamed from: f */
    private long f83649f;

    /* renamed from: g */
    private boolean f83650g;

    /* renamed from: h */
    private CalendarEventCreator f83651h;

    /* renamed from: i */
    private CalendarEventCreator f83652i;

    /* renamed from: j */
    private CalendarEventCreator f83653j;

    public MeetingRoomSubscriptionInfo() {
        this(false, null, null, null, 0, 0, false, null, null, null, IByteRtcError.BRERR_ADM_NO_MODIFY_PERMISSION, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MeetingRoomSubscriptionInfo)) {
            return false;
        }
        MeetingRoomSubscriptionInfo qVar = (MeetingRoomSubscriptionInfo) obj;
        return this.f83644a == qVar.f83644a && Intrinsics.areEqual(this.f83645b, qVar.f83645b) && Intrinsics.areEqual(this.f83646c, qVar.f83646c) && Intrinsics.areEqual(this.f83647d, qVar.f83647d) && this.f83648e == qVar.f83648e && this.f83649f == qVar.f83649f && this.f83650g == qVar.f83650g && Intrinsics.areEqual(this.f83651h, qVar.f83651h) && Intrinsics.areEqual(this.f83652i, qVar.f83652i) && Intrinsics.areEqual(this.f83653j, qVar.f83653j);
    }

    public int hashCode() {
        boolean z = this.f83644a;
        int i = 1;
        if (z) {
            z = true;
        }
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = i2 * 31;
        String str = this.f83645b;
        int i6 = 0;
        int hashCode = (i5 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f83646c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f83647d;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        long j = this.f83648e;
        long j2 = this.f83649f;
        int i7 = (((((hashCode2 + hashCode3) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        boolean z2 = this.f83650g;
        if (!z2) {
            i = z2 ? 1 : 0;
        }
        int i8 = (i7 + i) * 31;
        CalendarEventCreator calendarEventCreator = this.f83651h;
        int hashCode4 = (i8 + (calendarEventCreator != null ? calendarEventCreator.hashCode() : 0)) * 31;
        CalendarEventCreator calendarEventCreator2 = this.f83652i;
        int hashCode5 = (hashCode4 + (calendarEventCreator2 != null ? calendarEventCreator2.hashCode() : 0)) * 31;
        CalendarEventCreator calendarEventCreator3 = this.f83653j;
        if (calendarEventCreator3 != null) {
            i6 = calendarEventCreator3.hashCode();
        }
        return hashCode5 + i6;
    }

    public String toString() {
        return "MeetingRoomSubscriptionInfo(isPublic=" + this.f83644a + ", summary=" + this.f83645b + ", eventId=" + this.f83646c + ", calendarId=" + this.f83647d + ", eventStartTime=" + this.f83648e + ", eventEndTime=" + this.f83649f + ", isAllDay=" + this.f83650g + ", originalCreator=" + this.f83651h + ", creator=" + this.f83652i + ", eventOrganizer=" + this.f83653j + ")";
    }

    /* renamed from: a */
    public final long mo120172a() {
        return this.f83648e;
    }

    /* renamed from: b */
    public final long mo120177b() {
        return this.f83649f;
    }

    /* renamed from: d */
    public final CalendarEventCreator mo120185d() {
        return this.f83651h;
    }

    /* renamed from: e */
    public final CalendarEventCreator mo120186e() {
        return this.f83652i;
    }

    /* renamed from: f */
    public final CalendarEventCreator mo120188f() {
        return this.f83653j;
    }

    /* renamed from: c */
    public final boolean mo120184c() {
        return this.f83650g;
    }

    /* renamed from: c */
    public final void mo120182c(CalendarEventCreator calendarEventCreator) {
        this.f83653j = calendarEventCreator;
    }

    /* renamed from: a */
    public final void mo120173a(long j) {
        this.f83648e = j;
    }

    /* renamed from: b */
    public final void mo120178b(long j) {
        this.f83649f = j;
    }

    /* renamed from: c */
    public final void mo120183c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f83647d = str;
    }

    /* renamed from: a */
    public final void mo120174a(CalendarEventCreator calendarEventCreator) {
        this.f83651h = calendarEventCreator;
    }

    /* renamed from: b */
    public final void mo120179b(CalendarEventCreator calendarEventCreator) {
        this.f83652i = calendarEventCreator;
    }

    /* renamed from: a */
    public final void mo120175a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f83645b = str;
    }

    /* renamed from: b */
    public final void mo120180b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f83646c = str;
    }

    /* renamed from: a */
    public final void mo120176a(boolean z) {
        this.f83644a = z;
    }

    /* renamed from: b */
    public final void mo120181b(boolean z) {
        this.f83650g = z;
    }

    public MeetingRoomSubscriptionInfo(boolean z, String str, String str2, String str3, long j, long j2, boolean z2, CalendarEventCreator calendarEventCreator, CalendarEventCreator calendarEventCreator2, CalendarEventCreator calendarEventCreator3) {
        Intrinsics.checkParameterIsNotNull(str, "summary");
        Intrinsics.checkParameterIsNotNull(str2, "eventId");
        Intrinsics.checkParameterIsNotNull(str3, "calendarId");
        this.f83644a = z;
        this.f83645b = str;
        this.f83646c = str2;
        this.f83647d = str3;
        this.f83648e = j;
        this.f83649f = j2;
        this.f83650g = z2;
        this.f83651h = calendarEventCreator;
        this.f83652i = calendarEventCreator2;
        this.f83653j = calendarEventCreator3;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ MeetingRoomSubscriptionInfo(boolean r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, long r18, long r20, boolean r22, com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventCreator r23, com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventCreator r24, com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventCreator r25, int r26, kotlin.jvm.internal.DefaultConstructorMarker r27) {
        /*
        // Method dump skipped, instructions count: 113
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.lark.calendar.impl.rustadapter.doentity.MeetingRoomSubscriptionInfo.<init>(boolean, java.lang.String, java.lang.String, java.lang.String, long, long, boolean, com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventCreator, com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventCreator, com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventCreator, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
