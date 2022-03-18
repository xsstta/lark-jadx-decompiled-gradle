package com.bytedance.ee.bear.wiki.browser.plugin;

import com.bytedance.ee.bear.contract.AccountService;
import io.reactivex.functions.Function;

/* renamed from: com.bytedance.ee.bear.wiki.browser.plugin.-$$Lambda$k8zqxeJuQnfe9U-7SpU-sxQ1mrw  reason: invalid class name */
/* compiled from: lambda */
public final /* synthetic */ class $$Lambda$k8zqxeJuQnfe9U7SpUsxQ1mrw implements Function {
    public static final /* synthetic */ $$Lambda$k8zqxeJuQnfe9U7SpUsxQ1mrw INSTANCE = new $$Lambda$k8zqxeJuQnfe9U7SpUsxQ1mrw();

    private /* synthetic */ $$Lambda$k8zqxeJuQnfe9U7SpUsxQ1mrw() {
    }

    @Override // io.reactivex.functions.Function
    public final Object apply(Object obj) {
        return ((AccountService) obj).findLoginUser();
    }
}
