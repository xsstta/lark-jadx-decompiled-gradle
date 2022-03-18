package com.ss.android.lark.mm.statistics.hitpoint;

import com.ss.android.lark.mm.module.detail.baseinfo.MmBaseInfo;
import com.ss.android.lark.mm.module.list.data.MinutesSummaryData;

/* renamed from: com.ss.android.lark.mm.statistics.hitpoint.h */
public final class C47085h {
    /* renamed from: a */
    public static C47084f m186430a(MmBaseInfo mmBaseInfo) {
        if (mmBaseInfo == null) {
            return null;
        }
        return new C47084f(mmBaseInfo.getMeetingId(), mmBaseInfo.isOwner(), mmBaseInfo.getObjectToken(), mmBaseInfo.getObjectType(), mmBaseInfo.isCanModify());
    }

    /* renamed from: a */
    public static C47084f m186431a(MinutesSummaryData minutesSummaryData) {
        if (minutesSummaryData == null) {
            return null;
        }
        int i = MmBaseInfo.MMObjectType.UNKNOWN.value;
        if (minutesSummaryData.getObjectType() != null) {
            i = minutesSummaryData.getObjectType().intValue();
        }
        return new C47084f(minutesSummaryData.getMeetingId(), minutesSummaryData.isOwner(), minutesSummaryData.getObjectToken(), i, false);
    }
}
