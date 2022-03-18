package com.bytedance.ee.bear.document.documentinfo;

import com.bytedance.ee.bear.browser.plugin.AbstractC4941c;
import com.bytedance.ee.bear.browser.plugin.AbstractC4942d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, mo238835k = 3, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.document.documentinfo.f */
public final class C5750f implements AbstractC4942d {

    /* renamed from: a */
    private final /* synthetic */ Function1 f16220a;

    C5750f(Function1 function1) {
        this.f16220a = function1;
    }

    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4942d
    public final /* synthetic */ void onPluginFound(AbstractC4941c cVar) {
        Intrinsics.checkExpressionValueIsNotNull(this.f16220a.invoke(cVar), "invoke(...)");
    }
}
