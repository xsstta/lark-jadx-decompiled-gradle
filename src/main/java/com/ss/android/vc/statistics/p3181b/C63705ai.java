package com.ss.android.vc.statistics.p3181b;

import com.ss.android.vc.entity.MeetingStatus;
import com.ss.android.vc.entity.VideoChat;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.statistics.b.ai */
public final /* synthetic */ class C63705ai {

    /* renamed from: a */
    public static final /* synthetic */ int[] f160817a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f160818b;

    static {
        int[] iArr = new int[VideoChat.Type.values().length];
        f160817a = iArr;
        iArr[VideoChat.Type.CALL.ordinal()] = 1;
        iArr[VideoChat.Type.MEET.ordinal()] = 2;
        int[] iArr2 = new int[MeetingStatus.values().length];
        f160818b = iArr2;
        iArr2[MeetingStatus.MEETING_END.ordinal()] = 1;
    }
}
