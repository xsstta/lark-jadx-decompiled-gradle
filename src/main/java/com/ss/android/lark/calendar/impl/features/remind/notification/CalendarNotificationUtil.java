package com.ss.android.lark.calendar.impl.features.remind.notification;

import com.ss.android.lark.log.Log;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¨\u0006\b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/remind/notification/CalendarNotificationUtil;", "", "()V", "getLongFromStr", "", "longStr", "", "defaultValue", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.remind.a.a */
public final class CalendarNotificationUtil {

    /* renamed from: a */
    public static final CalendarNotificationUtil f82535a = new CalendarNotificationUtil();

    private CalendarNotificationUtil() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final long m123029a(String str, long j) {
        boolean z;
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return j;
        }
        try {
            return Long.parseLong(str);
        } catch (Exception unused) {
            Log.m165383e("NotificationUtil", "invalid longStr");
            return j;
        }
    }
}
