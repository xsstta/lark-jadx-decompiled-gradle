package com.ss.android.lark.calendar.impl.features.events.edit.p1521c;

import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.c.b */
public final /* synthetic */ class C31558b {

    /* renamed from: a */
    public static final /* synthetic */ int[] f79977a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f79978b;

    /* renamed from: c */
    public static final /* synthetic */ int[] f79979c;

    static {
        int[] iArr = new int[CalendarEvent.Span.values().length];
        f79977a = iArr;
        iArr[CalendarEvent.Span.THIS_EVENT.ordinal()] = 1;
        iArr[CalendarEvent.Span.FUTURE_EVENTS.ordinal()] = 2;
        iArr[CalendarEvent.Span.ALL_EVENTS.ordinal()] = 3;
        int[] iArr2 = new int[CalendarEvent.Span.values().length];
        f79978b = iArr2;
        iArr2[CalendarEvent.Span.THIS_EVENT.ordinal()] = 1;
        iArr2[CalendarEvent.Span.ALL_EVENTS.ordinal()] = 2;
        int[] iArr3 = new int[CalendarEvent.Span.values().length];
        f79979c = iArr3;
        iArr3[CalendarEvent.Span.THIS_EVENT.ordinal()] = 1;
        iArr3[CalendarEvent.Span.ALL_EVENTS.ordinal()] = 2;
    }
}
