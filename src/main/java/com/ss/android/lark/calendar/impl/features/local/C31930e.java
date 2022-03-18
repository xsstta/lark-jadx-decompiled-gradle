package com.ss.android.lark.calendar.impl.features.local;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import android.text.format.Time;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.calendar.impl.features.local.utils.C31937a;
import com.ss.android.lark.calendar.impl.features.local.utils.DateException;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarLocation;
import com.ss.android.lark.calendar.impl.utils.EventRecurrence;
import com.ss.android.lark.log.Log;
import java.util.TimeZone;

/* renamed from: com.ss.android.lark.calendar.impl.features.local.e */
public class C31930e {

    /* renamed from: a */
    public static final String[] f81571a = {"_id", "_sync_id", "calendar_id", "title", "eventLocation", "description", "eventColor", "eventStatus", "selfAttendeeStatus", "dtstart", "dtend", "eventTimezone", "duration", "allDay", "hasAlarm", "rrule", "original_id", "original_sync_id", "originalInstanceTime", "originalAllDay", "hasAttendeeData", "organizer", "eventEndTimezone", "guestsCanModify", "guestsCanInviteOthers", "guestsCanSeeGuests", "accessLevel", "availability", "isOrganizer"};

    /* renamed from: a */
    public static int m121486a(CalendarEvent.Status status) {
        if (status == CalendarEvent.Status.TENTATIVE) {
            return 0;
        }
        if (status == CalendarEvent.Status.CONFIRMED) {
            return 1;
        }
        return 2;
    }

    /* renamed from: a */
    private static CalendarEvent.Visibility m121488a(int i) {
        if (i == 1) {
            return CalendarEvent.Visibility.PRIVATE;
        }
        if (i == 0) {
            return CalendarEvent.Visibility.DEFAULT;
        }
        if (i == 2) {
            return CalendarEvent.Visibility.PRIVATE;
        }
        return CalendarEvent.Visibility.PUBLIC;
    }

    /* renamed from: a */
    public static CalendarEvent m121489a(Cursor cursor) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        CalendarEvent calendarEvent = new CalendarEvent();
        boolean z8 = false;
        calendarEvent.setId(String.valueOf(cursor.getLong(0)));
        calendarEvent.setCalendarId(String.valueOf(cursor.getLong(2)));
        calendarEvent.setColor(cursor.getInt(6));
        calendarEvent.setSummary(cursor.getString(3));
        String string = cursor.getString(4);
        if (!TextUtils.isEmpty(string)) {
            CalendarLocation calendarLocation = new CalendarLocation();
            calendarLocation.setLocation(string);
            calendarEvent.setLocation(calendarLocation);
        }
        calendarEvent.setDescription(cursor.getString(5));
        m121492a(calendarEvent, cursor.getInt(7));
        calendarEvent.setSelfAttendeeStatus(C31925b.m121456a(cursor.getInt(8)));
        m121493a(calendarEvent, cursor);
        calendarEvent.setStartTimeZone(cursor.getString(11));
        calendarEvent.setEndTimeZone(cursor.getString(22));
        if (cursor.getInt(13) == 1) {
            z = true;
        } else {
            z = false;
        }
        calendarEvent.setIsAllDay(z);
        if (cursor.getInt(14) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        calendarEvent.setHasAlarm(z2);
        calendarEvent.setRRule(cursor.getString(15));
        calendarEvent.setKey(cursor.getString(1));
        String string2 = cursor.getString(17);
        calendarEvent.setOriginalEventKey(string2);
        if (!TextUtils.isEmpty(string2)) {
            calendarEvent.setOriginalTime(cursor.getLong(18));
        }
        if (cursor.getInt(20) == 1) {
            z3 = true;
        } else {
            z3 = false;
        }
        calendarEvent.setHasAttendee(z3);
        calendarEvent.setSource(CalendarEvent.Source.ANDROID);
        if (cursor.getInt(23) == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        calendarEvent.setGuestsCanModify(z4);
        if (cursor.getInt(24) == 1) {
            z5 = true;
        } else {
            z5 = false;
        }
        calendarEvent.setGuestsCanInvite(z5);
        if (cursor.getInt(25) == 1) {
            z6 = true;
        } else {
            z6 = false;
        }
        calendarEvent.setGuestsCanSeeOtherGuests(z6);
        if (cursor.getInt(27) == 1) {
            z7 = true;
        } else {
            z7 = false;
        }
        calendarEvent.setIsFree(z7);
        calendarEvent.setVisibility(m121488a(cursor.getInt(26)));
        if (cursor.getInt(28) == 1) {
            z8 = true;
        }
        calendarEvent.setIsOrganizer(z8);
        calendarEvent.setType(CalendarEvent.Type.DEFAULT_TYPE);
        return calendarEvent;
    }

    /* renamed from: a */
    private static void m121492a(CalendarEvent calendarEvent, int i) {
        if (i == 0) {
            calendarEvent.setStatus(CalendarEvent.Status.forNumber(1));
        } else if (i == 1) {
            calendarEvent.setStatus(CalendarEvent.Status.forNumber(2));
        } else if (i == 2) {
            calendarEvent.setStatus(CalendarEvent.Status.forNumber(3));
        }
    }

    /* renamed from: a */
    private static void m121490a(ContentValues contentValues, CalendarEvent calendarEvent) {
        String str;
        long endTime = calendarEvent.getEndTime();
        long startTime = calendarEvent.getStartTime();
        boolean isAllDay = calendarEvent.isAllDay();
        if (endTime >= startTime) {
            if (isAllDay) {
                str = "P" + ((((endTime - startTime) + 86400) - 1) / 86400) + "D";
            } else {
                str = "P" + (endTime - startTime) + "S";
            }
        } else if (!TextUtils.isEmpty(null)) {
            str = null;
        } else if (isAllDay) {
            str = "P1D";
        } else {
            str = "P3600S";
        }
        contentValues.put("duration", str);
        contentValues.put("dtend", (Long) null);
    }

    /* renamed from: a */
    public static ContentValues m121487a(CalendarEvent calendarEvent, CalendarEvent calendarEvent2) {
        long j;
        long j2;
        String str;
        boolean isAllDay = calendarEvent.isAllDay();
        String rRule = calendarEvent.getRRule();
        String startTimeZone = calendarEvent.getStartTimeZone();
        if (startTimeZone == null) {
            startTimeZone = TimeZone.getDefault().getID();
        }
        Time time = new Time(startTimeZone);
        Time time2 = new Time(startTimeZone);
        time.set(calendarEvent.getStartTime() * 1000);
        time2.set(calendarEvent.getEndTime() * 1000);
        m121491a(time, time2, rRule);
        if (isAllDay) {
            str = "UTC";
            time.hour = 0;
            time.minute = 0;
            time.second = 0;
            time.timezone = str;
            j = time.normalize(true);
            time2.hour = 0;
            time2.minute = 0;
            time2.second = 0;
            time2.timezone = str;
            j2 = time2.normalize(true);
            long j3 = 86400000 + j;
            if (j2 < j3) {
                j2 = j3;
            }
        } else {
            str = TimeZone.getDefault().getID();
            j = time.toMillis(true);
            j2 = time2.toMillis(true);
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("calendar_id", Long.valueOf(calendarEvent.getCalendarId()));
        contentValues.put("title", calendarEvent.getSummary());
        if (!TextUtils.isEmpty(calendarEvent.getDescription())) {
            contentValues.put("description", calendarEvent.getDescription());
        } else {
            contentValues.put("description", (String) null);
        }
        if (calendarEvent.getLocation() == null || TextUtils.isEmpty(calendarEvent.getLocation().getLocation())) {
            contentValues.put("eventLocation", (String) null);
        } else {
            contentValues.put("eventLocation", calendarEvent.getLocation().getLocation());
        }
        contentValues.put("eventStatus", Integer.valueOf(m121486a(calendarEvent.getStatus())));
        contentValues.put("dtstart", Long.valueOf(j));
        if (!TextUtils.isEmpty(calendarEvent.getRRule())) {
            contentValues.put("rrule", calendarEvent.getRRule());
            m121490a(contentValues, calendarEvent);
        } else {
            if (!TextUtils.isEmpty(calendarEvent2.getRRule())) {
                contentValues.put("rrule", "");
            }
            contentValues.put("duration", (String) null);
            contentValues.put("dtend", Long.valueOf(j2));
        }
        contentValues.put("eventTimezone", str);
        contentValues.put("eventEndTimezone", calendarEvent.getEndTimeZone());
        contentValues.put("allDay", Integer.valueOf(calendarEvent.isAllDay() ? 1 : 0));
        contentValues.put("hasAlarm", Integer.valueOf(CollectionUtils.isNotEmpty(calendarEvent.getReminders()) ? 1 : 0));
        contentValues.put("hasAttendeeData", (Integer) 1);
        return contentValues;
    }

    /* renamed from: a */
    private static void m121493a(CalendarEvent calendarEvent, Cursor cursor) {
        long j = cursor.getLong(9);
        long j2 = j / 1000;
        String string = cursor.getString(12);
        long j3 = 0;
        if (!TextUtils.isEmpty(string)) {
            C31937a aVar = new C31937a();
            try {
                aVar.mo116565a(string);
                long a = aVar.mo116564a() + j;
                if (a >= j) {
                    j3 = a / 1000;
                } else {
                    Log.m165383e("LocalEventConverter", "Invalid duration string: " + string);
                }
            } catch (DateException e) {
                Log.m165384e("LocalEventConverter", "Error parsing duration string " + string, e);
            }
            if (j3 == -1) {
                j3 = j2;
            }
        } else if (0 <= j2) {
            j3 = cursor.getLong(10) / 1000;
        }
        calendarEvent.setStartTime(j2);
        calendarEvent.setEndTime(j3);
    }

    /* renamed from: a */
    private static void m121491a(Time time, Time time2, String str) {
        if (!TextUtils.isEmpty(str)) {
            EventRecurrence a = EventRecurrence.m125131a(str);
            if (a.f83696e == 5 && a.f83707p != null && a.f83707p.length <= a.f83709r) {
                int b = EventRecurrence.m125135b(a.f83700i);
                int i = time.weekDay;
                int i2 = Integer.MAX_VALUE;
                for (int i3 = 0; i3 < a.f83709r; i3++) {
                    int b2 = EventRecurrence.m125135b(a.f83707p[i3]);
                    if (b2 != i) {
                        if (b2 < b) {
                            b2 += 7;
                        }
                        if (b2 > i && (b2 < i2 || i2 < i)) {
                            i2 = b2;
                        }
                        if ((i2 == Integer.MAX_VALUE || i2 < i) && b2 < i2) {
                            i2 = b2;
                        }
                    } else {
                        return;
                    }
                }
                if (i2 < i) {
                    i2 += 7;
                }
                int i4 = i2 - i;
                time.monthDay += i4;
                time2.monthDay += i4;
                time.normalize(true);
                time2.normalize(true);
            }
        }
    }
}
