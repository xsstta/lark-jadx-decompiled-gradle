package com.ss.android.lark.mm.module.record;

import com.ss.android.lark.mm.module.record.MmRecordManager;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.record.c */
public final /* synthetic */ class C46873c {

    /* renamed from: a */
    public static final /* synthetic */ int[] f118025a;

    static {
        int[] iArr = new int[MmRecordManager.Action.values().length];
        f118025a = iArr;
        iArr[MmRecordManager.Action.ACTION_STAT_RECORDING.ordinal()] = 1;
        iArr[MmRecordManager.Action.ACTION_PAUSED.ordinal()] = 2;
        iArr[MmRecordManager.Action.ACTION_RESUME.ordinal()] = 3;
        iArr[MmRecordManager.Action.ACTION_STOPPED.ordinal()] = 4;
        iArr[MmRecordManager.Action.ACTION_INTERRUPTED_BY_PHONE.ordinal()] = 5;
        iArr[MmRecordManager.Action.ACTION_PHONE_END.ordinal()] = 6;
        iArr[MmRecordManager.Action.ACTION_WEAK_NETWORK.ordinal()] = 7;
    }
}
