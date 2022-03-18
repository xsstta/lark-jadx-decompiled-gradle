package com.ss.android.lark.calendar.impl.features.events.edit;

import com.ss.android.lark.calendar.impl.features.events.edit.EditView;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.features.events.edit.i */
public final /* synthetic */ class C31865i {

    /* renamed from: a */
    public static final /* synthetic */ int[] f81213a;

    static {
        int[] iArr = new int[EditView.SaveType.values().length];
        f81213a = iArr;
        iArr[EditView.SaveType.ENABLE_SAVE.ordinal()] = 1;
        iArr[EditView.SaveType.DISABLE_SAVE_TOTALLY.ordinal()] = 2;
        iArr[EditView.SaveType.DISABLE_SAVE_WITH_TOAST.ordinal()] = 3;
    }
}
