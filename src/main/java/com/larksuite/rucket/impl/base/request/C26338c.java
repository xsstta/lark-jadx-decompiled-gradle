package com.larksuite.rucket.impl.base.request;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.larksuite.rucket.impl.base.request.c */
public final /* synthetic */ class C26338c {

    /* renamed from: a */
    public static final /* synthetic */ int[] f64992a;

    static {
        int[] iArr = new int[RequestStrategy.values().length];
        f64992a = iArr;
        iArr[RequestStrategy.PREFER_CACHE.ordinal()] = 1;
        iArr[RequestStrategy.FORCE_LOCAL.ordinal()] = 2;
        iArr[RequestStrategy.PREFER_NETWORK.ordinal()] = 3;
    }
}
