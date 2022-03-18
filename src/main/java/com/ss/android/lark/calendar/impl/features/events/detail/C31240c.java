package com.ss.android.lark.calendar.impl.features.events.detail;

import android.content.Context;
import com.larksuite.framework.utils.UIUtils;
import com.larksuite.suite.R;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.utils.C32634ae;
import com.ss.android.lark.calendar.impl.utils.C32646c;
import com.ss.android.lark.calendar.impl.utils.CalendarWorkHourUtil;
import com.ss.android.lark.calendar.p1430a.C30022a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TimeZone;

/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.c */
public class C31240c {
    /* renamed from: a */
    public static List<CalendarEventAttendee> m116936a(List<CalendarEventAttendee> list) {
        ArrayList arrayList = new ArrayList();
        if (list == null) {
            return arrayList;
        }
        for (CalendarEventAttendee calendarEventAttendee : list) {
            if (calendarEventAttendee.isResource() && calendarEventAttendee.getStatus() != CalendarEventAttendee.Status.REMOVED) {
                arrayList.add(calendarEventAttendee);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static String m116935a(Context context, int i) {
        String str;
        if (i <= 0) {
            return C30022a.f74882a.utilsDependency().mo108195a(R.string.Calendar_AlertTime_OnThatDay, "timeString", C32646c.m125245a(-i, TimeZone.getDefault(), false));
        }
        boolean z = true;
        int i2 = (i / CalendarWorkHourUtil.f83805a) + 1;
        int i3 = (i2 * CalendarWorkHourUtil.f83805a) - i;
        int i4 = i2 / 7;
        if (i2 % 7 != 0) {
            z = false;
        }
        if (!z || i4 <= 0) {
            str = C32634ae.m125180a(R.plurals.Calendar_Plural_ReminderDay, i2);
        } else {
            str = C32634ae.m125180a(R.plurals.Calendar_Plural_ReminderWeek, i4);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("aheadOfDays", str);
        hashMap.put("timeString", C32646c.m125245a(i3, TimeZone.getDefault(), false));
        return C30022a.f74882a.utilsDependency().mo108196a(R.string.Calendar_AlertTime_BeforeThatDay, hashMap);
    }

    /* renamed from: b */
    public static String m116937b(Context context, int i) {
        if (i == 0) {
            return UIUtils.getString(context, R.string.Calendar_AlertTime_AtTimeOfEvent);
        }
        if (i < 0) {
            return UIUtils.getString(context, R.string.Calendar_Common_NoAlerts);
        }
        int i2 = i / 10080;
        int i3 = i % 10080;
        int i4 = i / CalendarWorkHourUtil.f83805a;
        int i5 = i % CalendarWorkHourUtil.f83805a;
        int i6 = i / 60;
        int i7 = i % 60;
        if (i2 > 0 && i3 == 0) {
            return C32634ae.m125180a(R.plurals.Calendar_Plural_ReminderWeek, i2);
        }
        if (i4 > 0 && i5 == 0) {
            return C32634ae.m125180a(R.plurals.Calendar_Plural_ReminderDay, i4);
        }
        if (i6 <= 0 || i7 != 0) {
            return C32634ae.m125180a(R.plurals.Calendar_Plural_ReminderMinute, i);
        }
        return C32634ae.m125180a(R.plurals.Calendar_Plural_ReminderHour, i6);
    }
}
