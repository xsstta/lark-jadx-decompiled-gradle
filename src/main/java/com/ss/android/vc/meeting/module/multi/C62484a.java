package com.ss.android.vc.meeting.module.multi;

import com.ss.android.vc.entity.VideoChat;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.multi.a */
public final /* synthetic */ class C62484a {

    /* renamed from: a */
    public static final /* synthetic */ int[] f157193a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f157194b;

    static {
        int[] iArr = new int[VideoChat.EndReason.values().length];
        f157193a = iArr;
        iArr[VideoChat.EndReason.REFUSE.ordinal()] = 1;
        iArr[VideoChat.EndReason.CANCEL.ordinal()] = 2;
        iArr[VideoChat.EndReason.CONNECTION_FAILED.ordinal()] = 3;
        iArr[VideoChat.EndReason.SDK_EXCEPTION.ordinal()] = 4;
        iArr[VideoChat.EndReason.RING_TIMEOUT.ordinal()] = 5;
        iArr[VideoChat.EndReason.CALL_EXCEPTION.ordinal()] = 6;
        int[] iArr2 = new int[VideoChat.EndReason.values().length];
        f157194b = iArr2;
        iArr2[VideoChat.EndReason.CONNECTION_FAILED.ordinal()] = 1;
        iArr2[VideoChat.EndReason.SDK_EXCEPTION.ordinal()] = 2;
    }
}
