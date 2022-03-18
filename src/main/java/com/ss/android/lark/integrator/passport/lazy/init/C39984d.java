package com.ss.android.lark.integrator.passport.lazy.init;

import com.ss.android.lark.http.model.http.HttpMethod;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.integrator.passport.lazy.init.d */
public final /* synthetic */ class C39984d {

    /* renamed from: a */
    public static final /* synthetic */ int[] f101701a;

    static {
        int[] iArr = new int[HttpMethod.values().length];
        f101701a = iArr;
        iArr[HttpMethod.GET.ordinal()] = 1;
        iArr[HttpMethod.POST.ordinal()] = 2;
        iArr[HttpMethod.PATCH.ordinal()] = 3;
        iArr[HttpMethod.DELETE.ordinal()] = 4;
    }
}
