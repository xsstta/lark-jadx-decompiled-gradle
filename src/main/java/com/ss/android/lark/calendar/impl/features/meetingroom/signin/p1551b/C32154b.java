package com.ss.android.lark.calendar.impl.features.meetingroom.signin.p1551b;

import com.ss.android.lark.calendar.impl.features.meetingroom.signin.data.MeetingRoomSignInState;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.signin.b.b */
public final /* synthetic */ class C32154b {

    /* renamed from: a */
    public static final /* synthetic */ int[] f82201a;

    static {
        int[] iArr = new int[MeetingRoomSignInState.values().length];
        f82201a = iArr;
        iArr[MeetingRoomSignInState.IDLE.ordinal()] = 1;
        iArr[MeetingRoomSignInState.NEED_CHECK_IN.ordinal()] = 2;
        iArr[MeetingRoomSignInState.IN_USE.ordinal()] = 3;
        iArr[MeetingRoomSignInState.INACTIVE.ordinal()] = 4;
    }
}
