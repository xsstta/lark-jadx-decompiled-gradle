package com.ss.android.lark.calendar.impl.features.messagecard.p1553a.p1554a;

import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.messagecard.a.a.d */
public final /* synthetic */ class C32180d {

    /* renamed from: a */
    public static final /* synthetic */ int[] f82280a;

    static {
        int[] iArr = new int[CalendarEventAttendee.Status.values().length];
        f82280a = iArr;
        iArr[CalendarEventAttendee.Status.ACCEPT.ordinal()] = 1;
        iArr[CalendarEventAttendee.Status.DECLINE.ordinal()] = 2;
        iArr[CalendarEventAttendee.Status.TENTATIVE.ordinal()] = 3;
    }
}
