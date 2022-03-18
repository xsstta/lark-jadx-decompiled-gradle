package com.bytedance.sdk.bridge;

import com.bytedance.news.common.service.manager.C20216d;
import com.bytedance.sdk.bridge.C20661b;
import com.bytedance.sdk.bridge.api.BridgeService;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\tH\u0007J\u0016\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u0015J\u0018\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00072\b\b\u0001\u0010\u0018\u001a\u00020\u0007J\u000e\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0001R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XD¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/bytedance/sdk/bridge/BridgeManager;", "", "()V", "DEFAULT_DEBUG", "", "DEFAULT_IGNORE_NAMESPACE", "DEFAULT_SCHEMA", "", "bridgeConfig", "Lcom/bytedance/sdk/bridge/BridgeConfig;", "getBridgeConfig", "()Lcom/bytedance/sdk/bridge/BridgeConfig;", "setBridgeConfig", "(Lcom/bytedance/sdk/bridge/BridgeConfig;)V", "bridgeService", "Lcom/bytedance/sdk/bridge/api/BridgeService;", "config", "", "registerBridgeWithLifeCycle", "bridgeModule", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "registerEvent", "event", "privilege", "registerGlobalBridge", "bridge_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.sdk.bridge.e */
public final class BridgeManager {

    /* renamed from: a */
    public static final BridgeManager f50421a = new BridgeManager();

    /* renamed from: b */
    private static final String f50422b = f50422b;

    /* renamed from: c */
    private static final boolean f50423c = f50423c;

    /* renamed from: d */
    private static BridgeService f50424d;

    /* renamed from: e */
    private static C20661b f50425e;

    private BridgeManager() {
    }

    /* renamed from: a */
    public final C20661b mo69560a() {
        return f50425e;
    }

    static {
        C20661b bVar;
        BridgeService bridgeService = (BridgeService) C20216d.m73783a(BridgeService.class);
        f50424d = bridgeService;
        if (bridgeService == null || (bVar = bridgeService.initBridgeConfig()) == null) {
            bVar = new C20661b.C20663a().mo69551a((Boolean) false).mo69552a(f50422b).mo69554b(Boolean.valueOf((boolean) f50423c)).mo69555c(false).mo69556d(false).mo69553a();
            Intrinsics.checkExpressionValueIsNotNull(bVar, "BridgeConfig.Builder()\n …                 .build()");
        }
        f50425e = bVar;
    }

    @Deprecated(message = "Please init by 'implements BridgeService'.")
    /* renamed from: a */
    public final void mo69561a(C20661b bVar) {
        C20661b bVar2;
        Intrinsics.checkParameterIsNotNull(bVar, "bridgeConfig");
        BridgeService bridgeService = f50424d;
        if (bridgeService != null) {
            if (bridgeService != null) {
                bVar2 = bridgeService.initBridgeConfig();
            } else {
                bVar2 = null;
            }
            if (bVar2 != null) {
                return;
            }
        }
        f50425e = bVar;
    }
}
