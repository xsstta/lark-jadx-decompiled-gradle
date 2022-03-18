package com.ss.android.lark.pin.impl.v3.binder.p2472a;

import android.os.Handler;
import android.os.Message;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.pin.impl.v3.binder.a.m */
public final class C51563m implements Handler.Callback {

    /* renamed from: a */
    private final /* synthetic */ Function1 f128348a;

    C51563m(Function1 function1) {
        this.f128348a = function1;
    }

    public final /* synthetic */ boolean handleMessage(Message message) {
        Object invoke = this.f128348a.invoke(message);
        Intrinsics.checkExpressionValueIsNotNull(invoke, "invoke(...)");
        return ((Boolean) invoke).booleanValue();
    }
}
