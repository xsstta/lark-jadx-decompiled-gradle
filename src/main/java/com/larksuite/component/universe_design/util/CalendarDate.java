package com.larksuite.component.universe_design.util;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class CalendarDate {
    private Calendar mGregorianCalendar;

    public enum DayOfWeek {
        SUNDAY(0),
        MONDAY(1),
        TUESDAY(2),
        WEDNESDAY(3),
        THURSDAY(4),
        FRIDAY(5),
        SATURDAY(6);
        
        private final int value;

        public int getValue() {
            return this.value;
        }

        public static DayOfWeek valueOf(int i) {
            return forNumber(i);
        }

        public static DayOfWeek forNumber(int i) {
            switch (i) {
                case 0:
                    return SUNDAY;
                case 1:
                    return MONDAY;
                case 2:
                    return TUESDAY;
                case 3:
                    return WEDNESDAY;
                case 4:
                    return THURSDAY;
                case 5:
                    return FRIDAY;
                case 6:
                    return SATURDAY;
                default:
                    return SUNDAY;
            }
        }

        private DayOfWeek(int i) {
            this.value = i;
        }
    }

    public Calendar getCalendar() {
        return this.mGregorianCalendar;
    }

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

    public TimeZone getTimeZone() {
        return this.mGregorianCalendar.getTimeZone();
    }

    public int getWeekDay() {
        return this.mGregorianCalendar.get(7);
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

    public int getAMPM() {
        return this.mGregorianCalendar.get(9);
    }

    public int getDayMinutes() {
        return (getHour() * 60) + getMinute();
    }

    public int getHour() {
        return this.mGregorianCalendar.get(11);
    }

    public int getHourForTwelve() {
        return this.mGregorianCalendar.get(10);
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

    public CalendarDate moveThisDateToDayEnd() {
        setHour(23);
        setMinute(59);
        setSecond(59);
        return this;
    }

    public CalendarDate moveThisDateToDayStart() {
        setHour(0);
        setMinute(0);
        setSecond(0);
        return this;
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

    /* access modifiers changed from: package-private */
    /* renamed from: com.larksuite.component.universe_design.util.CalendarDate$1 */
    public static /* synthetic */ class C258161 {

        /* renamed from: a */
        static final /* synthetic */ int[] f63876a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.larksuite.component.universe_design.util.CalendarDate$DayOfWeek[] r0 = com.larksuite.component.universe_design.util.CalendarDate.DayOfWeek.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.larksuite.component.universe_design.util.CalendarDate.C258161.f63876a = r0
                com.larksuite.component.universe_design.util.CalendarDate$DayOfWeek r1 = com.larksuite.component.universe_design.util.CalendarDate.DayOfWeek.MONDAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.larksuite.component.universe_design.util.CalendarDate.C258161.f63876a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.larksuite.component.universe_design.util.CalendarDate$DayOfWeek r1 = com.larksuite.component.universe_design.util.CalendarDate.DayOfWeek.SATURDAY     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.larksuite.component.universe_design.util.CalendarDate.C258161.<clinit>():void");
        }
    }

    public CalendarDate moveToDayEnd() {
        CalendarDate calendarDate = new CalendarDate(this);
        calendarDate.setHour(23);
        calendarDate.setMinute(59);
        calendarDate.setSecond(59);
        return calendarDate;
    }

    public CalendarDate moveToSameDayEnd() {
        CalendarDate calendarDate = new CalendarDate(this, this.mGregorianCalendar.getTimeZone());
        calendarDate.setHour(23);
        calendarDate.setMinute(59);
        calendarDate.setSecond(59);
        return calendarDate;
    }

    public CalendarDate moveToSameDayStart() {
        CalendarDate calendarDate = new CalendarDate(this, this.mGregorianCalendar.getTimeZone());
        calendarDate.setHour(0);
        calendarDate.setMinute(0);
        calendarDate.setSecond(0);
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

    public CalendarDate(Calendar calendar) {
        this.mGregorianCalendar = calendar;
    }

    public void setHour(int i) {
        this.mGregorianCalendar.set(11, i);
    }

    public void setMinute(int i) {
        this.mGregorianCalendar.set(12, i);
    }

    public void setMonthDay(int i) {
        this.mGregorianCalendar.set(5, i);
    }

    public void setSecond(int i) {
        this.mGregorianCalendar.set(13, i);
    }

    public CalendarDate setTimeInMillis(long j) {
        this.mGregorianCalendar.setTimeInMillis(j);
        return this;
    }

    public void setYear(int i) {
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

    public CalendarDate addMinute(int i) {
        CalendarDate calendarDate = new CalendarDate(this);
        calendarDate.add(12, i);
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

    public CalendarDate getFirstDayOfTheWeek(DayOfWeek dayOfWeek) {
        return addDay(-getWeeklyDayIndex(dayOfWeek));
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

    public void setMonth(int i) {
        this.mGregorianCalendar.set(2, i - 1);
    }

    public CalendarDate setTimeInSeconds(long j) {
        this.mGregorianCalendar.setTimeInMillis(j * 1000);
        return this;
    }

    public void setTimeZone(TimeZone timeZone) {
        if (timeZone != null) {
            this.mGregorianCalendar.setTimeZone(timeZone);
        }
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

    public int getWeeklyDayIndex(DayOfWeek dayOfWeek) {
        int i = C258161.f63876a[dayOfWeek.ordinal()];
        if (i == 1) {
            return ((getWeekDay() - 1) + 6) % 7;
        }
        if (i != 2) {
            return getWeekDay() - 1;
        }
        return ((getWeekDay() - 1) + 1) % 7;
    }

    public int getYearWeek(DayOfWeek dayOfWeek) {
        int i = C258161.f63876a[dayOfWeek.ordinal()];
        if (i == 1) {
            this.mGregorianCalendar.setFirstDayOfWeek(2);
        } else if (i != 2) {
            this.mGregorianCalendar.setFirstDayOfWeek(1);
        } else {
            this.mGregorianCalendar.setFirstDayOfWeek(7);
        }
        return this.mGregorianCalendar.get(3);
    }

    public boolean sameDayWithZeroPoint(CalendarDate calendarDate) {
        if (calendarDate.getTimeInSeconds() == calendarDate.moveToSameDayStart().getTimeInSeconds()) {
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

    public CalendarDate modifyDay(int i) {
        int a = DateTimeUtils.m93290a(getYear(), getMonth() - 1);
        if (i > DateTimeUtils.m93290a(getYear(), getMonth())) {
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

    public CalendarDate(Date date) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        this.mGregorianCalendar = gregorianCalendar;
        gregorianCalendar.setTime(date);
    }

    public CalendarDate(TimeZone timeZone) {
        this.mGregorianCalendar = new GregorianCalendar(timeZone);
    }

    public void add(int i, int i2) {
        this.mGregorianCalendar.add(i, i2);
    }

    public static CalendarDate getCalendarDate(long j, TimeZone timeZone) {
        return new CalendarDate(new Date(j), timeZone);
    }

    public CalendarDate(CalendarDate calendarDate, TimeZone timeZone) {
        if (this != calendarDate) {
            this.mGregorianCalendar = new GregorianCalendar(timeZone);
            setYear(calendarDate.getYear());
            setMonth(calendarDate.getMonth());
            setMonthDay(calendarDate.getMonthDay());
            setHour(calendarDate.getHour());
            setMinute(calendarDate.getMinute());
            setSecond(calendarDate.getSecond());
        }
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
