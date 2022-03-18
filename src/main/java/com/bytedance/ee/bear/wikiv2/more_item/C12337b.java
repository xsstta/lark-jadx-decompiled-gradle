package com.bytedance.ee.bear.wikiv2.more_item;

import com.bytedance.ee.bear.browser.plugin.AbstractC4941c;
import com.bytedance.ee.bear.browser.plugin.AbstractC4942d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.wikiv2.more_item.b */
final class C12337b implements AbstractC4942d {

    /* renamed from: a */
    private final /* synthetic */ Function1 f33116a;

    C12337b(Function1 function1) {
        this.f33116a = function1;
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4942d
    public final /* synthetic */ void onPluginFound(AbstractC4941c cVar) {
        Intrinsics.checkExpressionValueIsNotNull(this.f33116a.invoke(cVar), "invoke(...)");
    }
}
