package com.ss.android.lark.magic.provider.impl;

import android.app.Activity;
import android.content.Context;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.ss.android.lark.biz.core.api.MagicViewContainer;
import com.ss.android.lark.magic.C41707a;
import com.ss.android.lark.magic.manis.IMagicProxy;
import com.ss.android.lark.magic.p2152b.AbstractC41708a;
import com.ss.android.lark.magic.provider.IOpener;
import com.ss.android.lark.magic.provider.TriggerResponse;
import com.ss.android.lark.magic.service.MagicLifecycleService;
import com.ss.android.lark.p2909v.C57897d;
import ee.android.framework.manis.C68183b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0004H\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/ss/android/lark/magic/provider/impl/GlobalOpener;", "Lcom/ss/android/lark/magic/provider/IOpener;", "()V", "globalScenarioId", "", "gson", "Lcom/google/gson/Gson;", "kotlin.jvm.PlatformType", "dismiss", "", "scenarioId", "showMagic", "", "triggerResponse", "Lcom/ss/android/lark/magic/provider/TriggerResponse;", "core_magic_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.ss.android.lark.magic.d.a.b */
public final class GlobalOpener implements IOpener {

    /* renamed from: a */
    public static final GlobalOpener f105949a = new GlobalOpener();

    /* renamed from: b */
    private static final Gson f105950b = new GsonBuilder().disableHtmlEscaping().create();

    @Override // com.ss.android.lark.magic.provider.IOpener
    /* renamed from: a */
    public void mo150022a(String str) {
        Intrinsics.checkParameterIsNotNull(str, "scenarioId");
    }

    private GlobalOpener() {
    }

    @Override // com.ss.android.lark.magic.provider.IOpener
    /* renamed from: a */
    public boolean mo150025a(TriggerResponse eVar) {
        Intrinsics.checkParameterIsNotNull(eVar, "triggerResponse");
        if (!eVar.mo150039a()) {
            return false;
        }
        eVar.mo150036a("global_magic");
        AbstractC41708a b = C41707a.m165544b();
        Intrinsics.checkExpressionValueIsNotNull(b, "MagicModule.getDependency()");
        Activity j = b.mo150007j();
        if (j != null) {
            eVar.mo150035a(new MagicViewContainer(j));
            return FeelGoodMagicProvider.f105933b.mo150026a().mo150025a(eVar);
        }
        AbstractC41708a b2 = C41707a.m165544b();
        Intrinsics.checkExpressionValueIsNotNull(b2, "MagicModule.getDependency()");
        Context a = b2.mo149998a();
        if (C57897d.m224697b(a)) {
            return false;
        }
        IMagicProxy iMagicProxy = (IMagicProxy) C68183b.m264839a().mo237086a(a, IMagicProxy.class);
        if (iMagicProxy == null) {
            return true;
        }
        MagicLifecycleService.f105961b.mo150060a().mo150046a(iMagicProxy, eVar);
        String json = f105950b.toJson(eVar);
        Intrinsics.checkExpressionValueIsNotNull(json, "responseString");
        iMagicProxy.showMagic(json);
        return true;
    }
}
