package com.ss.android.lark.chat.chatwindow.biz.plugin;

import com.ss.android.lark.chat.base.model.p1602a.AbstractC32919a;
import com.ss.android.lark.chat.base.model.p1602a.C32920b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chat.chatwindow.biz.plugin.d */
final class C33078d implements C32920b.AbstractC32921a {

    /* renamed from: a */
    private final /* synthetic */ Function1 f85192a;

    C33078d(Function1 function1) {
        this.f85192a = function1;
    }

    @Override // com.ss.android.lark.chat.base.model.p1602a.C32920b.AbstractC32921a
    public final /* synthetic */ boolean onAction(AbstractC32919a aVar) {
        Object invoke = this.f85192a.invoke(aVar);
        Intrinsics.checkExpressionValueIsNotNull(invoke, "invoke(...)");
        return ((Boolean) invoke).booleanValue();
    }
}
