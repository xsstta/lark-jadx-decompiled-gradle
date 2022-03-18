package com.ss.android.lark.calendar.impl.utils;

import android.text.TextUtils;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance;
import java.util.ArrayList;

/* renamed from: com.ss.android.lark.calendar.impl.utils.n */
public class C32661n {
    /* renamed from: a */
    public static void m125341a(CalendarEventInstance calendarEventInstance, CalendarEvent calendarEvent) {
        m125344a(calendarEventInstance, calendarEvent, true);
    }

    /* renamed from: a */
    private static void m125340a(CalendarEventInstance calendarEventInstance, Calendar calendar) {
        calendarEventInstance.setCalForegroundColor(calendar.getForegroundColor());
        calendarEventInstance.setCalBackgroundColor(calendar.getBackgroundColor());
        calendarEventInstance.setCalAccessRole(calendar.getSelfAccessRole());
    }

    /* renamed from: a */
    public static void m125342a(CalendarEventInstance calendarEventInstance, CalendarEvent calendarEvent, Calendar calendar) {
        m125343a(calendarEventInstance, calendarEvent, calendar, true);
    }

    /* renamed from: a */
    public static void m125344a(CalendarEventInstance calendarEventInstance, CalendarEvent calendarEvent, boolean z) {
        if (TextUtils.isEmpty(calendarEventInstance.getId())) {
            calendarEventInstance.setId("0");
        }
        calendarEventInstance.setEventId(calendarEvent.getId());
        calendarEventInstance.setCalendarId(calendarEvent.getCalendarId());
        calendarEventInstance.setOrganizerId(calendarEvent.getOrganizerCalendarId());
        if (z) {
            calendarEventInstance.setStartTime(calendarEvent.getStartTime());
            calendarEventInstance.setEndTime(calendarEvent.getEndTime());
        }
        CalendarDate calendarDate = CalendarDate.getCalendarDate(calendarEventInstance.getStartTime() * 1000);
        CalendarDate calendarDate2 = CalendarDate.getCalendarDate(calendarEventInstance.getEndTime() * 1000);
        calendarEventInstance.setStartDay(calendarDate.getJulianDay());
        calendarEventInstance.setEndDay(calendarDate2.getJulianDay());
        calendarEventInstance.setStartMinute(calendarDate.getMinute());
        calendarEventInstance.setEndMinute(calendarDate2.getMinute());
        calendarEventInstance.setStartTimezone(calendarEvent.getStartTimeZone());
        calendarEventInstance.setEndTimezone(calendarEvent.getEndTimeZone());
        calendarEventInstance.setKey(calendarEvent.getKey());
        calendarEventInstance.setOriginalTime(calendarEvent.getOriginalTime());
        calendarEventInstance.setColor(calendarEvent.getColor());
        calendarEventInstance.setSummary(calendarEvent.getSummary());
        calendarEventInstance.setIsAllDay(calendarEvent.isAllDay());
        calendarEventInstance.setStatus(calendarEvent.getStatus());
        calendarEventInstance.setCalColor(calendarEvent.getCalColor());
        calendarEventInstance.setEventColor(calendarEvent.getEventColor());
        calendarEventInstance.setSelfAttendeeStatus(calendarEvent.getSelfAttendeeStatus());
        calendarEventInstance.setIsFree(calendarEvent.isFree());
        calendarEventInstance.setEventServerId(calendarEvent.getServerId());
        calendarEventInstance.setCalendarLocation(calendarEvent.getLocation());
        calendarEventInstance.setVisibility(calendarEvent.getVisibility());
        calendarEventInstance.setCategory(calendarEvent.getCategory());
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < calendarEvent.getAttendees().size(); i++) {
            CalendarEventAttendee calendarEventAttendee = calendarEvent.getAttendees().get(i);
            if (!(!calendarEventAttendee.isResource() || calendarEventAttendee.getStatus() == CalendarEventAttendee.Status.DECLINE || calendarEventAttendee.getStatus() == CalendarEventAttendee.Status.REMOVED)) {
                arrayList.add(calendarEventAttendee.getLocalizedDisplayName());
            }
        }
        calendarEventInstance.setMeetingRooms(arrayList);
        calendarEventInstance.setDisplayType(calendarEvent.getDisplayType());
        calendarEventInstance.setSource(calendarEvent.getSource());
        calendarEventInstance.setIsEditable(calendarEvent.getIsEditable().booleanValue());
    }

    /* renamed from: a */
    public static void m125343a(CalendarEventInstance calendarEventInstance, CalendarEvent calendarEvent, Calendar calendar, boolean z) {
        m125344a(calendarEventInstance, calendarEvent, z);
        m125340a(calendarEventInstance, calendar);
    }
}
