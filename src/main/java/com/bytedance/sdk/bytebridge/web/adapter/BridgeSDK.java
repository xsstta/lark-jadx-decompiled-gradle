package com.bytedance.sdk.bytebridge.web.adapter;

import com.bytedance.sdk.bytebridge.base.BridgeAgent;
import com.bytedance.sdk.bytebridge.base.context.AbsBridgeContext;
import com.bytedance.sdk.bytebridge.base.result.BridgeSyncResult;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\t"}, d2 = {"Lcom/bytedance/sdk/bytebridge/web/adapter/BridgeSDK;", "", "()V", "onJsBridgeRequestSync", "Lcom/bytedance/sdk/bytebridge/base/result/BridgeSyncResult;", "context", "Lcom/bytedance/sdk/bytebridge/base/context/AbsBridgeContext;", "onJsbridgeRequest", "", "web_release"}, mo238835k = 1, mv = {1, 1, 15})
/* renamed from: com.bytedance.sdk.bytebridge.web.a.a */
public final class BridgeSDK {

    /* renamed from: a */
    public static final BridgeSDK f50630a = new BridgeSDK();

    private BridgeSDK() {
    }

    /* renamed from: a */
    public final void mo69860a(AbsBridgeContext aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "context");
        BridgeAgent.f50555a.mo69774a(aVar);
    }

    /* renamed from: b */
    public final BridgeSyncResult mo69861b(AbsBridgeContext aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "context");
        return BridgeAgent.f50555a.mo69774a(aVar);
    }
}
