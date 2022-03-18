package com.ss.android.lark.todo.p2774b.p2776b.p2777a.p2778a.p2780b;

import android.view.MotionEvent;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.todo.b.b.a.a.b.d */
public final class View$OnTouchListenerC56238d implements View.OnTouchListener {

    /* renamed from: a */
    private final /* synthetic */ Function2 f139181a;

    public View$OnTouchListenerC56238d(Function2 kVar) {
        this.f139181a = kVar;
    }

    public final /* synthetic */ boolean onTouch(View view, MotionEvent motionEvent) {
        Object invoke = this.f139181a.invoke(view, motionEvent);
        Intrinsics.checkExpressionValueIsNotNull(invoke, "invoke(...)");
        return ((Boolean) invoke).booleanValue();
    }
}
