package com.ss.android.lark.todo.impl.features.common.share.p2803a;

import com.ss.android.lark.todo.impl.features.common.share.entity.ShareStatus;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.impl.features.common.share.a.c */
public final /* synthetic */ class C56339c {

    /* renamed from: a */
    public static final /* synthetic */ int[] f139409a;

    static {
        int[] iArr = new int[ShareStatus.values().length];
        f139409a = iArr;
        iArr[ShareStatus.NO_LOADING.ordinal()] = 1;
        iArr[ShareStatus.SHARE_LOADING.ordinal()] = 2;
        iArr[ShareStatus.SHARE_SUCCESS.ordinal()] = 3;
    }
}
