package com.ss.android.lark.calendar.impl.rustadapter.doentity;

import java.io.Serializable;

public class CalendarEventReminder implements Serializable, Comparable<CalendarEventReminder> {
    private String mCalendarEventId;
    private Method mMethod;
    private int mMinutes;

    public enum Method {
        DEFAULT(1),
        EMAIL(2),
        POPUP(3),
        SMS(4);
        
        private int value;

        public int getNumber() {
            return this.value;
        }

        public static Method valueOf(int i) {
            return forNumber(i);
        }

        public static Method forNumber(int i) {
            if (i == 1) {
                return DEFAULT;
            }
            if (i == 2) {
                return EMAIL;
            }
            if (i == 3) {
                return POPUP;
            }
            if (i != 4) {
                return null;
            }
            return SMS;
        }

        private Method(int i) {
            this.value = i;
        }
    }

    public CalendarEventReminder() {
    }

    public String getCalendarEventId() {
        return this.mCalendarEventId;
    }

    public Method getMethod() {
        return this.mMethod;
    }

    public int getMinutes() {
        return this.mMinutes;
    }

    public void setCalendarEventId(String str) {
        this.mCalendarEventId = str;
    }

    public void setMethod(Method method) {
        this.mMethod = method;
    }

    public void setMinutes(int i) {
        this.mMinutes = i;
    }

    public CalendarEventReminder(CalendarEventReminder calendarEventReminder) {
        this.mCalendarEventId = calendarEventReminder.mCalendarEventId;
        this.mMinutes = calendarEventReminder.mMinutes;
        this.mMethod = calendarEventReminder.mMethod;
    }

    public int compareTo(CalendarEventReminder calendarEventReminder) {
        int i = this.mMinutes;
        int i2 = calendarEventReminder.mMinutes;
        if (i < i2) {
            return -1;
        }
        if (i == i2) {
            return 0;
        }
        return 1;
    }
}
