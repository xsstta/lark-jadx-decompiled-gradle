package com.larksuite.component.universe_design.util;

import android.content.Context;
import com.larksuite.component.universe_design.util.CalendarDate;
import com.larksuite.suite.R;
import com.ss.ttm.player.MediaPlayer;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\nJ\u001e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0007J \u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0018\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\u0007J\u000e\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0016J\u0010\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0007J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u0016H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/larksuite/component/universe_design/util/DateTimeUtils;", "", "()V", "monthDaysArray", "", "generateStrByTzAndFormat", "", "date", "Ljava/util/Date;", "timeZone", "Ljava/util/TimeZone;", "format", "getCalendarOfTimeZone", "Ljava/util/Calendar;", "calendar", "getFirstDayWeekPosition", "", "year", "month", "dayOfWeek", "Lcom/larksuite/component/universe_design/util/CalendarDate$DayOfWeek;", "getFollowingStartDate", "Lcom/larksuite/component/universe_design/util/CalendarDate;", "selectDate", "getMonthDateString", "context", "Landroid/content/Context;", "getMonthDays", "getMonthText", "getPreviousStartDate", "isSameYearAndMonth", "", "lhs", "rhs", "universe-ui-datepicker_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.larksuite.component.universe_design.util.a */
public final class DateTimeUtils {

    /* renamed from: a */
    public static final DateTimeUtils f63877a = new DateTimeUtils();

    /* renamed from: b */
    private static final int[] f63878b = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    private DateTimeUtils() {
    }

    @JvmStatic
    /* renamed from: b */
    public static final CalendarDate m93293b(CalendarDate calendarDate) {
        Intrinsics.checkParameterIsNotNull(calendarDate, "selectDate");
        CalendarDate modifyMonth = calendarDate.modifyMonth(-1);
        Intrinsics.checkExpressionValueIsNotNull(modifyMonth, "selectDate.modifyMonth(-1)");
        modifyMonth.setMonthDay(1);
        CalendarDate moveToDayStart = modifyMonth.moveToDayStart();
        Intrinsics.checkExpressionValueIsNotNull(moveToDayStart, "calendarDate.moveToDayStart()");
        return moveToDayStart;
    }

    @JvmStatic
    /* renamed from: c */
    public static final CalendarDate m93294c(CalendarDate calendarDate) {
        Intrinsics.checkParameterIsNotNull(calendarDate, "selectDate");
        CalendarDate modifyMonth = calendarDate.modifyMonth(1);
        Intrinsics.checkExpressionValueIsNotNull(modifyMonth, "selectDate.modifyMonth(1)");
        modifyMonth.setMonthDay(1);
        CalendarDate moveToDayStart = modifyMonth.moveToDayStart();
        Intrinsics.checkExpressionValueIsNotNull(moveToDayStart, "calendarDate.moveToDayStart()");
        return moveToDayStart;
    }

    /* renamed from: a */
    public final String mo91834a(CalendarDate calendarDate) {
        Intrinsics.checkParameterIsNotNull(calendarDate, "date");
        StringBuilder sb = new StringBuilder();
        sb.append(calendarDate.getYear());
        sb.append('.');
        sb.append(calendarDate.getMonth());
        return sb.toString();
    }

    @JvmStatic
    /* renamed from: a */
    public static final int m93290a(int i, int i2) {
        if (i2 > 12) {
            i++;
            i2 = 1;
        } else if (i2 < 1) {
            i--;
            i2 = 12;
        }
        int[] iArr = f63878b;
        if ((i % 4 != 0 || i % 100 == 0) && i % MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL != 0) {
            iArr[1] = 28;
        } else {
            iArr[1] = 29;
        }
        try {
            return iArr[i2 - 1];
        } catch (Exception e) {
            e.getStackTrace();
            return 0;
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final boolean m93292a(CalendarDate calendarDate, CalendarDate calendarDate2) {
        Intrinsics.checkParameterIsNotNull(calendarDate, "lhs");
        Intrinsics.checkParameterIsNotNull(calendarDate2, "rhs");
        if (calendarDate.getYear() == calendarDate2.getYear() && calendarDate.getMonth() == calendarDate2.getMonth()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final Calendar mo91836a(Calendar calendar, TimeZone timeZone) {
        Intrinsics.checkParameterIsNotNull(calendar, "calendar");
        Intrinsics.checkParameterIsNotNull(timeZone, "timeZone");
        Calendar calendar2 = new CalendarDate(new CalendarDate(calendar), timeZone).getCalendar();
        Intrinsics.checkExpressionValueIsNotNull(calendar2, "forkCalendar.calendar");
        return calendar2;
    }

    /* renamed from: a */
    public final int mo91833a(int i, int i2, CalendarDate.DayOfWeek dayOfWeek) {
        Intrinsics.checkParameterIsNotNull(dayOfWeek, "dayOfWeek");
        CalendarDate calendarDate = new CalendarDate();
        calendarDate.setYear(i);
        calendarDate.setMonth(i2);
        calendarDate.setMonthDay(1);
        return calendarDate.getWeeklyDayIndex(dayOfWeek);
    }

    @JvmStatic
    /* renamed from: a */
    public static final String m93291a(Context context, Date date, TimeZone timeZone) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(date, "date");
        Intrinsics.checkParameterIsNotNull(timeZone, "timeZone");
        String string = context.getResources().getString(R.string.Calendar_StandardTime_MonthDayCombineFormat);
        Intrinsics.checkExpressionValueIsNotNull(string, "context.resources.getStr…me_MonthDayCombineFormat)");
        return f63877a.mo91835a(date, timeZone, string);
    }

    /* renamed from: a */
    public final String mo91835a(Date date, TimeZone timeZone, String str) {
        Intrinsics.checkParameterIsNotNull(date, "date");
        Intrinsics.checkParameterIsNotNull(timeZone, "timeZone");
        Intrinsics.checkParameterIsNotNull(str, "format");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.getDefault());
        simpleDateFormat.setTimeZone(timeZone);
        String format = simpleDateFormat.format(date);
        if (format != null) {
            return format;
        }
        return "";
    }
}
