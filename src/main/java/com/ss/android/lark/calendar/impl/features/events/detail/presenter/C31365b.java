package com.ss.android.lark.calendar.impl.features.events.detail.presenter;

import com.ss.android.lark.calendar.impl.features.events.detail.idata.RSVPStatus;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEventAttendee;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.presenter.b */
public final /* synthetic */ class C31365b {

    /* renamed from: a */
    public static final /* synthetic */ int[] f79401a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f79402b;

    static {
        int[] iArr = new int[RSVPStatus.values().length];
        f79401a = iArr;
        iArr[RSVPStatus.ACCEPT.ordinal()] = 1;
        iArr[RSVPStatus.DECLINE.ordinal()] = 2;
        iArr[RSVPStatus.TENTATIVE.ordinal()] = 3;
        int[] iArr2 = new int[CalendarEventAttendee.Status.values().length];
        f79402b = iArr2;
        iArr2[CalendarEventAttendee.Status.ACCEPT.ordinal()] = 1;
        iArr2[CalendarEventAttendee.Status.DECLINE.ordinal()] = 2;
        iArr2[CalendarEventAttendee.Status.TENTATIVE.ordinal()] = 3;
    }
}
