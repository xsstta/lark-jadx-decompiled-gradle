package com.ss.android.lark.calendar.impl.features.meetingroom.signin.widget;

import com.ss.android.lark.calendar.impl.features.meetingroom.signin.data.InactiveReason;
import com.ss.android.lark.calendar.impl.features.meetingroom.signin.data.MeetingRoomSignInState;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.meetingroom.signin.widget.a */
public final /* synthetic */ class C32176a {

    /* renamed from: a */
    public static final /* synthetic */ int[] f82263a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f82264b;

    static {
        int[] iArr = new int[MeetingRoomSignInState.values().length];
        f82263a = iArr;
        iArr[MeetingRoomSignInState.IDLE.ordinal()] = 1;
        iArr[MeetingRoomSignInState.NEED_CHECK_IN.ordinal()] = 2;
        iArr[MeetingRoomSignInState.IN_USE.ordinal()] = 3;
        iArr[MeetingRoomSignInState.INACTIVE.ordinal()] = 4;
        int[] iArr2 = new int[InactiveReason.values().length];
        f82264b = iArr2;
        iArr2[InactiveReason.LIMITED_BY_USER_STRATEGY.ordinal()] = 1;
        iArr2[InactiveReason.QR_CHECK_IN_NOT_ENABLE.ordinal()] = 2;
        iArr2[InactiveReason.DURING_STRATEGY.ordinal()] = 3;
        iArr2[InactiveReason.DURING_OLD_PERMANENTLY_DISABLED.ordinal()] = 4;
        iArr2[InactiveReason.DURING_REQUISITION.ordinal()] = 5;
    }
}
