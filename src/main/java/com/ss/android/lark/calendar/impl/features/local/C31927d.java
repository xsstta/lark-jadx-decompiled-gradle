package com.ss.android.lark.calendar.impl.features.local;

import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.OperationApplicationException;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import android.provider.CalendarContract;
import android.text.TextUtils;
import android.text.format.Time;
import android.util.SparseArray;
import androidx.core.content.PermissionChecker;
import com.larksuite.framework.thread.CoreThreadPool;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.calendar.impl.features.calendarview.entity.EventChipViewData;
import com.ss.android.lark.calendar.impl.features.events.detail.utils.AttendeeUtil;
import com.ss.android.lark.calendar.impl.features.local.utils.C31938b;
import com.ss.android.lark.calendar.impl.features.local.utils.C31940c;
import com.ss.android.lark.calendar.impl.features.local.utils.DateException;
import com.ss.android.lark.calendar.impl.framework.C32484a;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventReminder;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarSkinColorTool;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.MappingColor;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.SkinColor;
import com.ss.android.lark.calendar.impl.rustadapter.p1575c.C32533b;
import com.ss.android.lark.calendar.impl.utils.C32673y;
import com.ss.android.lark.calendar.impl.utils.EventRecurrence;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.log.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;

/* renamed from: com.ss.android.lark.calendar.impl.features.local.d */
public class C31927d {

    /* renamed from: a */
    private static Uri f81561a = CalendarContract.Attendees.CONTENT_URI;

    /* renamed from: b */
    private static Uri f81562b = CalendarContract.Calendars.CONTENT_URI;

    /* renamed from: c */
    private static Uri f81563c = CalendarContract.Reminders.CONTENT_URI;

    /* renamed from: d */
    private static Uri f81564d = CalendarContract.Events.CONTENT_URI;

    /* renamed from: e */
    private Context f81565e;

    /* access modifiers changed from: private */
    /* renamed from: com.ss.android.lark.calendar.impl.features.local.d$a */
    public static class C31929a {

        /* renamed from: a */
        public static final C31927d f81570a = new C31927d();
    }

    /* renamed from: a */
    public static C31927d m121459a() {
        return C31929a.f81570a;
    }

    /* renamed from: a */
    public boolean mo116546a(CalendarEvent calendarEvent, CalendarEventInstance calendarEventInstance, CalendarEvent.Span span) {
        int i;
        ContentProviderResult[] a;
        if (!(calendarEvent == null || calendarEventInstance == null)) {
            ArrayList<ContentProviderOperation> arrayList = new ArrayList<>();
            ContentValues contentValues = new ContentValues();
            if (span == CalendarEvent.Span.NONE_SPAN) {
                m121463a(arrayList, calendarEvent);
                mo116544a(arrayList, calendarEvent.getId());
                m121467b(arrayList, calendarEvent.getId());
            } else if (span == CalendarEvent.Span.THIS_EVENT) {
                contentValues.put("calendar_id", calendarEvent.getCalendarId());
                contentValues.put("title", calendarEvent.getSummary());
                contentValues.put("eventTimezone", calendarEvent.getStartTimeZone());
                contentValues.put("allDay", Integer.valueOf(calendarEvent.isAllDay() ? 1 : 0));
                contentValues.put("dtstart", Long.valueOf(calendarEventInstance.getStartTime() * 1000));
                contentValues.put("dtend", Long.valueOf(calendarEventInstance.getEndTime() * 1000));
                contentValues.put("original_id", calendarEvent.getId());
                if (TextUtils.isEmpty(calendarEvent.getKey())) {
                    String g = m121472g();
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("_sync_id", g);
                    m121464a(arrayList, calendarEvent, contentValues2, true);
                }
                contentValues.put("originalInstanceTime", Long.valueOf(calendarEventInstance.getStartTime() * 1000));
                contentValues.put("originalAllDay", Integer.valueOf(calendarEvent.isAllDay() ? 1 : 0));
                contentValues.put("eventStatus", (Integer) 2);
                i = arrayList.size();
                mo116543a(arrayList, contentValues);
                a = m121466a(arrayList);
                if (a.length > 0 || (i != -1 && i > a.length)) {
                    return false;
                }
                return true;
            } else if (span == CalendarEvent.Span.ALL_EVENTS) {
                m121463a(arrayList, calendarEvent);
                mo116544a(arrayList, calendarEvent.getId());
                m121467b(arrayList, calendarEvent.getId());
            } else if (span == CalendarEvent.Span.FUTURE_EVENTS) {
                if (m121465a(calendarEvent, calendarEventInstance)) {
                    m121463a(arrayList, calendarEvent);
                    mo116544a(arrayList, calendarEvent.getId());
                    m121467b(arrayList, calendarEvent.getId());
                } else {
                    m121460a(arrayList, calendarEvent, calendarEventInstance.getStartTime() * 1000);
                }
            }
            i = -1;
            a = m121466a(arrayList);
            if (a.length > 0) {
            }
        }
        return false;
    }

    /* renamed from: a */
    public void mo116543a(ArrayList<ContentProviderOperation> arrayList, ContentValues contentValues) {
        arrayList.add(ContentProviderOperation.newInsert(f81564d).withValues(contentValues).build());
    }

    /* renamed from: a */
    public boolean mo116547a(List<ContentProviderOperation> list, int i, List<CalendarEventAttendee> list2, List<CalendarEventAttendee> list3, boolean z) {
        if (list2.equals(list3) && !z) {
            return false;
        }
        ContentProviderOperation.Builder newDelete = ContentProviderOperation.newDelete(f81561a);
        newDelete.withSelection("event_id = ?", new String[1]);
        newDelete.withSelectionBackReference(0, i);
        list.add(newDelete.build());
        int size = list2.size();
        for (int i2 = 0; i2 < size; i2++) {
            ContentProviderOperation.Builder withValues = ContentProviderOperation.newInsert(f81561a).withValues(C31925b.m121455a(list2.get(i2)));
            withValues.withValueBackReference("event_id", i);
            list.add(withValues.build());
        }
        return true;
    }

    /* renamed from: a */
    public void mo116545a(List<ContentProviderOperation> list, String str, List<CalendarEventAttendee> list2, List<CalendarEventAttendee> list3, boolean z) {
        if (!list2.equals(list3) || z) {
            mo116544a(list, str);
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                ContentValues a = C31925b.m121455a(list2.get(i));
                a.put("event_id", str);
                list.add(ContentProviderOperation.newInsert(f81561a).withValues(a).build());
            }
        }
    }

    /* renamed from: a */
    public void mo116544a(List<ContentProviderOperation> list, String str) {
        if (!TextUtils.isEmpty(str)) {
            String[] strArr = {str};
            ContentProviderOperation.Builder newDelete = ContentProviderOperation.newDelete(f81561a);
            newDelete.withSelection("event_id = ?", strArr);
            list.add(newDelete.build());
        }
    }

    private C31927d() {
        this.f81565e = new C32484a().mo118635a();
    }

    /* renamed from: f */
    private boolean m121471f() {
        if (PermissionChecker.checkSelfPermission(this.f81565e, "android.permission.READ_CALENDAR") == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    private String m121472g() {
        return UUID.randomUUID().toString().toUpperCase();
    }

    /* renamed from: b */
    public List<Calendar> mo116548b() {
        try {
            return m121470e();
        } catch (Exception unused) {
            return new ArrayList();
        }
    }

    /* renamed from: c */
    public List<List<Calendar>> mo116550c() {
        List<Calendar> b = mo116548b();
        ArrayList arrayList = new ArrayList();
        if (!(b == null || b.size() == 0)) {
            HashMap hashMap = new HashMap();
            for (int i = 0; i < b.size(); i++) {
                List list = (List) hashMap.get(b.get(i).getLocalType());
                if (list == null) {
                    list = new ArrayList();
                    hashMap.put(b.get(i).getLocalType(), list);
                }
                list.add(b.get(i));
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                arrayList.add((List) entry.getValue());
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public List<List<Calendar>> mo116553d() {
        List<List<Calendar>> c = mo116550c();
        ArrayList arrayList = new ArrayList();
        if (CollectionUtils.isNotEmpty(c)) {
            C31934h a = C31934h.m121506a();
            for (int i = 0; i < c.size(); i++) {
                if (a.mo116557a(c.get(i).get(0).getLocalName()).booleanValue()) {
                    for (int i2 = 0; i2 < c.get(i).size(); i2++) {
                        Calendar calendar = c.get(i).get(i2);
                        String a2 = a.mo116558a(calendar);
                        calendar.setServerId(a2);
                        calendar.setIsVisible(a.mo116560b(a2).booleanValue());
                    }
                    arrayList.add(c.get(i));
                }
            }
        }
        return arrayList;
    }

    /* renamed from: e */
    private List<Calendar> m121470e() throws SecurityException {
        SkinColor a;
        if (!m121471f()) {
            Log.m165389i("LocalCalendarProvider", C32673y.m125378d("no local calendar read permission"));
            return null;
        }
        Cursor query = this.f81565e.getContentResolver().query(f81562b, C31926c.f81560a, null, null, null);
        if (query == null) {
            Log.m165383e("LocalCalendarProvider", "no available calendar to use");
            return new ArrayList();
        }
        ArrayList<Calendar> arrayList = new ArrayList(query.getCount());
        ArrayList arrayList2 = new ArrayList();
        while (query.moveToNext()) {
            Calendar a2 = C31926c.m121458a(query);
            if (a2 != null) {
                arrayList.add(a2);
                arrayList2.add(Integer.valueOf(a2.getBackgroundColor()));
            }
        }
        query.close();
        Log.m165389i("LocalCalendarProvider", C32673y.m125378d("get local calendar size: " + arrayList.size()));
        SparseArray<MappingColor> b = C32533b.m124620a().mo118875b(arrayList2);
        for (Calendar calendar : arrayList) {
            MappingColor mappingColor = b.get(calendar.getBackgroundColor());
            if (!(mappingColor == null || (a = CalendarSkinColorTool.m124921a(mappingColor, C30022a.f74884c.mo108456c().getSkinType())) == null)) {
                calendar.setBackgroundColor(a.getSelectColor());
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public List<CalendarEventReminder> mo116551c(String str) {
        if (!m121471f()) {
            return null;
        }
        Cursor query = this.f81565e.getContentResolver().query(f81563c, C31933g.f81575a, "event_id=?", new String[]{str}, null);
        ArrayList arrayList = new ArrayList();
        while (query.moveToNext()) {
            arrayList.add(C31933g.m121504a(query));
        }
        query.close();
        return arrayList;
    }

    /* renamed from: d */
    public CalendarEvent mo116552d(String str) {
        Cursor query = this.f81565e.getContentResolver().query(ContentUris.withAppendedId(f81564d, Long.valueOf(str).longValue()), C31930e.f81571a, null, null, null);
        CalendarEvent calendarEvent = null;
        if (query == null) {
            return null;
        }
        if (query.moveToFirst()) {
            calendarEvent = C31930e.m121489a(query);
        }
        query.close();
        if (calendarEvent != null) {
            m121462a(calendarEvent);
        }
        return calendarEvent;
    }

    /* renamed from: a */
    private void m121462a(CalendarEvent calendarEvent) {
        if (calendarEvent.hasAlarm()) {
            calendarEvent.setReminders(mo116551c(calendarEvent.getId()));
        }
        calendarEvent.setAttendees(mo116549b(calendarEvent.getId()));
        calendarEvent.setAttendeeNum(AttendeeUtil.f79151a.mo113566a(calendarEvent).size());
        if (CollectionUtils.isNotEmpty(calendarEvent.getAttendees())) {
            for (CalendarEventAttendee calendarEventAttendee : calendarEvent.getAttendees()) {
                if (calendarEventAttendee.isOrganizer()) {
                    calendarEvent.setOrganizer(calendarEventAttendee);
                }
            }
        }
    }

    /* renamed from: b */
    public List<CalendarEventAttendee> mo116549b(String str) {
        if (!m121471f()) {
            return null;
        }
        Cursor query = this.f81565e.getContentResolver().query(f81561a, C31925b.f81559a, "event_id=?", new String[]{str}, null);
        ArrayList arrayList = new ArrayList();
        while (query.moveToNext()) {
            arrayList.add(C31925b.m121457a(query));
        }
        query.close();
        return arrayList;
    }

    /* renamed from: a */
    private ContentProviderResult[] m121466a(ArrayList<ContentProviderOperation> arrayList) {
        try {
            return this.f81565e.getContentResolver().applyBatch("com.android.calendar", arrayList);
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (OperationApplicationException e2) {
            e2.printStackTrace();
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        return null;
    }

    /* renamed from: a */
    public Calendar mo116541a(String str) {
        SkinColor a;
        Cursor query = this.f81565e.getContentResolver().query(ContentUris.withAppendedId(f81562b, Long.parseLong(str)), C31926c.f81560a, null, null, null);
        Calendar calendar = null;
        if (query == null) {
            return null;
        }
        if (query.moveToFirst()) {
            calendar = C31926c.m121458a(query);
        }
        query.close();
        if (calendar != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(Integer.valueOf(calendar.getBackgroundColor()));
            MappingColor mappingColor = C32533b.m124620a().mo118875b(arrayList).get(calendar.getBackgroundColor());
            if (!(mappingColor == null || (a = CalendarSkinColorTool.m124921a(mappingColor, C30022a.f74884c.mo108456c().getSkinType())) == null)) {
                calendar.setBackgroundColor(a.getSelectColor());
            }
        }
        return calendar;
    }

    /* renamed from: a */
    private boolean m121465a(CalendarEvent calendarEvent, CalendarEventInstance calendarEventInstance) {
        if (calendarEvent.getStartTime() == calendarEventInstance.getStartTime()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private void m121467b(List<ContentProviderOperation> list, String str) {
        if (!TextUtils.isEmpty(str)) {
            String[] strArr = {str};
            ContentProviderOperation.Builder newDelete = ContentProviderOperation.newDelete(f81563c);
            newDelete.withSelection("event_id=?", strArr);
            list.add(newDelete.build());
        }
    }

    /* renamed from: a */
    private void m121463a(ArrayList<ContentProviderOperation> arrayList, CalendarEvent calendarEvent) {
        arrayList.add(ContentProviderOperation.newDelete(ContentUris.withAppendedId(f81564d, Long.valueOf(calendarEvent.getId()).longValue())).build());
    }

    /* renamed from: a */
    private String m121460a(ArrayList<ContentProviderOperation> arrayList, CalendarEvent calendarEvent, long j) {
        boolean isAllDay = calendarEvent.isAllDay();
        String rRule = calendarEvent.getRRule();
        EventRecurrence a = EventRecurrence.m125131a(rRule);
        long startTime = calendarEvent.getStartTime() * 1000;
        Time time = new Time();
        time.timezone = calendarEvent.getStartTimeZone();
        time.set(startTime);
        ContentValues contentValues = new ContentValues();
        if (a.f83698g > 0) {
            try {
                long[] a2 = new C31938b().mo116567a(time, new C31940c(calendarEvent.getRRule(), null, null, null), startTime, j);
                if (a2.length != 0) {
                    EventRecurrence a3 = EventRecurrence.m125131a(rRule);
                    a3.f83698g -= a2.length;
                    rRule = a3.toString();
                    a.f83698g = a2.length;
                } else {
                    throw new RuntimeException("can't use this method on first instance");
                }
            } catch (DateException e) {
                throw new RuntimeException(e);
            }
        } else {
            Time time2 = new Time();
            time2.timezone = "UTC";
            time2.set(j - 1000);
            if (isAllDay) {
                time2.hour = 0;
                time2.minute = 0;
                time2.second = 0;
                time2.allDay = true;
                time2.normalize(false);
                time.hour = 0;
                time.minute = 0;
                time.second = 0;
                time.allDay = true;
                time.timezone = "UTC";
            }
            a.f83697f = time2.format2445();
        }
        contentValues.put("rrule", a.toString());
        contentValues.put("dtstart", Long.valueOf(time.normalize(true)));
        m121464a(arrayList, calendarEvent, contentValues, false);
        return rRule;
    }

    /* renamed from: a */
    public static void m121461a(final long j, final long j2, final TimeZone timeZone, final AbstractC31924a<List<EventChipViewData>> aVar) {
        CoreThreadPool.getDefault().getFixedThreadPool().submit(new Runnable() {
            /* class com.ss.android.lark.calendar.impl.features.local.C31927d.RunnableC319281 */

            public void run() {
                aVar.mo110841a(C31931f.m121496a(j, j2, timeZone));
            }
        });
    }

    /* renamed from: a */
    private void m121464a(ArrayList<ContentProviderOperation> arrayList, CalendarEvent calendarEvent, ContentValues contentValues, boolean z) {
        Uri uri = f81564d;
        if (z) {
            Calendar a = mo116541a(calendarEvent.getCalendarId());
            uri = uri.buildUpon().appendQueryParameter("caller_is_syncadapter", "true").appendQueryParameter("account_name", a.getEmail()).appendQueryParameter("account_type", a.getLocalType()).build();
        }
        arrayList.add(ContentProviderOperation.newUpdate(ContentUris.withAppendedId(uri, Long.valueOf(calendarEvent.getId()).longValue())).withValues(contentValues).build());
    }

    /* renamed from: a */
    public CalendarEvent mo116542a(CalendarEvent calendarEvent, CalendarEvent calendarEvent2, CalendarEventInstance calendarEventInstance, CalendarEvent.Span span) {
        int i;
        List<CalendarEventReminder> list;
        List<CalendarEventAttendee> list2;
        String str;
        if (span == CalendarEvent.Span.ALL_EVENTS) {
            calendarEvent.setStartTime((calendarEvent.getStartTime() - calendarEventInstance.getStartTime()) + calendarEvent2.getStartTime());
            calendarEvent.setEndTime((calendarEvent.getEndTime() - calendarEventInstance.getEndTime()) + calendarEvent2.getEndTime());
        }
        ArrayList<ContentProviderOperation> arrayList = new ArrayList<>();
        ContentValues a = C31930e.m121487a(calendarEvent, calendarEvent2);
        boolean z = true;
        if (calendarEvent2 == null) {
            a.put("calendar_id", (Integer) 1);
            i = arrayList.size();
            mo116543a(arrayList, a);
        } else {
            if (TextUtils.isEmpty(calendarEvent.getRRule()) && TextUtils.isEmpty(calendarEvent2.getRRule())) {
                m121464a(arrayList, calendarEvent2, a, false);
            } else if (TextUtils.isEmpty(calendarEvent2.getRRule())) {
                m121464a(arrayList, calendarEvent2, a, false);
            } else if (span == CalendarEvent.Span.THIS_EVENT) {
                a.remove("rrule");
                a.remove("duration");
                a.put("dtend", Long.valueOf(calendarEvent.getEndTime() * 1000));
                a.put("original_id", calendarEvent.getId());
                String key = calendarEvent2.getKey();
                if (TextUtils.isEmpty(key)) {
                    key = m121472g();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("_sync_id", key);
                    m121464a(arrayList, calendarEvent2, contentValues, true);
                }
                a.put("original_sync_id", key);
                a.put("originalInstanceTime", Long.valueOf(calendarEventInstance.getStartTime() * 1000));
                a.put("originalAllDay", Integer.valueOf(calendarEvent2.isAllDay() ? 1 : 0));
                a.put("eventStatus", Integer.valueOf(C31930e.m121486a(calendarEvent2.getStatus())));
                i = arrayList.size();
                mo116543a(arrayList, a);
            } else if (span == CalendarEvent.Span.FUTURE_EVENTS) {
                if (m121465a(calendarEvent2, calendarEventInstance)) {
                    m121464a(arrayList, calendarEvent2, a, false);
                    i = -1;
                } else {
                    String a2 = m121460a(arrayList, calendarEvent2, calendarEventInstance.getStartTime() * 1000);
                    if (calendarEvent.getRRule().equals(calendarEvent2.getRRule())) {
                        a.put("rrule", a2);
                    }
                    a.put("eventStatus", Integer.valueOf(C31930e.m121486a(calendarEvent2.getStatus())));
                    i = arrayList.size();
                    mo116543a(arrayList, a);
                }
            } else if (span == CalendarEvent.Span.ALL_EVENTS) {
                m121464a(arrayList, calendarEvent2, a, false);
            }
            i = -1;
            z = false;
        }
        List<CalendarEventReminder> reminders = calendarEvent.getReminders();
        List<CalendarEventAttendee> attendees = calendarEvent.getAttendees();
        if (calendarEvent2 != null) {
            list = calendarEvent2.getReminders();
            list2 = calendarEvent2.getAttendees();
        } else {
            list = new ArrayList<>();
            list2 = new ArrayList<>();
        }
        if (i != -1) {
            m121469b(arrayList, i, reminders, list, z);
        } else if (calendarEvent2 != null) {
            m121468b(arrayList, calendarEvent2.getId(), reminders, list, z);
        }
        if (i != -1) {
            mo116547a(arrayList, i, attendees, list2, z);
        } else {
            mo116545a(arrayList, calendarEvent2.getId(), attendees, list2, z);
        }
        ContentProviderResult[] a3 = m121466a(arrayList);
        if (a3 == null || a3.length <= 0) {
            return null;
        }
        if (i != -1 && i > a3.length) {
            return null;
        }
        if (i != -1) {
            str = a3[i].uri.getLastPathSegment();
        } else {
            str = calendarEvent2.getId();
        }
        return mo116552d(str);
    }

    /* renamed from: b */
    private void m121468b(List<ContentProviderOperation> list, String str, List<CalendarEventReminder> list2, List<CalendarEventReminder> list3, boolean z) {
        if (!list2.equals(list3) || z) {
            m121467b(list, str);
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                ContentValues a = C31933g.m121502a(list2.get(i));
                a.put("event_id", str);
                list.add(ContentProviderOperation.newInsert(f81563c).withValues(a).build());
            }
        }
    }

    /* renamed from: b */
    private boolean m121469b(List<ContentProviderOperation> list, int i, List<CalendarEventReminder> list2, List<CalendarEventReminder> list3, boolean z) {
        if (list2.equals(list3) && !z) {
            return false;
        }
        ContentProviderOperation.Builder newDelete = ContentProviderOperation.newDelete(f81563c);
        newDelete.withSelection("event_id = ?", new String[1]);
        newDelete.withSelectionBackReference(0, i);
        list.add(newDelete.build());
        int size = list2.size();
        for (int i2 = 0; i2 < size; i2++) {
            ContentProviderOperation.Builder withValues = ContentProviderOperation.newInsert(f81563c).withValues(C31933g.m121502a(list2.get(i2)));
            withValues.withValueBackReference("event_id", i);
            list.add(withValues.build());
        }
        return true;
    }
}
