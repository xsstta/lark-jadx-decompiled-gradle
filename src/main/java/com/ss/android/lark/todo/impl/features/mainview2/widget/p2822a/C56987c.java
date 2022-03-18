package com.ss.android.lark.todo.impl.features.mainview2.widget.p2822a;

import com.ss.android.lark.todo.impl.features.common.helper.OperationToastHelper;
import com.ss.android.lark.todo.impl.features.mainview.entity.TodoFetchStatus;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.mainview2.widget.a.c */
public final /* synthetic */ class C56987c {

    /* renamed from: a */
    public static final /* synthetic */ int[] f140645a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f140646b;

    static {
        int[] iArr = new int[TodoFetchStatus.values().length];
        f140645a = iArr;
        iArr[TodoFetchStatus.LOADING.ordinal()] = 1;
        iArr[TodoFetchStatus.FIRST_PAGE_FAILED.ordinal()] = 2;
        int[] iArr2 = new int[OperationToastHelper.ToastType.values().length];
        f140646b = iArr2;
        iArr2[OperationToastHelper.ToastType.SUCCESS.ordinal()] = 1;
        iArr2[OperationToastHelper.ToastType.FAIL.ordinal()] = 2;
        iArr2[OperationToastHelper.ToastType.PROMPT.ordinal()] = 3;
    }
}
