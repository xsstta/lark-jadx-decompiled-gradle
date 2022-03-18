package com.ss.android.lark.pin.impl.v3.binder.p2472a;

import android.view.MotionEvent;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.pin.impl.v3.binder.a.n */
public final class View$OnTouchListenerC51564n implements View.OnTouchListener {

    /* renamed from: a */
    private final /* synthetic */ Function2 f128349a;

    public View$OnTouchListenerC51564n(Function2 kVar) {
        this.f128349a = kVar;
    }

    public final /* synthetic */ boolean onTouch(View view, MotionEvent motionEvent) {
        Object invoke = this.f128349a.invoke(view, motionEvent);
        Intrinsics.checkExpressionValueIsNotNull(invoke, "invoke(...)");
        return ((Boolean) invoke).booleanValue();
    }
}
