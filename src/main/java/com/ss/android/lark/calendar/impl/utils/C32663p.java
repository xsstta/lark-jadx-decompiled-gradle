package com.ss.android.lark.calendar.impl.utils;

import android.text.TextUtils;
import com.larksuite.framework.utils.CollectionUtils;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.OverallReminderData;
import java.util.List;

/* renamed from: com.ss.android.lark.calendar.impl.utils.p */
public class C32663p {
    /* renamed from: a */
    public static boolean m125352a(OverallReminderData overallReminderData) {
        if (overallReminderData.getEndTime() - overallReminderData.getStartTime() >= 86400) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static String m125353b(OverallReminderData overallReminderData) {
        return C32646c.m125262a(overallReminderData) + "  ";
    }

    /* renamed from: c */
    public static String m125354c(OverallReminderData overallReminderData) {
        StringBuilder sb = new StringBuilder();
        if (CollectionUtils.isNotEmpty(overallReminderData.getMeetingRooms())) {
            List<Boolean> meetingRoomsDisabled = overallReminderData.getMeetingRoomsDisabled();
            boolean z = false;
            for (int i = 0; i < overallReminderData.getMeetingRooms().size(); i++) {
                String str = overallReminderData.getMeetingRooms().get(i);
                if (!TextUtils.isEmpty(str) && !meetingRoomsDisabled.get(i).booleanValue()) {
                    if (z) {
                        sb.append(", ");
                    }
                    sb.append(str);
                    z = true;
                }
            }
        }
        if (!TextUtils.isEmpty(overallReminderData.getLocation())) {
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(overallReminderData.getLocation());
        }
        return sb.toString();
    }
}
