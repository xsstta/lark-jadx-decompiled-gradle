package com.ss.android.lark.todo.impl.features.common.helper;

import com.ss.android.lark.todo.impl.features.common.helper.OperationToastHelper;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.common.helper.d */
public final /* synthetic */ class C56334d {

    /* renamed from: a */
    public static final /* synthetic */ int[] f139402a;

    static {
        int[] iArr = new int[OperationToastHelper.ToastType.values().length];
        f139402a = iArr;
        iArr[OperationToastHelper.ToastType.SUCCESS.ordinal()] = 1;
        iArr[OperationToastHelper.ToastType.FAIL.ordinal()] = 2;
        iArr[OperationToastHelper.ToastType.PROMPT.ordinal()] = 3;
    }
}
