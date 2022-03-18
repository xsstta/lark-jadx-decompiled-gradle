package com.bytedance.ee.bear.facade.common.widget.recyclerview;

import com.scwang.smartrefresh.layout.constant.RefreshState;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.facade.common.widget.recyclerview.b */
public final /* synthetic */ class C7742b {

    /* renamed from: a */
    public static final /* synthetic */ int[] f21000a;

    static {
        int[] iArr = new int[RefreshState.values().length];
        f21000a = iArr;
        iArr[RefreshState.None.ordinal()] = 1;
        iArr[RefreshState.PullDownToRefresh.ordinal()] = 2;
        iArr[RefreshState.RefreshFinish.ordinal()] = 3;
        iArr[RefreshState.Refreshing.ordinal()] = 4;
        iArr[RefreshState.RefreshReleased.ordinal()] = 5;
        iArr[RefreshState.ReleaseToRefresh.ordinal()] = 6;
        iArr[RefreshState.ReleaseToTwoLevel.ordinal()] = 7;
        iArr[RefreshState.Loading.ordinal()] = 8;
    }
}
