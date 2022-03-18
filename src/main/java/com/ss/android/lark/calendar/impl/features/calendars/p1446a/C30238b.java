package com.ss.android.lark.calendar.impl.features.calendars.p1446a;

import com.bytedance.lark.pb.calendar.v1.Calendar;
import com.bytedance.lark.pb.calendar.v1.CalendarMember;
import com.bytedance.lark.pb.calendar.v1.UserEventVisibility;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.calendars.a.b */
public final /* synthetic */ class C30238b {

    /* renamed from: a */
    public static final /* synthetic */ int[] f75590a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f75591b;

    /* renamed from: c */
    public static final /* synthetic */ int[] f75592c;

    /* renamed from: d */
    public static final /* synthetic */ int[] f75593d;

    static {
        int[] iArr = new int[Calendar.Type.values().length];
        f75590a = iArr;
        iArr[Calendar.Type.OTHER.ordinal()] = 1;
        iArr[Calendar.Type.ACTIVITY.ordinal()] = 2;
        iArr[Calendar.Type.PRIMARY.ordinal()] = 3;
        int[] iArr2 = new int[CalendarMember.CalendarMemberType.values().length];
        f75591b = iArr2;
        iArr2[CalendarMember.CalendarMemberType.INDIVIDUAL.ordinal()] = 1;
        iArr2[CalendarMember.CalendarMemberType.GROUP.ordinal()] = 2;
        int[] iArr3 = new int[UserEventVisibility.values().length];
        f75592c = iArr3;
        iArr3[UserEventVisibility.READER.ordinal()] = 1;
        iArr3[UserEventVisibility.BUSY_READER.ordinal()] = 2;
        int[] iArr4 = new int[UserEventVisibility.values().length];
        f75593d = iArr4;
        iArr4[UserEventVisibility.READER.ordinal()] = 1;
        iArr4[UserEventVisibility.BUSY_READER.ordinal()] = 2;
    }
}
