package com.ss.android.lark.calendar.impl.features.local;

import android.content.ContentUris;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.CalendarContract;
import android.util.SparseArray;
import com.ss.android.eventbus.EventBus;
import com.ss.android.lark.calendar.impl.features.calendarview.CalendarDate;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.EventChipViewData;
import com.ss.android.lark.calendar.impl.framework.C32484a;
import com.ss.android.lark.calendar.impl.framework.p1568a.C32493l;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarLocation;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.MappingColor;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32533b;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;

/* renamed from: com.ss.android.lark.calendar.impl.features.local.f */
public class C31931f {

    /* renamed from: a */
    public static final String[] f81572a = {"event_id", "calendar_id", "begin", "end", "startDay", "endDay", "startMinute", "endMinute", "displayColor", "title", "allDay", "eventStatus", "selfAttendeeStatus", "eventLocation", "_id", "calendar_access_level", "calendar_color", "eventTimezone", "eventEndTimezone", "isOrganizer", "guestsCanModify"};

    /* renamed from: b */
    private static boolean f81573b;

    /* renamed from: c */
    private static ContentObserver f81574c = new ContentObserver(new Handler(Looper.getMainLooper())) {
        /* class com.ss.android.lark.calendar.impl.features.local.C31931f.C319321 */

        public boolean deliverSelfNotifications() {
            return super.deliverSelfNotifications();
        }

        public void onChange(boolean z) {
            super.onChange(z);
            EventBus.getDefault().trigger(new C32493l());
        }
    };

    /* renamed from: a */
    private static void m121497a() {
        if (!f81573b) {
            try {
                new C32484a().mo118635a().getContentResolver().registerContentObserver(CalendarContract.Instances.CONTENT_URI, true, f81574c);
                f81573b = true;
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    private static CalendarEvent.Status m121494a(int i) {
        if (i == 0) {
            return CalendarEvent.Status.TENTATIVE;
        }
        if (i == 1) {
            return CalendarEvent.Status.CONFIRMED;
        }
        if (i != 2) {
            return CalendarEvent.Status.TENTATIVE;
        }
        return CalendarEvent.Status.CANCELED;
    }

    /* renamed from: b */
    private static CalendarEventAttendee.Status m121499b(int i) {
        if (i == 0) {
            return CalendarEventAttendee.Status.NEEDS_ACTION;
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

    /* renamed from: c */
    private static Calendar.AccessRole m121500c(int i) {
        if (i == 0) {
            return Calendar.AccessRole.UNKNOWN_ACCESS_ROLE;
        }
        if (i == 100) {
            return Calendar.AccessRole.FREE_BUSY_READER;
        }
        if (i == 200 || i == 300) {
            return Calendar.AccessRole.READER;
        }
        if (i == 400 || i == 500 || i == 600) {
            return Calendar.AccessRole.WRITER;
        }
        if (i == 700 || i == 800) {
            return Calendar.AccessRole.OWNER;
        }
        return Calendar.AccessRole.UNKNOWN_ACCESS_ROLE;
    }

    /* renamed from: d */
    private static CalendarEvent.DisplayType m121501d(int i) {
        if (i == 200 || i == 300 || i == 400 || i == 500 || i == 600 || i == 700 || i == 800) {
            return CalendarEvent.DisplayType.FULL;
        }
        return CalendarEvent.DisplayType.LIMITED;
    }

    /* renamed from: a */
    private static void m121498a(CalendarEventInstance calendarEventInstance, TimeZone timeZone) {
        if (timeZone != null && C30022a.f74883b.mo112695c() && !calendarEventInstance.isAllDay()) {
            CalendarDate calendarDate = new CalendarDate(new Date(calendarEventInstance.getStartTime() * 1000), timeZone);
            CalendarDate calendarDate2 = new CalendarDate(new Date(calendarEventInstance.getEndTime() * 1000), timeZone);
            calendarEventInstance.setStartTimezone(timeZone.getID());
            calendarEventInstance.setEndTimezone(timeZone.getID());
            calendarEventInstance.setStartDay(calendarDate.getJulianDay());
            calendarEventInstance.setEndDay(calendarDate2.getJulianDay());
            calendarEventInstance.setStartMinute(calendarDate.getDayMinutes());
            calendarEventInstance.setEndMinute(calendarDate2.getDayMinutes());
        }
    }

    /* renamed from: a */
    private static CalendarEventInstance m121495a(Cursor cursor, TimeZone timeZone) {
        boolean z;
        boolean z2;
        if (cursor == null) {
            return null;
        }
        CalendarEventInstance calendarEventInstance = new CalendarEventInstance();
        calendarEventInstance.setSource(CalendarEvent.Source.ANDROID);
        calendarEventInstance.setEventType(CalendarEvent.Type.DEFAULT_TYPE);
        calendarEventInstance.setId("phone_" + cursor.getLong(14));
        boolean z3 = false;
        calendarEventInstance.setEventId(cursor.getString(0));
        calendarEventInstance.setEventServerId(cursor.getString(0));
        boolean z4 = true;
        calendarEventInstance.setCalendarId(String.valueOf(cursor.getInt(1)));
        calendarEventInstance.setOrganizerId("");
        calendarEventInstance.setStartTime(cursor.getLong(2) / 1000);
        calendarEventInstance.setEndTime(cursor.getLong(3) / 1000);
        calendarEventInstance.setStartTimezone(cursor.getString(17));
        calendarEventInstance.setEndTimezone(cursor.getString(18));
        calendarEventInstance.setStartDay(cursor.getInt(4));
        calendarEventInstance.setEndDay(cursor.getInt(5));
        calendarEventInstance.setStartMinute(cursor.getInt(6));
        calendarEventInstance.setEndMinute(cursor.getInt(7));
        calendarEventInstance.setKey(cursor.getString(0));
        calendarEventInstance.setOriginalTime(cursor.getLong(2));
        calendarEventInstance.setColor(cursor.getInt(8));
        calendarEventInstance.setCalBackgroundColor(cursor.getInt(16));
        calendarEventInstance.setCalForegroundColor(cursor.getInt(16));
        calendarEventInstance.setSummary(cursor.getString(9));
        if (cursor.getInt(10) != 0) {
            z = true;
        } else {
            z = false;
        }
        calendarEventInstance.setIsAllDay(z);
        calendarEventInstance.setStatus(m121494a(cursor.getInt(11)));
        calendarEventInstance.setDisplayType(m121501d(cursor.getInt(15)));
        calendarEventInstance.setSelfAttendeeStatus(m121499b(cursor.getInt(12)));
        calendarEventInstance.setIsFree(false);
        CalendarLocation calendarLocation = new CalendarLocation();
        calendarLocation.setLocation(cursor.getString(13));
        calendarEventInstance.setCalendarLocation(calendarLocation);
        boolean equals = "1".equals(cursor.getString(19));
        if (cursor.getInt(20) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Calendar.AccessRole c = m121500c(cursor.getInt(15));
        calendarEventInstance.setCalAccessRole(c);
        if (!(c == Calendar.AccessRole.OWNER || c == Calendar.AccessRole.WRITER)) {
            z4 = false;
        }
        if (equals) {
            z3 = z4;
        } else if (z4) {
            z3 = z2;
        }
        calendarEventInstance.setIsEditable(z3);
        m121498a(calendarEventInstance, timeZone);
        return calendarEventInstance;
    }

    /* renamed from: a */
    public static ArrayList<EventChipViewData> m121496a(long j, long j2, TimeZone timeZone) {
        ArrayList<EventChipViewData> arrayList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        sb.append("calendar_id");
        sb.append(" IN (");
        ArrayList arrayList2 = new ArrayList();
        boolean z = true;
        for (List<Calendar> list : C31927d.m121459a().mo116553d()) {
            for (Calendar calendar : list) {
                if (calendar.isVisible()) {
                    if (!z) {
                        sb.append(", ");
                    }
                    sb.append("?");
                    arrayList2.add(calendar.getId());
                    z = false;
                }
            }
        }
        sb.append(")");
        String sb2 = sb.toString();
        String[] strArr = new String[arrayList2.size()];
        arrayList2.toArray(strArr);
        Log.m165389i("LocalInstanceConverter", C32673y.m125378d("visible calendar size: " + arrayList2.size()));
        if (z) {
            return arrayList;
        }
        m121497a();
        ArrayList arrayList3 = new ArrayList();
        try {
            Uri.Builder buildUpon = CalendarContract.Instances.CONTENT_URI.buildUpon();
            ContentUris.appendId(buildUpon, j);
            ContentUris.appendId(buildUpon, j2);
            Cursor query = new C32484a().mo118635a().getContentResolver().query(buildUpon.build(), f81572a, sb2, strArr, null);
            while (query.moveToNext()) {
                CalendarEventInstance a = m121495a(query, timeZone);
                if (a != null) {
                    arrayList.add(new EventChipViewData(a));
                    arrayList3.add(Integer.valueOf(a.getCalBackgroundColor()));
                    arrayList3.add(Integer.valueOf(a.getColor()));
                }
            }
            query.close();
        } catch (Exception e) {
            Log.m165383e("LocalInstanceConverter", e.getMessage());
        }
        Log.m165389i("LocalInstanceConverter", C32673y.m125378d("get local instance size: " + arrayList.size()));
        SparseArray<MappingColor> b = C32533b.m124620a().mo118875b(arrayList3);
        Iterator<EventChipViewData> it = arrayList.iterator();
        while (it.hasNext()) {
            CalendarEventInstance calendarEventInstance = it.next().getCalendarEventInstance();
            calendarEventInstance.setCalColor(b.get(calendarEventInstance.getCalBackgroundColor(), new MappingColor(-1, -1, -1, "6")));
            calendarEventInstance.setEventColor(b.get(calendarEventInstance.getColor(), new MappingColor(-1, -1, -1, "6")));
        }
        return arrayList;
    }
}
