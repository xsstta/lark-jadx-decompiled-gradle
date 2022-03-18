package com.ss.android.lark.mm.module.list.base;

import com.ss.android.lark.mm.module.list.control.MmListControl;
import com.ss.android.lark.mm.module.list.data.MmListRankType;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.list.base.d */
public final /* synthetic */ class C46373d {

    /* renamed from: a */
    public static final /* synthetic */ int[] f116788a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f116789b;

    /* renamed from: c */
    public static final /* synthetic */ int[] f116790c;

    /* renamed from: d */
    public static final /* synthetic */ int[] f116791d;

    static {
        int[] iArr = new int[MmListRankType.values().length];
        f116788a = iArr;
        iArr[MmListRankType.SHARE_TIME.ordinal()] = 1;
        iArr[MmListRankType.CREATE_TIME.ordinal()] = 2;
        iArr[MmListRankType.OPEN_TIME.ordinal()] = 3;
        int[] iArr2 = new int[MmListControl.DataSource.values().length];
        f116789b = iArr2;
        iArr2[MmListControl.DataSource.MyList.ordinal()] = 1;
        iArr2[MmListControl.DataSource.ShareList.ordinal()] = 2;
        int[] iArr3 = new int[MmListControl.DataSource.values().length];
        f116790c = iArr3;
        iArr3[MmListControl.DataSource.HomeList.ordinal()] = 1;
        iArr3[MmListControl.DataSource.MyList.ordinal()] = 2;
        iArr3[MmListControl.DataSource.ShareList.ordinal()] = 3;
        int[] iArr4 = new int[MmListControl.DataSource.values().length];
        f116791d = iArr4;
        iArr4[MmListControl.DataSource.MyList.ordinal()] = 1;
        iArr4[MmListControl.DataSource.HomeList.ordinal()] = 2;
        iArr4[MmListControl.DataSource.ShareList.ordinal()] = 3;
        iArr4[MmListControl.DataSource.TrashList.ordinal()] = 4;
    }
}
