package com.bytedance.ee.bear.wikiv2.browser.plugin;

import com.bytedance.ee.bear.browser.plugin.C4943e;
import com.bytedance.ee.bear.browser.plugin.C4946h;
import com.bytedance.ee.bear.contract.route.parcelable.WikiPluginsProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Lcom/bytedance/ee/bear/wikiv2/browser/plugin/WikiPluginsProviderImpl;", "Lcom/bytedance/ee/bear/contract/route/parcelable/WikiPluginsProvider;", "()V", "getPluginList", "Lcom/bytedance/ee/bear/browser/plugin/PluginList;", "host", "Lcom/bytedance/ee/bear/browser/plugin/PluginHost;", "wiki-implv2_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.ee.bear.wikiv2.browser.plugin.c */
public final class WikiPluginsProviderImpl implements WikiPluginsProvider {
    @Override // com.bytedance.ee.bear.browser.plugin.AbstractC4948i
    /* renamed from: a */
    public C4946h mo17011a(C4943e eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "host");
        C4946h a = C12211d.m50843a(eVar);
        Intrinsics.checkExpressionValueIsNotNull(a, "WikiPluginsV2.create(host)");
        return a;
    }
}
