package com.ss.android.lark.mm.module.record.detail.toolbar;

import com.ss.android.lark.mm.module.record.MmRecordManager;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.record.detail.toolbar.h */
public final /* synthetic */ class C46955h {

    /* renamed from: a */
    public static final /* synthetic */ int[] f118184a;

    static {
        int[] iArr = new int[MmRecordManager.RecordState.values().length];
        f118184a = iArr;
        iArr[MmRecordManager.RecordState.RECORDING.ordinal()] = 1;
        iArr[MmRecordManager.RecordState.PAUSED.ordinal()] = 2;
        iArr[MmRecordManager.RecordState.DISABLED_BY_PHONE.ordinal()] = 3;
        iArr[MmRecordManager.RecordState.STOPPED.ordinal()] = 4;
    }
}
