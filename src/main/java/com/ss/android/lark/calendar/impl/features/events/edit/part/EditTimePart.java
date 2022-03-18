package com.ss.android.lark.calendar.impl.features.events.edit.part;

import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u00103\u001a\u00020\u001fJ\u0006\u00104\u001a\u00020(J\b\u00105\u001a\u00020(H\u0002J\u0006\u00106\u001a\u000207J\u000e\u00108\u001a\u0002072\u0006\u00109\u001a\u00020:J\"\u0010;\u001a\u0002072\b\u0010<\u001a\u0004\u0018\u00010\n2\b\u0010=\u001a\u0004\u0018\u00010\n2\u0006\u0010>\u001a\u00020\u001fR\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\f\"\u0004\b\u001d\u0010\u000eR\u001a\u0010\u001e\u001a\u00020\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u000e\u0010$\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u001fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010'\u001a\u0004\u0018\u00010(X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020\u0016X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0018\"\u0004\b/\u0010\u001aR\u001a\u00100\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\f\"\u0004\b2\u0010\u000e¨\u0006?"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/part/EditTimePart;", "", "()V", "currentTimeZone", "Ljava/util/TimeZone;", "getCurrentTimeZone", "()Ljava/util/TimeZone;", "setCurrentTimeZone", "(Ljava/util/TimeZone;)V", "currentTimeZoneId", "", "getCurrentTimeZoneId", "()Ljava/lang/String;", "setCurrentTimeZoneId", "(Ljava/lang/String;)V", "defaultEventDuration", "", "getDefaultEventDuration$calendar_impl_release", "()I", "setDefaultEventDuration$calendar_impl_release", "(I)V", "endTime", "", "getEndTime$calendar_impl_release", "()J", "setEndTime$calendar_impl_release", "(J)V", "endTimeZoneId", "getEndTimeZoneId$calendar_impl_release", "setEndTimeZoneId$calendar_impl_release", "isAllDay", "", "isAllDay$calendar_impl_release", "()Z", "setAllDay$calendar_impl_release", "(Z)V", "originalEndTime", "originalIsAllDay", "originalStartTime", "startDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "getStartDate$calendar_impl_release", "()Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "setStartDate$calendar_impl_release", "(Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;)V", "startTime", "getStartTime$calendar_impl_release", "setStartTime$calendar_impl_release", "startTimeZoneId", "getStartTimeZoneId$calendar_impl_release", "setStartTimeZoneId$calendar_impl_release", "editHasModify", "getEventStartCalendarDate", "getStartCalendarDate", "updateTimeDataForCreate", "", "updateTimeDataForEdit", "instance", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarEventInstance;", "updateTimeZoneForEdit", "eventStartTimeZoneId", "eventEndTimeZoneId", "isEditableWhenEdit", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.part.g */
public final class EditTimePart {

    /* renamed from: a */
    private int f81351a = 60;

    /* renamed from: b */
    private long f81352b;

    /* renamed from: c */
    private long f81353c;

    /* renamed from: d */
    private CalendarDate f81354d;

    /* renamed from: e */
    private boolean f81355e;

    /* renamed from: f */
    private String f81356f = "";

    /* renamed from: g */
    private String f81357g = "";

    /* renamed from: h */
    private String f81358h;

    /* renamed from: i */
    private TimeZone f81359i;

    /* renamed from: j */
    private long f81360j;

    /* renamed from: k */
    private long f81361k;

    /* renamed from: l */
    private boolean f81362l;

    /* renamed from: a */
    public final long mo116356a() {
        return this.f81352b;
    }

    /* renamed from: b */
    public final long mo116365b() {
        return this.f81353c;
    }

    /* renamed from: c */
    public final CalendarDate mo116368c() {
        return this.f81354d;
    }

    /* renamed from: d */
    public final boolean mo116370d() {
        return this.f81355e;
    }

    /* renamed from: e */
    public final String mo116371e() {
        return this.f81356f;
    }

    /* renamed from: f */
    public final String mo116372f() {
        return this.f81357g;
    }

    /* renamed from: g */
    public final String mo116373g() {
        return this.f81358h;
    }

    /* renamed from: h */
    public final TimeZone mo116374h() {
        return this.f81359i;
    }

    /* renamed from: j */
    public final CalendarDate mo116376j() {
        CalendarDate calendarDate = CalendarDate.getCalendarDate(this.f81352b * ((long) 1000), this.f81359i);
        Intrinsics.checkExpressionValueIsNotNull(calendarDate, "CalendarDate.getCalendar… * 1000, currentTimeZone)");
        return calendarDate;
    }

    /* renamed from: k */
    public final boolean mo116377k() {
        if (this.f81360j == this.f81352b && this.f81361k == this.f81353c && this.f81362l == this.f81355e) {
            return false;
        }
        return true;
    }

    public EditTimePart() {
        TimeZone timeZone = TimeZone.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(timeZone, "TimeZone.getDefault()");
        String id = timeZone.getID();
        Intrinsics.checkExpressionValueIsNotNull(id, "TimeZone.getDefault().id");
        this.f81358h = id;
        TimeZone timeZone2 = TimeZone.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(timeZone2, "TimeZone.getDefault()");
        this.f81359i = timeZone2;
    }

    /* renamed from: l */
    private final CalendarDate m121261l() {
        CalendarDate calendarDate = new CalendarDate();
        CalendarDate.roundSecond(calendarDate);
        CalendarDate calendarDate2 = this.f81354d;
        if (calendarDate2 != null) {
            calendarDate.setYear(calendarDate2.getYear());
            calendarDate.setMonth(calendarDate2.getMonth());
            calendarDate.setMonthDay(calendarDate2.getMonthDay());
        }
        if (calendarDate.getMinute() < 30) {
            calendarDate.setMinute(30);
        } else {
            calendarDate.setMinute(0);
            calendarDate.setHour(calendarDate.getHour() + 1);
        }
        return calendarDate;
    }

    /* renamed from: i */
    public final void mo116375i() {
        long j = this.f81352b;
        if (j == 0) {
            long timeInSeconds = m121261l().getTimeInSeconds();
            this.f81352b = timeInSeconds;
            this.f81353c = timeInSeconds + ((long) (this.f81351a * 60));
        } else if (this.f81353c == 0) {
            this.f81353c = j + ((long) (this.f81351a * 60));
        }
        long j2 = this.f81352b;
        long j3 = (long) 60;
        this.f81352b = j2 - (j2 % j3);
        long j4 = this.f81353c;
        this.f81353c = j4 - (j4 % j3);
        TimeZone timeZone = TimeZone.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(timeZone, "TimeZone.getDefault()");
        String id = timeZone.getID();
        Intrinsics.checkExpressionValueIsNotNull(id, "TimeZone.getDefault().id");
        this.f81356f = id;
        TimeZone timeZone2 = TimeZone.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(timeZone2, "TimeZone.getDefault()");
        String id2 = timeZone2.getID();
        Intrinsics.checkExpressionValueIsNotNull(id2, "TimeZone.getDefault().id");
        this.f81357g = id2;
    }

    /* renamed from: a */
    public final void mo116357a(int i) {
        this.f81351a = i;
    }

    /* renamed from: b */
    public final void mo116366b(long j) {
        this.f81353c = j;
    }

    /* renamed from: c */
    public final void mo116369c(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f81358h = str;
    }

    /* renamed from: a */
    public final void mo116358a(long j) {
        this.f81352b = j;
    }

    /* renamed from: b */
    public final void mo116367b(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f81357g = str;
    }

    /* renamed from: a */
    public final void mo116359a(CalendarDate calendarDate) {
        this.f81354d = calendarDate;
    }

    /* renamed from: a */
    public final void mo116361a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.f81356f = str;
    }

    /* renamed from: a */
    public final void mo116360a(CalendarEventInstance calendarEventInstance) {
        Intrinsics.checkParameterIsNotNull(calendarEventInstance, "instance");
        if (calendarEventInstance.isAllDay()) {
            TimeZone timeZone = TimeZone.getDefault();
            long j = (long) 1000;
            this.f81352b = calendarEventInstance.getStartTime() - ((long) (timeZone.getOffset(calendarEventInstance.getStartTime() * j) / 1000));
            this.f81353c = (calendarEventInstance.getEndTime() - ((long) (timeZone.getOffset(calendarEventInstance.getEndTime() * j) / 1000))) - 1;
        } else {
            this.f81352b = calendarEventInstance.getStartTime();
            this.f81353c = calendarEventInstance.getEndTime();
        }
        boolean isAllDay = calendarEventInstance.isAllDay();
        this.f81355e = isAllDay;
        this.f81360j = this.f81352b;
        this.f81361k = this.f81353c;
        this.f81362l = isAllDay;
    }

    /* renamed from: a */
    public final void mo116363a(TimeZone timeZone) {
        Intrinsics.checkParameterIsNotNull(timeZone, "<set-?>");
        this.f81359i = timeZone;
    }

    /* renamed from: a */
    public final void mo116364a(boolean z) {
        this.f81355e = z;
    }

    /* renamed from: a */
    public final void mo116362a(String str, String str2, boolean z) {
        boolean z2;
        TimeZone timeZone = TimeZone.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(timeZone, "TimeZone.getDefault()");
        String id = timeZone.getID();
        if (this.f81355e) {
            Intrinsics.checkExpressionValueIsNotNull(id, "defaultTimeZoneId");
            this.f81356f = id;
            this.f81357g = id;
        } else {
            String str3 = str;
            boolean z3 = false;
            if (str3 == null || str3.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                Intrinsics.checkExpressionValueIsNotNull(id, "defaultTimeZoneId");
                str = id;
            }
            this.f81356f = str;
            String str4 = str2;
            if (str4 == null || str4.length() == 0) {
                z3 = true;
            }
            if (z3) {
                Intrinsics.checkExpressionValueIsNotNull(id, "defaultTimeZoneId");
                str2 = id;
            }
            this.f81357g = str2;
        }
        if (z) {
            String str5 = this.f81356f;
            this.f81358h = str5;
            TimeZone timeZone2 = TimeZone.getTimeZone(str5);
            Intrinsics.checkExpressionValueIsNotNull(timeZone2, "TimeZone.getTimeZone(currentTimeZoneId)");
            this.f81359i = timeZone2;
        }
    }
}
