package com.ss.android.lark.calendar.impl.features.events.edit.helper;

import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.events.edit.fragment.entity.DailySecondTime;
import com.ss.android.lark.calendar.impl.utils.C32646c;
import com.ss.android.lark.calendar.p1430a.C30022a;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001eB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bJ0\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012J(\u0010\u0013\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bJ2\u0010\u0014\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0010H\u0002J*\u0010\u0019\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000eH\u0002¨\u0006\u001f"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/helper/DailyUsableTimeHelper;", "", "()V", "getDailyUsableTime", "", "Lcom/ss/android/lark/calendar/impl/features/events/edit/helper/DailyUsableTimeHelper$TimeRange;", "currentDate", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "mtTimeZoneId", "", "mtUsableDailyTime", "Lcom/ss/android/lark/calendar/impl/features/events/edit/fragment/entity/DailySecondTime;", "getDailyUsableTimeSpecialText", "standardTime", "", "standardTimezone", "Ljava/util/TimeZone;", "isShowRule", "", "getDailyUsableTimeString", "getDateInternalRange", "mtDate", "currentStartMilliSeconds", "currentEndMilliSeconds", "mtTimeZone", "getInternalRange", "startA", "endA", "startB", "endB", "TimeRange", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.a.b */
public final class DailyUsableTimeHelper {

    /* renamed from: a */
    public static final DailyUsableTimeHelper f79927a = new DailyUsableTimeHelper();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u001a\u0010\u0004\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/events/edit/helper/DailyUsableTimeHelper$TimeRange;", "", "startTimeInMilliSeconds", "", "endTimeInMilliSeconds", "(JJ)V", "getEndTimeInMilliSeconds", "()J", "setEndTimeInMilliSeconds", "(J)V", "getStartTimeInMilliSeconds", "setStartTimeInMilliSeconds", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
    /* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.a.b$a */
    public static final class TimeRange {

        /* renamed from: a */
        private long f79928a;

        /* renamed from: b */
        private long f79929b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TimeRange)) {
                return false;
            }
            TimeRange aVar = (TimeRange) obj;
            return this.f79928a == aVar.f79928a && this.f79929b == aVar.f79929b;
        }

        public int hashCode() {
            long j = this.f79928a;
            long j2 = this.f79929b;
            return (((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)));
        }

        public String toString() {
            return "TimeRange(startTimeInMilliSeconds=" + this.f79928a + ", endTimeInMilliSeconds=" + this.f79929b + ")";
        }

        /* renamed from: a */
        public final long mo114601a() {
            return this.f79928a;
        }

        /* renamed from: b */
        public final long mo114602b() {
            return this.f79929b;
        }

        public TimeRange(long j, long j2) {
            this.f79928a = j;
            this.f79929b = j2;
        }
    }

    private DailyUsableTimeHelper() {
    }

    /* renamed from: a */
    public final List<TimeRange> mo114600a(CalendarDate calendarDate, String str, DailySecondTime aVar) {
        boolean z;
        TimeZone timeZone;
        TimeRange a;
        Intrinsics.checkParameterIsNotNull(calendarDate, "currentDate");
        Intrinsics.checkParameterIsNotNull(aVar, "mtUsableDailyTime");
        CalendarDate moveToSameDayStart = calendarDate.moveToSameDayStart();
        Intrinsics.checkExpressionValueIsNotNull(moveToSameDayStart, "currentDate.moveToSameDayStart()");
        long timeInMilliSeconds = moveToSameDayStart.getTimeInMilliSeconds();
        CalendarDate moveToSameDayEnd = calendarDate.moveToSameDayEnd();
        Intrinsics.checkExpressionValueIsNotNull(moveToSameDayEnd, "currentDate.moveToSameDayEnd()");
        long timeInMilliSeconds2 = moveToSameDayEnd.getTimeInMilliSeconds();
        ArrayList arrayList = new ArrayList();
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            timeZone = TimeZone.getDefault();
        } else {
            timeZone = TimeZone.getTimeZone(str);
        }
        CalendarDate calendarDate2 = new CalendarDate(new Date(timeInMilliSeconds), timeZone);
        CalendarDate calendarDate3 = new CalendarDate(new Date(timeInMilliSeconds2), timeZone);
        boolean sameDay = calendarDate2.sameDay(calendarDate3);
        TimeRange aVar2 = null;
        Intrinsics.checkExpressionValueIsNotNull(timeZone, "mtTimeZone");
        TimeRange a2 = m118838a(calendarDate2, aVar, timeInMilliSeconds, timeInMilliSeconds2, timeZone);
        if (a2 != null) {
            arrayList.add(a2);
            aVar2 = a2;
        }
        if (!sameDay && (a = m118838a(calendarDate3, aVar, timeInMilliSeconds, timeInMilliSeconds2, timeZone)) != null) {
            if (aVar2 == null || aVar2.mo114602b() != a.mo114601a()) {
                arrayList.add(a);
            } else {
                arrayList.clear();
                if (aVar2 != null) {
                    arrayList.add(new TimeRange(aVar2.mo114601a(), a.mo114602b()));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private final TimeRange m118837a(long j, long j2, long j3, long j4) {
        long max = Math.max(j, j3);
        long min = Math.min(j2, j4);
        if (max < min) {
            return new TimeRange(max, min);
        }
        return null;
    }

    /* renamed from: a */
    public final String mo114598a(long j, TimeZone timeZone, String str, DailySecondTime aVar) {
        Intrinsics.checkParameterIsNotNull(timeZone, "standardTimezone");
        Intrinsics.checkParameterIsNotNull(aVar, "mtUsableDailyTime");
        StringBuilder sb = new StringBuilder("");
        List<TimeRange> a = mo114600a(new CalendarDate(new Date(j * ((long) 1000)), timeZone), str, aVar);
        int size = a.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            String a2 = C32646c.m125255a(a.get(i).mo114601a(), timeZone, false);
            String a3 = C32646c.m125255a(a.get(i).mo114602b(), timeZone, false);
            sb.append(a2);
            sb.append("-");
            sb.append(a3);
        }
        String sb2 = sb.toString();
        Intrinsics.checkExpressionValueIsNotNull(sb2, "result.toString()");
        return sb2;
    }

    /* renamed from: a */
    private final TimeRange m118838a(CalendarDate calendarDate, DailySecondTime aVar, long j, long j2, TimeZone timeZone) {
        CalendarDate calendarDate2 = new CalendarDate(calendarDate, timeZone);
        calendarDate2.setDayMinutes(aVar.mo115294a() / 60);
        long timeInMilliSeconds = calendarDate2.getTimeInMilliSeconds();
        CalendarDate calendarDate3 = new CalendarDate(calendarDate, timeZone);
        calendarDate3.setDayMinutes(aVar.mo115295b() / 60);
        return m118837a(j, j2, timeInMilliSeconds, calendarDate3.getTimeInMilliSeconds());
    }

    /* renamed from: a */
    public final String mo114599a(long j, TimeZone timeZone, String str, DailySecondTime aVar, boolean z) {
        int i;
        Intrinsics.checkParameterIsNotNull(timeZone, "standardTimezone");
        Intrinsics.checkParameterIsNotNull(aVar, "mtUsableDailyTime");
        String a = mo114598a(j, timeZone, str, aVar);
        if (z) {
            i = R.string.Calendar_MeetingView_MeetingRoomReserveAvailablePeriod;
        } else {
            i = R.string.Calendar_Edit_MeetingRoomReserveAvailablePeriod;
        }
        String a2 = C30022a.f74882a.utilsDependency().mo108195a(i, "AvailableTimePeriod", a);
        Intrinsics.checkExpressionValueIsNotNull(a2, "CalendarDependencyHolder…lableTimePeriod\", result)");
        return a2;
    }
}
