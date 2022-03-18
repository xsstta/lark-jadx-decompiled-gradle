package com.ss.android.lark.searchcommon.view;

import android.view.KeyEvent;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.searchcommon.view.e */
public final class C54006e implements TextView.OnEditorActionListener {

    /* renamed from: a */
    private final /* synthetic */ Function3 f133707a;

    C54006e(Function3 oVar) {
        this.f133707a = oVar;
    }

    public final /* synthetic */ boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        Object invoke = this.f133707a.invoke(textView, Integer.valueOf(i), keyEvent);
        Intrinsics.checkExpressionValueIsNotNull(invoke, "invoke(...)");
        return ((Boolean) invoke).booleanValue();
    }
}
