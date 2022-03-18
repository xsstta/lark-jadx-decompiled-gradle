package com.ss.android.lark.searchcommon.view.binder;

import com.ss.android.lark.searchcommon.dto.OpenAppState;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.view.binder.w */
public final /* synthetic */ class C54001w {

    /* renamed from: a */
    public static final /* synthetic */ int[] f133688a;

    static {
        int[] iArr = new int[OpenAppState.values().length];
        f133688a = iArr;
        iArr[OpenAppState.TENANT_FORBIDDEN.ordinal()] = 1;
        iArr[OpenAppState.PLATFORM_FORBIDDEN.ordinal()] = 2;
        iArr[OpenAppState.DEVELOPER_FORBIDDEN.ordinal()] = 3;
        iArr[OpenAppState.USER_INVISIBLE.ordinal()] = 4;
        iArr[OpenAppState.APP_NEED_PAY_USE.ordinal()] = 5;
        iArr[OpenAppState.OFFLINE.ordinal()] = 6;
        iArr[OpenAppState.APP_DELETED.ordinal()] = 7;
    }
}
