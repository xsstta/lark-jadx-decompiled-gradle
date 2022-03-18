package com.ss.android.lark.calendar.impl.features.local;

import android.database.Cursor;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.Calendar;

/* renamed from: com.ss.android.lark.calendar.impl.features.local.c */
public class C31926c {

    /* renamed from: a */
    public static final String[] f81560a = {"_id", "account_name", "account_type", "name", "calendar_displayName", "calendar_color", "calendar_timezone", "calendar_access_level", "ownerAccount", "sync_events", "visible", "isPrimary"};

    /* renamed from: a */
    public static Calendar m121458a(Cursor cursor) {
        boolean z;
        boolean z2;
        Calendar calendar = new Calendar();
        boolean z3 = false;
        calendar.setId(String.valueOf(cursor.getLong(0)));
        calendar.setSummary(cursor.getString(4));
        calendar.setLocalizedSummary(cursor.getString(4));
        calendar.setNote(cursor.getString(4));
        calendar.setBackgroundColor(cursor.getInt(5));
        if (cursor.getInt(10) != 0) {
            z = true;
        } else {
            z = false;
        }
        calendar.setIsVisible(z);
        calendar.setDefaultTimeZone(cursor.getString(6));
        if (cursor.getInt(9) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        calendar.setIsSynced(z2);
        int i = cursor.getInt(7);
        if (i == 100) {
            calendar.setSelfAccessRole(Calendar.AccessRole.FREE_BUSY_READER);
        } else if (i == 200) {
            calendar.setSelfAccessRole(Calendar.AccessRole.READER);
        } else if (i == 600) {
            calendar.setSelfAccessRole(Calendar.AccessRole.WRITER);
        } else if (i >= 700) {
            calendar.setSelfAccessRole(Calendar.AccessRole.OWNER);
        } else {
            calendar.setSelfAccessRole(Calendar.AccessRole.UNKNOWN_ACCESS_ROLE);
        }
        if (cursor.getInt(11) == 1) {
            z3 = true;
        }
        calendar.setIsPrimary(z3);
        calendar.setType(Calendar.Type.OTHER);
        String string = cursor.getString(1);
        String string2 = cursor.getString(2);
        calendar.setLocalName(string);
        calendar.setLocalType(string2);
        calendar.setSuccessorChatterId("");
        return calendar;
    }
}
