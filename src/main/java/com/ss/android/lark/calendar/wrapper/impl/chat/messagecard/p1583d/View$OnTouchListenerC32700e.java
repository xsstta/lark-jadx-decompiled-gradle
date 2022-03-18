package com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.p1583d;

import android.view.MotionEvent;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.calendar.wrapper.impl.chat.messagecard.d.e */
public final class View$OnTouchListenerC32700e implements View.OnTouchListener {

    /* renamed from: a */
    private final /* synthetic */ Function2 f83879a;

    public View$OnTouchListenerC32700e(Function2 kVar) {
        this.f83879a = kVar;
    }

    public final /* synthetic */ boolean onTouch(View view, MotionEvent motionEvent) {
        Object invoke = this.f83879a.invoke(view, motionEvent);
        Intrinsics.checkExpressionValueIsNotNull(invoke, "invoke(...)");
        return ((Boolean) invoke).booleanValue();
    }
}
