package com.ss.android.lark.calendar.impl.features.messagecard.widget;

import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.messagecard.widget.b */
public final /* synthetic */ class C32215b {

    /* renamed from: a */
    public static final /* synthetic */ int[] f82403a;

    static {
        int[] iArr = new int[CalendarEventAttendee.Status.values().length];
        f82403a = iArr;
        iArr[CalendarEventAttendee.Status.NEEDS_ACTION.ordinal()] = 1;
        iArr[CalendarEventAttendee.Status.ACCEPT.ordinal()] = 2;
        iArr[CalendarEventAttendee.Status.TENTATIVE.ordinal()] = 3;
        iArr[CalendarEventAttendee.Status.DECLINE.ordinal()] = 4;
    }
}
