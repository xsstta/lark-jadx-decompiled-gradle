package com.ss.android.vc.meeting.module.share.p3160a;

import com.ss.android.vc.entity.CalendarInfo;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.share.a.d */
public final /* synthetic */ class C62948d {

    /* renamed from: a */
    public static final /* synthetic */ int[] f158578a;

    static {
        int[] iArr = new int[CalendarInfo.CalendarAcceptStatus.values().length];
        f158578a = iArr;
        iArr[CalendarInfo.CalendarAcceptStatus.ACCEPT.ordinal()] = 1;
        iArr[CalendarInfo.CalendarAcceptStatus.REJECT.ordinal()] = 2;
        iArr[CalendarInfo.CalendarAcceptStatus.TBD.ordinal()] = 3;
    }
}
