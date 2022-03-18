package com.ss.android.lark.calendar.impl.features.events.edit;

import com.ss.android.lark.calendar.impl.features.events.edit.part.EditCalendarPart;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.f */
public final /* synthetic */ class C31623f {

    /* renamed from: a */
    public static final /* synthetic */ int[] f80263a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f80264b;

    /* renamed from: c */
    public static final /* synthetic */ int[] f80265c;

    static {
        int[] iArr = new int[CalendarEvent.Source.values().length];
        f80263a = iArr;
        iArr[CalendarEvent.Source.GOOGLE.ordinal()] = 1;
        iArr[CalendarEvent.Source.EXCHANGE.ordinal()] = 2;
        iArr[CalendarEvent.Source.ANDROID.ordinal()] = 3;
        int[] iArr2 = new int[EditCalendarPart.CHANGE_TYPE.values().length];
        f80264b = iArr2;
        iArr2[EditCalendarPart.CHANGE_TYPE.LARK_TO_EXCHANGE.ordinal()] = 1;
        iArr2[EditCalendarPart.CHANGE_TYPE.LARK_TO_GOOGLE.ordinal()] = 2;
        iArr2[EditCalendarPart.CHANGE_TYPE.EXCHANGE_TO_LARK.ordinal()] = 3;
        iArr2[EditCalendarPart.CHANGE_TYPE.GOOGLE_TO_LARK.ordinal()] = 4;
        int[] iArr3 = new int[CalendarEvent.Source.values().length];
        f80265c = iArr3;
        iArr3[CalendarEvent.Source.GOOGLE.ordinal()] = 1;
        iArr3[CalendarEvent.Source.EXCHANGE.ordinal()] = 2;
        iArr3[CalendarEvent.Source.ANDROID.ordinal()] = 3;
    }
}
