package com.ss.android.vc.statistics.p3181b;

import com.ss.android.vc.meeting.module.presetting.MeetingPreSettingEvent;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.statistics.b.w */
public final /* synthetic */ class C63721w {

    /* renamed from: a */
    public static final /* synthetic */ int[] f160858a;

    static {
        int[] iArr = new int[MeetingPreSettingEvent.SecurityLevel.values().length];
        f160858a = iArr;
        iArr[MeetingPreSettingEvent.SecurityLevel.ANYONE.ordinal()] = 1;
        iArr[MeetingPreSettingEvent.SecurityLevel.ORGANIZERCOMPANY.ordinal()] = 2;
        iArr[MeetingPreSettingEvent.SecurityLevel.EVENTGUEST.ordinal()] = 3;
    }
}
