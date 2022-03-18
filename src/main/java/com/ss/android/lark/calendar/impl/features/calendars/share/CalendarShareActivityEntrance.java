package com.ss.android.lark.calendar.impl.features.calendars.share;

import android.content.Context;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.FetchCalendarData;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.p1432a.AbstractC30023a;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fR\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/share/CalendarShareActivityEntrance;", "", "()V", "SHARE_REQUEST_CODE", "", "startCalendarShareActivity", "", "context", "Landroid/content/Context;", "calendarId", "", "calendarWithMembers", "Lcom/ss/android/lark/calendar/impl/rustadapter/doentity/FetchCalendarData;", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.share.a */
public final class CalendarShareActivityEntrance {

    /* renamed from: a */
    public static final CalendarShareActivityEntrance f76215a = new CalendarShareActivityEntrance();

    private CalendarShareActivityEntrance() {
    }

    /* renamed from: a */
    public final void mo109894a(Context context, String str, FetchCalendarData fetchCalendarData) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "calendarId");
        AbstractC30023a a = C30022a.f74882a.appRouter().mo108210a(CalendarShareActivity.class).mo108153a("key_param_share_calendar_id", str);
        Object obj = fetchCalendarData;
        if (fetchCalendarData == null) {
            obj = "";
        }
        a.mo108152a("key_param_calendar_with_members_data", (Serializable) obj).mo108155a(context, 5);
    }
}
