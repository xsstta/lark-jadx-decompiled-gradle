package com.ss.android.lark.mm.module.detail.banner;

import com.ss.android.lark.mm.module.detail.baseinfo.ReviewStatus;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.mm.module.detail.banner.b */
public final /* synthetic */ class C45985b {

    /* renamed from: a */
    public static final /* synthetic */ int[] f115883a;

    static {
        int[] iArr = new int[ReviewStatus.values().length];
        f115883a = iArr;
        iArr[ReviewStatus.AppealFailed.ordinal()] = 1;
        iArr[ReviewStatus.NoAuth.ordinal()] = 2;
        iArr[ReviewStatus.ToAppeal.ordinal()] = 3;
        iArr[ReviewStatus.Passed.ordinal()] = 4;
    }
}
