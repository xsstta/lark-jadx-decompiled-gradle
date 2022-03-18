package com.ss.android.vc.meeting.module.single;

import com.ss.android.vc.net.service.VideoChatUserRole;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.single.d */
public final /* synthetic */ class C63081d {

    /* renamed from: a */
    public static final /* synthetic */ int[] f158996a;

    static {
        int[] iArr = new int[VideoChatUserRole.values().length];
        f158996a = iArr;
        iArr[VideoChatUserRole.UNKNOWN.ordinal()] = 1;
        iArr[VideoChatUserRole.SINGLE_CALLER.ordinal()] = 2;
        iArr[VideoChatUserRole.SINGLE_CALLEE.ordinal()] = 3;
        iArr[VideoChatUserRole.GROUP_HOST.ordinal()] = 4;
        iArr[VideoChatUserRole.GROUP_PARTICIPANT.ordinal()] = 5;
    }
}
