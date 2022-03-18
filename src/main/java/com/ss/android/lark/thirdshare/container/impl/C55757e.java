package com.ss.android.lark.thirdshare.container.impl;

import com.ss.android.lark.utils.ApiUtils;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.thirdshare.container.impl.e */
final class C55757e implements ApiUtils.AbstractC57748a {

    /* renamed from: a */
    private final /* synthetic */ Function1 f137586a;

    C55757e(Function1 function1) {
        this.f137586a = function1;
    }

    @Override // com.ss.android.lark.utils.ApiUtils.AbstractC57748a
    public final /* synthetic */ void consume(Object obj) {
        Intrinsics.checkExpressionValueIsNotNull(this.f137586a.invoke(obj), "invoke(...)");
    }
}
