package com.ss.android.lark.calendar.impl.utils;

import android.content.Context;
import com.larksuite.framework.utils.C26279i;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.time.format.Options;
import com.ss.android.lark.time.format.TimeFormatUtils;
import com.ss.android.lark.time.format.entity.DatePreciseness;
import com.ss.android.lark.time.format.entity.DisplayPattern;
import com.ss.android.lark.time.format.entity.LengthType;
import java.util.Date;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\f\u0010\u0004\u001a\u00020\u0001*\u00020\u0003H\u0002\u001a\u0012\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0012\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n\u001a\u0012\u0010\u000b\u001a\u00020\u0007*\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0003\u001a\n\u0010\f\u001a\u00020\n*\u00020\b\u001a\u0012\u0010\r\u001a\u00020\n*\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0003\u001a\n\u0010\u000e\u001a\u00020\u0001*\u00020\b\u001a\n\u0010\u000f\u001a\u00020\b*\u00020\u0001\u001a\n\u0010\u0010\u001a\u00020\b*\u00020\b\u001a\u0012\u0010\u0011\u001a\u00020\b*\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0012\u0010\u0012\u001a\u00020\u0001*\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0012\u0010\u0013\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0012\u0010\u0014\u001a\u00020\u0001*\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0015"}, d2 = {"dayToWeek", "", "firstDayOfWeek", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/CalendarSetting$DayOfWeek;", "dayToWeekOffset", "dayWeekOffset", "getListYearMonthString", "", "Lcom/ss/android/lark/calendar/impl/features/calendarview/CalendarDate;", "showYear", "", "getWeekRangeString", "isMonthStartDay", "isWeekStartDay", "month", "monthStartDate", "moveThisToNextMonthStart", "moveThisToNextWeekStart", "weekCountInMonth", "weekFirstDay", "weekIndexInMonth", "calendar-impl_release"}, mo238835k = 2, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.utils.b */
public final class C32645b {
    /* renamed from: a */
    private static final int m125231a(CalendarSetting.DayOfWeek dayOfWeek) {
        return CalendarSetting.DayOfWeek.MONDAY.getNumber() - dayOfWeek.getNumber();
    }

    /* renamed from: a */
    public static final CalendarDate m125232a(int i) {
        CalendarDate calendarDate = new CalendarDate();
        calendarDate.setYear(i / 12);
        calendarDate.setMonth((i % 12) + 1);
        calendarDate.setMonthDay(1);
        return calendarDate;
    }

    /* renamed from: b */
    public static final CalendarDate m125237b(CalendarDate calendarDate) {
        Intrinsics.checkParameterIsNotNull(calendarDate, "$this$moveThisToNextMonthStart");
        calendarDate.setMonthDay(1);
        calendarDate.add(2, 1);
        CalendarDate moveThisDateToDayStart = calendarDate.moveThisDateToDayStart();
        Intrinsics.checkExpressionValueIsNotNull(moveThisDateToDayStart, "moveThisDateToDayStart()");
        return moveThisDateToDayStart;
    }

    /* renamed from: c */
    public static final int m125240c(CalendarDate calendarDate) {
        Intrinsics.checkParameterIsNotNull(calendarDate, "$this$month");
        return ((calendarDate.getYear() * 12) + calendarDate.getMonth()) - 1;
    }

    /* renamed from: a */
    public static final boolean m125235a(CalendarDate calendarDate) {
        Intrinsics.checkParameterIsNotNull(calendarDate, "$this$isMonthStartDay");
        if (calendarDate.getMonthDay() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final int m125230a(int i, CalendarSetting.DayOfWeek dayOfWeek) {
        Intrinsics.checkParameterIsNotNull(dayOfWeek, "firstDayOfWeek");
        return Math.max((i + m125231a(dayOfWeek)) / 7, 0);
    }

    /* renamed from: b */
    public static final int m125236b(int i, CalendarSetting.DayOfWeek dayOfWeek) {
        Intrinsics.checkParameterIsNotNull(dayOfWeek, "firstDayOfWeek");
        return Math.max((i * 7) - m125231a(dayOfWeek), 0);
    }

    /* renamed from: c */
    public static final int m125239c(int i, CalendarSetting.DayOfWeek dayOfWeek) {
        Intrinsics.checkParameterIsNotNull(dayOfWeek, "firstDayOfWeek");
        return Math.max(i - m125236b(m125230a(i, dayOfWeek), dayOfWeek), 0);
    }

    /* renamed from: e */
    public static final int m125243e(CalendarDate calendarDate, CalendarSetting.DayOfWeek dayOfWeek) {
        Intrinsics.checkParameterIsNotNull(calendarDate, "$this$weekIndexInMonth");
        Intrinsics.checkParameterIsNotNull(dayOfWeek, "firstDayOfWeek");
        return ((calendarDate.getMonthDay() - 1) + C32647d.m125273a(calendarDate.getYear(), calendarDate.getMonth(), dayOfWeek)) / 7;
    }

    /* renamed from: d */
    public static final int m125242d(CalendarDate calendarDate, CalendarSetting.DayOfWeek dayOfWeek) {
        Intrinsics.checkParameterIsNotNull(calendarDate, "$this$weekCountInMonth");
        Intrinsics.checkParameterIsNotNull(dayOfWeek, "firstDayOfWeek");
        return (int) ((float) Math.ceil((double) (((float) (C26279i.m95146a(calendarDate.getYear(), calendarDate.getMonth()) + C32647d.m125273a(calendarDate.getYear(), calendarDate.getMonth(), dayOfWeek))) / 7.0f)));
    }

    /* renamed from: a */
    public static final String m125234a(CalendarDate calendarDate, boolean z) {
        LengthType lengthType;
        Intrinsics.checkParameterIsNotNull(calendarDate, "$this$getListYearMonthString");
        TimeZone timeZone = calendarDate.getTimeZone();
        Intrinsics.checkExpressionValueIsNotNull(timeZone, "timeZone");
        String id = timeZone.getID();
        Intrinsics.checkExpressionValueIsNotNull(id, "timeZone.id");
        DisplayPattern displayPattern = DisplayPattern.ABSOLUTE;
        if (z) {
            lengthType = LengthType.LONG;
        } else {
            lengthType = LengthType.SHORT;
        }
        Options aVar = new Options(id, displayPattern, lengthType, DatePreciseness.MONTH, null, false, false, false, false, 496, null);
        Context a = C32634ae.m125179a();
        Intrinsics.checkExpressionValueIsNotNull(a, "ResUtil.getAppContext()");
        return TimeFormatUtils.m219289e(a, new Date(calendarDate.getTimeInMilliSeconds()), aVar);
    }

    /* renamed from: b */
    public static final boolean m125238b(CalendarDate calendarDate, CalendarSetting.DayOfWeek dayOfWeek) {
        Intrinsics.checkParameterIsNotNull(calendarDate, "$this$isWeekStartDay");
        Intrinsics.checkParameterIsNotNull(dayOfWeek, "firstDayOfWeek");
        if (calendarDate.getWeeklyDayIndex(dayOfWeek) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final CalendarDate m125241c(CalendarDate calendarDate, CalendarSetting.DayOfWeek dayOfWeek) {
        Intrinsics.checkParameterIsNotNull(calendarDate, "$this$moveThisToNextWeekStart");
        Intrinsics.checkParameterIsNotNull(dayOfWeek, "firstDayOfWeek");
        calendarDate.add(6, 7 - calendarDate.getWeeklyDayIndex(dayOfWeek));
        CalendarDate moveThisDateToDayStart = calendarDate.moveThisDateToDayStart();
        Intrinsics.checkExpressionValueIsNotNull(moveThisDateToDayStart, "moveThisDateToDayStart()");
        return moveThisDateToDayStart;
    }

    /* renamed from: a */
    public static final String m125233a(CalendarDate calendarDate, CalendarSetting.DayOfWeek dayOfWeek) {
        Intrinsics.checkParameterIsNotNull(calendarDate, "$this$getWeekRangeString");
        Intrinsics.checkParameterIsNotNull(dayOfWeek, "firstDayOfWeek");
        int yearWeek = calendarDate.getYearWeek(dayOfWeek);
        CalendarDate addDay = calendarDate.addDay(6);
        TimeZone timeZone = calendarDate.getTimeZone();
        Intrinsics.checkExpressionValueIsNotNull(timeZone, "timeZone");
        String id = timeZone.getID();
        Intrinsics.checkExpressionValueIsNotNull(id, "timeZone.id");
        Options aVar = new Options(id, DisplayPattern.ABSOLUTE, LengthType.SHORT, null, null, false, false, false, false, 504, null);
        Context a = C32634ae.m125179a();
        Intrinsics.checkExpressionValueIsNotNull(a, "ResUtil.getAppContext()");
        Date date = new Date(calendarDate.getTimeInMilliSeconds());
        Intrinsics.checkExpressionValueIsNotNull(addDay, "weekEndDate");
        String a2 = C30022a.f74882a.utilsDependency().mo108196a(R.string.Calendar_StandardTime_WeekDateRangeCombineFormat, MapsKt.mapOf(TuplesKt.to("number", String.valueOf(yearWeek)), TuplesKt.to("dateRange", TimeFormatUtils.m219284b(a, date, new Date(addDay.getTimeInMilliSeconds()), aVar))));
        Intrinsics.checkExpressionValueIsNotNull(a2, "CalendarDependencyHolder…CombineFormat, formatMap)");
        return a2;
    }
}
