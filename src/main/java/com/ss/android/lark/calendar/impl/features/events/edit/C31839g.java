package com.ss.android.lark.calendar.impl.features.events.edit;

import com.ss.android.lark.calendar.impl.rustadapter.doentity.CalendarEvent;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.g */
public final /* synthetic */ class C31839g {

    /* renamed from: a */
    public static final /* synthetic */ int[] f81106a;

    static {
        int[] iArr = new int[CalendarEvent.Visibility.values().length];
        f81106a = iArr;
        iArr[CalendarEvent.Visibility.DEFAULT.ordinal()] = 1;
        iArr[CalendarEvent.Visibility.PUBLIC.ordinal()] = 2;
        iArr[CalendarEvent.Visibility.PRIVATE.ordinal()] = 3;
    }
}
