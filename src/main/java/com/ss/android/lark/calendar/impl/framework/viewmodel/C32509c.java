package com.ss.android.lark.calendar.impl.framework.viewmodel;

import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.impl.framework.viewmodel.c */
public final class C32509c implements Consumer {

    /* renamed from: a */
    private final /* synthetic */ Function1 f83412a;

    C32509c(Function1 function1) {
        this.f83412a = function1;
    }

    @Override // io.reactivex.functions.Consumer
    public final /* synthetic */ void accept(Object obj) {
        Intrinsics.checkExpressionValueIsNotNull(this.f83412a.invoke(obj), "invoke(...)");
    }
}
