package com.bytedance.ee.bear.doc.toolbar2;

import com.bytedance.ee.bear.contract.AccountService;
import io.reactivex.functions.Function;

/* renamed from: com.bytedance.ee.bear.doc.toolbar2.-$$Lambda$c$kt-09XSoWsUEb4Ugn2_gXX_1vec  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$c$kt09XSoWsUEb4Ugn2_gXX_1vec implements Function {
    public static final /* synthetic */ $$Lambda$c$kt09XSoWsUEb4Ugn2_gXX_1vec INSTANCE = new $$Lambda$c$kt09XSoWsUEb4Ugn2_gXX_1vec();

    private /* synthetic */ $$Lambda$c$kt09XSoWsUEb4Ugn2_gXX_1vec() {
    }

    @Override // io.reactivex.functions.Function
    public final Object apply(Object obj) {
        return ((AccountService) obj).findLoginUser();
    }
}
