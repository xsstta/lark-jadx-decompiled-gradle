package com.bytedance.sdk.bridge.js;

import com.bytedance.sdk.bridge.model.BridgeResult;
import com.bytedance.sdk.bytebridge.base.result.BridgeSyncResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"convertSyncResult", "Lcom/bytedance/sdk/bridge/model/BridgeResult;", "Lcom/bytedance/sdk/bridge/model/BridgeResult$Companion;", "syncResult", "Lcom/bytedance/sdk/bytebridge/base/result/BridgeSyncResult;", "js-bridge_release"}, mo238835k = 2, mv = {1, 1, 15})
/* renamed from: com.bytedance.sdk.bridge.js.e */
public final class C20673e {
    /* renamed from: a */
    public static final BridgeResult m75260a(BridgeResult.Companion aVar, BridgeSyncResult fVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "$this$convertSyncResult");
        Intrinsics.checkParameterIsNotNull(fVar, "syncResult");
        BridgeResult bridgeResult = new BridgeResult();
        bridgeResult.mo69754a(fVar.mo69853b());
        bridgeResult.mo69756a(fVar.mo69856e());
        bridgeResult.mo69755a(fVar.mo69855d());
        return bridgeResult;
    }
}
