package com.ss.android.lark.chatsetting.impl.common_view.base;

import android.widget.CompoundButton;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 16})
/* renamed from: com.ss.android.lark.chatsetting.impl.common_view.base.d */
public final class C34534d implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    private final /* synthetic */ Function2 f89184a;

    public C34534d(Function2 kVar) {
        this.f89184a = kVar;
    }

    public final /* synthetic */ void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        Intrinsics.checkExpressionValueIsNotNull(this.f89184a.invoke(compoundButton, Boolean.valueOf(z)), "invoke(...)");
    }
}
