package com.ss.android.lark.passport.infra.base.network.p2432b;

import com.ss.android.lark.http.model.http.HttpMethod;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.passport.infra.base.network.b.c */
public final /* synthetic */ class C49072c {

    /* renamed from: a */
    public static final /* synthetic */ int[] f123239a;

    static {
        int[] iArr = new int[HttpMethod.values().length];
        f123239a = iArr;
        iArr[HttpMethod.GET.ordinal()] = 1;
        iArr[HttpMethod.POST.ordinal()] = 2;
        iArr[HttpMethod.DELETE.ordinal()] = 3;
        iArr[HttpMethod.PATCH.ordinal()] = 4;
    }
}
