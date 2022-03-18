package com.ss.android.lark.calendar.impl.features.meetingroom.profile;

import com.bytedance.lark.pb.calendar.v1.MeetingRoomStatus;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.profile.f */
public final /* synthetic */ class C32151f {

    /* renamed from: a */
    public static final /* synthetic */ int[] f82191a;

    static {
        int[] iArr = new int[MeetingRoomStatus.values().length];
        f82191a = iArr;
        iArr[MeetingRoomStatus.IN_USE.ordinal()] = 1;
        iArr[MeetingRoomStatus.CAN_NOT_RESERVE.ordinal()] = 2;
    }
}
