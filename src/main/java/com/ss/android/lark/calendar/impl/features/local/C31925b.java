package com.ss.android.lark.calendar.impl.features.local;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;

/* renamed from: com.ss.android.lark.calendar.impl.features.local.b */
public class C31925b {

    /* renamed from: a */
    public static final String[] f81559a = {"_id", "event_id", "attendeeName", "attendeeEmail", "attendeeStatus", "attendeeRelationship", "attendeeType", "attendeeIdentity", "attendeeIdNamespace"};

    /* renamed from: a */
    private static int m121454a(CalendarEventAttendee.Status status) {
        if (status == CalendarEventAttendee.Status.NEEDS_ACTION) {
            return 3;
        }
        if (status == CalendarEventAttendee.Status.ACCEPT) {
            return 1;
        }
        if (status == CalendarEventAttendee.Status.TENTATIVE) {
            return 4;
        }
        if (status == CalendarEventAttendee.Status.DECLINE) {
            return 2;
        }
        CalendarEventAttendee.Status status2 = CalendarEventAttendee.Status.REMOVED;
        return 0;
    }

    /* renamed from: a */
    public static CalendarEventAttendee.Status m121456a(int i) {
        if (i == 0) {
            return CalendarEventAttendee.Status.REMOVED;
        }
        if (i == 1) {
            return CalendarEventAttendee.Status.ACCEPT;
        }
        if (i == 2) {
            return CalendarEventAttendee.Status.DECLINE;
        }
        if (i == 3) {
            return CalendarEventAttendee.Status.NEEDS_ACTION;
        }
        if (i != 4) {
            return CalendarEventAttendee.Status.NEEDS_ACTION;
        }
        return CalendarEventAttendee.Status.TENTATIVE;
    }

    /* renamed from: a */
    public static ContentValues m121455a(CalendarEventAttendee calendarEventAttendee) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("attendeeName", calendarEventAttendee.getLocalizedDisplayName());
        contentValues.put("attendeeEmail", calendarEventAttendee.getLocalAttendeeContact());
        contentValues.put("attendeeStatus", Integer.valueOf(m121454a(calendarEventAttendee.getStatus())));
        if (calendarEventAttendee.isOrganizer()) {
            contentValues.put("attendeeRelationship", (Integer) 2);
        }
        contentValues.put("attendeeIdentity", calendarEventAttendee.getLocalAttendeeType() + ":" + calendarEventAttendee.getLocalAttendeeId());
        return contentValues;
    }

    /* renamed from: a */
    public static CalendarEventAttendee m121457a(Cursor cursor) {
        boolean z;
        String str;
        boolean z2;
        boolean z3;
        CalendarEventAttendee calendarEventAttendee = new CalendarEventAttendee();
        calendarEventAttendee.setId(String.valueOf(cursor.getLong(0)));
        if (cursor.getInt(6) == 2) {
            z = true;
        } else {
            z = false;
        }
        calendarEventAttendee.setIsOptional(z);
        String string = cursor.getString(3);
        calendarEventAttendee.setLocalAttendeeContact(string);
        String string2 = cursor.getString(2);
        if (TextUtils.isEmpty(string2)) {
            str = string;
        } else {
            str = string2;
        }
        calendarEventAttendee.setDisplayName(str);
        if (TextUtils.isEmpty(string2)) {
            string2 = string;
        }
        calendarEventAttendee.setLocalizedDisplayName(string2);
        if (TextUtils.isEmpty(string) || !string.contains("resource")) {
            z2 = false;
        } else {
            z2 = true;
        }
        calendarEventAttendee.setIsResource(z2);
        calendarEventAttendee.setStatus(m121456a(cursor.getInt(4)));
        if (cursor.getInt(5) == 2) {
            z3 = true;
        } else {
            z3 = false;
        }
        calendarEventAttendee.setIsOrganizer(z3);
        calendarEventAttendee.setAttendeeCalendarId(calendarEventAttendee.getLocalizedDisplayName());
        String string3 = cursor.getString(7);
        if (!TextUtils.isEmpty(string3)) {
            String[] split = string3.split(":");
            if (split.length == 2) {
                calendarEventAttendee.setLocalAttendeeType(Integer.parseInt(split[0]));
                calendarEventAttendee.setLocalAttendeeId(Long.parseLong(split[1]));
            }
        }
        calendarEventAttendee.setIsEditable(false);
        return calendarEventAttendee;
    }
}
