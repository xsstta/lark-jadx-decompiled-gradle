package com.ss.android.lark.calendar.impl.features.calendars.sidebar;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.lark.calendar.impl.framework.hitpoint.p1572c.C32502i;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.impl.hitpoint.ShareHitPoint;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u0004H\u0007J$\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ss/android/lark/calendar/impl/features/calendars/sidebar/CalendarSideBarEntrance;", "", "()V", "CALENDAR_ID", "", "CALENDAR_ROUTE_CALENDAR_LIST_FROM_TAB", "checkSendShareCalendarHit", "", "calendarId", ShareHitPoint.f121868c, "startActivity", "context", "Landroid/content/Context;", "startSideBarActivityFromAppLink", "calendar-impl_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.sidebar.a */
public final class CalendarSideBarEntrance {

    /* renamed from: a */
    public static final CalendarSideBarEntrance f76425a = new CalendarSideBarEntrance();

    private CalendarSideBarEntrance() {
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m113510a(Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        C30022a.f74882a.appRouter().mo108210a(CalendarSidebarActivity.class).mo108156b(context);
    }

    /* renamed from: a */
    private final void m113513a(String str, String str2) {
        if (Intrinsics.areEqual(str2, "calendar_share_by_owner")) {
            C32502i.m124384c(str, true, "open_cal_check");
        }
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m113511a(Context context, String str) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "calendarId");
        C30022a.f74882a.appRouter().mo108210a(CalendarSidebarActivity.class).mo108153a("calendar_id", str).mo108156b(context);
    }

    @JvmStatic
    /* renamed from: a */
    public static final void m113512a(Context context, String str, String str2) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Bundle bundle = new Bundle();
        bundle.putBoolean("cal_route_calendar_list_from_tab", true);
        bundle.putString("calendar_id", str);
        C30022a.f74882a.mainModuleDependency().mo108278a(context, bundle);
        f76425a.m113513a(str, str2);
    }
}
