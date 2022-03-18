package com.ss.android.lark.todo.impl.features.chatlist.mvvm;

import com.ss.android.lark.todo.impl.features.common.helper.OperationToastHelper;
import com.ss.android.lark.todo.impl.features.mainview.entity.TodoFetchStatus;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.chatlist.mvvm.a */
public final /* synthetic */ class C56321a {

    /* renamed from: a */
    public static final /* synthetic */ int[] f139365a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f139366b;

    static {
        int[] iArr = new int[TodoFetchStatus.values().length];
        f139365a = iArr;
        iArr[TodoFetchStatus.LOADING.ordinal()] = 1;
        iArr[TodoFetchStatus.FIRST_PAGE_FAILED.ordinal()] = 2;
        int[] iArr2 = new int[OperationToastHelper.ToastType.values().length];
        f139366b = iArr2;
        iArr2[OperationToastHelper.ToastType.SUCCESS.ordinal()] = 1;
        iArr2[OperationToastHelper.ToastType.FAIL.ordinal()] = 2;
        iArr2[OperationToastHelper.ToastType.PROMPT.ordinal()] = 3;
    }
}
