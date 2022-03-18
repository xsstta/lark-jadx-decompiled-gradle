package com.bytedance.ee.bear.wikiv2.more_item;

import com.bytedance.ee.bear.browser.plugin.AbstractC4941c;
import com.bytedance.ee.bear.browser.plugin.AbstractC4942d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.wikiv2.more_item.a */
final class C12336a implements AbstractC4942d {

    /* renamed from: a */
    private final /* synthetic */ Function1 f33115a;

    C12336a(Function1 function1) {
        this.f33115a = function1;
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4942d
    public final /* synthetic */ void onPluginFound(AbstractC4941c cVar) {
        Intrinsics.checkExpressionValueIsNotNull(this.f33115a.invoke(cVar), "invoke(...)");
    }
}
