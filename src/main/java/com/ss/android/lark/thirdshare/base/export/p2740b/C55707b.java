package com.ss.android.lark.thirdshare.base.export.p2740b;

import android.animation.ValueAnimator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.thirdshare.base.export.b.b */
public final class C55707b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private final /* synthetic */ Function1 f137402a;

    public C55707b(Function1 function1) {
        this.f137402a = function1;
    }

    public final /* synthetic */ void onAnimationUpdate(ValueAnimator valueAnimator) {
        Intrinsics.checkExpressionValueIsNotNull(this.f137402a.invoke(valueAnimator), "invoke(...)");
    }
}
