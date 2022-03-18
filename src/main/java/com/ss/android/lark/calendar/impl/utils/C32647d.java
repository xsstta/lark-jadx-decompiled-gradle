package com.ss.android.lark.calendar.impl.utils;

import com.larksuite.framework.utils.C26279i;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSetting;

/* renamed from: com.ss.android.lark.calendar.impl.utils.d */
public class C32647d {
    /* renamed from: e */
    public static CalendarDate m125285e(CalendarDate calendarDate) {
        return m125274a(calendarDate);
    }

    /* renamed from: a */
    public static CalendarDate m125274a(CalendarDate calendarDate) {
        return calendarDate.addDay(6 - calendarDate.getWeeklyDayIndex());
    }

    /* renamed from: d */
    public static CalendarDate m125283d(CalendarDate calendarDate) {
        return m125274a(calendarDate).addDay(-6);
    }

    /* renamed from: b */
    public static CalendarDate m125279b(CalendarDate calendarDate) {
        int a = m125272a(calendarDate.getYear(), calendarDate.getMonth());
        CalendarDate calendarDate2 = new CalendarDate(calendarDate);
        calendarDate2.setMonthDay(1);
        return calendarDate2.addDay(-a).moveToDayStart();
    }

    /* renamed from: c */
    public static CalendarDate m125281c(CalendarDate calendarDate) {
        CalendarDate calendarDate2 = new CalendarDate(calendarDate);
        calendarDate2.setMonthDay(1);
        CalendarDate moveToDayEnd = calendarDate2.addDay(C26279i.m95146a(calendarDate2.getYear(), calendarDate2.getMonth()) - 1).moveToDayEnd();
        CalendarDate addMonth = new CalendarDate(calendarDate2).addMonth(1);
        int a = m125272a(addMonth.getYear(), addMonth.getMonth());
        if (a > 0) {
            return moveToDayEnd.addDay(7 - a);
        }
        return moveToDayEnd;
    }

    /* renamed from: e */
    public static CalendarDate m125286e(CalendarDate calendarDate, CalendarSetting.DayOfWeek dayOfWeek) {
        return m125277a(calendarDate, dayOfWeek);
    }

    /* renamed from: a */
    public static int m125272a(int i, int i2) {
        CalendarDate calendarDate = new CalendarDate();
        calendarDate.setYear(i);
        calendarDate.setMonth(i2);
        calendarDate.setMonthDay(1);
        return calendarDate.getWeeklyDayIndex();
    }

    /* renamed from: d */
    public static CalendarDate m125284d(CalendarDate calendarDate, CalendarSetting.DayOfWeek dayOfWeek) {
        return m125277a(calendarDate, dayOfWeek).addDay(-6);
    }

    /* renamed from: b */
    public static CalendarDate m125280b(CalendarDate calendarDate, CalendarSetting.DayOfWeek dayOfWeek) {
        int a = m125273a(calendarDate.getYear(), calendarDate.getMonth(), dayOfWeek);
        CalendarDate calendarDate2 = new CalendarDate(calendarDate);
        calendarDate2.setMonthDay(1);
        return calendarDate2.addDay(-a).moveToDayStart();
    }

    /* renamed from: a */
    public static CalendarDate m125275a(CalendarDate calendarDate, int i) {
        CalendarDate modifyMonth = calendarDate.modifyMonth(i);
        modifyMonth.setMonthDay(1);
        return m125279b(modifyMonth);
    }

    /* renamed from: c */
    public static CalendarDate m125282c(CalendarDate calendarDate, CalendarSetting.DayOfWeek dayOfWeek) {
        CalendarDate calendarDate2 = new CalendarDate(calendarDate);
        calendarDate2.setMonthDay(1);
        CalendarDate moveToDayEnd = calendarDate2.addDay(C26279i.m95146a(calendarDate2.getYear(), calendarDate2.getMonth()) - 1).moveToDayEnd();
        CalendarDate addMonth = new CalendarDate(calendarDate2).addMonth(1);
        int a = m125273a(addMonth.getYear(), addMonth.getMonth(), dayOfWeek);
        if (a > 0) {
            return moveToDayEnd.addDay(7 - a);
        }
        return moveToDayEnd;
    }

    /* renamed from: a */
    public static CalendarDate m125277a(CalendarDate calendarDate, CalendarSetting.DayOfWeek dayOfWeek) {
        return calendarDate.addDay(6 - calendarDate.getWeeklyDayIndex(dayOfWeek));
    }

    /* renamed from: a */
    public static boolean m125278a(CalendarDate calendarDate, CalendarDate calendarDate2) {
        if (calendarDate.getYear() == calendarDate2.getYear() && calendarDate.getMonth() == calendarDate2.getMonth()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static int m125273a(int i, int i2, CalendarSetting.DayOfWeek dayOfWeek) {
        CalendarDate calendarDate = new CalendarDate();
        calendarDate.setYear(i);
        calendarDate.setMonth(i2);
        calendarDate.setMonthDay(1);
        return calendarDate.getWeeklyDayIndex(dayOfWeek);
    }

    /* renamed from: a */
    public static CalendarDate m125276a(CalendarDate calendarDate, CalendarDate calendarDate2, int i) {
        CalendarDate modifyMonth = calendarDate.modifyMonth(i);
        modifyMonth.setMonthDay(1);
        return calendarDate2.addDay(((((m125272a(modifyMonth.getYear(), modifyMonth.getMonth()) + C26279i.m95146a(modifyMonth.getYear(), modifyMonth.getMonth())) / 7) + 1) * 7) - 1);
    }
}
