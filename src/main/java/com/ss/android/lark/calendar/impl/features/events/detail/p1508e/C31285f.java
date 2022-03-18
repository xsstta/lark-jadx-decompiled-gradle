package com.ss.android.lark.calendar.impl.features.events.detail.p1508e;

import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.e.f */
public final /* synthetic */ class C31285f {

    /* renamed from: a */
    public static final /* synthetic */ int[] f79214a;

    static {
        int[] iArr = new int[CalendarEventAttendee.Status.values().length];
        f79214a = iArr;
        iArr[CalendarEventAttendee.Status.ACCEPT.ordinal()] = 1;
        iArr[CalendarEventAttendee.Status.DECLINE.ordinal()] = 2;
        iArr[CalendarEventAttendee.Status.TENTATIVE.ordinal()] = 3;
    }
}
