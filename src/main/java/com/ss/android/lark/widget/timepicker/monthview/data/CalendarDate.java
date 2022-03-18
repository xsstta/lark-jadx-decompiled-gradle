package com.ss.android.lark.widget.timepicker.monthview.data;

import com.larksuite.framework.utils.C26279i;
import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class CalendarDate implements Serializable {
    private static final long serialVersionUID = 1;
    private GregorianCalendar mGregorianCalendar;

    public Date getDate() {
        return this.mGregorianCalendar.getTime();
    }

    public int getMonthDay() {
        return this.mGregorianCalendar.get(5);
    }

    public Date getTime() {
        return this.mGregorianCalendar.getTime();
    }

    public long getTimeInMilliSeconds() {
        return this.mGregorianCalendar.getTimeInMillis();
    }

    public int getWeekDay() {
        return this.mGregorianCalendar.get(7);
    }

    public int getWeeklyDayIndex() {
        return getWeekDay() - 1;
    }

    public int getYear() {
        return this.mGregorianCalendar.get(1);
    }

    public int getYearDay() {
        return this.mGregorianCalendar.get(6);
    }

    public CalendarDate() {
        this.mGregorianCalendar = new GregorianCalendar();
    }

    public int getDayMinutes() {
        return (getHour() * 60) + getMinute();
    }

    public CalendarDate getFirstDayOfTheWeek() {
        return addDay(-getWeeklyDayIndex());
    }

    public int getHour() {
        return this.mGregorianCalendar.get(11);
    }

    public int getMinute() {
        return this.mGregorianCalendar.get(12);
    }

    public int getMonth() {
        return this.mGregorianCalendar.get(2) + 1;
    }

    public int getSecond() {
        return this.mGregorianCalendar.get(13);
    }

    public long getTimeInSeconds() {
        return this.mGregorianCalendar.getTimeInMillis() / 1000;
    }

    public int getYearWeek() {
        this.mGregorianCalendar.setFirstDayOfWeek(1);
        return this.mGregorianCalendar.get(3);
    }

    public CalendarDate moveToDayStart() {
        CalendarDate calendarDate = new CalendarDate(this);
        calendarDate.setHour(0);
        calendarDate.setMinute(0);
        calendarDate.setSecond(0);
        return calendarDate;
    }

    public void moveToNow() {
        this.mGregorianCalendar.setTimeInMillis(System.currentTimeMillis());
    }

    public CalendarDate moveToDayEnd() {
        CalendarDate calendarDate = new CalendarDate(this);
        calendarDate.setHour(23);
        calendarDate.setMinute(59);
        calendarDate.setSecond(59);
        return calendarDate;
    }

    public int getJulianDay() {
        int year = getYear();
        int month = getMonth();
        int i = (month - 14) / 12;
        return (((((((getYear() + 4800) + i) * 1461) / 4) + ((((month - 2) - (i * 12)) * 367) / 12)) - (((((year + 4900) + i) / 100) * 3) / 4)) + getMonthDay()) - 32075;
    }

    public String toString() {
        return "Year：" + getYear() + " Month:" + getMonth() + " Day:" + getMonthDay() + " Hour:" + getHour() + " Minute:" + getMinute() + " Second:" + getSecond() + " JulianDay:" + getJulianDay();
    }

    public final void setHour(int i) {
        this.mGregorianCalendar.set(11, i);
    }

    public final void setMinute(int i) {
        this.mGregorianCalendar.set(12, i);
    }

    public void setMonthDay(int i) {
        this.mGregorianCalendar.set(5, i);
    }

    public final void setSecond(int i) {
        this.mGregorianCalendar.set(13, i);
    }

    public CalendarDate setTimeInMillis(long j) {
        this.mGregorianCalendar.setTimeInMillis(j);
        return this;
    }

    public final void setYear(int i) {
        this.mGregorianCalendar.set(1, i);
    }

    public static CalendarDate getCalendarDate(long j) {
        return new CalendarDate(new Date(j));
    }

    public CalendarDate addDay(int i) {
        CalendarDate calendarDate = new CalendarDate(this);
        calendarDate.add(5, i);
        return calendarDate;
    }

    public CalendarDate addMonth(int i) {
        CalendarDate calendarDate = new CalendarDate(this);
        calendarDate.add(2, i);
        return calendarDate;
    }

    public CalendarDate addYear(int i) {
        CalendarDate calendarDate = new CalendarDate(this);
        calendarDate.add(1, i);
        return calendarDate;
    }

    public boolean before(CalendarDate calendarDate) {
        return this.mGregorianCalendar.before(calendarDate.mGregorianCalendar);
    }

    public boolean beforeDay(CalendarDate calendarDate) {
        if (getJulianDay() < calendarDate.getJulianDay()) {
            return true;
        }
        return false;
    }

    public int dayDiff(CalendarDate calendarDate) {
        return getJulianDay() - calendarDate.getJulianDay();
    }

    public CalendarDate modifyWeek(int i) {
        return new CalendarDate(this).addDay(i * 7);
    }

    public boolean sameDay(CalendarDate calendarDate) {
        if (getJulianDay() == calendarDate.getJulianDay()) {
            return true;
        }
        return false;
    }

    public void setDayMinutes(int i) {
        setHour(i / 60);
        setMinute(i % 60);
    }

    public final void setMonth(int i) {
        this.mGregorianCalendar.set(2, i - 1);
    }

    public CalendarDate setTimeInSeconds(long j) {
        this.mGregorianCalendar.setTimeInMillis(j * 1000);
        return this;
    }

    public static void roundSecond(CalendarDate calendarDate) {
        if (calendarDate.getSecond() >= 30) {
            calendarDate.setMinute(calendarDate.getMinute() + 1);
        }
        calendarDate.setSecond(0);
    }

    public int monthDiff(CalendarDate calendarDate) {
        return ((getYear() * 12) + getMonth()) - ((calendarDate.getYear() * 12) + calendarDate.getMonth());
    }

    public CalendarDate(CalendarDate calendarDate) {
        if (this != calendarDate) {
            this.mGregorianCalendar = new GregorianCalendar();
            setYear(calendarDate.getYear());
            setMonth(calendarDate.getMonth());
            setMonthDay(calendarDate.getMonthDay());
            setHour(calendarDate.getHour());
            setMinute(calendarDate.getMinute());
            setSecond(calendarDate.getSecond());
        }
    }

    public boolean sameDayWithZeroPoint(CalendarDate calendarDate) {
        if (calendarDate.getTimeInSeconds() == calendarDate.moveToDayStart().getTimeInSeconds()) {
            if (getTimeInSeconds() == calendarDate.getTimeInSeconds() || getJulianDay() == calendarDate.addDay(-1).getJulianDay()) {
                return true;
            }
            return false;
        } else if (getJulianDay() == calendarDate.getJulianDay()) {
            return true;
        } else {
            return false;
        }
    }

    public CalendarDate(Date date) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        this.mGregorianCalendar = gregorianCalendar;
        gregorianCalendar.setTime(date);
    }

    public CalendarDate modifyDay(int i) {
        int a = C26279i.m95146a(getYear(), getMonth() - 1);
        if (i > C26279i.m95146a(getYear(), getMonth())) {
            return new CalendarDate(getYear(), getMonth(), getMonthDay(), 0, 0, 0);
        }
        if (i > 0) {
            return new CalendarDate(getYear(), getMonth(), i, 0, 0, 0);
        }
        if (i > 0 - a) {
            return new CalendarDate(getYear(), getMonth(), a + i, 0, 0, 0);
        }
        return new CalendarDate(getYear(), getMonth(), getMonthDay(), 0, 0, 0);
    }

    public CalendarDate modifyMonth(int i) {
        CalendarDate calendarDate = new CalendarDate();
        int month = getMonth() + i;
        int i2 = 12;
        if (i > 0) {
            if (month > 12) {
                calendarDate.setYear(getYear() + ((month - 1) / 12));
                int i3 = month % 12;
                if (i3 != 0) {
                    i2 = i3;
                }
                calendarDate.setMonth(i2);
            } else {
                calendarDate.setYear(getYear());
                calendarDate.setMonth(month);
            }
        } else if (month == 0) {
            calendarDate.setYear(getYear() - 1);
            calendarDate.setMonth(12);
        } else if (month < 0) {
            calendarDate.setYear((getYear() + (month / 12)) - 1);
            int abs = 12 - (Math.abs(month) % 12);
            if (abs != 0) {
                i2 = abs;
            }
            calendarDate.setMonth(i2);
        } else {
            calendarDate.setYear(getYear());
            if (month == 0) {
                month = 12;
            }
            calendarDate.setMonth(month);
        }
        return calendarDate;
    }

    public CalendarDate setJulianDay(int i) {
        long j = (long) (i + 68569);
        long j2 = (j * 4) / 146097;
        long j3 = j - (((146097 * j2) + 3) / 4);
        long j4 = ((j3 + 1) * 4000) / 1461001;
        long j5 = (j3 - ((1461 * j4) / 4)) + 31;
        long j6 = (j5 * 80) / 2447;
        int i2 = (int) (j5 - ((2447 * j6) / 80));
        long j7 = j6 / 11;
        setYear((int) (((j2 - 49) * 100) + j4 + j7));
        setMonth(((int) (((j6 + 2) - (12 * j7)) - 1)) + 1);
        setMonthDay(i2);
        setHour(0);
        setMinute(0);
        setSecond(0);
        return this;
    }

    public CalendarDate(TimeZone timeZone) {
        this.mGregorianCalendar = new GregorianCalendar(timeZone);
    }

    public void add(int i, int i2) {
        this.mGregorianCalendar.add(i, i2);
    }

    public CalendarDate(Date date, TimeZone timeZone) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone);
        this.mGregorianCalendar = gregorianCalendar;
        gregorianCalendar.setTime(date);
    }

    public CalendarDate(int i, int i2, int i3, int i4, int i5, int i6) {
        this.mGregorianCalendar = new GregorianCalendar();
        setYear(i);
        setMonth(i2);
        setMonthDay(i3);
        setHour(i4);
        setMinute(i5);
        setSecond(i6);
    }
}
