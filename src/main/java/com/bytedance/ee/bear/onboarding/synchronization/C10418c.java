package com.bytedance.ee.bear.onboarding.synchronization;

import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.onboarding.synchronization.c */
final class C10418c implements Consumer {

    /* renamed from: a */
    private final /* synthetic */ Function1 f27991a;

    C10418c(Function1 function1) {
        this.f27991a = function1;
    }

    @Override // io.reactivex.functions.Consumer
    public final /* synthetic */ void accept(Object obj) {
        Intrinsics.checkExpressionValueIsNotNull(this.f27991a.invoke(obj), "invoke(...)");
    }
}
