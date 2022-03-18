package com.ss.android.lark.calendar.impl.features.events.detail.view;

import com.ss.android.lark.calendar.impl.features.events.detail.idata.IBodyData;
import com.ss.android.lark.calendar.impl.features.events.detail.idata.VideoMeetingVisibility;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.view.c */
public final /* synthetic */ class C31451c {

    /* renamed from: a */
    public static final /* synthetic */ int[] f79694a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f79695b;

    static {
        int[] iArr = new int[IBodyData.AttendeeVisibility.values().length];
        f79694a = iArr;
        iArr[IBodyData.AttendeeVisibility.SHOW.ordinal()] = 1;
        iArr[IBodyData.AttendeeVisibility.SHOWINLINE.ordinal()] = 2;
        iArr[IBodyData.AttendeeVisibility.HIDDEN.ordinal()] = 3;
        iArr[IBodyData.AttendeeVisibility.GONE.ordinal()] = 4;
        int[] iArr2 = new int[VideoMeetingVisibility.values().length];
        f79695b = iArr2;
        iArr2[VideoMeetingVisibility.VISIBLE.ordinal()] = 1;
        iArr2[VideoMeetingVisibility.DISABLE.ordinal()] = 2;
        iArr2[VideoMeetingVisibility.INVISIBLE.ordinal()] = 3;
    }
}
