package com.ss.android.lark.calendar.impl.features.messagecard.p1553a;

import com.ss.android.lark.calendar.impl.features.messagecard.entity.content.CalendarInternalContent;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.messagecard.a.e */
public final /* synthetic */ class C32184e {

    /* renamed from: a */
    public static final /* synthetic */ int[] f82298a;

    static {
        int[] iArr = new int[CalendarInternalContent.CalendarMessageType.values().length];
        f82298a = iArr;
        iArr[CalendarInternalContent.CalendarMessageType.EVENT_INVITE.ordinal()] = 1;
        iArr[CalendarInternalContent.CalendarMessageType.EVENT_DELETE.ordinal()] = 2;
        iArr[CalendarInternalContent.CalendarMessageType.EVENT_RESCHEDULE.ordinal()] = 3;
        iArr[CalendarInternalContent.CalendarMessageType.EVENT_UPDATE_LOCATION.ordinal()] = 4;
        iArr[CalendarInternalContent.CalendarMessageType.EVENT_UPDATE_DESCRIPTION.ordinal()] = 5;
    }
}
