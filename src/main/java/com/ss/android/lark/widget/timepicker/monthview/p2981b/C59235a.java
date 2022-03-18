package com.ss.android.lark.widget.timepicker.monthview.p2981b;

import com.larksuite.framework.utils.C26279i;
import com.ss.android.lark.widget.timepicker.monthview.data.CalendarDate;

/* renamed from: com.ss.android.lark.widget.timepicker.monthview.b.a */
public class C59235a {
    /* renamed from: a */
    public static CalendarDate m230062a(CalendarDate calendarDate) {
        int a = m230061a(calendarDate.getYear(), calendarDate.getMonth());
        CalendarDate calendarDate2 = new CalendarDate(calendarDate);
        calendarDate2.setMonthDay(1);
        return calendarDate2.addDay(-a).moveToDayStart();
    }

    /* renamed from: b */
    public static CalendarDate m230064b(CalendarDate calendarDate) {
        CalendarDate calendarDate2 = new CalendarDate(calendarDate);
        calendarDate2.setMonthDay(1);
        CalendarDate moveToDayEnd = calendarDate2.addDay(C26279i.m95146a(calendarDate2.getYear(), calendarDate2.getMonth()) - 1).moveToDayEnd();
        CalendarDate addMonth = new CalendarDate(calendarDate2).addMonth(1);
        int a = m230061a(addMonth.getYear(), addMonth.getMonth());
        if (a > 0) {
            return moveToDayEnd.addDay(7 - a);
        }
        return moveToDayEnd;
    }

    /* renamed from: a */
    public static int m230061a(int i, int i2) {
        CalendarDate calendarDate = new CalendarDate();
        calendarDate.setYear(i);
        calendarDate.setMonth(i2);
        calendarDate.setMonthDay(1);
        return calendarDate.getWeeklyDayIndex();
    }

    /* renamed from: a */
    public static boolean m230063a(CalendarDate calendarDate, CalendarDate calendarDate2) {
        if (calendarDate.getYear() == calendarDate2.getYear() && calendarDate.getMonth() == calendarDate2.getMonth()) {
            return true;
        }
        return false;
    }
}
