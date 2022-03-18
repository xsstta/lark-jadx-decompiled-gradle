package com.ss.android.lark.calendar.impl.rustadapter.doentity;

import java.io.Serializable;

public class CalendarMeetingEvent implements Serializable, Cloneable {
    private CalendarEvent calendarEvent;
    private Meeting meeting;

    public CalendarEvent getCalendarEvent() {
        return this.calendarEvent;
    }

    public Meeting getMeeting() {
        return this.meeting;
    }

    public void setCalendarEvent(CalendarEvent calendarEvent2) {
        this.calendarEvent = calendarEvent2;
    }

    public void setMeeting(Meeting meeting2) {
        this.meeting = meeting2;
    }
}
