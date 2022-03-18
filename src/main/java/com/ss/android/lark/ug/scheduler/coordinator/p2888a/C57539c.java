package com.ss.android.lark.ug.scheduler.coordinator.p2888a;

import com.ss.android.lark.ug.scheduler.common.entity.ReachPointState;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.ug.scheduler.coordinator.a.c */
public final /* synthetic */ class C57539c {

    /* renamed from: a */
    public static final /* synthetic */ int[] f141791a;

    static {
        int[] iArr = new int[ReachPointState.values().length];
        f141791a = iArr;
        iArr[ReachPointState.SHOW.ordinal()] = 1;
        iArr[ReachPointState.HIDE.ordinal()] = 2;
        iArr[ReachPointState.CONSUME.ordinal()] = 3;
        iArr[ReachPointState.REMOVE.ordinal()] = 4;
        iArr[ReachPointState.LEAVE.ordinal()] = 5;
    }
}
