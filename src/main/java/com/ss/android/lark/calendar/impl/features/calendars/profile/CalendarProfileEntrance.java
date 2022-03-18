package com.ss.android.lark.calendar.impl.features.calendars.profile;

import android.content.Context;
import com.ss.android.lark.calendar.impl.framework.hitpoint.p1572c.C32502i;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.p1432a.AbstractC30023a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\"\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0007¨\u0006\u000b"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/profile/CalendarProfileEntrance;", "", "()V", "startCalendarProfileActivity", "", "context", "Landroid/content/Context;", "calendarId", "", "startCalendarProfileActivityFromAppLink", ShareHitPoint.f121868c, "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.profile.a */
public final class CalendarProfileEntrance {

    /* renamed from: a */
    public static final CalendarProfileEntrance f76061a = new CalendarProfileEntrance();

    private CalendarProfileEntrance() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m112920a(Context context, String str) {
        boolean z;
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "calendarId");
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            AbstractC30023a a = C30022a.f74882a.appRouter().mo108210a(CalendarProfileActivity.class);
            a.mo108153a("calendar_id", str);
            a.mo108156b(context);
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m112921a(Context context, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "calendarId");
        m112920a(context, str);
        C32502i.m124380b(str, str2);
    }
}
