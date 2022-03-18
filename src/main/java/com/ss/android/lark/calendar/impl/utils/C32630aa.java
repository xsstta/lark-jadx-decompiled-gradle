package com.ss.android.lark.calendar.impl.utils;

import com.ss.android.lark.calendar.impl.features.events.detail.idata.RSVPStatus;
import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.utils.aa */
public final /* synthetic */ class C32630aa {

    /* renamed from: a */
    public static final /* synthetic */ int[] f83725a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f83726b;

    /* renamed from: c */
    public static final /* synthetic */ int[] f83727c;

    /* renamed from: d */
    public static final /* synthetic */ int[] f83728d;

    static {
        int[] iArr = new int[CalendarEvent.Span.values().length];
        f83725a = iArr;
        iArr[CalendarEvent.Span.ALL_EVENTS.ordinal()] = 1;
        iArr[CalendarEvent.Span.THIS_EVENT.ordinal()] = 2;
        iArr[CalendarEvent.Span.NONE_SPAN.ordinal()] = 3;
        int[] iArr2 = new int[CalendarEvent.Span.values().length];
        f83726b = iArr2;
        iArr2[CalendarEvent.Span.ALL_EVENTS.ordinal()] = 1;
        iArr2[CalendarEvent.Span.THIS_EVENT.ordinal()] = 2;
        iArr2[CalendarEvent.Span.NONE_SPAN.ordinal()] = 3;
        int[] iArr3 = new int[CalendarEvent.Span.values().length];
        f83727c = iArr3;
        iArr3[CalendarEvent.Span.ALL_EVENTS.ordinal()] = 1;
        iArr3[CalendarEvent.Span.THIS_EVENT.ordinal()] = 2;
        iArr3[CalendarEvent.Span.NONE_SPAN.ordinal()] = 3;
        int[] iArr4 = new int[RSVPStatus.values().length];
        f83728d = iArr4;
        iArr4[RSVPStatus.ACCEPT.ordinal()] = 1;
        iArr4[RSVPStatus.DECLINE.ordinal()] = 2;
        iArr4[RSVPStatus.TENTATIVE.ordinal()] = 3;
    }
}
