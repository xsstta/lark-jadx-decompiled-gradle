package com.ss.android.lark.calendar.impl.features.local;

import android.content.ContentValues;
import android.database.Cursor;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventReminder;

/* renamed from: com.ss.android.lark.calendar.impl.features.local.g */
public class C31933g {

    /* renamed from: a */
    public static final String[] f81575a = {"event_id", "minutes", "method", "_id"};

    /* renamed from: a */
    private static CalendarEventReminder.Method m121503a(int i) {
        if (i == 0) {
            return CalendarEventReminder.Method.DEFAULT;
        }
        if (i == 1) {
            return CalendarEventReminder.Method.POPUP;
        }
        if (i == 2) {
            return CalendarEventReminder.Method.EMAIL;
        }
        if (i == 3) {
            return CalendarEventReminder.Method.SMS;
        }
        if (i != 4) {
            return CalendarEventReminder.Method.DEFAULT;
        }
        return CalendarEventReminder.Method.POPUP;
    }

    /* renamed from: b */
    private static int m121505b(CalendarEventReminder calendarEventReminder) {
        CalendarEventReminder.Method method = calendarEventReminder.getMethod();
        if (method == CalendarEventReminder.Method.DEFAULT) {
            return 0;
        }
        if (method == CalendarEventReminder.Method.EMAIL) {
            return 2;
        }
        if (method == CalendarEventReminder.Method.POPUP) {
            return 1;
        }
        if (method == CalendarEventReminder.Method.SMS) {
            return 3;
        }
        return 0;
    }

    /* renamed from: a */
    public static ContentValues m121502a(CalendarEventReminder calendarEventReminder) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_id", Long.valueOf(Long.parseLong(calendarEventReminder.getCalendarEventId())));
        contentValues.put("minutes", Integer.valueOf(calendarEventReminder.getMinutes()));
        contentValues.put("method", Integer.valueOf(m121505b(calendarEventReminder)));
        return contentValues;
    }

    /* renamed from: a */
    public static CalendarEventReminder m121504a(Cursor cursor) {
        CalendarEventReminder calendarEventReminder = new CalendarEventReminder();
        calendarEventReminder.setCalendarEventId(String.valueOf(cursor.getLong(0)));
        calendarEventReminder.setMinutes(cursor.getInt(1));
        calendarEventReminder.setMethod(m121503a(cursor.getInt(2)));
        return calendarEventReminder;
    }
}
