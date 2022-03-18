package com.ss.android.lark.todo.impl.features.mainview.mvvm;

import com.ss.android.lark.todo.impl.features.common.helper.OperationToastHelper;
import com.ss.android.lark.todo.impl.features.mainview.entity.TodoFetchStatus;
import com.ss.android.lark.todo.impl.features.mainview.entity.TodoFilterType;
import com.ss.android.lark.todo.impl.features.mainview.mvvm.TodoMainFragment;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.mainview.mvvm.c */
public final /* synthetic */ class C56856c {

    /* renamed from: a */
    public static final /* synthetic */ int[] f140427a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f140428b;

    /* renamed from: c */
    public static final /* synthetic */ int[] f140429c;

    /* renamed from: d */
    public static final /* synthetic */ int[] f140430d;

    /* renamed from: e */
    public static final /* synthetic */ int[] f140431e;

    /* renamed from: f */
    public static final /* synthetic */ int[] f140432f;

    /* renamed from: g */
    public static final /* synthetic */ int[] f140433g;

    static {
        int[] iArr = new int[TodoMainFragment.MenuItem.values().length];
        f140427a = iArr;
        iArr[TodoMainFragment.MenuItem.SORT.ordinal()] = 1;
        iArr[TodoMainFragment.MenuItem.SETTING.ordinal()] = 2;
        iArr[TodoMainFragment.MenuItem.HELP_CENTER.ordinal()] = 3;
        int[] iArr2 = new int[TodoFetchStatus.values().length];
        f140428b = iArr2;
        iArr2[TodoFetchStatus.LOADING.ordinal()] = 1;
        iArr2[TodoFetchStatus.FIRST_PAGE_FAILED.ordinal()] = 2;
        int[] iArr3 = new int[TodoFilterType.values().length];
        f140429c = iArr3;
        iArr3[TodoFilterType.COMPLETED.ordinal()] = 1;
        iArr3[TodoFilterType.FROM_DOCS.ordinal()] = 2;
        int[] iArr4 = new int[TodoFilterType.values().length];
        f140430d = iArr4;
        iArr4[TodoFilterType.COMPLETED.ordinal()] = 1;
        iArr4[TodoFilterType.FROM_DOCS.ordinal()] = 2;
        int[] iArr5 = new int[TodoFilterType.values().length];
        f140431e = iArr5;
        iArr5[TodoFilterType.COMPLETED.ordinal()] = 1;
        iArr5[TodoFilterType.FROM_DOCS.ordinal()] = 2;
        int[] iArr6 = new int[TodoFilterType.values().length];
        f140432f = iArr6;
        iArr6[TodoFilterType.ALL.ordinal()] = 1;
        iArr6[TodoFilterType.ASSIGN_FROM_ME.ordinal()] = 2;
        iArr6[TodoFilterType.ASSIGN_TO_ME.ordinal()] = 3;
        iArr6[TodoFilterType.COMPLETED.ordinal()] = 4;
        iArr6[TodoFilterType.FOLLOWED.ordinal()] = 5;
        iArr6[TodoFilterType.FROM_DOCS.ordinal()] = 6;
        int[] iArr7 = new int[OperationToastHelper.ToastType.values().length];
        f140433g = iArr7;
        iArr7[OperationToastHelper.ToastType.SUCCESS.ordinal()] = 1;
        iArr7[OperationToastHelper.ToastType.FAIL.ordinal()] = 2;
        iArr7[OperationToastHelper.ToastType.PROMPT.ordinal()] = 3;
    }
}
