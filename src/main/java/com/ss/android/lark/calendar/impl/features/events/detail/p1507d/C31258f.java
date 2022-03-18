package com.ss.android.lark.calendar.impl.features.events.detail.p1507d;

import com.ss.android.lark.calendar.impl.features.events.detail.idata.RSVPStatus;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.d.f */
public final /* synthetic */ class C31258f {

    /* renamed from: a */
    public static final /* synthetic */ int[] f79160a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f79161b;

    /* renamed from: c */
    public static final /* synthetic */ int[] f79162c;

    /* renamed from: d */
    public static final /* synthetic */ int[] f79163d;

    /* renamed from: e */
    public static final /* synthetic */ int[] f79164e;

    static {
        int[] iArr = new int[RSVPStatus.values().length];
        f79160a = iArr;
        iArr[RSVPStatus.NEEDS_ACTION.ordinal()] = 1;
        iArr[RSVPStatus.ACCEPT.ordinal()] = 2;
        iArr[RSVPStatus.TENTATIVE.ordinal()] = 3;
        iArr[RSVPStatus.DECLINE.ordinal()] = 4;
        iArr[RSVPStatus.REMOVED.ordinal()] = 5;
        int[] iArr2 = new int[CalendarEventAttendee.Status.values().length];
        f79161b = iArr2;
        iArr2[CalendarEventAttendee.Status.ACCEPT.ordinal()] = 1;
        iArr2[CalendarEventAttendee.Status.DECLINE.ordinal()] = 2;
        iArr2[CalendarEventAttendee.Status.TENTATIVE.ordinal()] = 3;
        iArr2[CalendarEventAttendee.Status.REMOVED.ordinal()] = 4;
        iArr2[CalendarEventAttendee.Status.NEEDS_ACTION.ordinal()] = 5;
        int[] iArr3 = new int[RSVPStatus.values().length];
        f79162c = iArr3;
        iArr3[RSVPStatus.ACCEPT.ordinal()] = 1;
        iArr3[RSVPStatus.DECLINE.ordinal()] = 2;
        iArr3[RSVPStatus.TENTATIVE.ordinal()] = 3;
        int[] iArr4 = new int[RSVPStatus.values().length];
        f79163d = iArr4;
        iArr4[RSVPStatus.ACCEPT.ordinal()] = 1;
        iArr4[RSVPStatus.DECLINE.ordinal()] = 2;
        iArr4[RSVPStatus.TENTATIVE.ordinal()] = 3;
        int[] iArr5 = new int[CalendarEvent.Span.values().length];
        f79164e = iArr5;
        iArr5[CalendarEvent.Span.THIS_EVENT.ordinal()] = 1;
        iArr5[CalendarEvent.Span.ALL_EVENTS.ordinal()] = 2;
    }
}
