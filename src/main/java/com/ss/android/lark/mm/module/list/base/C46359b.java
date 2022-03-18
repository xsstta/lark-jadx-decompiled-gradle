package com.ss.android.lark.mm.module.list.base;

import com.ss.android.lark.mm.module.list.control.MmListControl;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.list.base.b */
public final /* synthetic */ class C46359b {

    /* renamed from: a */
    public static final /* synthetic */ int[] f116767a;

    static {
        int[] iArr = new int[MmListControl.DataError.values().length];
        f116767a = iArr;
        iArr[MmListControl.DataError.None.ordinal()] = 1;
        iArr[MmListControl.DataError.EmptyMyList.ordinal()] = 2;
        iArr[MmListControl.DataError.EmptyHomeList.ordinal()] = 3;
        iArr[MmListControl.DataError.EmptyShareList.ordinal()] = 4;
        iArr[MmListControl.DataError.EmptyTrashList.ordinal()] = 5;
        iArr[MmListControl.DataError.EmptyAndRetry.ordinal()] = 6;
        iArr[MmListControl.DataError.EmptySearch.ordinal()] = 7;
    }
}
