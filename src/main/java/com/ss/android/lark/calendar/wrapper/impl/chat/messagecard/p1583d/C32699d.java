package com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.p1583d;

import android.os.Handler;
import android.os.Message;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.d.d */
public final class C32699d implements Handler.Callback {

    /* renamed from: a */
    private final /* synthetic */ Function1 f83878a;

    C32699d(Function1 function1) {
        this.f83878a = function1;
    }

    public final /* synthetic */ boolean handleMessage(Message message) {
        Intrinsics.checkParameterIsNotNull(message, "p0");
        Object invoke = this.f83878a.invoke(message);
        Intrinsics.checkExpressionValueIsNotNull(invoke, "invoke(...)");
        return ((Boolean) invoke).booleanValue();
    }
}
