package com.tt.miniapp;

import com.bytedance.ee.lark.infra.foundation.log.AppBrandLogger;
import com.tt.miniapphost.host.HostDependManager;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/tt/miniapp/BridgeUniteHelper;", "", "()V", "BRIDGE_FUNCTION_NATIVE_CALL_BACK", "", "BRIDGE_INVOKE_SYNC_RESULT_KEY", "BRIDGE_WEB_VIEW_JS_BRIDGE", "NEW_BRIDGE_NAME", "OLD_BRIDGE_NAME", "TAG", "canUseNewBridge", "", "getBridgeName", "miniapp_release"}, mo238835k = 1, mv = {1, 1, 16})
/* renamed from: com.tt.miniapp.f */
public final class BridgeUniteHelper {

    /* renamed from: a */
    public static final BridgeUniteHelper f166701a = new BridgeUniteHelper();

    private BridgeUniteHelper() {
    }

    /* renamed from: a */
    public final boolean mo231125a() {
        if (!HostDependManager.getInst().getFeatureGating("gadget.use.larkwebview.bridge.android", false)) {
            return false;
        }
        AppBrandLogger.m52830i("BridgeUniteHelper", "use new bridge");
        return true;
    }

    /* renamed from: b */
    public final String mo231126b() {
        BridgeUniteHelper fVar;
        if (f166701a.mo231125a()) {
            fVar = this;
        } else {
            fVar = null;
        }
        if (fVar != null) {
            return "Lark_Bridge";
        }
        return "ttJSCore";
    }
}
