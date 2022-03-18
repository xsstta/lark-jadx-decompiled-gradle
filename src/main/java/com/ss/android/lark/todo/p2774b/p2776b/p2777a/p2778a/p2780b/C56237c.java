package com.ss.android.lark.todo.p2774b.p2776b.p2777a.p2778a.p2780b;

import android.os.Handler;
import android.os.Message;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.b.b.a.a.b.c */
public final class C56237c implements Handler.Callback {

    /* renamed from: a */
    private final /* synthetic */ Function1 f139180a;

    C56237c(Function1 function1) {
        this.f139180a = function1;
    }

    public final /* synthetic */ boolean handleMessage(Message message) {
        Intrinsics.checkParameterIsNotNull(message, "p0");
        Object invoke = this.f139180a.invoke(message);
        Intrinsics.checkExpressionValueIsNotNull(invoke, "invoke(...)");
        return ((Boolean) invoke).booleanValue();
    }
}
