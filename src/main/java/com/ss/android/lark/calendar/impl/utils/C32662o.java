package com.ss.android.lark.calendar.impl.utils;

import android.text.TextUtils;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.SimpleMember;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.lark.calendar.impl.utils.o */
public class C32662o {
    /* renamed from: b */
    public static boolean m125351b(CalendarEventAttendee calendarEventAttendee) {
        if (calendarEventAttendee == null || TextUtils.isEmpty(calendarEventAttendee.getGroupId())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m125349a(CalendarEventAttendee calendarEventAttendee) {
        if (TextUtils.isEmpty(calendarEventAttendee.getAttendeeCalendarId()) || calendarEventAttendee.getAttendeeCalendarId().equals("0")) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m125350a(String str) {
        if (TextUtils.isEmpty(str) || "0".equals(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static void m125348a(List<SimpleMember> list, HashSet<String> hashSet) {
        if (!CollectionUtils.isEmpty(list)) {
            for (SimpleMember yVar : list) {
                if (!(yVar == null || yVar.mo120252b() == CalendarEventAttendee.Status.REMOVED || !m125350a(yVar.mo120249a()))) {
                    hashSet.add(yVar.mo120249a());
                }
            }
        }
    }

    /* renamed from: a */
    public static int m125345a(List<CalendarEventAttendee> list, Map<String, List<SimpleMember>> map, boolean z) {
        return m125346a(list, map, z, true, false);
    }

    /* renamed from: a */
    private static void m125347a(CalendarEventAttendee calendarEventAttendee, Map<String, List<SimpleMember>> map, HashSet<String> hashSet) {
        if (calendarEventAttendee.isGroup()) {
            if (map != null && CollectionUtils.isNotEmpty(map.get(calendarEventAttendee.getGroupId()))) {
                m125348a(map.get(calendarEventAttendee.getGroupId()), hashSet);
            } else if (!CollectionUtils.isEmpty(calendarEventAttendee.getGroupMembers())) {
                for (CalendarEventAttendee calendarEventAttendee2 : calendarEventAttendee.getGroupMembers()) {
                    if (m125349a(calendarEventAttendee2) && calendarEventAttendee2.getStatus() != CalendarEventAttendee.Status.REMOVED) {
                        hashSet.add(calendarEventAttendee2.getAttendeeCalendarId());
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static int m125346a(List<CalendarEventAttendee> list, Map<String, List<SimpleMember>> map, boolean z, boolean z2, boolean z3) {
        if (CollectionUtils.isEmpty(list)) {
            return 0;
        }
        if (z) {
            HashMap hashMap = new HashMap();
            for (CalendarEventAttendee calendarEventAttendee : list) {
                if (calendarEventAttendee.getStatus() != CalendarEventAttendee.Status.REMOVED && (!z2 || !calendarEventAttendee.isResource())) {
                    hashMap.put(calendarEventAttendee.getEmail(), calendarEventAttendee);
                }
            }
            return hashMap.values().size();
        }
        HashSet hashSet = new HashSet();
        for (CalendarEventAttendee calendarEventAttendee2 : list) {
            if (calendarEventAttendee2.getStatus() != CalendarEventAttendee.Status.REMOVED && (!z2 || !calendarEventAttendee2.isResource())) {
                if (calendarEventAttendee2.isThirdParty()) {
                    if (!z3) {
                        hashSet.add(calendarEventAttendee2.getEmail());
                    }
                } else if (m125349a(calendarEventAttendee2)) {
                    hashSet.add(calendarEventAttendee2.getAttendeeCalendarId());
                } else if (calendarEventAttendee2.isGroup()) {
                    m125347a(calendarEventAttendee2, map, hashSet);
                }
            }
        }
        return hashSet.size();
    }
}
