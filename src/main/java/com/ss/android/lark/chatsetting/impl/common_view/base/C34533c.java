package com.ss.android.lark.chatsetting.impl.common_view.base;

import android.widget.CompoundButton;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.common_view.base.c */
final class C34533c implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    private final /* synthetic */ Function2 f89183a;

    C34533c(Function2 kVar) {
        this.f89183a = kVar;
    }

    public final /* synthetic */ void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        Intrinsics.checkExpressionValueIsNotNull(this.f89183a.invoke(compoundButton, Boolean.valueOf(z)), "invoke(...)");
    }
}
