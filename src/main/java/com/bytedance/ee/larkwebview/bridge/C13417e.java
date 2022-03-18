package com.bytedance.ee.larkwebview.bridge;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.bytedance.ee.larkwebview.bridge.e */
public final /* synthetic */ class C13417e {

    /* renamed from: a */
    public static final /* synthetic */ int[] f35366a;

    static {
        int[] iArr = new int[Status.values().length];
        f35366a = iArr;
        iArr[Status.SUCCESS.ordinal()] = 1;
        iArr[Status.PROGRESS.ordinal()] = 2;
        iArr[Status.FAILURE.ordinal()] = 3;
        iArr[Status.CANCEL.ordinal()] = 4;
        iArr[Status.TIMEOUT.ordinal()] = 5;
    }
}
