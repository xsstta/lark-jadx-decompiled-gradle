package com.ss.android.lark.calendar.impl.features.events.detail.view;

import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.view.e */
public final /* synthetic */ class C31453e {

    /* renamed from: a */
    public static final /* synthetic */ int[] f79697a;

    static {
        int[] iArr = new int[CalendarEvent.Span.values().length];
        f79697a = iArr;
        iArr[CalendarEvent.Span.THIS_EVENT.ordinal()] = 1;
        iArr[CalendarEvent.Span.FUTURE_EVENTS.ordinal()] = 2;
        iArr[CalendarEvent.Span.ALL_EVENTS.ordinal()] = 3;
    }
}
