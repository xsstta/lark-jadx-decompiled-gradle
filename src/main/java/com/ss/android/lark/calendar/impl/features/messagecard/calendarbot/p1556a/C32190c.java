package com.ss.android.lark.calendar.impl.features.messagecard.calendarbot.p1556a;

import com.ss.android.lark.calendar.impl.features.events.detail.idata.RSVPStatus;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.messagecard.calendarbot.a.c */
public final /* synthetic */ class C32190c {

    /* renamed from: a */
    public static final /* synthetic */ int[] f82308a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f82309b;

    static {
        int[] iArr = new int[RSVPStatus.values().length];
        f82308a = iArr;
        iArr[RSVPStatus.NEEDS_ACTION.ordinal()] = 1;
        iArr[RSVPStatus.ACCEPT.ordinal()] = 2;
        iArr[RSVPStatus.TENTATIVE.ordinal()] = 3;
        int[] iArr2 = new int[CalendarEventAttendee.Status.values().length];
        f82309b = iArr2;
        iArr2[CalendarEventAttendee.Status.NEEDS_ACTION.ordinal()] = 1;
        iArr2[CalendarEventAttendee.Status.ACCEPT.ordinal()] = 2;
        iArr2[CalendarEventAttendee.Status.TENTATIVE.ordinal()] = 3;
    }
}
