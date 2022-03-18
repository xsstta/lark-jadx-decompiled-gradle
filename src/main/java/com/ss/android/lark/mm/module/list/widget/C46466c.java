package com.ss.android.lark.mm.module.list.widget;

import com.ss.android.lark.mm.module.list.control.MmListControl;
import com.ss.android.lark.mm.module.record.MmRecordManager;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.list.widget.c */
public final /* synthetic */ class C46466c {

    /* renamed from: a */
    public static final /* synthetic */ int[] f117009a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f117010b;

    /* renamed from: c */
    public static final /* synthetic */ int[] f117011c;

    /* renamed from: d */
    public static final /* synthetic */ int[] f117012d;

    /* renamed from: e */
    public static final /* synthetic */ int[] f117013e;

    static {
        int[] iArr = new int[MmListControl.DataSource.values().length];
        f117009a = iArr;
        iArr[MmListControl.DataSource.HomeList.ordinal()] = 1;
        iArr[MmListControl.DataSource.MyList.ordinal()] = 2;
        iArr[MmListControl.DataSource.ShareList.ordinal()] = 3;
        iArr[MmListControl.DataSource.TrashList.ordinal()] = 4;
        int[] iArr2 = new int[MmListControl.DataSource.values().length];
        f117010b = iArr2;
        iArr2[MmListControl.DataSource.HomeList.ordinal()] = 1;
        iArr2[MmListControl.DataSource.MyList.ordinal()] = 2;
        iArr2[MmListControl.DataSource.ShareList.ordinal()] = 3;
        int[] iArr3 = new int[MmRecordManager.RecordState.values().length];
        f117011c = iArr3;
        iArr3[MmRecordManager.RecordState.STOPPED.ordinal()] = 1;
        int[] iArr4 = new int[MmRecordManager.RecordState.values().length];
        f117012d = iArr4;
        iArr4[MmRecordManager.RecordState.STOPPED.ordinal()] = 1;
        iArr4[MmRecordManager.RecordState.RECORDING.ordinal()] = 2;
        iArr4[MmRecordManager.RecordState.PAUSED.ordinal()] = 3;
        iArr4[MmRecordManager.RecordState.DISABLED_BY_PHONE.ordinal()] = 4;
        int[] iArr5 = new int[MmListControl.DataSource.values().length];
        f117013e = iArr5;
        iArr5[MmListControl.DataSource.HomeList.ordinal()] = 1;
        iArr5[MmListControl.DataSource.MyList.ordinal()] = 2;
    }
}
