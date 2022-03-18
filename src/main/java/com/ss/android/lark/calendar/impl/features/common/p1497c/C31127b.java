package com.ss.android.lark.calendar.impl.features.common.p1497c;

import com.ss.android.lark.calendar.impl.features.events.detail.idata.RSVPStatus;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.common.c.b */
public final /* synthetic */ class C31127b {

    /* renamed from: a */
    public static final /* synthetic */ int[] f78610a;

    static {
        int[] iArr = new int[RSVPStatus.values().length];
        f78610a = iArr;
        iArr[RSVPStatus.NEEDS_ACTION.ordinal()] = 1;
        iArr[RSVPStatus.ACCEPT.ordinal()] = 2;
        iArr[RSVPStatus.DECLINE.ordinal()] = 3;
        iArr[RSVPStatus.TENTATIVE.ordinal()] = 4;
    }
}
