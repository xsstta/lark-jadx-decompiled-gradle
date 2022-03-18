package com.ss.android.lark.calendar.impl.features.meetingroom.signin;

import com.bytedance.lark.pb.calendar.v1.InstanceCheckInInfo;
import com.ss.android.lark.calendar.impl.features.meetingroom.signin.data.MeetingRoomSignInState;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.signin.h */
public final /* synthetic */ class C32172h {

    /* renamed from: a */
    public static final /* synthetic */ int[] f82244a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f82245b;

    /* renamed from: c */
    public static final /* synthetic */ int[] f82246c;

    static {
        int[] iArr = new int[MeetingRoomSignInState.values().length];
        f82244a = iArr;
        iArr[MeetingRoomSignInState.IDLE.ordinal()] = 1;
        iArr[MeetingRoomSignInState.IN_USE.ordinal()] = 2;
        iArr[MeetingRoomSignInState.NEED_CHECK_IN.ordinal()] = 3;
        iArr[MeetingRoomSignInState.INACTIVE.ordinal()] = 4;
        int[] iArr2 = new int[MeetingRoomSignInState.values().length];
        f82245b = iArr2;
        iArr2[MeetingRoomSignInState.NEED_CHECK_IN.ordinal()] = 1;
        iArr2[MeetingRoomSignInState.IDLE.ordinal()] = 2;
        iArr2[MeetingRoomSignInState.IN_USE.ordinal()] = 3;
        iArr2[MeetingRoomSignInState.INACTIVE.ordinal()] = 4;
        int[] iArr3 = new int[InstanceCheckInInfo.CheckInType.values().length];
        f82246c = iArr3;
        iArr3[InstanceCheckInInfo.CheckInType.NOT_CHECK_IN.ordinal()] = 1;
        iArr3[InstanceCheckInInfo.CheckInType.ALREADY_CHECK_IN.ordinal()] = 2;
    }
}
