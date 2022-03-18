package com.ss.android.lark.calendar.impl.features.calendars.editor;

import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.editor.e */
public final /* synthetic */ class C30337e {

    /* renamed from: a */
    public static final /* synthetic */ int[] f75966a;

    static {
        int[] iArr = new int[CalendarEvent.Span.values().length];
        f75966a = iArr;
        iArr[CalendarEvent.Span.THIS_EVENT.ordinal()] = 1;
        iArr[CalendarEvent.Span.FUTURE_EVENTS.ordinal()] = 2;
    }
}
