package com.ss.android.lark.calendar.impl.features.meetingroom.instance;

import android.content.Context;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarResource;
import com.ss.android.lark.calendar.p1430a.C30022a;
import com.ss.android.lark.calendar.p1430a.p1431a.p1432a.AbstractC30023a;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.instance.b */
public final class RoomInstanceEntrance {

    /* renamed from: a */
    public static final RoomInstanceEntrance f82076a = new RoomInstanceEntrance();

    private RoomInstanceEntrance() {
    }

    /* renamed from: a */
    public static final void m122115a(Context context, String str, CalendarResource calendarResource, int i, int i2) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        Intrinsics.checkParameterIsNotNull(str, "buildingName");
        AbstractC30023a a = C30022a.f74882a.appRouter().mo108210a(RoomInstanceActivity.class).mo108153a("room_building_name", str).mo108152a("room_select_day", Integer.valueOf(i));
        if (calendarResource != null) {
            a.mo108152a("room_calendar_resource", calendarResource);
        }
        a.mo108155a(context, i2);
    }

    /* renamed from: a */
    public static /* synthetic */ void m122116a(Context context, String str, CalendarResource calendarResource, int i, int i2, int i3, Object obj) {
        if ((i3 & 16) != 0) {
            i2 = 0;
        }
        m122115a(context, str, calendarResource, i, i2);
    }
}
