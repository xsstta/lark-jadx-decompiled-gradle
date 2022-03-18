package com.ss.android.lark.calendar.impl.utils;

import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventInstance;

/* renamed from: com.ss.android.lark.calendar.impl.utils.e */
public class C32648e {
    /* renamed from: a */
    public static boolean m125305a(CalendarEventInstance calendarEventInstance) {
        if (calendarEventInstance == null || (calendarEventInstance.getCalAccessRole() != Calendar.AccessRole.OWNER && calendarEventInstance.getCalAccessRole() != Calendar.AccessRole.WRITER)) {
            return false;
        }
        return true;
    }
}
