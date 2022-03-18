package com.ss.android.vc.meeting.module.p3123g;

import com.ss.android.vc.entity.MeetingSecuritySetting;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.vc.meeting.module.g.f */
public final /* synthetic */ class C61888f {

    /* renamed from: a */
    public static final /* synthetic */ int[] f155377a;

    static {
        int[] iArr = new int[MeetingSecuritySetting.SecurityLevel.values().length];
        f155377a = iArr;
        iArr[MeetingSecuritySetting.SecurityLevel.PUBLIC.ordinal()] = 1;
        iArr[MeetingSecuritySetting.SecurityLevel.CONTACTS_AND_GROUP.ordinal()] = 2;
        iArr[MeetingSecuritySetting.SecurityLevel.TENANT.ordinal()] = 3;
        iArr[MeetingSecuritySetting.SecurityLevel.ONLY_HOST.ordinal()] = 4;
    }
}
