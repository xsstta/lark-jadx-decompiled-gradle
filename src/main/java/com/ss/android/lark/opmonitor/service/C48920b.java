package com.ss.android.lark.opmonitor.service;

import com.ss.android.lark.opmonitor.model.OPMonitorLevel;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.opmonitor.service.b */
public final /* synthetic */ class C48920b {

    /* renamed from: a */
    public static final /* synthetic */ int[] f122900a;

    static {
        int[] iArr = new int[OPMonitorLevel.values().length];
        f122900a = iArr;
        iArr[OPMonitorLevel.TRACE.ordinal()] = 1;
        iArr[OPMonitorLevel.NORMAL.ordinal()] = 2;
        iArr[OPMonitorLevel.WARN.ordinal()] = 3;
        iArr[OPMonitorLevel.ERROR.ordinal()] = 4;
        iArr[OPMonitorLevel.FATAL.ordinal()] = 5;
    }
}
