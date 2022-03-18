package com.ss.android.lark.appreciablelib;

import com.bytedance.common.utility.NetworkUtils;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.appreciablelib.e */
public final /* synthetic */ class C29208e {

    /* renamed from: a */
    public static final /* synthetic */ int[] f73127a;

    static {
        int[] iArr = new int[NetworkUtils.NetworkType.values().length];
        f73127a = iArr;
        iArr[NetworkUtils.NetworkType.UNKNOWN.ordinal()] = 1;
        iArr[NetworkUtils.NetworkType.NONE.ordinal()] = 2;
        iArr[NetworkUtils.NetworkType.MOBILE_4G.ordinal()] = 3;
        iArr[NetworkUtils.NetworkType.WIFI.ordinal()] = 4;
    }
}
