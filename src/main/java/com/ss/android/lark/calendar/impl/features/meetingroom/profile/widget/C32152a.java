package com.ss.android.lark.calendar.impl.features.meetingroom.profile.widget;

import com.bytedance.lark.pb.calendar.v1.MeetingRoomStatus;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.profile.widget.a */
public final /* synthetic */ class C32152a {

    /* renamed from: a */
    public static final /* synthetic */ int[] f82193a;

    static {
        int[] iArr = new int[MeetingRoomStatus.values().length];
        f82193a = iArr;
        iArr[MeetingRoomStatus.CAN_RESERVE.ordinal()] = 1;
        iArr[MeetingRoomStatus.CAN_NOT_RESERVE.ordinal()] = 2;
        iArr[MeetingRoomStatus.IN_USE.ordinal()] = 3;
    }
}
