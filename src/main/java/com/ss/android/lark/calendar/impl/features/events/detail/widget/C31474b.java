package com.ss.android.lark.calendar.impl.features.events.detail.widget;

import com.ss.android.lark.calendar.impl.features.events.detail.idata.RSVPStatus;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.detail.widget.b */
public final /* synthetic */ class C31474b {

    /* renamed from: a */
    public static final /* synthetic */ int[] f79780a;

    static {
        int[] iArr = new int[RSVPStatus.values().length];
        f79780a = iArr;
        iArr[RSVPStatus.NEEDS_ACTION.ordinal()] = 1;
        iArr[RSVPStatus.ACCEPT.ordinal()] = 2;
        iArr[RSVPStatus.DECLINE.ordinal()] = 3;
        iArr[RSVPStatus.TENTATIVE.ordinal()] = 4;
    }
}
